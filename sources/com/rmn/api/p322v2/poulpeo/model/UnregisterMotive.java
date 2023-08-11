package com.rmn.api.p322v2.poulpeo.model;

import androidx.annotation.Nullable;
import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.poulpeo.model.UnregisterMotive */
public enum UnregisterMotive implements IJsonSerialisableEnum {
    UNDEFINED("", (int) null) {
        public Object getJSONValue() {
            return "";
        }
    },
    USELESS("Je n'en ai pas l'utilité", (int) null) {
        public Object getJSONValue() {
            return "useless";
        }
    },
    CANT_USE("Je n'arrive pas à m'en servir", (int) null) {
        public Object getJSONValue() {
            return "cantuse";
        }
    },
    INADEQUATE("Offres insuffisantes", (int) null) {
        public Object getJSONValue() {
            return "inadequate";
        }
    },
    NOT_WORKING("Je n'ai pas reçu mon cashback", (int) null) {
        public Object getJSONValue() {
            return "notworking";
        }
    },
    OTHER("Autre", (int) null) {
        public Object getJSONValue() {
            return "other";
        }
    };
    
    public final String textToDisplay;

    @Nullable
    public static UnregisterMotive findMotive(String str) {
        for (UnregisterMotive unregisterMotive : values()) {
            if (unregisterMotive.getJSONValue().equals(str)) {
                return unregisterMotive;
            }
        }
        return null;
    }

    public String toString() {
        return this.textToDisplay;
    }

    private UnregisterMotive(String str) {
        this.textToDisplay = str;
    }
}
