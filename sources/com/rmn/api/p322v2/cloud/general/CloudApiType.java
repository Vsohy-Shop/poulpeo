package com.rmn.api.p322v2.cloud.general;

import com.rmn.api.p322v2.cloud.parsing.ResponseParserCloud;
import com.rmn.api.p322v2.main.general.IApiType;
import com.rmn.api.p322v2.main.parser.IResponseParser;

/* renamed from: com.rmn.api.v2.cloud.general.CloudApiType */
public class CloudApiType implements IApiType {
    public static final CloudApiType CLOUD = new CloudApiType();
    private String CLIENT_ID;
    private String CLIENT_SECRET;
    private boolean initialized;

    public String getApiUrl() {
        return CloudUtil.URL_CLOUD_API;
    }

    public String getClientId() {
        String str = this.CLIENT_ID;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("You must declare the client ID of the Cloud OAuth protocol");
    }

    public String getClientSecret() {
        String str = this.CLIENT_SECRET;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("You must declare the client secret key of the Cloud OAuth protocol");
    }

    public String getGlobalUrl() {
        return CloudUtil.URL_CLOUD;
    }

    public IResponseParser getResultParser() {
        return new ResponseParserCloud();
    }

    public String getTag() {
        return "cloud";
    }

    public boolean hasClientSecret() {
        if (this.CLIENT_SECRET != null) {
            return true;
        }
        return false;
    }

    public void setClientKeys(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if (str2 == null) {
            throw new IllegalArgumentException();
        } else if (!this.initialized) {
            this.CLIENT_ID = str;
            this.CLIENT_SECRET = str2;
            this.initialized = true;
        } else {
            throw new IllegalStateException("Client ID and secret were already declared once");
        }
    }
}
