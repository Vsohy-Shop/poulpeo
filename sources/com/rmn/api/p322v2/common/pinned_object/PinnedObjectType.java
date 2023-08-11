package com.rmn.api.p322v2.common.pinned_object;

import androidx.core.app.NotificationCompat;
import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.pinned_object.PinnedObjectType */
public enum PinnedObjectType implements IJsonSerialisableEnum {
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
        PinnedObjectType[] values = values();
        String[] strArr = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            strArr[i] = (String) values[i].getJSONValue();
        }
        return strArr;
    }
}
