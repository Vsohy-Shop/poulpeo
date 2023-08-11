package com.rmn.apiclient.impl.jsonapi.serializer;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.data.serializer.IDocumentSerializer;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data.structure.IResource;
import com.rmn.apiclient.core.data.structure.ResourceList;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIDocumentDescriptor;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIMetaDescriptor;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPIDocument;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPIError;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPILinks;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPIMeta;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p446vd.C13633n;

public class JSONAPIDocumentSerializer implements IDocumentSerializer {
    @NonNull
    private static final String FIELD_DATA = "data";
    @NonNull
    private static final String FIELD_ERRORS = "errors";
    @NonNull
    private static final String FIELD_INCLUDED = "included";
    @NonNull
    private static final String FIELD_LINKS = "links";
    @NonNull
    private static final String FIELD_META = "meta";
    @NonNull
    private static final String FIELD_RESOURCE_ID = "id";
    @NonNull
    private static final String FIELD_RESOURCE_TYPE = "type";
    @NonNull
    private final JSONAPIDocumentDescriptor descriptor;
    @NonNull
    private final JSONAPIErrorSerializer errorSerializer = new JSONAPIErrorSerializer();
    @NonNull
    private final JSONAPILinksSerializer linksSerializer = new JSONAPILinksSerializer();
    @Nullable
    private final JSONAPIMetaSerializer<?> metaSerializer;

    public JSONAPIDocumentSerializer(@NonNull JSONAPIDocumentDescriptor jSONAPIDocumentDescriptor) {
        this.descriptor = jSONAPIDocumentDescriptor;
        JSONAPIMetaDescriptor<?> jSONAPIMetaDescriptor = jSONAPIDocumentDescriptor.metaDescriptor;
        if (jSONAPIMetaDescriptor == null) {
            this.metaSerializer = null;
        } else {
            this.metaSerializer = new JSONAPIMetaSerializer<>(jSONAPIMetaDescriptor);
        }
    }

    @NonNull
    private ResourceList extractDataResources(@NonNull JSONObject jSONObject) {
        if (!JSONHelper.has(jSONObject, FIELD_DATA)) {
            return new ResourceList(new ResourceList[0]);
        }
        LinkedList linkedList = new LinkedList();
        JSONArray optJSONArray = JSONHelper.optJSONArray(jSONObject, FIELD_DATA);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                extractNewResource(linkedList, JSONHelper.optJSONObject(optJSONArray, i));
            }
        } else {
            extractNewResource(linkedList, JSONHelper.optJSONObject(jSONObject, FIELD_DATA));
        }
        return new ResourceList((List<IResource<?>>) linkedList);
    }

    @Nullable
    private List<JSONAPIError> extractErrors(@NonNull JSONObject jSONObject) {
        JSONAPIError deserialize;
        JSONArray optJSONArray = JSONHelper.optJSONArray(jSONObject, FIELD_ERRORS);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = JSONHelper.optJSONObject(optJSONArray, i);
            if (!(optJSONObject == null || (deserialize = this.errorSerializer.deserialize(optJSONObject)) == null)) {
                arrayList.add(deserialize);
            }
        }
        return arrayList;
    }

    @NonNull
    private ResourceList extractIncludedResources(@NonNull JSONObject jSONObject) {
        JSONArray optJSONArray = JSONHelper.optJSONArray(jSONObject, FIELD_INCLUDED);
        if (optJSONArray == null) {
            return new ResourceList(new ResourceList[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            extractNewResource(arrayList, JSONHelper.optJSONObject(optJSONArray, i));
        }
        return new ResourceList((List<IResource<?>>) arrayList);
    }

    @Nullable
    private JSONAPILinks extractLinks(@NonNull JSONObject jSONObject) {
        JSONObject optJSONObject = JSONHelper.optJSONObject(jSONObject, FIELD_LINKS);
        if (optJSONObject == null) {
            return null;
        }
        return this.linksSerializer.deserialize(optJSONObject);
    }

    @Nullable
    private JSONAPIMeta<?> extractMeta(@NonNull JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (this.metaSerializer == null || (optJSONObject = JSONHelper.optJSONObject(jSONObject, (String) FIELD_META)) == null) {
            return null;
        }
        return this.metaSerializer.deserialize(optJSONObject);
    }

    private void extractNewResource(@NonNull List<IResource<?>> list, @Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            String optNullableString = JSONHelper.optNullableString(jSONObject, "type");
            if (!TextUtils.isEmpty(optNullableString)) {
                IResourceDescriptor<?> findResourceDescriptor = this.descriptor.resourceDescriptors.findResourceDescriptor(optNullableString);
                if (findResourceDescriptor == null) {
                    C13633n.m31166v("No resource descriptor was found for type : " + optNullableString);
                    return;
                }
                IResource<?> deserialize = findResourceDescriptor.getSerializer().deserialize(jSONObject);
                if (deserialize == null) {
                    C13633n.m31166v("Deserializing resource failed : " + optNullableString);
                    return;
                }
                list.add(deserialize);
            }
        }
    }

    @NonNull
    private JSONArray transformDataArray(@NonNull JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = JSONHelper.optJSONObject(jSONArray, i);
            if (optJSONObject != null) {
                JSONHelper.add(jSONArray2, transformDataObject(optJSONObject));
            }
        }
        return jSONArray2;
    }

    @Nullable
    private JSONObject transformDataObject(@NonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        String optNullableString = JSONHelper.optNullableString(jSONObject, "type");
        if (TextUtils.isEmpty(optNullableString)) {
            return null;
        }
        String optNullableString2 = JSONHelper.optNullableString(jSONObject, "id");
        if (TextUtils.isEmpty(optNullableString2)) {
            return null;
        }
        JSONHelper.put(jSONObject2, "type", optNullableString);
        JSONHelper.put(jSONObject2, "id", optNullableString2);
        return jSONObject2;
    }

    @NonNull
    public JSONObject transformForCache(@NonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject optJSONObject = JSONHelper.optJSONObject(jSONObject, FIELD_META);
        if (optJSONObject != null) {
            JSONHelper.put(jSONObject2, FIELD_META, optJSONObject);
        }
        JSONArray optJSONArray = JSONHelper.optJSONArray(jSONObject, FIELD_DATA);
        if (optJSONArray != null) {
            JSONHelper.put(jSONObject2, FIELD_DATA, transformDataArray(optJSONArray));
        } else {
            JSONObject optJSONObject2 = JSONHelper.optJSONObject(jSONObject, FIELD_DATA);
            if (optJSONObject2 != null) {
                JSONHelper.put(jSONObject2, FIELD_DATA, transformDataObject(optJSONObject2));
            }
        }
        JSONObject optJSONObject3 = JSONHelper.optJSONObject(jSONObject, FIELD_LINKS);
        if (optJSONObject3 != null) {
            JSONHelper.put(jSONObject2, FIELD_LINKS, optJSONObject3);
        }
        return jSONObject2;
    }

    @Nullable
    public JSONObject serialize(@NonNull IDocument iDocument) {
        throw new UnsupportedOperationException("TODO");
    }

    @NonNull
    public JSONAPIDocument deserialize(@NonNull JSONObject jSONObject) {
        return new JSONAPIDocument(extractMeta(jSONObject), extractDataResources(jSONObject), extractIncludedResources(jSONObject), extractLinks(jSONObject), extractErrors(jSONObject));
    }
}
