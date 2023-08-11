package com.rmn.apiclient.core.reflection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.json.ISerializableEnumInt;
import com.rmn.apiclient.core.json.ISerializableEnumString;

public class EnumUtils {
    @Nullable
    public static <T extends ISerializableEnumInt> T findWithSerializedValue(@NonNull Class<T> cls, @Nullable Integer num) {
        if (num == null || !cls.isEnum()) {
            return null;
        }
        for (T t : (ISerializableEnumInt[]) cls.getEnumConstants()) {
            if (num.equals(Integer.valueOf(t.getSerializedValue()))) {
                return t;
            }
        }
        return null;
    }

    @Nullable
    public static <T extends ISerializableEnumString> T findWithSerializedValue(@NonNull Class<T> cls, @Nullable String str) {
        if (str == null || !cls.isEnum()) {
            return null;
        }
        for (T t : (ISerializableEnumString[]) cls.getEnumConstants()) {
            if (str.equals(t.getSerializedValue())) {
                return t;
            }
        }
        return null;
    }
}
