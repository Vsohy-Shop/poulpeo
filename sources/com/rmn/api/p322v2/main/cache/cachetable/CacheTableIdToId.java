package com.rmn.api.p322v2.main.cache.cachetable;

import com.rmn.api.p322v2.main.cache.memory.BaseMemoryTableOld;
import com.rmn.api.p322v2.main.cache.memory.MemoryTableDefault;
import com.rmn.api.p322v2.main.sqlite.KeySQLColumn;

/* renamed from: com.rmn.api.v2.main.cache.cachetable.CacheTableIdToId */
public class CacheTableIdToId extends BaseCacheTableIdToAny<Object, Object> {
    public static final String COLUMN_NAME_ID = "CACHE_id";
    public static final String COLUMN_NAME_ID_REF = "CACHE_idRef";

    public CacheTableIdToId(Class<?> cls, String str, int i, Class<?> cls2, Class<?> cls3) {
        super(cls, "IdToId", str, i, new KeySQLColumn("CACHE_id", cls2, true, true), new KeySQLColumn(COLUMN_NAME_ID_REF, cls3, false, true));
    }

    public final Class<?> getIdRefType() {
        return getToType();
    }

    public final Class<?> getIdType() {
        return getFromType();
    }

    /* access modifiers changed from: protected */
    public BaseMemoryTableOld<Object, Object, ?> newMemoryCacheTable() {
        return new MemoryTableDefault();
    }

    /* access modifiers changed from: protected */
    public Object serializeFromBeforeSQLCaching(Object obj) {
        return obj;
    }

    /* access modifiers changed from: protected */
    public Object serializeToBeforeSQLCaching(Object obj) {
        return obj;
    }

    /* access modifiers changed from: protected */
    public Object unserializeFromAfterSQLRetrieving(Object obj) {
        return obj;
    }

    /* access modifiers changed from: protected */
    public Object unserializeToAfterSQLRetrieving(Object obj) {
        return obj;
    }
}
