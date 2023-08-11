package p338fb;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import android.widget.Toast;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.purchase.customtabs.ChromeCustomTabsReceiver;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import com.rmn.utils.AndroidUtil;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p102g9.C7832a;
import p326db.C11797c;
import p326db.C11799d;
import p326db.C11800e;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p450wb.C13689a;
import p462yb.C13857a;

@StabilityInferred(parameters = 0)
/* renamed from: fb.c */
/* compiled from: PurchaseCustomTabs.kt */
public final class C11930c extends C11926a implements C11799d {

    /* renamed from: n */
    public static final C11931a f18632n = new C11931a((DefaultConstructorMarker) null);

    /* renamed from: o */
    public static final int f18633o = 8;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static C11930c f18634p;

    /* renamed from: q */
    private static final int[] f18635q = {R.id.buttonCashbackBottomBar, R.id.buttonCodesBottomBar};

    /* renamed from: i */
    private final String f18636i;

    /* renamed from: j */
    private final String f18637j;

    /* renamed from: k */
    private boolean f18638k;

    /* renamed from: l */
    private final ContextContainer f18639l;

    /* renamed from: m */
    private C11797c f18640m;

    /* renamed from: fb.c$a */
    /* compiled from: PurchaseCustomTabs.kt */
    public static final class C11931a {
        private C11931a() {
        }

        public /* synthetic */ C11931a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11930c mo49153a() {
            return C11930c.f18634p;
        }

        /* renamed from: b */
        public final void mo49154b(Activity activity, String str, String str2, String str3) {
            C12775o.m28639i(activity, "activity");
            C12775o.m28639i(str, "url");
            C12775o.m28639i(str2, "merchantId");
            C12775o.m28639i(str3, "offerId");
            if (AndroidUtil.isBrowserInstalledAndEnabled(activity, "com.android.chrome")) {
                C11930c.f18634p = new C11930c(activity, str, str2, str3);
            } else {
                AndroidUtil.openDefaultBrowser(activity, str);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11930c(Activity activity, String str, String str2, String str3) {
        super(activity, str);
        C12775o.m28639i(activity, "activity");
        C12775o.m28639i(str, "url");
        C12775o.m28639i(str2, "merchantId");
        C12775o.m28639i(str3, "offerId");
        this.f18636i = str2;
        this.f18637j = str3;
        this.f18639l = new ContextContainer(activity);
    }

    /* renamed from: o2 */
    private final int m25744o2() {
        C11797c cVar = this.f18640m;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        if (cVar.mo48935z2()) {
            return R.drawable.button_style_cashback_activated_no_ripple;
        }
        return R.drawable.button_style_cashback_inactive_no_ripple;
    }

    /* renamed from: p2 */
    private final int m25745p2() {
        C11797c cVar = this.f18640m;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        if (cVar.mo48935z2()) {
            return R.drawable.purchase_check;
        }
        return R.drawable.purchase_disabled;
    }

    /* renamed from: q2 */
    private final String m25746q2() {
        C11797c cVar = this.f18640m;
        C11797c cVar2 = null;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        if (!cVar.mo48933x2()) {
            String string = mo49142E().getString(R.string.purchase_no_cashback);
            C12775o.m28638h(string, "context.getString(R.string.purchase_no_cashback)");
            return string;
        }
        C11797c cVar3 = this.f18640m;
        if (cVar3 == null) {
            C12775o.m28656z("controller");
        } else {
            cVar2 = cVar3;
        }
        if (!cVar2.mo48935z2()) {
            String string2 = mo49142E().getString(R.string.purchase_inactive_cashback);
            C12775o.m28638h(string2, "context.getString(R.stri…rchase_inactive_cashback)");
            return string2;
        }
        String string3 = mo49142E().getString(R.string.purchase_activated_cashback);
        C12775o.m28638h(string3, "context.getString(R.stri…chase_activated_cashback)");
        return string3;
    }

    /* renamed from: r2 */
    private final String m25747r2() {
        C11797c cVar = this.f18640m;
        C11797c cVar2 = null;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        if (cVar.mo48932w2() <= 0) {
            String string = mo49142E().getString(R.string.merchant_zero_offers);
            C12775o.m28638h(string, "context.getString(R.string.merchant_zero_offers)");
            return string;
        }
        Resources resources = mo49142E().getResources();
        Object[] objArr = new Object[1];
        C11797c cVar3 = this.f18640m;
        if (cVar3 == null) {
            C12775o.m28656z("controller");
        } else {
            cVar2 = cVar3;
        }
        objArr[0] = Integer.valueOf(cVar2.mo48932w2());
        String string2 = resources.getString(R.string.merchant_offers_count, objArr);
        C12775o.m28638h(string2, "context.resources.getStr…unt, controller.nbOffers)");
        return string2;
    }

    /* renamed from: C0 */
    public void mo46465C0(Offer offer) {
        C12775o.m28639i(offer, APIResourceDescriptors.RESOURCE_TYPE_OFFER);
    }

    /* renamed from: J0 */
    public CustomTabsCallback mo49143J0() {
        return new C11929b(mo49142E(), mo49149t0());
    }

    /* renamed from: M0 */
    public void mo49144M0() {
        super.mo49144M0();
        if (!this.f18638k) {
            C11797c cVar = new C11797c(this, new C11797c.C11798a(this.f18639l, new C13689a(this.f18639l), this.f18636i, this.f18637j, new ResourceStringWrapper(R.string.purchase_verify_conditions), new ResourceStringWrapper(R.string.purchase_paste_code_in_cart)));
            this.f18640m = cVar;
            cVar.mo48921D2();
            this.f18638k = true;
        }
    }

    /* renamed from: U1 */
    public void mo46467U1(String str) {
        C12775o.m28639i(str, "text");
        Toast.makeText(mo49142E(), str, 1).show();
    }

    /* renamed from: W1 */
    public void mo46468W1() {
        C11797c cVar = this.f18640m;
        C11797c cVar2 = null;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        Merchant v2 = cVar.mo48931v2();
        C11800e.m25362a().mo48949o(v2);
        new C7832a("PurchaseCustomTabs", false).mo41539f(this.f18639l, v2);
        C13616e e = new C13616e("purchase", C13617f.PURCHASE).mo53274e(v2);
        C12775o.m28638h(e, "GTMScreenEventRMN(\n     …  ).setMerchant(merchant)");
        C11797c cVar3 = this.f18640m;
        if (cVar3 == null) {
            C12775o.m28656z("controller");
        } else {
            cVar2 = cVar3;
        }
        Offer r2 = cVar2.mo48930r2();
        if (r2 != null) {
            e.mo53276g(r2);
        }
        C13618g.f21930b.mo53280e(e);
        mo49152s2();
    }

    /* renamed from: Y0 */
    public void mo46469Y0(Offer offer, int i) {
        C12775o.m28639i(offer, APIResourceDescriptors.RESOURCE_TYPE_OFFER);
        mo49152s2();
    }

    /* renamed from: s2 */
    public final void mo49152s2() {
        RemoteViews remoteViews = new RemoteViews(mo49142E().getPackageName(), R.layout.purchase_bottom_bar);
        boolean z = false;
        remoteViews.setInt(R.id.remoteView, "setVisibility", 0);
        C11797c cVar = this.f18640m;
        C11797c cVar2 = null;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        remoteViews.setBoolean(R.id.buttonCashbackBottomBar, "setEnabled", cVar.mo48933x2());
        remoteViews.setInt(R.id.buttonCashbackBottomBar, "setBackgroundResource", m25744o2());
        remoteViews.setTextViewCompoundDrawables(R.id.buttonCashbackBottomBar, m25745p2(), 0, 0, 0);
        remoteViews.setTextViewText(R.id.buttonCashbackBottomBar, m25746q2());
        remoteViews.setTextViewText(R.id.buttonCodesBottomBar, m25747r2());
        C11797c cVar3 = this.f18640m;
        if (cVar3 == null) {
            C12775o.m28656z("controller");
        } else {
            cVar2 = cVar3;
        }
        if (cVar2.mo48932w2() > 0) {
            z = true;
        }
        remoteViews.setBoolean(R.id.buttonCodesBottomBar, "setEnabled", z);
        CustomTabsSession b0 = mo49147b0();
        if (b0 != null) {
            b0.setSecondaryToolbarViews(remoteViews, f18635q, ChromeCustomTabsReceiver.f17667a.mo46464g(mo49142E(), mo49149t0(), this.f18636i, this.f18637j));
        }
    }

    /* renamed from: v */
    public void mo49150v(CustomTabsIntent.Builder builder) {
        C12775o.m28639i(builder, "builder");
        super.mo49150v(builder);
        builder.setSecondaryToolbarViews(new RemoteViews(mo49142E().getPackageName(), R.layout.purchase_bottom_bar), (int[]) null, (PendingIntent) null);
        builder.setShowTitle(true);
        Context E = mo49142E();
        C13857a aVar = C13857a.f22382a;
        builder.setStartAnimations(E, aVar.mo53541d(), aVar.mo53542e());
        builder.setExitAnimations(mo49142E(), aVar.mo53538a(), aVar.mo53539b());
        builder.setUrlBarHidingEnabled(true);
    }

    /* renamed from: w1 */
    public void mo46470w1() {
    }
}
