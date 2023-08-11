package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Set;

public interface IHasFieldsOfferParam<T> extends IHasArrayParam<T> {
    @NonNull
    T setFieldsOfferParam(@NonNull String str) {
        return setArrayParam(APIParams.FIELDS_OFFER, str);
    }

    @NonNull
    T setWildcardOfferParam() {
        return setArrayParam(APIParams.FIELDS_OFFER, ProxyConfig.MATCH_ALL_SCHEMES);
    }

    @NonNull
    T setFieldsOfferParam(@NonNull String... strArr) {
        return setArrayParam(APIParams.FIELDS_OFFER, strArr);
    }

    @NonNull
    T setFieldsOfferParam(@NonNull Set<String> set) {
        return setArrayParam(APIParams.FIELDS_OFFER, set);
    }
}
