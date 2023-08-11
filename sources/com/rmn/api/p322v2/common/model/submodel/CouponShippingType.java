package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.CouponShippingType */
public enum CouponShippingType implements IJsonSerialisableEnum {
    FREE((String) null) {
        public Object getJSONValue() {
            return "free";
        }
    },
    DISCOUNT((String) null) {
        public Object getJSONValue() {
            return "discount";
        }
    };
}
