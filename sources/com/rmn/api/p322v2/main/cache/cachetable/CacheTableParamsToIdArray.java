package com.rmn.api.p322v2.main.cache.cachetable;

import com.rmn.api.p322v2.main.cache.memory.BaseMemoryTableOld;
import com.rmn.api.p322v2.main.cache.memory.MemoryTableArray;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.sqlite.DatabaseManager;
import com.rmn.api.p322v2.main.sqlite.KeySQLColumn;
import java.util.Set;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.cache.cachetable.CacheTableParamsToIdArray */
public class CacheTableParamsToIdArray extends BaseCacheTableParamsToAny<Object[]> {
    public static final String COLUMN_NAME_ID_ARRAY = "CACHE_idArray";

    public CacheTableParamsToIdArray(Class<?> cls, String str, int i, Set<RMNMethodParam> set, Class<?> cls2) {
        super(cls, "ParamsToIdArray", str, i, set, new KeySQLColumn(COLUMN_NAME_ID_ARRAY, getArrayTypeFromType(cls2), false, true));
    }

    private static Class<?> getArrayTypeFromType(Class<?> cls) {
        try {
            return DatabaseManager.getArrayTypeFromType(cls);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: protected */
    public BaseMemoryTableOld<KeyFilter, Object[], ?> newMemoryCacheTable() {
        return new MemoryTableArray();
    }

    /* access modifiers changed from: protected */
    public Object serializeToBeforeSQLCaching(Object[] objArr) {
        return objArr;
    }

    /* access modifiers changed from: protected */
    public Object[] unserializeToAfterSQLRetrieving(Object obj) {
        try {
            return DatabaseManager.unserializeArray((String) obj, getToType());
        } catch (Exception e) {
            C13633n.m31165u(this, e);
            return null;
        }
    }
}
