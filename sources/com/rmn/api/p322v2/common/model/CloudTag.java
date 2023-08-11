package com.rmn.api.p322v2.common.model;

import android.text.TextUtils;
import com.rmn.api.p322v2.common.model.submodel.CloudTagType;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.common.model.CloudTag */
public class CloudTag extends AbstractModel {
    private int id_tag;
    private String name;
    private CloudTagType tag_type;

    public Object getIdentifier() {
        return Integer.valueOf(this.id_tag);
    }

    public String getName() {
        return this.name;
    }

    public int getTagId() {
        return this.id_tag;
    }

    public CloudTagType getTagType() {
        return this.tag_type;
    }

    public boolean isModelValidAfterParsing() {
        if (this.id_tag > 0 && !TextUtils.isEmpty(this.name)) {
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
