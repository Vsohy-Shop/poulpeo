package com.rmn.apiclient.core.data_access.cache.memory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.ParamSet;
import java.util.Collection;
import java.util.Set;

public class MemoryTableMethod extends BaseMemoryTable<ParamSet, IDocument> {
    public MemoryTableMethod() {
        super(100);
    }

    public /* bridge */ /* synthetic */ void addOrReplaceElement(@NonNull Object obj, @NonNull Object obj2) {
        super.addOrReplaceElement(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void clearElements() {
        super.clearElements();
    }

    @Nullable
    public /* bridge */ /* synthetic */ Object getElement(@NonNull Object obj) {
        return super.getElement(obj);
    }

    @NonNull
    public /* bridge */ /* synthetic */ Set getElements(@NonNull Collection collection) {
        return super.getElements(collection);
    }

    @Nullable
    public /* bridge */ /* synthetic */ Object removeElement(@NonNull Object obj) {
        return super.removeElement(obj);
    }
}
