package com.rmn.apiclient.core.data.descriptor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.serializer.IResourceSerializer;
import com.rmn.apiclient.core.data.serializer.SpecificParserList;
import com.rmn.apiclient.core.data.validator.FieldValidatorSet;
import com.rmn.apiclient.core.model.IModel;

public interface IResourceDescriptor<M extends IModel> {
    @NonNull
    SpecificParserList getAdditionalParsers();

    @NonNull
    Class<M> getModelClass();

    @NonNull
    RelationshipMappingSet getRelationshipMappings();

    @NonNull
    String getResourceType();

    @NonNull
    IResourceSerializer<M> getSerializer();

    @NonNull
    FieldValidatorSet<M> getValidators();
}
