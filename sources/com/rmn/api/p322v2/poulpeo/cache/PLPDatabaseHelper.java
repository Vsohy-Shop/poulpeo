package com.rmn.api.p322v2.poulpeo.cache;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL;
import com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsCountry;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsOffer;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPHome;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPMerchant;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPPinnedObject;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPUser;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsReviewMerchant;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsSupportTicket;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.rmn.api.v2.poulpeo.cache.PLPDatabaseHelper */
public class PLPDatabaseHelper extends BaseDatabaseHelper {
    public static final String DATABASE_NAME = "poulpeo_database.sqlite";
    public static final int DATABASE_VERSION = 8;
    private static PLPDatabaseHelper instance;

    private PLPDatabaseHelper(ContextContainer contextContainer) {
        super(contextContainer, DATABASE_NAME, 8);
    }

    public static PLPDatabaseHelper getInstance(ContextContainer contextContainer) {
        if (instance == null) {
            synchronized (PLPDatabaseHelper.class) {
                if (instance == null) {
                    instance = new PLPDatabaseHelper(contextContainer);
                }
            }
        }
        return instance;
    }

    /* access modifiers changed from: protected */
    public void registerDataSources(String str, ContextContainer contextContainer) {
        List<ICacheMethodType> groupAllCacheMethods = BaseDatabaseHelper.groupAllCacheMethods(CacheMethodsPLPPinnedObject.getMethodTypes(), CacheMethodsPLPMerchant.getMethodTypes(), CacheMethodsOffer.getMethodTypes(), CacheMethodsPLPUser.getMethodTypes(), CacheMethodsPLPHome.getMethodTypes(), CacheMethodsReviewMerchant.getMethodTypes(), CacheMethodsSupportTicket.getMethodTypes(), CacheMethodsCountry.getMethodTypes());
        LinkedList<DataSourceSQL> linkedList = new LinkedList<>();
        for (ICacheMethodType init : groupAllCacheMethods) {
            linkedList.addAll(init.init(contextContainer, this));
        }
        for (DataSourceSQL registerNewDataSource : linkedList) {
            BaseDatabaseHelper.registerNewDataSource(str, registerNewDataSource);
        }
    }
}
