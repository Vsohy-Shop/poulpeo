package com.poulpeo.p321ui.screens.merchant;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant.CashbackConditionsActivity;
import com.poulpeo.p321ui.screens.merchant.MerchantInfoActivity;
import com.poulpeo.p321ui.screens.merchant_grid_old.MerchantGridActivityOld;
import com.poulpeo.p321ui.screens.offer.OfferActivity;
import com.poulpeo.p321ui.screens.purchase.activation.CashbackActivationActivity;
import com.poulpeo.p321ui.screens.review_merchant.ReviewMerchantListActivity;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.apiclient.core.model.RemoteImage;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import com.rmn.utils.AsyncImageLoader;
import com.rmn.utils.IntentDelegate;
import com.squareup.picasso.Callback;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p078e9.C7527a;
import p102g9.C7834c;
import p326db.C11800e;
import p336ef.C11921v;
import p351hb.C12047o;
import p360id.C12136d;
import p360id.C12139g;
import p368jd.C12616b;
import p404of.C13074a;
import p409pc.C13200d;
import p410pd.C13204a;
import p415qc.C13240e;
import p415qc.C13242g;
import p427sc.C13390f;
import p431ta.C13450d;
import p431ta.C13455g;
import p431ta.C13456h;
import p431ta.C13457i;
import p431ta.C13460l;
import p431ta.C13462n;
import p431ta.C13464o;
import p431ta.C13474x;
import p440ud.C13558g;
import p440ud.C13565k;
import p440ud.C13574r;
import p445vc.C13619h;
import p450wb.C13689a;
import p462yb.C13865f;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.merchant.MerchantActivity */
/* compiled from: MerchantActivity.kt */
public final class MerchantActivity extends C12616b implements C13464o, C13867a.C13868a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final IntentDelegate.String f17468A = new IntentDelegate.String("offerId");

    /* renamed from: w */
    public static final C11159a f17469w = new C11159a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f17470x = 8;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final IntentDelegate.String f17471y = new IntentDelegate.String("merchantId");
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final IntentDelegate.Boolean f17472z = new IntentDelegate.Boolean("initialLoadFromNetwork");

    /* renamed from: m */
    private final int f17473m = R.string.menu_merchant;

    /* renamed from: n */
    private C13462n f17474n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C13204a f17475o;

    /* renamed from: p */
    private final Lazy f17476p = C11901h.m25690b(new C11162d(this));

    /* renamed from: q */
    private boolean f17477q;

    /* renamed from: r */
    private C13460l f17478r;

    /* renamed from: s */
    private C13474x f17479s;

    /* renamed from: t */
    private MenuItem f17480t;

    /* renamed from: u */
    private AppBarLayout f17481u;

    /* renamed from: v */
    public Map<Integer, View> f17482v = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.merchant.MerchantActivity$a */
    /* compiled from: MerchantActivity.kt */
    public static final class C11159a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17483a;

        static {
            Class<C11159a> cls = C11159a.class;
            f17483a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "merchantId", "getMerchantId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "initialLoadFromNetwork", "getInitialLoadFromNetwork(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "offerId", "getOfferId(Landroid/content/Intent;)Ljava/lang/String;", 0))};
        }

        private C11159a() {
        }

        public /* synthetic */ C11159a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final boolean m24353e(Intent intent) {
            return MerchantActivity.f17472z.getValue(intent, (KProperty<?>) f17483a[1]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final String m24354f(Intent intent) {
            return MerchantActivity.f17471y.getValue(intent, (KProperty<?>) f17483a[0]);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public final String m24355g(Intent intent) {
            return MerchantActivity.f17468A.getValue(intent, (KProperty<?>) f17483a[2]);
        }

        /* renamed from: i */
        public static /* synthetic */ Intent m24356i(C11159a aVar, Context context, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 8) != 0) {
                str2 = null;
            }
            return aVar.mo46357h(context, str, z, str2);
        }

        /* renamed from: j */
        private final void m24357j(Intent intent, boolean z) {
            MerchantActivity.f17472z.setValue(intent, (KProperty<?>) f17483a[1], z);
        }

        /* renamed from: k */
        private final void m24358k(Intent intent, String str) {
            MerchantActivity.f17471y.setValue(intent, (KProperty<?>) f17483a[0], str);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final void m24359l(Intent intent, String str) {
            MerchantActivity.f17468A.setValue(intent, (KProperty<?>) f17483a[2], str);
        }

        /* renamed from: h */
        public final Intent mo46357h(Context context, String str, boolean z, String str2) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "merchantId");
            Intent intent = new Intent(context, MerchantActivity.class);
            C11159a aVar = MerchantActivity.f17469w;
            aVar.m24358k(intent, str);
            aVar.m24357j(intent, z);
            if (str2 == null) {
                str2 = "";
            }
            aVar.m24359l(intent, str2);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant.MerchantActivity$b */
    /* compiled from: MerchantActivity.kt */
    public static final class C11160b implements Callback {

        /* renamed from: a */
        final /* synthetic */ MerchantActivity f17484a;

        /* renamed from: b */
        final /* synthetic */ String f17485b;

        C11160b(MerchantActivity merchantActivity, String str) {
            this.f17484a = merchantActivity;
            this.f17485b = str;
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
            ImageView imageView = (ImageView) this.f17484a.mo46341D2(C13865f.imageViewIllustration);
            C12775o.m28638h(imageView, "imageViewIllustration");
            C12139g.m26475d(imageView, true, 0, 2, (Object) null);
            this.f17484a.m24329O2(this.f17485b);
        }

        public void onSuccess() {
            ImageView imageView = (ImageView) this.f17484a.mo46341D2(C13865f.imageViewIllustration);
            C12775o.m28638h(imageView, "imageViewIllustration");
            C12139g.m26475d(imageView, true, 0, 2, (Object) null);
            this.f17484a.m24329O2(this.f17485b);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant.MerchantActivity$c */
    /* compiled from: MerchantActivity.kt */
    public static final class C11161c implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        private boolean f17486a;

        /* renamed from: b */
        private int f17487b = -1;

        /* renamed from: c */
        final /* synthetic */ CollapsingToolbarLayout f17488c;

        /* renamed from: d */
        final /* synthetic */ String f17489d;

        C11161c(CollapsingToolbarLayout collapsingToolbarLayout, String str) {
            this.f17488c = collapsingToolbarLayout;
            this.f17489d = str;
        }

        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            C12775o.m28639i(appBarLayout, "appBarLayout");
            if (this.f17487b == -1) {
                this.f17487b = appBarLayout.getTotalScrollRange();
            }
            if (this.f17487b + i < 10) {
                this.f17488c.setTitle(this.f17489d);
                this.f17486a = true;
            } else if (this.f17486a) {
                this.f17488c.setTitle("");
                this.f17486a = false;
            }
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant.MerchantActivity$d */
    /* compiled from: MerchantActivity.kt */
    static final class C11162d extends C12777p implements C13074a<C13450d> {

        /* renamed from: g */
        final /* synthetic */ MerchantActivity f17490g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11162d(MerchantActivity merchantActivity) {
            super(0);
            this.f17490g = merchantActivity;
        }

        /* renamed from: b */
        public final C13450d invoke() {
            Merchant q2 = this.f17490g.mo46345L2().mo53044q2();
            C13204a aVar = null;
            if (q2 == null) {
                return null;
            }
            MerchantActivity merchantActivity = this.f17490g;
            C13204a H2 = merchantActivity.f17475o;
            if (H2 == null) {
                C12775o.m28656z("shareController");
            } else {
                aVar = H2;
            }
            String o2 = aVar.mo52851o2(q2.f18063id);
            C12775o.m28638h(o2, "shareController.getDynamicLink(merchant.id)");
            return new C13450d(merchantActivity, true, o2, q2, merchantActivity.mo46345L2().mo53043p2());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m24325J2(MerchantActivity merchantActivity, ValueAnimator valueAnimator) {
        C12775o.m28639i(merchantActivity, "this$0");
        C12775o.m28639i(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C12775o.m28637g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((RatingBar) merchantActivity.mo46341D2(C13865f.ratingBar)).setRating(((Float) animatedValue).floatValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m24326K2(MerchantActivity merchantActivity, String str, float f, int i, View view) {
        C12775o.m28639i(merchantActivity, "this$0");
        C12775o.m28639i(str, "$name");
        C13619h.f21932a.mo53282c("merchant", "see-reviews", merchantActivity.mo46345L2().mo53044q2());
        ReviewMerchantListActivity.C11213a aVar = ReviewMerchantListActivity.f17703q;
        C11159a aVar2 = f17469w;
        Intent intent = merchantActivity.getIntent();
        C12775o.m28638h(intent, "intent");
        merchantActivity.startActivityForResult(aVar.mo46487i(merchantActivity, aVar2.m24354f(intent), str, (double) f, i), 555);
    }

    /* renamed from: M2 */
    private final C13450d m24327M2() {
        return (C13450d) this.f17476p.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m24328N2(MerchantActivity merchantActivity, View view) {
        C12775o.m28639i(merchantActivity, "this$0");
        merchantActivity.m24331Q2();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final void m24329O2(String str) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingLayout);
        AppBarLayout appBarLayout = this.f17481u;
        if (appBarLayout != null && collapsingToolbarLayout != null) {
            C12775o.m28636f(appBarLayout);
            appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new C11161c(collapsingToolbarLayout, str));
        }
    }

    /* renamed from: P2 */
    private final void m24330P2() {
        int i;
        String str;
        Merchant q2 = mo46345L2().mo53044q2();
        if (q2 != null) {
            String str2 = q2.name;
            C12775o.m28638h(str2, "merchant.name");
            Boolean A2 = mo46345L2().mo53037A2();
            C12775o.m28638h(A2, "isFavorite");
            if (A2.booleanValue()) {
                i = R.string.merchant_favorite_add_message;
            } else {
                i = R.string.merchant_favorite_remove_message;
            }
            String string = getString(i, new Object[]{str2});
            C12775o.m28638h(string, "getString(if (isFavorite…ve_message, merchantName)");
            C12136d.m26468j(this, string);
            m24333S2(A2.booleanValue());
            if (A2.booleanValue()) {
                str = "merchant_favorite_add";
            } else {
                str = "merchant_favorite_remove";
            }
            C13240e eVar = new C13240e(new ContextContainer(this));
            eVar.mo52888c(C13242g.f21097i, q2.f18063id);
            if (!C13754v.m31532t(str2)) {
                eVar.mo52888c(C13242g.f21098j, str2);
            }
            eVar.mo52888c(C13242g.f21083N, mo50357w2()).mo52889g(new C13390f(str, q2.f18063id, (String) null));
            if (A2.booleanValue()) {
                C13619h.f21932a.mo53282c("merchant", "add-favorite", q2);
            }
        }
    }

    /* renamed from: Q2 */
    private final void m24331Q2() {
        CashbackConditionsActivity.C11158a aVar = CashbackConditionsActivity.f17453q;
        Merchant q2 = mo46345L2().mo53044q2();
        C12775o.m28636f(q2);
        startActivity(aVar.mo46340r(this, q2, mo46345L2().mo53046s2(), this.f17477q));
    }

    /* renamed from: R2 */
    private final void m24332R2() {
        Merchant q2 = mo46345L2().mo53044q2();
        if (q2 != null) {
            C7834c.m15321a(this).mo41539f(mo47878o2(), q2);
        }
    }

    /* renamed from: S2 */
    private final void m24333S2(boolean z) {
        if (z) {
            MenuItem menuItem = this.f17480t;
            if (menuItem != null) {
                menuItem.setIcon(R.drawable.action_like_on);
            }
        } else {
            MenuItem menuItem2 = this.f17480t;
            if (menuItem2 != null) {
                menuItem2.setIcon(R.drawable.action_like_off);
            }
        }
        C13474x xVar = this.f17479s;
        if (xVar != null) {
            xVar.mo53069f(z);
        }
    }

    /* renamed from: D2 */
    public View mo46341D2(int i) {
        Map<Integer, View> map = this.f17482v;
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

    /* renamed from: E */
    public void mo46342E(Object obj) {
        C12775o.m28639i(obj, "clickedItem");
        if (obj instanceof C7527a) {
            BaseMerchant baseMerchant = ((C7527a) obj).f10424b;
            C12775o.m28638h(baseMerchant, "clickedItem.merchant");
            C13619h.f21932a.mo53282c("merchant-without-offer", "similar-merchant", mo46345L2().mo53044q2());
            C11159a aVar = f17469w;
            String merchantIdString = baseMerchant.getMerchantIdString();
            C12775o.m28638h(merchantIdString, "clickedMerchant.merchantIdString");
            Intent h = aVar.mo46357h(this, merchantIdString, false, (String) null);
            if (getCallingActivity() != null) {
                startActivityForResult(h, 0);
            } else {
                startActivity(h);
            }
        } else if (C12775o.m28634d(obj, "SIMILAR_MERCHANTS")) {
            MerchantGridActivityOld.C11176a aVar2 = MerchantGridActivityOld.f17549p;
            C11159a aVar3 = f17469w;
            Intent intent = getIntent();
            C12775o.m28638h(intent, "intent");
            String b = aVar3.m24354f(intent);
            String string = getString(R.string.no_cashback_similar_merchants_section_title);
            C12775o.m28638h(string, "getString(R.string.no_ca…_merchants_section_title)");
            startActivity(aVar2.mo46399o(this, b, string));
        } else if (C12775o.m28634d(obj, "ADD_FAVORITES")) {
            m24330P2();
        }
    }

    /* renamed from: K */
    public void mo46343K() {
        C13474x xVar = this.f17479s;
        if (xVar != null) {
            xVar.mo53067d();
        }
    }

    /* renamed from: K0 */
    public void mo46344K0() {
        int i = C13865f.layoutContent;
        ((FrameLayout) mo46341D2(i)).removeAllViews();
        FrameLayout frameLayout = (FrameLayout) mo46341D2(i);
        C12775o.m28638h(frameLayout, "layoutContent");
        C12139g.m26475d(frameLayout, false, 0, 2, (Object) null);
    }

    /* renamed from: L2 */
    public final C13462n mo46345L2() {
        C13462n nVar = this.f17474n;
        if (nVar != null) {
            return nVar;
        }
        C12775o.m28656z("controller");
        return null;
    }

    /* renamed from: R */
    public void mo46346R() {
        int i = C13865f.layoutContent;
        FrameLayout frameLayout = (FrameLayout) mo46341D2(i);
        C12775o.m28638h(frameLayout, "layoutContent");
        this.f17478r = new C13460l(this, frameLayout, mo46345L2(), new C13457i(this));
        C13460l lVar = this.f17478r;
        C12775o.m28636f(lVar);
        ((FrameLayout) mo46341D2(i)).addView(lVar.mo53036c());
        FrameLayout frameLayout2 = (FrameLayout) mo46341D2(i);
        C12775o.m28638h(frameLayout2, "layoutContent");
        boolean z = true;
        C12139g.m26475d(frameLayout2, true, 0, 2, (Object) null);
        C11159a aVar = f17469w;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String c = aVar.m24355g(intent);
        if (c.length() <= 0) {
            z = false;
        }
        if (z) {
            Intent intent2 = getIntent();
            C12775o.m28638h(intent2, "intent");
            aVar.m24359l(intent2, "");
            startActivity(OfferActivity.f17608r.mo46434e(this, c, Integer.valueOf(mo46345L2().mo53045r2())));
        }
    }

    /* renamed from: T1 */
    public void mo46347T1(boolean z) {
        this.f17477q = z;
    }

    /* renamed from: k0 */
    public void mo46349k0(List<? extends BaseMerchant> list, int i) {
        C12775o.m28639i(list, "similarMerchants");
        C13474x xVar = this.f17479s;
        if (xVar != null) {
            xVar.mo53068e(list, i);
        }
    }

    /* renamed from: n */
    public void mo46350n(Offer offer) {
        C12775o.m28639i(offer, APIResourceDescriptors.RESOURCE_TYPE_OFFER);
        OfferActivity.C11192a aVar = OfferActivity.f17608r;
        String str = offer.f18063id;
        C12775o.m28638h(str, "offer.id");
        startActivity(aVar.mo46434e(this, str, Integer.valueOf(mo46345L2().mo53045r2())));
    }

    /* renamed from: o */
    public void mo46351o() {
        C12136d.m26467i(this, R.string.merchant_fetch_error_message);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 555 && i2 == 666) {
            mo46345L2().mo53040F2();
        }
        setResult(i2);
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_merchant);
        mo50358x2("MerchantActivity", false);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle((CharSequence) "");
        }
        C11159a aVar = f17469w;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        boolean a = aVar.m24353e(intent);
        if (a) {
            setResult(500);
        }
        this.f17481u = (AppBarLayout) findViewById(R.id.appbar);
        ContextContainer o2 = mo47878o2();
        C13689a aVar2 = new C13689a(mo47878o2());
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        C13462n.C13463a aVar3 = r4;
        C13462n.C13463a aVar4 = new C13462n.C13463a(o2, aVar2, aVar.m24354f(intent2), a, new C13558g((ProgressBar) mo46341D2(C13865f.progressBarLoader)), new C13574r((RelativeLayout) mo46341D2(C13865f.layoutCashbackInfo)), new C13574r(mo46341D2(C13865f.viewOffersInfo)), new ResourceStringWrapper(R.string.merchant_no_cashback), new ResourceStringWrapper(R.string.merchant_no_offers), new ResourceStringWrapper(R.string.merchant_offers_count), new C13565k(R.plurals.merchant_codes_count), new C13565k(R.plurals.merchant_deals_count), new ResourceStringWrapper(R.string.merchant_codes_and_deals_count));
        this.f17474n = new C13462n(this, aVar3);
        mo46345L2().mo53048y2();
        C13204a aVar5 = new C13204a(new C13204a.C13205a(mo47878o2(), "poulpeo"));
        this.f17475o = aVar5;
        aVar5.mo52853r2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        C12775o.m28639i(menu, "menu");
        getMenuInflater().inflate(R.menu.merchant_menu, menu);
        MenuItem findItem = menu.findItem(R.id.action_share);
        MenuItem findItem2 = menu.findItem(R.id.action_info);
        this.f17480t = menu.findItem(R.id.action_like);
        if (mo46345L2().mo53044q2() != null) {
            z = true;
        } else {
            z = false;
        }
        findItem.setVisible(z);
        findItem2.setVisible(z);
        MenuItem menuItem = this.f17480t;
        C12775o.m28636f(menuItem);
        menuItem.setVisible(z);
        if (z) {
            m24333S2(mo46345L2().mo53047v2());
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo46345L2().mo53049z2();
        C13204a aVar = this.f17475o;
        if (aVar == null) {
            C12775o.m28656z("shareController");
            aVar = null;
        }
        aVar.mo52854s2();
        C11800e.m25362a().mo48946l();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C12775o.m28639i(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_share) {
            C13450d M2 = m24327M2();
            if (M2 != null) {
                M2.onShareButtonClicked();
            }
            return true;
        } else if (menuItem.getItemId() == R.id.action_info) {
            MerchantInfoActivity.C11163a aVar = MerchantInfoActivity.f17491o;
            Merchant q2 = mo46345L2().mo53044q2();
            C12775o.m28636f(q2);
            startActivity(aVar.mo46360g(this, q2));
            return true;
        } else if (menuItem != this.f17480t) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            m24330P2();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        mo46345L2().mo53038B2();
        C13204a aVar = this.f17475o;
        if (aVar == null) {
            C12775o.m28656z("shareController");
            aVar = null;
        }
        aVar.mo52855t2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m24332R2();
        mo46345L2().mo53039C2();
        C13204a aVar = this.f17475o;
        if (aVar == null) {
            C12775o.m28656z("shareController");
            aVar = null;
        }
        aVar.mo52856u2();
        C11800e a = C11800e.m25362a();
        C11159a aVar2 = f17469w;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        if (a.mo48945k(aVar2.m24354f(intent))) {
            C12047o.C12048a.m26212n(C12047o.f18841k, this, "merchant", (Function1) null, 4, (Object) null);
        }
    }

    /* renamed from: q */
    public void mo46354q(Merchant merchant) {
        C12775o.m28639i(merchant, "merchant");
        C13619h.f21932a.mo53282c("merchant", "activate-cashback", merchant);
        C13200d dVar = C13200d.f21007a;
        String str = merchant.f18063id;
        C12775o.m28638h(str, "merchant.id");
        String str2 = merchant.name;
        C12775o.m28638h(str2, "merchant.name");
        dVar.mo52833k(this, str, str2);
        startActivity(CashbackActivationActivity.f17643u.mo46454s(this, merchant));
    }

    /* renamed from: q1 */
    public void mo46355q1() {
        int i = C13865f.layoutContent;
        FrameLayout frameLayout = (FrameLayout) mo46341D2(i);
        C12775o.m28638h(frameLayout, "layoutContent");
        this.f17479s = new C13474x(this, frameLayout, this, mo46345L2().mo53047v2());
        C13474x xVar = this.f17479s;
        C12775o.m28636f(xVar);
        ((FrameLayout) mo46341D2(i)).addView(xVar.mo53066c());
        FrameLayout frameLayout2 = (FrameLayout) mo46341D2(i);
        C12775o.m28638h(frameLayout2, "layoutContent");
        C12139g.m26475d(frameLayout2, true, 0, 2, (Object) null);
    }

    /* renamed from: v1 */
    public void mo46356v1(Merchant merchant) {
        C11921v vVar;
        String url;
        URL imageURL;
        String url2;
        C12775o.m28639i(merchant, "merchant");
        m24332R2();
        String str = merchant.name;
        C12775o.m28638h(str, "merchant.name");
        RemoteImage remoteImage = merchant.illustrationTopMobile;
        if (remoteImage == null || (imageURL = remoteImage.getImageURL()) == null || (url2 = imageURL.toString()) == null) {
            vVar = null;
        } else {
            AsyncImageLoader.loadImage((ImageView) mo46341D2(C13865f.imageViewIllustration), (Object) url2, url2, (Callback) new C11160b(this, str));
            vVar = C11921v.f18618a;
        }
        if (vVar == null) {
            ImageView imageView = (ImageView) mo46341D2(C13865f.imageViewIllustration);
            C12775o.m28638h(imageView, "imageViewIllustration");
            C12139g.m26475d(imageView, true, 0, 2, (Object) null);
            m24329O2(str);
        }
        URL logoUrl = merchant.getLogoUrl();
        if (!(logoUrl == null || (url = logoUrl.toString()) == null)) {
            AsyncImageLoader.loadImage((ImageView) mo46341D2(C13865f.imageViewLogo), (Object) url, url, (int) R.drawable.merchant_logo_placeholder);
        }
        ((TextView) mo46341D2(C13865f.textViewTitle)).setText(str);
        float f = merchant.scoreReview;
        int i = merchant.numberReviews;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, f});
        ofFloat.setStartDelay(400);
        ofFloat.setDuration(200);
        ofFloat.addUpdateListener(new C13455g(this));
        ofFloat.start();
        ((LinearLayout) mo46341D2(C13865f.ratingLayout)).setOnClickListener(new C13456h(this, str, f, i));
        ((TextView) mo46341D2(C13865f.textViewNumberReviews)).setText(getResources().getQuantityString(R.plurals.cashback_number_reviews, i, new Object[]{Integer.valueOf(i)}));
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17473m;
    }

    /* renamed from: b0 */
    public void mo46348b0() {
    }
}
