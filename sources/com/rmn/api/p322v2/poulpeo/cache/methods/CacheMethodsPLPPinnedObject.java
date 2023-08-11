package com.rmn.api.p322v2.poulpeo.cache.methods;

import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.main.cache.BaseCacheMethodType;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessList;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableIdToModel;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToIdArray;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.poulpeo.cache.PLPModelCaches;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPPinnedObject */
public class CacheMethodsPLPPinnedObject {
    public static final ICacheMethodType GET_LIST;

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsPLPPinnedObject$a */
    class C11403a extends HashSet<RMNMethodParam> {
        C11403a() {
            add(PLPMethodParameters.PLP_PINNED_OBJECT_TYPE_OPTIONAL);
            add(PLPMethodParameters.PLP_PINNED_OBJECT_MODEL_OPTIONAL);
        }
    }

    static {
        RMNMethodReturnJSON rMNMethodReturnJSON = PLPMethodReturns.PLP_PINNED_OBJECT_ARRAY;
        CacheTableIdToModel cacheTableIdToModel = PLPModelCaches.CACHE_MODEL_PLP_PINNED_OBJECT;
        GET_LIST = new BaseCacheMethodType(new CacheAccessList(rMNMethodReturnJSON, cacheTableIdToModel, new CacheTableParamsToIdArray(PinnedObject.class, PLPMethodNames.PLP_PINNED_OBJECT_GET_LIST, 24, new C11403a(), cacheTableIdToModel.getIdType())));
    }

    public static ICacheMethodType[] getMethodTypes() {
        return new ICacheMethodType[]{GET_LIST};
    }
}
