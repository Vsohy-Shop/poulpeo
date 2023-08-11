package com.rmn.api.p322v2.poulpeo.model;

import android.text.TextUtils;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.Earning */
public class Earning extends AbstractModel implements IExpandableGroup {
    private double amount;
    private List<AbstractExpandableChild> children;
    private Date date;
    private EarningEvent[] events;
    private String id_earning;
    private Integer id_merchant;
    private EarningStatus status;
    private String title;
    private EarningType type;

    public double getAmount() {
        return this.amount;
    }

    public List<AbstractExpandableChild> getChildren() {
        if (this.children == null) {
            ArrayList arrayList = new ArrayList();
            this.children = arrayList;
            arrayList.addAll(Arrays.asList(this.events));
        }
        return this.children;
    }

    public Date getDate() {
        return this.date;
    }

    public String getEarningId() {
        return this.id_earning;
    }

    public List<EarningEvent> getEvents() {
        return Arrays.asList(this.events);
    }

    public String getGroupId() {
        return String.valueOf(this.id_earning);
    }

    public Object getIdentifier() {
        return this.id_earning;
    }

    public Integer getMerchantId() {
        return this.id_merchant;
    }

    public EarningStatus getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public EarningType getType() {
        return this.type;
    }

    public boolean isModelValidAfterParsing() {
        if (TextUtils.isEmpty(this.id_earning) || this.type == null || this.status == null) {
            return false;
        }
        return true;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, "children");
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, "children");
        for (EarningEvent earning : this.events) {
            earning.setEarning(this);
        }
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.NETWORK, jSONObject, (Object) this, "children");
        for (EarningEvent earning : this.events) {
            earning.setEarning(this);
        }
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
