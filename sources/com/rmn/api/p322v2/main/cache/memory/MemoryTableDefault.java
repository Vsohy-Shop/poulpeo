package com.rmn.api.p322v2.main.cache.memory;

import androidx.annotation.NonNull;

/* renamed from: com.rmn.api.v2.main.cache.memory.MemoryTableDefault */
public class MemoryTableDefault<From, To> extends BaseMemoryTableOld<From, To, To> {
    /* access modifiers changed from: protected */
    @NonNull
    public To convertDataSavedTo(@NonNull To to) {
        return to;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public To convertDataTo(@NonNull To to) {
        return to;
    }
}
