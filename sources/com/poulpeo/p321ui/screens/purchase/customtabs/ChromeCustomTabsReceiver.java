package com.poulpeo.p321ui.screens.purchase.customtabs;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.purchase.dialog.PurchaseDialogActivity;
import com.rmn.utils.IntentDelegate;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p326db.C11800e;
import p336ef.C11921v;
import p445vc.C13619h;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.purchase.customtabs.ChromeCustomTabsReceiver */
/* compiled from: ChromeCustomTabsReceiver.kt */
public final class ChromeCustomTabsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C11205a f17667a = new C11205a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final IntentDelegate.String f17668b = new IntentDelegate.String("merchantId");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final IntentDelegate.String f17669c = new IntentDelegate.String("affiliationUrl");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final IntentDelegate.String f17670d = new IntentDelegate.String("offerId");

    /* renamed from: com.poulpeo.ui.screens.purchase.customtabs.ChromeCustomTabsReceiver$a */
    /* compiled from: ChromeCustomTabsReceiver.kt */
    public static final class C11205a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17671a;

        static {
            Class<C11205a> cls = C11205a.class;
            f17671a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "merchantId", "getMerchantId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "affiliationUrl", "getAffiliationUrl(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "offerId", "getOfferId(Landroid/content/Intent;)Ljava/lang/String;", 0))};
        }

        private C11205a() {
        }

        public /* synthetic */ C11205a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String m24680d(Intent intent) {
            return ChromeCustomTabsReceiver.f17669c.getValue(intent, (KProperty<?>) f17671a[1]);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final String m24681e(Intent intent) {
            return ChromeCustomTabsReceiver.f17668b.getValue(intent, (KProperty<?>) f17671a[0]);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final String m24682f(Intent intent) {
            return ChromeCustomTabsReceiver.f17670d.getValue(intent, (KProperty<?>) f17671a[2]);
        }

        /* renamed from: h */
        private final void m24683h(Intent intent, String str) {
            ChromeCustomTabsReceiver.f17669c.setValue(intent, (KProperty<?>) f17671a[1], str);
        }

        /* renamed from: i */
        private final void m24684i(Intent intent, String str) {
            ChromeCustomTabsReceiver.f17668b.setValue(intent, (KProperty<?>) f17671a[0], str);
        }

        /* renamed from: j */
        private final void m24685j(Intent intent, String str) {
            ChromeCustomTabsReceiver.f17670d.setValue(intent, (KProperty<?>) f17671a[2], str);
        }

        /* renamed from: g */
        public final PendingIntent mo46464g(Context context, String str, String str2, String str3) {
            int i;
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "affiliationUrl");
            C12775o.m28639i(str2, "merchantId");
            C12775o.m28639i(str3, "offerId");
            if (Build.VERSION.SDK_INT >= 31) {
                i = 167772160;
            } else {
                i = 134217728;
            }
            Intent intent = new Intent(context, ChromeCustomTabsReceiver.class);
            C11205a aVar = ChromeCustomTabsReceiver.f17667a;
            aVar.m24684i(intent, str2);
            aVar.m24683h(intent, str);
            aVar.m24685j(intent, str3);
            C11921v vVar = C11921v.f18618a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i);
            C12775o.m28638h(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        if (!C11800e.m25362a().mo48939e()) {
            str = f17667a.m24682f(intent);
        } else {
            str = C11800e.m25362a().mo48937c();
            C12775o.m28638h(str, "getInstance().nonNullClickedCodeId");
        }
        String str2 = str;
        int intExtra = intent.getIntExtra(CustomTabsIntent.EXTRA_REMOTEVIEWS_CLICKED_ID, 0);
        if (intExtra == R.id.buttonCashbackBottomBar) {
            C13619h.f21932a.mo53282c("purchase", "click-cashback-icon", C11800e.m25362a().mo48936b());
            PurchaseDialogActivity.C11206a aVar = PurchaseDialogActivity.f17672s;
            C11205a aVar2 = f17667a;
            Intent g = aVar.mo46471g(context, aVar2.m24680d(intent), true, aVar2.m24681e(intent), str2);
            g.addFlags(268566528);
            ContextCompat.startActivity(context, g, (Bundle) null);
        } else if (intExtra == R.id.buttonCodesBottomBar) {
            C13619h.f21932a.mo53282c("purchase", "click-offers-icon", C11800e.m25362a().mo48936b());
            PurchaseDialogActivity.C11206a aVar3 = PurchaseDialogActivity.f17672s;
            C11205a aVar4 = f17667a;
            Intent g2 = aVar3.mo46471g(context, aVar4.m24680d(intent), false, aVar4.m24681e(intent), str2);
            g2.addFlags(268566528);
            ContextCompat.startActivity(context, g2, (Bundle) null);
        }
    }
}
