package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Set;

public interface IHasFieldsMerchantInfoParam<T> extends IHasArrayParam<T> {
    @NonNull
    T setFieldsMerchantInfoParam(@NonNull String str) {
        return setArrayParam(APIParams.FIELDS_MERCHANT_INFO, str);
    }

    @NonNull
    T setWildcardMerchantInfoParam() {
        return setArrayParam(APIParams.FIELDS_MERCHANT_INFO, ProxyConfig.MATCH_ALL_SCHEMES);
    }

    @NonNull
    T setFieldsMerchantInfoParam(@NonNull String... strArr) {
        return setArrayParam(APIParams.FIELDS_MERCHANT_INFO, strArr);
    }

    @NonNull
    T setFieldsMerchantInfoParam(@NonNull Set<String> set) {
        return setArrayParam(APIParams.FIELDS_MERCHANT_INFO, set);
    }
}
