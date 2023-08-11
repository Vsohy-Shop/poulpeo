package com.rmn.api.p322v2.main.cache.datasource;

import com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper;
import com.rmn.api.p322v2.main.sqlite.DatabaseManager;
import com.rmn.api.p322v2.main.sqlite.IDatasourceSQL;
import com.rmn.api.p322v2.main.sqlite.KeySQLColumn;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.rmn.api.v2.main.cache.datasource.DataSourceSQL */
public final class DataSourceSQL implements IDatasourceSQL {
    private final Set<KeySQLColumn> columnsKeys;
    private final BaseDatabaseHelper helper;
    private final long lifetimeInMs;
    private final String tableName;

    public DataSourceSQL(ContextContainer contextContainer, BaseDatabaseHelper baseDatabaseHelper, String str, Set<KeySQLColumn> set, int i) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (baseDatabaseHelper == null) {
            throw new IllegalArgumentException();
        } else if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (set == null) {
            throw new IllegalArgumentException();
        } else if (set.size() > 0) {
            this.helper = baseDatabaseHelper;
            this.tableName = getFormattedTableName(str);
            this.columnsKeys = new HashSet(set);
            long j = ((long) i) * 3600 * 1000;
            this.lifetimeInMs = j;
            if (j <= 0) {
                throw new IllegalStateException("Lifetime table is negative " + str);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static String getFormattedTableName(String str) {
        if (!str.startsWith("[")) {
            str = "[" + str;
        }
        if (str.endsWith("]")) {
            return str;
        }
        return str + "]";
    }

    public void clearContent() {
        clearContent((SQLiteDatabaseWrapper) null);
    }

    public void createTableIfExists(SQLiteDatabaseWrapper sQLiteDatabaseWrapper) {
        boolean z;
        if (sQLiteDatabaseWrapper != null) {
            Iterator<KeySQLColumn> it = this.columnsKeys.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().isNotNull()) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                String sQLRequestCreateTableIfNotExists = DatabaseManager.getSQLRequestCreateTableIfNotExists(this.tableName, new HashSet(this.columnsKeys));
                synchronized (DataSourceSQL.class) {
                    sQLiteDatabaseWrapper.mo47856c(sQLRequestCreateTableIfNotExists);
                }
                return;
            }
            throw new IllegalStateException("All columns can be null, you mut define at least one KeySQLColumn not null : " + this.tableName);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|(2:34|35)|36|37) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:20|21|(2:22|23)|27|28|29|30|31|32) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0045 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0067 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0021=Splitter:B:17:0x0021, B:29:0x0045=Splitter:B:29:0x0045, B:36:0x0067=Splitter:B:36:0x0067} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deleteContent(java.util.List<java.util.Map<com.rmn.api.p322v2.main.sqlite.KeySQLColumn, java.lang.Object>> r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x006b
            int r0 = r6.size()
            if (r0 > 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Class<com.rmn.api.v2.main.cache.datasource.DataSourceSQL> r0 = com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL.class
            monitor-enter(r0)
            r1 = 0
            com.rmn.api.v2.main.sqlite.BaseDatabaseHelper r2 = r5.helper     // Catch:{ Exception -> 0x0016 }
            com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper r1 = r2.getWritableDatabaseWrapper()     // Catch:{ Exception -> 0x0016 }
            goto L_0x001a
        L_0x0014:
            r6 = move-exception
            goto L_0x0062
        L_0x0016:
            r2 = move-exception
            p446vd.C13633n.m31165u(r5, r2)     // Catch:{ all -> 0x0014 }
        L_0x001a:
            if (r1 != 0) goto L_0x0023
            if (r1 == 0) goto L_0x0021
            r1.mo47854a()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            return
        L_0x0023:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0014 }
            r2.<init>()     // Catch:{ all -> 0x0014 }
            java.lang.String r6 = com.rmn.api.p322v2.main.sqlite.DatabaseManager.getWhereClauseAndFillArgs((java.util.List<java.util.Map<com.rmn.api.p322v2.main.sqlite.KeySQLColumn, java.lang.Object>>) r6, (java.util.List<java.lang.String>) r2)     // Catch:{ all -> 0x0014 }
            java.lang.String r3 = r5.tableName     // Catch:{ Exception -> 0x003e }
            int r4 = r2.size()     // Catch:{ Exception -> 0x003e }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x003e }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ Exception -> 0x003e }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x003e }
            r1.mo47855b(r3, r6, r2)     // Catch:{ Exception -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r6 = move-exception
            p446vd.C13633n.m31165u(r5, r6)     // Catch:{ all -> 0x0014 }
        L_0x0042:
            r1.mo47854a()     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r6.<init>()     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "DATASOURCE "
            r6.append(r1)     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = r5.tableName     // Catch:{ all -> 0x0068 }
            r6.append(r1)     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = " delete"
            r6.append(r1)     // Catch:{ all -> 0x0068 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0068 }
            p446vd.C13633n.m31145a(r5, r6)     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            return
        L_0x0062:
            if (r1 == 0) goto L_0x0067
            r1.mo47854a()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            throw r6     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            throw r6
        L_0x006b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL.deleteContent(java.util.List):void");
    }

    public void dropTableIfExists(SQLiteDatabaseWrapper sQLiteDatabaseWrapper) {
        if (sQLiteDatabaseWrapper != null) {
            String sQLRequestDropTableIfExists = DatabaseManager.getSQLRequestDropTableIfExists(this.tableName);
            synchronized (DataSourceSQL.class) {
                sQLiteDatabaseWrapper.mo47856c(sQLRequestDropTableIfExists);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public long getColumnsChecksum() {
        int hashCode = this.tableName.hashCode() + 31;
        HashMap hashMap = new HashMap();
        for (KeySQLColumn next : this.columnsKeys) {
            hashMap.put(next.getName(), next);
        }
        ArrayList<String> arrayList = new ArrayList<>(hashMap.keySet());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            hashCode = (hashCode * 31) + ((KeySQLColumn) hashMap.get(str)).getColumnCheckSum();
        }
        return (long) hashCode;
    }

    public long getLifetimeInMs() {
        return this.lifetimeInMs;
    }

    public String getTableName() {
        return this.tableName;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:(2:28|29)|30|31|32) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:63|64)|65|66) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:33|34|(4:37|(2:39|78)(5:40|(6:43|44|45|82|81|41)|49|50|79)|77|35)|54|55|56|57|58|59) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00ef */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0074=Splitter:B:30:0x0074, B:56:0x00cb=Splitter:B:56:0x00cb, B:65:0x00ef=Splitter:B:65:0x00ef} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void insertOrUpdateContent(java.util.List<java.util.Map<com.rmn.api.p322v2.main.sqlite.KeySQLColumn, java.lang.Object>> r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00f3
            int r0 = r9.size()
            if (r0 > 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Class<com.rmn.api.v2.main.cache.datasource.DataSourceSQL> r0 = com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00f0 }
            int r2 = r9.size()     // Catch:{ all -> 0x00f0 }
            r1.<init>(r2)     // Catch:{ all -> 0x00f0 }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x00f0 }
        L_0x0019:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00f0 }
            if (r3 == 0) goto L_0x005a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00f0 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x00f0 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x00f0 }
            int r5 = r3.size()     // Catch:{ all -> 0x00f0 }
            r4.<init>(r5)     // Catch:{ all -> 0x00f0 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x00f0 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00f0 }
        L_0x0036:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00f0 }
            if (r5 == 0) goto L_0x0056
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00f0 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00f0 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ all -> 0x00f0 }
            com.rmn.api.v2.main.sqlite.KeySQLColumn r6 = (com.rmn.api.p322v2.main.sqlite.KeySQLColumn) r6     // Catch:{ all -> 0x00f0 }
            boolean r7 = r6.isPrimaryKey()     // Catch:{ all -> 0x00f0 }
            if (r7 == 0) goto L_0x0036
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x00f0 }
            r4.put(r6, r5)     // Catch:{ all -> 0x00f0 }
            goto L_0x0036
        L_0x0056:
            r1.add(r4)     // Catch:{ all -> 0x00f0 }
            goto L_0x0019
        L_0x005a:
            r8.deleteContent(r1)     // Catch:{ all -> 0x00f0 }
            r1 = 0
            com.rmn.api.v2.main.sqlite.BaseDatabaseHelper r2 = r8.helper     // Catch:{ Exception -> 0x0068 }
            com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper r2 = r2.getWritableDatabaseWrapper()     // Catch:{ Exception -> 0x0068 }
            goto L_0x006d
        L_0x0065:
            r9 = move-exception
            goto L_0x00ea
        L_0x0068:
            r2 = move-exception
            p446vd.C13633n.m31165u(r8, r2)     // Catch:{ all -> 0x0065 }
            r2 = r1
        L_0x006d:
            if (r2 != 0) goto L_0x0076
            if (r2 == 0) goto L_0x0074
            r2.mo47854a()     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            monitor-exit(r0)     // Catch:{ all -> 0x00f0 }
            return
        L_0x0076:
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x00e8 }
        L_0x007a:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r3 == 0) goto L_0x00c8
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x00e8 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x00e8 }
            if (r3 != 0) goto L_0x0089
            goto L_0x007a
        L_0x0089:
            com.rmn.iosadapters.android.content.ContentValuesWrapper r4 = new com.rmn.iosadapters.android.content.ContentValuesWrapper     // Catch:{ all -> 0x00e8 }
            r4.<init>()     // Catch:{ all -> 0x00e8 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x00e8 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00e8 }
        L_0x0096:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r5 == 0) goto L_0x00bd
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00e8 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00e8 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ all -> 0x00e8 }
            com.rmn.api.v2.main.sqlite.KeySQLColumn r6 = (com.rmn.api.p322v2.main.sqlite.KeySQLColumn) r6     // Catch:{ all -> 0x00e8 }
            com.rmn.api.v2.main.sqlite.SQLType r7 = r6.getSqlType()     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x00b8 }
            r7.addValue(r4, r6, r5)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x0096
        L_0x00b8:
            r5 = move-exception
            p446vd.C13633n.m31151g(r8, r5)     // Catch:{ all -> 0x00e8 }
            goto L_0x0096
        L_0x00bd:
            java.lang.String r3 = r8.tableName     // Catch:{ Exception -> 0x00c3 }
            r2.mo47861h(r3, r1, r4)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x007a
        L_0x00c3:
            r3 = move-exception
            p446vd.C13633n.m31165u(r8, r3)     // Catch:{ all -> 0x00e8 }
            goto L_0x007a
        L_0x00c8:
            r2.mo47854a()     // Catch:{ Exception -> 0x00cb }
        L_0x00cb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            r9.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = "DATASOURCE "
            r9.append(r1)     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = r8.tableName     // Catch:{ all -> 0x00f0 }
            r9.append(r1)     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = " insert or update"
            r9.append(r1)     // Catch:{ all -> 0x00f0 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00f0 }
            p446vd.C13633n.m31145a(r8, r9)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f0 }
            return
        L_0x00e8:
            r9 = move-exception
            r1 = r2
        L_0x00ea:
            if (r1 == 0) goto L_0x00ef
            r1.mo47854a()     // Catch:{ Exception -> 0x00ef }
        L_0x00ef:
            throw r9     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f0 }
            throw r9
        L_0x00f3:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL.insertOrUpdateContent(java.util.List):void");
    }

    public List<Map<KeySQLColumn, Object>> selectContent(Map<KeySQLColumn, Object> map, Set<KeySQLColumn> set, KeySQLColumn keySQLColumn) {
        if (map != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(map);
            return selectContent((List<Map<KeySQLColumn, Object>>) arrayList, set, keySQLColumn);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|(2:37|38)|39|40) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(2:23|24)|(2:29|30)|31|32|33|34) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0027=Splitter:B:19:0x0027, B:31:0x003b=Splitter:B:31:0x003b, B:39:0x005f=Splitter:B:39:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clearContent(com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x000b
            boolean r0 = r5.mo47858e()
            if (r0 != 0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = 0
            goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            java.lang.Class<com.rmn.api.v2.main.cache.datasource.DataSourceSQL> r1 = com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL.class
            monitor-enter(r1)
            if (r0 == 0) goto L_0x001e
            com.rmn.api.v2.main.sqlite.BaseDatabaseHelper r2 = r4.helper     // Catch:{ Exception -> 0x001a }
            com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper r5 = r2.getWritableDatabaseWrapper()     // Catch:{ Exception -> 0x001a }
            goto L_0x001e
        L_0x0018:
            r2 = move-exception
            goto L_0x0058
        L_0x001a:
            r2 = move-exception
            p446vd.C13633n.m31165u(r4, r2)     // Catch:{ all -> 0x0018 }
        L_0x001e:
            if (r5 != 0) goto L_0x002b
            if (r0 == 0) goto L_0x0027
            if (r5 == 0) goto L_0x0027
            r5.mo47854a()     // Catch:{ Exception -> 0x0027 }
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r5 = move-exception
            goto L_0x0060
        L_0x002b:
            java.lang.String r2 = r4.tableName     // Catch:{ Exception -> 0x0032 }
            r3 = 0
            r5.mo47855b(r2, r3, r3)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r2 = move-exception
            p446vd.C13633n.m31165u(r4, r2)     // Catch:{ all -> 0x0018 }
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r5.mo47854a()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r5.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = "DATASOURCE "
            r5.append(r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = r4.tableName     // Catch:{ all -> 0x0029 }
            r5.append(r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = " clear"
            r5.append(r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0029 }
            p446vd.C13633n.m31145a(r4, r5)     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0058:
            if (r0 == 0) goto L_0x005f
            if (r5 == 0) goto L_0x005f
            r5.mo47854a()     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            throw r2     // Catch:{ all -> 0x0029 }
        L_0x0060:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL.clearContent(com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.rmn.iosadapters.android.database.AndroidDatabaseCursorWrapper} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|(2:103|104)|105|106) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:93|94|(0)|98|99) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(2:40|41)|42|43|44|45|46) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:63|64|65|66|67|68|69) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:83|84|(2:86|87)|88|89|90|91|92) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:70|71|72|73|74|75|76|77|78) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x012c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x009b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x009e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00e5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0105 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0108 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0118 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x011b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x0124 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0115 A[SYNTHETIC, Splitter:B:86:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0121 A[SYNTHETIC, Splitter:B:96:0x0121] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:67:0x00e5=Splitter:B:67:0x00e5, B:76:0x0108=Splitter:B:76:0x0108, B:27:0x006a=Splitter:B:27:0x006a, B:90:0x011b=Splitter:B:90:0x011b, B:105:0x012c=Splitter:B:105:0x012c, B:44:0x009e=Splitter:B:44:0x009e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.util.Map<com.rmn.api.p322v2.main.sqlite.KeySQLColumn, java.lang.Object>> selectContent(java.util.List<java.util.Map<com.rmn.api.p322v2.main.sqlite.KeySQLColumn, java.lang.Object>> r13, java.util.Set<com.rmn.api.p322v2.main.sqlite.KeySQLColumn> r14, com.rmn.api.p322v2.main.sqlite.KeySQLColumn r15) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x013c
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0136
            if (r14 == 0) goto L_0x0130
            int r0 = r14.size()
            java.lang.String[] r3 = new java.lang.String[r0]
            java.util.Iterator r0 = r14.iterator()
            r9 = 0
            r1 = r9
        L_0x0016:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r0.next()
            com.rmn.api.v2.main.sqlite.KeySQLColumn r2 = (com.rmn.api.p322v2.main.sqlite.KeySQLColumn) r2
            if (r2 == 0) goto L_0x002e
            int r4 = r1 + 1
            java.lang.String r2 = r2.getName()
            r3[r1] = r2
            r1 = r4
            goto L_0x0016
        L_0x002e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "KeySQLColumn is null, pos : "
            r14.append(r15)
            r14.append(r1)
            java.lang.String r15 = " "
            r14.append(r15)
            java.lang.String r15 = r12.tableName
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x004f:
            java.lang.Class<com.rmn.api.v2.main.cache.datasource.DataSourceSQL> r0 = com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL.class
            monitor-enter(r0)
            r10 = 0
            com.rmn.api.v2.main.sqlite.BaseDatabaseHelper r1 = r12.helper     // Catch:{ Exception -> 0x005e }
            com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper r1 = r1.getReadableDatabaseWrapper()     // Catch:{ Exception -> 0x005e }
            r11 = r1
            goto L_0x0063
        L_0x005b:
            r13 = move-exception
            goto L_0x0127
        L_0x005e:
            r1 = move-exception
            p446vd.C13633n.m31165u(r12, r1)     // Catch:{ all -> 0x005b }
            r11 = r10
        L_0x0063:
            if (r11 != 0) goto L_0x006c
            if (r11 == 0) goto L_0x006a
            r11.mo47854a()     // Catch:{ Exception -> 0x006a }
        L_0x006a:
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return r10
        L_0x006c:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0125 }
            r1.<init>()     // Catch:{ all -> 0x0125 }
            java.lang.String r4 = com.rmn.api.p322v2.main.sqlite.DatabaseManager.getWhereClauseAndFillArgs((java.util.List<java.util.Map<com.rmn.api.p322v2.main.sqlite.KeySQLColumn, java.lang.Object>>) r13, (java.util.List<java.lang.String>) r1)     // Catch:{ all -> 0x0125 }
            if (r15 != 0) goto L_0x0079
            r8 = r10
            goto L_0x007e
        L_0x0079:
            java.lang.String r13 = r15.getName()     // Catch:{ all -> 0x0125 }
            r8 = r13
        L_0x007e:
            java.lang.String r2 = r12.tableName     // Catch:{ Exception -> 0x010e, all -> 0x010c }
            int r13 = r1.size()     // Catch:{ Exception -> 0x010e, all -> 0x010c }
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ Exception -> 0x010e, all -> 0x010c }
            java.lang.Object[] r13 = r1.toArray(r13)     // Catch:{ Exception -> 0x010e, all -> 0x010c }
            r5 = r13
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ Exception -> 0x010e, all -> 0x010c }
            r6 = 0
            r7 = 0
            r1 = r11
            com.rmn.iosadapters.android.database.AndroidDatabaseCursorWrapper r13 = r1.mo47859f(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x010e, all -> 0x010c }
            if (r13 != 0) goto L_0x00a0
            if (r13 == 0) goto L_0x009b
            r13.mo47846a()     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11.mo47854a()     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return r10
        L_0x00a0:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Exception -> 0x010a }
            r15.<init>()     // Catch:{ Exception -> 0x010a }
        L_0x00a5:
            boolean r1 = r13.mo47853h()     // Catch:{ Exception -> 0x010a }
            if (r1 == 0) goto L_0x00dd
            int r9 = r9 + 1
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x010a }
            r1.<init>()     // Catch:{ Exception -> 0x010a }
            java.util.Iterator r2 = r14.iterator()     // Catch:{ Exception -> 0x010a }
        L_0x00b6:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x010a }
            if (r3 == 0) goto L_0x00d9
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x010a }
            com.rmn.api.v2.main.sqlite.KeySQLColumn r3 = (com.rmn.api.p322v2.main.sqlite.KeySQLColumn) r3     // Catch:{ Exception -> 0x010a }
            com.rmn.api.v2.main.sqlite.SQLType r4 = r3.getSqlType()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r5 = r3.getName()     // Catch:{ Exception -> 0x00b6 }
            java.lang.Class r6 = r3.getType()     // Catch:{ Exception -> 0x00b6 }
            java.lang.Object r4 = r4.retrieveValue(r13, r5, r6)     // Catch:{ Exception -> 0x00b6 }
            if (r4 != 0) goto L_0x00d5
            goto L_0x00b6
        L_0x00d5:
            r1.put(r3, r4)     // Catch:{ Exception -> 0x010a }
            goto L_0x00b6
        L_0x00d9:
            r15.add(r1)     // Catch:{ Exception -> 0x010a }
            goto L_0x00a5
        L_0x00dd:
            if (r9 > 0) goto L_0x00e7
            r13.mo47846a()     // Catch:{ Exception -> 0x00e2 }
        L_0x00e2:
            r11.mo47854a()     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return r10
        L_0x00e7:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010a }
            r14.<init>()     // Catch:{ Exception -> 0x010a }
            java.lang.String r1 = "DATASOURCE "
            r14.append(r1)     // Catch:{ Exception -> 0x010a }
            java.lang.String r1 = r12.tableName     // Catch:{ Exception -> 0x010a }
            r14.append(r1)     // Catch:{ Exception -> 0x010a }
            java.lang.String r1 = " select"
            r14.append(r1)     // Catch:{ Exception -> 0x010a }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x010a }
            p446vd.C13633n.m31145a(r12, r14)     // Catch:{ Exception -> 0x010a }
            r13.mo47846a()     // Catch:{ Exception -> 0x0105 }
        L_0x0105:
            r11.mo47854a()     // Catch:{ Exception -> 0x0108 }
        L_0x0108:
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return r15
        L_0x010a:
            r14 = move-exception
            goto L_0x0110
        L_0x010c:
            r14 = move-exception
            goto L_0x011f
        L_0x010e:
            r14 = move-exception
            r13 = r10
        L_0x0110:
            p446vd.C13633n.m31165u(r12, r14)     // Catch:{ all -> 0x011d }
            if (r13 == 0) goto L_0x0118
            r13.mo47846a()     // Catch:{ Exception -> 0x0118 }
        L_0x0118:
            r11.mo47854a()     // Catch:{ Exception -> 0x011b }
        L_0x011b:
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return r10
        L_0x011d:
            r14 = move-exception
            r10 = r13
        L_0x011f:
            if (r10 == 0) goto L_0x0124
            r10.mo47846a()     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            throw r14     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r13 = move-exception
            r10 = r11
        L_0x0127:
            if (r10 == 0) goto L_0x012c
            r10.mo47854a()     // Catch:{ Exception -> 0x012c }
        L_0x012c:
            throw r13     // Catch:{ all -> 0x012d }
        L_0x012d:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            throw r13
        L_0x0130:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x0136:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x013c:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL.selectContent(java.util.List, java.util.Set, com.rmn.api.v2.main.sqlite.KeySQLColumn):java.util.List");
    }
}
