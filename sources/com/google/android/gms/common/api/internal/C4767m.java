package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import p200q4.C9218b;
import p200q4.C9226f;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.common.api.internal.m */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4767m extends C4768m0 {

    /* renamed from: g */
    private final ArraySet<C9218b<?>> f5014g = new ArraySet<>();

    /* renamed from: h */
    private final C4744c f5015h;

    C4767m(C9226f fVar, C4744c cVar, GoogleApiAvailability googleApiAvailability) {
        super(fVar, googleApiAvailability);
        this.f5015h = cVar;
        this.f4936b.mo43521v("ConnectionlessLifecycleHelper", this);
    }

    @MainThread
    /* renamed from: u */
    public static void m6611u(Activity activity, C4744c cVar, C9218b<?> bVar) {
        C9226f c = LifecycleCallback.m6478c(activity);
        C4767m mVar = (C4767m) c.mo43518b0("ConnectionlessLifecycleHelper", C4767m.class);
        if (mVar == null) {
            mVar = new C4767m(c, cVar, GoogleApiAvailability.m6375n());
        }
        C9713p.m20276k(bVar, "ApiKey cannot be null");
        mVar.f5014g.add(bVar);
        cVar.mo32484d(mVar);
    }

    /* renamed from: v */
    private final void m6612v() {
        if (!this.f5014g.isEmpty()) {
            this.f5015h.mo32484d(this);
        }
    }

    /* renamed from: h */
    public final void mo32451h() {
        super.mo32451h();
        m6612v();
    }

    /* renamed from: j */
    public final void mo32453j() {
        super.mo32453j();
        m6612v();
    }

    /* renamed from: k */
    public final void mo32454k() {
        super.mo32454k();
        this.f5015h.mo32485e(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo32533m(ConnectionResult connectionResult, int i) {
        this.f5015h.mo32481J(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo32534n() {
        this.f5015h.mo32482b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final ArraySet<C9218b<?>> mo32535t() {
        return this.f5014g;
    }
}
