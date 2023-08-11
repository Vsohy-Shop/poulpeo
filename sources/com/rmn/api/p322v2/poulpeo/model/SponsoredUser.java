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

/* renamed from: com.rmn.api.v2.poulpeo.model.SponsoredUser */
public class SponsoredUser extends AbstractModel implements IExpandableGroup {
    private List<AbstractExpandableChild> children;
    private Date date;
    private String display_name;
    private SponsorshipEvent[] events;
    private int id_sponsored_user;

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

    public String getDisplayName() {
        return this.display_name;
    }

    public List<SponsorshipEvent> getEvents() {
        return Arrays.asList(this.events);
    }

    public String getGroupId() {
        return String.valueOf(this.id_sponsored_user);
    }

    public Object getIdentifier() {
        return Integer.valueOf(this.id_sponsored_user);
    }

    public int getSponsoredUserId() {
        return this.id_sponsored_user;
    }

    public boolean isModelValidAfterParsing() {
        if (this.id_sponsored_user >= 0 && this.date != null && !TextUtils.isEmpty(this.display_name)) {
            return true;
        }
        return false;
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
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.NETWORK, jSONObject, (Object) this, "children");
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
