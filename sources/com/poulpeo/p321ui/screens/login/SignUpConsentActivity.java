package com.poulpeo.p321ui.screens.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.login.PLPEmailSignUpActivity;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p336ef.C11921v;
import p383ld.C12839h;
import p404of.C13074a;
import p409pc.C13200d;
import p413qa.C13223d;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.login.SignUpConsentActivity */
/* compiled from: SignUpConsentActivity.kt */
public final class SignUpConsentActivity extends C12839h {

    /* renamed from: K */
    public static final C11144a f17376K = new C11144a((DefaultConstructorMarker) null);

    /* renamed from: M */
    public static final int f17377M = 8;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final IntentDelegate.StringNullable f17378X = new IntentDelegate.StringNullable("sponsorshipCode");

    /* renamed from: E */
    private final int f17379E;

    /* renamed from: F */
    private final Lazy f17380F = C11901h.m25690b(new C11147d(this));

    /* renamed from: G */
    private final Lazy f17381G = C11901h.m25690b(new C11148e(this));

    /* renamed from: H */
    private final Lazy f17382H = C11901h.m25690b(new C11145b(this));

    /* renamed from: I */
    private final Function1<Boolean, C11921v> f17383I = new C11146c(this);

    /* renamed from: J */
    public Map<Integer, View> f17384J = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.login.SignUpConsentActivity$a */
    /* compiled from: SignUpConsentActivity.kt */
    public static final class C11144a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17385a = {C12764h0.m28590f(new C12783v(C11144a.class, "sponsorshipCode", "getSponsorshipCode(Landroid/content/Intent;)Ljava/lang/String;", 0))};

        private C11144a() {
        }

        public /* synthetic */ C11144a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m24168b(Intent intent) {
            return SignUpConsentActivity.f17378X.getValue(intent, (KProperty<?>) f17385a[0]);
        }

        /* renamed from: d */
        private final void m24169d(Intent intent, String str) {
            SignUpConsentActivity.f17378X.setValue(intent, (KProperty<?>) f17385a[0], str);
        }

        /* renamed from: c */
        public final Intent mo46301c(Context context, String str, boolean z, boolean z2, boolean z3) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent(context, SignUpConsentActivity.class);
            C12839h.f20540z.mo50764d(intent, z, z2, z3);
            SignUpConsentActivity.f17376K.m24169d(intent, str);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.SignUpConsentActivity$b */
    /* compiled from: SignUpConsentActivity.kt */
    static final class C11145b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ SignUpConsentActivity f17386g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11145b(SignUpConsentActivity signUpConsentActivity) {
            super(0);
            this.f17386g = signUpConsentActivity;
        }

        public final String invoke() {
            return this.f17386g.getString(R.string.signup_consent_apple);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.SignUpConsentActivity$c */
    /* compiled from: SignUpConsentActivity.kt */
    static final class C11146c extends C12777p implements Function1<Boolean, C11921v> {

        /* renamed from: g */
        final /* synthetic */ SignUpConsentActivity f17387g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11146c(SignUpConsentActivity signUpConsentActivity) {
            super(1);
            this.f17387g = signUpConsentActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C11921v.f18618a;
        }

        public final void invoke(boolean z) {
            SignUpConsentActivity signUpConsentActivity = this.f17387g;
            PLPEmailSignUpActivity.C11134a aVar = PLPEmailSignUpActivity.f17342f0;
            C11144a aVar2 = SignUpConsentActivity.f17376K;
            Intent intent = signUpConsentActivity.getIntent();
            C12775o.m28638h(intent, "intent");
            signUpConsentActivity.startActivity(aVar.mo46279e(signUpConsentActivity, aVar2.m24168b(intent), z));
            this.f17387g.mo47877n2();
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.SignUpConsentActivity$d */
    /* compiled from: SignUpConsentActivity.kt */
    static final class C11147d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ SignUpConsentActivity f17388g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11147d(SignUpConsentActivity signUpConsentActivity) {
            super(0);
            this.f17388g = signUpConsentActivity;
        }

        public final String invoke() {
            return this.f17388g.getString(R.string.signup_consent_facebook);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.SignUpConsentActivity$e */
    /* compiled from: SignUpConsentActivity.kt */
    static final class C11148e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ SignUpConsentActivity f17389g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11148e(SignUpConsentActivity signUpConsentActivity) {
            super(0);
            this.f17389g = signUpConsentActivity;
        }

        public final String invoke() {
            return this.f17389g.getString(R.string.signup_consent_google);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m24157Z2(SignUpConsentActivity signUpConsentActivity, View view) {
        C12775o.m28639i(signUpConsentActivity, "this$0");
        signUpConsentActivity.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public CharSequence mo46293G2() {
        Object value = this.f17382H.getValue();
        C12775o.m28638h(value, "<get-applePrivacyText>(...)");
        return (CharSequence) value;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K2 */
    public Function1<Boolean, C11921v> mo46294K2() {
        return this.f17383I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L2 */
    public CharSequence mo46295L2() {
        Object value = this.f17380F.getValue();
        C12775o.m28638h(value, "<get-facebookPrivacyText>(...)");
        return (CharSequence) value;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public CharSequence mo46296M2() {
        Object value = this.f17381G.getValue();
        C12775o.m28638h(value, "<get-googlePrivacyText>(...)");
        return (CharSequence) value;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo46297T2(Context context) {
        C12775o.m28639i(context, "context");
        C13618g.f21930b.mo53278b("consent", "privacy-policy");
        startActivity(WebActivity.f17745z.mo46524c(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo46298U2(Context context) {
        C12775o.m28639i(context, "context");
        startActivity(WebActivity.f17745z.mo46526e(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo46299V2(boolean z) {
        String str;
        if (z) {
            str = "consent" + "|subscribe-newsletter";
        } else {
            str = "consent";
        }
        C13618g.f21930b.mo53279c("consent", "validate", str);
        if (z) {
            C13200d.f21007a.mo52835m(this);
        }
    }

    /* renamed from: X2 */
    public View mo46300X2(int i) {
        Map<Integer, View> map = this.f17384J;
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
        mo50358x2("SignUpConsentActivity", true);
        ((RelativeLayout) mo46300X2(C13865f.layoutMainContainer)).setOnClickListener(new C13223d(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13618g.f21930b.mo53280e(new C13615d("consent", C13617f.CONSENT));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17379E;
    }
}
