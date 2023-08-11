package com.poulpeo.p321ui.screens.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.iosadapters.android.content.ContextContainer;
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
import p368jd.C12616b;
import p404of.C13074a;
import p413qa.C13227h;
import p413qa.C13229i;
import p440ud.C13548a;
import p440ud.C13572p;
import p440ud.C13574r;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.login.SocialSignUpWarningActivity */
/* compiled from: SocialSignUpWarningActivity.kt */
public final class SocialSignUpWarningActivity extends C12616b implements C13229i {

    /* renamed from: p */
    public static final C11149a f17390p = new C11149a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17391q = 8;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final IntentDelegate.Boolean f17392r = new IntentDelegate.Boolean("isFacebookSignUp");
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final IntentDelegate.Boolean f17393s = new IntentDelegate.Boolean("isGoogleSignUp");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final IntentDelegate.Boolean f17394t = new IntentDelegate.Boolean("isAppleSignUp");

    /* renamed from: m */
    private final int f17395m;

    /* renamed from: n */
    private final Lazy f17396n = C11901h.m25690b(new C11150b(this));

    /* renamed from: o */
    public Map<Integer, View> f17397o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.login.SocialSignUpWarningActivity$a */
    /* compiled from: SocialSignUpWarningActivity.kt */
    public static final class C11149a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17398a;

        static {
            Class<C11149a> cls = C11149a.class;
            f17398a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "isFacebookSignUp", "isFacebookSignUp(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "isGoogleSignUp", "isGoogleSignUp(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "isAppleSignUp", "isAppleSignUp(Landroid/content/Intent;)Z", 0))};
        }

        private C11149a() {
        }

        public /* synthetic */ C11149a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m24182d(Intent intent) {
            return SocialSignUpWarningActivity.f17394t.getValue(intent, (KProperty<?>) f17398a[2]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final boolean m24183e(Intent intent) {
            return SocialSignUpWarningActivity.f17392r.getValue(intent, (KProperty<?>) f17398a[0]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final boolean m24184f(Intent intent) {
            return SocialSignUpWarningActivity.f17393s.getValue(intent, (KProperty<?>) f17398a[1]).booleanValue();
        }

        /* renamed from: h */
        private final void m24185h(Intent intent, boolean z) {
            SocialSignUpWarningActivity.f17394t.setValue(intent, (KProperty<?>) f17398a[2], z);
        }

        /* renamed from: i */
        private final void m24186i(Intent intent, boolean z) {
            SocialSignUpWarningActivity.f17392r.setValue(intent, (KProperty<?>) f17398a[0], z);
        }

        /* renamed from: j */
        private final void m24187j(Intent intent, boolean z) {
            SocialSignUpWarningActivity.f17393s.setValue(intent, (KProperty<?>) f17398a[1], z);
        }

        /* renamed from: g */
        public final Intent mo46306g(Context context, boolean z, boolean z2, boolean z3) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent(context, SocialSignUpWarningActivity.class);
            C11149a aVar = SocialSignUpWarningActivity.f17390p;
            aVar.m24186i(intent, z);
            aVar.m24187j(intent, z2);
            aVar.m24185h(intent, z3);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.SocialSignUpWarningActivity$b */
    /* compiled from: SocialSignUpWarningActivity.kt */
    static final class C11150b extends C12777p implements C13074a<C13227h> {

        /* renamed from: g */
        final /* synthetic */ SocialSignUpWarningActivity f17399g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11150b(SocialSignUpWarningActivity socialSignUpWarningActivity) {
            super(0);
            this.f17399g = socialSignUpWarningActivity;
        }

        /* renamed from: b */
        public final C13227h invoke() {
            SocialSignUpWarningActivity socialSignUpWarningActivity = this.f17399g;
            ContextContainer o2 = socialSignUpWarningActivity.mo47878o2();
            C11149a aVar = SocialSignUpWarningActivity.f17390p;
            Intent intent = this.f17399g.getIntent();
            C12775o.m28638h(intent, "intent");
            boolean b = aVar.m24183e(intent);
            Intent intent2 = this.f17399g.getIntent();
            C12775o.m28638h(intent2, "intent");
            boolean c = aVar.m24184f(intent2);
            Intent intent3 = this.f17399g.getIntent();
            C12775o.m28638h(intent3, "intent");
            return new C13227h(socialSignUpWarningActivity, new C13227h.C13228a(o2, b, c, aVar.m24182d(intent3), new C13574r((RelativeLayout) this.f17399g.mo46303A2(C13865f.layoutMainContainer)), new C13572p((TextView) this.f17399g.mo46303A2(C13865f.textViewDescription)), new C13548a((Button) this.f17399g.mo46303A2(C13865f.buttonValidate)), new C13548a((Button) this.f17399g.mo46303A2(C13865f.buttonCancel))));
        }
    }

    /* renamed from: E2 */
    private final C13227h m24174E2() {
        return (C13227h) this.f17396n.getValue();
    }

    /* renamed from: A2 */
    public View mo46303A2(int i) {
        Map<Integer, View> map = this.f17397o;
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

    /* renamed from: L1 */
    public void mo46304L1(boolean z, boolean z2, boolean z3) {
        startActivity(SignUpConsentActivity.f17376K.mo46301c(this, (String) null, z, z2, z3).addFlags(33554432));
        finish();
    }

    /* renamed from: S */
    public void mo46305S() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_social_signup_warning);
        mo50358x2("SocialSignUpWarningActivity", true);
        m24174E2().mo52868v2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m24174E2().mo52869w2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m24174E2().mo52870x2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m24174E2().mo52871y2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17395m;
    }
}
