package com.rmn.api.p322v2.main.cache.cachetable;

import com.rmn.api.p322v2.main.cache.memory.BaseMemoryTableOld;
import com.rmn.api.p322v2.main.cache.memory.MemoryTableDefault;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.sqlite.KeySQLColumn;
import java.util.Set;

/* renamed from: com.rmn.api.v2.main.cache.cachetable.CacheTableParamsToInt */
public class CacheTableParamsToInt extends BaseCacheTableParamsToAny<Integer> {
    public static final String COLUMN_NAME_VALUE = "CACHE_value";

    public CacheTableParamsToInt(Class<?> cls, String str, int i, Set<RMNMethodParam> set) {
        super(cls, "ParamsToInt", str, i, set, new KeySQLColumn("CACHE_value", Integer.TYPE, false, true));
    }

    /* access modifiers changed from: protected */
    public BaseMemoryTableOld<KeyFilter, Integer, ?> newMemoryCacheTable() {
        return new MemoryTableDefault();
    }

    /* access modifiers changed from: protected */
    public Object serializeToBeforeSQLCaching(Integer num) {
        return num;
    }

    /* access modifiers changed from: protected */
    public Integer unserializeToAfterSQLRetrieving(Object obj) {
        return (Integer) obj;
    }
}
