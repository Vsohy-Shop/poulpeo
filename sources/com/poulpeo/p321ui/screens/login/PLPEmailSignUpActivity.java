package com.poulpeo.p321ui.screens.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.utils.AndroidUtil;
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
import p383ld.C12836e;
import p404of.C13074a;
import p413qa.C13219a;
import p413qa.C13220b;
import p428sd.C13399d;
import p438ub.C13542a;
import p444vb.C13608a;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.login.PLPEmailSignUpActivity */
/* compiled from: PLPEmailSignUpActivity.kt */
public final class PLPEmailSignUpActivity extends C12836e {

    /* renamed from: f0 */
    public static final C11134a f17342f0 = new C11134a((DefaultConstructorMarker) null);

    /* renamed from: g0 */
    public static final int f17343g0 = 8;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public static final IntentDelegate.StringNullable f17344h0 = new IntentDelegate.StringNullable("sponsorshipCode");
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public static final IntentDelegate.Boolean f17345i0 = new IntentDelegate.Boolean("newsletterAccepted");

    /* renamed from: X */
    private final int f17346X = R.layout.activity_signup_email;

    /* renamed from: Y */
    private final Lazy f17347Y = C11901h.m25690b(new C11135b(this));

    /* renamed from: Z */
    private final Button f17348Z;

    /* renamed from: c0 */
    private final Button f17349c0;

    /* renamed from: d0 */
    private final Button f17350d0;

    /* renamed from: e0 */
    public Map<Integer, View> f17351e0 = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.login.PLPEmailSignUpActivity$a */
    /* compiled from: PLPEmailSignUpActivity.kt */
    public static final class C11134a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17352a;

        static {
            Class<C11134a> cls = C11134a.class;
            f17352a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "sponsorshipCode", "getSponsorshipCode(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "newsletterAccepted", "getNewsletterAccepted(Landroid/content/Intent;)Z", 0))};
        }

        private C11134a() {
        }

        public /* synthetic */ C11134a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final boolean m24117c(Intent intent) {
            return PLPEmailSignUpActivity.f17345i0.getValue(intent, (KProperty<?>) f17352a[1]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String m24118d(Intent intent) {
            return PLPEmailSignUpActivity.f17344h0.getValue(intent, (KProperty<?>) f17352a[0]);
        }

        /* renamed from: f */
        private final void m24119f(Intent intent, boolean z) {
            PLPEmailSignUpActivity.f17345i0.setValue(intent, (KProperty<?>) f17352a[1], z);
        }

        /* renamed from: g */
        private final void m24120g(Intent intent, String str) {
            PLPEmailSignUpActivity.f17344h0.setValue(intent, (KProperty<?>) f17352a[0], str);
        }

        /* renamed from: e */
        public final Intent mo46279e(Context context, String str, boolean z) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent(context, PLPEmailSignUpActivity.class);
            C11134a aVar = PLPEmailSignUpActivity.f17342f0;
            aVar.m24120g(intent, str);
            aVar.m24119f(intent, z);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.PLPEmailSignUpActivity$b */
    /* compiled from: PLPEmailSignUpActivity.kt */
    static final class C11135b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ PLPEmailSignUpActivity f17353g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11135b(PLPEmailSignUpActivity pLPEmailSignUpActivity) {
            super(0);
            this.f17353g = pLPEmailSignUpActivity;
        }

        public final String invoke() {
            return this.f17353g.getString(R.string.account_show_password);
        }
    }

    /* renamed from: l3 */
    private final C13220b m24105l3() {
        C11037b N2 = mo50736N2();
        C12775o.m28637g(N2, "null cannot be cast to non-null type com.poulpeo.ui.screens.login.PLPLoginController");
        return (C13220b) N2;
    }

    /* renamed from: m3 */
    private final String m24106m3() {
        return (String) this.f17347Y.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H2 */
    public Button mo46271H2() {
        return this.f17350d0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I2 */
    public Button mo46272I2() {
        return this.f17348Z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J2 */
    public Button mo46273J2() {
        return this.f17349c0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public int mo46274M2() {
        return this.f17346X;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public C11037b mo46275U2() {
        C13542a a = C13542a.f21790p.mo53187a(this);
        return new C13220b(this, new C13220b.C13221a(mo47878o2(), true, C13219a.f21022a, a.f21468a, (C13399d) null, (C13399d) null, (C13399d) null, a.f21472e, a.f21473f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h3 */
    public void mo46276h3() {
        C13618g.f21930b.mo53278b("signup-form", "validation");
    }

    /* renamed from: i3 */
    public View mo46277i3(int i) {
        Map<Integer, View> map = this.f17351e0;
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

    public void onClick(View view) {
        PasswordTransformationMethod passwordTransformationMethod;
        int i;
        C12775o.m28639i(view, "v");
        if (!mo50736N2().mo46099v2()) {
            if (view.getId() == R.id.textViewShowPassword) {
                TextView textView = this.f20515t;
                C12775o.m28636f(textView);
                boolean d = C12775o.m28634d(textView.getText(), m24106m3());
                EditText editText = this.f20509n;
                C12775o.m28636f(editText);
                if (d) {
                    passwordTransformationMethod = null;
                } else {
                    passwordTransformationMethod = mo50738P2();
                }
                editText.setTransformationMethod(passwordTransformationMethod);
                TextView textView2 = this.f20515t;
                C12775o.m28636f(textView2);
                if (d) {
                    i = R.string.account_hide_password;
                } else {
                    i = R.string.account_show_password;
                }
                textView2.setText(i);
                return;
            }
            super.onClick(view);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("PLPEmailSignUpActivity", true);
        TextView textView = (TextView) findViewById(R.id.textViewShowPassword);
        this.f20515t = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        EditText editText = this.f20509n;
        if (editText != null) {
            TextView textView2 = (TextView) mo46277i3(C13865f.textViewUppercase);
            C12775o.m28638h(textView2, "textViewUppercase");
            TextView textView3 = (TextView) mo46277i3(C13865f.textViewNumeric);
            C12775o.m28638h(textView3, "textViewNumeric");
            TextView textView4 = (TextView) mo46277i3(C13865f.textViewLength);
            C12775o.m28638h(textView4, "textViewLength");
            editText.addTextChangedListener(new C13608a(this, textView2, textView3, textView4));
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle((CharSequence) "");
        }
        AndroidUtil.showSoftKeyboard(this);
        C13220b l3 = m24105l3();
        C11134a aVar = f17342f0;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        l3.mo52865k3(aVar.m24118d(intent));
        l3.mo46085b3(true);
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        l3.mo46084a3(aVar.m24117c(intent2));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13618g.f21930b.mo53280e(new C13615d("signup-form", C13617f.SIGN_UP));
    }

    /* renamed from: r1 */
    public void mo46115r1(boolean z, boolean z2, boolean z3) {
    }
}
