package p387ma;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.utils_common.IListener;

/* renamed from: ma.c0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12867c0 implements ICacheListenerAdd {

    /* renamed from: a */
    public final /* synthetic */ C12869d0 f20571a;

    /* renamed from: b */
    public final /* synthetic */ IListener f20572b;

    public /* synthetic */ C12867c0(C12869d0 d0Var, IListener iListener) {
        this.f20571a = d0Var;
        this.f20572b = iListener;
    }

    public final void onCacheActionAddExecuted(CacheBundleInputAdd cacheBundleInputAdd, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
        this.f20571a.m28911w2(this.f20572b, cacheBundleInputAdd, cacheOutputStatus);
    }
}
