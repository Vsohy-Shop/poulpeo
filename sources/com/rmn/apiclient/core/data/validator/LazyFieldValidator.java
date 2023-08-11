package com.rmn.apiclient.core.data.validator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.core.reflection.ReflectionUtils;
import java.lang.reflect.Field;
import p446vd.C13633n;

public class LazyFieldValidator<M extends IModel, V> implements IValidator<M> {
    @Nullable
    private final Object fallbackValue;
    @NonNull
    private final String fieldName;
    @NonNull
    private final FieldValidationFunction<M, V> fieldValidationFunction;

    public interface FieldValidationFunction<M, V> {
        boolean validate(@NonNull M m, @Nullable V v);
    }

    public LazyFieldValidator(@NonNull String str, @NonNull FieldValidationFunction<M, V> fieldValidationFunction2, @Nullable Object obj) {
        this.fieldName = str;
        this.fieldValidationFunction = fieldValidationFunction2;
        this.fallbackValue = obj;
    }

    @NonNull
    public String getErrorMessage(@NonNull IModel iModel) {
        return "The field \"" + getFieldName() + "\" in the model " + iModel + " is not valid";
    }

    @Nullable
    public Object getFallbackValue() {
        return this.fallbackValue;
    }

    @NonNull
    public String getFieldName() {
        return this.fieldName;
    }

    public boolean isOptionalField() {
        return true;
    }

    public boolean validate(@NonNull M m) {
        Field field = ReflectionUtils.getField(m, this.fieldName);
        if (field == null) {
            return false;
        }
        try {
            if (this.fieldValidationFunction.validate(m, ReflectionUtils.getValue(m, field))) {
                return true;
            }
            if (!isOptionalField() || !ReflectionUtils.setValue(getFallbackValue(), m, field)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C13633n.m31165u(this, e);
            return false;
        }
    }
}
