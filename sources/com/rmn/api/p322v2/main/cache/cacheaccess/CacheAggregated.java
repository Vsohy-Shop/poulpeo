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
import com.rmn.api.p322v2.main.general.RequestCounter;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable;
import com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.rmn.api.v2.main.cache.cacheaccess.CacheAggregated */
public final class CacheAggregated extends AbstractCache {
    private List<BaseCacheAccess> caches;

    /* renamed from: com.rmn.api.v2.main.cache.cacheaccess.CacheAggregated$a */
    class C11355a implements ICacheListenerGet {

        /* renamed from: a */
        final /* synthetic */ AbstractCache f17841a;

        /* renamed from: b */
        final /* synthetic */ CacheBundleOutput.CacheOutputStatus[] f17842b;

        /* renamed from: c */
        final /* synthetic */ CacheBundleOutput.CacheOutputStatus[] f17843c;

        /* renamed from: d */
        final /* synthetic */ CacheBundleOutput f17844d;

        /* renamed from: e */
        final /* synthetic */ RequestCounter f17845e;

        /* renamed from: f */
        final /* synthetic */ ICacheListenerGet f17846f;

        C11355a(AbstractCache abstractCache, CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr, CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr2, CacheBundleOutput cacheBundleOutput, RequestCounter requestCounter, ICacheListenerGet iCacheListenerGet) {
            this.f17841a = abstractCache;
            this.f17842b = cacheOutputStatusArr;
            this.f17843c = cacheOutputStatusArr2;
            this.f17844d = cacheBundleOutput;
            this.f17845e = requestCounter;
            this.f17846f = iCacheListenerGet;
        }

        public void onCacheActionGetExecuted(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput) {
            if (this.f17841a.hasAnyRequiredMethodReturns()) {
                CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr = this.f17842b;
                if (cacheOutputStatusArr[0] != CacheBundleOutput.CacheOutputStatus.PROBLEM) {
                    cacheOutputStatusArr[0] = cacheBundleOutput.getStatus();
                }
            } else {
                CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr2 = this.f17843c;
                if (cacheOutputStatusArr2[0] != CacheBundleOutput.CacheOutputStatus.PROBLEM) {
                    cacheOutputStatusArr2[0] = cacheBundleOutput.getStatus();
                }
            }
            for (Map.Entry next : cacheBundleOutput.getRetrievedCachedObjects().entrySet()) {
                try {
                    this.f17844d.addResponseObject((RMNMethodReturnType) next.getKey(), (RMNResponseObjectImmutable) next.getValue());
                } catch (Exception unused) {
                }
            }
            this.f17845e.decrementCounter();
            if (this.f17845e.isFinished()) {
                CacheBundleOutput.CacheOutputStatus cacheOutputStatus = this.f17842b[0];
                if (cacheOutputStatus != CacheBundleOutput.CacheOutputStatus.PENDING) {
                    this.f17844d.setStatus(cacheOutputStatus);
                } else {
                    this.f17844d.setStatus(this.f17843c[0]);
                }
                this.f17846f.onCacheActionGetExecuted(cacheBundleInputGet, this.f17844d);
            }
        }
    }

    /* renamed from: com.rmn.api.v2.main.cache.cacheaccess.CacheAggregated$b */
    class C11356b implements ICacheListenerAdd {

        /* renamed from: a */
        final /* synthetic */ CacheBundleOutput.CacheOutputStatus[] f17848a;

        /* renamed from: b */
        final /* synthetic */ RequestCounter f17849b;

        /* renamed from: c */
        final /* synthetic */ ICacheListenerAdd f17850c;

        C11356b(CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr, RequestCounter requestCounter, ICacheListenerAdd iCacheListenerAdd) {
            this.f17848a = cacheOutputStatusArr;
            this.f17849b = requestCounter;
            this.f17850c = iCacheListenerAdd;
        }

        public void onCacheActionAddExecuted(CacheBundleInputAdd cacheBundleInputAdd, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
            ICacheListenerAdd iCacheListenerAdd;
            CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr = this.f17848a;
            if (cacheOutputStatusArr[0] != CacheBundleOutput.CacheOutputStatus.PROBLEM) {
                cacheOutputStatusArr[0] = cacheOutputStatus;
            }
            this.f17849b.decrementCounter();
            if (this.f17849b.isFinished() && (iCacheListenerAdd = this.f17850c) != null) {
                iCacheListenerAdd.onCacheActionAddExecuted(cacheBundleInputAdd, this.f17848a[0]);
            }
        }
    }

    /* renamed from: com.rmn.api.v2.main.cache.cacheaccess.CacheAggregated$c */
    class C11357c implements ICacheListenerRemove {

        /* renamed from: a */
        final /* synthetic */ CacheBundleOutput.CacheOutputStatus[] f17852a;

        /* renamed from: b */
        final /* synthetic */ RequestCounter f17853b;

        /* renamed from: c */
        final /* synthetic */ ICacheListenerRemove f17854c;

        C11357c(CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr, RequestCounter requestCounter, ICacheListenerRemove iCacheListenerRemove) {
            this.f17852a = cacheOutputStatusArr;
            this.f17853b = requestCounter;
            this.f17854c = iCacheListenerRemove;
        }

        public void onCacheActionRemoveExecuted(CacheBundleInputRemove cacheBundleInputRemove, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
            ICacheListenerRemove iCacheListenerRemove;
            CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr = this.f17852a;
            if (cacheOutputStatusArr[0] != CacheBundleOutput.CacheOutputStatus.PROBLEM) {
                cacheOutputStatusArr[0] = cacheOutputStatus;
            }
            this.f17853b.decrementCounter();
            if (this.f17853b.isFinished() && (iCacheListenerRemove = this.f17854c) != null) {
                iCacheListenerRemove.onCacheActionRemoveExecuted(cacheBundleInputRemove, this.f17852a[0]);
            }
        }
    }

    /* renamed from: com.rmn.api.v2.main.cache.cacheaccess.CacheAggregated$d */
    class C11358d implements ICacheListenerClear {

        /* renamed from: a */
        final /* synthetic */ CacheBundleOutput.CacheOutputStatus[] f17856a;

        /* renamed from: b */
        final /* synthetic */ RequestCounter f17857b;

        /* renamed from: c */
        final /* synthetic */ ICacheListenerClear f17858c;

        C11358d(CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr, RequestCounter requestCounter, ICacheListenerClear iCacheListenerClear) {
            this.f17856a = cacheOutputStatusArr;
            this.f17857b = requestCounter;
            this.f17858c = iCacheListenerClear;
        }

        public void onCacheActionClearExecuted(CacheBundleInputClear cacheBundleInputClear, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
            ICacheListenerClear iCacheListenerClear;
            CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr = this.f17856a;
            if (cacheOutputStatusArr[0] != CacheBundleOutput.CacheOutputStatus.PROBLEM) {
                cacheOutputStatusArr[0] = cacheOutputStatus;
            }
            this.f17857b.decrementCounter();
            if (this.f17857b.isFinished() && (iCacheListenerClear = this.f17858c) != null) {
                iCacheListenerClear.onCacheActionClearExecuted(cacheBundleInputClear, this.f17856a[0]);
            }
        }
    }

    public CacheAggregated(List<BaseCacheAccess> list) {
        if (list == null) {
            throw new IllegalArgumentException();
        } else if (list.size() >= 2) {
            this.caches = new ArrayList(list);
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet(2);
            for (AbstractCache next : list) {
                arrayList.addAll(Arrays.asList(next.getCacheTables()));
                hashSet.addAll(Arrays.asList(next.getParams()));
                hashSet2.addAll(Arrays.asList(next.getMethodReturns()));
            }
            setParameters(arrayList, hashSet, hashSet2);
        } else {
            throw new IllegalArgumentException("Creating a CacheTypeAggregated with less than 2 caches is useless");
        }
    }

    public void executeCacheActionAdd(ICacheListenerAdd iCacheListenerAdd, CacheBundleInputAdd cacheBundleInputAdd) {
        if (cacheBundleInputAdd != null) {
            CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr = {CacheBundleOutput.CacheOutputStatus.PENDING};
            RequestCounter requestCounter = new RequestCounter(this.caches.size());
            for (BaseCacheAccess executeCacheActionAdd : this.caches) {
                executeCacheActionAdd.executeCacheActionAdd(new C11356b(cacheOutputStatusArr, requestCounter, iCacheListenerAdd), cacheBundleInputAdd);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void executeCacheActionClear(ICacheListenerClear iCacheListenerClear, CacheBundleInputClear cacheBundleInputClear) {
        if (cacheBundleInputClear != null) {
            CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr = {CacheBundleOutput.CacheOutputStatus.PENDING};
            RequestCounter requestCounter = new RequestCounter(this.caches.size());
            for (BaseCacheAccess executeCacheActionClear : this.caches) {
                executeCacheActionClear.executeCacheActionClear(new C11358d(cacheOutputStatusArr, requestCounter, iCacheListenerClear), cacheBundleInputClear);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void executeCacheActionGet(ICacheListenerGet iCacheListenerGet, CacheBundleInputGet cacheBundleInputGet) {
        CacheBundleInputGet cacheBundleInputGet2 = cacheBundleInputGet;
        if (iCacheListenerGet == null) {
            throw new IllegalArgumentException();
        } else if (cacheBundleInputGet2 != null) {
            CacheBundleOutput cacheBundleOutput = new CacheBundleOutput(cacheBundleInputGet.getContextContainer(), cacheBundleInputGet.getMethodType());
            RequestCounter requestCounter = new RequestCounter(this.caches.size());
            CacheBundleOutput.CacheOutputStatus cacheOutputStatus = CacheBundleOutput.CacheOutputStatus.PENDING;
            CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr = {cacheOutputStatus};
            CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr2 = {cacheOutputStatus};
            for (AbstractCache next : this.caches) {
                C11355a aVar = r0;
                C11355a aVar2 = new C11355a(next, cacheOutputStatusArr, cacheOutputStatusArr2, cacheBundleOutput, requestCounter, iCacheListenerGet);
                next.executeCacheActionGet(aVar, cacheBundleInputGet2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void executeCacheActionRemove(ICacheListenerRemove iCacheListenerRemove, CacheBundleInputRemove cacheBundleInputRemove) {
        if (cacheBundleInputRemove != null) {
            CacheBundleOutput.CacheOutputStatus[] cacheOutputStatusArr = {CacheBundleOutput.CacheOutputStatus.PENDING};
            RequestCounter requestCounter = new RequestCounter(this.caches.size());
            for (BaseCacheAccess executeCacheActionRemove : this.caches) {
                executeCacheActionRemove.executeCacheActionRemove(new C11357c(cacheOutputStatusArr, requestCounter, iCacheListenerRemove), cacheBundleInputRemove);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void init(ContextContainer contextContainer, BaseDatabaseHelper baseDatabaseHelper) {
        super.init(contextContainer, baseDatabaseHelper);
        for (BaseCacheAccess init : this.caches) {
            init.init(contextContainer, baseDatabaseHelper);
        }
    }
}
