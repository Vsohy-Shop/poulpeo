package com.rmn.apiclient.impl.jsonapi.serializer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.RelationshipMapping;
import com.rmn.apiclient.core.data.serializer.IResourceSerializer;
import com.rmn.apiclient.core.data.serializer.ISpecificParser;
import com.rmn.apiclient.core.data.structure.IRelationship;
import com.rmn.apiclient.core.data.structure.IResource;
import com.rmn.apiclient.core.data.structure.IResourceId;
import com.rmn.apiclient.core.data.structure.RelationshipSet;
import com.rmn.apiclient.core.data.validator.IValidator;
import com.rmn.apiclient.core.json.JSONSerializationManager;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.core.model.ModelReference;
import com.rmn.apiclient.core.model.ModelRelationship;
import com.rmn.apiclient.core.model.ModelRelationshipList;
import com.rmn.apiclient.core.reflection.ReflectionUtils;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIResourceDescriptor;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPIResource;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import p446vd.C13633n;

public class JSONAPIResourceSerializer<M extends IModel> implements IResourceSerializer<M> {
    @NonNull
    private static final String FIELD_ATTRIBUTES = "attributes";
    @NonNull
    private static final String FIELD_ID = "id";
    @NonNull
    private static final String FIELD_RELATIONSHIPS = "relationships";
    @NonNull
    private final JSONAPIResourceDescriptor<M> descriptor;
    @NonNull
    private final JSONAPIRelationshipsSerializer relationshipSerializer = new JSONAPIRelationshipsSerializer();
    @NonNull
    private final JSONAPIResourceIdSerializer resourceIdSerializer = new JSONAPIResourceIdSerializer();

    public JSONAPIResourceSerializer(@NonNull JSONAPIResourceDescriptor<M> jSONAPIResourceDescriptor) {
        this.descriptor = jSONAPIResourceDescriptor;
    }

    private void assignRelationshipIds(@NonNull M m, @NonNull RelationshipSet relationshipSet) {
        Field field;
        String str;
        Iterator<RelationshipMapping> it = this.descriptor.getRelationshipMappings().iterator();
        while (it.hasNext()) {
            RelationshipMapping next = it.next();
            IRelationship findRelationshipWithName = relationshipSet.findRelationshipWithName(next.relationshipJsonTag);
            if (!(findRelationshipWithName == null || (field = ReflectionUtils.getField(m, next.fieldNameForRelationship)) == null)) {
                Class<?> type = field.getType();
                List<String> idsForType = findRelationshipWithName.getResourceIds().getIdsForType(next.getResourceIdsTypes());
                if (ModelRelationship.class.isAssignableFrom(type)) {
                    if (!idsForType.isEmpty()) {
                        str = idsForType.get(0);
                    } else {
                        str = "";
                    }
                    ReflectionUtils.setValue(new ModelRelationship(str), m, field);
                } else if (ModelRelationshipList.class.isAssignableFrom(type)) {
                    ModelRelationshipList modelRelationshipList = (ModelRelationshipList) ReflectionUtils.getValue(m, field);
                    if (modelRelationshipList != null) {
                        modelRelationshipList.addIds(idsForType);
                    }
                } else {
                    C13633n.m31163s(this, "Couldn't assign relationship ids because field type is not managed (ModelRelationship or ModelRelationshipList)");
                }
            }
        }
    }

    @NonNull
    private JSONObject createJsonModelAttributes(@NonNull M m) {
        HashSet hashSet = new HashSet();
        hashSet.add("id");
        hashSet.addAll(this.descriptor.getRelationshipMappings().getRelationshipNames());
        JSONObject serializeObjectExcluding = JSONSerializationManager.instance.serializeObjectExcluding(m, (String[]) hashSet.toArray(new String[0]));
        if (serializeObjectExcluding != null) {
            return serializeObjectExcluding;
        }
        return new JSONObject();
    }

    @Nullable
    private M createModel(@NonNull IResourceId iResourceId, @NonNull JSONObject jSONObject) {
        M m = (IModel) ReflectionUtils.newInstance(this.descriptor.getModelClass());
        if (m == null) {
            return null;
        }
        ReflectionUtils.setValue(iResourceId.getId(), m, "id", String.class);
        JSONObject optJSONObject = JSONHelper.optJSONObject(jSONObject, FIELD_ATTRIBUTES);
        if (optJSONObject != null) {
            JSONSerializationManager.instance.deserialize(optJSONObject, m);
            Iterator<ISpecificParser> it = this.descriptor.getAdditionalParsers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().parse(m, optJSONObject);
                } catch (Exception e) {
                    C13633n.m31165u(this, e);
                }
            }
        }
        return m;
    }

    @NonNull
    private RelationshipSet extractRelationships(@NonNull JSONObject jSONObject) {
        JSONObject optJSONObject = JSONHelper.optJSONObject(jSONObject, FIELD_RELATIONSHIPS);
        if (optJSONObject == null) {
            return new RelationshipSet(new IRelationship[0]);
        }
        return this.relationshipSerializer.deserialize(optJSONObject);
    }

    private boolean isModelValid(M m) {
        Iterator<IValidator<M>> it = this.descriptor.getValidators().iterator();
        while (it.hasNext()) {
            IValidator next = it.next();
            if (!next.validate(m)) {
                C13633n.m31163s(this, next.getErrorMessage(m));
                return false;
            }
        }
        return true;
    }

    @Nullable
    public IResource<M> deserialize(@NonNull JSONObject jSONObject) {
        IModel createModel;
        IResourceId deserialize = this.resourceIdSerializer.deserialize(jSONObject);
        if (deserialize == null || (createModel = createModel(deserialize, jSONObject)) == null) {
            return null;
        }
        RelationshipSet extractRelationships = extractRelationships(jSONObject);
        assignRelationshipIds(createModel, extractRelationships);
        if (isModelValid(createModel)) {
            return new JSONAPIResource(this.descriptor, deserialize, new ModelReference(createModel, (Set<String>) null), extractRelationships);
        }
        C13633n.m31166v("Parsed resource not valid : " + deserialize);
        return null;
    }

    @Nullable
    public JSONObject serialize(@NonNull IResource<M> iResource) {
        JSONObject serialize = this.resourceIdSerializer.serialize(iResource.getResourceId());
        if (serialize == null) {
            return null;
        }
        JSONHelper.put(serialize, FIELD_ATTRIBUTES, createJsonModelAttributes(iResource.getModel()));
        if (this.relationshipSerializer.serialize(iResource.getRelationships()) != null) {
            JSONHelper.put(serialize, FIELD_RELATIONSHIPS, createJsonModelAttributes(iResource.getModel()));
        }
        return serialize;
    }
}
