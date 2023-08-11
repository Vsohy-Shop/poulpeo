package com.rmn.apiclient.core.data_access.cache.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IDocumentDescriptor;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;
import com.rmn.apiclient.core.data_access.base.descriptor.BaseMethodDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.BodyDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptorSet;
import com.rmn.apiclient.core.data_access.cache.access.BaseCacheAccessDescriptor;

public class CacheMethodDescriptor extends BaseMethodDescriptor {
    @NonNull
    private final BaseCacheAccessDescriptor cacheAccessDescriptor;

    public CacheMethodDescriptor(@NonNull MethodVerb methodVerb, @NonNull String str, @NonNull ParamDescriptorSet paramDescriptorSet, @Nullable BodyDescriptor<?> bodyDescriptor, @Nullable IDocumentDescriptor iDocumentDescriptor, @NonNull BaseCacheAccessDescriptor baseCacheAccessDescriptor) {
        super(methodVerb, str, paramDescriptorSet, bodyDescriptor, iDocumentDescriptor);
        this.cacheAccessDescriptor = baseCacheAccessDescriptor;
    }

    @NonNull
    public BaseCacheAccessDescriptor getCacheAccessDescriptor() {
        return this.cacheAccessDescriptor;
    }
}
