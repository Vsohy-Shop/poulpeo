package com.rmn.apiclient.core.data_access.cache.access;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.data_access.base.call.ParamSet;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheDescriptor;

public class CacheAccessDescriptorLinkUniqueResourceTable extends CacheAccessDescriptorLinkResourceTable {
    public CacheAccessDescriptorLinkUniqueResourceTable(@NonNull CacheDescriptor cacheDescriptor, @NonNull IResourceDescriptor<?> iResourceDescriptor) {
        super(cacheDescriptor, iResourceDescriptor);
    }

    @NonNull
    public BaseCacheAccessDescriptor copy(@Nullable String[] strArr) {
        return new CacheAccessDescriptorLinkUniqueResourceTable(getCacheDescriptor(), getResourceDescriptor());
    }

    @NonNull
    public ParamSet extractInputParamsForCacheAccess(@NonNull CacheInput cacheInput) {
        return new ParamSet();
    }
}
