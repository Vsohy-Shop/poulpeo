package com.rmn.api.p322v2.cloud.cache.methods;

import com.rmn.api.p322v2.cloud.cache.CloudModelCaches;
import com.rmn.api.p322v2.cloud.general.CloudMethodParameters;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import com.rmn.api.p322v2.main.cache.BaseCacheMethodType;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessElement;

/* renamed from: com.rmn.api.v2.cloud.cache.methods.CacheMethodsCloudList */
public class CacheMethodsCloudList {
    public static final ICacheMethodType GET_DETAILS = new BaseCacheMethodType(new CacheAccessElement(CloudMethodParameters.ID_LIST, CloudMethodReturns.CLOUD_LIST_DETAIL, CloudModelCaches.CACHE_MODEL_CLOUD_LIST));

    public static ICacheMethodType[] getMethodTypes() {
        return new ICacheMethodType[]{GET_DETAILS};
    }
}
