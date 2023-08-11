package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonCacheSerialisable;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.common.model.submodel.AuthorInfoWrapper */
public class AuthorInfoWrapper implements IJsonNetworkParsable, IJsonCacheSerialisable {
    private AuthorInfo data;
    private AuthorInfoKey key;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorInfoWrapper)) {
            return false;
        }
        AuthorInfoWrapper authorInfoWrapper = (AuthorInfoWrapper) obj;
        if (!this.key.equals(authorInfoWrapper.key)) {
            return false;
        }
        return this.data.equals(authorInfoWrapper.data);
    }

    public AuthorInfo getData() {
        return this.data;
    }

    public AuthorInfoKey getKey() {
        return this.key;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.data.hashCode();
    }

    public boolean isModelValidAfterParsing() {
        if (this.key == null || this.data == null) {
            return false;
        }
        return true;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObject(jSONObject, this);
        return jSONObject.toString();
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObject(ParsingMode.CACHE, new JSONObject(str), this);
        if (!isModelValidAfterParsing()) {
            throw new Exception();
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObject(ParsingMode.NETWORK, jSONObject, this);
        if (!isModelValidAfterParsing()) {
            throw new Exception();
        }
    }
}
