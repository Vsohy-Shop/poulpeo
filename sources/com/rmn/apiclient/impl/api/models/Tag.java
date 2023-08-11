package com.rmn.apiclient.impl.api.models;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.model.BaseModel;

public class Tag extends BaseModel {
    @NonNull
    public final String name;

    public Tag(@NonNull String str, @NonNull String str2) {
        super(str);
        this.name = str2;
    }

    @NonNull
    public String toString() {
        return "Tag{id='" + this.f18063id + '\'' + ", name='" + this.name + '\'' + '}';
    }
}
