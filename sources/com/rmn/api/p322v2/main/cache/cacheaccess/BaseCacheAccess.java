package com.rmn.api.p322v2.main.cache.cacheaccess;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.ICacheListenerClear;
import com.rmn.api.p322v2.main.cache.ICacheListenerGet;
import com.rmn.api.p322v2.main.cache.ICacheListenerRemove;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputRemove;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import p382lc.C12818a;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.cache.cacheaccess.BaseCacheAccess */
public abstract class BaseCacheAccess extends AbstractCache {

    /* renamed from: com.rmn.api.v2.main.cache.cacheaccess.BaseCacheAccess$a */
    class C11350a extends C12818a {

        /* renamed from: d */
        final /* synthetic */ CacheBundleInputGet f17826d;

        /* renamed from: e */
        final /* synthetic */ CacheBundleOutput f17827e;

        /* renamed from: f */
        final /* synthetic */ ICacheListenerGet f17828f;

        C11350a(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput, ICacheListenerGet iCacheListenerGet) {
            this.f17826d = cacheBundleInputGet;
            this.f17827e = cacheBundleOutput;
            this.f17828f = iCacheListenerGet;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo46874d() {
            try {
                return BaseCacheAccess.this.processCacheGet(this.f17826d, this.f17827e);
            } catch (Exception e) {
                C13633n.m31165u(this, e);
                return false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo46875h(boolean z) {
            super.mo46875h(z);
            if (z) {
                this.f17827e.setStatus(CacheBundleOutput.CacheOutputStatus.OK);
            } else {
                this.f17827e.setStatus(CacheBundleOutput.CacheOutputStatus.PROBLEM);
            }
            this.f17828f.onCacheActionGetExecuted(this.f17826d, this.f17827e);
        }
    }

    /* renamed from: com.rmn.api.v2.main.cache.cacheaccess.BaseCacheAccess$b */
    class C11351b extends C12818a {

        /* renamed from: d */
        final /* synthetic */ CacheBundleInputAdd f17830d;

        /* renamed from: e */
        final /* synthetic */ Object f17831e;

        /* renamed from: f */
        final /* synthetic */ ICacheListenerAdd f17832f;

        C11351b(CacheBundleInputAdd cacheBundleInputAdd, Object obj, ICacheListenerAdd iCacheListenerAdd) {
            this.f17830d = cacheBundleInputAdd;
            this.f17831e = obj;
            this.f17832f = iCacheListenerAdd;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo46874d() {
            boolean z;
            int i = C11354e.f17840a[this.f17830d.getAddOption().ordinal()];
            if (i == 1) {
                z = false;
            } else if (i == 2) {
                z = true;
            } else {
                throw new UnsupportedOperationException();
            }
            try {
                BaseCacheAccess.this.processCacheAdd(this.f17830d, this.f17831e, z);
                return true;
            } catch (Exception e) {
                C13633n.m31165u(this, e);
                return false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo46875h(boolean z) {
            super.mo46875h(z);
            ICacheListenerAdd iCacheListenerAdd = this.f17832f;
            if (iCacheListenerAdd != null) {
                CacheBundleOutput.CacheOutputStatus cacheOutputStatus = CacheBundleOutput.CacheOutputStatus.PROBLEM;
                if (z) {
                    cacheOutputStatus = CacheBundleOutput.CacheOutputStatus.OK;
                }
                iCacheListenerAdd.onCacheActionAddExecuted(this.f17830d, cacheOutputStatus);
            }
        }
    }

    /* renamed from: com.rmn.api.v2.main.cache.cacheaccess.BaseCacheAccess$c */
    class C11352c extends C12818a {

        /* renamed from: d */
        final /* synthetic */ CacheBundleInputRemove f17834d;

        /* renamed from: e */
        final /* synthetic */ ICacheListenerRemove f17835e;

        C11352c(CacheBundleInputRemove cacheBundleInputRemove, ICacheListenerRemove iCacheListenerRemove) {
            this.f17834d = cacheBundleInputRemove;
            this.f17835e = iCacheListenerRemove;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo46874d() {
            try {
                BaseCacheAccess.this.processCacheRemove(this.f17834d);
                return true;
            } catch (Exception e) {
                C13633n.m31165u(this, e);
                return false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo46875h(boolean z) {
            super.mo46875h(z);
            ICacheListenerRemove iCacheListenerRemove = this.f17835e;
            if (iCacheListenerRemove != null) {
                CacheBundleOutput.CacheOutputStatus cacheOutputStatus = CacheBundleOutput.CacheOutputStatus.PROBLEM;
                if (z) {
                    cacheOutputStatus = CacheBundleOutput.CacheOutputStatus.OK;
                }
                iCacheListenerRemove.onCacheActionRemoveExecuted(this.f17834d, cacheOutputStatus);
            }
        }
    }

    /* renamed from: com.rmn.api.v2.main.cache.cacheaccess.BaseCacheAccess$d */
    class C11353d extends C12818a {

        /* renamed from: d */
        final /* synthetic */ CacheBundleInputClear f17837d;

        /* renamed from: e */
        final /* synthetic */ ICacheListenerClear f17838e;

        C11353d(CacheBundleInputClear cacheBundleInputClear, ICacheListenerClear iCacheListenerClear) {
            this.f17837d = cacheBundleInputClear;
            this.f17838e = iCacheListenerClear;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo46874d() {
            try {
                BaseCacheAccess.this.processCacheClear(this.f17837d);
                return true;
            } catch (Exception e) {
                C13633n.m31165u(this, e);
                return false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo46875h(boolean z) {
            super.mo46875h(z);
            ICacheListenerClear iCacheListenerClear = this.f17838e;
            if (iCacheListenerClear != null) {
                CacheBundleOutput.CacheOutputStatus cacheOutputStatus = CacheBundleOutput.CacheOutputStatus.PROBLEM;
                if (z) {
                    cacheOutputStatus = CacheBundleOutput.CacheOutputStatus.OK;
                }
                iCacheListenerClear.onCacheActionClearExecuted(this.f17837d, cacheOutputStatus);
            }
        }
    }

    /* renamed from: com.rmn.api.v2.main.cache.cacheaccess.BaseCacheAccess$e */
    static /* synthetic */ class C11354e {

        /* renamed from: a */
        static final /* synthetic */ int[] f17840a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.rmn.api.v2.main.cache.cachebundleinput.CacheBundleInputAdd$AddOption[] r0 = com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd.AddOption.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17840a = r0
                com.rmn.api.v2.main.cache.cachebundleinput.CacheBundleInputAdd$AddOption r1 = com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17840a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rmn.api.v2.main.cache.cachebundleinput.CacheBundleInputAdd$AddOption r1 = com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd.AddOption.IGNORE_IF_EXISTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.cache.cacheaccess.BaseCacheAccess.C11354e.<clinit>():void");
        }
    }

    public final void executeCacheActionAdd(ICacheListenerAdd iCacheListenerAdd, CacheBundleInputAdd cacheBundleInputAdd) {
        CacheBundleOutput.CacheOutputStatus cacheOutputStatus;
        if (cacheBundleInputAdd != null) {
            RMNMethodReturnType addMethodReturn = getAddMethodReturn();
            Object objectToStore = cacheBundleInputAdd.getObjectToStore(addMethodReturn);
            if (objectToStore == null) {
                C13633n.m31166v("Can't add null object to cache : " + addMethodReturn.getKeyName());
                if (iCacheListenerAdd != null) {
                    if (addMethodReturn.isRequired()) {
                        cacheOutputStatus = CacheBundleOutput.CacheOutputStatus.PROBLEM;
                    } else {
                        cacheOutputStatus = CacheBundleOutput.CacheOutputStatus.OK;
                    }
                    iCacheListenerAdd.onCacheActionAddExecuted(cacheBundleInputAdd, cacheOutputStatus);
                }
            } else if (isAddPreconditionValid(cacheBundleInputAdd, objectToStore)) {
                new C11351b(cacheBundleInputAdd, objectToStore, iCacheListenerAdd).mo50711e();
            } else if (iCacheListenerAdd != null) {
                iCacheListenerAdd.onCacheActionAddExecuted(cacheBundleInputAdd, CacheBundleOutput.CacheOutputStatus.PROBLEM);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void executeCacheActionClear(ICacheListenerClear iCacheListenerClear, CacheBundleInputClear cacheBundleInputClear) {
        if (cacheBundleInputClear != null) {
            new C11353d(cacheBundleInputClear, iCacheListenerClear).mo50711e();
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void executeCacheActionGet(ICacheListenerGet iCacheListenerGet, CacheBundleInputGet cacheBundleInputGet) {
        if (iCacheListenerGet == null) {
            throw new IllegalArgumentException();
        } else if (cacheBundleInputGet != null) {
            CacheBundleOutput cacheBundleOutput = new CacheBundleOutput(cacheBundleInputGet.getContextContainer(), cacheBundleInputGet.getMethodType());
            if (!isGetPreconditionValid(cacheBundleInputGet)) {
                cacheBundleOutput.setStatus(CacheBundleOutput.CacheOutputStatus.PROBLEM);
                iCacheListenerGet.onCacheActionGetExecuted(cacheBundleInputGet, cacheBundleOutput);
                return;
            }
            new C11350a(cacheBundleInputGet, cacheBundleOutput, iCacheListenerGet).mo50711e();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void executeCacheActionRemove(ICacheListenerRemove iCacheListenerRemove, CacheBundleInputRemove cacheBundleInputRemove) {
        if (cacheBundleInputRemove == null) {
            throw new IllegalArgumentException();
        } else if (isRemovePreconditionValid(cacheBundleInputRemove)) {
            new C11352c(cacheBundleInputRemove, iCacheListenerRemove).mo50711e();
        } else if (iCacheListenerRemove != null) {
            iCacheListenerRemove.onCacheActionRemoveExecuted(cacheBundleInputRemove, CacheBundleOutput.CacheOutputStatus.PROBLEM);
        }
    }

    /* access modifiers changed from: protected */
    public abstract RMNMethodReturnType getAddMethodReturn();

    /* access modifiers changed from: protected */
    public abstract boolean isAddPreconditionValid(CacheBundleInputAdd cacheBundleInputAdd, Object obj);

    /* access modifiers changed from: protected */
    public abstract boolean isGetPreconditionValid(CacheBundleInputGet cacheBundleInputGet);

    /* access modifiers changed from: protected */
    public abstract boolean isRemovePreconditionValid(CacheBundleInputRemove cacheBundleInputRemove);

    /* access modifiers changed from: protected */
    public abstract void processCacheAdd(CacheBundleInputAdd cacheBundleInputAdd, Object obj, boolean z);

    /* access modifiers changed from: protected */
    public abstract void processCacheClear(CacheBundleInputClear cacheBundleInputClear);

    /* access modifiers changed from: protected */
    public abstract boolean processCacheGet(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput);

    /* access modifiers changed from: protected */
    public abstract void processCacheRemove(CacheBundleInputRemove cacheBundleInputRemove);
}
