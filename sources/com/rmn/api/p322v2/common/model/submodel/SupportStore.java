package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.SupportStore */
public enum SupportStore implements IJsonSerialisableEnum {
    ALL((String) null) {
        public Object getJSONValue() {
            return "all";
        }
    },
    SPECIFIC((String) null) {
        public Object getJSONValue() {
            return "specific";
        }
    };
}
