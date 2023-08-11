package p238u0;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p018a0.C2108f;
import p069e0.C7358a;
import p126j0.C8266c;
import p260w0.C10086a;
import p260w0.C10088c;
import p260w0.C10090d;
import p260w0.C10092e;
import p260w0.C10095g;
import p260w0.C10098h;
import p260w0.C10100i;
import p282y0.C10610a;
import p282y0.C10611b;
import p282y0.C10627d;
import p282y0.C10639e;
import p282y0.C10640f;
import p282y0.C10642h;
import p404of.C13074a;

/* renamed from: u0.q */
/* compiled from: InAppMessageManagerBase.kt */
public class C9863q {

    /* renamed from: a */
    private boolean f14727a;

    /* renamed from: b */
    private boolean f14728b;

    /* renamed from: c */
    private boolean f14729c = true;

    /* renamed from: d */
    protected Activity f14730d;

    /* renamed from: e */
    protected Context f14731e;

    /* renamed from: f */
    private final C10642h f14732f;

    /* renamed from: g */
    private final C10639e f14733g;

    /* renamed from: h */
    private final C9859m f14734h;

    /* renamed from: i */
    private final C9859m f14735i;

    /* renamed from: j */
    private final C9859m f14736j;

    /* renamed from: k */
    private final C9859m f14737k;

    /* renamed from: l */
    private final C9859m f14738l;

    /* renamed from: m */
    private final C9858l f14739m;

    /* renamed from: n */
    private final C10640f f14740n;

    /* renamed from: o */
    private final C9861o f14741o;

    /* renamed from: p */
    private C9859m f14742p;

    /* renamed from: q */
    private C9858l f14743q;

    /* renamed from: r */
    private C10640f f14744r;

    /* renamed from: s */
    private C9861o f14745s;

    /* renamed from: t */
    private C10639e f14746t;

    /* renamed from: u */
    private C10640f f14747u;

    /* renamed from: u0.q$a */
    /* compiled from: InAppMessageManagerBase.kt */
    public /* synthetic */ class C9864a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14748a;

        static {
            int[] iArr = new int[C2108f.values().length];
            iArr[C2108f.SLIDEUP.ordinal()] = 1;
            iArr[C2108f.MODAL.ordinal()] = 2;
            iArr[C2108f.FULL.ordinal()] = 3;
            iArr[C2108f.HTML_FULL.ordinal()] = 4;
            iArr[C2108f.HTML.ordinal()] = 5;
            f14748a = iArr;
        }
    }

    /* renamed from: u0.q$b */
    /* compiled from: InAppMessageManagerBase.kt */
    static final class C9865b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C7358a f14749g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9865b(C7358a aVar) {
            super(0);
            this.f14749g = aVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Failed to find view factory for in-app message with type: ", this.f14749g.mo40944I());
        }
    }

    /* renamed from: u0.q$c */
    /* compiled from: InAppMessageManagerBase.kt */
    static final class C9866c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ boolean f14750g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9866c(boolean z) {
            super(0);
            this.f14750g = z;
        }

        public final String invoke() {
            return C12775o.m28647q("Setting setShouldNextUnregisterBeSkipped to ", Boolean.valueOf(this.f14750g));
        }
    }

    public C9863q() {
        C10627d dVar = new C10627d();
        this.f14732f = dVar;
        this.f14733g = new C10610a();
        this.f14734h = new C10098h();
        this.f14735i = new C10095g();
        this.f14736j = new C10088c();
        this.f14737k = new C10090d(dVar);
        this.f14738l = new C10092e(dVar);
        this.f14739m = new C10086a();
        this.f14740n = new C10611b();
        this.f14741o = new C10100i();
    }

    /* renamed from: a */
    public Activity mo44373a() {
        return this.f14730d;
    }

    /* renamed from: b */
    public Context mo44374b() {
        return this.f14731e;
    }

    /* renamed from: c */
    public C10640f mo44375c() {
        C10640f fVar = this.f14747u;
        if (fVar == null) {
            return this.f14740n;
        }
        return fVar;
    }

    /* renamed from: d */
    public C9859m mo44376d(C7358a aVar) {
        C12775o.m28639i(aVar, "inAppMessage");
        int i = C9864a.f14748a[aVar.mo40944I().ordinal()];
        if (i == 1) {
            return this.f14734h;
        }
        if (i == 2) {
            return this.f14735i;
        }
        if (i == 3) {
            return this.f14736j;
        }
        if (i == 4) {
            return this.f14737k;
        }
        if (i == 5) {
            return this.f14738l;
        }
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C9865b(aVar), 6, (Object) null);
        return null;
    }

    /* renamed from: e */
    public boolean mo44377e() {
        return this.f14729c;
    }

    /* renamed from: f */
    public boolean mo44378f() {
        return this.f14727a;
    }

    /* renamed from: g */
    public C10639e mo44379g() {
        C10639e eVar = this.f14746t;
        if (eVar == null) {
            return this.f14733g;
        }
        return eVar;
    }

    /* renamed from: h */
    public C9858l mo44380h() {
        C9858l lVar = this.f14743q;
        if (lVar == null) {
            return this.f14739m;
        }
        return lVar;
    }

    /* renamed from: i */
    public C10640f mo44381i() {
        C10640f fVar = this.f14744r;
        if (fVar == null) {
            return this.f14740n;
        }
        return fVar;
    }

    /* renamed from: j */
    public C9859m mo44382j(C7358a aVar) {
        C12775o.m28639i(aVar, "inAppMessage");
        C9859m mVar = this.f14742p;
        if (mVar == null) {
            return mo44376d(aVar);
        }
        return mVar;
    }

    /* renamed from: k */
    public C9861o mo44383k() {
        C9861o oVar = this.f14745s;
        if (oVar == null) {
            return this.f14741o;
        }
        return oVar;
    }

    /* renamed from: l */
    public boolean mo44384l() {
        return this.f14728b;
    }

    /* renamed from: m */
    public void mo44385m(boolean z) {
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C9866c(z), 7, (Object) null);
        this.f14728b = z;
    }
}
