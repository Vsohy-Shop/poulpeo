package com.poulpeo.p321ui.screens.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import com.rmn.utils.AndroidUtil;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p360id.C12136d;
import p368jd.C12616b;
import p413qa.C13230j;
import p413qa.C13231k;
import p413qa.C13233l;
import p428sd.C13399d;
import p438ub.C13542a;
import p440ud.C13548a;
import p440ud.C13551d;
import p440ud.C13558g;
import p440ud.C13572p;
import p440ud.C13574r;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.login.SponsorshipCodeCheckActivity */
/* compiled from: SponsorshipCodeCheckActivity.kt */
public final class SponsorshipCodeCheckActivity extends C12616b implements C13233l {

    /* renamed from: p */
    public static final C11151a f17400p = new C11151a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17401q = 8;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final IntentDelegate.StringNullable f17402r = new IntentDelegate.StringNullable("sponsorshipCode");

    /* renamed from: m */
    private final int f17403m;

    /* renamed from: n */
    private C13231k f17404n;

    /* renamed from: o */
    public Map<Integer, View> f17405o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.login.SponsorshipCodeCheckActivity$a */
    /* compiled from: SponsorshipCodeCheckActivity.kt */
    public static final class C11151a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17406a = {C12764h0.m28590f(new C12783v(C11151a.class, "sponsorshipCode", "getSponsorshipCode(Landroid/content/Intent;)Ljava/lang/String;", 0))};

        private C11151a() {
        }

        public /* synthetic */ C11151a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m24198b(Intent intent) {
            return SponsorshipCodeCheckActivity.f17402r.getValue(intent, (KProperty<?>) f17406a[0]);
        }

        /* renamed from: d */
        private final void m24199d(Intent intent, String str) {
            SponsorshipCodeCheckActivity.f17402r.setValue(intent, (KProperty<?>) f17406a[0], str);
        }

        /* renamed from: c */
        public final Intent mo46311c(Context context, String str) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent(context, SponsorshipCodeCheckActivity.class);
            SponsorshipCodeCheckActivity.f17400p.m24199d(intent, str);
            return intent;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m24192D2(SponsorshipCodeCheckActivity sponsorshipCodeCheckActivity) {
        C12775o.m28639i(sponsorshipCodeCheckActivity, "this$0");
        AndroidUtil.showSoftKeyboard(sponsorshipCodeCheckActivity);
    }

    /* renamed from: B2 */
    public View mo46308B2(int i) {
        Map<Integer, View> map = this.f17405o;
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

    /* renamed from: N1 */
    public void mo46309N1(String str) {
        C12775o.m28639i(str, "errorMessage");
        C12136d.m26468j(this, str);
    }

    /* renamed from: S0 */
    public void mo46310S0(String str) {
        C12775o.m28639i(str, "sponsorshipCode");
        getIntent().putExtra("sponsorshipCode", str);
        setResult(456, getIntent());
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("SponsorshipCodeActivity", true);
        setContentView(R.layout.activity_sponsorship_code_check);
        ContextContainer o2 = mo47878o2();
        C13399d f = C13542a.f21790p.mo53187a(this).mo53181f();
        C13551d dVar = new C13551d((EditText) mo46308B2(C13865f.editTextSponsorshipCode));
        C13558g gVar = new C13558g((ProgressBar) mo46308B2(C13865f.progressView));
        C13548a aVar = new C13548a((Button) mo46308B2(C13865f.buttonValidate));
        C13574r rVar = new C13574r((LinearLayout) mo46308B2(C13865f.layoutValidate));
        C13572p pVar = new C13572p((TextView) mo46308B2(C13865f.textViewValid));
        C13572p pVar2 = new C13572p((TextView) mo46308B2(C13865f.textViewInvalid));
        ResourceStringWrapper resourceStringWrapper = new ResourceStringWrapper(R.string.sponsorship_code_check_valid_code_default_message);
        ResourceStringWrapper resourceStringWrapper2 = new ResourceStringWrapper(R.string.sponsorship_code_check_valid_code_message);
        C11151a aVar2 = f17400p;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        C13231k kVar = new C13231k(this, new C13231k.C13232a(o2, f, dVar, gVar, aVar, rVar, pVar, pVar2, resourceStringWrapper, resourceStringWrapper2, aVar2.m24198b(intent)));
        this.f17404n = kVar;
        kVar.mo52873p2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C13231k kVar = this.f17404n;
        if (kVar == null) {
            C12775o.m28656z("controller");
            kVar = null;
        }
        kVar.mo52874q2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C13231k kVar = this.f17404n;
        if (kVar == null) {
            C12775o.m28656z("controller");
            kVar = null;
        }
        kVar.mo52875r2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        ((EditText) mo46308B2(C13865f.editTextSponsorshipCode)).requestFocus();
        new Handler().postDelayed(new C13230j(this), 200);
        C13231k kVar = this.f17404n;
        if (kVar == null) {
            C12775o.m28656z("controller");
            kVar = null;
        }
        kVar.mo52876s2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17403m;
    }
}
