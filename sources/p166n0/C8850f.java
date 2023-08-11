package p166n0;

import android.content.Context;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p270x.C10156b;
import p436tf.C13528f;

/* renamed from: n0.f */
/* compiled from: LogCustomEventStep.kt */
public final class C8850f extends C8842c {

    /* renamed from: b */
    public static final C8850f f12817b = new C8850f();

    private C8850f() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo42972a(Context context, C8865o oVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(oVar, "data");
        C10156b.f15345m.mo44811g(context).mo44776V(String.valueOf(oVar.mo42990h()), oVar.mo42985b(1));
    }

    /* renamed from: b */
    public boolean mo42973b(C8865o oVar) {
        C12775o.m28639i(oVar, "data");
        if (!C8865o.m17956l(oVar, 0, new C13528f(1, 2), 1, (Object) null) || !oVar.mo42996n(0) || !oVar.mo42995m(1)) {
            return false;
        }
        return true;
    }
}
