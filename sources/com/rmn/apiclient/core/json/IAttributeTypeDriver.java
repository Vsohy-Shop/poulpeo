package com.rmn.apiclient.core.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IAttributeTypeDriver<TJ, TF> {
    @Nullable
    TJ convertFromFieldToJson(@NonNull TF tf);

    @Nullable
    TF convertFromJsonToField(@NonNull Class<TF> cls, @Nullable Class<?>[] clsArr, @NonNull TJ tj);

    boolean isFieldType(@NonNull Class<?> cls);

    boolean isJsonType(@NonNull Class<?> cls);
}
