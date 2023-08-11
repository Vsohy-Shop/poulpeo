package com.rmn.api.p322v2.poulpeo.cache.methods;

import com.rmn.api.p322v2.main.cache.BaseCacheMethodType;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.BaseCacheAccess;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessElement;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessList;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAggregated;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToIdArray;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToInt;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.poulpeo.cache.PLPModelCaches;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.ReviewMerchant;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsReviewMerchant */
public class CacheMethodsReviewMerchant {
    public static final ICacheMethodType GET_LIST = new BaseCacheMethodType(new CacheAggregated(new C11408a()));
    public static final ICacheMethodType REVIEW_MERCHANT_STATUS_GET_DETAILS;
    /* access modifiers changed from: private */
    public static final CacheAccessElement cacheTypeReviewMerchantStatus;

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsReviewMerchant$a */
    class C11408a extends ArrayList<BaseCacheAccess> {

        /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsReviewMerchant$a$a */
        class C11409a extends HashSet<RMNMethodParam> {
            C11409a() {
                add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
                add(PLPMethodParameters.OFFSET);
                add(PLPMethodParameters.LIMIT);
            }
        }

        /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsReviewMerchant$a$b */
        class C11410b extends HashSet<RMNMethodParam> {
            C11410b() {
                add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
            }
        }

        C11408a() {
            add(new CacheAccessList(PLPMethodReturns.REVIEW_MERCHANT_ARRAY, PLPMethodReturns.TOTAL_COUNT, PLPModelCaches.CACHE_MODEL_REVIEW_MERCHANT, new CacheTableParamsToIdArray(ReviewMerchant.class, PLPMethodNames.REVIEW_MERCHANT_GET_LIST, 24, new C11409a(), PLPModelCaches.CACHE_MODEL_REVIEW_MERCHANT.getIdType()), new CacheTableParamsToInt(ReviewMerchant.class, PLPMethodNames.REVIEW_MERCHANT_GET_LIST, 24, new C11410b())));
            add(CacheMethodsReviewMerchant.cacheTypeReviewMerchantStatus);
        }
    }

    static {
        CacheAccessElement cacheAccessElement = new CacheAccessElement(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, PLPMethodReturns.REVIEW_MERCHANT_STATUS_DETAIL, PLPModelCaches.CACHE_MODEL_REVIEW_MERCHANT_STATUS);
        cacheTypeReviewMerchantStatus = cacheAccessElement;
        REVIEW_MERCHANT_STATUS_GET_DETAILS = new BaseCacheMethodType(cacheAccessElement);
    }

    public static ICacheMethodType[] getMethodTypes() {
        return new ICacheMethodType[]{GET_LIST, REVIEW_MERCHANT_STATUS_GET_DETAILS};
    }
}
