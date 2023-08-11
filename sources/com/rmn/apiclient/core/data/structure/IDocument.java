package com.rmn.apiclient.core.data.structure;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.IModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p446vd.C13633n;

public interface IDocument {
    @NonNull
    IDocument copy(@NonNull ResourceList resourceList, @NonNull ResourceList resourceList2);

    @Nullable
    IResource<?> findResource(@NonNull IResourceId iResourceId) {
        Iterator<IResource<?>> it = getIncludedResources().iterator();
        while (it.hasNext()) {
            IResource<?> next = it.next();
            if (iResourceId.equals(next.getResourceId())) {
                return next;
            }
        }
        Iterator<IResource<?>> it2 = getDataResources().iterator();
        while (it2.hasNext()) {
            IResource<?> next2 = it2.next();
            if (iResourceId.equals(next2.getResourceId())) {
                return next2;
            }
        }
        return null;
    }

    @NonNull
    ResourceList getDataResources();

    @NonNull
    List<IError> getErrors();

    @Nullable
    <M extends IModel> IResource<M> getFirstDataResource() {
        IResource<?> firstOrNull = getDataResources().firstOrNull();
        if (firstOrNull == null) {
            return null;
        }
        return firstOrNull;
    }

    @NonNull
    ResourceList getIncludedResources();

    @Nullable
    <T> T getMetaObject();

    @NonNull
    <M extends IModel> Collection<M> getModels() {
        ArrayList arrayList = new ArrayList();
        Iterator<IResource<?>> it = getDataResources().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getModel());
        }
        return arrayList;
    }

    boolean hasDataResources() {
        return !getDataResources().isEmpty();
    }

    boolean hasErrors() {
        return !getErrors().isEmpty();
    }

    @Nullable
    <M extends IModel> M optFirstModel() {
        IResource firstDataResource = getFirstDataResource();
        if (firstDataResource == null) {
            return null;
        }
        return firstDataResource.getModel();
    }

    @NonNull
    <M extends IModel> Collection<M> optModels() {
        ArrayList arrayList = new ArrayList();
        Iterator<IResource<?>> it = getDataResources().iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(it.next().getModel());
            } catch (ClassCastException e) {
                C13633n.m31165u(this, e);
            }
        }
        return arrayList;
    }
}
