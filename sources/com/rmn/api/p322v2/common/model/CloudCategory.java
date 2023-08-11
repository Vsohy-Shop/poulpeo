package com.rmn.api.p322v2.common.model;

import com.rmn.api.p322v2.cloud.general.CloudUtil;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.common.model.CloudCategory */
public class CloudCategory extends AbstractModel {
    private String icon;
    private int id_category;
    private String image;
    private String name;
    private int[] tags;
    private int weighting;

    public int getCategoryId() {
        return this.id_category;
    }

    public String getIcon() {
        return this.icon;
    }

    public Object getIdentifier() {
        return Integer.valueOf(this.id_category);
    }

    public String getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public Set<String> getTagsIds() {
        if (this.tags == null) {
            return null;
        }
        HashSet hashSet = new HashSet(this.tags.length);
        for (int num : this.tags) {
            hashSet.add(Integer.toString(num));
        }
        return hashSet;
    }

    public int getWeighting() {
        return this.weighting;
    }

    public boolean isModelValidAfterParsing() {
        if (this.id_category <= 0) {
            return false;
        }
        return true;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, new String[0]);
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, new String[0]);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        String optString;
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.NETWORK, jSONObject, (Object) this, new String[0]);
        if (this.id_category <= 0 && (optString = jSONObject.optString("id_category")) != null) {
            try {
                this.id_category = Integer.valueOf(optString).intValue();
            } catch (NumberFormatException e) {
                C13633n.m31165u(this, e);
            }
        }
        this.image = CloudUtil.getFullUrl(this.image);
        this.icon = CloudUtil.getFullUrl(this.icon);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
