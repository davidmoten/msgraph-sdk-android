// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Profile Photo Stream Request Builder.
 */
public class BaseProfilePhotoStreamRequestBuilder extends BaseRequestBuilder implements IBaseProfilePhotoStreamRequestBuilder {

    /**
     * The request builder for the ProfilePhoto
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseProfilePhotoStreamRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IProfilePhotoStreamRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IProfilePhotoStreamRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new ProfilePhotoStreamRequest(getRequestUrl(), getClient(), requestOptions);
    }


}
