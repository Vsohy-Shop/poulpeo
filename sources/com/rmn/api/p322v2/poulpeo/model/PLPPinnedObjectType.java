package com.rmn.api.p322v2.poulpeo.model;

import androidx.core.app.NotificationCompat;
import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.poulpeo.model.PLPPinnedObjectType */
public enum PLPPinnedObjectType implements IJsonSerialisableEnum {
    SAVE_FOR_LATER((String) null) {
        public Object getJSONValue() {
            return "save_for_later";
        }
    },
    REMINDER((String) null) {
        public Object getJSONValue() {
            return NotificationCompat.CATEGORY_REMINDER;
        }
    };

    public static String[] getJSONValues() {
        PLPPinnedObjectType[] values = values();
        String[] strArr = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            strArr[i] = (String) values[i].getJSONValue();
        }
        return strArr;
    }
}
