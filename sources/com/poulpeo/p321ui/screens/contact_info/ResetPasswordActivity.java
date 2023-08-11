package com.poulpeo.p321ui.screens.contact_info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.contact_info.C11130a;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p360id.C12136d;
import p368jd.C12616b;
import p404of.C13074a;
import p428sd.C13399d;
import p438ub.C13542a;
import p440ud.C13548a;
import p440ud.C13558g;
import p440ud.C13566l;
import p440ud.C13572p;
import p440ud.C13574r;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.contact_info.ResetPasswordActivity */
/* compiled from: ResetPasswordActivity.kt */
public final class ResetPasswordActivity extends C12616b implements C11132b {

    /* renamed from: p */
    public static final C11113a f17279p = new C11113a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17280q = 8;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final IntentDelegate.String f17281r = new IntentDelegate.String("screenOrigin");

    /* renamed from: m */
    private final int f17282m = R.string.reset_password_title;

    /* renamed from: n */
    private final Lazy f17283n = C11901h.m25690b(new C11114b(this));

    /* renamed from: o */
    public Map<Integer, View> f17284o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.contact_info.ResetPasswordActivity$a */
    /* compiled from: ResetPasswordActivity.kt */
    public static final class C11113a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17285a = {C12764h0.m28590f(new C12783v(C11113a.class, "screenOrigin", "getScreenOrigin(Landroid/content/Intent;)Ljava/lang/String;", 0))};

        private C11113a() {
        }

        public /* synthetic */ C11113a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m23996b(Intent intent) {
            return ResetPasswordActivity.f17281r.getValue(intent, (KProperty<?>) f17285a[0]);
        }

        /* renamed from: d */
        private final void m23997d(Intent intent, String str) {
            ResetPasswordActivity.f17281r.setValue(intent, (KProperty<?>) f17285a[0], str);
        }

        /* renamed from: c */
        public final Intent mo46217c(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "screenOrigin");
            Intent intent = new Intent(context, ResetPasswordActivity.class);
            ResetPasswordActivity.f17279p.m23997d(intent, str);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.contact_info.ResetPasswordActivity$b */
    /* compiled from: ResetPasswordActivity.kt */
    static final class C11114b extends C12777p implements C13074a<C11130a> {

        /* renamed from: g */
        final /* synthetic */ ResetPasswordActivity f17286g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11114b(ResetPasswordActivity resetPasswordActivity) {
            super(0);
            this.f17286g = resetPasswordActivity;
        }

        /* renamed from: b */
        public final C11130a invoke() {
            ResetPasswordActivity resetPasswordActivity = this.f17286g;
            C13566l lVar = new C13566l(resetPasswordActivity);
            C13689a aVar = new C13689a(this.f17286g.mo47878o2());
            C11113a aVar2 = ResetPasswordActivity.f17279p;
            Intent intent = this.f17286g.getIntent();
            C12775o.m28638h(intent, "intent");
            String a = aVar2.m23996b(intent);
            IProxyMethodType iProxyMethodType = ProxyMethodsPLPUser.PLP_USER_RESET_PASSWORD;
            RMNMethodParam rMNMethodParam = PLPMethodParameters.EMAIL;
            C13399d dVar = C13542a.f21790p.mo53187a(this.f17286g).f21472e;
            C13574r rVar = new C13574r((LinearLayout) this.f17286g.mo46212A2(C13865f.layoutContent));
            C13574r rVar2 = new C13574r((LinearLayout) this.f17286g.mo46212A2(C13865f.layoutAppleId));
            C13548a aVar3 = new C13548a((Button) this.f17286g.mo46212A2(C13865f.buttonAppleIdDoc));
            C13572p pVar = new C13572p((TextView) this.f17286g.mo46212A2(C13865f.textViewDescription));
            C13548a aVar4 = new C13548a((Button) this.f17286g.mo46212A2(C13865f.buttonSend));
            ResetPasswordActivity resetPasswordActivity2 = resetPasswordActivity;
            C13558g gVar = new C13558g((ProgressBar) this.f17286g.mo46212A2(C13865f.progressbarLoader));
            C13574r rVar3 = new C13574r((LinearLayout) this.f17286g.mo46212A2(C13865f.layoutSentConfirm));
            C13548a aVar5 = new C13548a((Button) this.f17286g.mo46212A2(C13865f.buttonSupport));
            C11130a.C11131a aVar6 = r3;
            C11130a.C11131a aVar7 = new C11130a.C11131a(lVar, aVar, a, iProxyMethodType, rMNMethodParam, dVar, rVar, rVar2, aVar3, pVar, aVar4, gVar, rVar3, aVar5);
            return new C11130a(resetPasswordActivity2, aVar6);
        }
    }

    /* renamed from: C2 */
    private final C11130a m23986C2() {
        return (C11130a) this.f17283n.getValue();
    }

    /* renamed from: A2 */
    public View mo46212A2(int i) {
        Map<Integer, View> map = this.f17284o;
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

    /* renamed from: H0 */
    public String mo46213H0() {
        String string = getString(R.string.reset_password_retry);
        C12775o.m28638h(string, "getString(R.string.reset_password_retry)");
        return string;
    }

    /* renamed from: P1 */
    public String mo46214P1(String str) {
        C12775o.m28639i(str, NotificationCompat.CATEGORY_EMAIL);
        String string = getString(R.string.reset_password_description, new Object[]{str});
        C12775o.m28638h(string, "getString(R.string.reset…sword_description, email)");
        return string;
    }

    /* renamed from: Z */
    public void mo46126Z(String str) {
        C12775o.m28639i(str, "errorMessage");
        C12136d.m26468j(this, str);
    }

    /* renamed from: k */
    public void mo46215k() {
        C12136d.m26467i(this, R.string.reset_password_fetch_error);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_reset_password);
        mo50358x2("ResetPasswordActivity", true);
        m23986C2().mo46120o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m23986C2().mo46121p2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m23986C2().mo46122q2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m23986C2().mo46123s2();
    }

    /* renamed from: p */
    public void mo46216p(PLPUser pLPUser) {
        C12775o.m28639i(pLPUser, "user");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17282m;
    }

    /* renamed from: z0 */
    public void mo46127z0() {
    }
}
