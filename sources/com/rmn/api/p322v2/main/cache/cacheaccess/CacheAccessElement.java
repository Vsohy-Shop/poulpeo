package com.rmn.api.p322v2.main.cache.cacheaccess;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.CacheResponseObject;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputRemove;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableIdToModel;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.json.IJsonCacheableModel;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.main.cache.cacheaccess.CacheAccessElement */
public class CacheAccessElement extends BaseCacheAccess {
    private CacheTableIdToModel cacheMemIdToModel;
    private RMNMethodReturnType methodReturnModel;
    private RMNMethodParam paramId;

    public CacheAccessElement(RMNMethodParam rMNMethodParam, RMNMethodReturnType rMNMethodReturnType, CacheTableIdToModel cacheTableIdToModel) {
        if (rMNMethodParam == null) {
            throw new IllegalArgumentException();
        } else if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (cacheTableIdToModel != null) {
            this.paramId = rMNMethodParam;
            this.methodReturnModel = rMNMethodReturnType;
            this.cacheMemIdToModel = cacheTableIdToModel;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(cacheTableIdToModel);
            HashSet hashSet = new HashSet(1);
            hashSet.add(rMNMethodParam);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(rMNMethodReturnType);
            setParameters(arrayList, hashSet, hashSet2);
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
        if (cacheBundleInputGet.getParamValue(this.paramId) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isRemovePreconditionValid(CacheBundleInputRemove cacheBundleInputRemove) {
        if (cacheBundleInputRemove.getParamValue(this.paramId) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void processCacheAdd(CacheBundleInputAdd cacheBundleInputAdd, Object obj, boolean z) {
        this.cacheMemIdToModel.addElement((IJsonCacheableModel) obj, z);
    }

    /* access modifiers changed from: protected */
    public void processCacheClear(CacheBundleInputClear cacheBundleInputClear) {
        this.cacheMemIdToModel.clearElements();
    }

    /* access modifiers changed from: protected */
    public boolean processCacheGet(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput) {
        IJsonCacheableModel iJsonCacheableModel = (IJsonCacheableModel) this.cacheMemIdToModel.getElement(cacheBundleInputGet.getParamValue(this.paramId));
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
        this.cacheMemIdToModel.removeElement(cacheBundleInputRemove.getParamValue(this.paramId));
    }
}
