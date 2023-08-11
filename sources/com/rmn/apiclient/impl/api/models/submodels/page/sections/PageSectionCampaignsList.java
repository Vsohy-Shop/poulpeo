package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.apiclient.impl.api.models.submodels.page.SectionRepresentation;

public class PageSectionCampaignsList extends BasePageSection {
    @NonNull
    private final String highlight_campaign_type = BaseModel.defaultString();
    @Nullable
    public final SectionRepresentation.Campaigns representation = SectionRepresentation.Campaigns.BILLBOARD;
    private final boolean sponsored = BaseModel.defaultBoolean();
    @Nullable
    public final String title = BaseModel.defaultString();

    @NonNull
    public String getCampaignType() {
        return this.highlight_campaign_type;
    }

    public boolean isSponsored() {
        return this.sponsored;
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.highlight_campaign_type);
    }
}
