package com.rmn.api.p322v2.common.model;

import com.rmn.api.p322v2.common.model.submodel.CloudListType;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.common.model.CloudList */
public class CloudList extends AbstractModel {
    private List<AbstractModel> data;
    private String id_list;
    private List<String> ids;
    private CloudListType type;

    private void parseJsonArrayData(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    AbstractModel abstractModel = null;
                    try {
                        abstractModel = (AbstractModel) ParsingManagerJson.convertJSONValueToObjectValue(ParsingMode.NETWORK, this.type.getElemClass((String) null), optJSONObject, true);
                    } catch (Exception unused) {
                    }
                    if (abstractModel != null) {
                        this.data.add(abstractModel);
                        Object identifier = abstractModel.getIdentifier();
                        if (identifier != null) {
                            if (String.class.isAssignableFrom(identifier.getClass())) {
                                String str = (String) identifier;
                                if (!str.equals("")) {
                                    this.ids.add(str);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r5 == null) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseJsonObjectData(org.json.JSONObject r9) {
        /*
            r8 = this;
            java.lang.String r0 = "data"
            org.json.JSONObject r9 = r9.optJSONObject(r0)
            if (r9 != 0) goto L_0x0009
            return
        L_0x0009:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = r8.ids
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L_0x0016:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ""
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            org.json.JSONObject r4 = r9.optJSONObject(r4)
            r5 = 0
            if (r4 == 0) goto L_0x004d
            com.rmn.api.v2.common.model.submodel.CloudListType r6 = r8.type
            java.lang.Class r3 = r6.getElemClass(r3)
            r6 = 1
            com.rmn.api.v2.main.json.ParsingMode r7 = com.rmn.api.p322v2.main.json.ParsingMode.NETWORK     // Catch:{ Exception -> 0x004a }
            java.lang.Object r3 = com.rmn.api.p322v2.main.json.ParsingManagerJson.convertJSONValueToObjectValue(r7, r3, r4, r6)     // Catch:{ Exception -> 0x004a }
            com.rmn.api.v2.main.model.AbstractModel r3 = (com.rmn.api.p322v2.main.model.AbstractModel) r3     // Catch:{ Exception -> 0x004a }
            r5 = r3
        L_0x004a:
            if (r5 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r6 = r1
        L_0x004e:
            if (r6 == 0) goto L_0x0058
            java.util.List<com.rmn.api.v2.main.model.AbstractModel> r3 = r8.data
            r3.add(r5)
            int r2 = r2 + 1
            goto L_0x0016
        L_0x0058:
            java.util.List<java.lang.String> r3 = r8.ids
            r3.remove(r2)
            goto L_0x0016
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.common.model.CloudList.parseJsonObjectData(org.json.JSONObject):void");
    }

    public List<AbstractModel> getData() {
        if (this.data == null) {
            return null;
        }
        return new ArrayList(this.data);
    }

    public Object getIdentifier() {
        return this.id_list;
    }

    public List<String> getIds() {
        if (this.ids == null) {
            return null;
        }
        return new ArrayList(this.ids);
    }

    public String getListId() {
        return this.id_list;
    }

    public CloudListType getType() {
        return this.type;
    }

    public boolean isModelValidAfterParsing() {
        return true;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        if (!ParsingManagerJson.serializeField(jSONObject, JSONAPIResourceIdSerializer.FIELD_TYPE, (Object) this, JSONAPIResourceIdSerializer.FIELD_TYPE)) {
            throw new Exception("Automatic serializing problem");
        } else if (ParsingManagerJson.serializeField(jSONObject, "id_list", (Object) this, "id_list")) {
            JSONArray jSONArray = new JSONArray();
            for (String put : this.ids) {
                jSONArray.put(put);
            }
            jSONObject.put("ids", jSONArray);
            String jSONObject2 = jSONObject.toString();
            C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
            return jSONObject2;
        } else {
            throw new Exception("Automatic serializing problem");
        }
    }

    public void setData(Set<AbstractModel> set) {
        if (this.data != null) {
            C13633n.m31163s(this, "Try to set data for a CloudList but the CloudList already has data.");
        } else if (set != null) {
            this.data = new ArrayList(set.size());
            HashMap hashMap = new HashMap(set.size());
            for (AbstractModel next : set) {
                if (next != null) {
                    hashMap.put(this.type.getIdPrefix(next.getClass()) + next.getIdentifier(), next);
                }
            }
            for (String str : this.ids) {
                AbstractModel abstractModel = (AbstractModel) hashMap.get(str);
                if (abstractModel != null) {
                    this.data.add(abstractModel);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setListId(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        }
        String str2 = this.id_list;
        if (str2 == null || str2.equals("")) {
            this.id_list = str;
        }
    }

    public void unserializeFromCacheData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        ParsingMode parsingMode = ParsingMode.CACHE;
        if (!ParsingManagerJson.unserializeField(parsingMode, jSONObject, this, JSONAPIResourceIdSerializer.FIELD_TYPE)) {
            throw new Exception("Automatic serializing problem");
        } else if (ParsingManagerJson.unserializeField(parsingMode, jSONObject, this, "id_list")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("ids");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.ids = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString != null && !optString.equals("")) {
                        this.ids.add(optString);
                    }
                }
                return;
            }
            throw new Exception("Unserializing problem");
        } else {
            throw new Exception("Automatic serializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        if (ParsingManagerJson.unserializeField(ParsingMode.NETWORK, jSONObject, this, JSONAPIResourceIdSerializer.FIELD_TYPE)) {
            JSONArray optJSONArray = jSONObject.optJSONArray("ids");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.ids = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString != null && !optString.equals("")) {
                        this.ids.add(optString);
                    }
                }
                if (!jSONObject.isNull("data")) {
                    this.data = new ArrayList(length);
                    if (this.type == CloudListType.MERCHANT) {
                        parseJsonArrayData(jSONObject);
                    } else {
                        parseJsonObjectData(jSONObject);
                    }
                } else {
                    throw new Exception("Null array");
                }
            } else {
                throw new Exception("Unserializing problem");
            }
        } else {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
