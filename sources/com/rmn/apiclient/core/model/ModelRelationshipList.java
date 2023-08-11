package com.rmn.apiclient.core.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.IModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ModelRelationshipList<M extends IModel> {
    @NonNull
    private final List<ModelRelationship<M>> relationships = new ArrayList();

    public void addIds(@Nullable List<String> list) {
        if (list != null) {
            for (String next : list) {
                if (!TextUtils.isEmpty(next)) {
                    this.relationships.add(new ModelRelationship(next));
                }
            }
        }
    }

    public void clear() {
        this.relationships.clear();
    }

    @NonNull
    public List<String> getIds() {
        ArrayList arrayList = new ArrayList();
        for (ModelRelationship<M> modelRelationship : this.relationships) {
            arrayList.add(modelRelationship.f18064id);
        }
        return arrayList;
    }

    @NonNull
    public List<ModelReference<M>> getModelReferences() {
        ArrayList arrayList = new ArrayList();
        for (ModelRelationship<M> modelReference : this.relationships) {
            ModelReference modelReference2 = modelReference.getModelReference();
            if (modelReference2 != null) {
                arrayList.add(modelReference2);
            }
        }
        return arrayList;
    }

    @NonNull
    public List<M> getModels() {
        ArrayList arrayList = new ArrayList();
        for (ModelRelationship<M> model : this.relationships) {
            IModel model2 = model.getModel();
            if (model2 != null) {
                arrayList.add(model2);
            }
        }
        return arrayList;
    }

    public void updateModelReferences(@Nullable Set<ModelReference<M>> set) {
        if (set != null) {
            for (ModelReference next : set) {
                for (ModelRelationship next2 : this.relationships) {
                    if (next2.f18064id.equals(next.getId())) {
                        next2.updateModelReference(next);
                    }
                }
            }
        }
    }
}
