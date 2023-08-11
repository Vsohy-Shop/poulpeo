package com.rmn.api.p322v2.common.model;

import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.common.model.NewsletterStatus */
public class NewsletterStatus extends AbstractModel {
    private int id_newsletter;
    private boolean result;

    private NewsletterStatus() {
    }

    public Object getIdentifier() {
        return Integer.valueOf(this.id_newsletter);
    }

    public int getNewsletterId() {
        return this.id_newsletter;
    }

    public boolean getResult() {
        return this.result;
    }

    public boolean isModelValidAfterParsing() {
        return true;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObject(jSONObject, this);
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void setNewsletterId(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        } else if (this.id_newsletter <= 0) {
            this.id_newsletter = i;
        }
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObject(ParsingMode.CACHE, new JSONObject(str), this);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new IllegalArgumentException();
        } else if (jSONObject.has("subscribed")) {
            this.result = jSONObject.optBoolean("subscribed");
        } else if (jSONObject.has("added")) {
            this.result = jSONObject.optBoolean("added");
        } else if (jSONObject.has("removed")) {
            this.result = jSONObject.optBoolean("removed");
        }
    }

    public NewsletterStatus(boolean z) {
        this.result = z;
    }
}
