package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;

public class PageSectionProductCard extends BasePageSection {
    @Nullable
    public final String description = BaseModel.defaultString();
    private final int product_card_id = BaseModel.defaultNumber();
    private final boolean sponsored = BaseModel.defaultBoolean();
    @Nullable
    public final String title = BaseModel.defaultString();

    @NonNull
    public String getProductCardId() {
        return String.valueOf(this.product_card_id);
    }

    public boolean isValid() {
        if (this.product_card_id > 0) {
            return true;
        }
        return false;
    }
}
