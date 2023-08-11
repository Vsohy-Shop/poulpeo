package com.rmn.apiclient.impl.api.models.submodels.offer;

import androidx.annotation.Nullable;

public class OfferDiscount {
    public final float amount;
    @Nullable
    public final OfferAmountType type;

    public OfferDiscount(float f, @Nullable OfferAmountType offerAmountType) {
        this.amount = f;
        this.type = offerAmountType;
    }
}
