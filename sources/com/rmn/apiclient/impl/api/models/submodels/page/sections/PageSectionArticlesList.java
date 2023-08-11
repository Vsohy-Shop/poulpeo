package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import com.rmn.apiclient.core.model.BaseModel;

public class PageSectionArticlesList extends BasePageSectionList {
    private final boolean display_date = BaseModel.defaultBoolean();

    public boolean mustDisplayDate() {
        return this.display_date;
    }
}
