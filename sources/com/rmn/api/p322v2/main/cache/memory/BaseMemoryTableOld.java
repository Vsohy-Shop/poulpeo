package com.rmn.api.p322v2.main.cache.memory;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.rmn.api.v2.main.cache.memory.BaseMemoryTableOld */
public abstract class BaseMemoryTableOld<From, To, SavedTo> {
    public static final int MAX_NB_ELEMENTS = 100;
    private final LinkedList<From> accessQueue = new LinkedList<>();
    protected final Map<From, SavedTo> table = new HashMap();

    private void reorderAccessQueue(@NonNull From from) {
        this.accessQueue.remove(from);
        this.accessQueue.addFirst(from);
    }

    private void resizeTable() {
        while (this.accessQueue.size() > 100) {
            this.table.remove(this.accessQueue.removeLast());
        }
    }

    public final synchronized void clear() {
        this.table.clear();
        this.accessQueue.clear();
    }

    public final synchronized boolean containsKey(@NonNull From from) {
        return this.table.containsKey(from);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract To convertDataSavedTo(@NonNull SavedTo savedto);

    /* access modifiers changed from: protected */
    @NonNull
    public abstract SavedTo convertDataTo(@NonNull To to);

    public final synchronized To get(@NonNull From from) {
        SavedTo savedto = this.table.get(from);
        if (savedto == null) {
            return null;
        }
        reorderAccessQueue(from);
        return convertDataSavedTo(savedto);
    }

    public final synchronized To getFirst() {
        Object value;
        if (!this.table.isEmpty()) {
            Map.Entry next = this.table.entrySet().iterator().next();
            Object key = next.getKey();
            value = next.getValue();
            reorderAccessQueue(key);
        } else {
            throw new IllegalStateException();
        }
        return convertDataSavedTo(value);
    }

    public final synchronized boolean isEmpty() {
        return this.table.isEmpty();
    }

    public final synchronized void put(@NonNull From from, @NonNull To to) {
        if (this.table.containsKey(from)) {
            update(from, to);
        } else {
            this.table.put(from, convertDataTo(to));
        }
        reorderAccessQueue(from);
        resizeTable();
    }

    public final synchronized void remove(@NonNull From from) {
        this.table.remove(from);
        this.accessQueue.remove(from);
    }

    /* access modifiers changed from: protected */
    public void update(@NonNull From from, @NonNull To to) {
        this.table.put(from, convertDataTo(to));
    }
}
