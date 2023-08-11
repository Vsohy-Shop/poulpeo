package com.rmn.apiclient.core.data.validator;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.validator.LazyFieldValidator;
import com.rmn.apiclient.core.model.IModel;

public class StrictFieldValidator<M extends IModel, V> extends LazyFieldValidator<M, V> {
    public StrictFieldValidator(@NonNull String str, @NonNull LazyFieldValidator.FieldValidationFunction<M, V> fieldValidationFunction) {
        super(str, fieldValidationFunction, (Object) null);
    }

    public boolean isOptionalField() {
        return false;
    }
}
