package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Set;

public interface IHasSortParam<T> extends IHasArrayParam<T> {
    @NonNull
    T setSortParam(@NonNull String str) {
        return setArrayParam(APIParams.SORT, str);
    }

    @NonNull
    T setSortParam(@NonNull String... strArr) {
        return setArrayParam(APIParams.SORT, strArr);
    }

    @NonNull
    T setSortParam(@NonNull Set<String> set) {
        return setArrayParam(APIParams.SORT, set);
    }
}
