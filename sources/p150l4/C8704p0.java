package p150l4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p109h4.C7910b;
import p109h4.C7913c;
import p109h4.C7954o;
import p200q4.C9220c;
import p231t4.C9673d;
import p231t4.C9683g;
import p231t4.C9713p;

/* renamed from: l4.p0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8704p0 extends C9683g {
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public static final C8675b f12460t0 = new C8675b("CastClientImpl");
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public static final Object f12461u0 = new Object();

    /* renamed from: v0 */
    private static final Object f12462v0 = new Object();
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C7910b f12463J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final CastDevice f12464K;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final C7913c.C7918d f12465M;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final Map f12466X = new HashMap();

    /* renamed from: Y */
    private final long f12467Y;

    /* renamed from: Z */
    private final Bundle f12468Z;

    /* renamed from: c0 */
    private C8702o0 f12469c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public String f12470d0;

    /* renamed from: e0 */
    private boolean f12471e0;

    /* renamed from: f0 */
    private boolean f12472f0;

    /* renamed from: g0 */
    private boolean f12473g0;

    /* renamed from: h0 */
    private boolean f12474h0;

    /* renamed from: i0 */
    private double f12475i0;

    /* renamed from: j0 */
    private C7954o f12476j0;

    /* renamed from: k0 */
    private int f12477k0;

    /* renamed from: l0 */
    private int f12478l0;

    /* renamed from: m0 */
    private final AtomicLong f12479m0 = new AtomicLong(0);
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public String f12480n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public String f12481o0;

    /* renamed from: p0 */
    private Bundle f12482p0;

    /* renamed from: q0 */
    private final Map f12483q0 = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C9220c f12484r0;

    /* renamed from: s0 */
    private C9220c f12485s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8704p0(Context context, Looper looper, C9673d dVar, CastDevice castDevice, long j, C7913c.C7918d dVar2, Bundle bundle, C4733c.C4734a aVar, C4733c.C4735b bVar) {
        super(context, looper, 10, dVar, aVar, bVar);
        this.f12464K = castDevice;
        this.f12465M = dVar2;
        this.f12467Y = j;
        this.f12468Z = bundle;
        m17567z0();
        mo42808D0();
    }

    /* renamed from: A0 */
    private final void m17548A0() {
        f12460t0.mo42754a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f12466X) {
            this.f12466X.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m17549B0(long j, int i) {
        C9220c cVar;
        synchronized (this.f12483q0) {
            cVar = (C9220c) this.f12483q0.remove(Long.valueOf(j));
        }
        if (cVar != null) {
            cVar.mo32470a(new Status(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public final void m17550C0(int i) {
        synchronized (f12462v0) {
            C9220c cVar = this.f12485s0;
            if (cVar != null) {
                cVar.mo32470a(new Status(i));
                this.f12485s0 = null;
            }
        }
    }

    /* renamed from: u0 */
    static /* bridge */ /* synthetic */ void m17563u0(C8704p0 p0Var, C8677c cVar) {
        boolean z;
        String A = cVar.mo42763A();
        if (!C8673a.m17455n(A, p0Var.f12470d0)) {
            p0Var.f12470d0 = A;
            z = true;
        } else {
            z = false;
        }
        f12460t0.mo42754a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(p0Var.f12472f0));
        C7913c.C7918d dVar = p0Var.f12465M;
        if (dVar != null && (z || p0Var.f12472f0)) {
            dVar.mo41676d();
        }
        p0Var.f12472f0 = false;
    }

    /* renamed from: v0 */
    static /* bridge */ /* synthetic */ void m17564v0(C8704p0 p0Var, C8681e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C7910b I = eVar.mo42774I();
        if (!C8673a.m17455n(I, p0Var.f12463J)) {
            p0Var.f12463J = I;
            p0Var.f12465M.mo41675c(I);
        }
        double F = eVar.mo42771F();
        if (Double.isNaN(F) || Math.abs(F - p0Var.f12475i0) <= 1.0E-7d) {
            z = false;
        } else {
            p0Var.f12475i0 = F;
            z = true;
        }
        boolean K = eVar.mo42776K();
        if (K != p0Var.f12471e0) {
            p0Var.f12471e0 = K;
            z = true;
        }
        Double.isNaN(eVar.mo42770A());
        C8675b bVar = f12460t0;
        bVar.mo42754a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(p0Var.f12473g0));
        C7913c.C7918d dVar = p0Var.f12465M;
        if (dVar != null && (z || p0Var.f12473g0)) {
            dVar.mo41679g();
        }
        int G = eVar.mo42772G();
        if (G != p0Var.f12477k0) {
            p0Var.f12477k0 = G;
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.mo42754a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(p0Var.f12473g0));
        C7913c.C7918d dVar2 = p0Var.f12465M;
        if (dVar2 != null && (z2 || p0Var.f12473g0)) {
            dVar2.mo41673a(p0Var.f12477k0);
        }
        int H = eVar.mo42773H();
        if (H != p0Var.f12478l0) {
            p0Var.f12478l0 = H;
            z3 = true;
        } else {
            z3 = false;
        }
        bVar.mo42754a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(p0Var.f12473g0));
        C7913c.C7918d dVar3 = p0Var.f12465M;
        if (dVar3 != null && (z3 || p0Var.f12473g0)) {
            dVar3.mo41678f(p0Var.f12478l0);
        }
        if (!C8673a.m17455n(p0Var.f12476j0, eVar.mo42775J())) {
            p0Var.f12476j0 = eVar.mo42775J();
        }
        p0Var.f12473g0 = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public final void m17567z0() {
        this.f12474h0 = false;
        this.f12477k0 = -1;
        this.f12478l0 = -1;
        this.f12463J = null;
        this.f12470d0 = null;
        this.f12475i0 = 0.0d;
        mo42808D0();
        this.f12471e0 = false;
        this.f12476j0 = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Bundle mo41420A() {
        Bundle bundle = new Bundle();
        f12460t0.mo42754a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f12480n0, this.f12481o0);
        this.f12464K.mo31903M(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f12467Y);
        Bundle bundle2 = this.f12468Z;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.f12469c0 = new C8702o0(this);
        bundle.putParcelable("listener", new BinderWrapper(this.f12469c0));
        String str = this.f12480n0;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f12481o0;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public final double mo42808D0() {
        C9713p.m20276k(this.f12464K, "device should not be null");
        if (this.f12464K.mo31902L(2048)) {
            return 0.02d;
        }
        if (!this.f12464K.mo31902L(4) || this.f12464K.mo31902L(1) || "Chromecast Audio".equals(this.f12464K.mo31900J())) {
            return 0.05d;
        }
        return 0.02d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final String mo34953F() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo34954G() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* renamed from: M */
    public final void mo42809M(ConnectionResult connectionResult) {
        super.mo42809M(connectionResult);
        m17548A0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo42810O(int i, IBinder iBinder, Bundle bundle, int i2) {
        f12460t0.mo42754a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.f12474h0 = true;
            this.f12472f0 = true;
            this.f12473g0 = true;
        } else {
            this.f12474h0 = false;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.f12482p0 = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.mo42810O(i, iBinder, bundle, i2);
    }

    /* renamed from: c */
    public final void mo32396c() {
        C8675b bVar = f12460t0;
        bVar.mo42754a("disconnect(); ServiceListener=%s, isConnected=%b", this.f12469c0, Boolean.valueOf(mo44141g()));
        C8702o0 o0Var = this.f12469c0;
        this.f12469c0 = null;
        if (o0Var == null || o0Var.mo42807G() == null) {
            bVar.mo42754a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        m17548A0();
        try {
            ((C8689i) mo44125E()).mo42788f();
        } catch (RemoteException | IllegalStateException e) {
            f12460t0.mo42755b(e, "Error while disconnecting the controller interface", new Object[0]);
        } finally {
            super.mo32396c();
        }
    }

    /* renamed from: k */
    public final int mo34955k() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo34956s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof C8689i) {
            return (C8689i) queryLocalInterface;
        }
        return new C8689i(iBinder);
    }

    /* renamed from: x */
    public final Bundle mo42811x() {
        Bundle bundle = this.f12482p0;
        if (bundle == null) {
            return super.mo42811x();
        }
        this.f12482p0 = null;
        return bundle;
    }

    /* renamed from: y0 */
    public final void mo42812y0(int i) {
        synchronized (f12461u0) {
            C9220c cVar = this.f12484r0;
            if (cVar != null) {
                cVar.mo32470a(new C8692j0(new Status(i), (C7910b) null, (String) null, (String) null, false));
                this.f12484r0 = null;
            }
        }
    }
}
