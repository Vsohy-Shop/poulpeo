package p166n0;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p270x.C10156b;
import p270x.C10300f;
import p336ef.C11921v;
import p436tf.C13528f;

/* renamed from: n0.j */
/* compiled from: RemoveFromCustomAttributeArrayStep.kt */
public final class C8854j extends C8842c {

    /* renamed from: b */
    public static final C8854j f12821b = new C8854j();

    /* renamed from: n0.j$a */
    /* compiled from: RemoveFromCustomAttributeArrayStep.kt */
    static final class C8855a extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C8865o f12822g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8855a(C8865o oVar) {
            super(1);
            this.f12822g = oVar;
        }

        /* renamed from: a */
        public final void mo42981a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44967g(String.valueOf(this.f12822g.mo42990h()), String.valueOf(this.f12822g.mo42992i()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42981a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    private C8854j() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo42972a(Context context, C8865o oVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(oVar, "data");
        C8842c.f12811a.mo42976a(C10156b.f15345m.mo44811g(context), new C8855a(oVar));
    }

    /* renamed from: b */
    public boolean mo42973b(C8865o oVar) {
        C12775o.m28639i(oVar, "data");
        if (!C8865o.m17956l(oVar, 2, (C13528f) null, 2, (Object) null) || !oVar.mo42996n(0) || !oVar.mo42996n(1)) {
            return false;
        }
        return true;
    }
}
