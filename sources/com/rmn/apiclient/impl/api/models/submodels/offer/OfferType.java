package com.rmn.apiclient.impl.api.models.submodels.offer;

import com.rmn.apiclient.core.json.ISerializableEnumInt;

public enum OfferType implements ISerializableEnumInt {
    CODE(1),
    SALES(2),
    DESTOCKING(3),
    DEAL(4),
    PRIVATE_SALE(5),
    FLASH_SALE(6),
    CONTEST(8),
    GIFT_CARD(9);
    
    private final int offerTypeId;

    private OfferType(int i) {
        this.offerTypeId = i;
    }

    public int getSerializedValue() {
        return this.offerTypeId;
    }
}
