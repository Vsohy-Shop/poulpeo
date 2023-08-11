package com.rmn.apiclient.impl.api.models;

import androidx.annotation.NonNull;

public class SingleUseOffer {
    @NonNull
    public final String code;

    public SingleUseOffer(@NonNull String str) {
        this.code = str;
    }

    @NonNull
    public String toString() {
        return "SingleUseOffer{code='" + this.code + '\'' + '}';
    }
}
