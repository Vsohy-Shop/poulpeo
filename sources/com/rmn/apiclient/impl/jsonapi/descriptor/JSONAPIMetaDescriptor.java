package com.rmn.apiclient.impl.jsonapi.descriptor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.validator.IMetaValidator;

public class JSONAPIMetaDescriptor<T> {
    @NonNull
    public final Class<T> type;
    @NonNull
    public final IMetaValidator<T> validator;

    public JSONAPIMetaDescriptor(@NonNull Class<T> cls, @NonNull IMetaValidator<T> iMetaValidator) {
        this.type = cls;
        this.validator = iMetaValidator;
    }
}
