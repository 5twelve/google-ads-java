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

package com.google.ads.googleads.v18.services;

import com.google.ads.googleads.v18.services.KeywordPlanIdeaServiceGrpc.KeywordPlanIdeaServiceImplBase;
import com.google.api.core.BetaApi;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockKeywordPlanIdeaServiceImpl extends KeywordPlanIdeaServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockKeywordPlanIdeaServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void generateKeywordIdeas(
      GenerateKeywordIdeasRequest request,
      StreamObserver<GenerateKeywordIdeaResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof GenerateKeywordIdeaResponse) {
      requests.add(request);
      responseObserver.onNext(((GenerateKeywordIdeaResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GenerateKeywordIdeas, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  GenerateKeywordIdeaResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void generateKeywordHistoricalMetrics(
      GenerateKeywordHistoricalMetricsRequest request,
      StreamObserver<GenerateKeywordHistoricalMetricsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof GenerateKeywordHistoricalMetricsResponse) {
      requests.add(request);
      responseObserver.onNext(((GenerateKeywordHistoricalMetricsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GenerateKeywordHistoricalMetrics, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  GenerateKeywordHistoricalMetricsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void generateAdGroupThemes(
      GenerateAdGroupThemesRequest request,
      StreamObserver<GenerateAdGroupThemesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof GenerateAdGroupThemesResponse) {
      requests.add(request);
      responseObserver.onNext(((GenerateAdGroupThemesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GenerateAdGroupThemes, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  GenerateAdGroupThemesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void generateKeywordForecastMetrics(
      GenerateKeywordForecastMetricsRequest request,
      StreamObserver<GenerateKeywordForecastMetricsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof GenerateKeywordForecastMetricsResponse) {
      requests.add(request);
      responseObserver.onNext(((GenerateKeywordForecastMetricsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GenerateKeywordForecastMetrics, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  GenerateKeywordForecastMetricsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
