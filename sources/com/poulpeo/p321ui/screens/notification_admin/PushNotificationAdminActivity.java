package com.poulpeo.p321ui.screens.notification_admin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationManagerCompat;
import com.adjust.sdk.Constants;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.utils.AndroidUtil;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p360id.C12139g;
import p404of.C13074a;
import p438ub.C13542a;
import p440ud.C13568n;
import p440ud.C13574r;
import p450wb.C13689a;
import p462yb.C13865f;
import p467za.C14065c;
import p467za.C14076k;
import p467za.C14077l;
import p467za.C14078m;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.notification_admin.PushNotificationAdminActivity */
/* compiled from: PushNotificationAdminActivity.kt */
public final class PushNotificationAdminActivity extends C11190a {

    /* renamed from: v */
    public static final C11188a f17596v = new C11188a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f17597w = 8;

    /* renamed from: r */
    private final int f17598r = R.layout.activity_push_notification_admin;

    /* renamed from: s */
    private final int f17599s = R.string.notification_admin_push;

    /* renamed from: t */
    private final Lazy f17600t = C11901h.m25690b(new C11189b(this));

    /* renamed from: u */
    public Map<Integer, View> f17601u = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.notification_admin.PushNotificationAdminActivity$a */
    /* compiled from: PushNotificationAdminActivity.kt */
    public static final class C11188a {
        private C11188a() {
        }

        public /* synthetic */ C11188a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46424a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, PushNotificationAdminActivity.class);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.notification_admin.PushNotificationAdminActivity$b */
    /* compiled from: PushNotificationAdminActivity.kt */
    static final class C11189b extends C12777p implements C13074a<C14078m> {

        /* renamed from: g */
        final /* synthetic */ PushNotificationAdminActivity f17602g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11189b(PushNotificationAdminActivity pushNotificationAdminActivity) {
            super(0);
            this.f17602g = pushNotificationAdminActivity;
        }

        /* renamed from: b */
        public final C14078m invoke() {
            List n = C12726w.m28527n(new C14076k(new C13574r((LinearLayout) this.f17602g.mo46423H2(C13865f.layoutEarning)), new C13568n((Switch) this.f17602g.mo46423H2(C13865f.switchEarning)), PLPMethodParameters.PLP_PUSH_NOTIFICATION_EARNING, PLPMethodReturns.PLP_PUSH_NOTIFICATION_EARNING, Constants.PUSH, "gain"), new C14076k(new C13574r((LinearLayout) this.f17602g.mo46423H2(C13865f.layoutCashbackIncrease)), new C13568n((Switch) this.f17602g.mo46423H2(C13865f.switchCashbackIncrease)), PLPMethodParameters.PLP_PUSH_NOTIFICATION_CASHBACK_INCREASE, PLPMethodReturns.PLP_PUSH_NOTIFICATION_CASHBACK_INCREASE, Constants.PUSH, "cashback-increase"));
            PushNotificationAdminActivity pushNotificationAdminActivity = this.f17602g;
            return new C14078m(pushNotificationAdminActivity, new C14065c.C14067b(pushNotificationAdminActivity.mo47878o2(), new C13689a(this.f17602g.mo47878o2()), n, new C13574r((RelativeLayout) this.f17602g.mo46423H2(C13865f.layoutProgressView)), new C13574r((LinearLayout) this.f17602g.mo46423H2(C13865f.layoutContent)), C13542a.f21790p.mo53187a(this.f17602g).mo53179d()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m24527I2(PushNotificationAdminActivity pushNotificationAdminActivity, View view) {
        C12775o.m28639i(pushNotificationAdminActivity, "this$0");
        AndroidUtil.openNotificationsSettings(pushNotificationAdminActivity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public C14065c mo46415C2() {
        return (C14065c) this.f17600t.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public int mo46416D2() {
        return this.f17598r;
    }

    /* renamed from: H2 */
    public View mo46423H2(int i) {
        Map<Integer, View> map = this.f17601u;
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("PushNotificationAdminActivity", true);
        ((Button) mo46423H2(C13865f.buttonSettings)).setOnClickListener(new C14077l(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        boolean areNotificationsEnabled = NotificationManagerCompat.from(this).areNotificationsEnabled();
        LinearLayout linearLayout = (LinearLayout) mo46423H2(C13865f.layoutNotificationsDisabled);
        C12775o.m28638h(linearLayout, "layoutNotificationsDisabled");
        C12139g.m26475d(linearLayout, !areNotificationsEnabled, 0, 2, (Object) null);
        mo46415C2().mo53827E2(areNotificationsEnabled);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17599s;
    }
}
