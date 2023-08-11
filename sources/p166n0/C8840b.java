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

/* renamed from: n0.b */
/* compiled from: AddToSubscriptionGroupStep.kt */
public final class C8840b extends C8842c {

    /* renamed from: b */
    public static final C8840b f12809b = new C8840b();

    /* renamed from: n0.b$a */
    /* compiled from: AddToSubscriptionGroupStep.kt */
    static final class C8841a extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f12810g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8841a(String str) {
            super(1);
            this.f12810g = str;
        }

        /* renamed from: a */
        public final void mo42975a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44964c(this.f12810g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42975a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    private C8840b() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo42972a(Context context, C8865o oVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(oVar, "data");
        C8842c.f12811a.mo42976a(C10156b.f15345m.mo44811g(context), new C8841a(String.valueOf(oVar.mo42990h())));
    }

    /* renamed from: b */
    public boolean mo42973b(C8865o oVar) {
        C12775o.m28639i(oVar, "data");
        if (!C8865o.m17956l(oVar, 1, (C13528f) null, 2, (Object) null) || !oVar.mo42996n(0)) {
            return false;
        }
        return true;
    }
}
