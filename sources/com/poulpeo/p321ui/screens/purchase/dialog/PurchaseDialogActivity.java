package com.poulpeo.p321ui.screens.purchase.dialog;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.purchase.activation.CashbackActivationActivity;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
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
import p326db.C11797c;
import p326db.C11799d;
import p326db.C11800e;
import p338fb.C11930c;
import p344gb.C12007c;
import p344gb.C12009d;
import p344gb.C12010e;
import p344gb.C12011f;
import p344gb.C12012g;
import p344gb.C12013h;
import p344gb.C12014i;
import p360id.C12139g;
import p368jd.C12618d;
import p404of.C13074a;
import p440ud.C13565k;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.purchase.dialog.PurchaseDialogActivity */
/* compiled from: PurchaseDialogActivity.kt */
public final class PurchaseDialogActivity extends C12618d implements C11799d {

    /* renamed from: s */
    public static final C11206a f17672s = new C11206a((DefaultConstructorMarker) null);

    /* renamed from: t */
    public static final int f17673t = 8;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final IntentDelegate.String f17674u = new IntentDelegate.String("affiliationUrl");
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final IntentDelegate.Boolean f17675v = new IntentDelegate.Boolean("mustOpenCashbackDialog");
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final IntentDelegate.String f17676w = new IntentDelegate.String("merchantId");
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final IntentDelegate.String f17677x = new IntentDelegate.String("offerId");

    /* renamed from: m */
    private C11797c f17678m;

    /* renamed from: n */
    private final Lazy f17679n = C11901h.m25690b(new C11209d(this));

    /* renamed from: o */
    private final Lazy f17680o = C11901h.m25690b(new C11207b(this));

    /* renamed from: p */
    private final Lazy f17681p = C11901h.m25690b(new C11208c(this));

    /* renamed from: q */
    private ActivityResultLauncher<Intent> f17682q;

    /* renamed from: r */
    public Map<Integer, View> f17683r = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.purchase.dialog.PurchaseDialogActivity$a */
    /* compiled from: PurchaseDialogActivity.kt */
    public static final class C11206a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17684a;

        static {
            Class<C11206a> cls = C11206a.class;
            f17684a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "affiliationUrl", "getAffiliationUrl(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "mustOpenCashbackDialog", "getMustOpenCashbackDialog(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "merchantId", "getMerchantId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "offerId", "getOfferId(Landroid/content/Intent;)Ljava/lang/String;", 0))};
        }

        private C11206a() {
        }

        public /* synthetic */ C11206a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String m24720d(Intent intent) {
            return PurchaseDialogActivity.f17676w.getValue(intent, (KProperty<?>) f17684a[2]);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final boolean m24721e(Intent intent) {
            return PurchaseDialogActivity.f17675v.getValue(intent, (KProperty<?>) f17684a[1]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final String m24722f(Intent intent) {
            return PurchaseDialogActivity.f17677x.getValue(intent, (KProperty<?>) f17684a[3]);
        }

        /* renamed from: h */
        private final void m24723h(Intent intent, String str) {
            PurchaseDialogActivity.f17674u.setValue(intent, (KProperty<?>) f17684a[0], str);
        }

        /* renamed from: i */
        private final void m24724i(Intent intent, String str) {
            PurchaseDialogActivity.f17676w.setValue(intent, (KProperty<?>) f17684a[2], str);
        }

        /* renamed from: j */
        private final void m24725j(Intent intent, boolean z) {
            PurchaseDialogActivity.f17675v.setValue(intent, (KProperty<?>) f17684a[1], z);
        }

        /* renamed from: k */
        private final void m24726k(Intent intent, String str) {
            PurchaseDialogActivity.f17677x.setValue(intent, (KProperty<?>) f17684a[3], str);
        }

        /* renamed from: g */
        public final Intent mo46471g(Context context, String str, boolean z, String str2, String str3) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "affiliationUrl");
            C12775o.m28639i(str2, "merchantId");
            C12775o.m28639i(str3, "offerId");
            Intent intent = new Intent(context, PurchaseDialogActivity.class);
            C11206a aVar = PurchaseDialogActivity.f17672s;
            aVar.m24723h(intent, str);
            aVar.m24725j(intent, z);
            aVar.m24724i(intent, str2);
            aVar.m24726k(intent, str3);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.purchase.dialog.PurchaseDialogActivity$b */
    /* compiled from: PurchaseDialogActivity.kt */
    static final class C11207b extends C12777p implements C13074a<C12007c> {

        /* renamed from: g */
        final /* synthetic */ PurchaseDialogActivity f17685g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11207b(PurchaseDialogActivity purchaseDialogActivity) {
            super(0);
            this.f17685g = purchaseDialogActivity;
        }

        /* renamed from: b */
        public final C12007c invoke() {
            return new C12007c(this.f17685g);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.purchase.dialog.PurchaseDialogActivity$c */
    /* compiled from: PurchaseDialogActivity.kt */
    static final class C11208c extends C12777p implements C13074a<C12014i> {

        /* renamed from: g */
        final /* synthetic */ PurchaseDialogActivity f17686g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11208c(PurchaseDialogActivity purchaseDialogActivity) {
            super(0);
            this.f17686g = purchaseDialogActivity;
        }

        /* renamed from: b */
        public final C12014i invoke() {
            return new C12014i(this.f17686g);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.purchase.dialog.PurchaseDialogActivity$d */
    /* compiled from: PurchaseDialogActivity.kt */
    static final class C11209d extends C12777p implements C13074a<Boolean> {

        /* renamed from: g */
        final /* synthetic */ PurchaseDialogActivity f17687g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11209d(PurchaseDialogActivity purchaseDialogActivity) {
            super(0);
            this.f17687g = purchaseDialogActivity;
        }

        public final Boolean invoke() {
            C11206a aVar = PurchaseDialogActivity.f17672s;
            Intent intent = this.f17687g.getIntent();
            C12775o.m28638h(intent, "intent");
            return Boolean.valueOf(aVar.m24721e(intent));
        }
    }

    /* renamed from: com.poulpeo.ui.screens.purchase.dialog.PurchaseDialogActivity$e */
    /* compiled from: PurchaseDialogActivity.kt */
    static final class C11210e implements ActivityResultCallback<ActivityResult> {

        /* renamed from: a */
        final /* synthetic */ PurchaseDialogActivity f17688a;

        C11210e(PurchaseDialogActivity purchaseDialogActivity) {
            this.f17688a = purchaseDialogActivity;
        }

        /* renamed from: a */
        public final void onActivityResult(ActivityResult activityResult) {
            String str;
            if (activityResult.getResultCode() == 1) {
                Intent data = activityResult.getData();
                if (data != null) {
                    str = data.getStringExtra("offerId");
                } else {
                    str = null;
                }
                C11800e.m25362a().mo48948n(str);
                this.f17688a.finish();
            }
        }
    }

    public PurchaseDialogActivity() {
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C11210e(this));
        C12775o.m28638h(registerForActivityResult, "registerForActivityResul… finish()\n        }\n    }");
        this.f17682q = registerForActivityResult;
    }

    /* renamed from: I2 */
    private final void m24694I2() {
        float M2 = m24698M2(0.0f, 0.0f, 1.0f);
        float M22 = m24698M2(1.0f, 0.0f, 1.0f);
        int i = C13865f.layoutActivatedCashbackCustomTabs;
        RelativeLayout relativeLayout = (RelativeLayout) mo46466D2(i);
        C12775o.m28638h(relativeLayout, "layoutActivatedCashbackCustomTabs");
        C12139g.m26475d(relativeLayout, true, 0, 2, (Object) null);
        ((RelativeLayout) mo46466D2(i)).setAlpha(M2);
        m24702Q2();
        ((RelativeLayout) mo46466D2(i)).animate().alpha(M22).setDuration(400).start();
        new AndroidOsHandler().mo47873h(new C12012g(this), 2000);
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m24695J2(PurchaseDialogActivity purchaseDialogActivity) {
        C12775o.m28639i(purchaseDialogActivity, "this$0");
        purchaseDialogActivity.finish();
    }

    /* renamed from: K2 */
    private final void m24696K2(boolean z) {
        float M2 = m24698M2(0.0f, 0.0f, 1.0f);
        float M22 = m24698M2(1.0f, 0.0f, 1.0f);
        int i = C13865f.layoutCopiedCode;
        LinearLayout linearLayout = (LinearLayout) mo46466D2(i);
        C12775o.m28638h(linearLayout, "layoutCopiedCode");
        boolean z2 = true;
        C12139g.m26475d(linearLayout, true, 0, 2, (Object) null);
        ((LinearLayout) mo46466D2(i)).setAlpha(M2);
        m24702Q2();
        ((LinearLayout) mo46466D2(i)).animate().alpha(M22).setDuration(400).start();
        LinearLayout linearLayout2 = (LinearLayout) mo46466D2(C13865f.layoutCopiedCodeCashback);
        C12775o.m28638h(linearLayout2, "layoutCopiedCodeCashback");
        C11797c cVar = this.f17678m;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        if (!cVar.mo48933x2() || !z) {
            z2 = false;
        }
        C12139g.m26475d(linearLayout2, z2, 0, 2, (Object) null);
        new AndroidOsHandler().mo47873h(new C12013h(this), 2000);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m24697L2(PurchaseDialogActivity purchaseDialogActivity) {
        C12775o.m28639i(purchaseDialogActivity, "this$0");
        purchaseDialogActivity.finish();
    }

    /* renamed from: M2 */
    private final float m24698M2(float f, float f2, float f3) {
        return ((f2 - f3) * (((float) 1) - f)) + f3;
    }

    /* renamed from: N2 */
    private final C12007c m24699N2() {
        return (C12007c) this.f17680o.getValue();
    }

    /* renamed from: O2 */
    private final C12014i m24700O2() {
        return (C12014i) this.f17681p.getValue();
    }

    /* renamed from: P2 */
    private final boolean m24701P2() {
        return ((Boolean) this.f17679n.getValue()).booleanValue();
    }

    /* renamed from: Q2 */
    private final void m24702Q2() {
        LinearLayout linearLayout = (LinearLayout) mo46466D2(C13865f.layoutDialog);
        C12775o.m28638h(linearLayout, "layoutDialog");
        C12139g.m26475d(linearLayout, false, 0, 2, (Object) null);
    }

    /* renamed from: R2 */
    private final void m24703R2() {
        ((FrameLayout) mo46466D2(C13865f.layoutDialogContent)).addView(m24699N2());
        int i = C13865f.layoutButtonActivateCashbackCustomTabs;
        RelativeLayout relativeLayout = (RelativeLayout) mo46466D2(i);
        C12775o.m28638h(relativeLayout, "layoutButtonActivateCashbackCustomTabs");
        C11797c cVar = null;
        C12139g.m26475d(relativeLayout, true, 0, 2, (Object) null);
        C11797c cVar2 = this.f17678m;
        if (cVar2 == null) {
            C12775o.m28656z("controller");
            cVar2 = null;
        }
        if (!cVar2.mo48935z2()) {
            Button button = (Button) mo46466D2(C13865f.buttonActivateCashback);
            C12775o.m28638h(button, "buttonActivateCashback");
            C12139g.m26475d(button, true, 0, 2, (Object) null);
            ((RelativeLayout) mo46466D2(i)).setBackgroundColor(ContextCompat.getColor(this, R.color.background_default));
        }
        C11797c cVar3 = this.f17678m;
        if (cVar3 == null) {
            C12775o.m28656z("controller");
            cVar3 = null;
        }
        Merchant v2 = cVar3.mo48931v2();
        if (v2 != null) {
            C12007c N2 = m24699N2();
            C11797c cVar4 = this.f17678m;
            if (cVar4 == null) {
                C12775o.m28656z("controller");
            } else {
                cVar = cVar4;
            }
            N2.mo49439d(v2, cVar.mo48919A2());
        }
    }

    /* renamed from: S2 */
    private final void m24704S2() {
        m24708W2();
        ((FrameLayout) mo46466D2(C13865f.layoutDialogContent)).addView(m24700O2());
        C11797c cVar = this.f17678m;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        cVar.mo48922H2(m24700O2().getBaseListViewController());
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m24705T2(PurchaseDialogActivity purchaseDialogActivity, View view) {
        C12775o.m28639i(purchaseDialogActivity, "this$0");
        purchaseDialogActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m24706U2(PurchaseDialogActivity purchaseDialogActivity, View view) {
        C12775o.m28639i(purchaseDialogActivity, "this$0");
        purchaseDialogActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m24707V2(PurchaseDialogActivity purchaseDialogActivity, View view) {
        C12775o.m28639i(purchaseDialogActivity, "this$0");
        int i = C13865f.layoutButtonActivateCashbackCustomTabs;
        RelativeLayout relativeLayout = (RelativeLayout) purchaseDialogActivity.mo46466D2(i);
        C12775o.m28638h(relativeLayout, "layoutButtonActivateCashbackCustomTabs");
        C11797c cVar = null;
        C12139g.m26475d(relativeLayout, false, 0, 2, (Object) null);
        ((RelativeLayout) purchaseDialogActivity.mo46466D2(i)).setBackgroundColor(ContextCompat.getColor(purchaseDialogActivity, R.color.background_activated));
        C11797c cVar2 = purchaseDialogActivity.f17678m;
        if (cVar2 == null) {
            C12775o.m28656z("controller");
        } else {
            cVar = cVar2;
        }
        cVar.mo48928p2(true);
        purchaseDialogActivity.m24694I2();
    }

    /* renamed from: W2 */
    private final void m24708W2() {
        ((FrameLayout) mo46466D2(C13865f.layoutDialogContent)).removeAllViews();
    }

    /* renamed from: C0 */
    public void mo46465C0(Offer offer) {
        C12775o.m28639i(offer, APIResourceDescriptors.RESOURCE_TYPE_OFFER);
        m24696K2(offer.canCombineCashbackAndOffersCodes);
    }

    /* renamed from: D2 */
    public View mo46466D2(int i) {
        Map<Integer, View> map = this.f17683r;
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

    /* renamed from: U1 */
    public void mo46467U1(String str) {
        C12775o.m28639i(str, "text");
    }

    /* renamed from: W1 */
    public void mo46468W1() {
        RelativeLayout relativeLayout = (RelativeLayout) mo46466D2(C13865f.layoutActivatedCashbackCustomTabs);
        C12775o.m28638h(relativeLayout, "layoutActivatedCashbackCustomTabs");
        C12139g.m26475d(relativeLayout, m24701P2(), 0, 2, (Object) null);
        Button button = (Button) mo46466D2(C13865f.buttonActivateCashback);
        C12775o.m28638h(button, "buttonActivateCashback");
        C11797c cVar = this.f17678m;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        boolean z = true;
        C12139g.m26475d(button, !cVar.mo48933x2(), 0, 2, (Object) null);
        if (m24701P2()) {
            m24703R2();
            return;
        }
        m24704S2();
        View D2 = mo46466D2(C13865f.viewOffersInfo);
        C12775o.m28638h(D2, "viewOffersInfo");
        C11797c cVar2 = this.f17678m;
        if (cVar2 == null) {
            C12775o.m28656z("controller");
            cVar2 = null;
        }
        if (cVar2.mo48932w2() <= 1) {
            z = false;
        }
        C12139g.m26475d(D2, z, 0, 2, (Object) null);
    }

    /* renamed from: Y0 */
    public void mo46469Y0(Offer offer, int i) {
        C12775o.m28639i(offer, APIResourceDescriptors.RESOURCE_TYPE_OFFER);
        ActivityResultLauncher<Intent> activityResultLauncher = this.f17682q;
        CashbackActivationActivity.C11200a aVar = CashbackActivationActivity.f17643u;
        Merchant merchant = offer.getMerchant();
        C12775o.m28636f(merchant);
        activityResultLauncher.launch(aVar.mo46457v(this, offer, merchant, true, i, true));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_purchase_dialog);
        overridePendingTransition(R.anim.enter_slide_up, R.anim.exit_slide_down);
        mo50358x2("PurchaseDialogActivity", true);
        View D2 = mo46466D2(C13865f.viewOffersInfo);
        C12775o.m28638h(D2, "viewOffersInfo");
        C12139g.m26475d(D2, false, 0, 2, (Object) null);
        ContextContainer o2 = mo47878o2();
        C13689a aVar = new C13689a(mo47878o2());
        C11206a aVar2 = f17672s;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String a = aVar2.m24720d(intent);
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        C11797c.C11798a aVar3 = r5;
        C11797c.C11798a aVar4 = new C11797c.C11798a(o2, aVar, a, aVar2.m24722f(intent2), new ResourceStringWrapper(R.string.merchant_offers_count), new C13565k(R.plurals.merchant_codes_count), new C13565k(R.plurals.merchant_deals_count), new ResourceStringWrapper(R.string.merchant_codes_and_deals_count), new ResourceStringWrapper(R.string.purchase_copied_code), new ResourceStringWrapper(R.string.purchase_selected_deal));
        C11797c cVar = new C11797c(this, aVar3);
        this.f17678m = cVar;
        cVar.mo48921D2();
        ((RelativeLayout) mo46466D2(C13865f.layoutActivityCashBackInfo)).setOnClickListener(new C12009d(this));
        ((ImageButton) mo46466D2(C13865f.buttonDialogClose)).setOnClickListener(new C12010e(this));
        ((Button) mo46466D2(C13865f.buttonActivateCashback)).setOnClickListener(new C12011f(this));
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        LinearLayout linearLayout = (LinearLayout) mo46466D2(C13865f.layoutCopiedCode);
        C12775o.m28638h(linearLayout, "layoutCopiedCode");
        C12139g.m26475d(linearLayout, false, 0, 2, (Object) null);
        RelativeLayout relativeLayout = (RelativeLayout) mo46466D2(C13865f.layoutActivatedCashbackCustomTabs);
        C12775o.m28638h(relativeLayout, "layoutActivatedCashbackCustomTabs");
        C12139g.m26475d(relativeLayout, false, 0, 2, (Object) null);
    }

    /* renamed from: w1 */
    public void mo46470w1() {
        C11930c a = C11930c.f18632n.mo49153a();
        if (a != null) {
            a.mo49152s2();
        }
    }
}
