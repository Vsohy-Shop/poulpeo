package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.PLPUser */
public class PLPUser extends BasePLPUser {
    private String address;
    private String bic;
    private String city;
    private Civility civility;
    private Country country;
    private String email_paypal;
    private String iban;
    private String mobile;
    private boolean name_update_forbidden;
    private boolean payment_info_update_forbidden;
    private String phone;
    private String zip;

    public PLPUser() {
    }

    private void updateWithOtherUser(PLPUser pLPUser) {
        this.civility = pLPUser.civility;
        this.country = pLPUser.country;
        this.iban = pLPUser.iban;
        this.bic = pLPUser.bic;
        this.email_paypal = pLPUser.email_paypal;
        this.address = pLPUser.address;
        this.zip = pLPUser.zip;
        this.city = pLPUser.city;
        this.phone = pLPUser.phone;
        this.mobile = pLPUser.mobile;
        this.name_update_forbidden = pLPUser.name_update_forbidden;
        this.payment_info_update_forbidden = pLPUser.payment_info_update_forbidden;
    }

    public String getAddress() {
        return this.address;
    }

    public String getBIC() {
        return this.bic;
    }

    public String getCity() {
        return this.city;
    }

    public Civility getCivility() {
        return this.civility;
    }

    public Country getCountry() {
        return this.country;
    }

    public String getEmailPaypal() {
        return this.email_paypal;
    }

    public String getIBAN() {
        return this.iban;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getZip() {
        return this.zip;
    }

    public boolean isNameUpdateForbidden() {
        return this.name_update_forbidden;
    }

    public boolean isPaymentInfoUpdateForbidden() {
        return this.payment_info_update_forbidden;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, 1, "earning_amount");
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, 1, "earning_amount");
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObject(ParsingMode.NETWORK, jSONObject, this, 1);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public PLPUser(PLPUser pLPUser, String str, String str2) {
        super(pLPUser);
        updateWithOtherUser(pLPUser);
        updateLoginInfo(str, str2);
    }

    public PLPUser(PLPUser pLPUser, boolean z) {
        super(pLPUser);
        updateWithOtherUser(pLPUser);
        setShouldUpdatePaymentInfo(z);
    }

    public PLPUser(PLPUser pLPUser, Civility civility2, String str, String str2, Country country2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        super(pLPUser);
        updateWithOtherUser(pLPUser);
        updateName(str, str2, z);
        this.civility = civility2;
        this.country = country2;
        this.iban = str3;
        this.bic = str4;
        this.email_paypal = str5;
        this.address = str6;
        this.zip = str7;
        this.city = str8;
        this.phone = str9;
        this.mobile = str10;
    }
}
