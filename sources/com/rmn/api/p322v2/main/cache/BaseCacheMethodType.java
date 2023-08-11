package com.rmn.api.p322v2.main.cache;

import com.rmn.api.p322v2.main.cache.cacheaccess.AbstractCache;
import com.rmn.api.p322v2.main.cache.cachetable.BaseCacheTable;
import com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL;
import com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.rmn.api.v2.main.cache.BaseCacheMethodType */
public class BaseCacheMethodType implements ICacheMethodType {
    private AbstractCache cache;

    public BaseCacheMethodType(AbstractCache abstractCache) {
        if (abstractCache != null) {
            this.cache = abstractCache;
            return;
        }
        throw new IllegalArgumentException();
    }

    public AbstractCache getCache(ContextContainer contextContainer) {
        return this.cache;
    }

    public Collection<DataSourceSQL> init(ContextContainer contextContainer, BaseDatabaseHelper baseDatabaseHelper) {
        this.cache.init(contextContainer, baseDatabaseHelper);
        BaseCacheTable[] cacheTables = this.cache.getCacheTables();
        ArrayList arrayList = new ArrayList(cacheTables.length);
        for (BaseCacheTable datasource : cacheTables) {
            arrayList.add(datasource.getDatasource());
        }
        return arrayList;
    }
}
