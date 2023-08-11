package com.rmn.apiclient.impl.api.models.submodels.page;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.json.ISerializableEnumString;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionCampaignsList;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionCashbacksList;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionJumbotron;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionOffersList;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionText;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionTitle;

public enum PageSectionType implements ISerializableEnumString {
    SHORT_CODE("itemShortcode") {
        @NonNull
        public BasePageSection newSection() {
            return new PageSectionShortCode();
        }
    },
    TITLE("itemTitle") {
        @NonNull
        public BasePageSection newSection() {
            return new PageSectionTitle();
        }
    },
    TEXT("itemText") {
        @NonNull
        public BasePageSection newSection() {
            return new PageSectionText();
        }
    },
    JUMBOTRON("itemJumbotron") {
        @NonNull
        public BasePageSection newSection() {
            return new PageSectionJumbotron();
        }
    },
    LIST_CAMPAIGNS("itemHighlightCampaign") {
        @NonNull
        public BasePageSection newSection() {
            return new PageSectionCampaignsList();
        }
    },
    LIST_CASHBACKS("listCashbacks") {
        @NonNull
        public BasePageSection newSection() {
            return new PageSectionCashbacksList();
        }
    },
    LIST_CASHBACKS_PICTURED("listCashbacksPictured") {
        @NonNull
        public BasePageSection newSection() {
            return new PageSectionCashbacksList();
        }
    },
    LIST_OFFERS("listCoupons") {
        @NonNull
        public BasePageSection newSection() {
            return new PageSectionOffersList();
        }
    },
    LIST_OFFERS_PICTURED("listCouponsPictured") {
        @NonNull
        public BasePageSection newSection() {
            return new PageSectionOffersList();
        }
    };
    
    @NonNull
    public final String type;

    @NonNull
    public String getSerializedValue() {
        return this.type;
    }

    @NonNull
    public abstract BasePageSection newSection();

    private PageSectionType(@NonNull String str) {
        this.type = str;
    }
}
