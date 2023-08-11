package com.rmn.apiclient.impl.api.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;
import java.util.Map;

public class MerchantInfo extends BaseModel {
    @Nullable
    private final Integer bestOfferId = Integer.valueOf(BaseModel.defaultNumber());
    public final int nbOffers = BaseModel.defaultNumber();
    @Nullable
    private final Map<String, Integer> nbOffersByTypes = null;

    public MerchantInfo(@NonNull String str) {
        super(str);
    }

    @NonNull
    public String getBestOfferId() {
        if (hasBestOffer()) {
            return String.valueOf(this.bestOfferId);
        }
        return "";
    }

    public int getNbOffersForType(@NonNull OfferType offerType) {
        if (this.nbOffersByTypes == null) {
            return 0;
        }
        String valueOf = String.valueOf(offerType.getSerializedValue());
        for (Map.Entry next : this.nbOffersByTypes.entrySet()) {
            if (valueOf.equals(next.getKey())) {
                Integer num = (Integer) next.getValue();
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }
        }
        return 0;
    }

    public boolean hasBestOffer() {
        Integer num = this.bestOfferId;
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "MerchantInfo{id='" + this.f18063id + '\'' + ", bestOfferId='" + getBestOfferId() + '\'' + ", nbOffers='" + this.nbOffers + '\'' + '}';
    }
}
