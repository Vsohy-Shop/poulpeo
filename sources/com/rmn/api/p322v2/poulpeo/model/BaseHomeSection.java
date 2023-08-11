package com.rmn.api.p322v2.poulpeo.model;

import android.text.TextUtils;
import com.rmn.api.p322v2.main.model.AbstractModel;

/* renamed from: com.rmn.api.v2.poulpeo.model.BaseHomeSection */
public abstract class BaseHomeSection extends AbstractModel {
    private String tag;
    private HomeSectionType type;

    public BaseHomeSection() {
    }

    public Object getIdentifier() {
        return this.type.toString() + this.tag;
    }

    public String getTag() {
        return this.tag;
    }

    public HomeSectionType getType() {
        return this.type;
    }

    public boolean isModelValidAfterParsing() {
        if (this.type != null && !TextUtils.isEmpty(this.tag)) {
            return true;
        }
        return false;
    }

    public BaseHomeSection(BaseHomeSection baseHomeSection) {
        this.type = baseHomeSection.type;
        this.tag = baseHomeSection.tag;
    }
}
