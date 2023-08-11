package com.rmn.api.p322v2.main.cache.cacheaccess;

import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.ICacheListenerClear;
import com.rmn.api.p322v2.main.cache.ICacheListenerGet;
import com.rmn.api.p322v2.main.cache.ICacheListenerRemove;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputRemove;
import com.rmn.api.p322v2.main.cache.cachetable.BaseCacheTable;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.rmn.api.v2.main.cache.cacheaccess.AbstractCache */
public abstract class AbstractCache {
    private Set<BaseCacheTable> cacheTables;
    private boolean initialized = false;
    private Set<RMNMethodReturnType> methodReturns;
    private Set<RMNMethodParam> params;

    public abstract void executeCacheActionAdd(ICacheListenerAdd iCacheListenerAdd, CacheBundleInputAdd cacheBundleInputAdd);

    public abstract void executeCacheActionClear(ICacheListenerClear iCacheListenerClear, CacheBundleInputClear cacheBundleInputClear);

    public abstract void executeCacheActionGet(ICacheListenerGet iCacheListenerGet, CacheBundleInputGet cacheBundleInputGet);

    public abstract void executeCacheActionRemove(ICacheListenerRemove iCacheListenerRemove, CacheBundleInputRemove cacheBundleInputRemove);

    public final BaseCacheTable[] getCacheTables() {
        Set<BaseCacheTable> set = this.cacheTables;
        return (BaseCacheTable[]) set.toArray(new BaseCacheTable[set.size()]);
    }

    public final RMNMethodReturnType[] getMethodReturns() {
        Set<RMNMethodReturnType> set = this.methodReturns;
        return (RMNMethodReturnType[]) set.toArray(new RMNMethodReturnType[set.size()]);
    }

    public final RMNMethodParam[] getParams() {
        Set<RMNMethodParam> set = this.params;
        return (RMNMethodParam[]) set.toArray(new RMNMethodParam[set.size()]);
    }

    public final boolean hasAnyRequiredMethodReturns() {
        for (RMNMethodReturnType isRequired : this.methodReturns) {
            if (isRequired.isRequired()) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasMethodReturn(RMNMethodReturnType rMNMethodReturnType) {
        return this.methodReturns.contains(rMNMethodReturnType);
    }

    public final boolean hasParam(RMNMethodParam rMNMethodParam) {
        return this.params.contains(rMNMethodParam);
    }

    public void init(ContextContainer contextContainer, BaseDatabaseHelper baseDatabaseHelper) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (baseDatabaseHelper != null) {
            synchronized (AbstractCache.class) {
                if (!this.initialized) {
                    for (BaseCacheTable init : this.cacheTables) {
                        init.init(contextContainer, baseDatabaseHelper);
                    }
                    this.initialized = true;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public final void setParameters(Collection<BaseCacheTable> collection, Set<RMNMethodParam> set, Set<RMNMethodReturnType> set2) {
        if (collection == null) {
            throw new IllegalArgumentException();
        } else if (set == null) {
            throw new IllegalArgumentException();
        } else if (set2 != null) {
            this.cacheTables = new HashSet(collection);
            this.params = new HashSet(set);
            this.methodReturns = new HashSet(set2);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
