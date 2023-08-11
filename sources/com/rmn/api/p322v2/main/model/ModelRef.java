package com.rmn.api.p322v2.main.model;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.main.model.AbstractModel;

/* renamed from: com.rmn.api.v2.main.model.ModelRef */
public final class ModelRef<T extends AbstractModel> {
    @NonNull
    private T model;

    public ModelRef(@NonNull T t) {
        this.model = t;
        t.setModelRef(this);
    }

    public static <U extends AbstractModel> U getModelOrNull(ModelRef<U> modelRef) {
        if (modelRef == null) {
            return null;
        }
        return modelRef.get();
    }

    public static <U extends AbstractModel> ModelRef<U> getModelReferenceOrNew(U u) {
        if (u != null) {
            ModelRef<? extends AbstractModel> modelRef = u.getModelRef();
            if (modelRef != null) {
                return modelRef;
            }
            return new ModelRef<>(u);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModelRef) {
            return this.model.equals(((ModelRef) obj).model);
        }
        if (!(obj instanceof AbstractModel)) {
            return false;
        }
        return this.model.equals((AbstractModel) obj);
    }

    @NonNull
    public T get() {
        return this.model;
    }

    public int hashCode() {
        return this.model.hashCode();
    }

    public final boolean isModelReferenceStillCoherent() {
        if (this.model.getModelRef() == this) {
            return true;
        }
        return false;
    }

    public void updateModel(@NonNull T t) {
        if (t != this.model) {
            if (t.getIdentifier().equals(this.model.getIdentifier())) {
                this.model = t;
                if (t.getModelRef() != this) {
                    this.model.setModelRef(this);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("The updated model must have the same id : " + this.model.getClass() + " - " + this.model.getIdentifier() + " => " + t.getIdentifier());
        }
    }
}
