package com.rmn.api.p322v2.poulpeo.model;

import android.text.TextUtils;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.ReviewMerchantStatus */
public class ReviewMerchantStatus extends AbstractModel {
    private boolean can_add_review;
    private int id_merchant;
    private int number_reviews;
    private double score_review;
    private String user_message;

    public boolean canAddReview() {
        return this.can_add_review;
    }

    public Object getIdentifier() {
        return Integer.valueOf(this.id_merchant);
    }

    public int getMerchantId() {
        return this.id_merchant;
    }

    public int getNumberReviews() {
        return this.number_reviews;
    }

    public double getScoreReview() {
        return this.score_review;
    }

    public String getUserMessage() {
        return this.user_message;
    }

    public boolean isModelValidAfterParsing() {
        if (this.score_review < 0.0d || this.number_reviews < 0) {
            return false;
        }
        if (this.can_add_review || !TextUtils.isEmpty(this.user_message)) {
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

    public void setIdMerchant(int i) {
        if (this.id_merchant > 0) {
            C13633n.m31163s(this, "Trying to override id_merchant");
        } else {
            this.id_merchant = i;
        }
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObject(ParsingMode.CACHE, new JSONObject(str), this);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.NETWORK, jSONObject, (Object) this, "id_merchant");
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
