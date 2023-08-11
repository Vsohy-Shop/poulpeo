package com.rmn.apiclient.impl.jsonapi.structure;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IError;

public class JSONAPIError implements IError {
    @Nullable
    public final String title;
    @NonNull
    public final String type;

    public JSONAPIError(@NonNull String str, @Nullable String str2) {
        this.type = str;
        this.title = str2;
    }
}
