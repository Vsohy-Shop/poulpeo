package com.rmn.apiclient.core.data_access.cache.access;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheDescriptor;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheMethods;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheModels;
import com.rmn.apiclient.core.data_access.cache.utils.CacheTTL;

public class CacheAccessDescriptorLinkResourceTable extends BaseCacheAccessDescriptor {
    @NonNull
    private final IResourceDescriptor<?> resourceDescriptor;

    protected CacheAccessDescriptorLinkResourceTable(@NonNull CacheDescriptor cacheDescriptor, @NonNull IResourceDescriptor<?> iResourceDescriptor) {
        super(cacheDescriptor, (String[]) null);
        this.resourceDescriptor = iResourceDescriptor;
    }

    @NonNull
    public BaseCacheAccessDescriptor copy(@Nullable String[] strArr) {
        return new CacheAccessDescriptorLinkResourceTable(getCacheDescriptor(), this.resourceDescriptor, strArr);
    }

    @Nullable
    public CacheTTL getCacheTTL() {
        return null;
    }

    @NonNull
    public MemoryCacheMethods getMemoryCacheMethods() {
        return getCacheDescriptor().memoryCacheMethod;
    }

    @NonNull
    public MemoryCacheModels<?> getMemoryCacheModels() {
        return getCacheDescriptor().memoryCacheModels;
    }

    @NonNull
    public IResourceDescriptor<?> getResourceDescriptor() {
        return this.resourceDescriptor;
    }

    protected CacheAccessDescriptorLinkResourceTable(@NonNull CacheDescriptor cacheDescriptor, @NonNull IResourceDescriptor<?> iResourceDescriptor, @Nullable String[] strArr) {
        super(cacheDescriptor, strArr);
        this.resourceDescriptor = iResourceDescriptor;
    }

    public CacheAccessDescriptorLinkResourceTable(@NonNull CacheDescriptor cacheDescriptor, @NonNull IResourceDescriptor<?> iResourceDescriptor, @NonNull String str) {
        super(cacheDescriptor, new String[]{str});
        this.resourceDescriptor = iResourceDescriptor;
    }
}
