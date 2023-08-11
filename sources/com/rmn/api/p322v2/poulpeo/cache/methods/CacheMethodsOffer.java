package com.rmn.api.p322v2.poulpeo.cache.methods;

import com.rmn.api.p322v2.common.model.BaseCoupon;
import com.rmn.api.p322v2.main.cache.BaseCacheMethodType;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.BaseCacheAccess;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessElement;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessList;
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
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsOffer */
public class CacheMethodsOffer {
    public static final ICacheMethodType GET_BY_MERCHANT = new BaseCacheMethodType(new CacheAggregated(new C11392a()));
    public static final ICacheMethodType GET_DETAILS = new BaseCacheMethodType(new CacheAccessElement(PLPMethodParameters.ID_COUPON_REQUIRED, PLPMethodReturns.OFFER_DETAIL, PLPModelCaches.CACHE_MODEL_OFFER));

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsOffer$a */
    class C11392a extends ArrayList<BaseCacheAccess> {

        /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsOffer$a$a */
        class C11393a extends HashSet<RMNMethodParam> {
            C11393a() {
                add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
                add(PLPMethodParameters.OFFSET);
                add(PLPMethodParameters.LIMIT);
                add(PLPMethodParameters.COUPON_TYPES);
                add(PLPMethodParameters.CODE_TYPES);
                add(PLPMethodParameters.ONLY_CASHBACK_CUMULATIVE);
                add(PLPMethodParameters.WITH_DYNAMIC);
            }
        }

        /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsOffer$a$b */
        class C11394b extends HashSet<RMNMethodParam> {
            C11394b() {
                add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
                add(PLPMethodParameters.COUPON_TYPES);
                add(PLPMethodParameters.CODE_TYPES);
                add(PLPMethodParameters.ONLY_CASHBACK_CUMULATIVE);
                add(PLPMethodParameters.WITH_DYNAMIC);
            }
        }

        C11392a() {
            add(new CacheAccessElement(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, PLPMethodReturns.PLP_MERCHANT_OBJECT, PLPModelCaches.CACHE_MODEL_PLP_MERCHANT));
            RMNMethodReturnJSON rMNMethodReturnJSON = PLPMethodReturns.OFFERS_ARRAY;
            RMNMethodReturnJSON rMNMethodReturnJSON2 = PLPMethodReturns.TOTAL_COUNT;
            CacheTableIdToModel cacheTableIdToModel = PLPModelCaches.CACHE_MODEL_OFFER;
            CacheTableParamsToIdArray cacheTableParamsToIdArray = new CacheTableParamsToIdArray(BaseCoupon.class, PLPMethodNames.COUPON_GET_BY_MERCHANT, 24, new C11393a(), PLPModelCaches.CACHE_MODEL_OFFER.getIdType());
            add(new CacheAccessList(rMNMethodReturnJSON, rMNMethodReturnJSON2, cacheTableIdToModel, cacheTableParamsToIdArray, new CacheTableParamsToInt(BaseCoupon.class, PLPMethodNames.PLP_USER_GET_EARNINGS, 24, new C11394b())));
        }
    }

    public static ICacheMethodType[] getMethodTypes() {
        return new ICacheMethodType[]{GET_DETAILS, GET_BY_MERCHANT};
    }
}
