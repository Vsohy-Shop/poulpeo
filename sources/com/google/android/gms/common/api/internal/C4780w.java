package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p200q4.C9218b;
import p200q4.C9223d0;
import p231t4.C9665c;
import p231t4.C9692j;

/* renamed from: com.google.android.gms.common.api.internal.w */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4780w implements C9665c.C9668c, C9223d0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4719a.C4728f f5046a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9218b<?> f5047b;
    @Nullable

    /* renamed from: c */
    private C9692j f5048c = null;
    @Nullable

    /* renamed from: d */
    private Set<Scope> f5049d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f5050e = false;

    /* renamed from: f */
    final /* synthetic */ C4744c f5051f;

    public C4780w(C4744c cVar, C4719a.C4728f fVar, C9218b<?> bVar) {
        this.f5051f = cVar;
        this.f5046a = fVar;
        this.f5047b = bVar;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: h */
    public final void m6684h() {
        C9692j jVar;
        if (this.f5050e && (jVar = this.f5048c) != null) {
            this.f5046a.mo32406n(jVar, this.f5049d);
        }
    }

    /* renamed from: a */
    public final void mo32571a(@NonNull ConnectionResult connectionResult) {
        this.f5051f.f4965q.post(new C4779v(this, connectionResult));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo32572b(@Nullable C9692j jVar, @Nullable Set<Scope> set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo32573c(new ConnectionResult(4));
            return;
        }
        this.f5048c = jVar;
        this.f5049d = set;
        m6684h();
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo32573c(ConnectionResult connectionResult) {
        C4777t tVar = (C4777t) this.f5051f.f4961m.get(this.f5047b);
        if (tVar != null) {
            tVar.mo32553H(connectionResult);
        }
    }
}
