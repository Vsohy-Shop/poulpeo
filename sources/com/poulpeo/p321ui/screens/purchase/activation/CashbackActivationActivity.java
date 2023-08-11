package com.poulpeo.p321ui.screens.purchase.activation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.purchase.activation.CookieRemindersActivity;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.AndroidUtil;
import com.rmn.utils.IntentDelegate;
import com.rmn.utils_common.IListener;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p326db.C11800e;
import p332eb.C11865a;
import p332eb.C11866b;
import p332eb.C11867c;
import p332eb.C11873i;
import p332eb.C11876j;
import p332eb.C11881m;
import p336ef.C11921v;
import p338fb.C11930c;
import p353hd.C12057a;
import p353hd.C12058b;
import p360id.C12136d;
import p360id.C12139g;
import p368jd.C12616b;
import p404of.C13074a;
import p440ud.C13548a;
import p440ud.C13574r;
import p446vd.C13621b;
import p446vd.C13623d;
import p446vd.C13637r;
import p450wb.C13689a;
import p454wf.C13735j;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.purchase.activation.CashbackActivationActivity */
/* compiled from: CashbackActivationActivity.kt */
public final class CashbackActivationActivity extends C12616b implements C11876j, C11881m {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final IntentDelegate.StringNullable f17638A = new IntentDelegate.StringNullable("offerCode");
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final IntentDelegate.Boolean f17639B = new IntentDelegate.Boolean("openInBrowser");
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final IntentDelegate.Boolean f17640C = new IntentDelegate.Boolean("mustFetchCode");
    /* access modifiers changed from: private */

    /* renamed from: D */
    public static final IntentDelegate.Int f17641D = new IntentDelegate.Int("numberOffer");
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static final IntentDelegate.Boolean f17642E = new IntentDelegate.Boolean("isOpenByDialog");

    /* renamed from: u */
    public static final C11200a f17643u = new C11200a((DefaultConstructorMarker) null);

    /* renamed from: v */
    public static final int f17644v = 8;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final IntentDelegate.String f17645w = new IntentDelegate.String("merchantId");
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final IntentDelegate.String f17646x = new IntentDelegate.String("merchantName");
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final IntentDelegate.Boolean f17647y = new IntentDelegate.Boolean("mustShowCashback");
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final IntentDelegate.String f17648z = new IntentDelegate.String("offerId");

    /* renamed from: m */
    private final int f17649m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C11873i f17650n;

    /* renamed from: o */
    private final Lazy f17651o = C11901h.m25690b(new C11201b(this));

    /* renamed from: p */
    private int f17652p;

    /* renamed from: q */
    private ActivityResultLauncher<Intent> f17653q;

    /* renamed from: r */
    private boolean f17654r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f17655s;

    /* renamed from: t */
    public Map<Integer, View> f17656t = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.purchase.activation.CashbackActivationActivity$a */
    /* compiled from: CashbackActivationActivity.kt */
    public static final class C11200a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17657a;

        static {
            Class<C11200a> cls = C11200a.class;
            f17657a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "merchantId", "getMerchantId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "merchantName", "getMerchantName(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "mustShowCashback", "getMustShowCashback(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "offerId", "getOfferId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "offerCode", "getOfferCode(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "openInBrowser", "getOpenInBrowser(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "mustFetchCode", "getMustFetchCode(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "numberOffer", "getNumberOffer(Landroid/content/Intent;)I", 0)), C12764h0.m28590f(new C12783v(cls, "isOpenByDialog", "isOpenByDialog(Landroid/content/Intent;)Z", 0))};
        }

        private C11200a() {
        }

        public /* synthetic */ C11200a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: A */
        private final void m24630A(Intent intent, String str) {
            CashbackActivationActivity.f17646x.setValue(intent, (KProperty<?>) f17657a[1], str);
        }

        /* renamed from: B */
        private final void m24631B(Intent intent, boolean z) {
            CashbackActivationActivity.f17640C.setValue(intent, (KProperty<?>) f17657a[6], z);
        }

        /* renamed from: C */
        private final void m24632C(Intent intent, boolean z) {
            CashbackActivationActivity.f17647y.setValue(intent, (KProperty<?>) f17657a[2], z);
        }

        /* renamed from: D */
        private final void m24633D(Intent intent, int i) {
            CashbackActivationActivity.f17641D.setValue(intent, (KProperty<?>) f17657a[7], i);
        }

        /* renamed from: E */
        private final void m24634E(Intent intent, String str) {
            CashbackActivationActivity.f17638A.setValue(intent, (KProperty<?>) f17657a[4], str);
        }

        /* renamed from: F */
        private final void m24635F(Intent intent, String str) {
            CashbackActivationActivity.f17648z.setValue(intent, (KProperty<?>) f17657a[3], str);
        }

        /* renamed from: G */
        private final void m24636G(Intent intent, boolean z) {
            CashbackActivationActivity.f17642E.setValue(intent, (KProperty<?>) f17657a[8], z);
        }

        /* renamed from: H */
        private final void m24637H(Intent intent, boolean z) {
            CashbackActivationActivity.f17639B.setValue(intent, (KProperty<?>) f17657a[5], z);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final String m24647j(Intent intent) {
            return CashbackActivationActivity.f17645w.getValue(intent, (KProperty<?>) f17657a[0]);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public final String m24648k(Intent intent) {
            return CashbackActivationActivity.f17646x.getValue(intent, (KProperty<?>) f17657a[1]);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final boolean m24649l(Intent intent) {
            return CashbackActivationActivity.f17640C.getValue(intent, (KProperty<?>) f17657a[6]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final boolean m24650m(Intent intent) {
            return CashbackActivationActivity.f17647y.getValue(intent, (KProperty<?>) f17657a[2]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final int m24651n(Intent intent) {
            return CashbackActivationActivity.f17641D.getValue(intent, (KProperty<?>) f17657a[7]).intValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final String m24652o(Intent intent) {
            return CashbackActivationActivity.f17638A.getValue(intent, (KProperty<?>) f17657a[4]);
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final String m24653p(Intent intent) {
            return CashbackActivationActivity.f17648z.getValue(intent, (KProperty<?>) f17657a[3]);
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public final boolean m24654q(Intent intent) {
            return CashbackActivationActivity.f17639B.getValue(intent, (KProperty<?>) f17657a[5]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public final boolean m24655r(Intent intent) {
            return CashbackActivationActivity.f17642E.getValue(intent, (KProperty<?>) f17657a[8]).booleanValue();
        }

        /* renamed from: x */
        public static /* synthetic */ Intent m24656x(C11200a aVar, Context context, Offer offer, Merchant merchant, boolean z, int i, boolean z2, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z2 = false;
            }
            return aVar.mo46457v(context, offer, merchant, z, i, z2);
        }

        /* renamed from: y */
        public static /* synthetic */ Intent m24657y(C11200a aVar, Context context, String str, String str2, boolean z, String str3, String str4, Boolean bool, Boolean bool2, Integer num, boolean z2, int i, Object obj) {
            Boolean bool3;
            Boolean bool4;
            Integer num2;
            boolean z3;
            int i2 = i;
            if ((i2 & 64) != 0) {
                bool3 = null;
            } else {
                bool3 = bool;
            }
            if ((i2 & 128) != 0) {
                bool4 = Boolean.FALSE;
            } else {
                bool4 = bool2;
            }
            if ((i2 & 256) != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            if ((i2 & 512) != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            return aVar.mo46458w(context, str, str2, z, str3, str4, bool3, bool4, num2, z3);
        }

        /* renamed from: z */
        private final void m24658z(Intent intent, String str) {
            CashbackActivationActivity.f17645w.setValue(intent, (KProperty<?>) f17657a[0], str);
        }

        /* renamed from: s */
        public final Intent mo46454s(Context context, Merchant merchant) {
            Merchant merchant2 = merchant;
            Context context2 = context;
            C12775o.m28639i(context2, "context");
            C12775o.m28639i(merchant2, "merchant");
            String str = merchant2.f18063id;
            C12775o.m28638h(str, "merchant.id");
            String str2 = merchant2.name;
            C12775o.m28638h(str2, "merchant.name");
            return m24657y(this, context2, str, str2, merchant.hasCashback(), (String) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, false, 960, (Object) null);
        }

        /* renamed from: t */
        public final Intent mo46455t(Context context, Offer offer) {
            String str;
            boolean z;
            Offer offer2 = offer;
            C12775o.m28639i(context, "context");
            C12775o.m28639i(offer2, APIResourceDescriptors.RESOURCE_TYPE_OFFER);
            Merchant merchant = offer.getMerchant();
            C12775o.m28636f(merchant);
            String str2 = merchant.f18063id;
            C12775o.m28638h(str2, "offer.merchant!!.id");
            Merchant merchant2 = offer.getMerchant();
            if (merchant2 == null || (str = merchant2.name) == null) {
                str = "";
            }
            String str3 = str;
            Merchant merchant3 = offer.getMerchant();
            boolean z2 = false;
            if (merchant3 == null || !merchant3.hasCashback()) {
                z = false;
            } else {
                z = true;
            }
            if (z && offer2.canCombineCashbackAndOffersCodes) {
                z2 = true;
            }
            return m24657y(this, context, str2, str3, z2, offer2.f18063id, offer2.code, (Boolean) null, (Boolean) null, (Integer) null, false, 960, (Object) null);
        }

        /* renamed from: u */
        public final Intent mo46456u(Context context, Offer offer, Merchant merchant) {
            boolean z;
            Offer offer2 = offer;
            Merchant merchant2 = merchant;
            C12775o.m28639i(context, "context");
            C12775o.m28639i(offer2, APIResourceDescriptors.RESOURCE_TYPE_OFFER);
            C12775o.m28639i(merchant2, "merchant");
            String str = merchant2.f18063id;
            C12775o.m28638h(str, "merchant.id");
            String str2 = merchant2.name;
            C12775o.m28638h(str2, "merchant.name");
            if (!merchant.hasCashback() || !offer2.canCombineCashbackAndOffersCodes) {
                z = false;
            } else {
                z = true;
            }
            return m24657y(this, context, str, str2, z, offer2.f18063id, offer2.code, (Boolean) null, (Boolean) null, (Integer) null, false, 960, (Object) null);
        }

        /* renamed from: v */
        public final Intent mo46457v(Context context, Offer offer, Merchant merchant, boolean z, int i, boolean z2) {
            boolean z3;
            Offer offer2 = offer;
            Merchant merchant2 = merchant;
            Context context2 = context;
            C12775o.m28639i(context, "context");
            C12775o.m28639i(offer2, APIResourceDescriptors.RESOURCE_TYPE_OFFER);
            C12775o.m28639i(merchant2, "merchant");
            String str = merchant2.f18063id;
            C12775o.m28638h(str, "merchant.id");
            String str2 = merchant2.name;
            C12775o.m28638h(str2, "merchant.name");
            if (!merchant.hasCashback() || !offer2.canCombineCashbackAndOffersCodes) {
                z3 = false;
            } else {
                z3 = true;
            }
            return mo46458w(context, str, str2, z3, offer2.f18063id, (String) null, (Boolean) null, Boolean.valueOf(z), Integer.valueOf(i), z2);
        }

        /* renamed from: w */
        public final Intent mo46458w(Context context, String str, String str2, boolean z, String str3, String str4, Boolean bool, Boolean bool2, Integer num, boolean z2) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "merchantId");
            C12775o.m28639i(str2, "merchantName");
            Intent intent = new Intent(context, CashbackActivationActivity.class);
            C11200a aVar = CashbackActivationActivity.f17643u;
            aVar.m24658z(intent, str);
            aVar.m24630A(intent, str2);
            aVar.m24632C(intent, z);
            if (str3 != null) {
                aVar.m24635F(intent, str3);
            }
            aVar.m24634E(intent, str4);
            if (bool != null) {
                aVar.m24637H(intent, bool.booleanValue());
            }
            if (bool2 != null) {
                aVar.m24631B(intent, bool2.booleanValue());
            }
            if (num != null) {
                aVar.m24633D(intent, num.intValue());
            }
            aVar.m24636G(intent, z2);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.purchase.activation.CashbackActivationActivity$b */
    /* compiled from: CashbackActivationActivity.kt */
    static final class C11201b extends C12777p implements C13074a<Integer> {

        /* renamed from: g */
        final /* synthetic */ CashbackActivationActivity f17658g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11201b(CashbackActivationActivity cashbackActivationActivity) {
            super(0);
            this.f17658g = cashbackActivationActivity;
        }

        public final Integer invoke() {
            int i;
            C11873i E2 = this.f17658g.f17650n;
            if (E2 == null) {
                C12775o.m28656z("controller");
                E2 = null;
            }
            if (E2.mo49070B2()) {
                i = ContextCompat.getColor(this.f17658g, R.color.background_theme);
            } else {
                i = ContextCompat.getColor(this.f17658g, R.color.background_activated);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.purchase.activation.CashbackActivationActivity$c */
    /* compiled from: CashbackActivationActivity.kt */
    static final class C11202c extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ CashbackActivationActivity f17659g;

        /* renamed from: h */
        final /* synthetic */ String f17660h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11202c(CashbackActivationActivity cashbackActivationActivity, String str) {
            super(0);
            this.f17659g = cashbackActivationActivity;
            this.f17660h = str;
        }

        public final void invoke() {
            C11200a aVar = CashbackActivationActivity.f17643u;
            Intent intent = this.f17659g.getIntent();
            C12775o.m28638h(intent, "intent");
            if (aVar.m24649l(intent)) {
                ContextContainer o2 = this.f17659g.mo47878o2();
                String str = this.f17660h;
                C13623d.m31101a(o2, str, str);
            }
            Intent intent2 = this.f17659g.getIntent();
            C12775o.m28638h(intent2, "intent");
            if (aVar.m24654q(intent2)) {
                this.f17659g.m24616Y2();
                return;
            }
            C11873i E2 = this.f17659g.f17650n;
            if (E2 == null) {
                C12775o.m28656z("controller");
                E2 = null;
            }
            E2.mo49074L2();
        }
    }

    /* renamed from: com.poulpeo.ui.screens.purchase.activation.CashbackActivationActivity$d */
    /* compiled from: CashbackActivationActivity.kt */
    static final class C11203d implements ActivityResultCallback<ActivityResult> {

        /* renamed from: a */
        final /* synthetic */ CashbackActivationActivity f17661a;

        C11203d(CashbackActivationActivity cashbackActivationActivity) {
            this.f17661a = cashbackActivationActivity;
        }

        /* renamed from: a */
        public final void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() == 2) {
                this.f17661a.f17655s = true;
            } else if (Build.VERSION.SDK_INT >= 29) {
                this.f17661a.m24617Z2();
            } else {
                this.f17661a.m24616Y2();
            }
        }
    }

    public CashbackActivationActivity() {
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C11203d(this));
        C12775o.m28638h(registerForActivityResult, "registerForActivityResul…       }\n\n        }\n    }");
        this.f17653q = registerForActivityResult;
    }

    /* renamed from: R2 */
    private final boolean m24609R2() {
        C13735j jVar = new C13735j("[A-Z]");
        String str = Build.VERSION.INCREMENTAL;
        C12775o.m28638h(str, "INCREMENTAL");
        return C13621b.m31096j(C13760y.m31605Q0(jVar.mo53413f(str, ""), 1), "12.0.16.0");
    }

    /* renamed from: S2 */
    private final void m24610S2() {
        CookieRemindersActivity.C11204a aVar = CookieRemindersActivity.f17662n;
        ContextContainer o2 = mo47878o2();
        C11200a aVar2 = f17643u;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        if (aVar.mo46461b(o2, aVar2.m24647j(intent))) {
            Intent intent2 = getIntent();
            C12775o.m28638h(intent2, "intent");
            if (!aVar2.m24655r(intent2)) {
                Intent intent3 = getIntent();
                C12775o.m28638h(intent3, "intent");
                this.f17653q.launch(aVar.mo46462d(this, aVar2.m24648k(intent3)));
                return;
            }
        }
        m24617Z2();
    }

    /* renamed from: T2 */
    private final void m24611T2(C13074a<C11921v> aVar) {
        int i = C13865f.circleProgress;
        ObjectAnimator.ofFloat((CircularProgressBar) mo46446D2(i), "progressBarWidth", new float[]{((float) ((CircularProgressBar) mo46446D2(i)).getWidth()) * 0.5f}).setDuration(200).start();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(100);
        animatorSet.setDuration(1000);
        animatorSet.setInterpolator(new C12058b(C12057a.ELASTIC_OUT));
        ObjectAnimator ofArgb = ObjectAnimator.ofArgb((CircularProgressBar) mo46446D2(i), TypedValues.Custom.S_COLOR, new int[]{this.f17652p});
        ofArgb.setInterpolator(new C12058b(C12057a.QUART_IN));
        C11921v vVar = C11921v.f18618a;
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat((CircularProgressBar) mo46446D2(i), "scaleX", new float[]{1.1f}), ObjectAnimator.ofFloat((CircularProgressBar) mo46446D2(i), "scaleY", new float[]{1.1f}), ObjectAnimator.ofFloat((CircularProgressBar) mo46446D2(i), "progress", new float[]{100.0f}), ofArgb});
        animatorSet.start();
        int i2 = C13865f.layoutActivation;
        RelativeLayout relativeLayout = (RelativeLayout) mo46446D2(i2);
        C12775o.m28638h(relativeLayout, "layoutActivation");
        C12139g.m26475d(relativeLayout, true, 0, 2, (Object) null);
        ((RelativeLayout) mo46446D2(i2)).setAlpha(0.0f);
        new Handler().postDelayed(new C11865a(this), 250);
        new Handler().postDelayed(new C11866b(aVar), 2000);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m24612U2(CashbackActivationActivity cashbackActivationActivity) {
        C12775o.m28639i(cashbackActivationActivity, "this$0");
        cashbackActivationActivity.m24619c3();
        C11873i iVar = cashbackActivationActivity.f17650n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        if (iVar.mo49070B2()) {
            C11200a aVar = f17643u;
            Intent intent = cashbackActivationActivity.getIntent();
            C12775o.m28638h(intent, "intent");
            if (aVar.m24650m(intent)) {
                cashbackActivationActivity.m24620d3();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m24613V2(C13074a aVar) {
        C12775o.m28639i(aVar, "$completion");
        aVar.invoke();
    }

    /* renamed from: W2 */
    private final CharSequence m24614W2() {
        int i;
        C11200a aVar = f17643u;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String b = aVar.m24648k(intent);
        C11873i iVar = this.f17650n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        if (iVar.mo49070B2()) {
            Intent intent2 = getIntent();
            C12775o.m28638h(intent2, "intent");
            if (TextUtils.isEmpty(aVar.m24652o(intent2))) {
                i = R.string.purchase_activation_redirect;
            } else {
                i = R.string.purchase_activation_code;
            }
        } else {
            i = R.string.purchase_activation_cashback;
        }
        String string = getString(i, new Object[]{b});
        C12775o.m28638h(string, "getString(\n            i…}, merchantName\n        )");
        int W = C13755w.m31571W(string, b, 0, false, 6, (Object) null);
        int length = b.length() + W;
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new StyleSpan(1), W, length, 33);
        spannableString.setSpan(new AbsoluteSizeSpan(24, true), W, length, 33);
        return spannableString;
    }

    /* renamed from: X2 */
    private final int m24615X2() {
        return ((Number) this.f17651o.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m24616Y2() {
        C11873i iVar = this.f17650n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(iVar.mo49077z2())));
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m24617Z2() {
        this.f17654r = true;
        C11200a aVar = f17643u;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        if (aVar.m24655r(intent)) {
            C13637r rVar = C13637r.f21957b;
            Intent intent2 = getIntent();
            C12775o.m28638h(intent2, "intent");
            if (rVar.mo53305b(aVar.m24653p(intent2))) {
                Intent intent3 = new Intent();
                Intent intent4 = getIntent();
                C12775o.m28638h(intent4, "intent");
                intent3.putExtra("offerId", aVar.m24653p(intent4));
                setResult(1, intent3);
            }
            finish();
            return;
        }
        C11873i iVar = null;
        if (C11800e.m25362a().mo48941g()) {
            C11873i iVar2 = this.f17650n;
            if (iVar2 == null) {
                C12775o.m28656z("controller");
            } else {
                iVar = iVar2;
            }
            AndroidUtil.openDefaultBrowser(this, iVar.mo49077z2());
            return;
        }
        C11930c.C11931a aVar2 = C11930c.f18632n;
        C11873i iVar3 = this.f17650n;
        if (iVar3 == null) {
            C12775o.m28656z("controller");
        } else {
            iVar = iVar3;
        }
        String z2 = iVar.mo49077z2();
        C12775o.m28638h(z2, "controller.url");
        Intent intent5 = getIntent();
        C12775o.m28638h(intent5, "intent");
        String a = aVar.m24647j(intent5);
        Intent intent6 = getIntent();
        C12775o.m28638h(intent6, "intent");
        aVar2.mo49154b(this, z2, a, aVar.m24653p(intent6));
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m24618b3(CashbackActivationActivity cashbackActivationActivity, View view) {
        C12775o.m28639i(cashbackActivationActivity, "this$0");
        cashbackActivationActivity.finish();
    }

    /* renamed from: c3 */
    private final void m24619c3() {
        ((RelativeLayout) mo46446D2(C13865f.layoutActivation)).setAlpha(1.0f);
        int i = C13865f.viewCheckReveal;
        mo46446D2(i).setScaleX(1.0f);
        mo46446D2(i).setTranslationX(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(800);
        animatorSet.setInterpolator(new C12058b(C12057a.CIRC_IN_OUT));
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(mo46446D2(i), "scaleX", new float[]{0.0f}), ObjectAnimator.ofFloat(mo46446D2(i), "translationX", new float[]{(float) ((ImageView) mo46446D2(C13865f.imageViewCheck)).getWidth()})});
        animatorSet.start();
        int i2 = C13865f.textViewActivated;
        ((TextView) mo46446D2(i2)).setScaleX(0.0f);
        ((TextView) mo46446D2(i2)).setScaleY(0.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(200);
        animatorSet2.setDuration(300);
        animatorSet2.setInterpolator(new C12058b(C12057a.BACK_OUT));
        animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat((TextView) mo46446D2(i2), "scaleX", new float[]{1.0f}), ObjectAnimator.ofFloat((TextView) mo46446D2(i2), "scaleY", new float[]{1.0f})});
        animatorSet2.start();
    }

    /* renamed from: d3 */
    private final void m24620d3() {
        int i = C13865f.layoutAdditionalCashback;
        LinearLayout linearLayout = (LinearLayout) mo46446D2(i);
        C12775o.m28638h(linearLayout, "layoutAdditionalCashback");
        C12139g.m26475d(linearLayout, true, 0, 2, (Object) null);
        ((LinearLayout) mo46446D2(i)).setScaleX(0.0f);
        ((LinearLayout) mo46446D2(i)).setScaleY(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(200);
        animatorSet.setDuration(700);
        animatorSet.setInterpolator(new C12058b(C12057a.ELASTIC_OUT));
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat((LinearLayout) mo46446D2(i), "scaleX", new float[]{1.0f}), ObjectAnimator.ofFloat((LinearLayout) mo46446D2(i), "scaleY", new float[]{1.0f})});
        animatorSet.start();
    }

    /* renamed from: D2 */
    public View mo46446D2(int i) {
        Map<Integer, View> map = this.f17656t;
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

    /* renamed from: P */
    public void mo46447P() {
        if (!isFinishing() && !isDestroyed()) {
            C11873i iVar = this.f17650n;
            if (iVar == null) {
                C12775o.m28656z("controller");
                iVar = null;
            }
            if (iVar.mo49069A2() == 4668248) {
                m24616Y2();
                return;
            }
            String str = Build.MANUFACTURER;
            C12775o.m28638h(str, "MANUFACTURER");
            Locale locale = Locale.ROOT;
            C12775o.m28638h(locale, "ROOT");
            String lowerCase = str.toLowerCase(locale);
            C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!C12775o.m28634d("xiaomi", lowerCase)) {
                m24610S2();
            } else if (Build.VERSION.SDK_INT < 29 || !m24609R2()) {
                m24616Y2();
            } else {
                m24610S2();
            }
        }
    }

    /* renamed from: Q */
    public void mo46448Q(long j) {
        RelativeLayout relativeLayout = (RelativeLayout) mo46446D2(C13865f.layoutActivation);
        C12775o.m28638h(relativeLayout, "layoutActivation");
        C12139g.m26475d(relativeLayout, false, 0, 2, (Object) null);
        int i = C13865f.circleProgress;
        ((CircularProgressBar) mo46446D2(i)).setProgress(0.0f);
        ((CircularProgressBar) mo46446D2(i)).setColor(ContextCompat.getColor(this, R.color.theme));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(500);
        animatorSet.setDuration(j - animatorSet.getStartDelay());
        ObjectAnimator ofArgb = ObjectAnimator.ofArgb((CircularProgressBar) mo46446D2(i), TypedValues.Custom.S_COLOR, new int[]{m24615X2()});
        ofArgb.setInterpolator(new C12058b(C12057a.QUART_IN));
        C11921v vVar = C11921v.f18618a;
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat((CircularProgressBar) mo46446D2(i), "progress", new float[]{100.0f}), ofArgb});
        animatorSet.start();
    }

    /* renamed from: T0 */
    public void mo46449T0(IListener<String> iListener) {
        C12775o.m28639i(iListener, "listener");
        AndroidUtil.retrieveAdvertisingIdAsync(this, iListener);
    }

    /* renamed from: a3 */
    public void mo46450a3(boolean z) {
        if (!z) {
            ((TextView) mo46446D2(C13865f.textViewActivated)).setText(getString(R.string.purchase_code_expired));
            int i = C13865f.textOfLayoutOnboarding;
            ((TextView) mo46446D2(i)).setText(getString(R.string.purchase_text_no_code_unique_offer));
            int i2 = C13865f.buttonOnboardingContinue;
            C11200a aVar = f17643u;
            Intent intent = getIntent();
            C12775o.m28638h(intent, "intent");
            ((Button) mo46446D2(i2)).setText(getString(R.string.purchase_text_button_no_code_unique_offer, new Object[]{aVar.m24648k(intent)}));
            ((ImageView) mo46446D2(C13865f.imageViewCheck)).setImageResource(R.drawable.purchase_unique_offer_warning);
            this.f17652p = ContextCompat.getColor(this, R.color.background_warning);
            mo46446D2(C13865f.viewCheckReveal).setBackgroundColor(ContextCompat.getColor(this, R.color.background_warning));
            Intent intent2 = getIntent();
            C12775o.m28638h(intent2, "intent");
            if (aVar.m24649l(intent2)) {
                C13637r rVar = C13637r.f21957b;
                Intent intent3 = getIntent();
                C12775o.m28638h(intent3, "intent");
                if (!rVar.mo53305b(aVar.m24653p(intent3))) {
                    Intent intent4 = getIntent();
                    C12775o.m28638h(intent4, "intent");
                    if (aVar.m24651n(intent4) <= 0) {
                        TextView textView = (TextView) mo46446D2(i);
                        C12775o.m28638h(textView, "textOfLayoutOnboarding");
                        C12139g.m26475d(textView, false, 0, 2, (Object) null);
                        Intent intent5 = getIntent();
                        C12775o.m28638h(intent5, "intent");
                        if (!aVar.m24650m(intent5)) {
                            ((Button) mo46446D2(i2)).setText(getString(R.string.purchase_text_return_in_poulpeo));
                            ((Button) mo46446D2(i2)).setOnClickListener(new C11867c(this));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ((TextView) mo46446D2(C13865f.textViewActivated)).setText(getString(R.string.purchase_copied_code));
        this.f17652p = ContextCompat.getColor(this, R.color.background_theme);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_cashback_activation);
        mo50358x2("CashbackActivationActivity", true);
        ContextContainer o2 = mo47878o2();
        C13689a aVar = new C13689a(mo47878o2());
        C11200a aVar2 = f17643u;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String a = aVar2.m24647j(intent);
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        String b = aVar2.m24648k(intent2);
        Intent intent3 = getIntent();
        C12775o.m28638h(intent3, "intent");
        String g = aVar2.m24653p(intent3);
        Intent intent4 = getIntent();
        C12775o.m28638h(intent4, "intent");
        boolean d = aVar2.m24650m(intent4);
        C13574r rVar = new C13574r((LinearLayout) mo46446D2(C13865f.layoutOnboardingText));
        C13548a aVar3 = new C13548a((Button) mo46446D2(C13865f.buttonOnboardingContinue));
        Intent intent5 = getIntent();
        C12775o.m28638h(intent5, "intent");
        C11873i iVar = new C11873i(this, new C11873i.C11875b(o2, aVar, a, b, g, d, true, rVar, aVar3, aVar2.m24649l(intent5)));
        this.f17650n = iVar;
        iVar.mo49072J2();
        mo46446D2(C13865f.viewCheckReveal).setBackgroundColor(m24615X2());
        this.f17652p = m24615X2();
        ((TextView) mo46446D2(C13865f.textViewActivation)).setText(m24614W2());
        TextView textView = (TextView) mo46446D2(C13865f.textViewActivated);
        C11873i iVar2 = this.f17650n;
        if (iVar2 == null) {
            C12775o.m28656z("controller");
            iVar2 = null;
        }
        if (iVar2.mo49070B2()) {
            Intent intent6 = getIntent();
            C12775o.m28638h(intent6, "intent");
            if (TextUtils.isEmpty(aVar2.m24652o(intent6))) {
                str = "";
            } else {
                str = getString(R.string.purchase_copied_code);
                C12775o.m28638h(str, "getString(R.string.purchase_copied_code)");
            }
        } else {
            str = getString(R.string.purchase_activated_cashback);
        }
        textView.setText(str);
        LinearLayout linearLayout = (LinearLayout) mo46446D2(C13865f.layoutAdditionalCashback);
        C12775o.m28638h(linearLayout, "layoutAdditionalCashback");
        C12139g.m26475d(linearLayout, false, 0, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C11873i iVar = this.f17650n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo49073K2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C11873i iVar = this.f17650n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo49075M2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C11873i iVar = this.f17650n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo49076N2();
        if (this.f17655s) {
            this.f17655s = false;
            m24617Z2();
        } else if (this.f17654r) {
            mo47877n2();
        }
    }

    /* renamed from: q0 */
    public void mo46451q0() {
        C11873i iVar = this.f17650n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        if (iVar.mo49070B2()) {
            C12136d.m26467i(this, R.string.purchase_activation_code_error);
        } else {
            C12136d.m26467i(this, R.string.purchase_activation_cashback_error);
        }
        finish();
    }

    /* renamed from: s0 */
    public /* bridge */ /* synthetic */ void mo46452s0(Boolean bool) {
        mo46450a3(bool.booleanValue());
    }

    /* renamed from: y1 */
    public void mo46453y1(String str, String str2) {
        C12775o.m28639i(str, "url");
        C11200a aVar = f17643u;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String f = aVar.m24652o(intent);
        if (f != null) {
            C13623d.m31101a(mo47878o2(), f, f);
        }
        m24611T2(new C11202c(this, str2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17649m;
    }
}
