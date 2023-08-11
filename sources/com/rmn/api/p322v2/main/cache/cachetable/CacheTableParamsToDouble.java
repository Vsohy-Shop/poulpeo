package com.rmn.api.p322v2.main.cache.cachetable;

import com.rmn.api.p322v2.main.cache.memory.BaseMemoryTableOld;
import com.rmn.api.p322v2.main.cache.memory.MemoryTableDefault;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.sqlite.KeySQLColumn;
import java.util.Set;

/* renamed from: com.rmn.api.v2.main.cache.cachetable.CacheTableParamsToDouble */
public class CacheTableParamsToDouble extends BaseCacheTableParamsToAny<Double> {
    public static final String COLUMN_NAME_VALUE = "CACHE_value";

    public CacheTableParamsToDouble(Class<?> cls, String str, int i, Set<RMNMethodParam> set) {
        super(cls, "ParamsToDouble", str, i, set, new KeySQLColumn("CACHE_value", Double.TYPE, false, true));
    }

    /* access modifiers changed from: protected */
    public BaseMemoryTableOld<KeyFilter, Double, ?> newMemoryCacheTable() {
        return new MemoryTableDefault();
    }

    /* access modifiers changed from: protected */
    public Object serializeToBeforeSQLCaching(Double d) {
        return d;
    }

    /* access modifiers changed from: protected */
    public Double unserializeToAfterSQLRetrieving(Object obj) {
        return (Double) obj;
    }
}
