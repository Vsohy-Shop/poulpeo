package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Set;

public interface IHasFieldsWithAffiliateNetworkParam<T> extends IHasArrayParam<T> {
    @NonNull
    T setFieldsAffiliateNetworkParam(@NonNull String str) {
        return setArrayParam(APIParams.FIELDS_AFFILIATE_NETWORK, str);
    }

    @NonNull
    T setWildcardAffiliateNetworkParam() {
        return setArrayParam(APIParams.FIELDS_AFFILIATE_NETWORK, ProxyConfig.MATCH_ALL_SCHEMES);
    }

    @NonNull
    T setFieldsAffiliateNetworkParam(@NonNull String... strArr) {
        return setArrayParam(APIParams.FIELDS_AFFILIATE_NETWORK, strArr);
    }

    @NonNull
    T setFieldsAffiliateNetworkParam(@NonNull Set<String> set) {
        return setArrayParam(APIParams.FIELDS_AFFILIATE_NETWORK, set);
    }
}
