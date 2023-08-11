package com.rmn.apiclient.impl.jsonapi.serializer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.serializer.ISerializer;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPILinks;
import org.json.JSONObject;

public class JSONAPILinksSerializer implements ISerializer<JSONAPILinks> {
    @NonNull
    private static final String FIELD_FIRST = "first";
    @NonNull
    private static final String FIELD_LAST = "last";
    @NonNull
    private static final String FIELD_NEXT = "next";
    @NonNull
    private static final String FIELD_PREV = "prev";

    @NonNull
    public JSONAPILinks deserialize(@NonNull JSONObject jSONObject) {
        return new JSONAPILinks(JSONHelper.optNullableString(jSONObject, FIELD_FIRST), JSONHelper.optNullableString(jSONObject, FIELD_LAST), JSONHelper.optNullableString(jSONObject, FIELD_PREV), JSONHelper.optNullableString(jSONObject, FIELD_NEXT));
    }

    @Nullable
    public JSONObject serialize(@NonNull JSONAPILinks jSONAPILinks) {
        throw new UnsupportedOperationException("Not implementation needed");
    }
}
