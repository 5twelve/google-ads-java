// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.ads.googleads.examples.basicoperations;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getShortPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v20.common.AdTextAsset;
import com.google.ads.googleads.v20.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType;
import com.google.ads.googleads.v20.errors.GoogleAdsError;
import com.google.ads.googleads.v20.errors.GoogleAdsException;
import com.google.ads.googleads.v20.resources.Ad;
import com.google.ads.googleads.v20.services.AdOperation;
import com.google.ads.googleads.v20.services.AdServiceClient;
import com.google.ads.googleads.v20.services.MutateAdResult;
import com.google.ads.googleads.v20.services.MutateAdsResponse;
import com.google.ads.googleads.v20.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Updates a responsive search ad. To get responsive search ads, run GetResponsiveSearchAds. */
public class UpdateResponsiveSearchAd {

  private static class UpdateResponsiveSearchAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_ID, required = true)
    private Long adId;
  }

  public static void main(String[] args) {
    UpdateResponsiveSearchAdParams params = new UpdateResponsiveSearchAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adId = Long.parseLong("INSERT_AD_ID_HERE");
    }

    GoogleAdsClient googleAdsClient = null;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      System.exit(1);
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      System.exit(1);
    }

    try {
      new UpdateResponsiveSearchAd().runExample(googleAdsClient, params.customerId, params.adId);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
      System.exit(1);
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the client to use for connecting to the API.
   * @param customerId the customer ID to update.
   * @param adId the ad ID to update.
   */
  // [START update_responsive_search_ad]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long adId) {
    // Creates an AdOperation to update an ad.
    AdOperation.Builder adOperation = AdOperation.newBuilder();

    // Creates an Ad in the update field of the operation.
    Ad.Builder adBuilder =
        adOperation
            .getUpdateBuilder()
            .setResourceName(ResourceNames.ad(customerId, adId))
            .addFinalUrls("http://www.example.com/")
            .addFinalMobileUrls("http://www.example.com/mobile");

    // Sets the responsive search ad properties to update on the ad.
    adBuilder
        .getResponsiveSearchAdBuilder()
        .addAllHeadlines(
            ImmutableList.of(
                AdTextAsset.newBuilder()
                    .setText("Cruise to Pluto #" + getShortPrintableDateTime())
                    .setPinnedField(ServedAssetFieldType.HEADLINE_1)
                    .build(),
                AdTextAsset.newBuilder().setText("Tickets on sale now").build(),
                AdTextAsset.newBuilder().setText("Buy your ticket now").build()))
        .addAllDescriptions(
            ImmutableList.of(
                AdTextAsset.newBuilder().setText("Best space cruise ever.").build(),
                AdTextAsset.newBuilder()
                    .setText("The most wonderful space experience you will ever have.")
                    .build()));

    // Sets the update mask (the fields which will be modified) to be all the fields we set above.
    adOperation.setUpdateMask(FieldMasks.allSetFieldsOf(adBuilder.build()));

    // Creates a service client to connect to the API.
    try (AdServiceClient adServiceClient =
        googleAdsClient.getLatestVersion().createAdServiceClient()) {
      // Issues the mutate request.
      MutateAdsResponse response =
          adServiceClient.mutateAds(
              String.valueOf(customerId), ImmutableList.of(adOperation.build()));

      // Displays the result.
      for (MutateAdResult result : response.getResultsList()) {
        System.out.printf("Ad with resource name '%s' was updated.%n", result.getResourceName());
      }
    }
  }
  // [END update_responsive_search_ad]
}
