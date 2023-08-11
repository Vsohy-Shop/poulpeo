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

/* renamed from: n0.a */
/* compiled from: AddToCustomAttributeArrayStep.kt */
public final class C8838a extends C8842c {

    /* renamed from: b */
    public static final C8838a f12806b = new C8838a();

    /* renamed from: n0.a$a */
    /* compiled from: AddToCustomAttributeArrayStep.kt */
    static final class C8839a extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f12807g;

        /* renamed from: h */
        final /* synthetic */ String f12808h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8839a(String str, String str2) {
            super(1);
            this.f12807g = str;
            this.f12808h = str2;
        }

        /* renamed from: a */
        public final void mo42974a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44963b(this.f12807g, this.f12808h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42974a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    private C8838a() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo42972a(Context context, C8865o oVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(oVar, "data");
        C8842c.f12811a.mo42976a(C10156b.f15345m.mo44811g(context), new C8839a(String.valueOf(oVar.mo42990h()), String.valueOf(oVar.mo42992i())));
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
