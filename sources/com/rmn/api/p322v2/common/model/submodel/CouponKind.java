package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.CouponKind */
public enum CouponKind implements IJsonSerialisableEnum {
    INSTORE((String) null) {
        public Object getJSONValue() {
            return "instore";
        }
    },
    ONLINE((String) null) {
        public Object getJSONValue() {
            return "web";
        }
    };

    public static CouponKind findFromJSONValue(String str) {
        if (str == null) {
            return null;
        }
        for (CouponKind couponKind : values()) {
            if (couponKind.getJSONValue().equals(str)) {
                return couponKind;
            }
        }
        return null;
    }
}
