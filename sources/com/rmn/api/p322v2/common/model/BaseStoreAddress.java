package com.rmn.api.p322v2.common.model;

import com.rmn.api.p322v2.main.model.AbstractModel;
import org.json.JSONObject;
import p446vd.C13623d;

/* renamed from: com.rmn.api.v2.common.model.BaseStoreAddress */
public abstract class BaseStoreAddress extends AbstractModel {
    private String address;
    private String city;
    private String country;
    private String description;
    private int id_store_address;
    private double latitude;
    private double longitude;
    private String name;
    private String zipcode;

    /* access modifiers changed from: protected */
    public void finishNetworkUnserializing(JSONObject jSONObject) {
        String str = this.description;
        if (str != null) {
            this.description = C13623d.m31111k(str);
        }
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDescription() {
        return this.description;
    }

    public Object getIdentifier() {
        return Integer.valueOf(getStoreAddressId());
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getName() {
        String str = this.name;
        if (str == null) {
            return null;
        }
        if (str.equals("")) {
            return this.name;
        }
        return this.name.substring(0, 1).toUpperCase() + this.name.substring(1);
    }

    public int getStoreAddressId() {
        return this.id_store_address;
    }

    public String getTrackingStoreAddressId() {
        return String.valueOf(this.id_store_address);
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public boolean isModelValidAfterParsing() {
        if (this.id_store_address <= 0) {
            return false;
        }
        return true;
    }
}
