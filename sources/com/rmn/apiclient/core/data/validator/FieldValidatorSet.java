package com.rmn.apiclient.core.data.validator;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.model.IModel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FieldValidatorSet<M extends IModel> implements Iterable<IValidator<M>> {
    @NonNull
    private final Set<IValidator<M>> fieldValidators = new HashSet();

    @SafeVarargs
    public FieldValidatorSet(@NonNull IValidator<M>... iValidatorArr) {
        int length = iValidatorArr.length;
        int i = 0;
        while (i < length) {
            IValidator<M> iValidator = iValidatorArr[i];
            if (iValidator != null) {
                this.fieldValidators.add(iValidator);
                i++;
            } else {
                throw new IllegalArgumentException("A validator in parameters is null");
            }
        }
    }

    @NonNull
    public Iterator<IValidator<M>> iterator() {
        return this.fieldValidators.iterator();
    }
}
