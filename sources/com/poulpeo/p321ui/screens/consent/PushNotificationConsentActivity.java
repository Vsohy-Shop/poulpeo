package com.poulpeo.p321ui.screens.consent;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationManagerCompat;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.utils.AndroidUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p360id.C12134b;
import p360id.C12136d;
import p368jd.C12618d;
import p380la.C12789a;
import p380la.C12790b;
import p380la.C12791c;
import p380la.C12792d;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.consent.PushNotificationConsentActivity */
/* compiled from: PushNotificationConsentActivity.kt */
public final class PushNotificationConsentActivity extends C12618d {

    /* renamed from: n */
    public static final C11108a f17263n = new C11108a((DefaultConstructorMarker) null);

    /* renamed from: o */
    public static final int f17264o = 8;

    /* renamed from: m */
    public Map<Integer, View> f17265m = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.consent.PushNotificationConsentActivity$a */
    /* compiled from: PushNotificationConsentActivity.kt */
    public static final class C11108a {
        private C11108a() {
        }

        public /* synthetic */ C11108a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46202a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, PushNotificationConsentActivity.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m23957D2(PushNotificationConsentActivity pushNotificationConsentActivity, View view) {
        C12775o.m28639i(pushNotificationConsentActivity, "this$0");
        if (NotificationManagerCompat.from(pushNotificationConsentActivity).areNotificationsEnabled()) {
            pushNotificationConsentActivity.setResult(43);
            pushNotificationConsentActivity.finish();
            return;
        }
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(pushNotificationConsentActivity).setMessage((int) R.string.push_notification_consent_update_settings_dialog_message).setPositiveButton((int) R.string.push_notification_consent_update_settings_dialog_ok, (DialogInterface.OnClickListener) new C12792d(pushNotificationConsentActivity)).setNegativeButton((int) R.string.push_notification_consent_update_settings_dialog_cancel, (DialogInterface.OnClickListener) null);
        C12775o.m28638h(negativeButton, "Builder(this)\n          …ings_dialog_cancel, null)");
        C12134b.m26457c(negativeButton, pushNotificationConsentActivity, (Function1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m23958E2(PushNotificationConsentActivity pushNotificationConsentActivity, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(pushNotificationConsentActivity, "this$0");
        AndroidUtil.openNotificationsSettings(pushNotificationConsentActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m23959F2(PushNotificationConsentActivity pushNotificationConsentActivity, View view) {
        C12775o.m28639i(pushNotificationConsentActivity, "this$0");
        pushNotificationConsentActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m23960G2(PushNotificationConsentActivity pushNotificationConsentActivity, View view) {
        C12775o.m28639i(pushNotificationConsentActivity, "this$0");
        pushNotificationConsentActivity.startActivity(WebActivity.f17745z.mo46524c(pushNotificationConsentActivity));
    }

    /* renamed from: C2 */
    public View mo46201C2(int i) {
        Map<Integer, View> map = this.f17265m;
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

    public void onBackPressed() {
        C12136d.m26467i(this, R.string.push_notification_consent_back_message);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("PushNotificationConsentActivity", true);
        setContentView((int) R.layout.activity_push_notification_consent);
        ((AppCompatButton) mo46201C2(C13865f.buttonAccept)).setOnClickListener(new C12789a(this));
        ((AppCompatButton) mo46201C2(C13865f.buttonRefuse)).setOnClickListener(new C12790b(this));
        int i = C13865f.textViewPrivacy;
        ((TextView) mo46201C2(i)).setPaintFlags(((TextView) mo46201C2(i)).getPaintFlags() | 8);
        ((TextView) mo46201C2(i)).setOnClickListener(new C12791c(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13618g.f21930b.mo53280e(new C13615d("push-agreement", C13617f.AGREEMENT));
    }
}
