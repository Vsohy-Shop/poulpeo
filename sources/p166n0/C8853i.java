package p166n0;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p136k0.C8429a;
import p146l0.C8622c;
import p270x.C10347i;
import p436tf.C13528f;

/* renamed from: n0.i */
/* compiled from: OpenLinkInWebViewStep.kt */
public final class C8853i extends C8842c {

    /* renamed from: b */
    public static final C8853i f12820b = new C8853i();

    private C8853i() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo42972a(Context context, C8865o oVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(oVar, "data");
        String valueOf = String.valueOf(oVar.mo42990h());
        C10347i a = C8429a.f12015a.mo42456a();
        C8622c c = a.mo42453c(valueOf, (Bundle) null, true, oVar.mo42989g());
        if (c != null) {
            a.mo42454d(context, c);
        }
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
