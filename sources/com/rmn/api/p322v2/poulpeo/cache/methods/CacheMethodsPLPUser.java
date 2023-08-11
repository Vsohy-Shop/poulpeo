package com.rmn.api.p322v2.poulpeo.cache.methods;

import com.rmn.api.p322v2.main.cache.BaseCacheMethodType;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.BaseCacheAccess;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessList;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessSingleElement;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAggregated;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableIdToModel;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToIdArray;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToInt;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.poulpeo.cache.PLPModelCaches;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.Earning;
import com.rmn.api.p322v2.poulpeo.model.SponsoredUser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPUser */
public class CacheMethodsPLPUser {
    public static final ICacheMethodType EARNING_AMOUNT_DETAILS = new BaseCacheMethodType(new CacheAccessSingleElement(PLPMethodReturns.EARNING_AMOUNT_DETAIL, PLPModelCaches.CACHE_MODEL_EARNING_AMOUNT));
    public static final ICacheMethodType GET_DETAILS = new BaseCacheMethodType(new CacheAccessSingleElement(PLPMethodReturns.PLP_USER_DETAIL, PLPModelCaches.CACHE_MODEL_PLP_USER));
    public static final ICacheMethodType GET_EARNINGS = new BaseCacheMethodType(new CacheAggregated(new C11404a()));
    public static final ICacheMethodType GET_SPONSORED_USERS = new BaseCacheMethodType(new CacheAccessList(PLPMethodReturns.SPONSORED_USER_ARRAY, PLPMethodReturns.TOTAL_COUNT, PLPModelCaches.CACHE_MODEL_SPONSORED_USER, new CacheTableParamsToIdArray(SponsoredUser.class, PLPMethodNames.PLP_USER_GET_SPONSORED_USERS, 1, new C11407b(), PLPModelCaches.CACHE_MODEL_SPONSORED_USER.getIdType()), new CacheTableParamsToInt(SponsoredUser.class, PLPMethodNames.PLP_USER_GET_SPONSORED_USERS, 1, (Set<RMNMethodParam>) null)));

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPUser$a */
    class C11404a extends ArrayList<BaseCacheAccess> {

        /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPUser$a$a */
        class C11405a extends HashSet<RMNMethodParam> {
            C11405a() {
                add(PLPMethodParameters.OFFSET);
                add(PLPMethodParameters.LIMIT);
                add(PLPMethodParameters.EARNING_TYPE_FILTER);
                add(PLPMethodParameters.EARNING_STATUS_FILTER);
                add(PLPMethodParameters.SORT_PROPERTY);
                add(PLPMethodParameters.SORT_ORDER);
            }
        }

        /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPUser$a$b */
        class C11406b extends HashSet<RMNMethodParam> {
            C11406b() {
                add(PLPMethodParameters.EARNING_TYPE_FILTER);
                add(PLPMethodParameters.EARNING_STATUS_FILTER);
                add(PLPMethodParameters.SORT_PROPERTY);
                add(PLPMethodParameters.SORT_ORDER);
            }
        }

        C11404a() {
            add(new CacheAccessSingleElement(PLPMethodReturns.EARNING_AMOUNT_DETAIL, PLPModelCaches.CACHE_MODEL_EARNING_AMOUNT));
            RMNMethodReturnJSON rMNMethodReturnJSON = PLPMethodReturns.EARNING_ARRAY;
            RMNMethodReturnJSON rMNMethodReturnJSON2 = PLPMethodReturns.TOTAL_COUNT;
            CacheTableIdToModel cacheTableIdToModel = PLPModelCaches.CACHE_MODEL_EARNING;
            CacheTableParamsToIdArray cacheTableParamsToIdArray = new CacheTableParamsToIdArray(Earning.class, PLPMethodNames.PLP_USER_GET_EARNINGS, 1, new C11405a(), PLPModelCaches.CACHE_MODEL_EARNING.getIdType());
            add(new CacheAccessList(rMNMethodReturnJSON, rMNMethodReturnJSON2, cacheTableIdToModel, cacheTableParamsToIdArray, new CacheTableParamsToInt(Earning.class, PLPMethodNames.PLP_USER_GET_EARNINGS, 1, new C11406b())));
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPUser$b */
    class C11407b extends HashSet<RMNMethodParam> {
        C11407b() {
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
        }
    }

    public static ICacheMethodType[] getMethodTypes() {
        return new ICacheMethodType[]{GET_DETAILS, EARNING_AMOUNT_DETAILS, GET_EARNINGS, GET_SPONSORED_USERS};
    }
}
