package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import p446vd.C13631l;

public class PageSectionText extends BasePageSection {
    @Nullable
    private final String content = BaseModel.defaultString();
    private final boolean sponsored = BaseModel.defaultBoolean();

    @Nullable
    public String getContent() {
        return this.content;
    }

    @NonNull
    public String getPlainTextContent() {
        return C13631l.m31143a(this.content);
    }

    public boolean isSponsored() {
        return this.sponsored;
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(getPlainTextContent());
    }
}
