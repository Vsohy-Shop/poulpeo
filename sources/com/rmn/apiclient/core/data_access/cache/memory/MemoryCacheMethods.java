package com.rmn.apiclient.core.data_access.cache.memory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.ParamSet;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheMethodDescriptor;
import java.util.Collection;
import java.util.Set;

public class MemoryCacheMethods extends C11589a<CacheMethodDescriptor, MemoryTableMethod, ParamSet, IDocument> {
    public /* bridge */ /* synthetic */ void addOrReplaceElement(@NonNull Object obj, @NonNull Object obj2, @NonNull Object obj3) {
        super.addOrReplaceElement(obj, obj2, obj3);
    }

    public /* bridge */ /* synthetic */ void clearElements() {
        super.clearElements();
    }

    public /* bridge */ /* synthetic */ void clearTable(@NonNull Object obj) {
        super.clearTable(obj);
    }

    @Nullable
    public /* bridge */ /* synthetic */ Object getElement(@NonNull Object obj, @NonNull Object obj2) {
        return super.getElement(obj, obj2);
    }

    @Nullable
    public /* bridge */ /* synthetic */ Set getElements(@NonNull Object obj, @NonNull Collection collection) {
        return super.getElements(obj, collection);
    }

    @Nullable
    public /* bridge */ /* synthetic */ BaseMemoryTable getTable(@NonNull Object obj) {
        return super.getTable(obj);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public MemoryTableMethod newTable() {
        return new MemoryTableMethod();
    }
}
