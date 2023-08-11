package com.rmn.apiclient.core.data_access.cache.descriptor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.model.IModel;

public class CacheResourceDescriptor<M extends IModel> {
    @NonNull
    private final CacheDescriptor cacheDescriptor;
    @NonNull
    private final IResourceDescriptor<M> resourceDescriptor;

    public CacheResourceDescriptor(@NonNull IResourceDescriptor<M> iResourceDescriptor, @NonNull CacheDescriptor cacheDescriptor2) {
        this.resourceDescriptor = iResourceDescriptor;
        this.cacheDescriptor = cacheDescriptor2;
    }

    @NonNull
    public CacheDescriptor getCacheDescriptor() {
        return this.cacheDescriptor;
    }

    @NonNull
    public IResourceDescriptor<M> getResourceDescriptor() {
        return this.resourceDescriptor;
    }
}
