package com.rmn.apiclient.impl.jsonapi.structure;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.data.structure.IResource;
import com.rmn.apiclient.core.data.structure.IResourceId;
import com.rmn.apiclient.core.data.structure.RelationshipSet;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.core.model.ModelReference;

public class JSONAPIResource<M extends IModel> implements IResource<M> {
    @NonNull
    private final ModelReference<M> modelReference;
    @NonNull
    private final RelationshipSet relationships;
    @NonNull
    private final IResourceDescriptor<M> resourceDescriptor;
    @NonNull
    private final IResourceId resourceId;

    public JSONAPIResource(@NonNull IResourceDescriptor<M> iResourceDescriptor, @NonNull IResourceId iResourceId, @NonNull ModelReference<M> modelReference2, @NonNull RelationshipSet relationshipSet) {
        this.resourceDescriptor = iResourceDescriptor;
        this.resourceId = iResourceId;
        this.modelReference = modelReference2;
        this.relationships = relationshipSet;
    }

    @NonNull
    public IResource<M> copy(@NonNull ModelReference<M> modelReference2) {
        return new JSONAPIResource(this.resourceDescriptor, this.resourceId, modelReference2, this.relationships);
    }

    @NonNull
    public ModelReference<M> getModelReference() {
        return this.modelReference;
    }

    @NonNull
    public RelationshipSet getRelationships() {
        return this.relationships;
    }

    @NonNull
    public IResourceDescriptor<M> getResourceDescriptor() {
        return this.resourceDescriptor;
    }

    @NonNull
    public IResourceId getResourceId() {
        return this.resourceId;
    }
}
