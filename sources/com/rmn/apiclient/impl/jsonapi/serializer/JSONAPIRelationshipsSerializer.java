package com.rmn.apiclient.impl.jsonapi.serializer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.serializer.ISerializer;
import com.rmn.apiclient.core.data.structure.IRelationship;
import com.rmn.apiclient.core.data.structure.IResourceId;
import com.rmn.apiclient.core.data.structure.RelationshipSet;
import com.rmn.apiclient.core.data.structure.ResourceIdList;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPIRelationship;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONAPIRelationshipsSerializer implements ISerializer<RelationshipSet> {
    @NonNull
    private static final String FIELD_DATA = "data";
    @NonNull
    private final JSONAPIResourceIdSerializer resourceIdSerializer = new JSONAPIResourceIdSerializer();

    private void extractNewResourceId(@NonNull List<IResourceId> list, @Nullable JSONObject jSONObject) {
        IResourceId deserialize;
        if (jSONObject != null && (deserialize = this.resourceIdSerializer.deserialize(jSONObject)) != null) {
            list.add(deserialize);
        }
    }

    @NonNull
    private ResourceIdList extractRelationshipData(@NonNull JSONObject jSONObject) {
        if (!JSONHelper.has(jSONObject, FIELD_DATA)) {
            return new ResourceIdList();
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = JSONHelper.optJSONArray(jSONObject, FIELD_DATA);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                extractNewResourceId(arrayList, JSONHelper.optJSONObject(optJSONArray, i));
            }
        } else {
            extractNewResourceId(arrayList, JSONHelper.optJSONObject(jSONObject, FIELD_DATA));
        }
        return new ResourceIdList(arrayList);
    }

    @NonNull
    public RelationshipSet deserialize(@NonNull JSONObject jSONObject) {
        HashSet hashSet = new HashSet();
        Iterator<String> nonNullKeys = JSONHelper.getNonNullKeys(jSONObject);
        while (nonNullKeys.hasNext()) {
            String next = nonNullKeys.next();
            JSONObject optJSONObject = JSONHelper.optJSONObject(jSONObject, next);
            if (optJSONObject != null) {
                hashSet.add(new JSONAPIRelationship(next, extractRelationshipData(optJSONObject)));
            }
        }
        return new RelationshipSet((Set<IRelationship>) hashSet);
    }

    @Nullable
    public JSONObject serialize(@NonNull RelationshipSet relationshipSet) {
        throw new UnsupportedOperationException("TODO");
    }
}
