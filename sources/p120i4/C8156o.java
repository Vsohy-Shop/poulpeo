package p120i4;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.C4882e;
import p036b5.C2888a;
import p150l4.C8675b;
import p231t4.C9713p;

/* renamed from: i4.o */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8156o {

    /* renamed from: c */
    private static final C8675b f11483c = new C8675b("Session");
    @Nullable

    /* renamed from: a */
    private final C8123c0 f11484a;

    /* renamed from: b */
    private final C8155n0 f11485b;

    protected C8156o(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        C8155n0 n0Var = new C8155n0(this, (C8153m0) null);
        this.f11485b = n0Var;
        this.f11484a = C4882e.m6936d(context, str, str2, n0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41997a(boolean z);

    /* renamed from: b */
    public long mo41998b() {
        C9713p.m20270e("Must be called from the main thread.");
        return 0;
    }

    /* renamed from: c */
    public boolean mo42048c() {
        C9713p.m20270e("Must be called from the main thread.");
        C8123c0 c0Var = this.f11484a;
        if (c0Var != null) {
            try {
                return c0Var.mo41980h();
            } catch (RemoteException e) {
                f11483c.mo42755b(e, "Unable to call %s on %s.", "isConnected", C8123c0.class.getSimpleName());
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo42049d() {
        C9713p.m20270e("Must be called from the main thread.");
        C8123c0 c0Var = this.f11484a;
        if (c0Var != null) {
            try {
                return c0Var.mo41976K();
            } catch (RemoteException e) {
                f11483c.mo42755b(e, "Unable to call %s on %s.", "isResuming", C8123c0.class.getSimpleName());
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo42050e(int i) {
        C8123c0 c0Var = this.f11484a;
        if (c0Var != null) {
            try {
                c0Var.mo41975C(i);
            } catch (RemoteException e) {
                f11483c.mo42755b(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", C8123c0.class.getSimpleName());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo42051f(int i) {
        C8123c0 c0Var = this.f11484a;
        if (c0Var != null) {
            try {
                c0Var.mo41981q(i);
            } catch (RemoteException e) {
                f11483c.mo42755b(e, "Unable to call %s on %s.", "notifyFailedToStartSession", C8123c0.class.getSimpleName());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo42052g(int i) {
        C8123c0 c0Var = this.f11484a;
        if (c0Var != null) {
            try {
                c0Var.mo41982u1(i);
            } catch (RemoteException e) {
                f11483c.mo42755b(e, "Unable to call %s on %s.", "notifySessionEnded", C8123c0.class.getSimpleName());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo42001j(@Nullable Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo42002k(@Nullable Bundle bundle);

    /* renamed from: m */
    public final int mo42053m() {
        C9713p.m20270e("Must be called from the main thread.");
        C8123c0 c0Var = this.f11484a;
        if (c0Var != null) {
            try {
                if (c0Var.mo41978e() >= 211100000) {
                    return this.f11484a.mo41979f();
                }
            } catch (RemoteException e) {
                f11483c.mo42755b(e, "Unable to call %s on %s.", "getSessionStartType", C8123c0.class.getSimpleName());
            }
        }
        return 0;
    }

    @Nullable
    /* renamed from: n */
    public final C2888a mo42054n() {
        C8123c0 c0Var = this.f11484a;
        if (c0Var != null) {
            try {
                return c0Var.mo41977d();
            } catch (RemoteException e) {
                f11483c.mo42755b(e, "Unable to call %s on %s.", "getWrappedObject", C8123c0.class.getSimpleName());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo41999h(@Nullable Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo42000i(@Nullable Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo42003l(@Nullable Bundle bundle) {
    }
}
