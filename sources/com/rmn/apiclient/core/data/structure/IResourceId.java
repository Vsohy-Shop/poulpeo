package com.rmn.apiclient.core.data.structure;

import androidx.annotation.NonNull;

public interface IResourceId {
    @NonNull
    String getId();

    @NonNull
    String getType();
}
