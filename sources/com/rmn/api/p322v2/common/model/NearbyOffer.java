package com.rmn.api.p322v2.common.model;

/* renamed from: com.rmn.api.v2.common.model.NearbyOffer */
public class NearbyOffer {
    public final BaseCoupon offer;
    public final StoreAddress storeAddress;

    public NearbyOffer(StoreAddress storeAddress2, BaseCoupon baseCoupon) {
        if (storeAddress2 == null) {
            throw new IllegalArgumentException();
        } else if (baseCoupon != null) {
            this.storeAddress = storeAddress2;
            this.offer = baseCoupon;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
