package com.rmn.apiclient.core.data_access.cache.memory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.core.model.ModelReference;
import java.util.Collection;
import java.util.Set;

public class MemoryCacheModels<M extends IModel> extends C11589a<IResourceDescriptor<M>, MemoryTableModel<M>, String, ModelReference<M>> {
    public /* bridge */ /* synthetic */ void addOrReplaceElement(@NonNull Object obj, @NonNull Object obj2, @NonNull Object obj3) {
        super.addOrReplaceElement(obj, obj2, obj3);
    }

    @NonNull
    public ModelReference<M> addOrReplaceModel(@NonNull IResourceDescriptor<M> iResourceDescriptor, @NonNull M m, @Nullable Set<String> set) {
        if (iResourceDescriptor.getModelClass().equals(m.getClass())) {
            return ((MemoryTableModel) getOrCreateTable(iResourceDescriptor)).mo47596a(m, set);
        }
        throw new IllegalArgumentException("Classes are not coherent when adding model to memory cache");
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
    public ModelReference<M> getModel(@NonNull IResourceDescriptor<M> iResourceDescriptor, @NonNull String str, @Nullable Set<String> set) {
        MemoryTableModel memoryTableModel = (MemoryTableModel) getTable(iResourceDescriptor);
        if (memoryTableModel == null) {
            return null;
        }
        return memoryTableModel.mo47597b(str, set);
    }

    @Nullable
    public Set<ModelReference<M>> getModels(@NonNull IResourceDescriptor<M> iResourceDescriptor, @NonNull Collection<String> collection, @Nullable Set<String> set) {
        MemoryTableModel memoryTableModel = (MemoryTableModel) getTable(iResourceDescriptor);
        if (memoryTableModel == null) {
            return null;
        }
        return memoryTableModel.mo47598c(collection, set);
    }

    @Nullable
    public /* bridge */ /* synthetic */ BaseMemoryTable getTable(@NonNull Object obj) {
        return super.getTable(obj);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public MemoryTableModel<M> newTable() {
        return new MemoryTableModel<>();
    }
}
