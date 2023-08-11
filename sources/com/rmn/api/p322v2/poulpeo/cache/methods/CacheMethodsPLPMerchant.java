package com.rmn.api.p322v2.poulpeo.cache.methods;

import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.main.cache.BaseCacheMethodType;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessElement;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessList;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToIdArray;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToInt;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.poulpeo.cache.PLPModelCaches;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPMerchant */
public class CacheMethodsPLPMerchant {
    public static final ICacheMethodType GET_DETAILS = new BaseCacheMethodType(new CacheAccessElement(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, PLPMethodReturns.PLP_MERCHANT_DETAIL, PLPModelCaches.CACHE_MODEL_PLP_MERCHANT));
    public static final ICacheMethodType GET_SIMILAR;
    public static final ICacheMethodType SEARCH;

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPMerchant$a */
    class C11399a extends HashSet<RMNMethodParam> {
        C11399a() {
            add(PLPMethodParameters.QUERY_REQUIRED);
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
            add(PLPMethodParameters.SORT_PROPERTY);
            add(PLPMethodParameters.SORT_ORDER);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPMerchant$b */
    class C11400b extends HashSet<RMNMethodParam> {
        C11400b() {
            add(PLPMethodParameters.QUERY_REQUIRED);
            add(PLPMethodParameters.SORT_PROPERTY);
            add(PLPMethodParameters.SORT_ORDER);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPMerchant$c */
    class C11401c extends HashSet<RMNMethodParam> {
        C11401c() {
            add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
            add(PLPMethodParameters.HAS_CASHBACK);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPMerchant$d */
    class C11402d extends HashSet<RMNMethodParam> {
        C11402d() {
            add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
            add(PLPMethodParameters.HAS_CASHBACK);
        }
    }

    static {
        RMNMethodReturnJSON rMNMethodReturnJSON = PLPMethodReturns.PLP_MERCHANT_ARRAY;
        Class<BaseMerchant> cls = BaseMerchant.class;
        RMNMethodReturnJSON rMNMethodReturnJSON2 = PLPMethodReturns.TOTAL_COUNT;
        SEARCH = new BaseCacheMethodType(new CacheAccessList(rMNMethodReturnJSON, rMNMethodReturnJSON2, PLPModelCaches.CACHE_MODEL_PLP_MERCHANT, new CacheTableParamsToIdArray(BaseMerchant.class, PLPMethodNames.PLP_MERCHANT_SEARCH, 72, new C11399a(), PLPModelCaches.CACHE_MODEL_PLP_MERCHANT.getIdType()), new CacheTableParamsToInt(cls, PLPMethodNames.PLP_MERCHANT_SEARCH, 72, new C11400b())));
        GET_SIMILAR = new BaseCacheMethodType(new CacheAccessList(rMNMethodReturnJSON, rMNMethodReturnJSON2, PLPModelCaches.CACHE_MODEL_PLP_MERCHANT, new CacheTableParamsToIdArray(BaseMerchant.class, PLPMethodNames.PLP_MERCHANT_GET_SIMILAR, 72, new C11401c(), PLPModelCaches.CACHE_MODEL_PLP_MERCHANT.getIdType()), new CacheTableParamsToInt(cls, PLPMethodNames.PLP_MERCHANT_GET_SIMILAR, 72, new C11402d())));
    }

    public static ICacheMethodType[] getMethodTypes() {
        return new ICacheMethodType[]{GET_DETAILS, SEARCH, GET_SIMILAR};
    }
}
