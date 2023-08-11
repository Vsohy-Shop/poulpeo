package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.poulpeo.model.HomeSectionBanner;
import com.rmn.apiclient.core.json.ISerializableEnumString;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;

public class PageSectionShortCode extends BasePageSection {
    @NonNull
    private final ShortCode content = null;

    public enum ShortCode implements ISerializableEnumString {
        BANNER1(HomeSectionBanner.TAG_BANNER_1),
        BANNER2(HomeSectionBanner.TAG_BANNER_2),
        FAVORITES("favorites");
        
        @NonNull
        public final String tag;

        private ShortCode(@NonNull String str) {
            this.tag = str;
        }

        @NonNull
        public String getSerializedValue() {
            return this.tag;
        }
    }

    @NonNull
    public ShortCode getShortCode() {
        return this.content;
    }

    public boolean isValid() {
        if (this.content != null) {
            return true;
        }
        return false;
    }
}
