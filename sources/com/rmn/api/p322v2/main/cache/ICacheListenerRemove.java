package com.rmn.api.p322v2.main.cache;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputRemove;

/* renamed from: com.rmn.api.v2.main.cache.ICacheListenerRemove */
public interface ICacheListenerRemove {
    void onCacheActionRemoveExecuted(CacheBundleInputRemove cacheBundleInputRemove, CacheBundleOutput.CacheOutputStatus cacheOutputStatus);
}
