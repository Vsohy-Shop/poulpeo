package com.rmn.api.p322v2.main.cache.cachebundleinput;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.rmn.api.v2.main.cache.cachebundleinput.CacheBundleInputAdd */
public class CacheBundleInputAdd extends CacheBundleInputGet {
    private AddOption addOption;
    private Map<RMNMethodReturnType, Object> objectsToStore = new HashMap();

    /* renamed from: com.rmn.api.v2.main.cache.cachebundleinput.CacheBundleInputAdd$AddOption */
    public enum AddOption {
        REPLACE_IF_EXISTING,
        IGNORE_IF_EXISTING
    }

    public CacheBundleInputAdd(ContextContainer contextContainer, ICacheMethodType iCacheMethodType, AddOption addOption2) {
        super(contextContainer, iCacheMethodType);
        if (addOption2 != null) {
            this.addOption = addOption2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void addObjectToStore(RMNMethodReturnType rMNMethodReturnType, Object obj) {
        if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (obj == null) {
            throw new IllegalArgumentException();
        } else if (!getMethodType().getCache(getContextContainer()).hasMethodReturn(rMNMethodReturnType)) {
            throw new IllegalArgumentException("The methodType cache has no return " + rMNMethodReturnType.getKeyName());
        } else if (this.objectsToStore.containsKey(rMNMethodReturnType)) {
            throw new IllegalArgumentException("The object for the methodReturn " + rMNMethodReturnType.getKeyName() + " has already been added to the bundle");
        } else if (rMNMethodReturnType.isCorrectValueType(obj.getClass())) {
            this.objectsToStore.put(rMNMethodReturnType, obj);
        } else {
            throw new IllegalArgumentException("The type is incorrect in cache bundle : " + obj.getClass() + " - must be : " + rMNMethodReturnType.getReturnType());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        CacheBundleInputAdd cacheBundleInputAdd = (CacheBundleInputAdd) obj;
        Map<RMNMethodReturnType, Object> map = this.objectsToStore;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                RMNMethodReturnType rMNMethodReturnType = (RMNMethodReturnType) next.getKey();
                if (rMNMethodReturnType != null) {
                    Object value = next.getValue();
                    Object obj2 = cacheBundleInputAdd.objectsToStore.get(rMNMethodReturnType);
                    if (value == null) {
                        if (obj2 != null) {
                            return false;
                        }
                    } else if (!value.equals(obj2)) {
                        return false;
                    }
                }
            }
        } else if (cacheBundleInputAdd.objectsToStore != null) {
            return false;
        }
        return true;
    }

    public AddOption getAddOption() {
        return this.addOption;
    }

    public Object getObjectToStore(RMNMethodReturnType rMNMethodReturnType) {
        if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (getMethodType().getCache(getContextContainer()).hasMethodReturn(rMNMethodReturnType)) {
            return this.objectsToStore.get(rMNMethodReturnType);
        } else {
            throw new IllegalArgumentException("The methodType cache " + getMethodType() + " has no return : " + rMNMethodReturnType.getKeyName() + " type " + rMNMethodReturnType.getReturnType().getSimpleName());
        }
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        Map<RMNMethodReturnType, Object> map = this.objectsToStore;
        if (map == null) {
            i = 0;
        } else {
            i = map.hashCode();
        }
        return hashCode + i;
    }
}
