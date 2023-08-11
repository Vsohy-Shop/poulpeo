package p387ma;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.utils_common.IListener;

/* renamed from: ma.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12891r implements ICacheListenerAdd {

    /* renamed from: a */
    public final /* synthetic */ C12892s f20628a;

    /* renamed from: b */
    public final /* synthetic */ IListener f20629b;

    public /* synthetic */ C12891r(C12892s sVar, IListener iListener) {
        this.f20628a = sVar;
        this.f20629b = iListener;
    }

    public final void onCacheActionAddExecuted(CacheBundleInputAdd cacheBundleInputAdd, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
        this.f20628a.m29022r2(this.f20629b, cacheBundleInputAdd, cacheOutputStatus);
    }
}
