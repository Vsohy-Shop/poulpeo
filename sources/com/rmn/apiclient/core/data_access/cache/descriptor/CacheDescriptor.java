package com.rmn.apiclient.core.data_access.cache.descriptor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheMethods;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheModels;

public class CacheDescriptor {
    @NonNull
    public final String dbName;
    @NonNull
    public final MemoryCacheMethods memoryCacheMethod;
    @NonNull
    public final MemoryCacheModels<?> memoryCacheModels;

    public CacheDescriptor(@NonNull MemoryCacheMethods memoryCacheMethods, @NonNull MemoryCacheModels<?> memoryCacheModels2, @NonNull String str) {
        this.memoryCacheMethod = memoryCacheMethods;
        this.memoryCacheModels = memoryCacheModels2;
        this.dbName = str;
    }
}
