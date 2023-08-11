package com.rmn.apiclient.core.data.structure;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.core.model.ModelReference;

public interface IResource<M extends IModel> {
    @NonNull
    IResource<M> copy(@NonNull ModelReference<M> modelReference);

    @NonNull
    M getModel() {
        return getModelReference().getModel();
    }

    @NonNull
    ModelReference<M> getModelReference();

    @NonNull
    RelationshipSet getRelationships();

    @NonNull
    IResourceDescriptor<M> getResourceDescriptor();

    @NonNull
    IResourceId getResourceId();
}
