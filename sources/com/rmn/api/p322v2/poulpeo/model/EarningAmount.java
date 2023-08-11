package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.EarningAmount */
public class EarningAmount extends AbstractModel {
    private double accepted;
    private double payment_threshold;
    private double pending;
    private double total;
    private double total_paid;

    public double getAccepted() {
        return this.accepted;
    }

    public Object getIdentifier() {
        return "EarningAmount";
    }

    public double getPaymentThreshold() {
        return this.payment_threshold;
    }

    public double getPending() {
        return this.pending;
    }

    public double getTotal() {
        return this.total;
    }

    public double getTotalPaid() {
        return this.total_paid;
    }

    public boolean isModelValidAfterParsing() {
        if (this.accepted >= 0.0d && this.pending >= 0.0d && this.total >= 0.0d && this.total_paid >= 0.0d && this.payment_threshold >= 0.0d) {
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
