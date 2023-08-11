package p260w0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.p054ui.C4193R;
import com.braze.p055ui.inappmessage.views.C4339d;
import com.braze.p055ui.inappmessage.views.InAppMessageSlideupView;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p019a1.C2117c;
import p043c0.C3864b;
import p069e0.C7358a;
import p069e0.C7408o;
import p126j0.C8266c;
import p238u0.C9859m;
import p270x.C10156b;
import p292z.C10734d;
import p404of.C13074a;

/* renamed from: w0.h */
/* compiled from: DefaultInAppMessageSlideupViewFactory.kt */
public class C10098h implements C9859m {

    /* renamed from: w0.h$a */
    /* compiled from: DefaultInAppMessageSlideupViewFactory.kt */
    static final class C10099a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10099a f15260g = new C10099a();

        C10099a() {
            super(0);
        }

        public final String invoke() {
            return "The device is not currently in touch mode. This message requires user touch interaction to display properly.";
        }
    }

    /* renamed from: b */
    public InAppMessageSlideupView mo44369a(Activity activity, C7358a aVar) {
        boolean z;
        C12775o.m28639i(activity, "activity");
        C12775o.m28639i(aVar, "inAppMessage");
        View inflate = activity.getLayoutInflater().inflate(C4193R.C4197layout.com_braze_inappmessage_slideup, (ViewGroup) null);
        if (inflate != null) {
            InAppMessageSlideupView inAppMessageSlideupView = (InAppMessageSlideupView) inflate;
            if (C2117c.m1469h(inAppMessageSlideupView)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10099a.f15260g, 6, (Object) null);
                return null;
            }
            C7408o oVar = (C7408o) aVar;
            Context applicationContext = activity.getApplicationContext();
            inAppMessageSlideupView.applyInAppMessageParameters(aVar);
            String a = C4339d.Companion.mo31129a(oVar);
            if (a == null || a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C10156b.C10157a aVar2 = C10156b.f15345m;
                C12775o.m28638h(applicationContext, "applicationContext");
                C3864b P = aVar2.mo44811g(applicationContext).mo44772P();
                ImageView messageImageView = inAppMessageSlideupView.getMessageImageView();
                if (messageImageView != null) {
                    P.mo29854c(applicationContext, aVar, a, messageImageView, C10734d.IN_APP_MESSAGE_SLIDEUP);
                }
            }
            inAppMessageSlideupView.setMessageBackgroundColor(oVar.mo40961e0());
            String message = oVar.getMessage();
            if (message != null) {
                inAppMessageSlideupView.setMessage(message);
            }
            inAppMessageSlideupView.setMessageTextColor(oVar.mo40957a0());
            inAppMessageSlideupView.setMessageTextAlign(oVar.mo40989f0());
            String icon = oVar.getIcon();
            if (icon != null) {
                inAppMessageSlideupView.setMessageIcon(icon, oVar.mo40943H(), oVar.mo40953U());
            }
            inAppMessageSlideupView.setMessageChevron(oVar.mo41049w0(), oVar.mo40959b0());
            inAppMessageSlideupView.resetMessageMargins(oVar.mo41053u0());
            return inAppMessageSlideupView;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageSlideupView");
    }
}
