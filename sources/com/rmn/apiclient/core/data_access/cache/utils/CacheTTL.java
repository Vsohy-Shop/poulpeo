package com.rmn.apiclient.core.data_access.cache.utils;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

public class CacheTTL {
    public final long durationM;

    public CacheTTL(int i, @NonNull TimeUnit timeUnit) {
        if (i > 0) {
            this.durationM = timeUnit.toMillis((long) i);
            return;
        }
        throw new IllegalArgumentException("Can't have a cache ttl without a positive duration");
    }
}
