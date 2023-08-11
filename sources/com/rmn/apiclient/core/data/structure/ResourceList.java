package com.rmn.apiclient.core.data.structure;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResourceList implements Iterable<IResource<?>> {
    @NonNull
    private final List<IResource<?>> resources;

    public ResourceList(@NonNull ResourceList... resourceListArr) {
        this.resources = new ArrayList();
        for (ResourceList resourceList : resourceListArr) {
            this.resources.addAll(resourceList.resources);
        }
    }

    public IResource<?> firstOrNull() {
        if (this.resources.isEmpty()) {
            return null;
        }
        return this.resources.get(0);
    }

    public boolean isEmpty() {
        return this.resources.isEmpty();
    }

    @NonNull
    public Iterator<IResource<?>> iterator() {
        return this.resources.iterator();
    }

    public int size() {
        return this.resources.size();
    }

    public ResourceList(@NonNull List<IResource<?>> list) {
        ArrayList arrayList = new ArrayList();
        this.resources = arrayList;
        arrayList.addAll(list);
    }
}
