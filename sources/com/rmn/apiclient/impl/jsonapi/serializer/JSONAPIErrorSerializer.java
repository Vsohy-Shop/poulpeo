package com.rmn.apiclient.impl.jsonapi.serializer;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.serializer.ISerializer;
import com.rmn.apiclient.core.data.structure.IError;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPIError;
import org.json.JSONObject;

public class JSONAPIErrorSerializer implements ISerializer<IError> {
    @NonNull
    private static final String FIELD_TITLE = "title";
    @NonNull
    private static final String FIELD_TYPE = "type";

    @Nullable
    public JSONAPIError deserialize(@NonNull JSONObject jSONObject) {
        String optNullableString = JSONHelper.optNullableString(jSONObject, "type");
        if (TextUtils.isEmpty(optNullableString)) {
            return null;
        }
        return new JSONAPIError(optNullableString, JSONHelper.optNullableString(jSONObject, FIELD_TITLE));
    }

    @Nullable
    public JSONObject serialize(@NonNull IError iError) {
        throw new UnsupportedOperationException("Not implementation needed");
    }
}
