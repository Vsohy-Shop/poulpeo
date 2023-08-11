package com.rmn.api.p322v2.main.json;

import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.main.json.IJsonNetworkParsable */
public interface IJsonNetworkParsable {
    boolean isModelValidAfterParsing();

    void unserializeFromNetworkData(JSONObject jSONObject);
}
