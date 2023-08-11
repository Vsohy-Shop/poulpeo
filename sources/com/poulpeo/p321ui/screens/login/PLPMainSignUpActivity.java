package com.poulpeo.p321ui.screens.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.adjust.sdk.Constants;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.login.SponsorshipCodeCheckActivity;
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
import p317cd.C11037b;
import p360id.C12139g;
import p383ld.C12836e;
import p404of.C13074a;
import p413qa.C13219a;
import p413qa.C13220b;
import p438ub.C13542a;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.login.PLPMainSignUpActivity */
/* compiled from: PLPMainSignUpActivity.kt */
public final class PLPMainSignUpActivity extends C12836e {

    /* renamed from: f0 */
    public static final C11136a f17354f0 = new C11136a((DefaultConstructorMarker) null);

    /* renamed from: g0 */
    public static final int f17355g0 = 8;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public static final IntentDelegate.StringNullable f17356h0 = new IntentDelegate.StringNullable("sponsorshipCode");

    /* renamed from: X */
    private final int f17357X = R.layout.activity_signup_main;

    /* renamed from: Y */
    private String f17358Y;

    /* renamed from: Z */
    private final Lazy f17359Z = C11901h.m25690b(new C11138c(this));

    /* renamed from: c0 */
    private final Lazy f17360c0 = C11901h.m25690b(new C11139d(this));

    /* renamed from: d0 */
    private final Lazy f17361d0 = C11901h.m25690b(new C11137b(this));

    /* renamed from: e0 */
    public Map<Integer, View> f17362e0 = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.login.PLPMainSignUpActivity$a */
    /* compiled from: PLPMainSignUpActivity.kt */
    public static final class C11136a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17363a = {C12764h0.m28590f(new C12783v(C11136a.class, "sponsorshipCode", "getSponsorshipCode(Landroid/content/Intent;)Ljava/lang/String;", 0))};

        private C11136a() {
        }

        public /* synthetic */ C11136a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m24135b(Intent intent) {
            return PLPMainSignUpActivity.f17356h0.getValue(intent, (KProperty<?>) f17363a[0]);
        }

        /* renamed from: d */
        public static /* synthetic */ Intent m24136d(C11136a aVar, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return aVar.mo46281c(context, str);
        }

        /* renamed from: e */
        private final void m24137e(Intent intent, String str) {
            PLPMainSignUpActivity.f17356h0.setValue(intent, (KProperty<?>) f17363a[0], str);
        }

        /* renamed from: c */
        public final Intent mo46281c(Context context, String str) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent(context, PLPMainSignUpActivity.class);
            PLPMainSignUpActivity.f17354f0.m24137e(intent, str);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.PLPMainSignUpActivity$b */
    /* compiled from: PLPMainSignUpActivity.kt */
    static final class C11137b extends C12777p implements C13074a<Button> {

        /* renamed from: g */
        final /* synthetic */ PLPMainSignUpActivity f17364g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11137b(PLPMainSignUpActivity pLPMainSignUpActivity) {
            super(0);
            this.f17364g = pLPMainSignUpActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f17364g.findViewById(R.id.buttonLoginApple);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.PLPMainSignUpActivity$c */
    /* compiled from: PLPMainSignUpActivity.kt */
    static final class C11138c extends C12777p implements C13074a<Button> {

        /* renamed from: g */
        final /* synthetic */ PLPMainSignUpActivity f17365g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11138c(PLPMainSignUpActivity pLPMainSignUpActivity) {
            super(0);
            this.f17365g = pLPMainSignUpActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f17365g.findViewById(R.id.buttonLoginFacebook);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.PLPMainSignUpActivity$d */
    /* compiled from: PLPMainSignUpActivity.kt */
    static final class C11139d extends C12777p implements C13074a<Button> {

        /* renamed from: g */
        final /* synthetic */ PLPMainSignUpActivity f17366g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11139d(PLPMainSignUpActivity pLPMainSignUpActivity) {
            super(0);
            this.f17366g = pLPMainSignUpActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f17366g.findViewById(R.id.buttonLoginGoogle);
        }
    }

    /* renamed from: k3 */
    private final CharSequence m24123k3(String str, String str2, String str3) {
        SpannableString spannableString = new SpannableString(str);
        int W = C13755w.m31571W(str, str2, 0, false, 6, (Object) null);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.theme)), W, str2.length() + W, 33);
        if (str3 != null) {
            int W2 = C13755w.m31571W(str, str3, 0, false, 6, (Object) null);
            int length = str3.length() + W2;
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.text_subtitle_default)), W2, length, 33);
            spannableString.setSpan(new StrikethroughSpan(), W2, length, 33);
        }
        return spannableString;
    }

    /* renamed from: l3 */
    static /* synthetic */ CharSequence m24124l3(PLPMainSignUpActivity pLPMainSignUpActivity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return pLPMainSignUpActivity.m24123k3(str, str2, str3);
    }

    /* renamed from: m3 */
    private final C13220b m24125m3() {
        C11037b N2 = mo50736N2();
        C12775o.m28637g(N2, "null cannot be cast to non-null type com.poulpeo.ui.screens.login.PLPLoginController");
        return (C13220b) N2;
    }

    /* renamed from: n3 */
    private final void m24126n3() {
        SponsorshipCodeCheckActivity.C11151a aVar = SponsorshipCodeCheckActivity.f17400p;
        C11136a aVar2 = f17354f0;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        startActivityForResult(aVar.mo46311c(this, aVar2.m24135b(intent)), 789);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H2 */
    public Button mo46271H2() {
        return (Button) this.f17361d0.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I2 */
    public Button mo46272I2() {
        return (Button) this.f17359Z.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J2 */
    public Button mo46273J2() {
        return (Button) this.f17360c0.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public int mo46274M2() {
        return this.f17357X;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public C11037b mo46275U2() {
        C13542a a = C13542a.f21790p.mo53187a(this);
        return new C13220b(this, new C13220b.C13221a(mo47878o2(), true, C13219a.f21022a, a.f21468a, a.f21469b, a.f21470c, a.f21471d, a.f21472e, a.f21473f));
    }

    /* renamed from: i3 */
    public View mo46280i3(int i) {
        Map<Integer, View> map = this.f17362e0;
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
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 789 && i2 == 456 && intent != null) {
            m24125m3().mo52865k3(intent.getStringExtra("sponsorshipCode"));
            String string = getString(R.string.account_signup_subtitle_sponsored);
            C12775o.m28638h(string, "getString(R.string.accou…ignup_subtitle_sponsored)");
            String string2 = getString(R.string.account_signup_sponsored_bonus);
            C12775o.m28638h(string2, "getString(R.string.account_signup_sponsored_bonus)");
            ((TextView) mo46280i3(C13865f.textViewTitle)).setText(getString(R.string.account_signup_title_sponsored));
            TextView textView = (TextView) mo46280i3(C13865f.textViewSubtitle);
            String str = this.f17358Y;
            if (str == null) {
                C12775o.m28656z("defaultBonus");
                str = null;
            }
            textView.setText(m24123k3(string, string2, str));
            Button button = (Button) mo46280i3(C13865f.buttonSponsored);
            C12775o.m28638h(button, "buttonSponsored");
            C12139g.m26475d(button, false, 0, 2, (Object) null);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (!mo50736N2().mo46099v2()) {
            switch (view.getId()) {
                case R.id.buttonEmailSignup:
                    C13618g.f21930b.mo53278b("signup", NotificationCompat.CATEGORY_EMAIL);
                    startActivity(SignUpConsentActivity.f17376K.mo46301c(this, m24125m3().mo52864j3(), false, false, false));
                    return;
                case R.id.buttonLoginApple:
                    C13618g.f21930b.mo53278b("signup", "apple");
                    mo46115r1(false, false, true);
                    return;
                case R.id.buttonLoginFacebook:
                    C13618g.f21930b.mo53278b("signup", "facebook");
                    mo46115r1(true, false, false);
                    return;
                case R.id.buttonLoginGoogle:
                    C13618g.f21930b.mo53278b("signup", Constants.REFERRER_API_GOOGLE);
                    mo46115r1(false, true, false);
                    return;
                case R.id.buttonSponsored:
                    C13618g.f21930b.mo53278b("signup", "sponsorship-button");
                    m24126n3();
                    return;
                case R.id.textViewLoginExisting:
                    C13618g.f21930b.mo53278b("signup", "login-button");
                    Intent a = PLPSignInActivity.f17367g0.mo46289a(this);
                    a.setFlags(33554432);
                    startActivity(a);
                    mo47877n2();
                    return;
                default:
                    super.onClick(view);
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        mo50358x2("PLPMainSignUpActivity", true);
        ((Button) mo46280i3(C13865f.buttonEmailSignup)).setOnClickListener(this);
        ((Button) mo46280i3(C13865f.buttonSponsored)).setOnClickListener(this);
        ((TextView) mo46280i3(C13865f.textViewLoginExisting)).setOnClickListener(this);
        String string = getString(R.string.account_signup_default_bonus);
        C12775o.m28638h(string, "getString(R.string.account_signup_default_bonus)");
        this.f17358Y = string;
        String string2 = getString(R.string.account_signup_subtitle);
        C12775o.m28638h(string2, "getString(R.string.account_signup_subtitle)");
        TextView textView = (TextView) mo46280i3(C13865f.textViewSubtitle);
        String str = this.f17358Y;
        if (str == null) {
            C12775o.m28656z("defaultBonus");
            str = null;
        }
        textView.setText(m24124l3(this, string2, str, (String) null, 4, (Object) null));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle((CharSequence) "");
        }
        C11136a aVar = f17354f0;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String a = aVar.m24135b(intent);
        if (!(a == null || a.length() == 0)) {
            z = false;
        }
        if (!z) {
            m24126n3();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13618g.f21930b.mo53280e(new C13615d("signup", C13617f.SIGN_UP));
    }

    /* renamed from: r1 */
    public void mo46115r1(boolean z, boolean z2, boolean z3) {
        startActivityForResult(SignUpConsentActivity.f17376K.mo46301c(this, (String) null, z, z2, z3), com.appboy.Constants.TRAFFIC_STATS_THREAD_TAG);
    }
}
