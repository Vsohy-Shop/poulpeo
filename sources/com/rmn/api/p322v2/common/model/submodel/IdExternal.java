package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonCacheSerialisable;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.common.model.submodel.IdExternal */
public class IdExternal implements IJsonNetworkParsable, IJsonCacheSerialisable {
    private Map<String, String> id_external;
    private JSONObject jsonObjectOriginal;

    public String getExternalId(String str) {
        if (this.id_external != null && str != null && !str.equals("") && this.id_external.containsKey(str)) {
            return this.id_external.get(str);
        }
        return null;
    }

    public boolean isModelValidAfterParsing() {
        return true;
    }

    public String serializeToCacheData() {
        return this.jsonObjectOriginal.toString();
    }

    public void unserializeFromCacheData(String str) {
        unserializeFromNetworkData(new JSONObject(str));
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.id_external = new HashMap(15);
            for (int i = 0; i <= 15; i++) {
                String str = "" + i;
                String optString = jSONObject.optString(str);
                if (optString != null) {
                    this.id_external.put(str, optString);
                }
            }
        }
        this.jsonObjectOriginal = jSONObject;
    }
}
