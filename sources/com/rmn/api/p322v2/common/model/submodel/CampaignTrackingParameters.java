package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonCacheSerialisable;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.common.model.submodel.CampaignTrackingParameters */
public class CampaignTrackingParameters implements IJsonNetworkParsable, IJsonCacheSerialisable {
    private int campaign_id;
    private String campaign_name;
    private String medium;
    private String source;

    public int getCampaignId() {
        return this.campaign_id;
    }

    public String getCampaignName() {
        return this.campaign_name;
    }

    public String getMedium() {
        return this.medium;
    }

    public String getSource() {
        return this.source;
    }

    public boolean isModelValidAfterParsing() {
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
