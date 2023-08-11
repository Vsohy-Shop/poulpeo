package com.rmn.apiclient.core.data.serializer;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.json.JSONSerializationManager;
import com.rmn.apiclient.core.model.IModel;
import org.json.JSONObject;

public class ObjectParser implements ISpecificParser {
    @NonNull
    public final String childObjectPath;

    public ObjectParser(@NonNull String str) {
        this.childObjectPath = str;
    }

    public void parse(@NonNull IModel iModel, @NonNull JSONObject jSONObject) {
        String[] split = this.childObjectPath.split("\\.");
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str = split[i];
            if (str != null && jSONObject != null) {
                jSONObject = jSONObject.optJSONObject(str);
                i++;
            } else {
                return;
            }
        }
        if (jSONObject != null) {
            JSONSerializationManager.instance.deserialize(jSONObject, iModel);
        }
    }
}
