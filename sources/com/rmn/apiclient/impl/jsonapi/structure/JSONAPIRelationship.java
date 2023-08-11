package com.rmn.apiclient.impl.jsonapi.structure;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.structure.IRelationship;
import com.rmn.apiclient.core.data.structure.ResourceIdList;

public class JSONAPIRelationship implements IRelationship {
    @NonNull
    private final String name;
    @NonNull
    private final ResourceIdList resourceIds;

    public JSONAPIRelationship(@NonNull String str, @NonNull ResourceIdList resourceIdList) {
        this.name = str;
        this.resourceIds = resourceIdList;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public ResourceIdList getResourceIds() {
        return this.resourceIds;
    }
}
