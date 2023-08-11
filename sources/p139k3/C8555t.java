package p139k3;

import android.content.Context;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.Set;
import p119i3.C8109b;
import p119i3.C8114g;
import p119i3.C8115h;
import p209r3.C9374e;
import p219s3.C9486r;
import p219s3.C9490v;
import p252v3.C9927a;

/* renamed from: k3.t */
/* compiled from: TransportRuntime */
public class C8555t implements C8554s {

    /* renamed from: e */
    private static volatile C8556u f12214e;

    /* renamed from: a */
    private final C9927a f12215a;

    /* renamed from: b */
    private final C9927a f12216b;

    /* renamed from: c */
    private final C9374e f12217c;

    /* renamed from: d */
    private final C9486r f12218d;

    C8555t(C9927a aVar, C9927a aVar2, C9374e eVar, C9486r rVar, C9490v vVar) {
        this.f12215a = aVar;
        this.f12216b = aVar2;
        this.f12217c = eVar;
        this.f12218d = rVar;
        vVar.mo43935c();
    }

    /* renamed from: b */
    private C8539i m17183b(C8547n nVar) {
        return C8539i.m17122a().mo42563i(this.f12215a.mo44504a()).mo42565k(this.f12216b.mo44504a()).mo42564j(nVar.mo42571g()).mo42562h(new C8538h(nVar.mo42566b(), nVar.mo42611d())).mo42561g(nVar.mo42567c().mo41957a()).mo42558d();
    }

    /* renamed from: c */
    public static C8555t m17184c() {
        C8556u uVar = f12214e;
        if (uVar != null) {
            return uVar.mo42590b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C8109b> m17185d(C8536f fVar) {
        if (fVar instanceof C8537g) {
            return Collections.unmodifiableSet(((C8537g) fVar).mo31818a());
        }
        return Collections.singleton(C8109b.m15970b("proto"));
    }

    /* renamed from: f */
    public static void m17186f(Context context) {
        if (f12214e == null) {
            synchronized (C8555t.class) {
                if (f12214e == null) {
                    f12214e = C8533e.m17113c().mo42591a(context).build();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo42615a(C8547n nVar, C8115h hVar) {
        this.f12217c.mo43801a(nVar.mo42570f().mo42613f(nVar.mo42567c().mo41959c()), m17183b(nVar), hVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public C9486r mo42616e() {
        return this.f12218d;
    }

    /* renamed from: g */
    public C8114g mo42617g(C8536f fVar) {
        return new C8551p(m17185d(fVar), C8549o.m17165a().mo42586b(fVar.getName()).mo42587c(fVar.getExtras()).mo42585a(), this);
    }
}
