package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.impl.api.call.APIParams;

public interface IHasLimitParam<T> extends IApiMethod {
    @NonNull
    T setLimitParam(int i) {
        getProxyInputBuilder().addParam(APIParams.LIMIT, Integer.valueOf(i));
        return this;
    }

    @NonNull
    T setOffsetParam(int i) {
        getProxyInputBuilder().addParam("offset", Integer.valueOf(i));
        return this;
    }
}
