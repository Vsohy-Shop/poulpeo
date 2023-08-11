package com.rmn.api.p322v2.common.model.submodel;

import android.text.TextUtils;
import com.rmn.api.p322v2.main.json.IJsonCacheSerialisable;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.common.model.submodel.AuthorInfoKey */
public class AuthorInfoKey implements IJsonNetworkParsable, IJsonCacheSerialisable {
    private String id_source;
    private String source;

    public AuthorInfoKey() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorInfoKey)) {
            return false;
        }
        AuthorInfoKey authorInfoKey = (AuthorInfoKey) obj;
        String str = this.source;
        if (str == null ? authorInfoKey.source != null : !str.equals(authorInfoKey.source)) {
            return false;
        }
        String str2 = this.id_source;
        String str3 = authorInfoKey.id_source;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public String getSource() {
        return this.source;
    }

    public String getSourceId() {
        return this.id_source;
    }

    public int hashCode() {
        int i;
        String str = this.source;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.id_source;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public boolean isModelValidAfterParsing() {
        if (!TextUtils.isEmpty(this.source) && !TextUtils.isEmpty(this.id_source)) {
            return true;
        }
        return false;
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

    public AuthorInfoKey(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if (str2 != null) {
            this.source = str;
            this.id_source = str2;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
