package com.rmn.api.p322v2.main.cache.cachetable;

import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.sqlite.KeySQLColumn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.cache.cachetable.BaseCacheTableParamsToAny */
public abstract class BaseCacheTableParamsToAny<To> extends BaseCacheTable<KeyFilter, To> {
    public static final String COLUMN_PREFIX_PARAM = "param_";
    protected final KeySQLColumn columnTo;
    protected final Map<KeySQLColumn, RMNMethodParam> columnsFrom;

    public BaseCacheTableParamsToAny(Class<?> cls, String str, String str2, int i, Set<RMNMethodParam> set, KeySQLColumn keySQLColumn) {
        super(cls, str, str2, i);
        if (keySQLColumn != null) {
            if (set == null) {
                this.columnsFrom = new HashMap();
            } else {
                this.columnsFrom = new HashMap(set.size());
                for (RMNMethodParam next : set) {
                    String str3 = COLUMN_PREFIX_PARAM + next.getKeyName();
                    for (KeySQLColumn name : this.columnsFrom.keySet()) {
                        if (str3.equals(name.getName())) {
                            throw new IllegalStateException("There are two types with the same name : " + str3);
                        }
                    }
                    this.columnsFrom.put(new KeySQLColumn(str3, next.getParamType(), true, next.isRequired()), next);
                }
            }
            this.columnTo = keySQLColumn;
            return;
        }
        throw new IllegalArgumentException();
    }

    private KeySQLColumn getKeySQLColumn(RMNMethodParam rMNMethodParam) {
        if (rMNMethodParam != null) {
            String str = COLUMN_PREFIX_PARAM + rMNMethodParam.getKeyName();
            Class<?> paramType = rMNMethodParam.getParamType();
            for (KeySQLColumn next : this.columnsFrom.keySet()) {
                if (str.equals(next.getName()) && paramType.equals(next.getType())) {
                    return next;
                }
            }
            return null;
        }
        throw new IllegalArgumentException();
    }

    private Map<KeySQLColumn, Object> newFilterRow(KeyFilter keyFilter) {
        if (keyFilter == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : keyFilter.entrySet()) {
            KeySQLColumn keySQLColumn = getKeySQLColumn((RMNMethodParam) next.getKey());
            if (keySQLColumn != null) {
                Object value = next.getValue();
                if (value == null || keySQLColumn.isCorrectValueType(value)) {
                    hashMap.put(keySQLColumn, value);
                } else {
                    throw new IllegalStateException("Types are not the same : " + value.getClass().getSimpleName() + " - " + keySQLColumn.getType().getSimpleName());
                }
            } else {
                throw new IllegalStateException("Column does't exists for key : " + next.getKey());
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public void checkMemoryRowTo(To to) {
        if (!this.columnTo.isCorrectValueType(to)) {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public To extractTo(Map<KeySQLColumn, Object> map) {
        if (!map.containsKey(this.columnTo)) {
            return null;
        }
        try {
            return unserializeToAfterSQLRetrieving(map.get(this.columnTo));
        } catch (Exception e) {
            C13633n.m31165u(this, e);
            return null;
        }
    }

    public Set<RMNMethodParam> getCacheParameters() {
        return new HashSet(this.columnsFrom.values());
    }

    public Set<KeySQLColumn> getColumnsKeys() {
        HashSet hashSet = new HashSet(this.columnsFrom.keySet());
        hashSet.add(this.columnTo);
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final Class<?> getToType() {
        return this.columnTo.getType();
    }

    public KeyFilter newKeyFilter(Map<RMNMethodParam, Object> map) {
        if (map == null) {
            return new KeyFilter((Map<RMNMethodParam, Object>) null);
        }
        Collection<RMNMethodParam> values = this.columnsFrom.values();
        HashMap hashMap = new HashMap(values.size());
        for (RMNMethodParam next : values) {
            hashMap.put(next, map.get(next));
        }
        return new KeyFilter(hashMap);
    }

    /* access modifiers changed from: protected */
    public Set<KeySQLColumn> newSQLFilterGet() {
        HashSet hashSet = new HashSet(this.columnsFrom.keySet());
        hashSet.add(this.columnTo);
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public List<Map<KeySQLColumn, Object>> newSQLKeysGet(Set<KeyFilter> set) {
        ArrayList arrayList = new ArrayList();
        for (KeyFilter newFilterRow : set) {
            arrayList.add(newFilterRow(newFilterRow));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public abstract Object serializeToBeforeSQLCaching(To to);

    /* access modifiers changed from: protected */
    public abstract To unserializeToAfterSQLRetrieving(Object obj);

    /* access modifiers changed from: protected */
    public void checkMemoryRowFrom(KeyFilter keyFilter) {
        if (keyFilter == null) {
            if (this.columnsFrom.size() > 0) {
                throw new IllegalArgumentException("The filter must not be null if there is param columns");
            }
        } else if (keyFilter.size() == this.columnsFrom.size()) {
            for (RMNMethodParam next : this.columnsFrom.values()) {
                if (!keyFilter.containsKey(next)) {
                    throw new IllegalStateException("Filter doesn't contain the param " + next.getKeyName());
                }
            }
        } else {
            throw new IllegalStateException("The filter must have the same number of parameters than the param colums");
        }
    }

    /* access modifiers changed from: protected */
    public KeyFilter extractFrom(Map<KeySQLColumn, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            RMNMethodParam rMNMethodParam = this.columnsFrom.get((KeySQLColumn) next.getKey());
            if (rMNMethodParam != null) {
                hashMap.put(rMNMethodParam, next.getValue());
            }
        }
        return new KeyFilter(hashMap);
    }

    /* access modifiers changed from: protected */
    public Map<KeySQLColumn, Object> newSQLRowAdd(KeyFilter keyFilter, To to) {
        try {
            Object serializeToBeforeSQLCaching = serializeToBeforeSQLCaching(to);
            Map<KeySQLColumn, Object> newFilterRow = newFilterRow(keyFilter);
            newFilterRow.put(this.columnTo, serializeToBeforeSQLCaching);
            return newFilterRow;
        } catch (Exception e) {
            C13633n.m31165u(this, e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Map<KeySQLColumn, Object> newSQLRowRemove(KeyFilter keyFilter) {
        return newFilterRow(keyFilter);
    }
}
