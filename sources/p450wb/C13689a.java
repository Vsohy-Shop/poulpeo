package p450wb;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.SplashActivity;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.GoogleLoginUtil;
import com.rmn.utils.shortcut.ShortcutUtil;
import kotlin.jvm.internal.C12775o;
import p021a3.C2182p;
import p360id.C12136d;
import p395nc.C12993f;
import p446vd.C13636q;
import p456xb.C13770a;
import p462yb.C13861e;

@StabilityInferred(parameters = 0)
/* renamed from: wb.a */
/* compiled from: PLPLogoutListener.kt */
public final class C13689a extends C13770a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13689a(ContextContainer contextContainer) {
        super(contextContainer);
        C12775o.m28639i(contextContainer, "contextContainer");
    }

    public void onLogout(boolean z) {
        super.onLogout(z);
        C2182p.m1687e().mo23456k();
        GoogleLoginUtil googleLoginUtil = GoogleLoginUtil.INSTANCE;
        Context a = this.f22202a.mo47843a();
        C12775o.m28638h(a, "contextContainer.applicationContext");
        googleLoginUtil.signOut(a);
        C12993f.f20794f.mo50904e();
        C13861e.f22396e.mo53556a().mo40749n();
        C13636q.m31181b(this.f22202a).mo53293d("already_initialized");
        if (Build.VERSION.SDK_INT >= 25) {
            ShortcutUtil shortcutUtil = ShortcutUtil.INSTANCE;
            Context a2 = this.f22202a.mo47843a();
            C12775o.m28638h(a2, "contextContainer.applicationContext");
            shortcutUtil.resetShortcuts(a2);
        }
        Context a3 = this.f22202a.mo47843a();
        C12775o.m28638h(a3, "contextContainer.applicationContext");
        Intent a4 = SplashActivity.f17227p.mo46181a(a3);
        a4.setFlags(268468224);
        a3.startActivity(a4);
        if (z) {
            C12136d.m26467i(a3, R.string.logout_information);
        } else {
            C12136d.m26467i(a3, R.string.logout_confirmation);
        }
    }
}
