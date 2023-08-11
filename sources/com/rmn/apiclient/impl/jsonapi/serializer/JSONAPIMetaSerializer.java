package com.rmn.apiclient.impl.jsonapi.serializer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.serializer.ISerializer;
import com.rmn.apiclient.core.json.JSONSerializationManager;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIMetaDescriptor;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPIMeta;
import org.json.JSONObject;
import p446vd.C13633n;

public class JSONAPIMetaSerializer<T> implements ISerializer<JSONAPIMeta<T>> {
    @NonNull
    private final JSONAPIMetaDescriptor<T> descriptor;

    public JSONAPIMetaSerializer(@NonNull JSONAPIMetaDescriptor<T> jSONAPIMetaDescriptor) {
        this.descriptor = jSONAPIMetaDescriptor;
    }

    @Nullable
    public JSONAPIMeta<T> deserialize(@NonNull JSONObject jSONObject) {
        T deserializeObject = JSONSerializationManager.instance.deserializeObject(this.descriptor.type, jSONObject);
        if (deserializeObject == null) {
            return null;
        }
        if (this.descriptor.validator.isValid(deserializeObject)) {
            return new JSONAPIMeta<>(deserializeObject);
        }
        C13633n.m31166v("The meta object is not valid");
        return null;
    }

    @Nullable
    public JSONObject serialize(@NonNull JSONAPIMeta jSONAPIMeta) {
        return JSONSerializationManager.instance.serializeObject(jSONAPIMeta.data);
    }
}
