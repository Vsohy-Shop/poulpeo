package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.poulpeo.model.EarningStatus */
public enum EarningStatus implements IJsonSerialisableEnum {
    PENDING((String) null) {
        public Object getJSONValue() {
            return "pending";
        }
    },
    ACCEPTED((String) null) {
        public Object getJSONValue() {
            return "accepted";
        }
    },
    REFUSED((String) null) {
        public Object getJSONValue() {
            return "refused";
        }
    };
}
