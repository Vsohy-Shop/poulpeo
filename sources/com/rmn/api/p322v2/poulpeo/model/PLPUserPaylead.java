package com.rmn.api.p322v2.poulpeo.model;

import android.text.TextUtils;
import com.rmn.api.p322v2.main.json.IJsonCacheableModel;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.PLPUserPaylead */
public class PLPUserPaylead implements IJsonNetworkParsable, IJsonCacheableModel {
    private boolean has_scrapping_error;

    /* renamed from: id */
    private String f17961id;
    private int nb_sync_accounts;
    private String scrapping_error;

    public Object getIdentifier() {
        return this.f17961id;
    }

    public int getNbSyncAccounts() {
        return this.nb_sync_accounts;
    }

    public String getPayleadId() {
        return this.f17961id;
    }

    public String getScrappingError() {
        return this.scrapping_error;
    }

    public boolean hasScrappingError() {
        return this.has_scrapping_error;
    }

    public boolean isModelValidAfterParsing() {
        if (TextUtils.isEmpty(this.f17961id)) {
            return false;
        }
        return true;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, new String[0]);
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, new String[0]);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObject(ParsingMode.NETWORK, jSONObject, this);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
