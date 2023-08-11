package com.rmn.api.p322v2.main.cache;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;

/* renamed from: com.rmn.api.v2.main.cache.ICacheListenerClear */
public interface ICacheListenerClear {
    void onCacheActionClearExecuted(CacheBundleInputClear cacheBundleInputClear, CacheBundleOutput.CacheOutputStatus cacheOutputStatus);
}
