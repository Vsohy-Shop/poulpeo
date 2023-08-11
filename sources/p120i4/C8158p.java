package p120i4;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p036b5.C2888a;
import p036b5.C2890b;
import p150l4.C8675b;
import p231t4.C9713p;

/* renamed from: i4.p */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C8158p {

    /* renamed from: c */
    private static final C8675b f11488c = new C8675b("SessionManager");

    /* renamed from: a */
    private final C8129e0 f11489a;

    /* renamed from: b */
    private final Context f11490b;

    public C8158p(C8129e0 e0Var, Context context) {
        this.f11489a = e0Var;
        this.f11490b = context;
    }

    /* renamed from: a */
    public <T extends C8156o> void mo42055a(@NonNull C8160q<T> qVar, @NonNull Class<T> cls) {
        if (qVar != null) {
            C9713p.m20275j(cls);
            C9713p.m20270e("Must be called from the main thread.");
            try {
                this.f11489a.mo42007H1(new C8157o0(qVar, cls));
            } catch (RemoteException e) {
                f11488c.mo42755b(e, "Unable to call %s on %s.", "addSessionManagerListener", C8129e0.class.getSimpleName());
            }
        } else {
            throw new NullPointerException("SessionManagerListener can't be null");
        }
    }

    /* renamed from: b */
    public void mo42056b(boolean z) {
        C9713p.m20270e("Must be called from the main thread.");
        try {
            f11488c.mo42758e("End session for %s", this.f11490b.getPackageName());
            this.f11489a.mo42010h0(true, z);
        } catch (RemoteException e) {
            f11488c.mo42755b(e, "Unable to call %s on %s.", "endCurrentSession", C8129e0.class.getSimpleName());
        }
    }

    @Nullable
    /* renamed from: c */
    public C8125d mo42057c() {
        C9713p.m20270e("Must be called from the main thread.");
        C8156o d = mo42058d();
        if (d == null || !(d instanceof C8125d)) {
            return null;
        }
        return (C8125d) d;
    }

    @Nullable
    /* renamed from: d */
    public C8156o mo42058d() {
        C9713p.m20270e("Must be called from the main thread.");
        try {
            return (C8156o) C2890b.m2296J(this.f11489a.mo42009f());
        } catch (RemoteException e) {
            f11488c.mo42755b(e, "Unable to call %s on %s.", "getWrappedCurrentSession", C8129e0.class.getSimpleName());
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    public final C2888a mo42059e() {
        try {
            return this.f11489a.mo42008d();
        } catch (RemoteException e) {
            f11488c.mo42755b(e, "Unable to call %s on %s.", "getWrappedThis", C8129e0.class.getSimpleName());
            return null;
        }
    }
}
