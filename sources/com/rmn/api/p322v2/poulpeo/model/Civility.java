package com.rmn.api.p322v2.poulpeo.model;

import androidx.annotation.Nullable;
import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.poulpeo.model.Civility */
public enum Civility implements IJsonSerialisableEnum {
    UNDEFINED((String) null) {
        public Object getJSONValue() {
            return "";
        }
    },
    M((String) null) {
        public Object getJSONValue() {
            return "m.";
        }
    },
    MME((String) null) {
        public Object getJSONValue() {
            return "mme";
        }
    };

    @Nullable
    public static Civility findCivility(String str) {
        for (Civility civility : values()) {
            if (civility.getJSONValue().equals(str)) {
                return civility;
            }
        }
        return null;
    }

    public String getCapitalizedCivility() {
        String str = (String) getJSONValue();
        if (str.equals("")) {
            return "";
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public String toString() {
        return getCapitalizedCivility();
    }
}
