/*
 * Explore API
 * The Opendatasoft [Explore API v2](https://help.opendatasoft.com/apis/ods-explore-v2/) is organized around REST. It provides access to all the data available through the platform in a coherent, hierarchical way.  - Only the HTTP `GET` method is supported. - All API endpoints return JSON. - Endpoints are organized in a hierarchical way describing the relative relationship between objects. - All responses contain a list of links allowing easy and relevant navigation through the API endpoints. - All endpoints use the [Opendatasoft Query Language (ODSQL)](https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)). This means that, most of the time, parameters work the same way for all endpoints.
 *
 * The version of the OpenAPI document: V2
 * Contact: support@opendatasoft.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import okhttp3.MediaType;
import okhttp3.RequestBody;

import java.io.IOException;

import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

public class ProgressRequestBody extends RequestBody {

    private final RequestBody requestBody;

    private final ApiCallback callback;

    public ProgressRequestBody(RequestBody requestBody, ApiCallback callback) {
        this.requestBody = requestBody;
        this.callback = callback;
    }

    @Override
    public MediaType contentType() {
        return requestBody.contentType();
    }

    @Override
    public long contentLength() throws IOException {
        return requestBody.contentLength();
    }

    @Override
    public void writeTo(BufferedSink sink) throws IOException {
        BufferedSink bufferedSink = Okio.buffer(sink(sink));
        requestBody.writeTo(bufferedSink);
        bufferedSink.flush();
    }

    private Sink sink(Sink sink) {
        return new ForwardingSink(sink) {

            long bytesWritten = 0L;
            long contentLength = 0L;

            @Override
            public void write(Buffer source, long byteCount) throws IOException {
                super.write(source, byteCount);
                if (contentLength == 0) {
                    contentLength = contentLength();
                }

                bytesWritten += byteCount;
                callback.onUploadProgress(bytesWritten, contentLength, bytesWritten == contentLength);
            }
        };
    }
}