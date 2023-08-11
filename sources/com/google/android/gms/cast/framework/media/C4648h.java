package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.C4627d;
import com.google.android.gms.cast.C4689g;
import com.google.android.gms.cast.C4692h;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.internal.zzaq;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.C4968j0;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.json.JSONObject;
import p109h4.C7913c;
import p109h4.C7930f1;
import p109h4.C7935h;
import p109h4.C7939i;
import p150l4.C8675b;
import p150l4.C8709s;
import p190p4.C9052b;
import p190p4.C9056e;
import p231t4.C9713p;
import p276x5.C10406g;
import p276x5.C10410i;

/* renamed from: com.google.android.gms.cast.framework.media.h */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C4648h implements C7913c.C7919e {
    @NonNull

    /* renamed from: l */
    public static final String f4727l = C8709s.f12493E;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C8675b f4728m = new C8675b("RemoteMediaClient");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f4729a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f4730b = new C4968j0(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8709s f4731c;

    /* renamed from: d */
    private final C4683w f4732d;
    @NotOnlyInitialized

    /* renamed from: e */
    private final C4639d f4733e;
    @Nullable

    /* renamed from: f */
    private C7930f1 f4734f;

    /* renamed from: g */
    private C10406g f4735g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final List f4736h = new CopyOnWriteArrayList();

    /* renamed from: i */
    final List f4737i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final Map f4738j = new ConcurrentHashMap();

    /* renamed from: k */
    private final Map f4739k = new ConcurrentHashMap();

    @Deprecated
    /* renamed from: com.google.android.gms.cast.framework.media.h$b */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
    public interface C4650b {
        /* renamed from: a */
        void mo32201a();

        /* renamed from: b */
        void mo32202b();

        /* renamed from: c */
        void mo32203c();

        /* renamed from: d */
        void mo32204d();

        /* renamed from: e */
        void mo32205e();

        /* renamed from: f */
        void mo32206f();
    }

    /* renamed from: com.google.android.gms.cast.framework.media.h$c */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
    public interface C4651c extends C9056e {
    }

    /* renamed from: com.google.android.gms.cast.framework.media.h$d */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
    public interface C4652d {
    }

    /* renamed from: com.google.android.gms.cast.framework.media.h$e */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
    public interface C4653e {
        /* renamed from: a */
        void mo32207a(long j, long j2);
    }

    public C4648h(C8709s sVar) {
        C4683w wVar = new C4683w(this);
        this.f4732d = wVar;
        C8709s sVar2 = (C8709s) C9713p.m20275j(sVar);
        this.f4731c = sVar2;
        sVar2.mo42829t(new C4643e0(this, (C4641d0) null));
        sVar2.mo42799e(wVar);
        this.f4733e = new C4639d(this, 20, 20);
    }

    @NonNull
    /* renamed from: H */
    public static C9052b m6189H(int i, @Nullable String str) {
        C4687y yVar = new C4687y();
        yVar.mo32442j(new C4686x(yVar, new Status(i, str)));
        return yVar;
    }

    /* renamed from: N */
    static /* bridge */ /* synthetic */ void m6192N(C4648h hVar) {
        for (C4645f0 f0Var : hVar.f4739k.values()) {
            if (hVar.mo32170j() && !f0Var.mo32111d()) {
                f0Var.mo32109b();
            } else if (!hVar.mo32170j() && f0Var.mo32111d()) {
                f0Var.mo32110c();
            }
            if (f0Var.mo32111d() && (hVar.mo32171k() || hVar.mo32160U() || hVar.mo32174n() || hVar.mo32173m())) {
                hVar.m6194W(f0Var.f4686a);
            }
        }
    }

    /* renamed from: V */
    private final void m6193V() {
        if (this.f4735g != null) {
            f4728m.mo42754a("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
            MediaInfo e = mo32165e();
            C4692h f = mo32166f();
            C7939i iVar = null;
            if (!(e == null || f == null)) {
                C4627d.C4628a aVar = new C4627d.C4628a();
                aVar.mo31999j(e);
                aVar.mo31997h(mo32162b());
                aVar.mo32001l(f.mo32267R());
                aVar.mo32000k(f.mo32264O());
                aVar.mo31991b(f.mo32254A());
                aVar.mo31998i(f.mo32257H());
                C4627d a = aVar.mo31990a();
                C7939i.C7940a aVar2 = new C7939i.C7940a();
                aVar2.mo41735b(a);
                iVar = aVar2.mo41734a();
            }
            if (iVar != null) {
                this.f4735g.mo45098c(iVar);
            } else {
                this.f4735g.mo45097b(new zzaq());
            }
        }
    }

    /* renamed from: W */
    private final void m6194W(Set set) {
        MediaInfo I;
        HashSet<C4653e> hashSet = new HashSet<>(set);
        if (mo32175o() || mo32174n() || mo32171k() || mo32160U()) {
            for (C4653e a : hashSet) {
                a.mo32207a(mo32162b(), mo32169i());
            }
        } else if (mo32173m()) {
            C4689g d = mo32164d();
            if (d != null && (I = d.mo32244I()) != null) {
                for (C4653e a2 : hashSet) {
                    a2.mo32207a(0, I.mo31927P());
                }
            }
        } else {
            for (C4653e a3 : hashSet) {
                a3.mo32207a(0, 0);
            }
        }
    }

    /* renamed from: X */
    private final boolean m6195X() {
        if (this.f4734f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private static final C4636b0 m6196Y(C4636b0 b0Var) {
        try {
            b0Var.mo32078r();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            b0Var.mo32442j(new C4634a0(b0Var, new Status(2100)));
        }
        return b0Var;
    }

    @NonNull
    /* renamed from: A */
    public C9052b<C4651c> mo32148A(@NonNull C7935h hVar) {
        C9713p.m20270e("Must be called from the main thread.");
        if (!m6195X()) {
            return m6189H(17, (String) null);
        }
        C4679u uVar = new C4679u(this, hVar);
        m6196Y(uVar);
        return uVar;
    }

    /* renamed from: B */
    public void mo32149B() {
        C9713p.m20270e("Must be called from the main thread.");
        int h = mo32168h();
        if (h == 4 || h == 2) {
            mo32177q();
        } else {
            mo32179s();
        }
    }

    /* renamed from: C */
    public void mo32150C(@NonNull C4649a aVar) {
        C9713p.m20270e("Must be called from the main thread.");
        if (aVar != null) {
            this.f4737i.remove(aVar);
        }
    }

    @NonNull
    /* renamed from: I */
    public final C9052b mo32151I() {
        C9713p.m20270e("Must be called from the main thread.");
        if (!m6195X()) {
            return m6189H(17, (String) null);
        }
        C4669p pVar = new C4669p(this, true);
        m6196Y(pVar);
        return pVar;
    }

    @NonNull
    /* renamed from: J */
    public final C9052b mo32152J(@NonNull int[] iArr) {
        C9713p.m20270e("Must be called from the main thread.");
        if (!m6195X()) {
            return m6189H(17, (String) null);
        }
        C4671q qVar = new C4671q(this, true, iArr);
        m6196Y(qVar);
        return qVar;
    }

    @NonNull
    /* renamed from: K */
    public final Task mo32153K(@Nullable JSONObject jSONObject) {
        C9713p.m20270e("Must be called from the main thread.");
        if (!m6195X()) {
            return C10410i.m21830d(new zzaq());
        }
        this.f4735g = new C10406g();
        C4692h f = mo32166f();
        if (f == null || !f.mo32274Y(262144)) {
            m6193V();
        } else {
            this.f4731c.mo42826o((JSONObject) null).mo35456g(new C4659k(this)).mo35454e(new C4661l(this));
        }
        return this.f4735g.mo45096a();
    }

    /* renamed from: O */
    public final void mo32154O() {
        C7930f1 f1Var = this.f4734f;
        if (f1Var != null) {
            f1Var.mo41701a(mo32167g(), this);
            mo32184x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final /* synthetic */ void mo32155P(C7939i iVar) {
        this.f4735g.mo45098c(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final /* synthetic */ void mo32156Q(Exception exc) {
        f4728m.mo42754a("Fail to store SessionState from receiver, use cached one", new Object[0]);
        m6193V();
    }

    /* renamed from: R */
    public final void mo32157R(@Nullable C7930f1 f1Var) {
        C7930f1 f1Var2 = this.f4734f;
        if (f1Var2 != f1Var) {
            if (f1Var2 != null) {
                this.f4731c.mo42797c();
                this.f4733e.mo32081l();
                f1Var2.mo41703c(mo32167g());
                this.f4732d.mo32225b((C7930f1) null);
                this.f4730b.removeCallbacksAndMessages((Object) null);
            }
            this.f4734f = f1Var;
            if (f1Var != null) {
                this.f4732d.mo32225b(f1Var);
            }
        }
    }

    /* renamed from: S */
    public final boolean mo32158S() {
        Integer J;
        if (!mo32170j()) {
            return false;
        }
        C4692h hVar = (C4692h) C9713p.m20275j(mo32166f());
        if (hVar.mo32274Y(64)) {
            return true;
        }
        if (hVar.mo32270U() != 0 || ((J = hVar.mo32259J(hVar.mo32256G())) != null && J.intValue() < hVar.mo32269T() - 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final boolean mo32159T() {
        Integer J;
        if (!mo32170j()) {
            return false;
        }
        C4692h hVar = (C4692h) C9713p.m20275j(mo32166f());
        if (hVar.mo32274Y(128)) {
            return true;
        }
        if (hVar.mo32270U() != 0 || ((J = hVar.mo32259J(hVar.mo32256G())) != null && J.intValue() > 0)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean mo32160U() {
        C9713p.m20270e("Must be called from the main thread.");
        C4692h f = mo32166f();
        if (f == null || f.mo32265P() != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo32161a(@NonNull CastDevice castDevice, @NonNull String str, @NonNull String str2) {
        this.f4731c.mo42827r(str2);
    }

    /* renamed from: b */
    public long mo32162b() {
        long G;
        synchronized (this.f4729a) {
            C9713p.m20270e("Must be called from the main thread.");
            G = this.f4731c.mo42814G();
        }
        return G;
    }

    /* renamed from: c */
    public int mo32163c() {
        int i;
        synchronized (this.f4729a) {
            C9713p.m20270e("Must be called from the main thread.");
            C4692h f = mo32166f();
            if (f != null) {
                i = f.mo32258I();
            } else {
                i = 0;
            }
        }
        return i;
    }

    @Nullable
    /* renamed from: d */
    public C4689g mo32164d() {
        C9713p.m20270e("Must be called from the main thread.");
        C4692h f = mo32166f();
        if (f == null) {
            return null;
        }
        return f.mo32268S(f.mo32262M());
    }

    @Nullable
    /* renamed from: e */
    public MediaInfo mo32165e() {
        MediaInfo l;
        synchronized (this.f4729a) {
            C9713p.m20270e("Must be called from the main thread.");
            l = this.f4731c.mo42824l();
        }
        return l;
    }

    @Nullable
    /* renamed from: f */
    public C4692h mo32166f() {
        C4692h m;
        synchronized (this.f4729a) {
            C9713p.m20270e("Must be called from the main thread.");
            m = this.f4731c.mo42825m();
        }
        return m;
    }

    @NonNull
    /* renamed from: g */
    public String mo32167g() {
        C9713p.m20270e("Must be called from the main thread.");
        return this.f4731c.mo42796b();
    }

    /* renamed from: h */
    public int mo32168h() {
        int i;
        synchronized (this.f4729a) {
            C9713p.m20270e("Must be called from the main thread.");
            C4692h f = mo32166f();
            if (f != null) {
                i = f.mo32265P();
            } else {
                i = 1;
            }
        }
        return i;
    }

    /* renamed from: i */
    public long mo32169i() {
        long I;
        synchronized (this.f4729a) {
            C9713p.m20270e("Must be called from the main thread.");
            I = this.f4731c.mo42816I();
        }
        return I;
    }

    /* renamed from: j */
    public boolean mo32170j() {
        C9713p.m20270e("Must be called from the main thread.");
        if (mo32171k() || mo32160U() || mo32175o() || mo32174n() || mo32173m()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo32171k() {
        C9713p.m20270e("Must be called from the main thread.");
        C4692h f = mo32166f();
        if (f == null || f.mo32265P() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo32172l() {
        C9713p.m20270e("Must be called from the main thread.");
        MediaInfo e = mo32165e();
        if (e == null || e.mo31928Q() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo32173m() {
        C9713p.m20270e("Must be called from the main thread.");
        C4692h f = mo32166f();
        if (f == null || f.mo32262M() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo32174n() {
        C9713p.m20270e("Must be called from the main thread.");
        C4692h f = mo32166f();
        if (f == null) {
            return false;
        }
        if (f.mo32265P() == 3) {
            return true;
        }
        if (!mo32172l() || mo32163c() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public boolean mo32175o() {
        C9713p.m20270e("Must be called from the main thread.");
        C4692h f = mo32166f();
        if (f == null || f.mo32265P() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo32176p() {
        C9713p.m20270e("Must be called from the main thread.");
        C4692h f = mo32166f();
        if (f == null || !f.mo32276a0()) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: q */
    public C9052b<C4651c> mo32177q() {
        return mo32178r((JSONObject) null);
    }

    @NonNull
    /* renamed from: r */
    public C9052b<C4651c> mo32178r(@Nullable JSONObject jSONObject) {
        C9713p.m20270e("Must be called from the main thread.");
        if (!m6195X()) {
            return m6189H(17, (String) null);
        }
        C4673r rVar = new C4673r(this, jSONObject);
        m6196Y(rVar);
        return rVar;
    }

    @NonNull
    /* renamed from: s */
    public C9052b<C4651c> mo32179s() {
        return mo32180t((JSONObject) null);
    }

    @NonNull
    /* renamed from: t */
    public C9052b<C4651c> mo32180t(@Nullable JSONObject jSONObject) {
        C9713p.m20270e("Must be called from the main thread.");
        if (!m6195X()) {
            return m6189H(17, (String) null);
        }
        C4677t tVar = new C4677t(this, jSONObject);
        m6196Y(tVar);
        return tVar;
    }

    @NonNull
    /* renamed from: u */
    public C9052b<C4651c> mo32181u(@Nullable JSONObject jSONObject) {
        C9713p.m20270e("Must be called from the main thread.");
        if (!m6195X()) {
            return m6189H(17, (String) null);
        }
        C4667o oVar = new C4667o(this, jSONObject);
        m6196Y(oVar);
        return oVar;
    }

    @NonNull
    /* renamed from: v */
    public C9052b<C4651c> mo32182v(@Nullable JSONObject jSONObject) {
        C9713p.m20270e("Must be called from the main thread.");
        if (!m6195X()) {
            return m6189H(17, (String) null);
        }
        C4665n nVar = new C4665n(this, jSONObject);
        m6196Y(nVar);
        return nVar;
    }

    /* renamed from: w */
    public void mo32183w(@NonNull C4649a aVar) {
        C9713p.m20270e("Must be called from the main thread.");
        if (aVar != null) {
            this.f4737i.add(aVar);
        }
    }

    @NonNull
    /* renamed from: x */
    public C9052b<C4651c> mo32184x() {
        C9713p.m20270e("Must be called from the main thread.");
        if (!m6195X()) {
            return m6189H(17, (String) null);
        }
        C4663m mVar = new C4663m(this);
        m6196Y(mVar);
        return mVar;
    }

    @NonNull
    @Deprecated
    /* renamed from: y */
    public C9052b<C4651c> mo32185y(long j) {
        return mo32186z(j, 0, (JSONObject) null);
    }

    @NonNull
    @Deprecated
    /* renamed from: z */
    public C9052b<C4651c> mo32186z(long j, int i, @Nullable JSONObject jSONObject) {
        C7935h.C7936a aVar = new C7935h.C7936a();
        aVar.mo41727c(j);
        aVar.mo41728d(i);
        aVar.mo41726b(jSONObject);
        return mo32148A(aVar.mo41725a());
    }

    /* renamed from: com.google.android.gms.cast.framework.media.h$a */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
    public static abstract class C4649a {
        /* renamed from: a */
        public void mo32187a() {
        }

        /* renamed from: c */
        public void mo32189c() {
        }

        /* renamed from: d */
        public void mo32190d() {
        }

        /* renamed from: e */
        public void mo32191e() {
        }

        /* renamed from: f */
        public void mo32192f() {
        }

        /* renamed from: g */
        public void mo32193g() {
        }

        /* renamed from: n */
        public void mo32200n() {
        }

        /* renamed from: b */
        public void mo32188b(@NonNull MediaError mediaError) {
        }

        /* renamed from: h */
        public void mo32194h(@NonNull int[] iArr) {
        }

        /* renamed from: j */
        public void mo32196j(@NonNull C4689g[] gVarArr) {
        }

        /* renamed from: k */
        public void mo32197k(@NonNull int[] iArr) {
        }

        /* renamed from: m */
        public void mo32199m(@NonNull int[] iArr) {
        }

        /* renamed from: i */
        public void mo32195i(@NonNull int[] iArr, int i) {
        }

        /* renamed from: l */
        public void mo32198l(@NonNull List list, @NonNull List list2, int i) {
        }
    }
}
