package com.rmn.api.p322v2.common.model;

import com.rmn.api.p322v2.common.model.submodel.CashbackType;
import com.rmn.api.p322v2.main.json.IJsonCacheSerialisable;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.common.model.Cashback */
public class Cashback implements IJsonNetworkParsable, IJsonCacheSerialisable {
    private String conditions;
    private boolean mixed;
    private CashbackType type;
    private double value;

    public String getConditions() {
        return this.conditions;
    }

    public CashbackType getType() {
        return this.type;
    }

    public double getValue() {
        return this.value;
    }

    public boolean isMixed() {
        return this.mixed;
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
        Integer num;
        ParsingManagerJson.unserializeObject(ParsingMode.NETWORK, jSONObject, this);
        try {
            num = Integer.valueOf(jSONObject.getInt(JSONAPIResourceIdSerializer.FIELD_TYPE));
        } catch (Exception unused) {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                this.type = CashbackType.PERCENT;
            } else if (num.intValue() == 1) {
                this.type = CashbackType.EURO;
            }
        }
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
