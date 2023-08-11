package com.rmn.apiclient.impl.api.descriptors;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheDescriptor;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheMethods;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheModels;

public final class APICacheDescriptors {
    @NonNull
    public static final CacheDescriptor CACHE_DESCRIPTOR = new CacheDescriptor(new MemoryCacheMethods(), new MemoryCacheModels(), "api");
}
