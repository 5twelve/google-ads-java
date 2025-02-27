/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v19.services.stub;

import com.google.ads.googleads.v19.services.EnablePMaxBrandGuidelinesRequest;
import com.google.ads.googleads.v19.services.EnablePMaxBrandGuidelinesResponse;
import com.google.ads.googleads.v19.services.MutateCampaignsRequest;
import com.google.ads.googleads.v19.services.MutateCampaignsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CampaignService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class CampaignServiceStub implements BackgroundResource {

  public UnaryCallable<MutateCampaignsRequest, MutateCampaignsResponse> mutateCampaignsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateCampaignsCallable()");
  }

  public UnaryCallable<EnablePMaxBrandGuidelinesRequest, EnablePMaxBrandGuidelinesResponse>
      enablePMaxBrandGuidelinesCallable() {
    throw new UnsupportedOperationException("Not implemented: enablePMaxBrandGuidelinesCallable()");
  }

  @Override
  public abstract void close();
}
