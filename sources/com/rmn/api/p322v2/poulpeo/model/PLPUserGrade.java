package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.poulpeo.model.PLPUserGrade */
public enum PLPUserGrade implements IJsonSerialisableEnum {
    DEFAULT((String) null) {
        public Object getJSONValue() {
            return "default";
        }
    },
    POULPEO_PLUS((String) null) {
        public Object getJSONValue() {
            return "plp+";
        }
    };

    public static PLPUserGrade findUserGrade(String str) {
        if (str == null) {
            return null;
        }
        for (PLPUserGrade pLPUserGrade : values()) {
            if (pLPUserGrade.getJSONValue().equals(str)) {
                return pLPUserGrade;
            }
        }
        return null;
    }
}
