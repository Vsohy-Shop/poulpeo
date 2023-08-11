package com.poulpeo.p321ui.screens.consent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p334ed.C11884a;
import p334ed.C11887b;
import p360id.C12136d;
import p368jd.C12618d;
import p375kd.C12652a;
import p375kd.C12656b;
import p380la.C12793e;
import p440ud.C13548a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.consent.TermsConsentActivity */
/* compiled from: TermsConsentActivity.kt */
public final class TermsConsentActivity extends C12618d implements C12656b {

    /* renamed from: o */
    public static final C11109a f17266o = new C11109a((DefaultConstructorMarker) null);

    /* renamed from: p */
    public static final int f17267p = 8;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final IntentDelegate.Int f17268q = new IntentDelegate.Int("currentTerms");

    /* renamed from: m */
    private C12793e f17269m;

    /* renamed from: n */
    public Map<Integer, View> f17270n = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.consent.TermsConsentActivity$a */
    /* compiled from: TermsConsentActivity.kt */
    public static final class C11109a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17271a = {C12764h0.m28590f(new C12783v(C11109a.class, "currentTerms", "getCurrentTerms(Landroid/content/Intent;)I", 0))};

        private C11109a() {
        }

        public /* synthetic */ C11109a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final int m23971b(Intent intent) {
            return TermsConsentActivity.f17268q.getValue(intent, (KProperty<?>) f17271a[0]).intValue();
        }

        /* renamed from: d */
        private final void m23972d(Intent intent, int i) {
            TermsConsentActivity.f17268q.setValue(intent, (KProperty<?>) f17271a[0], i);
        }

        /* renamed from: c */
        public final Intent mo46207c(Context context, int i) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent(context, TermsConsentActivity.class);
            TermsConsentActivity.f17266o.m23972d(intent, i);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.consent.TermsConsentActivity$b */
    /* compiled from: TermsConsentActivity.kt */
    public static final class C11110b extends ClickableSpan {

        /* renamed from: b */
        final /* synthetic */ TermsConsentActivity f17272b;

        C11110b(TermsConsentActivity termsConsentActivity) {
            this.f17272b = termsConsentActivity;
        }

        public void onClick(View view) {
            C12775o.m28639i(view, "widget");
            TermsConsentActivity termsConsentActivity = this.f17272b;
            termsConsentActivity.startActivity(WebActivity.f17745z.mo46526e(termsConsentActivity));
        }
    }

    /* renamed from: com.poulpeo.ui.screens.consent.TermsConsentActivity$c */
    /* compiled from: TermsConsentActivity.kt */
    public static final class C11111c extends ClickableSpan {

        /* renamed from: b */
        final /* synthetic */ TermsConsentActivity f17273b;

        C11111c(TermsConsentActivity termsConsentActivity) {
            this.f17273b = termsConsentActivity;
        }

        public void onClick(View view) {
            C12775o.m28639i(view, "widget");
            TermsConsentActivity termsConsentActivity = this.f17273b;
            termsConsentActivity.startActivity(WebActivity.f17745z.mo46524c(termsConsentActivity));
        }
    }

    /* renamed from: L0 */
    public void mo46203L0(boolean z) {
        if (z) {
            setResult(3601);
        }
        finish();
    }

    /* renamed from: i */
    public void mo46204i() {
        C11887b bVar = new C11887b();
        bVar.setCancelable(false);
        C11884a.f18565e.mo49090c(this, "overlay_fragment", bVar);
    }

    public void onBackPressed() {
        C12136d.m26467i(this, R.string.terms_consent_back_message);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_terms_consent);
        mo50358x2("TermsConsentActivity", true);
        ContextContainer o2 = mo47878o2();
        C11109a aVar = f17266o;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        C12793e eVar = new C12793e(this, new C12652a.C12655c(o2, aVar.m23971b(intent), new C13548a((Button) mo46206y2(C13865f.buttonValidate))));
        this.f17269m = eVar;
        eVar.mo50401s2();
        String string = getString(R.string.terms_consent_terms);
        C12775o.m28638h(string, "getString(R.string.terms_consent_terms)");
        String string2 = getString(R.string.terms_consent_privacy);
        C12775o.m28638h(string2, "getString(R.string.terms_consent_privacy)");
        SpannableString spannableString = new SpannableString(getString(R.string.terms_consent_subtitle, new Object[]{string, string2}));
        int W = C13755w.m31571W(spannableString, string, 0, false, 6, (Object) null);
        int length = string.length() + W;
        int W2 = C13755w.m31571W(spannableString, string2, 0, false, 6, (Object) null);
        int length2 = string2.length() + W2;
        spannableString.setSpan(new UnderlineSpan(), W, length, 33);
        spannableString.setSpan(new C11110b(this), W, length, 33);
        spannableString.setSpan(new UnderlineSpan(), W2, length2, 33);
        spannableString.setSpan(new C11111c(this), W2, length2, 33);
        int i = C13865f.textViewSubtitle;
        ((TextView) mo46206y2(i)).setText(spannableString);
        ((TextView) mo46206y2(i)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: r */
    public void mo46205r() {
        C11884a.f18565e.mo49089a(this, "overlay_fragment");
    }

    /* renamed from: y2 */
    public View mo46206y2(int i) {
        Map<Integer, View> map = this.f17270n;
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
}
