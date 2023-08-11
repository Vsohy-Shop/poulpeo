package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;

public class PageSectionOffer extends BasePageSection {
    @Nullable
    public final String description = BaseModel.defaultString();
    private final int offer_id = BaseModel.defaultNumber();
    private final boolean sponsored = BaseModel.defaultBoolean();
    @Nullable
    public final String title = BaseModel.defaultString();

    @NonNull
    public String getOfferId() {
        return String.valueOf(this.offer_id);
    }

    public boolean isValid() {
        if (this.offer_id > 0) {
            return true;
        }
        return false;
    }
}
