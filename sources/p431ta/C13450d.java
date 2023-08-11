package p431ta;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.p324ui.screens.AnimatedActivity;
import com.rmn.utils.share.BaseShareManager;
import com.rmn.utils.share.IURLShortener;
import com.rmn.utils.share.URLShortenerFirebaseDynamicLink;
import java.text.NumberFormat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p445vc.C13619h;

@StabilityInferred(parameters = 0)
/* renamed from: ta.d */
/* compiled from: CashbackShareManager.kt */
public final class C13450d extends BaseShareManager {

    /* renamed from: e */
    public static final C13451a f21560e = new C13451a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f21561f = 8;

    /* renamed from: a */
    private final boolean f21562a;

    /* renamed from: b */
    private final String f21563b;

    /* renamed from: c */
    private final Merchant f21564c;

    /* renamed from: d */
    private final Offer f21565d;

    /* renamed from: ta.d$a */
    /* compiled from: CashbackShareManager.kt */
    public static final class C13451a {
        private C13451a() {
        }

        public /* synthetic */ C13451a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13450d(AnimatedActivity animatedActivity, boolean z, String str, Merchant merchant, Offer offer) {
        super(animatedActivity);
        boolean z2;
        C12775o.m28639i(animatedActivity, "activity");
        C12775o.m28639i(str, "url");
        C12775o.m28639i(merchant, "merchant");
        this.f21562a = z;
        this.f21563b = str;
        this.f21564c = merchant;
        this.f21565d = offer;
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private final CashbackObject m30567a() {
        return this.f21564c.getCashbackObject();
    }

    /* renamed from: b */
    private final String m30568b(Resources resources, CashbackObject cashbackObject) {
        String str;
        NumberFormat instance = NumberFormat.getInstance();
        if (cashbackObject.hasIncrease()) {
            str = cashbackObject.getPreviousCashbackText(instance, resources.getString(R.string.merchant_share_last_cashback_suffix));
        } else {
            str = "";
        }
        C12775o.m28638h(str, "if (cashback.hasIncrease…cashback_suffix)) else \"\"");
        String cashbackText = cashbackObject.getCashbackText(instance, resources.getString(R.string.merchant_share_cumulative_cashback), "");
        C12775o.m28638h(cashbackText, "cashback.getCashbackText…cumulative_cashback), \"\")");
        String string = resources.getString(R.string.merchant_share_cashback_title, new Object[]{cashbackText, str});
        C12775o.m28638h(string, "res.getString(R.string.m…kAmount, strLastCashback)");
        return string;
    }

    /* renamed from: c */
    private final String m30569c(Resources resources, CashbackObject cashbackObject) {
        return m30570d(resources, cashbackObject, (Offer) null);
    }

    /* renamed from: d */
    private final String m30570d(Resources resources, CashbackObject cashbackObject, Offer offer) {
        if (offer != null && m30574h(offer)) {
            return m30568b(resources, cashbackObject);
        }
        if (TextUtils.isEmpty(this.f21564c.name)) {
            return m30568b(resources, cashbackObject);
        }
        String string = resources.getString(R.string.merchant_share_merchant_name, new Object[]{m30568b(resources, cashbackObject), this.f21564c.name});
        C12775o.m28638h(string, "res.getString(R.string.m…cashback), merchant.name)");
        return string;
    }

    /* renamed from: e */
    private final Offer m30571e() {
        Offer offer = this.f21565d;
        if (offer == null || !offer.canCombineCashbackAndOffersCodes) {
            return null;
        }
        return offer;
    }

    /* renamed from: f */
    private final String m30572f(Offer offer) {
        boolean z;
        String str = offer.shortTitle;
        C12775o.m28638h(str, "offer.shortTitle");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        String str2 = offer.title;
        C12775o.m28638h(str2, "offer.title");
        return str2;
    }

    /* renamed from: g */
    private final String m30573g(Resources resources, Offer offer) {
        String str;
        if (offer.isValidityEndingSoon(604800000)) {
            str = resources.getString(R.string.merchant_share_expiring_soon_suffix);
        } else {
            str = "";
        }
        C12775o.m28638h(str, "if (offer.isValidityEndi…ring_soon_suffix) else \"\"");
        if (TextUtils.isEmpty(this.f21564c.name) || m30574h(offer)) {
            String f = m30572f(offer);
            return f + str;
        }
        String str2 = this.f21564c.name;
        String string = resources.getString(R.string.merchant_share_merchant_name, new Object[]{m30572f(offer), str2 + str});
        C12775o.m28638h(string, "res.getString(R.string.m…ant.name + strExpiration)");
        return string;
    }

    /* renamed from: h */
    private final boolean m30574h(Offer offer) {
        String str = this.f21564c.name;
        C12775o.m28638h(str, "merchant.name");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = offer.title;
        C12775o.m28638h(str2, "offer.title");
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return C13755w.m31548H(str2, str, true);
    }

    /* access modifiers changed from: protected */
    public String getDefaultShareText(Resources resources, String str) {
        C12775o.m28639i(resources, "res");
        C12775o.m28639i(str, "url");
        CashbackObject a = m30567a();
        Offer e = m30571e();
        if (!this.f21562a) {
            Offer offer = this.f21565d;
            if (offer != null) {
                if (a == null || e == null) {
                    String string = resources.getString(R.string.merchant_share_default_text, new Object[]{m30573g(resources, offer), str});
                    C12775o.m28638h(string, "res.getString(R.string.m…antName(res, offer), url)");
                    return string;
                }
                String string2 = resources.getString(R.string.merchant_share_combined_offers_text, new Object[]{m30572f(e), m30570d(resources, a, e), str});
                C12775o.m28638h(string2, "res.getString(\n         …    url\n                )");
                return string2;
            }
        } else if (a != null) {
            if (e != null) {
                String string3 = resources.getString(R.string.merchant_share_combined_offers_text, new Object[]{m30568b(resources, a), m30573g(resources, e), str});
                C12775o.m28638h(string3, "res.getString(R.string.m…s, cumulativeOffer), url)");
                return string3;
            }
            String string4 = resources.getString(R.string.merchant_share_default_text, new Object[]{m30569c(resources, a), str});
            C12775o.m28638h(string4, "res.getString(R.string.m…Name(res, cashback), url)");
            return string4;
        } else if (e != null) {
            String string5 = resources.getString(R.string.merchant_share_default_text, new Object[]{m30573g(resources, e), str});
            C12775o.m28638h(string5, "res.getString(R.string.m…s, cumulativeOffer), url)");
            return string5;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public String getEmailSubject(Resources resources) {
        C12775o.m28639i(resources, "res");
        String string = resources.getString(R.string.merchant_share_email_subject);
        C12775o.m28638h(string, "res.getString(R.string.m…hant_share_email_subject)");
        return string;
    }

    /* access modifiers changed from: protected */
    public String getLongUrl(Context context) {
        C12775o.m28639i(context, "context");
        return this.f21563b;
    }

    /* access modifiers changed from: protected */
    public IURLShortener newUrlShortener() {
        return new URLShortenerFirebaseDynamicLink();
    }

    /* access modifiers changed from: protected */
    public void trackShareClick() {
        if (this.f21562a) {
            C13619h.f21932a.mo53282c("merchant", "share", this.f21564c);
        } else {
            C13619h.f21932a.mo53283d(C13619h.m31080a("offer-details", this.f21565d), "share", this.f21565d);
        }
    }
}
