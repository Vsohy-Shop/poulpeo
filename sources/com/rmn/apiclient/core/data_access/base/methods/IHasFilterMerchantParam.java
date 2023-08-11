package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.impl.api.call.APIParams;

public interface IHasFilterMerchantParam<T> extends IApiMethod {
    @NonNull
    T setFilterExtensionFlagStatus(boolean z) {
        getProxyInputBuilder().addParam(APIParams.FILTER_EXTENSION_FLAG_STATUS, Boolean.valueOf(z));
        return this;
    }

    @NonNull
    T setFilterHasCashbackParam(boolean z) {
        getProxyInputBuilder().addParam(APIParams.FILTER_HAS_CASHBACK, Boolean.valueOf(z));
        return this;
    }
}
