package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.poulpeo.model.PLPPinnedObjectModel */
public enum PLPPinnedObjectModel implements IJsonSerialisableEnum {
    COUPON((String) null) {
        public Object getJSONValue() {
            return "coupon";
        }
    },
    MERCHANT((String) null) {
        public Object getJSONValue() {
            return "merchant";
        }
    };

    public static String[] getJSONValues() {
        PLPPinnedObjectModel[] values = values();
        String[] strArr = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            strArr[i] = (String) values[i].getJSONValue();
        }
        return strArr;
    }
}
