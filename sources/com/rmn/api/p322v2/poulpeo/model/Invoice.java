package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.IJsonCacheSerialisable;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.Invoice */
public class Invoice implements IJsonNetworkParsable, IJsonCacheSerialisable {
    private int content_size;
    private String content_type;
    private String data;
    private int id_invoice;
    private String title;

    public int getContentSize() {
        return this.content_size;
    }

    public String getContentType() {
        return this.content_type;
    }

    public String getData() {
        return this.data;
    }

    public int getInvoiceId() {
        return this.id_invoice;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isModelValidAfterParsing() {
        if (this.id_invoice > 0 && this.title != null) {
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
