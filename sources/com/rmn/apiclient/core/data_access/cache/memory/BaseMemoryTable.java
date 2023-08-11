package com.rmn.apiclient.core.data_access.cache.memory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

abstract class BaseMemoryTable<KeyType, ValueType> {
    @NonNull
    private final LinkedList<KeyType> keysPriority = new LinkedList<>();
    private final int tableSize;
    @NonNull
    private final Map<KeyType, ValueType> valuesByKey = new HashMap();

    public BaseMemoryTable(int i) {
        if (i > 0) {
            this.tableSize = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    private void limitElements() {
        while (this.valuesByKey.size() > this.tableSize) {
            this.valuesByKey.remove(this.keysPriority.removeFirst());
        }
    }

    private void setAsHighPriority(@NonNull KeyType keytype) {
        this.keysPriority.removeFirstOccurrence(keytype);
        this.keysPriority.addLast(keytype);
    }

    public void addOrReplaceElement(@NonNull KeyType keytype, @NonNull ValueType valuetype) {
        this.valuesByKey.put(keytype, valuetype);
        setAsHighPriority(keytype);
        limitElements();
    }

    public void clearElements() {
        this.valuesByKey.clear();
        this.keysPriority.clear();
    }

    @Nullable
    public ValueType getElement(@NonNull KeyType keytype) {
        setAsHighPriority(keytype);
        return this.valuesByKey.get(keytype);
    }

    @NonNull
    public Set<ValueType> getElements(@NonNull Collection<KeyType> collection) {
        HashSet hashSet = new HashSet();
        for (KeyType element : collection) {
            Object element2 = getElement(element);
            if (element2 != null) {
                hashSet.add(element2);
            }
        }
        return hashSet;
    }

    @Nullable
    public ValueType removeElement(@NonNull KeyType keytype) {
        ValueType remove = this.valuesByKey.remove(keytype);
        this.keysPriority.removeFirstOccurrence(keytype);
        return remove;
    }
}
