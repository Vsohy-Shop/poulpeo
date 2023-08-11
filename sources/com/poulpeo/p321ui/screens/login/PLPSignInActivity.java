package com.poulpeo.p321ui.screens.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.adjust.sdk.Constants;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.login.PLPMainSignUpActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p317cd.C11037b;
import p383ld.C12834d;
import p404of.C13074a;
import p413qa.C13219a;
import p413qa.C13220b;
import p438ub.C13542a;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.login.PLPSignInActivity */
/* compiled from: PLPSignInActivity.kt */
public final class PLPSignInActivity extends C12834d {

    /* renamed from: g0 */
    public static final C11140a f17367g0 = new C11140a((DefaultConstructorMarker) null);

    /* renamed from: h0 */
    public static final int f17368h0 = 8;

    /* renamed from: c0 */
    private final Lazy f17369c0 = C11901h.m25690b(new C11142c(this));

    /* renamed from: d0 */
    private final Lazy f17370d0 = C11901h.m25690b(new C11143d(this));

    /* renamed from: e0 */
    private final Lazy f17371e0 = C11901h.m25690b(new C11141b(this));

    /* renamed from: f0 */
    public Map<Integer, View> f17372f0 = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.login.PLPSignInActivity$a */
    /* compiled from: PLPSignInActivity.kt */
    public static final class C11140a {
        private C11140a() {
        }

        public /* synthetic */ C11140a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46289a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, PLPSignInActivity.class);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.PLPSignInActivity$b */
    /* compiled from: PLPSignInActivity.kt */
    static final class C11141b extends C12777p implements C13074a<Button> {

        /* renamed from: g */
        final /* synthetic */ PLPSignInActivity f17373g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11141b(PLPSignInActivity pLPSignInActivity) {
            super(0);
            this.f17373g = pLPSignInActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f17373g.findViewById(R.id.buttonLoginApple);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.PLPSignInActivity$c */
    /* compiled from: PLPSignInActivity.kt */
    static final class C11142c extends C12777p implements C13074a<Button> {

        /* renamed from: g */
        final /* synthetic */ PLPSignInActivity f17374g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11142c(PLPSignInActivity pLPSignInActivity) {
            super(0);
            this.f17374g = pLPSignInActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f17374g.findViewById(R.id.buttonLoginFacebook);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.login.PLPSignInActivity$d */
    /* compiled from: PLPSignInActivity.kt */
    static final class C11143d extends C12777p implements C13074a<Button> {

        /* renamed from: g */
        final /* synthetic */ PLPSignInActivity f17375g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11143d(PLPSignInActivity pLPSignInActivity) {
            super(0);
            this.f17375g = pLPSignInActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f17375g.findViewById(R.id.buttonLoginGoogle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H2 */
    public Button mo46271H2() {
        return (Button) this.f17371e0.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I2 */
    public Button mo46272I2() {
        return (Button) this.f17369c0.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J2 */
    public Button mo46273J2() {
        return (Button) this.f17370d0.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public C11037b mo46275U2() {
        C13542a a = C13542a.f21790p.mo53187a(this);
        return new C13220b(this, new C13220b.C13221a(mo47878o2(), false, C13219a.f21022a, a.f21468a, a.f21469b, a.f21470c, a.f21471d, a.f21472e, a.f21473f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d3 */
    public void mo46285d3() {
        C13618g.f21930b.mo53278b("login", "apple");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e3 */
    public void mo46286e3() {
        C13618g.f21930b.mo53278b("login", "facebook");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public void mo46287f3() {
        C13618g.f21930b.mo53278b("login", Constants.REFERRER_API_GOOGLE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l3 */
    public void mo46288l3() {
        C13618g.f21930b.mo53278b("login-form", "validation");
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (!mo50736N2().mo46099v2()) {
            if (view.getId() == R.id.textViewCreateAccount) {
                C13618g.f21930b.mo53278b("login", "signup-button");
                mo50736N2().mo46082Y2(false);
                mo50736N2().mo46083Z2(false);
                mo50736N2().mo46081X2(false);
                Intent d = PLPMainSignUpActivity.C11136a.m24136d(PLPMainSignUpActivity.f17354f0, this, (String) null, 2, (Object) null);
                d.setFlags(33554432);
                startActivity(d);
                mo47877n2();
                return;
            }
            super.onClick(view);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("SignInActivity", true);
        mo50755i3(true);
        View findViewById = findViewById(R.id.textViewCreateAccount);
        C12775o.m28638h(findViewById, "findViewById(R.id.textViewCreateAccount)");
        ((TextView) findViewById).setOnClickListener(this);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle((CharSequence) "");
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13618g.f21930b.mo53280e(new C13615d("login", C13617f.LOGIN));
    }

    /* renamed from: r1 */
    public void mo46115r1(boolean z, boolean z2, boolean z3) {
        startActivityForResult(SocialSignUpWarningActivity.f17390p.mo46306g(this, z, z2, z3), com.appboy.Constants.TRAFFIC_STATS_THREAD_TAG);
    }
}
