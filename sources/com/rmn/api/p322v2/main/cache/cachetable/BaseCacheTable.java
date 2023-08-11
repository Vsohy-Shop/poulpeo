package com.rmn.api.p322v2.main.cache.cachetable;

import com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL;
import com.rmn.api.p322v2.main.cache.memory.BaseMemoryTableOld;
import com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper;
import com.rmn.api.p322v2.main.sqlite.KeySQLColumn;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.cache.cachetable.BaseCacheTable */
public abstract class BaseCacheTable<From, To> {
    private DataSourceSQL datasource;
    private int lifeTimeInHours;
    private BaseMemoryTableOld<From, To, ?> memoryTable;
    private String tableName;

    public BaseCacheTable(Class<?> cls, String str, String str2, int i) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (str2 == null || str2.equals("")) {
            throw new IllegalArgumentException();
        } else if (i >= 0) {
            this.tableName = cls.getSimpleName() + "_" + str + "_" + str2;
            this.lifeTimeInHours = i;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void addElement(From from, To to, boolean z) {
        if (from != null) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(from, to);
            addElements(hashMap, z);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void addElements(Map<From, To> map, boolean z) {
        if (map != null) {
            HashSet hashSet = new HashSet(map.size());
            for (Map.Entry next : map.entrySet()) {
                Object key = next.getKey();
                Object value = next.getValue();
                if (value != null) {
                    checkMemoryRowFrom(key);
                    checkMemoryRowTo(value);
                    if (!z || !this.memoryTable.containsKey(key)) {
                        hashSet.add(key);
                        this.memoryTable.put(key, value);
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            if (hasDatasource()) {
                ArrayList arrayList = new ArrayList();
                for (Object next2 : hashSet) {
                    Map<KeySQLColumn, Object> newSQLRowAdd = newSQLRowAdd(next2, map.get(next2));
                    if (newSQLRowAdd != null) {
                        arrayList.add(newSQLRowAdd);
                    }
                }
                if (!arrayList.isEmpty()) {
                    getDatasource().insertOrUpdateContent(arrayList);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public abstract void checkMemoryRowFrom(From from);

    /* access modifiers changed from: protected */
    public abstract void checkMemoryRowTo(To to);

    public final synchronized void clearElements() {
        this.memoryTable.clear();
        if (hasDatasource()) {
            getDatasource().clearContent();
        }
    }

    /* access modifiers changed from: protected */
    public abstract From extractFrom(Map<KeySQLColumn, Object> map);

    /* access modifiers changed from: protected */
    public abstract To extractTo(Map<KeySQLColumn, Object> map);

    public abstract Set<KeySQLColumn> getColumnsKeys();

    public DataSourceSQL getDatasource() {
        DataSourceSQL dataSourceSQL = this.datasource;
        if (dataSourceSQL != null) {
            return dataSourceSQL;
        }
        throw new IllegalStateException("Cache table not initialized");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized To getElement(From r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0032
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0030 }
            r1 = 1
            r0.<init>(r1)     // Catch:{ all -> 0x0030 }
            r0.add(r3)     // Catch:{ all -> 0x0030 }
            java.util.Map r3 = r2.getElements(r0)     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x002d
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0019
            goto L_0x002d
        L_0x0019:
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x0030 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0030 }
            java.lang.Object r3 = r3.next()     // Catch:{ all -> 0x0030 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0030 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0030 }
            monitor-exit(r2)
            return r3
        L_0x002d:
            monitor-exit(r2)
            r3 = 0
            return r3
        L_0x0030:
            r3 = move-exception
            goto L_0x0038
        L_0x0032:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0030 }
            r3.<init>()     // Catch:{ all -> 0x0030 }
            throw r3     // Catch:{ all -> 0x0030 }
        L_0x0038:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.cache.cachetable.BaseCacheTable.getElement(java.lang.Object):java.lang.Object");
    }

    public synchronized Map<From, To> getElements(From[] fromArr) {
        if (fromArr != null) {
        } else {
            throw new IllegalArgumentException();
        }
        return getElements(Arrays.asList(fromArr));
    }

    public final synchronized To getFirstElement() {
        if (!this.memoryTable.isEmpty()) {
            return this.memoryTable.getFirst();
        } else if (!hasDatasource()) {
            return null;
        } else {
            List<Map<KeySQLColumn, Object>> selectContent = getDatasource().selectContent((Map<KeySQLColumn, Object>) new HashMap(), newSQLFilterGet(), (KeySQLColumn) null);
            if (selectContent == null) {
                return null;
            }
            if (selectContent.isEmpty()) {
                return null;
            }
            Map map = selectContent.get(0);
            if (map == null) {
                return null;
            }
            Object extractFrom = extractFrom(map);
            if (extractFrom == null) {
                return null;
            }
            To extractTo = extractTo(map);
            if (extractTo == null) {
                return null;
            }
            this.memoryTable.put(extractFrom, extractTo);
            return extractTo;
        }
    }

    public boolean hasDatasource() {
        if (this.datasource != null) {
            return true;
        }
        return false;
    }

    public void init(ContextContainer contextContainer, BaseDatabaseHelper baseDatabaseHelper) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (baseDatabaseHelper == null) {
            throw new IllegalArgumentException();
        } else if (this.datasource == null) {
            this.memoryTable = newMemoryCacheTable();
            this.datasource = new DataSourceSQL(contextContainer, baseDatabaseHelper, this.tableName, getColumnsKeys(), this.lifeTimeInHours);
        }
    }

    /* access modifiers changed from: protected */
    public abstract BaseMemoryTableOld<From, ?, ?> newMemoryCacheTable();

    /* access modifiers changed from: protected */
    public abstract Set<KeySQLColumn> newSQLFilterGet();

    /* access modifiers changed from: protected */
    public abstract List<Map<KeySQLColumn, Object>> newSQLKeysGet(Set<From> set);

    /* access modifiers changed from: protected */
    public abstract Map<KeySQLColumn, Object> newSQLRowAdd(From from, To to);

    /* access modifiers changed from: protected */
    public abstract Map<KeySQLColumn, Object> newSQLRowRemove(From from);

    public final synchronized void removeElement(From from) {
        if (from != null) {
            checkMemoryRowFrom(from);
            if (this.memoryTable.containsKey(from)) {
                this.memoryTable.remove(from);
                if (hasDatasource()) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(newSQLRowRemove(from));
                    getDatasource().deleteContent(arrayList);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public synchronized Map<From, To> getElements(Collection<From> collection) {
        if (collection != null) {
            try {
                if (!collection.isEmpty()) {
                    HashSet hashSet = new HashSet(collection);
                    HashSet hashSet2 = new HashSet();
                    HashMap hashMap = new HashMap();
                    for (Object next : hashSet) {
                        if (next != null) {
                            checkMemoryRowFrom(next);
                            if (this.memoryTable.containsKey(next)) {
                                hashMap.put(next, this.memoryTable.get(next));
                            } else {
                                hashSet2.add(next);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    if (hashSet2.isEmpty()) {
                        return hashMap;
                    }
                    if (!hasDatasource()) {
                        return hashMap;
                    }
                    List<Map<KeySQLColumn, Object>> selectContent = getDatasource().selectContent(newSQLKeysGet(hashSet2), newSQLFilterGet(), (KeySQLColumn) null);
                    if (selectContent == null) {
                        return hashMap;
                    }
                    if (selectContent.isEmpty()) {
                        return null;
                    }
                    if (selectContent.size() != hashSet2.size()) {
                        C13633n.m31163s(this, "Incorrect number of retrieved objects : " + selectContent.size() + " => " + hashSet2.size());
                    }
                    for (Map next2 : selectContent) {
                        if (next2 != null) {
                            Object extractFrom = extractFrom(next2);
                            if (extractFrom == null) {
                                return null;
                            }
                            Object extractTo = extractTo(next2);
                            if (extractTo == null) {
                                return null;
                            }
                            this.memoryTable.put(extractFrom, extractTo);
                            hashMap.put(extractFrom, this.memoryTable.get(extractFrom));
                        }
                    }
                    return hashMap;
                }
                throw new IllegalArgumentException();
            } finally {
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
