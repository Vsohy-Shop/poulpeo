package com.rmn.apiclient.impl.api.models.submodels.page;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.json.ISerializableEnumString;

public class SectionRepresentation {

    public enum Campaigns implements ISerializableEnumString {
        BILLBOARD("billboard"),
        HORIZONTAL("horizontal");
        
        @NonNull
        public final String tag;

        private Campaigns(@NonNull String str) {
            this.tag = str;
        }

        @NonNull
        public String getSerializedValue() {
            return this.tag;
        }
    }

    public enum List implements ISerializableEnumString {
        VERTICAL("vertical"),
        STANDARD("standard");
        
        @NonNull
        public final String tag;

        private List(@NonNull String str) {
            this.tag = str;
        }

        @NonNull
        public String getSerializedValue() {
            return this.tag;
        }
    }
}
