package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.HomeSectionRef */
public class HomeSectionRef extends AbstractModel {
    private String homeSectionId;
    private BaseHomeSection section;
    private HomeSectionType type;

    public String getHomeSectionId() {
        return this.homeSectionId;
    }

    public Object getIdentifier() {
        return this.section.getIdentifier();
    }

    public BaseHomeSection getSection() {
        return this.section;
    }

    public HomeSectionType getType() {
        return this.type;
    }

    public boolean isModelValidAfterParsing() {
        if (this.type == null) {
            return false;
        }
        return true;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, "section");
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void setSection(BaseHomeSection baseHomeSection) {
        if (baseHomeSection != null) {
            this.section = baseHomeSection;
            this.homeSectionId = (String) baseHomeSection.getIdentifier();
            return;
        }
        throw new IllegalArgumentException();
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, "section");
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeField(ParsingMode.NETWORK, jSONObject, this, JSONAPIResourceIdSerializer.FIELD_TYPE);
        HomeSectionType homeSectionType = this.type;
        if (homeSectionType != null) {
            BaseHomeSection newHomeSection = homeSectionType.newHomeSection();
            this.section = newHomeSection;
            newHomeSection.unserializeFromNetworkData(jSONObject);
            this.homeSectionId = (String) this.section.getIdentifier();
        }
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
