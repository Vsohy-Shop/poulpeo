package com.rmn.api.p322v2.main.oauth;

import com.rmn.api.p322v2.main.result.ResponseResult;

/* renamed from: com.rmn.api.v2.main.oauth.LoginRequest */
public class LoginRequest {
    private TokensBundle accessToken;
    private ResponseResult errorResponseResult;
    private OAuthAPIObject oAuthAPIObject;
    private String pinCode;
    private TokensBundle requestToken;

    public TokensBundle getAccessToken() {
        return this.accessToken;
    }

    public ResponseResult getErrorResponseResult() {
        return this.errorResponseResult;
    }

    public OAuthAPIObject getOAuthAPIObject() {
        OAuthAPIObject oAuthAPIObject2 = this.oAuthAPIObject;
        if (oAuthAPIObject2 != null) {
            return oAuthAPIObject2;
        }
        throw new IllegalStateException("No object api found");
    }

    public String getPinCode() {
        return this.pinCode;
    }

    public TokensBundle getRequestToken() {
        return this.requestToken;
    }

    public void setAccessToken(TokensBundle tokensBundle) {
        if (tokensBundle != null) {
            this.requestToken = null;
            this.pinCode = null;
        }
        this.accessToken = tokensBundle;
    }

    public void setErrorResponseResult(ResponseResult responseResult) {
        this.errorResponseResult = responseResult;
    }

    public void setOAuthAPIObject(OAuthAPIObject oAuthAPIObject2) {
        if (oAuthAPIObject2 != null) {
            this.oAuthAPIObject = oAuthAPIObject2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setPinCode(String str) {
        if (str != null && !str.equals("")) {
            this.accessToken = null;
        }
        this.pinCode = str;
    }

    public void setRequestToken(TokensBundle tokensBundle) {
        this.pinCode = null;
        this.accessToken = null;
        this.requestToken = tokensBundle;
    }
}
