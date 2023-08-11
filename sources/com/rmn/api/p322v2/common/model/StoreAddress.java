package com.rmn.api.p322v2.common.model;

import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.ModelRef;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.common.model.StoreAddress */
public class StoreAddress extends BaseStoreAddress {
    public static final int SUPER_CLASS_DEPTH = 1;
    private int id_store;
    private String mail;
    private ModelRef<BaseMerchant> merchant_info;
    private String phone;

    public String getMail() {
        return this.mail;
    }

    public BaseMerchant getMerchant() {
        return (BaseMerchant) ModelRef.getModelOrNull(this.merchant_info);
    }

    public int getMerchantId() {
        return this.id_store;
    }

    public ModelRef<BaseMerchant> getMerchantRef() {
        return this.merchant_info;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getWideAddress() {
        String str;
        String address = getAddress();
        if (address != null) {
            str = "" + " " + address + " ";
        } else {
            str = "";
        }
        String zipcode = getZipcode();
        if (zipcode != null) {
            str = str + " " + zipcode + " ";
        }
        String city = getCity();
        if (city != null) {
            str = str + " " + city + " ";
        }
        String replaceAll = str.replaceAll(" +", " ");
        if (replaceAll.equals("")) {
            return "";
        }
        String substring = replaceAll.substring(1);
        if (substring.equals("")) {
            return "";
        }
        return substring.substring(0, substring.length() - 1);
    }

    public boolean isModelValidAfterParsing() {
        if (super.isModelValidAfterParsing() && this.id_store > 0) {
            return true;
        }
        return false;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, 1, "store_info");
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void setMerchantRef(ModelRef<BaseMerchant> modelRef) {
        if (this.merchant_info != null) {
            C13633n.m31163s(this, "Try to set a Store for a StoreAddress but the StoreAddress already has a Store.");
        } else if (modelRef != null) {
            BaseMerchant baseMerchant = modelRef.get();
            if (baseMerchant.getMerchantId() == this.id_store) {
                this.merchant_info = ModelRef.getModelReferenceOrNew(baseMerchant);
                return;
            }
            throw new IllegalStateException("Try to set a Store of id " + baseMerchant.getMerchantId() + " into a StoreAddress model with a parent Store id " + this.id_store);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, 1, new String[0]);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingMode parsingMode = ParsingMode.NETWORK;
        ParsingManagerJson.unserializeObjectExcludingFields(parsingMode, jSONObject, (Object) this, 1, new String[0]);
        if (this.merchant_info == null) {
            ParsingManagerJson.unserializeField(parsingMode, jSONObject, "store_info", (Object) this, "merchant_info");
        }
        finishNetworkUnserializing(jSONObject);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
