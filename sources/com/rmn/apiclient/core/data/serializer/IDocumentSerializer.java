package com.rmn.apiclient.core.data.serializer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import org.json.JSONObject;

public interface IDocumentSerializer extends ISerializer<IDocument> {
    @Nullable
    IDocument deserialize(@NonNull JSONObject jSONObject);

    @Nullable
    JSONObject serialize(@NonNull IDocument iDocument);

    @NonNull
    JSONObject transformForCache(@NonNull JSONObject jSONObject);
}
