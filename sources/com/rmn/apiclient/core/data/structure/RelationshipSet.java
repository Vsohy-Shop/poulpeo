package com.rmn.apiclient.core.data.structure;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RelationshipSet implements Iterable<IRelationship> {
    @NonNull
    private final Set<IRelationship> relationships;

    public RelationshipSet(@NonNull IRelationship... iRelationshipArr) {
        HashSet hashSet = new HashSet();
        this.relationships = hashSet;
        hashSet.addAll(Arrays.asList(iRelationshipArr));
    }

    @Nullable
    public IRelationship findRelationshipWithName(@NonNull String str) {
        for (IRelationship next : this.relationships) {
            if (str.equals(next.getName())) {
                return next;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this.relationships.isEmpty();
    }

    @NonNull
    public Iterator<IRelationship> iterator() {
        return this.relationships.iterator();
    }

    public RelationshipSet(@NonNull Set<IRelationship> set) {
        HashSet hashSet = new HashSet();
        this.relationships = hashSet;
        hashSet.addAll(set);
    }
}
