package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.CashbackType */
public enum CashbackType implements IJsonSerialisableEnum {
    PERCENT((String) null) {
        public String getDisplay() {
            return "%";
        }

        public Object getJSONValue() {
            return "percent";
        }
    },
    EURO((String) null) {
        public String getDisplay() {
            return "€";
        }

        public Object getJSONValue() {
            return "euro";
        }
    };

    public abstract String getDisplay();
}
