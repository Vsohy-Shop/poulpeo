package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.MerchantKind */
public enum MerchantKind implements IJsonSerialisableEnum {
    INSTORE((String) null) {
        public Object getJSONValue() {
            return "store";
        }
    },
    ONLINE((String) null) {
        public Object getJSONValue() {
            return "merchant";
        }
    };

    public static MerchantKind findFromJSONValue(String str) {
        if (str == null) {
            return null;
        }
        for (MerchantKind merchantKind : values()) {
            if (merchantKind.getJSONValue().equals(str)) {
                return merchantKind;
            }
        }
        return null;
    }
}
