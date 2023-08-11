package com.poulpeo.p321ui.screens.notification_admin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.poulpeo.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p345gc.C12015a;
import p368jd.C12616b;
import p404of.C13088o;
import p440ud.C13574r;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p450wb.C13689a;
import p462yb.C13865f;
import p467za.C14069e;
import p467za.C14070f;
import p467za.C14071g;
import p467za.C14072h;
import p467za.C14073i;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.notification_admin.NotificationAdminActivity */
/* compiled from: NotificationAdminActivity.kt */
public final class NotificationAdminActivity extends C12616b {

    /* renamed from: p */
    public static final C11186a f17590p = new C11186a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17591q = 8;

    /* renamed from: m */
    private final int f17592m = R.string.menu_notification_admin;

    /* renamed from: n */
    private C14073i f17593n;

    /* renamed from: o */
    public Map<Integer, View> f17594o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.notification_admin.NotificationAdminActivity$a */
    /* compiled from: NotificationAdminActivity.kt */
    public static final class C11186a {
        private C11186a() {
        }

        public /* synthetic */ C11186a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46421a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, NotificationAdminActivity.class);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.notification_admin.NotificationAdminActivity$b */
    /* compiled from: NotificationAdminActivity.kt */
    static final class C11187b extends C12777p implements C13088o<String, String, C11921v> {

        /* renamed from: g */
        final /* synthetic */ NotificationAdminActivity f17595g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11187b(NotificationAdminActivity notificationAdminActivity) {
            super(2);
            this.f17595g = notificationAdminActivity;
        }

        /* renamed from: a */
        public final void mo46422a(String str, String str2) {
            C12775o.m28639i(str, "fcmToken");
            C12775o.m28639i(str2, "instanceId");
            new C12015a(this.f17595g, str, str2).onShareButtonClicked();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo46422a((String) obj, (String) obj2);
            return C11921v.f18618a;
        }
    }

    /* renamed from: F2 */
    private final void m24517F2(C13088o<? super String, ? super String, C11921v> oVar) {
        FirebaseMessaging.getInstance().getToken().mo35452c(new C14072h(oVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m24518G2(C13088o oVar, Task task) {
        String str;
        C12775o.m28639i(oVar, "$completion");
        C12775o.m28639i(task, "task");
        String str2 = "";
        if (task.mo35465p()) {
            String str3 = (String) task.mo35461l();
            if (str3 == null) {
                str3 = str2;
            }
            String H0 = C13755w.m31549H0(str3, ':', str2);
            str2 = str3;
            str = H0;
        } else {
            str = str2;
        }
        oVar.invoke(str2, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m24519H2(NotificationAdminActivity notificationAdminActivity, View view) {
        C12775o.m28639i(notificationAdminActivity, "this$0");
        C13618g.f21930b.mo53278b("parameters", Constants.PUSH);
        notificationAdminActivity.startActivity(PushNotificationAdminActivity.f17596v.mo46424a(notificationAdminActivity));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m24520I2(NotificationAdminActivity notificationAdminActivity, View view) {
        C12775o.m28639i(notificationAdminActivity, "this$0");
        C13618g.f21930b.mo53278b("parameters", NotificationCompat.CATEGORY_EMAIL);
        notificationAdminActivity.startActivity(MailNotificationAdminActivity.f17583v.mo46418a(notificationAdminActivity));
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m24521J2(NotificationAdminActivity notificationAdminActivity, View view) {
        C12775o.m28639i(notificationAdminActivity, "this$0");
        notificationAdminActivity.m24517F2(new C11187b(notificationAdminActivity));
    }

    /* renamed from: E2 */
    public View mo46420E2(int i) {
        Map<Integer, View> map = this.f17594o;
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
        mo50358x2("NotificationAdminActivity", true);
        setContentView(R.layout.activity_notification_admin);
        ((TextView) mo46420E2(C13865f.textViewPush)).setOnClickListener(new C14069e(this));
        ((TextView) mo46420E2(C13865f.textViewMail)).setOnClickListener(new C14070f(this));
        ((Button) mo46420E2(C13865f.buttonAdmin)).setOnClickListener(new C14071g(this));
        C14073i iVar = new C14073i(new C14073i.C14074a(mo47878o2(), new C13689a(mo47878o2()), new C13574r((RelativeLayout) mo46420E2(C13865f.layoutAdmin))));
        this.f17593n = iVar;
        iVar.mo53835n2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C14073i iVar = this.f17593n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo53836o2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C14073i iVar = this.f17593n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo53837p2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C14073i iVar = this.f17593n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo53838q2();
        C13618g.f21930b.mo53280e(new C13616e("parameters", C13617f.PROFILE));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17592m;
    }
}
