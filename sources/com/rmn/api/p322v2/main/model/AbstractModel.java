package com.rmn.api.p322v2.main.model;

import com.rmn.api.p322v2.main.json.IJsonCacheableModel;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.model.AbstractModel */
public abstract class AbstractModel implements IJsonNetworkParsable, IJsonCacheableModel {
    private ModelRef<AbstractModel> modelRef;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        Object identifier = getIdentifier();
        Object identifier2 = ((IJsonCacheableModel) obj).getIdentifier();
        if (identifier.getClass().equals(identifier2.getClass()) && identifier.equals(identifier2)) {
            return true;
        }
        return false;
    }

    public final ModelRef<? extends AbstractModel> getModelRef() {
        if (!isModelReferenceStillCoherent()) {
            C13633n.m31166v("The model reference has changed, this means this model has been updated with a more recent one. Using this model may leads to inconsistencies : " + getClass().getSimpleName() + " => " + getIdentifier());
        }
        return this.modelRef;
    }

    public int hashCode() {
        int i;
        Class<?> cls;
        Object identifier = getIdentifier();
        int i2 = 0;
        if (identifier == null) {
            i = 0;
        } else {
            i = identifier.hashCode();
        }
        int i3 = i + 31;
        if (identifier == null) {
            cls = null;
        } else {
            cls = identifier.getClass();
        }
        int i4 = i3 * 31;
        if (cls != null) {
            i2 = cls.hashCode();
        }
        return i4 + i2;
    }

    public final boolean isModelReferenceStillCoherent() {
        ModelRef<AbstractModel> modelRef2 = this.modelRef;
        if (modelRef2 == null || modelRef2.get() == this) {
            return true;
        }
        return false;
    }

    public final void setModelRef(ModelRef<AbstractModel> modelRef2) {
        this.modelRef = modelRef2;
        if (modelRef2.get() != this) {
            this.modelRef.updateModel(this);
        }
    }
}
