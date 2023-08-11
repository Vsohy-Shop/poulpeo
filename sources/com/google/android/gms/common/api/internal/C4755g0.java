package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.Status;
import p180o4.C8974c;
import p200q4.C9236k;
import p200q4.C9247t;
import p276x5.C10406g;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4755g0<ResultT> extends C9247t {

    /* renamed from: b */
    private final C4756h<C4719a.C4721b, ResultT> f4989b;

    /* renamed from: c */
    private final C10406g<ResultT> f4990c;

    /* renamed from: d */
    private final C9236k f4991d;

    public C4755g0(int i, C4756h<C4719a.C4721b, ResultT> hVar, C10406g<ResultT> gVar, C9236k kVar) {
        super(i);
        this.f4990c = gVar;
        this.f4989b = hVar;
        this.f4991d = kVar;
        if (i == 2 && hVar.mo32514c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo32491a(@NonNull Status status) {
        this.f4990c.mo45099d(this.f4991d.mo43505a(status));
    }

    /* renamed from: b */
    public final void mo32492b(@NonNull Exception exc) {
        this.f4990c.mo45099d(exc);
    }

    /* renamed from: c */
    public final void mo32493c(C4777t<?> tVar) {
        try {
            this.f4989b.mo32475b(tVar.mo32565s(), this.f4990c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo32491a(C4760i0.m6593e(e2));
        } catch (RuntimeException e3) {
            this.f4990c.mo45099d(e3);
        }
    }

    /* renamed from: d */
    public final void mo32499d(@NonNull C4765l lVar, boolean z) {
        lVar.mo32528d(this.f4990c, z);
    }

    /* renamed from: f */
    public final boolean mo32506f(C4777t<?> tVar) {
        return this.f4989b.mo32514c();
    }

    @Nullable
    /* renamed from: g */
    public final C8974c[] mo32507g(C4777t<?> tVar) {
        return this.f4989b.mo32516e();
    }
}
