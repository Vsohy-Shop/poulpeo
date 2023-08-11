package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonCacheSerialisable;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.common.model.submodel.MerchantBonusObject */
public class MerchantBonusObject implements IJsonNetworkParsable, IJsonCacheSerialisable {
    private Date date_end;
    private Date date_start;
    private String grade;
    private CashbackType type;
    private double value;

    public Date getDateEnd() {
        return this.date_end;
    }

    public Date getDateStart() {
        return this.date_start;
    }

    public String getGrade() {
        return this.grade;
    }

    public CashbackType getType() {
        return this.type;
    }

    public double getValue() {
        return this.value;
    }

    public boolean isModelValidAfterParsing() {
        if (this.value > 0.0d && this.type != null) {
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
