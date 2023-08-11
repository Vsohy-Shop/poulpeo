package p260w0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.appboy.p054ui.C4193R;
import com.braze.configuration.C4218b;
import com.braze.p055ui.inappmessage.views.C4343f;
import com.braze.p055ui.inappmessage.views.InAppMessageHtmlView;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p019a1.C2117c;
import p069e0.C7358a;
import p069e0.C7390j;
import p126j0.C8266c;
import p238u0.C9859m;
import p271x0.C10351a;
import p282y0.C10642h;
import p293z0.C10766d;
import p404of.C13074a;

/* renamed from: w0.e */
/* compiled from: DefaultInAppMessageHtmlViewFactory.kt */
public class C10092e implements C9859m {

    /* renamed from: a */
    private final C10642h f15255a;

    /* renamed from: w0.e$a */
    /* compiled from: DefaultInAppMessageHtmlViewFactory.kt */
    static final class C10093a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10093a f15256g = new C10093a();

        C10093a() {
            super(0);
        }

        public final String invoke() {
            return "The device is not currently in touch mode. This message requires user touch interaction to display properly. Please set setIsTouchModeRequiredForHtmlInAppMessages to false to change this behavior.";
        }
    }

    public C10092e(C10642h hVar) {
        C12775o.m28639i(hVar, "inAppMessageWebViewClientListener");
        this.f15255a = hVar;
    }

    /* renamed from: b */
    public InAppMessageHtmlView mo44369a(Activity activity, C7358a aVar) {
        C12775o.m28639i(activity, "activity");
        C12775o.m28639i(aVar, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        View inflate = activity.getLayoutInflater().inflate(C4193R.C4197layout.com_braze_inappmessage_html, (ViewGroup) null);
        if (inflate != null) {
            InAppMessageHtmlView inAppMessageHtmlView = (InAppMessageHtmlView) inflate;
            C12775o.m28638h(applicationContext, "context");
            if (!new C4218b(applicationContext).isTouchModeRequiredForHtmlInAppMessages() || !C2117c.m1469h(inAppMessageHtmlView)) {
                C7390j jVar = (C7390j) aVar;
                C10351a aVar2 = new C10351a(applicationContext, jVar);
                C4343f.setWebViewContent$default(inAppMessageHtmlView, jVar.getMessage(), (String) null, 2, (Object) null);
                Context applicationContext2 = activity.getApplicationContext();
                C12775o.m28638h(applicationContext2, "activity.applicationContext");
                inAppMessageHtmlView.setInAppMessageWebViewClient(new C10766d(applicationContext2, jVar, this.f15255a));
                WebView messageWebView = inAppMessageHtmlView.getMessageWebView();
                if (messageWebView != null) {
                    messageWebView.addJavascriptInterface(aVar2, C4343f.BRAZE_BRIDGE_PREFIX);
                }
                return inAppMessageHtmlView;
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10093a.f15256g, 6, (Object) null);
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageHtmlView");
    }
}
