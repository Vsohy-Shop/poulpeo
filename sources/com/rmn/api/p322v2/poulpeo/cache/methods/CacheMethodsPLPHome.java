package com.rmn.api.p322v2.poulpeo.cache.methods;

import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.main.cache.BaseCacheMethodType;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.BaseCacheAccess;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessElement;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessList;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessSingleElement;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAggregated;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToIdArray;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToInt;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.poulpeo.cache.PLPModelCaches;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.HomeSectionRef;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPHome */
public class CacheMethodsPLPHome {
    public static final ICacheMethodType APP_GET_MERCHANTS_BY_TAG = new BaseCacheMethodType(new CacheAccessList(PLPMethodReturns.PLP_MERCHANT_ARRAY, PLPMethodReturns.TOTAL_COUNT, PLPModelCaches.CACHE_MODEL_PLP_MERCHANT, new CacheTableParamsToIdArray(BaseMerchant.class, PLPMethodNames.APP_GET_MERCHANTS_BY_TAG, 72, new C11397b(), PLPModelCaches.CACHE_MODEL_PLP_MERCHANT.getIdType()), new CacheTableParamsToInt(BaseMerchant.class, PLPMethodNames.APP_GET_MERCHANTS_BY_TAG, 72, new C11398c())));
    public static final ICacheMethodType APP_HOME = new BaseCacheMethodType(new CacheAggregated(new C11395a()));
    public static final ICacheMethodType GET_HOME_SECTION_BANNER;
    public static final ICacheMethodType GET_HOME_SECTION_EVENT;
    public static final ICacheMethodType GET_HOME_SECTION_MERCHANT;

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPHome$a */
    class C11395a extends ArrayList<BaseCacheAccess> {

        /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPHome$a$a */
        class C11396a extends HashSet<RMNMethodParam> {
            C11396a() {
                add(PLPMethodParameters.LIMIT);
            }
        }

        C11395a() {
            add(new CacheAccessSingleElement(PLPMethodReturns.PLP_USER_DETAIL_NAMED, PLPModelCaches.CACHE_MODEL_PLP_USER));
            add(new CacheAccessList(PLPMethodReturns.HOME_SECTION_REF_ARRAY, PLPModelCaches.CACHE_MODEL_HOME_SECTION_REF, new CacheTableParamsToIdArray(HomeSectionRef.class, PLPMethodNames.APP_HOME, 1, new C11396a(), PLPModelCaches.CACHE_MODEL_HOME_SECTION_REF.getIdType())));
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPHome$b */
    class C11397b extends HashSet<RMNMethodParam> {
        C11397b() {
            add(PLPMethodParameters.SECTION_TAG);
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPHome$c */
    class C11398c extends HashSet<RMNMethodParam> {
        C11398c() {
            add(PLPMethodParameters.SECTION_TAG);
        }
    }

    static {
        RMNMethodParam rMNMethodParam = PLPMethodParameters.SECTION_IDENTIFIER;
        GET_HOME_SECTION_MERCHANT = new BaseCacheMethodType(new CacheAccessElement(rMNMethodParam, PLPMethodReturns.HOME_SECTION_MERCHANT_DETAIL, PLPModelCaches.CACHE_MODEL_HOME_SECTION_MERCHANT));
        GET_HOME_SECTION_EVENT = new BaseCacheMethodType(new CacheAccessElement(rMNMethodParam, PLPMethodReturns.HOME_SECTION_EVENT_DETAIL, PLPModelCaches.CACHE_MODEL_HOME_SECTION_EVENT));
        GET_HOME_SECTION_BANNER = new BaseCacheMethodType(new CacheAccessElement(rMNMethodParam, PLPMethodReturns.HOME_SECTION_BANNER_DETAIL, PLPModelCaches.CACHE_MODEL_HOME_SECTION_BANNER));
    }

    public static ICacheMethodType[] getMethodTypes() {
        return new ICacheMethodType[]{GET_HOME_SECTION_MERCHANT, GET_HOME_SECTION_EVENT, GET_HOME_SECTION_BANNER, APP_HOME, APP_GET_MERCHANTS_BY_TAG};
    }
}
