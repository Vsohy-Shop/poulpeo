package p338fb;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.utils.AndroidUtil;
import kotlin.jvm.internal.C12775o;
import p326db.C11800e;
import p445vc.C13619h;
import p446vd.C13633n;

@StabilityInferred(parameters = 0)
/* renamed from: fb.b */
/* compiled from: PurchaseCallback.kt */
public final class C11929b extends CustomTabsCallback {

    /* renamed from: a */
    private final Context f18630a;

    /* renamed from: b */
    private final String f18631b;

    public C11929b(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "url");
        this.f18630a = context;
        this.f18631b = str;
    }

    public void extraCallback(String str, Bundle bundle) {
        C12775o.m28639i(str, "callbackName");
        super.extraCallback(str, bundle);
        if (C12775o.m28634d(str, "onOpenInBrowser")) {
            C13619h.f21932a.mo53282c("purchase", "redirect-browser", C11800e.m25362a().mo48936b());
            String defaultBrowserPackage = AndroidUtil.getDefaultBrowserPackage(this.f18630a);
            C12775o.m28638h(defaultBrowserPackage, "getDefaultBrowserPackage(context)");
            if (!C12775o.m28634d(defaultBrowserPackage, "com.android.chrome")) {
                try {
                    this.f18630a.getApplicationContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f18631b)).setPackage(defaultBrowserPackage).addFlags(268435456));
                } catch (ActivityNotFoundException e) {
                    C13633n.m31165u(this, e);
                }
                try {
                    this.f18630a.getApplicationContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f18631b)).setPackage("com.android.chrome").addFlags(272760832));
                } catch (ActivityNotFoundException e2) {
                    C13633n.m31165u(this, e2);
                }
            }
        }
    }

    public void onNavigationEvent(int i, Bundle bundle) {
        if (i == 5) {
            C11930c a = C11930c.f18632n.mo49153a();
            if (a != null) {
                a.mo49144M0();
            }
            C11800e.m25362a().mo48943i();
        } else if (i == 6) {
            C11800e.m25362a().mo48942h();
        }
    }
}
