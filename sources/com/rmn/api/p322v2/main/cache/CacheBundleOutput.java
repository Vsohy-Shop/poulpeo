package com.rmn.api.p322v2.main.cache;

import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;
import java.util.Map;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.cache.CacheBundleOutput */
public class CacheBundleOutput {
    private ContextContainer contextContainer;
    private final ICacheMethodType methodType;
    private Map<RMNMethodReturnType, RMNResponseObjectImmutable> responseObjects = new HashMap();
    private CacheOutputStatus status;

    /* renamed from: com.rmn.api.v2.main.cache.CacheBundleOutput$CacheOutputStatus */
    public enum CacheOutputStatus {
        PENDING,
        PROBLEM,
        OK
    }

    public CacheBundleOutput(ContextContainer contextContainer2, ICacheMethodType iCacheMethodType) {
        if (contextContainer2 == null) {
            throw new IllegalArgumentException();
        } else if (iCacheMethodType != null) {
            this.contextContainer = contextContainer2;
            this.status = CacheOutputStatus.PENDING;
            this.methodType = iCacheMethodType;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void addResponseObject(RMNMethodReturnType rMNMethodReturnType, RMNResponseObjectImmutable rMNResponseObjectImmutable) {
        if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (rMNResponseObjectImmutable == null) {
            throw new IllegalArgumentException();
        } else if (!this.responseObjects.containsKey(rMNMethodReturnType)) {
            this.responseObjects.put(rMNMethodReturnType, rMNResponseObjectImmutable);
        } else {
            throw new IllegalStateException("Response object already put in the proxy output");
        }
    }

    public ContextContainer getContextContainer() {
        return this.contextContainer;
    }

    public ICacheMethodType getMethodType() {
        return this.methodType;
    }

    public RMNResponseObjectImmutable getRetrievedCachedObject(RMNMethodReturnType rMNMethodReturnType) {
        if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (!this.methodType.getCache(this.contextContainer).hasMethodReturn(rMNMethodReturnType)) {
            C13633n.m31166v("The methodType " + this.methodType + " does not have a methodReturn with keyName =" + rMNMethodReturnType.getKeyName() + " and type = " + rMNMethodReturnType.getReturnType().getSimpleName());
            return null;
        } else if (!this.responseObjects.containsKey(rMNMethodReturnType)) {
            return null;
        } else {
            return this.responseObjects.get(rMNMethodReturnType);
        }
    }

    public Map<RMNMethodReturnType, RMNResponseObjectImmutable> getRetrievedCachedObjects() {
        return new HashMap(this.responseObjects);
    }

    public CacheOutputStatus getStatus() {
        return this.status;
    }

    public void setStatus(CacheOutputStatus cacheOutputStatus) {
        if (cacheOutputStatus != null) {
            CacheOutputStatus cacheOutputStatus2 = this.status;
            if (cacheOutputStatus != cacheOutputStatus2) {
                if (cacheOutputStatus2 != CacheOutputStatus.PENDING) {
                    C13633n.m31163s(this, "Can't change cache output status, already set : " + this.status);
                    return;
                }
                this.status = cacheOutputStatus;
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
