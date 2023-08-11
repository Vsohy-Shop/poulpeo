package com.rmn.apiclient.impl.jsonapi.serializer;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.serializer.ISerializer;
import com.rmn.apiclient.core.data.structure.IResourceId;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPIResourceId;
import org.json.JSONObject;

public class JSONAPIResourceIdSerializer implements ISerializer<IResourceId> {
    @NonNull
    public static final String FIELD_ID = "id";
    @NonNull
    public static final String FIELD_TYPE = "type";

    @Nullable
    public IResourceId deserialize(@NonNull JSONObject jSONObject) {
        String optNullableString = JSONHelper.optNullableString(jSONObject, FIELD_TYPE);
        if (TextUtils.isEmpty(optNullableString)) {
            return null;
        }
        String optNullableString2 = JSONHelper.optNullableString(jSONObject, "id");
        if (TextUtils.isEmpty(optNullableString2)) {
            return null;
        }
        return new JSONAPIResourceId(optNullableString, optNullableString2);
    }

    @Nullable
    public JSONObject serialize(@NonNull IResourceId iResourceId) {
        JSONObject jSONObject = new JSONObject();
        JSONHelper.put(jSONObject, FIELD_TYPE, iResourceId.getType());
        JSONHelper.put(jSONObject, "id", iResourceId.getId());
        return jSONObject;
    }
}
