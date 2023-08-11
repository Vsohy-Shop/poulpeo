package com.rmn.api.p322v2.poulpeo.general;

import com.rmn.api.p322v2.main.general.IApiType;
import com.rmn.api.p322v2.main.parser.IResponseParser;
import com.rmn.api.p322v2.poulpeo.parsing.ResponseParserPLP;

/* renamed from: com.rmn.api.v2.poulpeo.general.PLPApiType */
public class PLPApiType implements IApiType {
    public static final PLPApiType PLP = new PLPApiType();
    private String CLIENT_ID;
    private String CLIENT_SECRET;
    private boolean initialized;

    public String getApiUrl() {
        return PLPUtil.URL_PLP_API;
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
        return PLPUtil.URL_PLP;
    }

    public IResponseParser getResultParser() {
        return new ResponseParserPLP();
    }

    public String getTag() {
        return "plp";
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
