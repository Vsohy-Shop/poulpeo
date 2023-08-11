package com.rmn.apiclient.core.data_access.cache.access;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheDescriptor;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheMethods;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheModels;
import com.rmn.apiclient.core.data_access.cache.utils.CacheTTL;

public class CacheAccessDescriptorAccessDocument extends BaseCacheAccessDescriptor {
    @NonNull
    private final CacheTTL cacheTTL;

    public CacheAccessDescriptorAccessDocument(@NonNull CacheDescriptor cacheDescriptor, @NonNull CacheTTL cacheTTL2, @Nullable String[] strArr) {
        super(cacheDescriptor, strArr);
        this.cacheTTL = cacheTTL2;
    }

    @NonNull
    public BaseCacheAccessDescriptor copy(@Nullable String[] strArr) {
        return new CacheAccessDescriptorAccessDocument(getCacheDescriptor(), getCacheTTL(), strArr);
    }

    @NonNull
    public CacheTTL getCacheTTL() {
        return this.cacheTTL;
    }

    @Nullable
    public MemoryCacheMethods getMemoryCacheMethods() {
        return getCacheDescriptor().memoryCacheMethod;
    }

    @Nullable
    public MemoryCacheModels<?> getMemoryCacheModels() {
        return getCacheDescriptor().memoryCacheModels;
    }
}
