package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.CouponCodeType */
public enum CouponCodeType implements IJsonSerialisableEnum {
    UNIQUE((String) null) {
        public Object getJSONValue() {
            return "unique";
        }
    },
    MULTIPLE((String) null) {
        public Object getJSONValue() {
            return "multiple";
        }
    },
    NEITHER((String) null) {
        public Object getJSONValue() {
            return "neither";
        }
    };
}
