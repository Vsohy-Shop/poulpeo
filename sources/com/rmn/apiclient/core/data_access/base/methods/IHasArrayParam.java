package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public interface IHasArrayParam<T> extends IApiMethod {

    /* renamed from: com.rmn.apiclient.core.data_access.base.methods.IHasArrayParam$a */
    class C11588a extends HashSet<String> {

        /* renamed from: b */
        final /* synthetic */ String f18032b;

        C11588a(String str) {
            this.f18032b = str;
            add(str);
        }
    }

    @NonNull
    T setArrayParam(@NonNull String str, @NonNull String str2) {
        return setArrayParam(str, (Set<String>) new C11588a(str2));
    }

    @NonNull
    T setArrayParam(@NonNull String str, @NonNull String... strArr) {
        return setArrayParam(str, (Set<String>) new HashSet(Arrays.asList(strArr)));
    }

    @NonNull
    T setArrayParam(@NonNull String str, @NonNull Set<String> set) {
        getProxyInputBuilder().addParam(str, set);
        return this;
    }
}
