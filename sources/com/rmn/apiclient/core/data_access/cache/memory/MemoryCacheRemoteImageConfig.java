package com.rmn.apiclient.core.data_access.cache.memory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.IRemoteImageConfig;

public class MemoryCacheRemoteImageConfig {
    @NonNull
    public static final MemoryCacheRemoteImageConfig instance = new MemoryCacheRemoteImageConfig();
    @Nullable
    private IRemoteImageConfig config;

    private MemoryCacheRemoteImageConfig() {
    }

    @Nullable
    public IRemoteImageConfig getConfig() {
        return this.config;
    }

    public boolean hasConfig() {
        if (this.config != null) {
            return true;
        }
        return false;
    }

    public void setConfig(@NonNull IRemoteImageConfig iRemoteImageConfig) {
        this.config = iRemoteImageConfig;
    }
}
