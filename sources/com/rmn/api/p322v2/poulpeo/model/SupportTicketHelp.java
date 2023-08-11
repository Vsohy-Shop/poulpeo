package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.SupportTicketHelp */
public class SupportTicketHelp extends AbstractModel {
    private GenericElement[] help;

    public List<GenericElement> getHelp() {
        return Arrays.asList(this.help);
    }

    public Object getIdentifier() {
        return "SupportTicketHelp";
    }

    public boolean isModelValidAfterParsing() {
        if (this.help != null) {
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
        ParsingManagerJson.unserializeField(ParsingMode.NETWORK, jSONObject, this, "help");
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
