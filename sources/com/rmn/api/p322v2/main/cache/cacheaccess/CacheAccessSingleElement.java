package com.rmn.api.p322v2.main.cache.cacheaccess;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.CacheResponseObject;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputRemove;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableIdToModel;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.json.IJsonCacheableModel;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.main.cache.cacheaccess.CacheAccessSingleElement */
public class CacheAccessSingleElement extends BaseCacheAccess {
    private CacheTableIdToModel cacheMemIdToModel;
    private RMNMethodReturnType methodReturnModel;

    public CacheAccessSingleElement(RMNMethodReturnType rMNMethodReturnType, CacheTableIdToModel cacheTableIdToModel) {
        if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (cacheTableIdToModel != null) {
            this.methodReturnModel = rMNMethodReturnType;
            this.cacheMemIdToModel = cacheTableIdToModel;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(cacheTableIdToModel);
            HashSet hashSet = new HashSet(1);
            hashSet.add(rMNMethodReturnType);
            setParameters(arrayList, new HashSet(), hashSet);
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
        this.cacheMemIdToModel.clearElements();
        this.cacheMemIdToModel.addElement((IJsonCacheableModel) obj, z);
    }

    /* access modifiers changed from: protected */
    public void processCacheClear(CacheBundleInputClear cacheBundleInputClear) {
        this.cacheMemIdToModel.clearElements();
    }

    /* access modifiers changed from: protected */
    public boolean processCacheGet(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput) {
        IJsonCacheableModel iJsonCacheableModel = (IJsonCacheableModel) this.cacheMemIdToModel.getFirstElement();
        if (iJsonCacheableModel == null) {
            return false;
        }
        CacheResponseObject cacheResponseObject = new CacheResponseObject(this.methodReturnModel);
        cacheResponseObject.setResponseObject(iJsonCacheableModel);
        cacheBundleOutput.addResponseObject(this.methodReturnModel, cacheResponseObject);
        return true;
    }

    /* access modifiers changed from: protected */
    public void processCacheRemove(CacheBundleInputRemove cacheBundleInputRemove) {
        this.cacheMemIdToModel.clearElements();
    }
}
