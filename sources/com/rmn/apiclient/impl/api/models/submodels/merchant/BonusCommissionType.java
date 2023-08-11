package com.rmn.apiclient.impl.api.models.submodels.merchant;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.json.ISerializableEnumString;

public enum BonusCommissionType implements ISerializableEnumString {
    EURO("euro", "€"),
    PERCENTAGE("percent", "%");
    
    @NonNull
    public final String text;
    @NonNull
    public final String value;

    private BonusCommissionType(@NonNull String str, @NonNull String str2) {
        this.value = str;
        this.text = str2;
    }

    @NonNull
    public String getSerializedValue() {
        return this.value;
    }
}
