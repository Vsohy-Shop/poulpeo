package com.rmn.apiclient.core.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.IModel;

public class ModelRelationship<M extends IModel> {
    @NonNull

    /* renamed from: id */
    public final String f18064id;
    @Nullable
    private ModelReference<M> ref;

    public ModelRelationship(@NonNull String str) {
        this.f18064id = str;
    }

    public boolean exists() {
        return !TextUtils.isEmpty(this.f18064id);
    }

    @Nullable
    public M getModel() {
        ModelReference<M> modelReference = this.ref;
        if (modelReference == null) {
            return null;
        }
        return modelReference.getModel();
    }

    @Nullable
    public ModelReference<M> getModelReference() {
        return this.ref;
    }

    public boolean isInit() {
        if (this.ref != null) {
            return true;
        }
        return false;
    }

    public void updateModelReference(@NonNull ModelReference<M> modelReference) {
        if (!exists()) {
            throw new IllegalArgumentException("The relationship doesn't exist, so no model update is not possible in ModelRelationship, you must init the relationship with a model id");
        } else if (this.f18064id.equals(modelReference.getId())) {
            this.ref = modelReference;
        } else {
            throw new IllegalArgumentException("The ids don't match for the model update in ModelRelationship");
        }
    }

    public ModelRelationship(@Nullable ModelReference<M> modelReference) {
        this.f18064id = modelReference != null ? modelReference.getId() : "";
        this.ref = modelReference;
    }
}
