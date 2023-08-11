package com.rmn.apiclient.core.data.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p446vd.C13633n;
import p468zb.C14079a;

public class ResourceDescriptorSet {
    @NonNull
    private final Set<IResourceDescriptor<?>> resourceDescriptors = new HashSet();

    /* renamed from: com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet$a */
    class C11584a extends HashSet<String> {

        /* renamed from: b */
        final /* synthetic */ String f18025b;

        C11584a(String str) {
            this.f18025b = str;
            add(str);
        }
    }

    public ResourceDescriptorSet(@NonNull IResourceDescriptor<?>... iResourceDescriptorArr) {
        int length = iResourceDescriptorArr.length;
        int i = 0;
        while (i < length) {
            if (iResourceDescriptorArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException("A resource descriptor is null");
            }
        }
        this.resourceDescriptors.addAll(Arrays.asList(iResourceDescriptorArr));
    }

    @Nullable
    public IResourceDescriptor<?> findResourceDescriptor(@NonNull String str) {
        return findResourceDescriptor((Set<String>) new C11584a(str));
    }

    public int getResourceCount() {
        return this.resourceDescriptors.size();
    }

    @NonNull
    public Set<String> getResourceTypes() {
        HashSet hashSet = new HashSet();
        for (IResourceDescriptor<?> resourceType : this.resourceDescriptors) {
            hashSet.add(resourceType.getResourceType());
        }
        return hashSet;
    }

    @Nullable
    public IResourceDescriptor<?> findResourceDescriptor(@NonNull Set<String> set) {
        for (IResourceDescriptor<?> next : this.resourceDescriptors) {
            if (set.contains(next.getResourceType())) {
                return next;
            }
        }
        C13633n.m31148d("No ressource descriptor found with the associated types : " + C14079a.m32658a(",", set));
        return null;
    }
}
