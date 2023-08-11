package com.rmn.apiclient.core.data_access.cache.memory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.core.model.ModelReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

class MemoryTableModel<M extends IModel> extends BaseMemoryTable<String, ModelReference<M>> {
    public MemoryTableModel() {
        super(1000);
    }

    @NonNull
    /* renamed from: a */
    public ModelReference<M> mo47596a(@NonNull M m, @Nullable Set<String> set) {
        String newCacheId = ModelReference.newCacheId(m.getId(), set);
        ModelReference<M> modelReference = (ModelReference) getElement(newCacheId);
        if (modelReference != null) {
            modelReference.updateModel(m, set);
            return modelReference;
        }
        ModelReference<M> modelReference2 = new ModelReference<>(m, set);
        super.addOrReplaceElement(newCacheId, modelReference2);
        return modelReference2;
    }

    @Nullable
    /* renamed from: b */
    public ModelReference<M> mo47597b(@NonNull String str, @Nullable Set<String> set) {
        return (ModelReference) super.getElement(ModelReference.newCacheId(str, set));
    }

    @NonNull
    /* renamed from: c */
    public Set<ModelReference<M>> mo47598c(@NonNull Collection<String> collection, @Nullable Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (String newCacheId : collection) {
            arrayList.add(ModelReference.newCacheId(newCacheId, set));
        }
        return super.getElements(arrayList);
    }
}
