package com.rmn.api.p322v2.main.general;

import com.rmn.api.p322v2.main.parser.IResponseParser;

/* renamed from: com.rmn.api.v2.main.general.IApiType */
public interface IApiType {
    String getApiUrl();

    String getClientId();

    String getClientSecret();

    String getGlobalUrl();

    IResponseParser getResultParser();

    String getTag();

    boolean hasClientSecret();

    void setClientKeys(String str, String str2);
}
