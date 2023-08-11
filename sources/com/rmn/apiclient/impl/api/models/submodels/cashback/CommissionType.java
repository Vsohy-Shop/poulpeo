package com.rmn.apiclient.impl.api.models.submodels.cashback;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.json.ISerializableEnumInt;

public enum CommissionType implements ISerializableEnumInt {
    EURO(1, "€"),
    PERCENTAGE(2, "%");
    
    @NonNull
    public final String text;
    public final int value;

    private CommissionType(int i, @NonNull String str) {
        this.value = i;
        this.text = str;
    }

    public int getSerializedValue() {
        return this.value;
    }
}
