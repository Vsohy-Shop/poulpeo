package com.rmn.apiclient.impl.api.models.submodels.offer;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.json.ISerializableEnumString;

public enum OfferAmountType implements ISerializableEnumString {
    RATE {
        @NonNull
        public String getSerializedValue() {
            return "rate";
        }
    },
    FIXED {
        @NonNull
        public String getSerializedValue() {
            return "fixed";
        }
    };
}
