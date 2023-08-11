package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Set;

public interface IHasFieldsMerchantParam<T> extends IHasArrayParam<T> {
    @NonNull
    T setFieldsMerchantParam(@NonNull String str) {
        return setArrayParam(APIParams.FIELDS_MERCHANT, str);
    }

    @NonNull
    T setWildcardMerchantParam() {
        return setArrayParam(APIParams.FIELDS_MERCHANT, ProxyConfig.MATCH_ALL_SCHEMES);
    }

    @NonNull
    T setFieldsMerchantParam(@NonNull String... strArr) {
        return setArrayParam(APIParams.FIELDS_MERCHANT, strArr);
    }

    @NonNull
    T setFieldsMerchantParam(@NonNull Set<String> set) {
        return setArrayParam(APIParams.FIELDS_MERCHANT, set);
    }
}
