package com.rmn.apiclient.core.data.serializer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

public interface ISerializer<T> {
    @Nullable
    T deserialize(@NonNull JSONObject jSONObject);

    @Nullable
    JSONObject serialize(@NonNull T t);
}
