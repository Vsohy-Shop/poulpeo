package com.rmn.api.p322v2.main.cache;

import com.rmn.api.p322v2.main.cache.cacheaccess.AbstractCache;
import com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL;
import com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Collection;

/* renamed from: com.rmn.api.v2.main.cache.ICacheMethodType */
public interface ICacheMethodType {
    AbstractCache getCache(ContextContainer contextContainer);

    Collection<DataSourceSQL> init(ContextContainer contextContainer, BaseDatabaseHelper baseDatabaseHelper);
}
