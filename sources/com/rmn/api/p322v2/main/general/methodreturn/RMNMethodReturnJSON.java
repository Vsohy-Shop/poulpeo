package com.rmn.api.p322v2.main.general.methodreturn;

import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.main.general.methodreturn.RMNMethodReturnJSON */
public class RMNMethodReturnJSON extends RMNMethodReturnType {
    private String treeName;

    public RMNMethodReturnJSON(boolean z, String str, Class<?> cls) {
        this(z, str, cls, (String) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        RMNMethodReturnJSON rMNMethodReturnJSON = (RMNMethodReturnJSON) obj;
        String str = this.treeName;
        if (str == null) {
            if (rMNMethodReturnJSON.treeName != null) {
                return false;
            }
        } else if (!str.equals(rMNMethodReturnJSON.treeName)) {
            return false;
        }
        return true;
    }

    public String getTreeName() {
        return this.treeName;
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.treeName;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public boolean isUnderRoot() {
        if (this.treeName == null) {
            return true;
        }
        return false;
    }

    public RMNMethodReturnJSON(boolean z, String str, Class<?> cls, String str2) {
        super(z, str, cls);
        if (str2 != null && str2.equals("")) {
            str2 = null;
        }
        if (str2 == null) {
            if (cls.isPrimitive()) {
                throw new IllegalStateException("The returnType is a primitive, not an object");
            } else if (cls.isArray()) {
                throw new IllegalStateException("The returnType is an array, not an object");
            }
        }
        this.treeName = str2;
        if (!ParsingManagerJson.isParsableType(cls)) {
            throw new IllegalArgumentException("The type " + cls.getSimpleName() + " is not parsable. Parsables are Boolean, Integer, Double, String, Date, JSONSerializable, Boolean[], Integer[], Double[], String[], Date[], JSONSerializable[]");
        }
    }

    public JSONObject locateContainer(JSONObject jSONObject) {
        return jSONObject;
    }
}
