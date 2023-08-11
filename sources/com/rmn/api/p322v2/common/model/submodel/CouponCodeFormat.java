package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.CouponCodeFormat */
public enum CouponCodeFormat implements IJsonSerialisableEnum {
    CLASSIC((String) null) {
        public Object getJSONValue() {
            return "classic";
        }
    },
    BAR_CODE((String) null) {
        public Object getJSONValue() {
            return "barcode";
        }
    },
    PICTURE((String) null) {
        public Object getJSONValue() {
            return "picture";
        }
    };
}
