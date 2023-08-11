package com.rmn.apiclient.core.data.serializer;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.model.IModel;
import org.json.JSONObject;

public interface ISpecificParser {
    void parse(@NonNull IModel iModel, @NonNull JSONObject jSONObject);
}
