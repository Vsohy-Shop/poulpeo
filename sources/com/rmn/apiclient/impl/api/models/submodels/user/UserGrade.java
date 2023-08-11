package com.rmn.apiclient.impl.api.models.submodels.user;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.json.ISerializableEnumInt;

public enum UserGrade implements ISerializableEnumInt {
    DEFAULT(1, "default"),
    AMBASSADOR(2, "ambassador"),
    PLP_PLUS(3, "plp+");
    
    public final int gradeId;
    @NonNull
    public final String slug;

    private UserGrade(int i, @NonNull String str) {
        this.gradeId = i;
        this.slug = str;
    }

    public int getSerializedValue() {
        return this.gradeId;
    }
}
