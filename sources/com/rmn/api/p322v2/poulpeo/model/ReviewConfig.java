package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.ReviewConfig */
public class ReviewConfig extends AbstractModel {
    private int max_char_count;
    private int min_char_count;
    private int min_paid_char_count;

    public Object getIdentifier() {
        return "ReviewConfig";
    }

    public int getMaxCharCount() {
        return this.max_char_count;
    }

    public int getMinCharCount() {
        return this.min_char_count;
    }

    public int getMinPaidCharCount() {
        return this.min_paid_char_count;
    }

    public boolean isModelValidAfterParsing() {
        if (this.min_char_count >= 0 && this.max_char_count >= 0 && this.min_paid_char_count >= 0) {
            return true;
        }
        return false;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObject(jSONObject, this);
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObject(ParsingMode.CACHE, new JSONObject(str), this);
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
