package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.CloudTagType */
public enum CloudTagType implements IJsonSerialisableEnum {
    CATEGORY((String) null) {
        public Object getJSONValue() {
            return "category";
        }
    },
    BRAND((String) null) {
        public Object getJSONValue() {
            return "brand";
        }
    };
}
