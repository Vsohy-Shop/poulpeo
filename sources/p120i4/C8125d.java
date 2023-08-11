package p120i4;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.media.C4633a;
import com.google.android.gms.cast.framework.media.C4646g;
import com.google.android.gms.cast.framework.media.C4648h;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.cast.C4829b0;
import com.google.android.gms.internal.cast.C4882e;
import com.google.android.gms.internal.cast.C4900f0;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import java.util.Set;
import org.checkerframework.dataflow.qual.Pure;
import p109h4.C7910b;
import p109h4.C7913c;
import p109h4.C7930f1;
import p130j4.C8412r;
import p150l4.C8675b;
import p150l4.C8709s;
import p231t4.C9713p;

/* renamed from: i4.d */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C8125d extends C8156o {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C8675b f11455p = new C8675b("CastSession");

    /* renamed from: d */
    private final Context f11456d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Set f11457e = new HashSet();
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public final C8168u f11458f;

    /* renamed from: g */
    private final C8119b f11459g;

    /* renamed from: h */
    private final C4829b0 f11460h;

    /* renamed from: i */
    private final C8412r f11461i;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: j */
    public C7930f1 f11462j;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: k */
    public C4648h f11463k;
    @Nullable

    /* renamed from: l */
    private CastDevice f11464l;
    @Nullable

    /* renamed from: m */
    private C7913c.C7914a f11465m;
    @Nullable

    /* renamed from: n */
    private C4900f0 f11466n;

    /* renamed from: o */
    private final C8167t0 f11467o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8125d(Context context, String str, @Nullable String str2, C8119b bVar, C4829b0 b0Var, C8412r rVar) {
        super(context, str, str2);
        C8167t0 t0Var = C8167t0.f11497a;
        this.f11456d = context.getApplicationContext();
        this.f11459g = bVar;
        this.f11460h = b0Var;
        this.f11461i = rVar;
        this.f11467o = t0Var;
        this.f11458f = C4882e.m6934b(context, bVar, mo42054n(), new C8175x0(this, (C8173w0) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m16029A() {
        C4900f0 f0Var = this.f11466n;
        if (f0Var != null) {
            f0Var.mo32782e();
        }
    }

    /* renamed from: v */
    static /* bridge */ /* synthetic */ void m16035v(C8125d dVar, int i) {
        dVar.f11461i.mo42424j(i);
        C7930f1 f1Var = dVar.f11462j;
        if (f1Var != null) {
            f1Var.mo41706f();
            dVar.f11462j = null;
        }
        dVar.f11464l = null;
        C4648h hVar = dVar.f11463k;
        if (hVar != null) {
            hVar.mo32157R((C7930f1) null);
            dVar.f11463k = null;
        }
        dVar.f11465m = null;
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ void m16037x(C8125d dVar, String str, Task task) {
        if (dVar.f11458f != null) {
            try {
                if (task.mo35465p()) {
                    C7913c.C7914a aVar = (C7913c.C7914a) task.mo35461l();
                    dVar.f11465m = aVar;
                    if (aVar.getStatus() != null && aVar.getStatus().mo32381I()) {
                        f11455p.mo42754a("%s() -> success result", str);
                        C4648h hVar = new C4648h(new C8709s((String) null));
                        dVar.f11463k = hVar;
                        hVar.mo32157R(dVar.f11462j);
                        dVar.f11463k.mo32154O();
                        dVar.f11461i.mo42423i(dVar.f11463k, dVar.mo42004o());
                        dVar.f11458f.mo42045T((C7910b) C9713p.m20275j(aVar.mo41667q()), aVar.mo41666d(), (String) C9713p.m20275j(aVar.mo41668z()), aVar.mo41665b());
                        return;
                    } else if (aVar.getStatus() != null) {
                        f11455p.mo42754a("%s() -> failure result", str);
                        dVar.f11458f.mo42046a(aVar.getStatus().mo32378F());
                        return;
                    }
                } else {
                    Exception k = task.mo35460k();
                    if (k instanceof ApiException) {
                        dVar.f11458f.mo42046a(((ApiException) k).mo32366b());
                        return;
                    }
                }
                dVar.f11458f.mo42046a(2476);
            } catch (RemoteException e) {
                f11455p.mo42755b(e, "Unable to call %s on %s.", "methods", C8168u.class.getSimpleName());
            }
        }
    }

    /* renamed from: z */
    private final void m16038z(@Nullable Bundle bundle) {
        C4633a aVar;
        C4646g gVar;
        boolean z;
        CastDevice H = CastDevice.m5962H(bundle);
        this.f11464l = H;
        if (H != null) {
            C7930f1 f1Var = this.f11462j;
            if (f1Var != null) {
                f1Var.mo41706f();
                this.f11462j = null;
            }
            boolean z2 = true;
            f11455p.mo42754a("Acquiring a connection to Google Play Services for %s", this.f11464l);
            CastDevice castDevice = (CastDevice) C9713p.m20275j(this.f11464l);
            Bundle bundle2 = new Bundle();
            C8119b bVar = this.f11459g;
            if (bVar == null) {
                aVar = null;
            } else {
                aVar = bVar.mo41983A();
            }
            if (aVar == null) {
                gVar = null;
            } else {
                gVar = aVar.mo32067I();
            }
            if (aVar == null || !aVar.mo32068J()) {
                z = false;
            } else {
                z = true;
            }
            if (gVar == null) {
                z2 = false;
            }
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", z2);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.f11460h.mo32631e3());
            C7913c.C7916c.C7917a aVar2 = new C7913c.C7916c.C7917a(castDevice, new C8179z0(this, (C8177y0) null));
            aVar2.mo41672d(bundle2);
            C7930f1 a = C7913c.m15542a(this.f11456d, aVar2.mo41671a());
            a.mo41704d(new C8121b1(this, (C8118a1) null));
            this.f11462j = a;
            a.mo41705e();
        } else if (mo42049d()) {
            mo42050e(2153);
        } else {
            mo42051f(2151);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41997a(boolean z) {
        C8168u uVar = this.f11458f;
        if (uVar != null) {
            try {
                uVar.mo42044Q2(z, 0);
            } catch (RemoteException e) {
                f11455p.mo42755b(e, "Unable to call %s on %s.", "disconnectFromDevice", C8168u.class.getSimpleName());
            }
            mo42052g(0);
            m16029A();
        }
    }

    /* renamed from: b */
    public long mo41998b() {
        C9713p.m20270e("Must be called from the main thread.");
        C4648h hVar = this.f11463k;
        if (hVar == null) {
            return 0;
        }
        return hVar.mo32169i() - this.f11463k.mo32162b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo41999h(@Nullable Bundle bundle) {
        this.f11464l = CastDevice.m5962H(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo42000i(@Nullable Bundle bundle) {
        this.f11464l = CastDevice.m5962H(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo42001j(@Nullable Bundle bundle) {
        m16038z(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo42002k(@Nullable Bundle bundle) {
        m16038z(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo42003l(@Nullable Bundle bundle) {
        boolean z;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice H = CastDevice.m5962H(bundle);
        if (H != null && !H.equals(this.f11464l)) {
            if (TextUtils.isEmpty(H.mo31898G()) || ((castDevice2 = this.f11464l) != null && TextUtils.equals(castDevice2.mo31898G(), H.mo31898G()))) {
                z = false;
            } else {
                z = true;
            }
            this.f11464l = H;
            C8675b bVar = f11455p;
            Object[] objArr = new Object[2];
            objArr[0] = H;
            if (true != z) {
                str = "unchanged";
            } else {
                str = "changed";
            }
            objArr[1] = str;
            bVar.mo42754a("update to device (%s) with name %s", objArr);
            if (z && (castDevice = this.f11464l) != null) {
                C8412r rVar = this.f11461i;
                if (rVar != null) {
                    rVar.mo42426l(castDevice);
                }
                for (C7913c.C7918d e : new HashSet(this.f11457e)) {
                    e.mo41677e();
                }
            }
        }
    }

    @Nullable
    @Pure
    /* renamed from: o */
    public CastDevice mo42004o() {
        C9713p.m20270e("Must be called from the main thread.");
        return this.f11464l;
    }

    @Nullable
    /* renamed from: p */
    public C4648h mo42005p() {
        C9713p.m20270e("Must be called from the main thread.");
        return this.f11463k;
    }

    /* renamed from: y */
    public final synchronized void mo42006y(@Nullable C4900f0 f0Var) {
        this.f11466n = f0Var;
    }
}
