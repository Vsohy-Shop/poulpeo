package com.rmn.api.p322v2.common.model;

import com.rmn.api.p322v2.cloud.general.CloudUtil;
import com.rmn.api.p322v2.common.model.submodel.MerchantBonusObject;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.model.ModelRef;
import org.json.JSONObject;
import p446vd.C13623d;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.common.model.BaseMerchant */
public class BaseMerchant extends AbstractModel {
    private Cashback cashback;
    private String description;
    private boolean flag_no_support;
    private int id_merchant;
    private String illustration;
    private String illustration_top_mobile;
    private Cashback last_cashback;
    private String logo;
    private String logo_retina;
    private boolean manage_tracking_app_to_app_android;
    private boolean manage_tracking_app_to_app_ios;
    private MerchantBonusObject merchant_bonus;
    private String name;
    private int number_reviews;
    private double score_review;
    private String site_name;
    private String url;
    private String url_aff;

    /* access modifiers changed from: protected */
    public void finishNetworkUnserializing(JSONObject jSONObject) {
        if (this.id_merchant <= 0) {
            ParsingManagerJson.unserializeField(ParsingMode.NETWORK, jSONObject, "id_store", (Object) this, "id_merchant");
        }
        if (this.id_merchant <= 0) {
            ParsingManagerJson.unserializeField(ParsingMode.NETWORK, jSONObject, "id_merchant_ref", (Object) this, "id_merchant");
        }
        if (this.id_merchant <= 0) {
            ParsingManagerJson.unserializeField(ParsingMode.NETWORK, jSONObject, "id_store_ref", (Object) this, "id_merchant");
        }
        String str = this.description;
        if (str != null) {
            this.description = C13623d.m31111k(str);
        }
        this.logo = CloudUtil.getFullUrl(this.logo);
        String str2 = this.logo_retina;
        if (str2 != null) {
            if (str2.startsWith("/")) {
                this.logo_retina = CloudUtil.getFullUrl(this.logo_retina);
            } else {
                this.logo_retina = CloudUtil.getFullUrl("upload/merchants_logo/", this.logo_retina);
            }
        }
        this.illustration = CloudUtil.getFullUrl(this.illustration);
        this.illustration_top_mobile = CloudUtil.getFullUrl(this.illustration_top_mobile);
    }

    public String getAffiliationUrl() {
        return this.url_aff;
    }

    public Cashback getCashback() {
        return this.cashback;
    }

    public String getDescription() {
        return this.description;
    }

    public Object getIdentifier() {
        return Integer.valueOf(this.id_merchant);
    }

    public String getIllustration() {
        return this.illustration;
    }

    public String getIllustrationTopMobile() {
        return this.illustration_top_mobile;
    }

    public Cashback getLastCashback() {
        return this.last_cashback;
    }

    public String getLogo() {
        String str = this.logo_retina;
        if (str == null || str.equals("")) {
            return this.logo;
        }
        return this.logo_retina;
    }

    public MerchantBonusObject getMerchantBonus() {
        return this.merchant_bonus;
    }

    public int getMerchantId() {
        return this.id_merchant;
    }

    public String getMerchantIdString() {
        return String.valueOf(this.id_merchant);
    }

    public ModelRef<BaseMerchant> getMerchantModelReference() {
        return super.getModelRef();
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

    public int getNumberReviews() {
        return this.number_reviews;
    }

    public double getScoreReview() {
        return this.score_review;
    }

    public String getSiteName() {
        return this.site_name;
    }

    public String getTrackingMerchantId() {
        return "" + getMerchantId();
    }

    public String getUrl() {
        return this.url;
    }

    public boolean hasAppToAppTracking() {
        if (C13623d.m31112l()) {
            return this.manage_tracking_app_to_app_android;
        }
        if (C13623d.m31113m()) {
            return this.manage_tracking_app_to_app_ios;
        }
        return false;
    }

    public boolean hasCashback() {
        if (this.cashback != null) {
            return true;
        }
        return false;
    }

    public boolean hasFlagNoSupport() {
        return this.flag_no_support;
    }

    public boolean isModelValidAfterParsing() {
        if (this.id_merchant <= 0) {
            return false;
        }
        double d = this.score_review;
        if (d < 0.0d || d > 5.0d || this.number_reviews < 0) {
            return false;
        }
        return true;
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
        finishNetworkUnserializing(jSONObject);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void updateReviewInfo(double d, int i) {
        C13633n.m31155k(this, "Review info updated for merchant " + this.name + "(" + this.id_merchant + ")");
        this.score_review = d;
        this.number_reviews = i;
    }
}
