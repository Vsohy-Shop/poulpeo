package com.rmn.apiclient.core.json;

import androidx.annotation.NonNull;

public abstract class BaseAttributeTypeDriver<TJ, TF> implements IAttributeTypeDriver<TJ, TF> {
    @NonNull
    protected final Class<TF> fieldType;
    @NonNull
    protected final Class<TJ> jsonType;

    public BaseAttributeTypeDriver(@NonNull Class<TJ> cls, @NonNull Class<TF> cls2) {
        this.jsonType = cls;
        this.fieldType = cls2;
    }

    public boolean isFieldType(@NonNull Class<?> cls) {
        if (cls == this.fieldType || (!cls.isEnum() && this.fieldType.isAssignableFrom(cls))) {
            return true;
        }
        return false;
    }

    public boolean isJsonType(@NonNull Class<?> cls) {
        Class<TJ> cls2 = this.jsonType;
        if (cls == cls2 || cls2.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }
}
