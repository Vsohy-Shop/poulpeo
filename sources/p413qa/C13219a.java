package p413qa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.p321ui.screens.welcome.WelcomeActivity;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.screens.AnimatedActivity;
import com.rmn.utils.shortcut.ShortcutUtil;
import kotlin.jvm.internal.C12775o;
import p317cd.C11036a;
import p440ud.C13566l;
import p446vd.C13636q;
import p462yb.C13861e;

@StabilityInferred(parameters = 0)
/* renamed from: qa.a */
/* compiled from: PLPLoginActionHandler.kt */
public final class C13219a extends C11036a {

    /* renamed from: a */
    public static final C13219a f21022a = new C13219a();

    private C13219a() {
    }

    /* renamed from: a */
    public void mo46068a(String str, ContextContainer contextContainer) {
        C12775o.m28639i(str, "userId");
        C12775o.m28639i(contextContainer, "contextContainer");
        C13861e.f22396e.mo53556a().mo40748j(str);
        C13636q.m31181b(contextContainer).mo53299j("already_initialized", true);
        if (Build.VERSION.SDK_INT >= 25) {
            ShortcutUtil shortcutUtil = ShortcutUtil.INSTANCE;
            Context a = contextContainer.mo47843a();
            C12775o.m28638h(a, "contextContainer.applicationContext");
            shortcutUtil.initShortcuts(a);
        }
    }

    /* renamed from: b */
    public void mo46069b(C13566l lVar) {
        C12775o.m28639i(lVar, "screenWrapper");
        Activity a = lVar.mo53218a();
        if (a != null) {
            Intent a2 = WelcomeActivity.f17749s.mo46546a(a, true, true);
            a2.setFlags(268468224);
            ((AnimatedActivity) a).mo47883t2(a2);
        }
    }
}
