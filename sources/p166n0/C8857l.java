package p166n0;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p270x.C10156b;
import p270x.C10300f;
import p336ef.C11921v;
import p436tf.C13528f;

/* renamed from: n0.l */
/* compiled from: SetCustomUserAttributeStep.kt */
public final class C8857l extends C8842c {

    /* renamed from: b */
    public static final C8857l f12824b;

    /* renamed from: c */
    private static final String f12825c;

    /* renamed from: n0.l$a */
    /* compiled from: SetCustomUserAttributeStep.kt */
    static final class C8858a extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C8865o f12826g;

        /* renamed from: h */
        final /* synthetic */ Object f12827h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8858a(C8865o oVar, Object obj) {
            super(1);
            this.f12826g = oVar;
            this.f12827h = obj;
        }

        /* renamed from: a */
        public final void mo42982a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44970j(String.valueOf(this.f12826g.mo42990h()), this.f12827h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42982a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    static {
        C8857l lVar = new C8857l();
        f12824b = lVar;
        f12825c = C8266c.f11641a.mo42212b(lVar);
    }

    private C8857l() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo42972a(Context context, C8865o oVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(oVar, "data");
        Object i = oVar.mo42992i();
        if (i != null) {
            C8842c.f12811a.mo42976a(C10156b.f15345m.mo44811g(context), new C8858a(oVar, i));
        }
    }

    /* renamed from: b */
    public boolean mo42973b(C8865o oVar) {
        C12775o.m28639i(oVar, "data");
        if (!C8865o.m17956l(oVar, 2, (C13528f) null, 2, (Object) null) || !oVar.mo42996n(0) || oVar.mo42992i() == null) {
            return false;
        }
        return true;
    }
}
