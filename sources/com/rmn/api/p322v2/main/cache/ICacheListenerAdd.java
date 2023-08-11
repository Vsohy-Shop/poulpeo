package com.rmn.api.p322v2.main.cache;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;

/* renamed from: com.rmn.api.v2.main.cache.ICacheListenerAdd */
public interface ICacheListenerAdd {
    void onCacheActionAddExecuted(CacheBundleInputAdd cacheBundleInputAdd, CacheBundleOutput.CacheOutputStatus cacheOutputStatus);
}
