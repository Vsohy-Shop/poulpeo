package com.rmn.api.p322v2.cloud.cache;

import com.rmn.api.p322v2.cloud.cache.methods.CacheMethodsCloudList;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL;
import com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.rmn.api.v2.cloud.cache.CloudDatabaseHelper */
public class CloudDatabaseHelper extends BaseDatabaseHelper {
    public static final String DATABASE_NAME = "cloud_database.sqlite";
    public static final int DATABASE_VERSION = 1;
    private static CloudDatabaseHelper instance;

    private CloudDatabaseHelper(ContextContainer contextContainer) {
        super(contextContainer, DATABASE_NAME, 1);
    }

    public static CloudDatabaseHelper getInstance(ContextContainer contextContainer) {
        if (instance == null) {
            synchronized (CloudDatabaseHelper.class) {
                if (instance == null) {
                    instance = new CloudDatabaseHelper(contextContainer);
                }
            }
        }
        return instance;
    }

    /* access modifiers changed from: protected */
    public void registerDataSources(String str, ContextContainer contextContainer) {
        List<ICacheMethodType> groupAllCacheMethods = BaseDatabaseHelper.groupAllCacheMethods(CacheMethodsCloudList.getMethodTypes());
        LinkedList<DataSourceSQL> linkedList = new LinkedList<>();
        for (ICacheMethodType init : groupAllCacheMethods) {
            linkedList.addAll(init.init(contextContainer, this));
        }
        for (DataSourceSQL registerNewDataSource : linkedList) {
            BaseDatabaseHelper.registerNewDataSource(str, registerNewDataSource);
        }
    }
}
