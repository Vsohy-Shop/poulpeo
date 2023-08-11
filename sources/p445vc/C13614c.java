package p445vc;

import androidx.annotation.NonNull;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferAmountType;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferDiscount;

/* renamed from: vc.c */
/* compiled from: GTMOfferSubFamily */
public enum C13614c {
    UNKNOW(""),
    REDUCTION_EUROS("reduction€"),
    REDUCTION_PERCENT("reduction%"),
    PRIVATE_SALE("private-sale"),
    DELIVERY("delivery"),
    REIMBURSEMENT("reimbursement"),
    VOLUME_DISCOUNT("volume-discount"),
    GIFT_CARD("gift-card"),
    FLASH_SALE("flash-sale"),
    LOW_PRICES("low-prices"),
    SALES("sales");
    
    @NonNull

    /* renamed from: b */
    public final String f21905b;

    private C13614c(@NonNull String str) {
        this.f21905b = str;
    }

    @NonNull
    /* renamed from: a */
    public static C13614c m31066a(@NonNull Offer offer) {
        OfferDiscount offerDiscount = offer.discount;
        if (offerDiscount != null) {
            if (offerDiscount.type == OfferAmountType.FIXED) {
                return REDUCTION_EUROS;
            }
            return REDUCTION_PERCENT;
        } else if (offer.hasShipping) {
            return REDUCTION_PERCENT;
        } else {
            return UNKNOW;
        }
    }
}
