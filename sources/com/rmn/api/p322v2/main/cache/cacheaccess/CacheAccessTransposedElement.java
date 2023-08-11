package com.rmn.api.p322v2.main.cache.cacheaccess;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.CacheResponseObject;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputRemove;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableIdToId;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableIdToModel;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.json.IJsonCacheableModel;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.main.cache.cacheaccess.CacheAccessTransposedElement */
public class CacheAccessTransposedElement extends BaseCacheAccess {
    private CacheTableIdToId cacheMemIdToId;
    private CacheTableIdToModel cacheMemIdToModel;
    private RMNMethodReturnType methodReturnModel;
    private RMNMethodParam paramId;

    public CacheAccessTransposedElement(RMNMethodParam rMNMethodParam, RMNMethodReturnType rMNMethodReturnType, CacheTableIdToModel cacheTableIdToModel, CacheTableIdToId cacheTableIdToId) {
        if (rMNMethodParam == null) {
            throw new IllegalArgumentException();
        } else if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (cacheTableIdToModel == null) {
            throw new IllegalArgumentException();
        } else if (cacheTableIdToId != null) {
            this.paramId = rMNMethodParam;
            this.methodReturnModel = rMNMethodReturnType;
            this.cacheMemIdToModel = cacheTableIdToModel;
            this.cacheMemIdToId = cacheTableIdToId;
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(cacheTableIdToModel);
            arrayList.add(cacheTableIdToId);
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
        if (!IJsonCacheableModel.class.isAssignableFrom(obj.getClass()) || cacheBundleInputAdd.getParamValue(this.paramId) == null) {
            return false;
        }
        return true;
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
        IJsonCacheableModel iJsonCacheableModel = (IJsonCacheableModel) obj;
        this.cacheMemIdToModel.addElement(iJsonCacheableModel, z);
        this.cacheMemIdToId.addElement(cacheBundleInputAdd.getParamValue(this.paramId), iJsonCacheableModel.getIdentifier(), z);
    }

    /* access modifiers changed from: protected */
    public void processCacheClear(CacheBundleInputClear cacheBundleInputClear) {
        this.cacheMemIdToId.clearElements();
    }

    /* access modifiers changed from: protected */
    public boolean processCacheGet(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput) {
        IJsonCacheableModel iJsonCacheableModel;
        Object element = this.cacheMemIdToId.getElement(cacheBundleInputGet.getParamValue(this.paramId));
        if (element == null || (iJsonCacheableModel = (IJsonCacheableModel) this.cacheMemIdToModel.getElement(element)) == null) {
            return false;
        }
        CacheResponseObject cacheResponseObject = new CacheResponseObject(this.methodReturnModel);
        cacheResponseObject.setResponseObject(iJsonCacheableModel);
        cacheBundleOutput.addResponseObject(this.methodReturnModel, cacheResponseObject);
        return true;
    }

    /* access modifiers changed from: protected */
    public void processCacheRemove(CacheBundleInputRemove cacheBundleInputRemove) {
        this.cacheMemIdToId.removeElement(cacheBundleInputRemove.getParamValue(this.paramId));
    }
}
