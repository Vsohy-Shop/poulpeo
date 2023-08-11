package p260w0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.p054ui.C4193R;
import com.braze.p055ui.inappmessage.views.C4339d;
import com.braze.p055ui.inappmessage.views.InAppMessageImageView;
import com.braze.p055ui.inappmessage.views.InAppMessageModalView;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p018a0.C2105d;
import p043c0.C3864b;
import p069e0.C7358a;
import p069e0.C7407n;
import p126j0.C8266c;
import p238u0.C9783d;
import p238u0.C9859m;
import p270x.C10156b;
import p292z.C10734d;
import p404of.C13074a;

/* renamed from: w0.g */
/* compiled from: DefaultInAppMessageModalViewFactory.kt */
public class C10095g implements C9859m {

    /* renamed from: a */
    public static final C10096a f15258a = new C10096a((DefaultConstructorMarker) null);

    /* renamed from: w0.g$a */
    /* compiled from: DefaultInAppMessageModalViewFactory.kt */
    public static final class C10096a {
        private C10096a() {
        }

        public /* synthetic */ C10096a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: w0.g$b */
    /* compiled from: DefaultInAppMessageModalViewFactory.kt */
    static final class C10097b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10097b f15259g = new C10097b();

        C10097b() {
            super(0);
        }

        public final String invoke() {
            return "Dismissing modal after frame click";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m21206d(C10095g gVar, View view) {
        C12775o.m28639i(gVar, "this$0");
        C9783d.C9784a aVar = C9783d.f14623G;
        if (aVar.mo44312a().mo44378f()) {
            C8266c.m16396e(C8266c.f11641a, gVar, C8266c.C8267a.I, (Throwable) null, false, C10097b.f15259g, 6, (Object) null);
            aVar.mo44312a().mo44302B(true);
        }
    }

    /* renamed from: e */
    private final InAppMessageModalView m21207e(Activity activity, boolean z) {
        if (z) {
            View inflate = activity.getLayoutInflater().inflate(C4193R.C4197layout.com_braze_inappmessage_modal_graphic, (ViewGroup) null);
            if (inflate != null) {
                return (InAppMessageModalView) inflate;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
        }
        View inflate2 = activity.getLayoutInflater().inflate(C4193R.C4197layout.com_braze_inappmessage_modal, (ViewGroup) null);
        if (inflate2 != null) {
            return (InAppMessageModalView) inflate2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
    }

    /* renamed from: c */
    public InAppMessageModalView mo44369a(Activity activity, C7358a aVar) {
        boolean z;
        C12775o.m28639i(activity, "activity");
        C12775o.m28639i(aVar, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        C7407n nVar = (C7407n) aVar;
        boolean z2 = true;
        if (nVar.mo40973D() == C2105d.GRAPHIC) {
            z = true;
        } else {
            z = false;
        }
        InAppMessageModalView e = m21207e(activity, z);
        C12775o.m28638h(applicationContext, "applicationContext");
        e.applyInAppMessageParameters(applicationContext, nVar);
        String a = C4339d.Companion.mo31129a(nVar);
        if (!(a == null || a.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            C3864b P = C10156b.f15345m.mo44811g(applicationContext).mo44772P();
            ImageView messageImageView = e.getMessageImageView();
            if (messageImageView != null) {
                P.mo29854c(applicationContext, aVar, a, messageImageView, C10734d.IN_APP_MESSAGE_MODAL);
            }
        }
        View frameView = e.getFrameView();
        if (frameView != null) {
            frameView.setOnClickListener(new C10094f(this));
        }
        e.setMessageBackgroundColor(aVar.mo40961e0());
        Integer x0 = nVar.mo41040x0();
        if (x0 != null) {
            e.setFrameColor(x0.intValue());
        }
        e.setMessageButtons(nVar.mo40975R());
        e.setMessageCloseButtonColor(nVar.mo41039w0());
        if (!z) {
            String message = aVar.getMessage();
            if (message != null) {
                e.setMessage(message);
            }
            e.setMessageTextColor(aVar.mo40957a0());
            String Y = nVar.mo40976Y();
            if (Y != null) {
                e.setMessageHeaderText(Y);
            }
            e.setMessageHeaderTextColor(nVar.mo41042z0());
            String icon = aVar.getIcon();
            if (icon != null) {
                e.setMessageIcon(icon, aVar.mo40943H(), aVar.mo40953U());
            }
            e.setMessageHeaderTextAlignment(nVar.mo41041y0());
            e.setMessageTextAlign(nVar.mo40989f0());
            e.resetMessageMargins(nVar.mo41053u0());
            ImageView messageImageView2 = e.getMessageImageView();
            if (messageImageView2 != null) {
                ((InAppMessageImageView) messageImageView2).setAspectRatio(2.9f);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            }
        }
        e.setLargerCloseButtonClickArea(e.getMessageCloseButtonView());
        e.setupDirectionalNavigation(nVar.mo40975R().size());
        return e;
    }
}
