package com.rmn.apiclient.core.data.structure;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ResourceIdList implements Iterable<IResourceId> {
    @NonNull
    private final List<IResourceId> resourceIds;

    /* renamed from: com.rmn.apiclient.core.data.structure.ResourceIdList$a */
    class C11585a extends HashSet<String> {

        /* renamed from: b */
        final /* synthetic */ String f18027b;

        C11585a(String str) {
            this.f18027b = str;
            add(str);
        }
    }

    public ResourceIdList() {
        this.resourceIds = new ArrayList();
    }

    @NonNull
    public List<String> getIdsForType(@NonNull String str) {
        return getIdsForType((Set<String>) new C11585a(str));
    }

    @NonNull
    public Iterator<IResourceId> iterator() {
        return this.resourceIds.iterator();
    }

    @NonNull
    public List<String> getIdsForType(@NonNull Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (IResourceId next : this.resourceIds) {
            if (set.contains(next.getType())) {
                arrayList.add(next.getId());
            }
        }
        return arrayList;
    }

    public ResourceIdList(@NonNull List<IResourceId> list) {
        ArrayList arrayList = new ArrayList();
        this.resourceIds = arrayList;
        arrayList.addAll(list);
    }
}
