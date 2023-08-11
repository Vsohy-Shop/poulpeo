package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Set;

public interface IHasFieldsCashbackParam<T> extends IHasArrayParam<T> {
    @NonNull
    T setFieldsCashbackParam(@NonNull String str) {
        return setArrayParam(APIParams.FIELDS_CASHBACK, str);
    }

    @NonNull
    T setWildcardCashbackParam() {
        return setArrayParam(APIParams.FIELDS_CASHBACK, ProxyConfig.MATCH_ALL_SCHEMES);
    }

    @NonNull
    T setFieldsCashbackParam(@NonNull String... strArr) {
        return setArrayParam(APIParams.FIELDS_CASHBACK, strArr);
    }

    @NonNull
    T setFieldsCashbackParam(@NonNull Set<String> set) {
        return setArrayParam(APIParams.FIELDS_CASHBACK, set);
    }
}
