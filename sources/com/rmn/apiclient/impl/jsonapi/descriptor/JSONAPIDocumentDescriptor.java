package com.rmn.apiclient.impl.jsonapi.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IDocumentDescriptor;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIDocumentSerializer;

public class JSONAPIDocumentDescriptor implements IDocumentDescriptor {
    @Nullable
    public final JSONAPIMetaDescriptor<?> metaDescriptor;
    @NonNull
    public final ResourceDescriptorSet resourceDescriptors;
    @NonNull
    private final JSONAPIDocumentSerializer serializer;

    public JSONAPIDocumentDescriptor(@Nullable JSONAPIMetaDescriptor<?> jSONAPIMetaDescriptor, @Nullable ResourceDescriptorSet resourceDescriptorSet) {
        this.metaDescriptor = jSONAPIMetaDescriptor;
        this.resourceDescriptors = resourceDescriptorSet == null ? new ResourceDescriptorSet(new IResourceDescriptor[0]) : resourceDescriptorSet;
        this.serializer = new JSONAPIDocumentSerializer(this);
    }

    @NonNull
    public ResourceDescriptorSet getResourceDescriptors() {
        return this.resourceDescriptors;
    }

    @NonNull
    public JSONAPIDocumentSerializer getSerializer() {
        return this.serializer;
    }
}
