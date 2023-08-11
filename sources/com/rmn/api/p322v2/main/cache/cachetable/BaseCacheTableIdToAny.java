package com.rmn.api.p322v2.main.cache.cachetable;

import com.rmn.api.p322v2.main.sqlite.KeySQLColumn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.cache.cachetable.BaseCacheTableIdToAny */
public abstract class BaseCacheTableIdToAny<From, To> extends BaseCacheTable<From, To> {
    protected final KeySQLColumn columnFrom;
    protected final KeySQLColumn columnTo;

    public BaseCacheTableIdToAny(Class<?> cls, String str, String str2, int i, KeySQLColumn keySQLColumn, KeySQLColumn keySQLColumn2) {
        super(cls, str, str2, i);
        if (keySQLColumn == null) {
            throw new IllegalArgumentException();
        } else if (keySQLColumn2 != null) {
            this.columnFrom = keySQLColumn;
            this.columnTo = keySQLColumn2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public void checkMemoryRowFrom(From from) {
        if (!this.columnFrom.isCorrectValueType(from)) {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public void checkMemoryRowTo(To to) {
        if (!this.columnTo.isCorrectValueType(to)) {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public From extractFrom(Map<KeySQLColumn, Object> map) {
        if (!map.containsKey(this.columnFrom)) {
            return null;
        }
        try {
            return unserializeFromAfterSQLRetrieving(map.get(this.columnFrom));
        } catch (Exception e) {
            C13633n.m31165u(this, e);
            return null;
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

    public final Set<KeySQLColumn> getColumnsKeys() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.columnFrom);
        hashSet.add(this.columnTo);
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final Class<?> getFromType() {
        return this.columnFrom.getType();
    }

    /* access modifiers changed from: protected */
    public final Class<?> getToType() {
        return this.columnTo.getType();
    }

    /* access modifiers changed from: protected */
    public Set<KeySQLColumn> newSQLFilterGet() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.columnFrom);
        hashSet.add(this.columnTo);
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public List<Map<KeySQLColumn, Object>> newSQLKeysGet(Set<From> set) {
        ArrayList arrayList = new ArrayList();
        for (From next : set) {
            HashMap hashMap = new HashMap();
            hashMap.put(this.columnFrom, next);
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public Map<KeySQLColumn, Object> newSQLRowAdd(From from, To to) {
        HashMap hashMap = new HashMap();
        try {
            Object serializeFromBeforeSQLCaching = serializeFromBeforeSQLCaching(from);
            try {
                Object serializeToBeforeSQLCaching = serializeToBeforeSQLCaching(to);
                hashMap.put(this.columnFrom, serializeFromBeforeSQLCaching);
                hashMap.put(this.columnTo, serializeToBeforeSQLCaching);
                return hashMap;
            } catch (Exception e) {
                C13633n.m31165u(this, e);
                return hashMap;
            }
        } catch (Exception e2) {
            C13633n.m31165u(this, e2);
            return hashMap;
        }
    }

    /* access modifiers changed from: protected */
    public Map<KeySQLColumn, Object> newSQLRowRemove(From from) {
        HashMap hashMap = new HashMap();
        hashMap.put(this.columnFrom, from);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public abstract Object serializeFromBeforeSQLCaching(From from);

    /* access modifiers changed from: protected */
    public abstract Object serializeToBeforeSQLCaching(To to);

    /* access modifiers changed from: protected */
    public abstract From unserializeFromAfterSQLRetrieving(Object obj);

    /* access modifiers changed from: protected */
    public abstract To unserializeToAfterSQLRetrieving(Object obj);
}
