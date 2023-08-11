package com.rmn.apiclient.impl.jsonapi.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.data.descriptor.RelationshipMapping;
import com.rmn.apiclient.core.data.descriptor.RelationshipMappingSet;
import com.rmn.apiclient.core.data.serializer.ISpecificParser;
import com.rmn.apiclient.core.data.serializer.SpecificParserList;
import com.rmn.apiclient.core.data.validator.FieldValidatorSet;
import com.rmn.apiclient.core.data.validator.IValidator;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheDescriptor;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheResourceDescriptor;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceSerializer;

public class JSONAPIResourceDescriptor<M extends IModel> implements IResourceDescriptor<M> {
    @NonNull
    private final SpecificParserList additionalParsers;
    @Nullable
    private final CacheResourceDescriptor<M> cacheResourceDescriptor;
    @NonNull
    private final Class<M> modelClass;
    @NonNull
    private final RelationshipMappingSet relationshipMappings;
    @NonNull
    private final JSONAPIResourceSerializer<M> resourceSerializer;
    @NonNull
    private final String resourceType;
    @NonNull
    private final FieldValidatorSet<M> validators;

    public JSONAPIResourceDescriptor(@NonNull Class<M> cls, @NonNull String str, @Nullable CacheDescriptor cacheDescriptor) {
        this(cls, str, (SpecificParserList) null, (FieldValidatorSet) null, (RelationshipMappingSet) null, cacheDescriptor);
    }

    @NonNull
    public SpecificParserList getAdditionalParsers() {
        return this.additionalParsers;
    }

    @NonNull
    public Class<M> getModelClass() {
        return this.modelClass;
    }

    @NonNull
    public RelationshipMappingSet getRelationshipMappings() {
        return this.relationshipMappings;
    }

    @NonNull
    public String getResourceType() {
        return this.resourceType;
    }

    @NonNull
    public FieldValidatorSet<M> getValidators() {
        return this.validators;
    }

    public JSONAPIResourceDescriptor(@NonNull Class<M> cls, @NonNull String str, @NonNull FieldValidatorSet<M> fieldValidatorSet, @Nullable CacheDescriptor cacheDescriptor) {
        this(cls, str, (SpecificParserList) null, fieldValidatorSet, (RelationshipMappingSet) null, cacheDescriptor);
    }

    @NonNull
    public JSONAPIResourceSerializer<M> getSerializer() {
        return this.resourceSerializer;
    }

    public JSONAPIResourceDescriptor(@NonNull Class<M> cls, @NonNull String str, @NonNull SpecificParserList specificParserList, @NonNull FieldValidatorSet<M> fieldValidatorSet, @Nullable CacheDescriptor cacheDescriptor) {
        this(cls, str, specificParserList, fieldValidatorSet, (RelationshipMappingSet) null, cacheDescriptor);
    }

    public JSONAPIResourceDescriptor(@NonNull Class<M> cls, @NonNull String str, @NonNull FieldValidatorSet<M> fieldValidatorSet, @NonNull RelationshipMappingSet relationshipMappingSet, @Nullable CacheDescriptor cacheDescriptor) {
        this(cls, str, (SpecificParserList) null, fieldValidatorSet, relationshipMappingSet, cacheDescriptor);
    }

    public JSONAPIResourceDescriptor(@NonNull Class<M> cls, @NonNull String str, @Nullable SpecificParserList specificParserList, @Nullable FieldValidatorSet<M> fieldValidatorSet, @Nullable RelationshipMappingSet relationshipMappingSet, @Nullable CacheDescriptor cacheDescriptor) {
        this.modelClass = cls;
        this.resourceType = str;
        this.additionalParsers = specificParserList == null ? new SpecificParserList(new ISpecificParser[0]) : specificParserList;
        this.validators = fieldValidatorSet == null ? new FieldValidatorSet<>(new IValidator[0]) : fieldValidatorSet;
        this.relationshipMappings = relationshipMappingSet == null ? new RelationshipMappingSet(new RelationshipMapping[0]) : relationshipMappingSet;
        this.resourceSerializer = new JSONAPIResourceSerializer<>(this);
        this.cacheResourceDescriptor = cacheDescriptor != null ? new CacheResourceDescriptor<>(this, cacheDescriptor) : null;
    }
}
