package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.Day */
public enum Day implements IJsonSerialisableEnum {
    LUNDI(0, "lundi"),
    MARDI(1, "mardi"),
    MERCREDI(2, "mercredi"),
    JEUDI(3, "jeudi"),
    VENDREDI(4, "vendredi"),
    SAMEDI(5, "samedi"),
    DIMANCHE(6, "dimanche");
    
    private String name;
    private int position;

    private Day(int i, String str) {
        if (str != null) {
            this.name = str;
            this.position = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static Day get(int i) {
        for (Day day : values()) {
            if (day.position == i) {
                return day;
            }
        }
        return null;
    }

    public Object getJSONValue() {
        return Integer.valueOf(this.position);
    }

    public String getName() {
        return this.name;
    }

    public Day next() {
        return get(this.position + 1);
    }
}
