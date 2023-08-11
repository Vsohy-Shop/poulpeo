package com.rmn.api.p322v2.poulpeo.model;

import android.text.TextUtils;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import java.util.Date;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.ReviewMerchant */
public class ReviewMerchant extends AbstractModel {
    private String content;
    private Date date;
    private Date date_order;
    private int id_merchant;
    private int id_review;
    private double score;
    private String user_name;

    public String getContent() {
        return this.content;
    }

    public Date getDate() {
        return this.date;
    }

    public Date getDateOrder() {
        return this.date_order;
    }

    public int getIdMerchant() {
        return this.id_merchant;
    }

    public Object getIdentifier() {
        return Integer.valueOf(this.id_review);
    }

    public int getReviewId() {
        return this.id_review;
    }

    public double getScore() {
        return this.score;
    }

    public String getUserName() {
        return this.user_name;
    }

    public boolean isModelValidAfterParsing() {
        if (this.id_review > 0 && this.date != null && !TextUtils.isEmpty(this.user_name) && this.score >= 0.0d && !TextUtils.isEmpty(this.content) && this.id_merchant > 0) {
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
