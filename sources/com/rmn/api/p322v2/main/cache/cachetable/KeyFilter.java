package com.rmn.api.p322v2.main.cache.cachetable;

import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.rmn.api.v2.main.cache.cachetable.KeyFilter */
public class KeyFilter {
    private final Map<RMNMethodParam, Object> filter;

    public KeyFilter(Map<RMNMethodParam, Object> map) {
        if (map == null) {
            this.filter = new HashMap();
        } else {
            this.filter = new HashMap(map);
        }
    }

    public boolean containsKey(RMNMethodParam rMNMethodParam) {
        return this.filter.containsKey(rMNMethodParam);
    }

    public Set<Map.Entry<RMNMethodParam, Object>> entrySet() {
        return new HashSet(this.filter.entrySet());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyFilter)) {
            return false;
        }
        KeyFilter keyFilter = (KeyFilter) obj;
        if (!this.filter.equals(keyFilter.filter) || this.filter.size() != keyFilter.filter.size()) {
            return false;
        }
        for (Map.Entry next : this.filter.entrySet()) {
            RMNMethodParam rMNMethodParam = (RMNMethodParam) next.getKey();
            if (!keyFilter.filter.containsKey(rMNMethodParam)) {
                return false;
            }
            Object value = next.getValue();
            Object obj2 = keyFilter.filter.get(rMNMethodParam);
            if (value == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (!value.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public Object get(RMNMethodParam rMNMethodParam) {
        return this.filter.get(rMNMethodParam);
    }

    public int hashCode() {
        return this.filter.hashCode();
    }

    public boolean isEmpty() {
        return this.filter.isEmpty();
    }

    public Set<RMNMethodParam> keySet() {
        return new HashSet(this.filter.keySet());
    }

    public int size() {
        return this.filter.size();
    }
}
