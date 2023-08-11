package com.rmn.apiclient.impl.jsonapi.structure;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data.structure.IError;
import com.rmn.apiclient.core.data.structure.ResourceList;
import java.util.ArrayList;
import java.util.List;

public class JSONAPIDocument implements IDocument {
    @NonNull
    private final ResourceList dataResources;
    @NonNull
    private final List<JSONAPIError> errors;
    @NonNull
    private final ResourceList includedResources;
    @Nullable
    private final JSONAPILinks links;
    @Nullable
    private final JSONAPIMeta<?> meta;

    public JSONAPIDocument(@Nullable JSONAPIMeta<?> jSONAPIMeta, @NonNull ResourceList resourceList, @NonNull ResourceList resourceList2, @Nullable JSONAPILinks jSONAPILinks, @Nullable List<JSONAPIError> list) {
        ArrayList arrayList = new ArrayList();
        this.errors = arrayList;
        this.meta = jSONAPIMeta;
        this.dataResources = resourceList;
        this.includedResources = resourceList2;
        this.links = jSONAPILinks;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    @NonNull
    public IDocument copy(@NonNull ResourceList resourceList, @NonNull ResourceList resourceList2) {
        return new JSONAPIDocument(this.meta, resourceList, resourceList2, this.links, this.errors);
    }

    @NonNull
    public ResourceList getDataResources() {
        return this.dataResources;
    }

    @NonNull
    public List<IError> getErrors() {
        return new ArrayList(this.errors);
    }

    @NonNull
    public ResourceList getIncludedResources() {
        return this.includedResources;
    }

    @Nullable
    public JSONAPILinks getLinks() {
        return this.links;
    }

    @Nullable
    public JSONAPIMeta<?> getMeta() {
        return this.meta;
    }

    @Nullable
    public <T> T getMetaObject() {
        JSONAPIMeta<?> jSONAPIMeta = this.meta;
        if (jSONAPIMeta != null) {
            return jSONAPIMeta.data;
        }
        return null;
    }
}
