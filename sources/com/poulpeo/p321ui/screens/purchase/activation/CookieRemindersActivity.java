package com.poulpeo.p321ui.screens.purchase.activation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p326db.C11800e;
import p332eb.C11882n;
import p368jd.C12618d;
import p445vc.C13619h;
import p446vd.C13636q;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.purchase.activation.CookieRemindersActivity */
/* compiled from: CookieRemindersActivity.kt */
public final class CookieRemindersActivity extends C12618d {

    /* renamed from: n */
    public static final C11204a f17662n = new C11204a((DefaultConstructorMarker) null);

    /* renamed from: o */
    public static final int f17663o = 8;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final IntentDelegate.String f17664p = new IntentDelegate.String("merchantName");

    /* renamed from: m */
    public Map<Integer, View> f17665m = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.purchase.activation.CookieRemindersActivity$a */
    /* compiled from: CookieRemindersActivity.kt */
    public static final class C11204a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17666a = {C12764h0.m28590f(new C12783v(C11204a.class, "merchantName", "getMerchantName(Landroid/content/Intent;)Ljava/lang/String;", 0))};

        private C11204a() {
        }

        public /* synthetic */ C11204a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final String m24670c(Intent intent) {
            return CookieRemindersActivity.f17664p.getValue(intent, (KProperty<?>) f17666a[0]);
        }

        /* renamed from: e */
        private final void m24671e(Intent intent, String str) {
            CookieRemindersActivity.f17664p.setValue(intent, (KProperty<?>) f17666a[0], str);
        }

        /* renamed from: b */
        public final boolean mo46461b(ContextContainer contextContainer, String str) {
            C12775o.m28639i(contextContainer, "contextContainer");
            C12775o.m28639i(str, "merchantId");
            if (!C11800e.m25362a().mo48940f(str) || C13636q.m31181b(contextContainer).mo53294e("purchase_mustNotShowCookieWarning", false)) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final Intent mo46462d(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "merchantName");
            Intent intent = new Intent(context, CookieRemindersActivity.class);
            CookieRemindersActivity.f17662n.m24671e(intent, str);
            return intent;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static final void m24666B2(CookieRemindersActivity cookieRemindersActivity, View view) {
        C12775o.m28639i(cookieRemindersActivity, "this$0");
        if (((AppCompatCheckBox) cookieRemindersActivity.mo46460z2(C13865f.checkboxCookieNoReminder)).isChecked()) {
            C13619h hVar = C13619h.f21932a;
            C11204a aVar = f17662n;
            Intent intent = cookieRemindersActivity.getIntent();
            C12775o.m28638h(intent, "intent");
            hVar.mo53284e("purchase", "close-cookie-warning-definitely", aVar.m24670c(intent));
            C13636q.m31181b(new ContextContainer(cookieRemindersActivity)).mo53299j("purchase_mustNotShowCookieWarning", true);
        } else {
            C13619h hVar2 = C13619h.f21932a;
            C11204a aVar2 = f17662n;
            Intent intent2 = cookieRemindersActivity.getIntent();
            C12775o.m28638h(intent2, "intent");
            hVar2.mo53284e("purchase", "close-cookie-warning", aVar2.m24670c(intent2));
        }
        cookieRemindersActivity.setResult(2);
        cookieRemindersActivity.finish();
    }

    public void onBackPressed() {
        setResult(2);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout_cookie);
        mo50358x2("CookieRemindersActivity", true);
        C13619h hVar = C13619h.f21932a;
        C11204a aVar = f17662n;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        hVar.mo53284e("purchase", "show-cookie-warning", aVar.m24670c(intent));
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        ((TextView) mo46460z2(C13865f.textViewCookieSubtitle)).setText(getString(R.string.purchase_cookie_subtitle, new Object[]{aVar.m24670c(intent2)}));
        ((Button) mo46460z2(C13865f.buttonCookieContinue)).setOnClickListener(new C11882n(this));
    }

    /* renamed from: z2 */
    public View mo46460z2(int i) {
        Map<Integer, View> map = this.f17665m;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }
}
