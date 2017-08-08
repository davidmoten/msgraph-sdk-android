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
 * The interface for the Base Thumbnail Set Request.
 */
public interface IBaseThumbnailSetRequest extends IHttpRequest {

    /**
     * Gets the ThumbnailSet from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ThumbnailSet> callback);

    /**
     * Gets the ThumbnailSet from the service
     * @return The ThumbnailSet from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ThumbnailSet get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ThumbnailSet with a source
     * @param sourceThumbnailSet The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ThumbnailSet sourceThumbnailSet, final ICallback<ThumbnailSet> callback);

    /**
     * Patches this ThumbnailSet with a source
     * @param sourceThumbnailSet The source object with updates
     * @return The updated ThumbnailSet
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ThumbnailSet patch(final ThumbnailSet sourceThumbnailSet) throws ClientException;

    /**
     * Posts a ThumbnailSet with a new object
     * @param newThumbnailSet The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ThumbnailSet newThumbnailSet, final ICallback<ThumbnailSet> callback);

    /**
     * Posts a ThumbnailSet with a new object
     * @param newThumbnailSet The new object to create
     * @return The created ThumbnailSet
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ThumbnailSet post(final ThumbnailSet newThumbnailSet) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseThumbnailSetRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseThumbnailSetRequest expand(final String value);

}