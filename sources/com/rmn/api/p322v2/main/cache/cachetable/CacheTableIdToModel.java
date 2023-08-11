package com.rmn.api.p322v2.main.cache.cachetable;

import com.rmn.api.p322v2.main.cache.memory.BaseMemoryTableOld;
import com.rmn.api.p322v2.main.cache.memory.MemoryTableDefault;
import com.rmn.api.p322v2.main.cache.memory.MemoryTableModelReference;
import com.rmn.api.p322v2.main.json.IJsonCacheableModel;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.sqlite.KeySQLColumn;
import java.util.Collection;
import java.util.HashMap;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.cache.cachetable.CacheTableIdToModel */
public class CacheTableIdToModel extends BaseCacheTableIdToAny<Object, IJsonCacheableModel> {
    public static final String COLUMN_NAME_ID = "CACHE_id";
    public static final String COLUMN_NAME_MODEL = "CACHE_model";

    public CacheTableIdToModel(int i, Class<?> cls, Class<? extends IJsonCacheableModel> cls2) {
        this(i, cls, cls2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r2 = r0.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        p446vd.C13633n.m31165u(r4, r2);
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.rmn.api.p322v2.main.json.IJsonCacheableModel newContentObject() {
        /*
            r4 = this;
            java.lang.Class r0 = r4.getModelType()
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x000c }
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch:{ Exception -> 0x000c }
            goto L_0x0018
        L_0x000c:
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0013 }
            java.lang.reflect.Constructor r2 = r0.getConstructor(r2)     // Catch:{ Exception -> 0x0013 }
            goto L_0x0018
        L_0x0013:
            r2 = move-exception
            p446vd.C13633n.m31165u(r4, r2)
            r2 = 0
        L_0x0018:
            if (r2 == 0) goto L_0x003b
            boolean r0 = r2.isAccessible()
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ Exception -> 0x0030 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0030 }
            java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0030 }
            com.rmn.api.v2.main.json.IJsonCacheableModel r1 = (com.rmn.api.p322v2.main.json.IJsonCacheableModel) r1     // Catch:{ Exception -> 0x0030 }
            r2.setAccessible(r0)
            return r1
        L_0x002e:
            r1 = move-exception
            goto L_0x0037
        L_0x0030:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002e }
            r3.<init>(r1)     // Catch:{ all -> 0x002e }
            throw r3     // Catch:{ all -> 0x002e }
        L_0x0037:
            r2.setAccessible(r0)
            throw r1
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The class "
            r2.append(r3)
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            java.lang.String r0 = " implementing SQLCacheable must have a default constructor"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.cache.cachetable.CacheTableIdToModel.newContentObject():com.rmn.api.v2.main.json.IJsonCacheableModel");
    }

    public final synchronized void addElement(IJsonCacheableModel iJsonCacheableModel, boolean z) {
        if (iJsonCacheableModel != null) {
            super.addElement(iJsonCacheableModel.getIdentifier(), iJsonCacheableModel, z);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void addElements(IJsonCacheableModel[] iJsonCacheableModelArr, boolean z) {
        if (iJsonCacheableModelArr != null) {
            HashMap hashMap = new HashMap(iJsonCacheableModelArr.length);
            for (IJsonCacheableModel iJsonCacheableModel : iJsonCacheableModelArr) {
                if (iJsonCacheableModel != null) {
                    hashMap.put(iJsonCacheableModel.getIdentifier(), iJsonCacheableModel);
                }
            }
            super.addElements(hashMap, z);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final Class<?> getIdType() {
        return getFromType();
    }

    public final Class<IJsonCacheableModel> getModelType() {
        Class<?> toType = getToType();
        if (IJsonCacheableModel.class.isAssignableFrom(toType)) {
            return toType;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public BaseMemoryTableOld<Object, ?, ?> newMemoryCacheTable() {
        if (AbstractModel.class.isAssignableFrom(getModelType())) {
            return new MemoryTableModelReference();
        }
        return new MemoryTableDefault();
    }

    /* access modifiers changed from: protected */
    public Object unserializeFromAfterSQLRetrieving(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!Number.class.isAssignableFrom(obj.getClass()) || ((Number) obj).intValue() > 0) {
            return obj;
        }
        return null;
    }

    public CacheTableIdToModel(int i, Class<?> cls, Class<? extends IJsonCacheableModel> cls2, int i2) {
        super(cls2, "IdToModel", "content", i, new KeySQLColumn("CACHE_id", cls, 0, true, true), new KeySQLColumn(COLUMN_NAME_MODEL, cls2, i2, false, true));
        newContentObject();
    }

    /* access modifiers changed from: protected */
    public Object serializeToBeforeSQLCaching(IJsonCacheableModel iJsonCacheableModel) {
        return iJsonCacheableModel.serializeToCacheData();
    }

    /* access modifiers changed from: protected */
    public IJsonCacheableModel unserializeToAfterSQLRetrieving(Object obj) {
        IJsonCacheableModel newContentObject = newContentObject();
        try {
            newContentObject.unserializeFromCacheData((String) obj);
            return newContentObject;
        } catch (Exception e) {
            C13633n.m31165u(this, e);
            return null;
        }
    }

    public final synchronized void addElements(Collection<IJsonCacheableModel> collection, boolean z) {
        if (collection != null) {
            HashMap hashMap = new HashMap(collection.size());
            for (IJsonCacheableModel next : collection) {
                hashMap.put(next.getIdentifier(), next);
            }
            super.addElements(hashMap, z);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public Object serializeFromBeforeSQLCaching(Object obj) {
        return obj;
    }
}
