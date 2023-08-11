package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.CouponAmountType */
public enum CouponAmountType implements IJsonSerialisableEnum {
    RATE((String) null) {
        public Object getJSONValue() {
            return "rate";
        }
    },
    FIXED((String) null) {
        public Object getJSONValue() {
            return "fixed";
        }
    };
}
