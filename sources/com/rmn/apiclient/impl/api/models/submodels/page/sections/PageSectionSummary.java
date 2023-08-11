package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;

public class PageSectionSummary extends BasePageSection {
    @Nullable
    private final String content = BaseModel.defaultString();

    @Nullable
    public String getTitle() {
        return this.content;
    }

    public boolean isValid() {
        return true;
    }
}
