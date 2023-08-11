package com.rmn.apiclient.core.data.serializer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IResource;
import com.rmn.apiclient.core.model.IModel;
import org.json.JSONObject;

public interface IResourceSerializer<M extends IModel> extends ISerializer<IResource<M>> {
    @Nullable
    IResource<M> deserialize(@NonNull JSONObject jSONObject);

    @Nullable
    JSONObject serialize(@NonNull IResource<M> iResource);
}
