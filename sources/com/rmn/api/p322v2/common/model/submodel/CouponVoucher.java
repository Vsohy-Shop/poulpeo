package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonCacheSerialisable;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.common.model.submodel.CouponVoucher */
public class CouponVoucher implements IJsonNetworkParsable, IJsonCacheSerialisable {
    private double amount;
    private double min_order_amount;
    private CouponAmountType type;

    public double getAmount() {
        return this.amount;
    }

    public double getMinOrderAmount() {
        return this.min_order_amount;
    }

    public CouponAmountType getType() {
        return this.type;
    }

    public boolean isModelValidAfterParsing() {
        if (this.amount > 0.0d && this.type != null && this.min_order_amount >= 0.0d) {
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
