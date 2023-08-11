package p445vc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;

/* renamed from: vc.h */
/* compiled from: GTMTrackerRMN */
public final class C13619h {
    @NonNull

    /* renamed from: a */
    public static final C13619h f21932a = new C13619h();

    @NonNull
    /* renamed from: a */
    public static String m31080a(@NonNull String str, @Nullable Offer offer) {
        String str2;
        if (offer == null) {
            return "";
        }
        if (offer.getOfferType() == OfferType.CODE) {
            str2 = str + "-promo-code";
        } else {
            str2 = str + "-deal";
        }
        if (offer.canCombineCashbackAndOffersCodes) {
            return str2 + "-combined";
        }
        return str2 + "-not-combined";
    }

    @Deprecated
    /* renamed from: b */
    public void mo53281b(@NonNull String str, @NonNull String str2, @Nullable BaseMerchant baseMerchant) {
        String str3;
        if (baseMerchant != null) {
            str3 = baseMerchant.getName();
        } else {
            str3 = null;
        }
        mo53284e(str, str2, str3);
    }

    /* renamed from: c */
    public void mo53282c(@NonNull String str, @NonNull String str2, @Nullable Merchant merchant) {
        String str3;
        if (merchant != null) {
            str3 = merchant.name;
        } else {
            str3 = null;
        }
        mo53284e(str, str2, str3);
    }

    /* renamed from: d */
    public void mo53283d(@NonNull String str, @NonNull String str2, @Nullable Offer offer) {
        String str3;
        String str4 = null;
        if (offer != null) {
            Merchant merchant = offer.getMerchant();
            if (merchant != null) {
                str4 = merchant.name;
            }
            str3 = offer.title;
        } else {
            str3 = null;
        }
        mo53285f(str, str2, str4 + "-" + str3);
    }

    /* renamed from: e */
    public void mo53284e(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        String str4 = "";
        if (str3 != null) {
            str4 = str4 + str3;
        }
        C13618g.f21930b.mo53279c(str, str2, str4);
    }

    /* renamed from: f */
    public void mo53285f(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        C13618g.f21930b.mo53279c(str, str2, str3);
    }
}
