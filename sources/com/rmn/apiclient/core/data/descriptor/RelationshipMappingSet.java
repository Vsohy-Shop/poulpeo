package com.rmn.apiclient.core.data.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RelationshipMappingSet implements Iterable<RelationshipMapping> {
    @NonNull
    private final Set<RelationshipMapping> mapping = new HashSet();

    public RelationshipMappingSet(@Nullable RelationshipMapping... relationshipMappingArr) {
        if (relationshipMappingArr != null) {
            int length = relationshipMappingArr.length;
            int i = 0;
            while (i < length) {
                if (relationshipMappingArr[i] != null) {
                    i++;
                } else {
                    throw new IllegalArgumentException("A mapping is null");
                }
            }
            this.mapping.addAll(Arrays.asList(relationshipMappingArr));
        }
    }

    @Nullable
    public RelationshipMapping findWithRelationshipName(@NonNull String str) {
        for (RelationshipMapping next : this.mapping) {
            if (str.equals(next.relationshipJsonTag)) {
                return next;
            }
        }
        return null;
    }

    public int getRelationshipCount() {
        return this.mapping.size();
    }

    @NonNull
    public Set<String> getRelationshipNames() {
        HashSet hashSet = new HashSet();
        for (RelationshipMapping relationshipMapping : this.mapping) {
            hashSet.add(relationshipMapping.relationshipJsonTag);
        }
        return hashSet;
    }

    @NonNull
    public Iterator<RelationshipMapping> iterator() {
        return this.mapping.iterator();
    }
}
