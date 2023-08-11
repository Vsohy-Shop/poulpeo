package com.rmn.api.p322v2.main.cache.cachebundleinput;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.rmn.api.v2.main.cache.cachebundleinput.CacheBundleInputGet */
public class CacheBundleInputGet extends AbstractCacheBundleInput {
    private Map<RMNMethodParam, Object> args = new HashMap();

    public CacheBundleInputGet(ContextContainer contextContainer, ICacheMethodType iCacheMethodType) {
        super(contextContainer, iCacheMethodType);
    }

    public final void addParamValue(RMNMethodParam rMNMethodParam, Object obj) {
        if (rMNMethodParam == null) {
            throw new IllegalArgumentException();
        } else if (obj == null) {
            throw new IllegalArgumentException();
        } else if (getMethodType().getCache(getContextContainer()).hasParam(rMNMethodParam)) {
            this.args.put(rMNMethodParam, rMNMethodParam.formatValueForCache(obj));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void addParamValues(Map<RMNMethodParam, Object> map) {
        if (map != null) {
            ICacheMethodType methodType = getMethodType();
            HashMap hashMap = new HashMap();
            for (Map.Entry next : map.entrySet()) {
                RMNMethodParam rMNMethodParam = (RMNMethodParam) next.getKey();
                Object value = next.getValue();
                if (rMNMethodParam == null) {
                    throw new IllegalArgumentException();
                } else if (value == null) {
                    throw new IllegalArgumentException();
                } else if (methodType.getCache(getContextContainer()).hasParam(rMNMethodParam)) {
                    hashMap.put(rMNMethodParam, rMNMethodParam.formatValueForCache(value));
                }
            }
            this.args.putAll(hashMap);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void clearParamValues() {
        this.args.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheBundleInputGet cacheBundleInputGet = (CacheBundleInputGet) obj;
        Map<RMNMethodParam, Object> map = this.args;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                RMNMethodParam rMNMethodParam = (RMNMethodParam) next.getKey();
                if (rMNMethodParam != null) {
                    Object value = next.getValue();
                    Object obj2 = cacheBundleInputGet.args.get(rMNMethodParam);
                    if (value == null) {
                        if (obj2 != null) {
                            return false;
                        }
                    } else if (!value.equals(obj2)) {
                        return false;
                    }
                }
            }
        } else if (cacheBundleInputGet.args != null) {
            return false;
        }
        return true;
    }

    public final Object getParamValue(RMNMethodParam rMNMethodParam) {
        if (rMNMethodParam != null) {
            return this.args.get(rMNMethodParam);
        }
        throw new IllegalArgumentException();
    }

    public final Map<RMNMethodParam, Object> getParamValues() {
        return new HashMap(this.args);
    }

    public int hashCode() {
        int i;
        Map<RMNMethodParam, Object> map = this.args;
        if (map == null) {
            i = 0;
        } else {
            i = map.hashCode();
        }
        return 31 + i;
    }

    public final void removeParamValue(RMNMethodParam rMNMethodParam) {
        if (rMNMethodParam == null) {
            throw new IllegalArgumentException();
        } else if (this.args.containsKey(rMNMethodParam)) {
            this.args.remove(rMNMethodParam);
        }
    }
}
