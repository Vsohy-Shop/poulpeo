package com.rmn.api.p322v2.main.cache.memory;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.model.ModelRef;

/* renamed from: com.rmn.api.v2.main.cache.memory.MemoryTableModelReference */
public class MemoryTableModelReference<From, To extends AbstractModel> extends BaseMemoryTableOld<From, To, ModelRef<To>> {
    /* access modifiers changed from: protected */
    @NonNull
    public To convertDataSavedTo(@NonNull ModelRef<To> modelRef) {
        return modelRef.get();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public ModelRef<To> convertDataTo(@NonNull To to) {
        return ModelRef.getModelReferenceOrNew(to);
    }

    /* access modifiers changed from: protected */
    public void update(@NonNull From from, @NonNull To to) {
        ((ModelRef) this.table.get(from)).updateModel(to);
    }
}
