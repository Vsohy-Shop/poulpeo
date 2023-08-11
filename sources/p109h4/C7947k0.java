package p109h4;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4730b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4746d;
import com.google.android.gms.common.api.internal.C4753g;
import com.google.android.gms.common.api.internal.C4756h;
import com.google.android.gms.internal.cast.C4968j0;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p109h4.C7913c;
import p150l4.C8673a;
import p150l4.C8675b;
import p150l4.C8677c;
import p150l4.C8681e;
import p150l4.C8689i;
import p150l4.C8693k;
import p150l4.C8697m;
import p150l4.C8706q0;
import p231t4.C9662b;
import p231t4.C9713p;
import p276x5.C10406g;

/* renamed from: h4.k0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7947k0 extends C4730b implements C7930f1 {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static final C8675b f11151G = new C8675b("CastClient");

    /* renamed from: H */
    private static final C4719a.C4720a f11152H;

    /* renamed from: I */
    private static final C4719a f11153I;

    /* renamed from: J */
    public static final /* synthetic */ int f11154J = 0;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final CastDevice f11155A;
    @VisibleForTesting

    /* renamed from: B */
    final Map f11156B;
    @VisibleForTesting

    /* renamed from: C */
    final Map f11157C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final C7913c.C7918d f11158D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final List f11159E = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f11160F;
    @VisibleForTesting

    /* renamed from: k */
    final C7944j0 f11161k = new C7944j0(this);

    /* renamed from: l */
    private Handler f11162l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f11163m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f11164n;
    @VisibleForTesting
    @Nullable

    /* renamed from: o */
    C10406g f11165o;
    @VisibleForTesting
    @Nullable

    /* renamed from: p */
    C10406g f11166p;

    /* renamed from: q */
    private final AtomicLong f11167q;

    /* renamed from: r */
    private final Object f11168r = new Object();

    /* renamed from: s */
    private final Object f11169s = new Object();
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: t */
    public C7910b f11170t;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: u */
    public String f11171u;

    /* renamed from: v */
    private double f11172v;

    /* renamed from: w */
    private boolean f11173w;

    /* renamed from: x */
    private int f11174x;

    /* renamed from: y */
    private int f11175y;
    @Nullable

    /* renamed from: z */
    private C7954o f11176z;

    static {
        C7911b0 b0Var = new C7911b0();
        f11152H = b0Var;
        f11153I = new C4719a("Cast.API_CXLESS", b0Var, C8697m.f12441b);
    }

    C7947k0(Context context, C7913c.C7916c cVar) {
        super(context, f11153I, cVar, C4730b.C4731a.f4916c);
        C9713p.m20276k(context, "context cannot be null");
        C9713p.m20276k(cVar, "CastOptions cannot be null");
        this.f11158D = cVar.f11080c;
        this.f11155A = cVar.f11079b;
        this.f11156B = new HashMap();
        this.f11157C = new HashMap();
        this.f11167q = new AtomicLong(0);
        this.f11160F = 1;
        mo41780V();
    }

    /* renamed from: B */
    static /* bridge */ /* synthetic */ void m15636B(C7947k0 k0Var, C8681e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C7910b I = eVar.mo42774I();
        if (!C8673a.m17455n(I, k0Var.f11170t)) {
            k0Var.f11170t = I;
            k0Var.f11158D.mo41675c(I);
        }
        double F = eVar.mo42771F();
        if (Double.isNaN(F) || Math.abs(F - k0Var.f11172v) <= 1.0E-7d) {
            z = false;
        } else {
            k0Var.f11172v = F;
            z = true;
        }
        boolean K = eVar.mo42776K();
        if (K != k0Var.f11173w) {
            k0Var.f11173w = K;
            z = true;
        }
        C8675b bVar = f11151G;
        bVar.mo42754a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(k0Var.f11163m));
        C7913c.C7918d dVar = k0Var.f11158D;
        if (dVar != null && (z || k0Var.f11163m)) {
            dVar.mo41679g();
        }
        Double.isNaN(eVar.mo42770A());
        int G = eVar.mo42772G();
        if (G != k0Var.f11174x) {
            k0Var.f11174x = G;
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.mo42754a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(k0Var.f11163m));
        C7913c.C7918d dVar2 = k0Var.f11158D;
        if (dVar2 != null && (z2 || k0Var.f11163m)) {
            dVar2.mo41673a(k0Var.f11174x);
        }
        int H = eVar.mo42773H();
        if (H != k0Var.f11175y) {
            k0Var.f11175y = H;
            z3 = true;
        } else {
            z3 = false;
        }
        bVar.mo42754a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(k0Var.f11163m));
        C7913c.C7918d dVar3 = k0Var.f11158D;
        if (dVar3 != null && (z3 || k0Var.f11163m)) {
            dVar3.mo41678f(k0Var.f11175y);
        }
        if (!C8673a.m17455n(k0Var.f11176z, eVar.mo42775J())) {
            k0Var.f11176z = eVar.mo42775J();
        }
        k0Var.f11163m = false;
    }

    /* renamed from: E */
    static /* bridge */ /* synthetic */ void m15639E(C7947k0 k0Var, C7913c.C7914a aVar) {
        synchronized (k0Var.f11168r) {
            C10406g gVar = k0Var.f11165o;
            if (gVar != null) {
                gVar.mo45098c(aVar);
            }
            k0Var.f11165o = null;
        }
    }

    /* renamed from: F */
    static /* bridge */ /* synthetic */ void m15640F(C7947k0 k0Var, long j, int i) {
        C10406g gVar;
        synchronized (k0Var.f11156B) {
            Map map = k0Var.f11156B;
            Long valueOf = Long.valueOf(j);
            gVar = (C10406g) map.get(valueOf);
            k0Var.f11156B.remove(valueOf);
        }
        if (gVar == null) {
            return;
        }
        if (i == 0) {
            gVar.mo45098c(null);
        } else {
            gVar.mo45097b(m15643O(i));
        }
    }

    /* renamed from: G */
    static /* bridge */ /* synthetic */ void m15641G(C7947k0 k0Var, int i) {
        synchronized (k0Var.f11169s) {
            C10406g gVar = k0Var.f11166p;
            if (gVar != null) {
                if (i == 0) {
                    gVar.mo45098c(new Status(0));
                } else {
                    gVar.mo45097b(m15643O(i));
                }
                k0Var.f11166p = null;
            }
        }
    }

    /* renamed from: O */
    private static ApiException m15643O(int i) {
        return C9662b.m20102a(new Status(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final Task m15644P(C8693k kVar) {
        return mo32413m((C4746d.C4747a) C9713p.m20276k(mo32421u(kVar, "castDeviceControllerListenerKey").mo32496b(), "Key must not be null"), 8415);
    }

    /* renamed from: Q */
    private final void m15645Q() {
        C9713p.m20279n(mo41707z(), "Not connected to device");
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final void m15646R() {
        f11151G.mo42754a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f11157C) {
            this.f11157C.clear();
        }
    }

    /* renamed from: S */
    private final void m15647S(C10406g gVar) {
        synchronized (this.f11168r) {
            if (this.f11165o != null) {
                m15648T(2477);
            }
            this.f11165o = gVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public final void m15648T(int i) {
        synchronized (this.f11168r) {
            C10406g gVar = this.f11165o;
            if (gVar != null) {
                gVar.mo45097b(m15643O(i));
            }
            this.f11165o = null;
        }
    }

    /* renamed from: U */
    private final void m15649U() {
        boolean z = true;
        if (this.f11160F == 1) {
            z = false;
        }
        C9713p.m20279n(z, "Not active connection");
    }

    /* renamed from: W */
    static /* bridge */ /* synthetic */ Handler m15650W(C7947k0 k0Var) {
        if (k0Var.f11162l == null) {
            k0Var.f11162l = new C4968j0(k0Var.mo32420t());
        }
        return k0Var.f11162l;
    }

    /* renamed from: g0 */
    static /* bridge */ /* synthetic */ void m15660g0(C7947k0 k0Var) {
        k0Var.f11174x = -1;
        k0Var.f11175y = -1;
        k0Var.f11170t = null;
        k0Var.f11171u = null;
        k0Var.f11172v = 0.0d;
        k0Var.mo41780V();
        k0Var.f11173w = false;
        k0Var.f11176z = null;
    }

    /* renamed from: h0 */
    static /* bridge */ /* synthetic */ void m15661h0(C7947k0 k0Var, C8677c cVar) {
        boolean z;
        String A = cVar.mo42763A();
        if (!C8673a.m17455n(A, k0Var.f11171u)) {
            k0Var.f11171u = A;
            z = true;
        } else {
            z = false;
        }
        f11151G.mo42754a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(k0Var.f11164n));
        C7913c.C7918d dVar = k0Var.f11158D;
        if (dVar != null && (z || k0Var.f11164n)) {
            dVar.mo41676d();
        }
        k0Var.f11164n = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final /* synthetic */ void mo41774H(String str, String str2, C7949l0 l0Var, C8706q0 q0Var, C10406g gVar) {
        m15645Q();
        ((C8689i) q0Var.mo44125E()).mo42786d3(str, str2, (C7949l0) null);
        m15647S(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ void mo41775I(String str, C7928f fVar, C8706q0 q0Var, C10406g gVar) {
        m15645Q();
        ((C8689i) q0Var.mo44125E()).mo42787e3(str, fVar);
        m15647S(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo41776J(C7913c.C7919e eVar, String str, C8706q0 q0Var, C10406g gVar) {
        m15649U();
        if (eVar != null) {
            ((C8689i) q0Var.mo44125E()).mo42794j3(str);
        }
        gVar.mo45098c(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo41777K(String str, String str2, String str3, C8706q0 q0Var, C10406g gVar) {
        long incrementAndGet = this.f11167q.incrementAndGet();
        m15645Q();
        try {
            this.f11156B.put(Long.valueOf(incrementAndGet), gVar);
            ((C8689i) q0Var.mo44125E()).mo42791h3(str2, str3, incrementAndGet);
        } catch (RemoteException e) {
            this.f11156B.remove(Long.valueOf(incrementAndGet));
            gVar.mo45097b(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo41778L(String str, C7913c.C7919e eVar, C8706q0 q0Var, C10406g gVar) {
        m15649U();
        ((C8689i) q0Var.mo44125E()).mo42794j3(str);
        if (eVar != null) {
            ((C8689i) q0Var.mo44125E()).mo42790g3(str);
        }
        gVar.mo45098c(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo41779M(String str, C8706q0 q0Var, C10406g gVar) {
        m15645Q();
        ((C8689i) q0Var.mo44125E()).mo42792i3(str);
        synchronized (this.f11169s) {
            if (this.f11166p != null) {
                gVar.mo45097b(m15643O(2001));
            } else {
                this.f11166p = gVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @RequiresNonNull({"device"})
    /* renamed from: V */
    public final double mo41780V() {
        if (this.f11155A.mo31902L(2048)) {
            return 0.02d;
        }
        if (!this.f11155A.mo31902L(4) || this.f11155A.mo31902L(1) || "Chromecast Audio".equals(this.f11155A.mo31900J())) {
            return 0.05d;
        }
        return 0.02d;
    }

    /* renamed from: a */
    public final Task mo41701a(String str, C7913c.C7919e eVar) {
        C8673a.m17447f(str);
        if (eVar != null) {
            synchronized (this.f11157C) {
                this.f11157C.put(str, eVar);
            }
        }
        return mo32415o(C4756h.m6576a().mo32518b(new C7908a0(this, str, eVar)).mo32521e(8413).mo32517a());
    }

    /* renamed from: b */
    public final Task mo41702b(String str, String str2) {
        C8673a.m17447f(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        } else if (str2.length() <= 524288) {
            return mo32415o(C4756h.m6576a().mo32518b(new C7966u(this, (String) null, str, str2)).mo32521e(8405).mo32517a());
        } else {
            f11151G.mo42759f("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
    }

    /* renamed from: c */
    public final Task mo41703c(String str) {
        C7913c.C7919e eVar;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f11157C) {
                eVar = (C7913c.C7919e) this.f11157C.remove(str);
            }
            return mo32415o(C4756h.m6576a().mo32518b(new C7976z(this, eVar, str)).mo32521e(8414).mo32517a());
        }
        throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }

    /* renamed from: d */
    public final void mo41704d(C7927e1 e1Var) {
        C9713p.m20275j(e1Var);
        this.f11159E.add(e1Var);
    }

    /* renamed from: e */
    public final Task mo41705e() {
        C4746d u = mo32421u(this.f11161k, "castDeviceControllerListenerKey");
        C4753g.C4754a a = C4753g.m6561a();
        C7960r rVar = new C7960r(this);
        return mo32412l(a.mo32513f(u).mo32509b(rVar).mo32512e(C7970w.f11209a).mo32510c(C7958q.f11184b).mo32511d(8428).mo32508a());
    }

    /* renamed from: f */
    public final Task mo41706f() {
        Task o = mo32415o(C4756h.m6576a().mo32518b(C7972x.f11210a).mo32521e(8403).mo32517a());
        m15646R();
        m15644P(this.f11161k);
        return o;
    }

    /* renamed from: z */
    public final boolean mo41707z() {
        if (this.f11160F == 2) {
            return true;
        }
        return false;
    }
}
