package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.HomeSectionBanner */
public class HomeSectionBanner extends BaseHomeSection {
    public static final int SUPER_CLASS_DEPTH = 1;
    public static final String TAG_BANNER_1 = "banner1";
    public static final String TAG_BANNER_2 = "banner2";

    public boolean isModelValidAfterParsing() {
        String tag = getTag();
        if (TAG_BANNER_1.equals(tag)) {
            return super.isModelValidAfterParsing();
        }
        C13633n.m31145a(this, "This BANNER TAG is not supported : " + tag + " !");
        return false;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObject(jSONObject, this, 1);
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObject(ParsingMode.CACHE, new JSONObject(str), this, 1);
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
}
