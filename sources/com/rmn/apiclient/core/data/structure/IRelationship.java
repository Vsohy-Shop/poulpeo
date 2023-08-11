package com.rmn.apiclient.core.data.structure;

import androidx.annotation.NonNull;

public interface IRelationship {
    @NonNull
    String getName();

    @NonNull
    ResourceIdList getResourceIds();
}
