package com.rmn.api.p322v2.poulpeo.model;

import android.text.TextUtils;
import com.rmn.api.p322v2.main.json.IJsonCacheableModel;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.poulpeo.model.Country */
public class Country implements IJsonNetworkParsable, IJsonCacheableModel {
    private String code;
    private String label;
    private PaymentMethod[] payment_methods;

    public Country() {
    }

    public String getCode() {
        return this.code;
    }

    public Object getIdentifier() {
        return this.code;
    }

    public String getLabel() {
        return this.label;
    }

    public Set<PaymentMethod> getPaymentMethods() {
        if (this.payment_methods == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (PaymentMethod add : this.payment_methods) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public boolean isModelValidAfterParsing() {
        if (TextUtils.isEmpty(this.code) || TextUtils.isEmpty(this.label)) {
            return false;
        }
        return true;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, new String[0]);
        return jSONObject.toString();
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, new String[0]);
        if (!isModelValidAfterParsing()) {
            throw new Exception();
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.NETWORK, jSONObject, (Object) this, new String[0]);
        if (!isModelValidAfterParsing()) {
            throw new Exception();
        }
    }

    public Country(String str, String str2, Set<PaymentMethod> set) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        } else if (!TextUtils.isEmpty(str2)) {
            this.code = str;
            this.label = str2;
            if (set != null) {
                this.payment_methods = (PaymentMethod[]) set.toArray(new PaymentMethod[set.size()]);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
