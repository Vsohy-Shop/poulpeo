package com.rmn.apiclient.core.data.validator;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.model.IModel;
import p446vd.C13633n;

public class DefaultValidator<M extends IModel> implements IValidator<M> {
    @NonNull
    private final DefaultValidationFunction<M> defaultValidationFunction;
    @NonNull
    private final String errorMessage;

    public interface DefaultValidationFunction<M> {
        boolean validate(@NonNull M m);
    }

    public DefaultValidator(@NonNull DefaultValidationFunction<M> defaultValidationFunction2, @NonNull String str) {
        this.defaultValidationFunction = defaultValidationFunction2;
        this.errorMessage = str;
    }

    @NonNull
    public String getErrorMessage(@NonNull IModel iModel) {
        return this.errorMessage;
    }

    public boolean validate(@NonNull M m) {
        try {
            return this.defaultValidationFunction.validate(m);
        } catch (Exception e) {
            C13633n.m31165u(this, e);
            return false;
        }
    }
}
