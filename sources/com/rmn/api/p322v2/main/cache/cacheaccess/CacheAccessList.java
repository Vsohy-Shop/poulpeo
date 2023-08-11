package com.rmn.api.p322v2.main.cache.cacheaccess;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.CacheResponseObject;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputRemove;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableIdToModel;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToIdArray;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToInt;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.json.IJsonCacheableModel;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.cache.cacheaccess.CacheAccessList */
public class CacheAccessList extends BaseCacheAccess {
    private CacheTableIdToModel cacheContent;
    private CacheTableParamsToIdArray cacheReferences;
    private CacheTableParamsToInt cacheTotalCounts;
    private RMNMethodReturnType methodReturnModelArray;
    private RMNMethodReturnType methodReturnTotalCount;

    public CacheAccessList(RMNMethodReturnType rMNMethodReturnType, CacheTableIdToModel cacheTableIdToModel, CacheTableParamsToIdArray cacheTableParamsToIdArray) {
        this(rMNMethodReturnType, (RMNMethodReturnType) null, cacheTableIdToModel, cacheTableParamsToIdArray, (CacheTableParamsToInt) null);
    }

    private boolean hasTotalCount() {
        if (this.methodReturnTotalCount == null || this.cacheTotalCounts == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public RMNMethodReturnType getAddMethodReturn() {
        return this.methodReturnModelArray;
    }

    /* access modifiers changed from: protected */
    public boolean isAddPreconditionValid(CacheBundleInputAdd cacheBundleInputAdd, Object obj) {
        return IJsonCacheableModel[].class.isAssignableFrom(obj.getClass());
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
        IJsonCacheableModel[] iJsonCacheableModelArr = (IJsonCacheableModel[]) obj;
        List<IJsonCacheableModel> asList = Arrays.asList(iJsonCacheableModelArr);
        if (iJsonCacheableModelArr.length != asList.size()) {
            C13633n.m31166v("Found " + (iJsonCacheableModelArr.length - asList.size()) + " null items for processCacheAdd");
        }
        ArrayList arrayList = new ArrayList(iJsonCacheableModelArr.length);
        for (IJsonCacheableModel identifier : asList) {
            arrayList.add(identifier.getIdentifier());
        }
        CacheTableParamsToIdArray cacheTableParamsToIdArray = this.cacheReferences;
        cacheTableParamsToIdArray.addElement(cacheTableParamsToIdArray.newKeyFilter(cacheBundleInputAdd.getParamValues()), arrayList.toArray(new Object[arrayList.size()]), z);
        if (!asList.isEmpty()) {
            this.cacheContent.addElements((Collection<IJsonCacheableModel>) asList, false);
        }
        if (hasTotalCount()) {
            int i = (Integer) cacheBundleInputAdd.getObjectToStore(this.methodReturnTotalCount);
            if (i == null) {
                C13633n.m31163s(this, "No total count in the bundle input for the list adding");
                i = 0;
            }
            CacheTableParamsToInt cacheTableParamsToInt = this.cacheTotalCounts;
            cacheTableParamsToInt.addElement(cacheTableParamsToInt.newKeyFilter(cacheBundleInputAdd.getParamValues()), i, z);
        }
    }

    /* access modifiers changed from: protected */
    public void processCacheClear(CacheBundleInputClear cacheBundleInputClear) {
        this.cacheReferences.clearElements();
        if (hasTotalCount()) {
            this.cacheTotalCounts.clearElements();
        }
    }

    /* access modifiers changed from: protected */
    public boolean processCacheGet(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput) {
        Map map;
        CacheTableParamsToIdArray cacheTableParamsToIdArray = this.cacheReferences;
        Object[] objArr = (Object[]) cacheTableParamsToIdArray.getElement(cacheTableParamsToIdArray.newKeyFilter(cacheBundleInputGet.getParamValues()));
        if (objArr == null) {
            return false;
        }
        List<Object> asList = Arrays.asList(objArr);
        if (objArr.length != asList.size()) {
            C13633n.m31166v("Found " + (objArr.length - asList.size()) + " null items for processCacheGet");
        }
        if (!asList.isEmpty()) {
            map = this.cacheContent.getElements(asList);
            if (map == null || map.isEmpty()) {
                return false;
            }
        } else {
            map = null;
        }
        Object newInstance = Array.newInstance(this.methodReturnModelArray.getReturnType().getComponentType(), asList.size());
        int i = 0;
        for (Object obj : asList) {
            Array.set(newInstance, i, (IJsonCacheableModel) map.get(obj));
            i++;
        }
        CacheResponseObject cacheResponseObject = new CacheResponseObject(this.methodReturnModelArray);
        cacheResponseObject.setResponseObject(newInstance);
        cacheBundleOutput.addResponseObject(this.methodReturnModelArray, cacheResponseObject);
        if (hasTotalCount()) {
            CacheTableParamsToInt cacheTableParamsToInt = this.cacheTotalCounts;
            Integer num = (Integer) cacheTableParamsToInt.getElement(cacheTableParamsToInt.newKeyFilter(cacheBundleInputGet.getParamValues()));
            if (num == null || num.intValue() < 0) {
                num = 0;
            }
            CacheResponseObject cacheResponseObject2 = new CacheResponseObject(this.methodReturnTotalCount);
            cacheResponseObject2.setResponseObject(num);
            cacheBundleOutput.addResponseObject(this.methodReturnTotalCount, cacheResponseObject2);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void processCacheRemove(CacheBundleInputRemove cacheBundleInputRemove) {
        CacheTableParamsToIdArray cacheTableParamsToIdArray = this.cacheReferences;
        cacheTableParamsToIdArray.removeElement(cacheTableParamsToIdArray.newKeyFilter(cacheBundleInputRemove.getParamValues()));
        if (hasTotalCount()) {
            CacheTableParamsToInt cacheTableParamsToInt = this.cacheTotalCounts;
            cacheTableParamsToInt.removeElement(cacheTableParamsToInt.newKeyFilter(cacheBundleInputRemove.getParamValues()));
        }
    }

    public CacheAccessList(RMNMethodReturnType rMNMethodReturnType, RMNMethodReturnType rMNMethodReturnType2, CacheTableIdToModel cacheTableIdToModel, CacheTableParamsToIdArray cacheTableParamsToIdArray, CacheTableParamsToInt cacheTableParamsToInt) {
        if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (cacheTableIdToModel == null) {
            throw new IllegalArgumentException();
        } else if (cacheTableParamsToIdArray != null) {
            Class<?> returnType = rMNMethodReturnType.getReturnType();
            if (returnType == null) {
                throw new IllegalStateException("returnType is null");
            } else if (returnType.isArray()) {
                Class<?> componentType = returnType.getComponentType();
                if (componentType == null) {
                    throw new IllegalStateException("returnArrayType is null");
                } else if (IJsonCacheableModel.class.isAssignableFrom(componentType)) {
                    this.methodReturnModelArray = rMNMethodReturnType;
                    this.methodReturnTotalCount = rMNMethodReturnType2;
                    this.cacheContent = cacheTableIdToModel;
                    this.cacheReferences = cacheTableParamsToIdArray;
                    this.cacheTotalCounts = cacheTableParamsToInt;
                    ArrayList arrayList = new ArrayList(3);
                    arrayList.add(cacheTableIdToModel);
                    arrayList.add(cacheTableParamsToIdArray);
                    Set<RMNMethodParam> cacheParameters = cacheTableParamsToIdArray.getCacheParameters();
                    HashSet hashSet = new HashSet(2);
                    hashSet.add(rMNMethodReturnType);
                    if (hasTotalCount()) {
                        arrayList.add(cacheTableParamsToInt);
                        cacheParameters.addAll(cacheTableParamsToInt.getCacheParameters());
                        hashSet.add(rMNMethodReturnType2);
                    }
                    setParameters(arrayList, cacheParameters, hashSet);
                } else {
                    throw new IllegalStateException("Wrong type for returnArrayType");
                }
            } else {
                throw new IllegalStateException("returnType is not an array");
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
