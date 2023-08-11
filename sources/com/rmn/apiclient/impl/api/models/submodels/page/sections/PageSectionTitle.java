package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;

public class PageSectionTitle extends BasePageSection {
    @NonNull
    public final String content = BaseModel.defaultString();

    public boolean isValid() {
        return !TextUtils.isEmpty(this.content);
    }
}
