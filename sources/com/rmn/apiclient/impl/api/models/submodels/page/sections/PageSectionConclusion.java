package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;

public class PageSectionConclusion extends BasePageSection {
    @Nullable
    public final String title = BaseModel.defaultString();

    public boolean isValid() {
        return true;
    }
}
