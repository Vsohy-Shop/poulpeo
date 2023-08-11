package com.rmn.apiclient.impl.api.models;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import java.util.ArrayList;
import java.util.List;

public class Page extends BaseModel {
    @NonNull
    private final List<BasePageSection> components = new ArrayList();
    @NonNull
    public final String shortTitle;

    public Page(@NonNull String str, @NonNull String str2) {
        super(str);
        this.shortTitle = str2;
    }

    @NonNull
    public List<BasePageSection> getComponents() {
        return new ArrayList(this.components);
    }

    @NonNull
    public String getId() {
        return this.f18063id;
    }

    @NonNull
    public String toString() {
        return "Page{id='" + this.f18063id + '\'' + ", shortTitle='" + this.shortTitle + '\'' + ", components='" + this.components.size() + " items'" + '}';
    }
}
