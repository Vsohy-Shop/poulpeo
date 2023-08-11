package com.rmn.api.p322v2.main.cache.cachebundleinput;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.iosadapters.android.content.ContextContainer;

/* renamed from: com.rmn.api.v2.main.cache.cachebundleinput.AbstractCacheBundleInput */
public abstract class AbstractCacheBundleInput {
    private ContextContainer contextContainer;
    private ICacheMethodType methodType;

    public AbstractCacheBundleInput(ContextContainer contextContainer2, ICacheMethodType iCacheMethodType) {
        if (contextContainer2 == null) {
            throw new IllegalArgumentException();
        } else if (iCacheMethodType != null) {
            this.contextContainer = contextContainer2;
            this.methodType = iCacheMethodType;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractCacheBundleInput abstractCacheBundleInput = (AbstractCacheBundleInput) obj;
        ICacheMethodType iCacheMethodType = this.methodType;
        if (iCacheMethodType == null) {
            if (abstractCacheBundleInput.methodType != null) {
                return false;
            }
        } else if (!iCacheMethodType.equals(abstractCacheBundleInput.methodType)) {
            return false;
        }
        return true;
    }

    public ContextContainer getContextContainer() {
        return this.contextContainer;
    }

    public ICacheMethodType getMethodType() {
        return this.methodType;
    }

    public int hashCode() {
        int i;
        ICacheMethodType iCacheMethodType = this.methodType;
        if (iCacheMethodType == null) {
            i = 0;
        } else {
            i = iCacheMethodType.hashCode();
        }
        return 31 + i;
    }
}
