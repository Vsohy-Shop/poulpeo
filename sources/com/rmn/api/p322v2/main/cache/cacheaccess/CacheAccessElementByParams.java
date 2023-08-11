package com.rmn.api.p322v2.main.cache.cacheaccess;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.CacheResponseObject;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputRemove;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableIdToModel;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToIdArray;
import com.rmn.api.p322v2.main.cache.cachetable.KeyFilter;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.json.IJsonCacheableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.rmn.api.v2.main.cache.cacheaccess.CacheAccessElementByParams */
public class CacheAccessElementByParams extends BaseCacheAccess {
    private CacheTableIdToModel cacheMemIdToModel;
    private CacheTableParamsToIdArray cacheMemParamsToIdArray;
    private RMNMethodReturnType methodReturnModel;

    public CacheAccessElementByParams(CacheTableParamsToIdArray cacheTableParamsToIdArray, RMNMethodReturnType rMNMethodReturnType, CacheTableIdToModel cacheTableIdToModel) {
        if (cacheTableParamsToIdArray == null) {
            throw new IllegalArgumentException();
        } else if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (cacheTableIdToModel != null) {
            this.cacheMemParamsToIdArray = cacheTableParamsToIdArray;
            this.methodReturnModel = rMNMethodReturnType;
            this.cacheMemIdToModel = cacheTableIdToModel;
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(cacheTableParamsToIdArray);
            arrayList.add(cacheTableIdToModel);
            Set<RMNMethodParam> cacheParameters = cacheTableParamsToIdArray.getCacheParameters();
            HashSet hashSet = new HashSet(1);
            hashSet.add(rMNMethodReturnType);
            setParameters(arrayList, cacheParameters, hashSet);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public RMNMethodReturnType getAddMethodReturn() {
        return this.methodReturnModel;
    }

    /* access modifiers changed from: protected */
    public boolean isAddPreconditionValid(CacheBundleInputAdd cacheBundleInputAdd, Object obj) {
        return IJsonCacheableModel.class.isAssignableFrom(obj.getClass());
    }

    /* access modifiers changed from: protected */
    public boolean isGetPreconditionValid(CacheBundleInputGet cacheBundleInputGet) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isRemovePreconditionValid(CacheBundleInputRemove cacheBundleInputRemove) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void processCacheAdd(CacheBundleInputAdd cacheBundleInputAdd, Object obj, boolean z) {
        IJsonCacheableModel iJsonCacheableModel = (IJsonCacheableModel) obj;
        this.cacheMemIdToModel.addElement(iJsonCacheableModel, z);
        Object identifier = iJsonCacheableModel.getIdentifier();
        KeyFilter newKeyFilter = this.cacheMemParamsToIdArray.newKeyFilter(cacheBundleInputAdd.getParamValues());
        this.cacheMemParamsToIdArray.addElement(newKeyFilter, new Object[]{identifier}, z);
    }

    /* access modifiers changed from: protected */
    public void processCacheClear(CacheBundleInputClear cacheBundleInputClear) {
        this.cacheMemParamsToIdArray.clearElements();
    }

    /* access modifiers changed from: protected */
    public boolean processCacheGet(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput) {
        Object obj;
        IJsonCacheableModel iJsonCacheableModel;
        Object[] objArr = (Object[]) this.cacheMemParamsToIdArray.getElement(this.cacheMemParamsToIdArray.newKeyFilter(cacheBundleInputGet.getParamValues()));
        if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || (iJsonCacheableModel = (IJsonCacheableModel) this.cacheMemIdToModel.getElement(obj)) == null) {
            return false;
        }
        CacheResponseObject cacheResponseObject = new CacheResponseObject(this.methodReturnModel);
        cacheResponseObject.setResponseObject(iJsonCacheableModel);
        cacheBundleOutput.addResponseObject(this.methodReturnModel, cacheResponseObject);
        return true;
    }

    /* access modifiers changed from: protected */
    public void processCacheRemove(CacheBundleInputRemove cacheBundleInputRemove) {
        this.cacheMemParamsToIdArray.removeElement(this.cacheMemParamsToIdArray.newKeyFilter(cacheBundleInputRemove.getParamValues()));
    }
}
