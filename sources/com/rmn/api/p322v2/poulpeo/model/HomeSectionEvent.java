package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import java.util.Date;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.HomeSectionEvent */
public class HomeSectionEvent extends HomeSectionMerchant {
    public static final int SUPER_CLASS_DEPTH = 2;
    private Date date_end;
    private Date date_start;
    private String id_event;
    private String share_url;
    private String text_content;

    public Date getDateEnd() {
        return this.date_end;
    }

    public Date getDateStart() {
        return this.date_start;
    }

    public String getIdEvent() {
        return this.id_event;
    }

    public String getShareUrl() {
        return this.share_url;
    }

    public String getTitle() {
        return this.text_content;
    }

    public boolean isExpired() {
        return isExpired(new Date().getTime());
    }

    public boolean isModelValidAfterParsing() {
        return super.isModelValidAfterParsing();
    }

    public boolean isStarted() {
        return isStarted(new Date().getTime());
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, 2, "merchants");
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, 2, "merchants");
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObject(ParsingMode.NETWORK, jSONObject, this, 2);
        finishNetworkUnserializing(jSONObject);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public boolean isExpired(long j) {
        Date date = this.date_end;
        if (date == null || date.getTime() <= 0 || j <= this.date_end.getTime()) {
            return false;
        }
        return true;
    }

    public boolean isStarted(long j) {
        Date date = this.date_start;
        if (date != null && j < date.getTime()) {
            return false;
        }
        return true;
    }
}
