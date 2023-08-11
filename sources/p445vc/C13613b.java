package p445vc;

import androidx.annotation.NonNull;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;

/* renamed from: vc.b */
/* compiled from: GTMOfferFamily */
public enum C13613b {
    PROMO_CODE("promo-code"),
    GOOD_PLAN("good-plan");
    
    @NonNull

    /* renamed from: b */
    public final String f21892b;

    private C13613b(@NonNull String str) {
        this.f21892b = str;
    }

    @NonNull
    /* renamed from: a */
    public static C13613b m31065a(@NonNull Offer offer) {
        if (offer.getOfferType() == OfferType.CODE) {
            return PROMO_CODE;
        }
        return GOOD_PLAN;
    }
}
