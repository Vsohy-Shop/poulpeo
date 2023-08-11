package com.rmn.apiclient.core.data.descriptor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.serializer.IDocumentSerializer;

public interface IDocumentDescriptor {
    @NonNull
    ResourceDescriptorSet getResourceDescriptors();

    @NonNull
    IDocumentSerializer getSerializer();
}
