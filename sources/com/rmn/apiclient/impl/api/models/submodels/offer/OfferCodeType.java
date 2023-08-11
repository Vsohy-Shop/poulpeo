package com.rmn.apiclient.impl.api.models.submodels.offer;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.json.ISerializableEnumString;

public enum OfferCodeType implements ISerializableEnumString {
    UNIQUE {
        @NonNull
        public String getSerializedValue() {
            return "unique";
        }
    },
    MULTIPLE {
        @NonNull
        public String getSerializedValue() {
            return "multiple";
        }
    };
}
