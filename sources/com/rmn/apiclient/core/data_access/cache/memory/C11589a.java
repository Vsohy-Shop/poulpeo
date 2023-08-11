package com.rmn.apiclient.core.data_access.cache.memory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.cache.memory.BaseMemoryTable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.rmn.apiclient.core.data_access.cache.memory.a */
/* compiled from: BaseMemoryCache */
abstract class C11589a<KeyType, TableType extends BaseMemoryTable<TableKeyType, TableValueType>, TableKeyType, TableValueType> {
    @NonNull
    private final Map<KeyType, TableType> tablesByKeys = new HashMap();

    C11589a() {
    }

    public void addOrReplaceElement(@NonNull KeyType keytype, @NonNull TableKeyType tablekeytype, @NonNull TableValueType tablevaluetype) {
        getOrCreateTable(keytype).addOrReplaceElement(tablekeytype, tablevaluetype);
    }

    public void clearElements() {
        this.tablesByKeys.clear();
    }

    public void clearTable(@NonNull KeyType keytype) {
        BaseMemoryTable table = getTable(keytype);
        if (table != null) {
            table.clearElements();
        }
    }

    @Nullable
    public TableValueType getElement(@NonNull KeyType keytype, @NonNull TableKeyType tablekeytype) {
        BaseMemoryTable table = getTable(keytype);
        if (table == null) {
            return null;
        }
        return table.getElement(tablekeytype);
    }

    @Nullable
    public Set<TableValueType> getElements(@NonNull KeyType keytype, @NonNull Collection<TableKeyType> collection) {
        BaseMemoryTable table = getTable(keytype);
        if (table == null) {
            return null;
        }
        return table.getElements(collection);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public TableType getOrCreateTable(@NonNull KeyType keytype) {
        TableType table = getTable(keytype);
        if (table != null) {
            return table;
        }
        TableType newTable = newTable();
        this.tablesByKeys.put(keytype, newTable);
        return newTable;
    }

    @Nullable
    public TableType getTable(@NonNull KeyType keytype) {
        if (!this.tablesByKeys.containsKey(keytype)) {
            return null;
        }
        return (BaseMemoryTable) this.tablesByKeys.get(keytype);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract TableType newTable();
}
