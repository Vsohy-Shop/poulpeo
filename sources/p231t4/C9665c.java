package p231t4;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C4718a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p180o4.C8974c;

/* renamed from: t4.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C9665c<T extends IInterface> {
    @NonNull

    /* renamed from: E */
    public static final String[] f14379E = {"service_esmobile", "service_googleme"};

    /* renamed from: F */
    private static final C8974c[] f14380F = new C8974c[0];
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: A */
    public ConnectionResult f14381A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f14382B;
    @Nullable

    /* renamed from: C */
    private volatile C9688h1 f14383C;
    @NonNull

    /* renamed from: D */
    protected AtomicInteger f14384D;

    /* renamed from: b */
    private int f14385b;

    /* renamed from: c */
    private long f14386c;

    /* renamed from: d */
    private long f14387d;

    /* renamed from: e */
    private int f14388e;

    /* renamed from: f */
    private long f14389f;
    @Nullable

    /* renamed from: g */
    private volatile String f14390g;

    /* renamed from: h */
    C9724s1 f14391h;

    /* renamed from: i */
    private final Context f14392i;

    /* renamed from: j */
    private final Looper f14393j;

    /* renamed from: k */
    private final C9686h f14394k;

    /* renamed from: l */
    private final C4718a f14395l;

    /* renamed from: m */
    final Handler f14396m;

    /* renamed from: n */
    private final Object f14397n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Object f14398o;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: p */
    public C9699l f14399p;
    @NonNull

    /* renamed from: q */
    protected C9668c f14400q;
    @Nullable

    /* renamed from: r */
    private T f14401r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final ArrayList<C9664b1<?>> f14402s;
    @Nullable

    /* renamed from: t */
    private C9676d1 f14403t;

    /* renamed from: u */
    private int f14404u;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: v */
    public final C9666a f14405v;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: w */
    public final C9667b f14406w;

    /* renamed from: x */
    private final int f14407x;
    @Nullable

    /* renamed from: y */
    private final String f14408y;
    @Nullable

    /* renamed from: z */
    private volatile String f14409z;

    /* renamed from: t4.c$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C9666a {
        /* renamed from: E */
        void mo34794E(int i);

        /* renamed from: J */
        void mo34796J(@Nullable Bundle bundle);
    }

    /* renamed from: t4.c$b */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C9667b {
        /* renamed from: G */
        void mo34795G(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: t4.c$c */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C9668c {
        /* renamed from: a */
        void mo32571a(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: t4.c$d */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    protected class C9669d implements C9668c {
        public C9669d() {
        }

        /* renamed from: a */
        public final void mo32571a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.mo32338I()) {
                C9665c cVar = C9665c.this;
                cVar.mo44147n((C9692j) null, cVar.mo44124D());
            } else if (C9665c.this.f14406w != null) {
                C9665c.this.f14406w.mo34795G(connectionResult);
            }
        }
    }

    /* renamed from: t4.c$e */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C9670e {
        /* renamed from: a */
        void mo32545a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C9665c(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, int r12, @androidx.annotation.Nullable p231t4.C9665c.C9666a r13, @androidx.annotation.Nullable p231t4.C9665c.C9667b r14, @androidx.annotation.Nullable java.lang.String r15) {
        /*
            r9 = this;
            t4.h r3 = p231t4.C9686h.m20228b(r10)
            com.google.android.gms.common.a r4 = com.google.android.gms.common.C4718a.m6394f()
            p231t4.C9713p.m20275j(r13)
            p231t4.C9713p.m20275j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p231t4.C9665c.<init>(android.content.Context, android.os.Looper, int, t4.c$a, t4.c$b, java.lang.String):void");
    }

    /* renamed from: d0 */
    static /* bridge */ /* synthetic */ void m20125d0(C9665c cVar, C9688h1 h1Var) {
        C9719r rVar;
        cVar.f14383C = h1Var;
        if (cVar.mo42094T()) {
            C9677e eVar = h1Var.f14473e;
            C9716q b = C9716q.m20289b();
            if (eVar == null) {
                rVar = null;
            } else {
                rVar = eVar.mo44182J();
            }
            b.mo44239c(rVar);
        }
    }

    /* renamed from: e0 */
    static /* bridge */ /* synthetic */ void m20126e0(C9665c cVar, int i) {
        int i2;
        int i3;
        synchronized (cVar.f14397n) {
            i2 = cVar.f14404u;
        }
        if (i2 == 3) {
            cVar.f14382B = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = cVar.f14396m;
        handler.sendMessage(handler.obtainMessage(i3, cVar.f14384D.get(), 16));
    }

    /* renamed from: h0 */
    static /* bridge */ /* synthetic */ boolean m20128h0(C9665c cVar, int i, int i2, IInterface iInterface) {
        synchronized (cVar.f14397n) {
            if (cVar.f14404u != i) {
                return false;
            }
            cVar.m20130j0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: i0 */
    static /* bridge */ /* synthetic */ boolean m20129i0(C9665c cVar) {
        if (cVar.f14382B || TextUtils.isEmpty(cVar.mo34953F()) || TextUtils.isEmpty(cVar.mo44122B())) {
            return false;
        }
        try {
            Class.forName(cVar.mo34953F());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m20130j0(int i, @Nullable T t) {
        boolean z;
        boolean z2;
        C9724s1 s1Var;
        String str;
        C9724s1 s1Var2;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (t == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        C9713p.m20266a(z3);
        synchronized (this.f14397n) {
            this.f14404u = i;
            this.f14401r = t;
            if (i == 1) {
                C9676d1 d1Var = this.f14403t;
                if (d1Var != null) {
                    C9686h hVar = this.f14394k;
                    String c = this.f14391h.mo44251c();
                    C9713p.m20275j(c);
                    hVar.mo44192e(c, this.f14391h.mo44250b(), this.f14391h.mo44249a(), d1Var, mo44136Y(), this.f14391h.mo44252d());
                    this.f14403t = null;
                }
            } else if (i == 2 || i == 3) {
                C9676d1 d1Var2 = this.f14403t;
                if (!(d1Var2 == null || (s1Var2 = this.f14391h) == null)) {
                    String c2 = s1Var2.mo44251c();
                    String b = s1Var2.mo44250b();
                    StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(b).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(c2);
                    sb.append(" on ");
                    sb.append(b);
                    Log.e("GmsClient", sb.toString());
                    C9686h hVar2 = this.f14394k;
                    String c3 = this.f14391h.mo44251c();
                    C9713p.m20275j(c3);
                    hVar2.mo44192e(c3, this.f14391h.mo44250b(), this.f14391h.mo44249a(), d1Var2, mo44136Y(), this.f14391h.mo44252d());
                    this.f14384D.incrementAndGet();
                }
                C9676d1 d1Var3 = new C9676d1(this, this.f14384D.get());
                this.f14403t = d1Var3;
                if (this.f14404u != 3 || mo44122B() == null) {
                    s1Var = new C9724s1(mo44126H(), mo34954G(), false, C9686h.m20227a(), mo44128J());
                } else {
                    s1Var = new C9724s1(mo44153y().getPackageName(), mo44122B(), true, C9686h.m20227a(), false);
                }
                this.f14391h = s1Var;
                if (!s1Var.mo44252d() || mo34955k() >= 17895000) {
                    C9686h hVar3 = this.f14394k;
                    String c4 = this.f14391h.mo44251c();
                    C9713p.m20275j(c4);
                    String b2 = this.f14391h.mo44250b();
                    int a = this.f14391h.mo44249a();
                    if (!hVar3.mo44193f(new C9701l1(c4, b2, a, this.f14391h.mo44252d()), d1Var3, mo44136Y(), mo44152w())) {
                        String c5 = this.f14391h.mo44251c();
                        String b3 = this.f14391h.mo44250b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c5).length() + 34 + String.valueOf(b3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c5);
                        sb2.append(" on ");
                        sb2.append(b3);
                        Log.w("GmsClient", sb2.toString());
                        mo44140f0(16, (Bundle) null, this.f14384D.get());
                    }
                } else {
                    String valueOf = String.valueOf(this.f14391h.mo44251c());
                    if (valueOf.length() != 0) {
                        str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf);
                    } else {
                        str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                    }
                    throw new IllegalStateException(str);
                }
            } else if (i == 4) {
                C9713p.m20275j(t);
                mo44130L(t);
            }
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: A */
    public Bundle mo41420A() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: B */
    public String mo44122B() {
        return null;
    }

    @NonNull
    /* renamed from: C */
    public final Looper mo44123C() {
        return this.f14393j;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: D */
    public Set<Scope> mo44124D() {
        return Collections.emptySet();
    }

    @NonNull
    /* renamed from: E */
    public final T mo44125E() {
        T t;
        synchronized (this.f14397n) {
            if (this.f14404u != 5) {
                mo44149r();
                t = this.f14401r;
                C9713p.m20276k(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: F */
    public abstract String mo34953F();

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: G */
    public abstract String mo34954G();

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: H */
    public String mo44126H() {
        return "com.google.android.gms";
    }

    @Nullable
    /* renamed from: I */
    public C9677e mo44127I() {
        C9688h1 h1Var = this.f14383C;
        if (h1Var == null) {
            return null;
        }
        return h1Var.f14473e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo44128J() {
        if (mo34955k() >= 211700000) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public boolean mo44129K() {
        if (this.f14383C != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: L */
    public void mo44130L(@NonNull T t) {
        this.f14387d = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: M */
    public void mo42809M(@NonNull ConnectionResult connectionResult) {
        this.f14388e = connectionResult.mo32334A();
        this.f14389f = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: N */
    public void mo44131N(int i) {
        this.f14385b = i;
        this.f14386c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo42810O(int i, @Nullable IBinder iBinder, @Nullable Bundle bundle, int i2) {
        Handler handler = this.f14396m;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C9679e1(this, i, iBinder, bundle)));
    }

    /* renamed from: P */
    public boolean mo44132P() {
        return false;
    }

    /* renamed from: Q */
    public void mo44133Q(@NonNull String str) {
        this.f14409z = str;
    }

    /* renamed from: R */
    public void mo44134R(int i) {
        Handler handler = this.f14396m;
        handler.sendMessage(handler.obtainMessage(6, this.f14384D.get(), i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo44135S(@NonNull C9668c cVar, int i, @Nullable PendingIntent pendingIntent) {
        C9713p.m20276k(cVar, "Connection progress callbacks cannot be null.");
        this.f14400q = cVar;
        Handler handler = this.f14396m;
        handler.sendMessage(handler.obtainMessage(3, this.f14384D.get(), i, pendingIntent));
    }

    /* renamed from: T */
    public boolean mo42094T() {
        return false;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: Y */
    public final String mo44136Y() {
        String str = this.f14408y;
        if (str == null) {
            return this.f14392i.getClass().getName();
        }
        return str;
    }

    /* renamed from: b */
    public void mo44137b(@NonNull String str) {
        this.f14390g = str;
        mo32396c();
    }

    /* renamed from: c */
    public void mo32396c() {
        this.f14384D.incrementAndGet();
        synchronized (this.f14402s) {
            int size = this.f14402s.size();
            for (int i = 0; i < size; i++) {
                this.f14402s.get(i).mo44120d();
            }
            this.f14402s.clear();
        }
        synchronized (this.f14398o) {
            this.f14399p = null;
        }
        m20130j0(1, (IInterface) null);
    }

    /* renamed from: d */
    public boolean mo44138d() {
        boolean z;
        synchronized (this.f14397n) {
            int i = this.f14404u;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    @NonNull
    /* renamed from: e */
    public String mo44139e() {
        C9724s1 s1Var;
        if (mo44141g() && (s1Var = this.f14391h) != null) {
            return s1Var.mo44250b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public final void mo44140f0(int i, @Nullable Bundle bundle, int i2) {
        Handler handler = this.f14396m;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C9682f1(this, i, (Bundle) null)));
    }

    /* renamed from: g */
    public boolean mo44141g() {
        boolean z;
        synchronized (this.f14397n) {
            if (this.f14404u == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: h */
    public void mo44142h(@NonNull C9668c cVar) {
        C9713p.m20276k(cVar, "Connection progress callbacks cannot be null.");
        this.f14400q = cVar;
        m20130j0(2, (IInterface) null);
    }

    /* renamed from: i */
    public void mo44143i(@NonNull C9670e eVar) {
        eVar.mo32545a();
    }

    /* renamed from: j */
    public boolean mo44144j() {
        return true;
    }

    /* renamed from: k */
    public int mo34955k() {
        return C4718a.f4882a;
    }

    @Nullable
    /* renamed from: l */
    public final C8974c[] mo44145l() {
        C9688h1 h1Var = this.f14383C;
        if (h1Var == null) {
            return null;
        }
        return h1Var.f14471c;
    }

    @Nullable
    /* renamed from: m */
    public String mo44146m() {
        return this.f14390g;
    }

    @WorkerThread
    /* renamed from: n */
    public void mo44147n(@Nullable C9692j jVar, @NonNull Set<Scope> set) {
        Bundle A = mo41420A();
        C9680f fVar = new C9680f(this.f14407x, this.f14409z);
        fVar.f14446e = this.f14392i.getPackageName();
        fVar.f14449h = A;
        if (set != null) {
            fVar.f14448g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo32407o()) {
            Account u = mo44151u();
            if (u == null) {
                u = new Account("<<default account>>", "com.google");
            }
            fVar.f14450i = u;
            if (jVar != null) {
                fVar.f14447f = jVar.asBinder();
            }
        } else if (mo44132P()) {
            fVar.f14450i = mo44151u();
        }
        fVar.f14451j = f14380F;
        fVar.f14452k = mo42784v();
        if (mo42094T()) {
            fVar.f14455n = true;
        }
        try {
            synchronized (this.f14398o) {
                C9699l lVar = this.f14399p;
                if (lVar != null) {
                    lVar.mo44207m2(new C9672c1(this, this.f14384D.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo44134R(3);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo42810O(8, (IBinder) null, (Bundle) null, this.f14384D.get());
        }
    }

    /* renamed from: o */
    public boolean mo32407o() {
        return false;
    }

    /* renamed from: q */
    public void mo44148q() {
        int h = this.f14395l.mo32347h(this.f14392i, mo34955k());
        if (h != 0) {
            m20130j0(1, (IInterface) null);
            mo44135S(new C9669d(), h, (PendingIntent) null);
            return;
        }
        mo44142h(new C9669d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo44149r() {
        if (!mo44141g()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: s */
    public abstract T mo34956s(@NonNull IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo44150t() {
        return false;
    }

    @Nullable
    /* renamed from: u */
    public Account mo44151u() {
        return null;
    }

    @NonNull
    /* renamed from: v */
    public C8974c[] mo42784v() {
        return f14380F;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: w */
    public Executor mo44152w() {
        return null;
    }

    @Nullable
    /* renamed from: x */
    public Bundle mo42811x() {
        return null;
    }

    @NonNull
    /* renamed from: y */
    public final Context mo44153y() {
        return this.f14392i;
    }

    /* renamed from: z */
    public int mo44154z() {
        return this.f14407x;
    }

    protected C9665c(@NonNull Context context, @NonNull Looper looper, @NonNull C9686h hVar, @NonNull C4718a aVar, int i, @Nullable C9666a aVar2, @Nullable C9667b bVar, @Nullable String str) {
        this.f14390g = null;
        this.f14397n = new Object();
        this.f14398o = new Object();
        this.f14402s = new ArrayList<>();
        this.f14404u = 1;
        this.f14381A = null;
        this.f14382B = false;
        this.f14383C = null;
        this.f14384D = new AtomicInteger(0);
        C9713p.m20276k(context, "Context must not be null");
        this.f14392i = context;
        C9713p.m20276k(looper, "Looper must not be null");
        this.f14393j = looper;
        C9713p.m20276k(hVar, "Supervisor must not be null");
        this.f14394k = hVar;
        C9713p.m20276k(aVar, "API availability must not be null");
        this.f14395l = aVar;
        this.f14396m = new C9661a1(this, looper);
        this.f14407x = i;
        this.f14405v = aVar2;
        this.f14406w = bVar;
        this.f14408y = str;
    }
}
