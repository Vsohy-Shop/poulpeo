package com.rmn.api.p322v2.common.model.submodel;

import android.text.TextUtils;
import com.rmn.api.p322v2.main.json.IJsonCacheSerialisable;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.common.model.submodel.AuthorInfo */
public class AuthorInfo implements IJsonNetworkParsable, IJsonCacheSerialisable {
    private int id_user;
    private String img;
    private String login;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorInfo)) {
            return false;
        }
        AuthorInfo authorInfo = (AuthorInfo) obj;
        if (this.id_user != authorInfo.id_user) {
            return false;
        }
        String str = this.login;
        if (str == null ? authorInfo.login != null : !str.equals(authorInfo.login)) {
            return false;
        }
        String str2 = this.img;
        String str3 = authorInfo.img;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public String getAvatarUrl() {
        return this.img;
    }

    public String getLogin() {
        return this.login;
    }

    public int getUserId() {
        return this.id_user;
    }

    public int hashCode() {
        int i;
        String str = this.login;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + this.id_user) * 31;
        String str2 = this.img;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public boolean isModelValidAfterParsing() {
        if (!TextUtils.isEmpty(this.login) && this.id_user > 0) {
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
}
