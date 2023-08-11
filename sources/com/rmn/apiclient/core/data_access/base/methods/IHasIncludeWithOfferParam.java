package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Set;

public interface IHasIncludeWithOfferParam<T> extends IHasArrayParam<T> {
    @NonNull
    T setIncludeWithOfferParam(@NonNull String str) {
        return setArrayParam(APIParams.INCLUDE_WITH_OFFER, str);
    }

    @NonNull
    T setIncludeWithOfferParam(@NonNull String... strArr) {
        return setArrayParam(APIParams.INCLUDE_WITH_OFFER, strArr);
    }

    @NonNull
    T setIncludeWithOfferParam(@NonNull Set<String> set) {
        return setArrayParam(APIParams.INCLUDE_WITH_OFFER, set);
    }
}
