package com.rmn.api.p322v2.main.oauth;

import com.rmn.api.p322v2.main.result.ResponseResult;

/* renamed from: com.rmn.api.v2.main.oauth.IOAuthAccountListener */
public interface IOAuthAccountListener {
    void onAccessTokenFail(ResponseResult responseResult);

    void onAccessTokenSuccess();

    void onRequestTokenFail(ResponseResult responseResult);

    void onRequestTokenSuccess(String str);
}
