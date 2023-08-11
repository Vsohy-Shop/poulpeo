package com.rmn.api.p322v2.poulpeo.cache.methods;

import com.rmn.api.p322v2.main.cache.BaseCacheMethodType;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessList;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToIdArray;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.poulpeo.cache.PLPModelCaches;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.Country;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsCountry */
public class CacheMethodsCountry {
    public static final ICacheMethodType SEARCH = new BaseCacheMethodType(new CacheAccessList(PLPMethodReturns.COUNTRY_ARRAY, PLPModelCaches.CACHE_MODEL_COUNTRY, new CacheTableParamsToIdArray(Country.class, PLPMethodNames.COUNTRY_SEARCH, 72, new C11391a(), PLPModelCaches.CACHE_MODEL_COUNTRY.getIdType())));

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsCountry$a */
    class C11391a extends HashSet<RMNMethodParam> {
        C11391a() {
            add(PLPMethodParameters.QUERY_REQUIRED);
        }
    }

    public static ICacheMethodType[] getMethodTypes() {
        return new ICacheMethodType[]{SEARCH};
    }
}
