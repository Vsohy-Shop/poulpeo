package com.poulpeo.p321ui.screens.offer;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.purchase.activation.CashbackActivationActivity;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferCodeType;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.IntentDelegate;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p102g9.C7834c;
import p303ab.C10852a;
import p303ab.C10853b;
import p303ab.C10854c;
import p303ab.C10857f;
import p303ab.C10859g;
import p360id.C12136d;
import p360id.C12139g;
import p368jd.C12616b;
import p404of.C13074a;
import p409pc.C13200d;
import p410pd.C13204a;
import p431ta.C13450d;
import p440ud.C13558g;
import p440ud.C13574r;
import p445vc.C13619h;
import p450wb.C13690b;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.offer.OfferActivity */
/* compiled from: OfferActivity.kt */
public final class OfferActivity extends C12616b implements C10859g {

    /* renamed from: r */
    public static final C11192a f17608r = new C11192a((DefaultConstructorMarker) null);

    /* renamed from: s */
    public static final int f17609s = 8;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final IntentDelegate.String f17610t = new IntentDelegate.String("offerId");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final IntentDelegate.Int f17611u = new IntentDelegate.Int("nbOffers");

    /* renamed from: m */
    private final int f17612m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C10857f f17613n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C13204a f17614o;

    /* renamed from: p */
    private final Lazy f17615p = C11901h.m25690b(new C11193b(this));

    /* renamed from: q */
    public Map<Integer, View> f17616q = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.offer.OfferActivity$a */
    /* compiled from: OfferActivity.kt */
    public static final class C11192a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17617a;

        static {
            Class<C11192a> cls = C11192a.class;
            f17617a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "offerId", "getOfferId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "nbOffers", "getNbOffers(Landroid/content/Intent;)I", 0))};
        }

        private C11192a() {
        }

        public /* synthetic */ C11192a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final int m24564c(Intent intent) {
            return OfferActivity.f17611u.getValue(intent, (KProperty<?>) f17617a[1]).intValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String m24565d(Intent intent) {
            return OfferActivity.f17610t.getValue(intent, (KProperty<?>) f17617a[0]);
        }

        /* renamed from: f */
        private final void m24566f(Intent intent, int i) {
            OfferActivity.f17611u.setValue(intent, (KProperty<?>) f17617a[1], i);
        }

        /* renamed from: g */
        private final void m24567g(Intent intent, String str) {
            OfferActivity.f17610t.setValue(intent, (KProperty<?>) f17617a[0], str);
        }

        /* renamed from: e */
        public final Intent mo46434e(Context context, String str, Integer num) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "offerId");
            Intent intent = new Intent(context, OfferActivity.class);
            C11192a aVar = OfferActivity.f17608r;
            aVar.m24567g(intent, str);
            if (num != null) {
                aVar.m24566f(intent, num.intValue());
            }
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.offer.OfferActivity$b */
    /* compiled from: OfferActivity.kt */
    static final class C11193b extends C12777p implements C13074a<C13450d> {

        /* renamed from: g */
        final /* synthetic */ OfferActivity f17618g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11193b(OfferActivity offerActivity) {
            super(0);
            this.f17618g = offerActivity;
        }

        /* renamed from: b */
        public final C13450d invoke() {
            C10857f E2 = this.f17618g.f17613n;
            C13204a aVar = null;
            if (E2 == null) {
                C12775o.m28656z("controller");
                E2 = null;
            }
            Offer q2 = E2.mo45803q2();
            if (q2 == null) {
                return null;
            }
            OfferActivity offerActivity = this.f17618g;
            Merchant merchant = q2.getMerchant();
            if (merchant == null) {
                return null;
            }
            C13204a H2 = offerActivity.f17614o;
            if (H2 == null) {
                C12775o.m28656z("shareController");
            } else {
                aVar = H2;
            }
            Merchant merchant2 = q2.getMerchant();
            C12775o.m28636f(merchant2);
            String p2 = aVar.mo52852p2(merchant2.f18063id, q2.f18063id);
            C12775o.m28638h(p2, "shareController.getDynam….merchant!!.id, offer.id)");
            C12775o.m28638h(merchant, "merchant");
            return new C13450d(offerActivity, false, p2, merchant, q2);
        }
    }

    /* renamed from: I2 */
    private final C13450d m24553I2() {
        return (C13450d) this.f17615p.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m24554J2(OfferActivity offerActivity) {
        C12775o.m28639i(offerActivity, "this$0");
        if (((ScrollView) offerActivity.mo46433D2(C13865f.scrollViewContent)).getScrollY() <= 0) {
            ((AppBarLayout) offerActivity.mo46433D2(C13865f.appbar)).setElevation(0.0f);
        } else {
            ((AppBarLayout) offerActivity.mo46433D2(C13865f.appbar)).setElevation((float) C12136d.m26463e(offerActivity, 8));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m24555K2(OfferActivity offerActivity, View view) {
        C12775o.m28639i(offerActivity, "this$0");
        C13450d I2 = offerActivity.m24553I2();
        if (I2 != null) {
            I2.onShareButtonClicked();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m24556L2(Offer offer, Merchant merchant, OfferActivity offerActivity, View view) {
        C12775o.m28639i(offer, "$offer");
        C12775o.m28639i(merchant, "$merchant");
        C12775o.m28639i(offerActivity, "this$0");
        C13619h.f21932a.mo53283d(C13619h.m31080a("offer-details", offer), "activate", offer);
        if (merchant.hasCashback() && offer.canCombineCashbackAndOffersCodes) {
            C13200d dVar = C13200d.f21007a;
            String str = merchant.f18063id;
            C12775o.m28638h(str, "merchant.id");
            String str2 = merchant.name;
            C12775o.m28638h(str2, "merchant.name");
            dVar.mo52833k(offerActivity, str, str2);
        }
        if (offer.codeType == OfferCodeType.MULTIPLE) {
            CashbackActivationActivity.C11200a aVar = CashbackActivationActivity.f17643u;
            C11192a aVar2 = f17608r;
            Intent intent = offerActivity.getIntent();
            C12775o.m28638h(intent, "intent");
            offerActivity.startActivity(CashbackActivationActivity.C11200a.m24656x(aVar, offerActivity, offer, merchant, true, aVar2.m24564c(intent), false, 32, (Object) null));
            return;
        }
        offerActivity.startActivity(CashbackActivationActivity.f17643u.mo46455t(offerActivity, offer));
    }

    /* renamed from: M2 */
    private final void m24557M2() {
        C10857f fVar = this.f17613n;
        if (fVar == null) {
            C12775o.m28656z("controller");
            fVar = null;
        }
        Offer q2 = fVar.mo45803q2();
        if (q2 != null) {
            C7834c.m15321a(this).mo41538e(mo47878o2(), q2);
        }
    }

    /* renamed from: D2 */
    public View mo46433D2(int i) {
        Map<Integer, View> map = this.f17616q;
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

    /* renamed from: F0 */
    public void mo45809F0() {
        C12136d.m26467i(this, R.string.offer_retrieve_error);
        finish();
    }

    /* renamed from: k1 */
    public void mo45810k1(Offer offer) {
        int i;
        String str;
        int i2;
        C12775o.m28639i(offer, APIResourceDescriptors.RESOURCE_TYPE_OFFER);
        m24557M2();
        Merchant merchant = offer.getMerchant();
        if (merchant == null) {
            mo45809F0();
            return;
        }
        ((TextView) mo46433D2(C13865f.textViewMerchantName)).setText(merchant.name);
        ((TextView) mo46433D2(C13865f.textViewOfferTitle)).setText(offer.title);
        boolean z = true;
        if (!merchant.hasCashback() || !offer.canCombineCashbackAndOffersCodes) {
            TextView textView = (TextView) mo46433D2(C13865f.textViewCashback);
            C12775o.m28638h(textView, "textViewCashback");
            C12139g.m26475d(textView, false, 0, 2, (Object) null);
            ((TextView) mo46433D2(C13865f.textViewConditions)).setText(offer.description);
        } else {
            int i3 = C13865f.textViewCashback;
            TextView textView2 = (TextView) mo46433D2(i3);
            C12775o.m28638h(textView2, "textViewCashback");
            C12139g.m26475d(textView2, true, 0, 2, (Object) null);
            TextView textView3 = (TextView) mo46433D2(i3);
            CashbackObject cashbackObject = offer.getCashbackObject();
            if (cashbackObject == null || (str = cashbackObject.getCashbackText(NumberFormat.getInstance(), getString(R.string.cashback_amount_variable), getString(R.string.offer_cumulative_cashback))) == null) {
                str = "";
            }
            textView3.setText(str);
            if (offer.getOfferType() == OfferType.CODE) {
                i2 = R.string.offer_code_description_with_cashback;
            } else {
                i2 = R.string.offer_deal_description_with_cashback;
            }
            String string = getString(i2);
            C12775o.m28638h(string, "getString(if (offer.offe…escription_with_cashback)");
            C13690b bVar = C13690b.f22034a;
            TextView textView4 = (TextView) mo46433D2(C13865f.textViewConditions);
            C12775o.m28638h(textView4, "textViewConditions");
            bVar.mo53352j(textView4, string + "\n" + offer.description, string, new StyleSpan(1));
        }
        Button button = (Button) mo46433D2(C13865f.buttonShare);
        C12775o.m28638h(button, "buttonShare");
        C12139g.m26475d(button, true, 0, 2, (Object) null);
        TextView textView5 = (TextView) mo46433D2(C13865f.textViewNoSupport);
        C12775o.m28638h(textView5, "textViewNoSupport");
        if (!merchant.hasCashback() || !offer.canCombineCashbackAndOffersCodes || merchant.support) {
            z = false;
        }
        C12139g.m26475d(textView5, z, 0, 2, (Object) null);
        int i4 = C13865f.buttonUseOffer;
        Button button2 = (Button) mo46433D2(i4);
        if (offer.getOfferType() == OfferType.CODE) {
            i = R.string.offer_use_code;
        } else {
            i = R.string.offer_use_deal;
        }
        button2.setText(i);
        ((Button) mo46433D2(i4)).setOnClickListener(new C10854c(offer, merchant, this));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Drawable drawable;
        super.onCreate(bundle);
        setContentView(R.layout.activity_offer);
        mo50358x2("OfferActivity", false);
        ((ScrollView) mo46433D2(C13865f.scrollViewContent)).getViewTreeObserver().addOnScrollChangedListener(new C10852a(this));
        Drawable[] compoundDrawablesRelative = ((Button) mo46433D2(C13865f.buttonShare)).getCompoundDrawablesRelative();
        C12775o.m28638h(compoundDrawablesRelative, "buttonShare.compoundDrawablesRelative");
        for (Drawable drawable2 : compoundDrawablesRelative) {
            if (drawable2 != null) {
                drawable = drawable2.mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(this, R.color.text_theme), PorterDuff.Mode.SRC_IN));
            }
        }
        int i = C13865f.buttonShare;
        ((Button) mo46433D2(i)).setVisibility(4);
        ((Button) mo46433D2(i)).setOnClickListener(new C10853b(this));
        ContextContainer o2 = mo47878o2();
        C11192a aVar = f17608r;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        C10857f fVar = new C10857f(this, new C10857f.C10858a(o2, aVar.m24565d(intent), new C13558g((ProgressBar) mo46433D2(C13865f.progressBarLoader)), new C13574r((ScrollView) mo46433D2(C13865f.scrollViewContent))));
        this.f17613n = fVar;
        fVar.mo45804t2();
        C13204a aVar2 = new C13204a(new C13204a.C13205a(mo47878o2(), "poulpeo"));
        this.f17614o = aVar2;
        aVar2.mo52853r2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C10857f fVar = this.f17613n;
        C13204a aVar = null;
        if (fVar == null) {
            C12775o.m28656z("controller");
            fVar = null;
        }
        fVar.mo45805u2();
        C13204a aVar2 = this.f17614o;
        if (aVar2 == null) {
            C12775o.m28656z("shareController");
        } else {
            aVar = aVar2;
        }
        aVar.mo52854s2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C10857f fVar = this.f17613n;
        C13204a aVar = null;
        if (fVar == null) {
            C12775o.m28656z("controller");
            fVar = null;
        }
        fVar.mo45806v2();
        C13204a aVar2 = this.f17614o;
        if (aVar2 == null) {
            C12775o.m28656z("shareController");
        } else {
            aVar = aVar2;
        }
        aVar.mo52855t2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m24557M2();
        C10857f fVar = this.f17613n;
        C13204a aVar = null;
        if (fVar == null) {
            C12775o.m28656z("controller");
            fVar = null;
        }
        fVar.mo45807w2();
        C13204a aVar2 = this.f17614o;
        if (aVar2 == null) {
            C12775o.m28656z("shareController");
        } else {
            aVar = aVar2;
        }
        aVar.mo52856u2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17612m;
    }
}
