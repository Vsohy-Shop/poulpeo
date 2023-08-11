package com.rmn.apiclient.core.data_access.cache.strategy;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.data_access.cache.access.BaseCacheAccessDescriptor;
import com.rmn.apiclient.core.data_access.cache.access.CacheAccessDescriptorAccessDocument;
import com.rmn.apiclient.core.data_access.cache.access.CacheAccessDescriptorLinkResourceTable;
import com.rmn.apiclient.core.data_access.cache.access.CacheAccessDescriptorLinkUniqueResourceTable;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheDescriptor;
import com.rmn.apiclient.core.data_access.cache.utils.CacheTTL;

public final class CacheAccessStrategy {
    @NonNull
    public static BaseCacheAccessDescriptor accessDocumentTable(@NonNull CacheDescriptor cacheDescriptor, @NonNull CacheTTL cacheTTL) {
        return new CacheAccessDescriptorAccessDocument(cacheDescriptor, cacheTTL, (String[]) null);
    }

    @NonNull
    public static BaseCacheAccessDescriptor linkResourceTable(@NonNull CacheDescriptor cacheDescriptor, @NonNull IResourceDescriptor<?> iResourceDescriptor, @NonNull String str) {
        return new CacheAccessDescriptorLinkResourceTable(cacheDescriptor, iResourceDescriptor, str);
    }

    @NonNull
    public static BaseCacheAccessDescriptor linkUniqueResourceTable(@NonNull CacheDescriptor cacheDescriptor, @NonNull IResourceDescriptor<?> iResourceDescriptor) {
        return new CacheAccessDescriptorLinkUniqueResourceTable(cacheDescriptor, iResourceDescriptor);
    }
}
