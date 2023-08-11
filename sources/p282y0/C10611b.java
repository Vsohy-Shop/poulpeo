package p282y0;

import android.content.Context;
import com.braze.p055ui.inappmessage.InAppMessageOperation;
import kotlin.jvm.internal.C12775o;
import p019a1.C2117c;
import p069e0.C7358a;
import p069e0.C7361d;
import p238u0.C9783d;

/* renamed from: y0.b */
/* compiled from: DefaultInAppMessageManagerListener.kt */
public class C10611b implements C10640f {
    /* renamed from: h */
    public InAppMessageOperation mo45559h(C7358a aVar) {
        Context b;
        C12775o.m28639i(aVar, "inAppMessage");
        if ((aVar instanceof C7361d) && (b = C9783d.f14623G.mo44312a().mo44374b()) != null && C2117c.m1468g(b)) {
            ((C7361d) aVar).mo40977e();
        }
        return InAppMessageOperation.DISPLAY_NOW;
    }
}
