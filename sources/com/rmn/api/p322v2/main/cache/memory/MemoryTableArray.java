package com.rmn.api.p322v2.main.cache.memory;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;

/* renamed from: com.rmn.api.v2.main.cache.memory.MemoryTableArray */
public class MemoryTableArray<From, To> extends BaseMemoryTableOld<From, To, To> {
    @NonNull
    private Object getDefensiveArrayCopy(@NonNull Object obj) {
        if (!obj.getClass().isArray()) {
            return obj;
        }
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length);
        System.arraycopy(obj, 0, newInstance, 0, length);
        return newInstance;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public To convertDataSavedTo(@NonNull To to) {
        return getDefensiveArrayCopy(to);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public To convertDataTo(@NonNull To to) {
        return getDefensiveArrayCopy(to);
    }
}
