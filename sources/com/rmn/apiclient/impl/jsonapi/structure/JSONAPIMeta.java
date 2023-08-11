package com.rmn.apiclient.impl.jsonapi.structure;

import androidx.annotation.NonNull;

public class JSONAPIMeta<T> {
    @NonNull
    public final T data;

    public JSONAPIMeta(@NonNull T t) {
        this.data = t;
    }
}
