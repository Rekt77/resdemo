package com.loopj.android.http;

/*
    Android Asynchronous Http Client
    Copyright (c) 2011 James Smith <james@loopj.com>
    https://loopj.com
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
        https://www.apache.org/licenses/LICENSE-2.0
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/


import java.net.URI;

import cz.msebera.android.httpclient.client.methods.HttpEntityEnclosingRequestBase;

public final class HttpDelete
        extends HttpEntityEnclosingRequestBase
{
    public static final String METHOD_NAME = "DELETE";

    public HttpDelete() {}

    public HttpDelete(URI uri)
    {
        setURI(uri);
    }

    public HttpDelete(String uri)
    {
        setURI(URI.create(uri));
    }

    public String getMethod()
    {
        return "DELETE";
    }
}
