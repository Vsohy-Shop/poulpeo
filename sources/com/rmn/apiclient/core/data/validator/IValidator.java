package com.rmn.apiclient.core.data.validator;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.model.IModel;

public interface IValidator<M extends IModel> {
    @NonNull
    String getErrorMessage(@NonNull IModel iModel);

    boolean validate(@NonNull M m);
}
