package com.rmn.apiclient.core.data_access.cache.access;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.APIParam;
import com.rmn.apiclient.core.data_access.base.call.ParamSet;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptorSet;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheDescriptor;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheMethods;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheModels;
import com.rmn.apiclient.core.data_access.cache.utils.CacheTTL;
import java.util.Arrays;
import java.util.HashSet;

public abstract class BaseCacheAccessDescriptor {
    @NonNull
    private final CacheDescriptor cacheDescriptor;
    @NonNull
    private final String[] cacheMethodParams;

    public BaseCacheAccessDescriptor(@NonNull CacheDescriptor cacheDescriptor2, @Nullable String[] strArr) {
        this.cacheDescriptor = cacheDescriptor2;
        if (strArr == null) {
            this.cacheMethodParams = new String[0];
        } else {
            this.cacheMethodParams = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }

    @NonNull
    public abstract BaseCacheAccessDescriptor copy(@Nullable String[] strArr);

    @NonNull
    public ParamSet extractInputParamsForCacheAccess(@NonNull CacheInput cacheInput) {
        APIParam<?> findParam;
        ParamDescriptorSet paramDescriptorSet = cacheInput.getMethodDescriptor().paramDescriptors;
        HashSet hashSet = new HashSet();
        ParamSet params = cacheInput.getParams();
        for (String str : this.cacheMethodParams) {
            ParamDescriptor<?> findParamDescriptor = paramDescriptorSet.findParamDescriptor(str);
            if (!(findParamDescriptor == null || (findParam = params.findParam(str, findParamDescriptor.type)) == null)) {
                hashSet.add(findParam);
            }
        }
        return new ParamSet(hashSet);
    }

    @NonNull
    public CacheDescriptor getCacheDescriptor() {
        return this.cacheDescriptor;
    }

    @NonNull
    public String[] getCacheMethodParams() {
        String[] strArr = this.cacheMethodParams;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Nullable
    public abstract CacheTTL getCacheTTL();

    @Nullable
    public abstract MemoryCacheMethods getMemoryCacheMethods();

    @Nullable
    public abstract MemoryCacheModels<?> getMemoryCacheModels();
}
