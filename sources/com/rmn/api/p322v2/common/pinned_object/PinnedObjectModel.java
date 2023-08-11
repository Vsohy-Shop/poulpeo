package com.rmn.api.p322v2.common.pinned_object;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.pinned_object.PinnedObjectModel */
public enum PinnedObjectModel implements IJsonSerialisableEnum {
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
        PinnedObjectModel[] values = values();
        String[] strArr = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            strArr[i] = (String) values[i].getJSONValue();
        }
        return strArr;
    }
}
