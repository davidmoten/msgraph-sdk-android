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
 * The interface for the Base Workbook Range Sort Request.
 */
public interface IBaseWorkbookRangeSortRequest extends IHttpRequest {

    /**
     * Gets the WorkbookRangeSort from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookRangeSort> callback);

    /**
     * Gets the WorkbookRangeSort from the service
     * @return The WorkbookRangeSort from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookRangeSort get() throws ClientException;

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
     * Patches this WorkbookRangeSort with a source
     * @param sourceWorkbookRangeSort The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookRangeSort sourceWorkbookRangeSort, final ICallback<WorkbookRangeSort> callback);

    /**
     * Patches this WorkbookRangeSort with a source
     * @param sourceWorkbookRangeSort The source object with updates
     * @return The updated WorkbookRangeSort
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookRangeSort patch(final WorkbookRangeSort sourceWorkbookRangeSort) throws ClientException;

    /**
     * Posts a WorkbookRangeSort with a new object
     * @param newWorkbookRangeSort The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookRangeSort newWorkbookRangeSort, final ICallback<WorkbookRangeSort> callback);

    /**
     * Posts a WorkbookRangeSort with a new object
     * @param newWorkbookRangeSort The new object to create
     * @return The created WorkbookRangeSort
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookRangeSort post(final WorkbookRangeSort newWorkbookRangeSort) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookRangeSortRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookRangeSortRequest expand(final String value);

}
