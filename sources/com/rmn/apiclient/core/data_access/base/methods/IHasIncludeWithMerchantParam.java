package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Set;

public interface IHasIncludeWithMerchantParam<T> extends IHasArrayParam<T> {
    @NonNull
    T setIncludeWithMerchantParam(@NonNull String str) {
        return setArrayParam(APIParams.INCLUDE_WITH_MERCHANT, str);
    }

    @NonNull
    T setIncludeWithMerchantParam(@NonNull String... strArr) {
        return setArrayParam(APIParams.INCLUDE_WITH_MERCHANT, strArr);
    }

    @NonNull
    T setIncludeWithMerchantParam(@NonNull Set<String> set) {
        return setArrayParam(APIParams.INCLUDE_WITH_MERCHANT, set);
    }
}
