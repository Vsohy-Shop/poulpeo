package com.rmn.apiclient.core.data_access.base.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class ParamDescriptorSet implements Iterable<ParamDescriptor<?>> {
    @NonNull
    private final Set<ParamDescriptor<?>> paramDescriptorSet;

    public ParamDescriptorSet(@NonNull ParamDescriptor<?>... paramDescriptorArr) {
        HashSet hashSet = new HashSet();
        this.paramDescriptorSet = hashSet;
        hashSet.addAll(Arrays.asList(paramDescriptorArr));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParamDescriptorSet)) {
            return false;
        }
        return this.paramDescriptorSet.equals(((ParamDescriptorSet) obj).paramDescriptorSet);
    }

    @Nullable
    public ParamDescriptor<?> findParamDescriptor(@NonNull String str) {
        for (ParamDescriptor<?> next : this.paramDescriptorSet) {
            if (next.name.equals(str)) {
                return next;
            }
        }
        return null;
    }

    @NonNull
    public Set<ParamDescriptor<?>> getMandatoryParamDescriptors() {
        HashSet hashSet = new HashSet();
        for (ParamDescriptor next : this.paramDescriptorSet) {
            if (next.isMandatory) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    @NonNull
    public Set<String> getParamDescriptorNames() {
        HashSet hashSet = new HashSet();
        for (ParamDescriptor<?> paramDescriptor : this.paramDescriptorSet) {
            hashSet.add(paramDescriptor.name);
        }
        return hashSet;
    }

    public boolean hasParamDescriptor(@NonNull String str) {
        return findParamDescriptor(str) != null;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.paramDescriptorSet});
    }

    @NonNull
    public Iterator<ParamDescriptor<?>> iterator() {
        return this.paramDescriptorSet.iterator();
    }

    public int size() {
        return this.paramDescriptorSet.size();
    }

    public boolean hasParamDescriptor(@NonNull ParamDescriptor<?> paramDescriptor) {
        return this.paramDescriptorSet.contains(paramDescriptor);
    }
}
