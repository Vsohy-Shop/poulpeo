package com.poulpeo.p321ui.screens.merchant;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.appbar.AppBarLayout;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.poulpeo_plus.PoulpeoPlusActivity;
import com.poulpeo.p321ui.screens.purchase.activation.CashbackActivationActivity;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.MerchantBonus;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.IntentDelegate;
import java.security.AccessController;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p102g9.C7832a;
import p102g9.C7834c;
import p360id.C12136d;
import p360id.C12137e;
import p360id.C12139g;
import p368jd.C12616b;
import p409pc.C13200d;
import p431ta.C13447a;
import p431ta.C13448b;
import p431ta.C13449c;
import p440ud.C13565k;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p445vc.C13619h;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.merchant.CashbackConditionsActivity */
/* compiled from: CashbackConditionsActivity.kt */
public final class CashbackConditionsActivity extends C12616b {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final IntentDelegate.String f17451A = new IntentDelegate.String("bonusPlpPlusAmountText");
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final IntentDelegate.Boolean f17452B = new IntentDelegate.Boolean("userIsMemberPoulpeoPlus");

    /* renamed from: q */
    public static final C11158a f17453q = new C11158a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final int f17454r = 8;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static Merchant f17455s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final IntentDelegate.String f17456t = new IntentDelegate.String("merchantId");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final IntentDelegate.String f17457u = new IntentDelegate.String("merchantName");
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final IntentDelegate.String f17458v = new IntentDelegate.String("cashbackTitle");
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final IntentDelegate.String f17459w = new IntentDelegate.String("cashbackConditionsRawHtml");
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final IntentDelegate.Boolean f17460x = new IntentDelegate.Boolean("merchantHasFlagNoSupport");
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final IntentDelegate.Boolean f17461y = new IntentDelegate.Boolean("isAvailableEveryWhere");
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final IntentDelegate.Boolean f17462z = new IntentDelegate.Boolean("merchanthasBonusPlpPlus");

    /* renamed from: m */
    private final int f17463m;

    /* renamed from: n */
    private TextView f17464n;

    /* renamed from: o */
    private TextView f17465o;

    /* renamed from: p */
    public Map<Integer, View> f17466p = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.merchant.CashbackConditionsActivity$a */
    /* compiled from: CashbackConditionsActivity.kt */
    public static final class C11158a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17467a;

        static {
            Class<C11158a> cls = C11158a.class;
            f17467a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "merchantId", "getMerchantId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "merchantName", "getMerchantName(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "cashbackTitle", "getCashbackTitle(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "cashbackConditionsRawHtml", "getCashbackConditionsRawHtml(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "merchantHasFlagNoSupport", "getMerchantHasFlagNoSupport(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "isAvailableEveryWhere", "isAvailableEveryWhere(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "merchanthasBonusPlpPlus", "getMerchanthasBonusPlpPlus(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "bonusPlpPlusAmountText", "getBonusPlpPlusAmountText(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "userIsMemberPoulpeoPlus", "getUserIsMemberPoulpeoPlus(Landroid/content/Intent;)Z", 0))};
        }

        private C11158a() {
        }

        public /* synthetic */ C11158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: A */
        private final void m24290A(Intent intent, boolean z) {
            CashbackConditionsActivity.f17452B.setValue(intent, (KProperty<?>) f17467a[8], z);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final String m24299i(Intent intent) {
            return CashbackConditionsActivity.f17451A.getValue(intent, (KProperty<?>) f17467a[7]);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final String m24300j(Intent intent) {
            return CashbackConditionsActivity.f17459w.getValue(intent, (KProperty<?>) f17467a[3]);
        }

        /* renamed from: k */
        private final String m24301k(Context context, CashbackObject cashbackObject) {
            String cashbackText = cashbackObject.getCashbackText(NumberFormat.getInstance(), context.getString(R.string.cashback_amount_variable), C13565k.m30967a(new ContextContainer(context), R.plurals.cashback_refund, (double) cashbackObject.getRate()));
            C12775o.m28638h(cashbackText, "cashback.getCashbackText…toDouble())\n            )");
            return cashbackText;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final String m24302l(Intent intent) {
            return CashbackConditionsActivity.f17458v.getValue(intent, (KProperty<?>) f17467a[2]);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final boolean m24303m(Intent intent) {
            return CashbackConditionsActivity.f17460x.getValue(intent, (KProperty<?>) f17467a[4]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final String m24304n(Intent intent) {
            return CashbackConditionsActivity.f17456t.getValue(intent, (KProperty<?>) f17467a[0]);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final String m24305o(Intent intent) {
            return CashbackConditionsActivity.f17457u.getValue(intent, (KProperty<?>) f17467a[1]);
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final boolean m24306p(Intent intent) {
            return CashbackConditionsActivity.f17462z.getValue(intent, (KProperty<?>) f17467a[6]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public final boolean m24307q(Intent intent) {
            return CashbackConditionsActivity.f17452B.getValue(intent, (KProperty<?>) f17467a[8]).booleanValue();
        }

        /* renamed from: s */
        private final void m24308s(Intent intent, boolean z) {
            CashbackConditionsActivity.f17461y.setValue(intent, (KProperty<?>) f17467a[5], z);
        }

        /* renamed from: t */
        private final void m24309t(Intent intent, String str) {
            CashbackConditionsActivity.f17451A.setValue(intent, (KProperty<?>) f17467a[7], str);
        }

        /* renamed from: u */
        private final void m24310u(Intent intent, String str) {
            CashbackConditionsActivity.f17459w.setValue(intent, (KProperty<?>) f17467a[3], str);
        }

        /* renamed from: v */
        private final void m24311v(Intent intent, String str) {
            CashbackConditionsActivity.f17458v.setValue(intent, (KProperty<?>) f17467a[2], str);
        }

        /* renamed from: w */
        private final void m24312w(Intent intent, boolean z) {
            CashbackConditionsActivity.f17460x.setValue(intent, (KProperty<?>) f17467a[4], z);
        }

        /* renamed from: x */
        private final void m24313x(Intent intent, String str) {
            CashbackConditionsActivity.f17456t.setValue(intent, (KProperty<?>) f17467a[0], str);
        }

        /* renamed from: y */
        private final void m24314y(Intent intent, String str) {
            CashbackConditionsActivity.f17457u.setValue(intent, (KProperty<?>) f17467a[1], str);
        }

        /* renamed from: z */
        private final void m24315z(Intent intent, boolean z) {
            CashbackConditionsActivity.f17462z.setValue(intent, (KProperty<?>) f17467a[6], z);
        }

        /* renamed from: r */
        public final Intent mo46340r(Context context, Merchant merchant, MerchantBonus merchantBonus, boolean z) {
            String str;
            boolean z2;
            C12775o.m28639i(context, "context");
            C12775o.m28639i(merchant, "merchant");
            CashbackConditionsActivity.f17455s = merchant;
            Intent intent = new Intent(context, CashbackConditionsActivity.class);
            C11158a aVar = CashbackConditionsActivity.f17453q;
            String str2 = merchant.f18063id;
            C12775o.m28638h(str2, "merchant.id");
            aVar.m24313x(intent, str2);
            String str3 = merchant.name;
            C12775o.m28638h(str3, "merchant.name");
            aVar.m24314y(intent, str3);
            CashbackObject cashbackObject = merchant.getCashbackObject();
            C12775o.m28636f(cashbackObject);
            aVar.m24311v(intent, aVar.m24301k(context, cashbackObject));
            CashbackObject cashbackObject2 = merchant.getCashbackObject();
            if (cashbackObject2 != null) {
                str = cashbackObject2.getHtmlConditions();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            } else {
                C12775o.m28638h(str, "merchant.cashbackObject?.htmlConditions ?: \"\"");
            }
            aVar.m24310u(intent, str);
            boolean z3 = true;
            aVar.m24312w(intent, !merchant.support);
            CashbackObject cashbackObject3 = merchant.getCashbackObject();
            if (cashbackObject3 != null) {
                z2 = cashbackObject3.isVariable();
            } else {
                z2 = true;
            }
            aVar.m24308s(intent, !z2);
            if (merchantBonus == null) {
                z3 = false;
            }
            aVar.m24315z(intent, z3);
            if (aVar.m24306p(intent)) {
                C12775o.m28636f(merchantBonus);
                String amountText = merchantBonus.getAmountText(NumberFormat.getInstance());
                C12775o.m28638h(amountText, "bonus!!.getAmountText(NumberFormat.getInstance())");
                aVar.m24309t(intent, amountText);
            }
            aVar.m24290A(intent, z);
            return intent;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m24283O2(CashbackConditionsActivity cashbackConditionsActivity) {
        C12775o.m28639i(cashbackConditionsActivity, "this$0");
        if (((ScrollView) cashbackConditionsActivity.mo46339D2(C13865f.scrollViewContent)).getScrollY() <= 0) {
            ((AppBarLayout) cashbackConditionsActivity.mo46339D2(C13865f.appbar)).setElevation(0.0f);
        } else {
            ((AppBarLayout) cashbackConditionsActivity.mo46339D2(C13865f.appbar)).setElevation((float) C12136d.m26463e(cashbackConditionsActivity, 8));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m24284P2(CashbackConditionsActivity cashbackConditionsActivity, View view) {
        C12775o.m28639i(cashbackConditionsActivity, "this$0");
        C13618g gVar = C13618g.f21930b;
        C11158a aVar = f17453q;
        Intent intent = cashbackConditionsActivity.getIntent();
        C12775o.m28638h(intent, "intent");
        gVar.mo53279c("cashback-details", "activate-cashback", aVar.m24305o(intent));
        C13200d dVar = C13200d.f21007a;
        Intent intent2 = cashbackConditionsActivity.getIntent();
        C12775o.m28638h(intent2, "intent");
        String e = aVar.m24304n(intent2);
        Intent intent3 = cashbackConditionsActivity.getIntent();
        C12775o.m28638h(intent3, "intent");
        dVar.mo52833k(cashbackConditionsActivity, e, aVar.m24305o(intent3));
        CashbackActivationActivity.C11200a aVar2 = CashbackActivationActivity.f17643u;
        Intent intent4 = cashbackConditionsActivity.getIntent();
        C12775o.m28638h(intent4, "intent");
        String e2 = aVar.m24304n(intent4);
        Intent intent5 = cashbackConditionsActivity.getIntent();
        C12775o.m28638h(intent5, "intent");
        cashbackConditionsActivity.startActivity(CashbackActivationActivity.C11200a.m24657y(aVar2, cashbackConditionsActivity, e2, aVar.m24305o(intent5), true, (String) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, false, 960, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public static final void m24285Q2(CashbackConditionsActivity cashbackConditionsActivity, View view) {
        C12775o.m28639i(cashbackConditionsActivity, "this$0");
        AccessController.getContext();
        C13619h hVar = C13619h.f21932a;
        Merchant merchant = f17455s;
        if (merchant == null) {
            C12775o.m28656z("merchant");
            merchant = null;
        }
        hVar.mo53282c("merchant", "poulpeo+", merchant);
        cashbackConditionsActivity.startActivity(PoulpeoPlusActivity.f17634o.mo46445a(cashbackConditionsActivity));
    }

    /* renamed from: R2 */
    private final void m24286R2(int i, String str) {
        TextView textView = (TextView) findViewById(i);
        if (textView != null) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            textView.setText(spannableString);
            C12139g.m26475d(textView, true, 0, 2, (Object) null);
        }
    }

    /* renamed from: S2 */
    private final void m24287S2() {
        View findViewById = findViewById(R.id.textViewHowBePoulpeoPlus);
        TextView textView = (TextView) findViewById;
        C12775o.m28638h(textView, "updateViews$lambda$4");
        TextView textView2 = null;
        C12139g.m26475d(textView, false, 0, 2, (Object) null);
        C12775o.m28638h(findViewById, "findViewById<TextView?>(…tVisible(false)\n        }");
        this.f17464n = textView;
        View findViewById2 = findViewById(R.id.textViewPoulpeoPlusBonus);
        TextView textView3 = (TextView) findViewById2;
        C12775o.m28638h(textView3, "updateViews$lambda$5");
        C12139g.m26475d(textView3, false, 0, 2, (Object) null);
        C12775o.m28638h(findViewById2, "findViewById<TextView?>(…tVisible(false)\n        }");
        this.f17465o = textView3;
        C11158a aVar = f17453q;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        ((TextView) mo46339D2(C13865f.textViewMerchantName)).setText(aVar.m24305o(intent));
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        ((TextView) mo46339D2(C13865f.textViewCashbackTitle)).setText(getString(R.string.cashback_conditions_title, new Object[]{aVar.m24302l(intent2)}));
        Intent intent3 = getIntent();
        C12775o.m28638h(intent3, "intent");
        ((TextView) mo46339D2(C13865f.textViewConditions)).setText(C12137e.m26470a(aVar.m24300j(intent3)));
        TextView textView4 = (TextView) mo46339D2(C13865f.textViewNoSupport);
        C12775o.m28638h(textView4, "textViewNoSupport");
        Intent intent4 = getIntent();
        C12775o.m28638h(intent4, "intent");
        C12139g.m26475d(textView4, aVar.m24303m(intent4), 0, 2, (Object) null);
        Intent intent5 = getIntent();
        C12775o.m28638h(intent5, "intent");
        if (aVar.m24306p(intent5)) {
            TextView textView5 = this.f17465o;
            if (textView5 == null) {
                C12775o.m28656z("textViewPoulpeoPlusBonus");
                textView5 = null;
            }
            Intent intent6 = getIntent();
            C12775o.m28638h(intent6, "intent");
            textView5.setText(getString(R.string.merchant_bonus_no_poulpeo_plus, new Object[]{aVar.m24299i(intent6), "Poulpeo +"}));
            TextView textView6 = this.f17465o;
            if (textView6 == null) {
                C12775o.m28656z("textViewPoulpeoPlusBonus");
                textView6 = null;
            }
            C12139g.m26475d(textView6, true, 0, 2, (Object) null);
            Intent intent7 = getIntent();
            C12775o.m28638h(intent7, "intent");
            if (!aVar.m24307q(intent7)) {
                TextView textView7 = this.f17464n;
                if (textView7 == null) {
                    C12775o.m28656z("textViewHowBePoulpeoPlus");
                } else {
                    textView2 = textView7;
                }
                m24286R2(R.id.textViewHowBePoulpeoPlus, textView2.getText().toString());
            }
        }
    }

    /* renamed from: D2 */
    public View mo46339D2(int i) {
        Map<Integer, View> map = this.f17466p;
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
        setContentView(R.layout.activity_cashback_conditions);
        mo50358x2("CashbackConditionsActivity", false);
        ((ScrollView) mo46339D2(C13865f.scrollViewContent)).getViewTreeObserver().addOnScrollChangedListener(new C13447a(this));
        m24287S2();
        ((Button) mo46339D2(C13865f.buttonActivateCashback)).setOnClickListener(new C13448b(this));
        TextView textView = this.f17464n;
        if (textView == null) {
            C12775o.m28656z("textViewHowBePoulpeoPlus");
            textView = null;
        }
        textView.setOnClickListener(new C13449c(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C7832a a = C7834c.m15321a(this);
        ContextContainer o2 = mo47878o2();
        C11158a aVar = f17453q;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String e = aVar.m24304n(intent);
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        a.mo41540g(o2, e, aVar.m24305o(intent2));
        C13618g gVar = C13618g.f21930b;
        Intent intent3 = getIntent();
        C12775o.m28638h(intent3, "intent");
        String f = aVar.m24305o(intent3);
        C13616e eVar = new C13616e("cashback-conditions-" + f, C13617f.MERCHANT);
        Intent intent4 = getIntent();
        C12775o.m28638h(intent4, "intent");
        String e2 = aVar.m24304n(intent4);
        Intent intent5 = getIntent();
        C12775o.m28638h(intent5, "intent");
        gVar.mo53280e(eVar.mo53275f(e2, aVar.m24305o(intent5)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17463m;
    }
}
