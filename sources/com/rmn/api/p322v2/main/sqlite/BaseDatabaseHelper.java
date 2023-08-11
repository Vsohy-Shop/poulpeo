package com.rmn.api.p322v2.main.sqlite;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cachetable.BaseCacheTable;
import com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.database.AndroidDatabaseCursorWrapper;
import com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper;
import com.rmn.iosadapters.android.database.sqlite.SQLiteOpenHelperWrapper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p446vd.C13633n;
import p446vd.C13636q;

/* renamed from: com.rmn.api.v2.main.sqlite.BaseDatabaseHelper */
public abstract class BaseDatabaseHelper extends SQLiteOpenHelperWrapper {
    private static final String STORE_FIELD_DATE = "slite_date_table_";
    private static final String STORE_FIELD_NAME = "slite_checksum_";
    private static Set<String> databasesName = new HashSet();
    private static Set<BaseDatabaseHelper> databasesRefreshedOnce = new HashSet();
    private static Map<String, Map<String, IDatasourceSQL>> datasources = new HashMap();
    private final ContextContainer contextContainer;
    private String savedName;
    private int savedVersion = -1;

    public BaseDatabaseHelper(ContextContainer contextContainer2, String str, int i) {
        super(contextContainer2, str, i);
        this.contextContainer = contextContainer2;
        synchronized (BaseDatabaseHelper.class) {
            int i2 = this.savedVersion;
            if (i2 <= 0) {
                this.savedVersion = i;
                this.savedName = str;
            } else if (i != i2) {
                throw new IllegalArgumentException("The databases version must not changed during excution : from " + this.savedVersion + " to " + i);
            }
            if (!databasesName.contains(str)) {
                databasesName.add(str);
                registerDataSources(str, contextContainer2);
            }
        }
    }

    private static void clearDatasourceChecksum(ContextContainer contextContainer2, String str, String str2) {
        C13636q b = C13636q.m31181b(contextContainer2);
        b.mo53293d(STORE_FIELD_NAME + str + "_" + str2);
    }

    private static void clearDatasourceTime(ContextContainer contextContainer2, String str, String str2) {
        C13636q b = C13636q.m31181b(contextContainer2);
        b.mo53293d(STORE_FIELD_DATE + str + "_" + str2);
    }

    private static int getTableCount(String str, SQLiteDatabaseWrapper sQLiteDatabaseWrapper) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (sQLiteDatabaseWrapper != null) {
            String formattedTableName = DataSourceSQL.getFormattedTableName(str);
            AndroidDatabaseCursorWrapper androidDatabaseCursorWrapper = null;
            try {
                androidDatabaseCursorWrapper = sQLiteDatabaseWrapper.mo47860g("SELECT COUNT(*) FROM " + formattedTableName, (String[]) null);
                if (androidDatabaseCursorWrapper.mo47853h()) {
                    int f = androidDatabaseCursorWrapper.mo47851f(0);
                    androidDatabaseCursorWrapper.mo47846a();
                    return f;
                }
                throw new IllegalStateException("Can't have count for " + formattedTableName);
            } catch (Throwable th) {
                if (androidDatabaseCursorWrapper != null) {
                    androidDatabaseCursorWrapper.mo47846a();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    protected static List<ICacheMethodType> groupAllCacheMethods(ICacheMethodType[]... iCacheMethodTypeArr) {
        LinkedList linkedList = new LinkedList();
        for (ICacheMethodType[] asList : iCacheMethodTypeArr) {
            linkedList.addAll(Arrays.asList(asList));
        }
        return linkedList;
    }

    public static void logAllSQLiteRows(ContextContainer contextContainer2, ICacheMethodType iCacheMethodType, SQLiteDatabaseWrapper sQLiteDatabaseWrapper) {
        for (BaseCacheTable datasource : iCacheMethodType.getCache(contextContainer2).getCacheTables()) {
            logAllSQLiteRows(datasource.getDatasource().getTableName(), sQLiteDatabaseWrapper);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0114 A[Catch:{ all -> 0x012f, all -> 0x010e, all -> 0x0154 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015a A[SYNTHETIC, Splitter:B:56:0x015a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void logAllSQLiteTables(com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper r15) {
        /*
            java.lang.String r0 = ")"
            java.lang.String r1 = "   "
            java.lang.String r2 = "   -------------------------------"
            java.lang.String r3 = " : "
            java.lang.Class<com.rmn.api.v2.main.sqlite.BaseDatabaseHelper> r4 = com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper.class
            if (r15 == 0) goto L_0x0163
            boolean r5 = r15.mo47858e()
            if (r5 != 0) goto L_0x0014
            goto L_0x0163
        L_0x0014:
            r5 = 0
            java.lang.String r6 = "SELECT name FROM sqlite_master WHERE type='table' ORDER BY name"
            com.rmn.iosadapters.android.database.AndroidDatabaseCursorWrapper r6 = r15.mo47860g(r6, r5)     // Catch:{ all -> 0x0157 }
            r7 = 1
            r8 = r7
        L_0x001d:
            boolean r9 = r6.mo47853h()     // Catch:{ all -> 0x0154 }
            if (r9 == 0) goto L_0x014d
            r9 = 0
            java.lang.String r10 = r6.mo47852g(r9)     // Catch:{ all -> 0x0154 }
            if (r10 == 0) goto L_0x0136
            java.lang.String r10 = com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL.getFormattedTableName(r10)     // Catch:{ all -> 0x0154 }
            java.lang.String r11 = "=================================="
            p446vd.C13633n.m31145a(r4, r11)     // Catch:{ all -> 0x0154 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0154 }
            r11.<init>()     // Catch:{ all -> 0x0154 }
            java.lang.String r12 = "Table "
            r11.append(r12)     // Catch:{ all -> 0x0154 }
            r11.append(r8)     // Catch:{ all -> 0x0154 }
            r11.append(r3)     // Catch:{ all -> 0x0154 }
            r11.append(r10)     // Catch:{ all -> 0x0154 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0154 }
            p446vd.C13633n.m31145a(r4, r11)     // Catch:{ all -> 0x0154 }
            p446vd.C13633n.m31145a(r4, r2)     // Catch:{ all -> 0x0154 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0154 }
            r11.<init>()     // Catch:{ all -> 0x0154 }
            java.lang.String r12 = "SELECT sql FROM sqlite_master WHERE tbl_name = "
            r11.append(r12)     // Catch:{ all -> 0x0154 }
            r11.append(r10)     // Catch:{ all -> 0x0154 }
            java.lang.String r12 = " AND type = 'table'"
            r11.append(r12)     // Catch:{ all -> 0x0154 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0154 }
            com.rmn.iosadapters.android.database.AndroidDatabaseCursorWrapper r11 = r15.mo47860g(r11, r5)     // Catch:{ all -> 0x0154 }
            boolean r12 = r11.mo47853h()     // Catch:{ all -> 0x012f }
            if (r12 == 0) goto L_0x0118
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x012f }
            r12.<init>()     // Catch:{ all -> 0x012f }
            r12.append(r1)     // Catch:{ all -> 0x012f }
            java.lang.String r13 = r11.mo47852g(r9)     // Catch:{ all -> 0x012f }
            r12.append(r13)     // Catch:{ all -> 0x012f }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x012f }
            p446vd.C13633n.m31145a(r4, r12)     // Catch:{ all -> 0x012f }
            r11.mo47846a()     // Catch:{ all -> 0x0154 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0111 }
            r11.<init>()     // Catch:{ all -> 0x0111 }
            java.lang.String r12 = "PRAGMA table_info("
            r11.append(r12)     // Catch:{ all -> 0x0111 }
            r11.append(r10)     // Catch:{ all -> 0x0111 }
            r11.append(r0)     // Catch:{ all -> 0x0111 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0111 }
            com.rmn.iosadapters.android.database.AndroidDatabaseCursorWrapper r11 = r15.mo47860g(r11, r5)     // Catch:{ all -> 0x0111 }
        L_0x00a1:
            boolean r12 = r11.mo47853h()     // Catch:{ all -> 0x010e }
            if (r12 == 0) goto L_0x00e7
            r12 = 3
            int r12 = r11.mo47851f(r12)     // Catch:{ all -> 0x010e }
            if (r12 != r7) goto L_0x00b1
            java.lang.String r12 = " [PRIMARY]"
            goto L_0x00b3
        L_0x00b1:
            java.lang.String r12 = ""
        L_0x00b3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r13.<init>()     // Catch:{ all -> 0x010e }
            r13.append(r1)     // Catch:{ all -> 0x010e }
            java.lang.String r14 = r11.mo47852g(r9)     // Catch:{ all -> 0x010e }
            r13.append(r14)     // Catch:{ all -> 0x010e }
            r13.append(r3)     // Catch:{ all -> 0x010e }
            java.lang.String r14 = r11.mo47852g(r7)     // Catch:{ all -> 0x010e }
            r13.append(r14)     // Catch:{ all -> 0x010e }
            java.lang.String r14 = " ("
            r13.append(r14)     // Catch:{ all -> 0x010e }
            r14 = 2
            java.lang.String r14 = r11.mo47852g(r14)     // Catch:{ all -> 0x010e }
            r13.append(r14)     // Catch:{ all -> 0x010e }
            r13.append(r0)     // Catch:{ all -> 0x010e }
            r13.append(r12)     // Catch:{ all -> 0x010e }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x010e }
            p446vd.C13633n.m31145a(r4, r12)     // Catch:{ all -> 0x010e }
            goto L_0x00a1
        L_0x00e7:
            r11.mo47846a()     // Catch:{ all -> 0x0154 }
            p446vd.C13633n.m31145a(r4, r2)     // Catch:{ all -> 0x0154 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0154 }
            r9.<init>()     // Catch:{ all -> 0x0154 }
            java.lang.String r11 = " >> "
            r9.append(r11)     // Catch:{ all -> 0x0154 }
            int r10 = getTableCount(r10, r15)     // Catch:{ all -> 0x0154 }
            r9.append(r10)     // Catch:{ all -> 0x0154 }
            java.lang.String r10 = " row(s)"
            r9.append(r10)     // Catch:{ all -> 0x0154 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0154 }
            p446vd.C13633n.m31145a(r4, r9)     // Catch:{ all -> 0x0154 }
            int r8 = r8 + 1
            goto L_0x001d
        L_0x010e:
            r0 = move-exception
            r5 = r11
            goto L_0x0112
        L_0x0111:
            r0 = move-exception
        L_0x0112:
            if (r5 == 0) goto L_0x0117
            r5.mo47846a()     // Catch:{ all -> 0x0154 }
        L_0x0117:
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0118:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x012f }
            r1.<init>()     // Catch:{ all -> 0x012f }
            java.lang.String r2 = "Can't have SQL request for "
            r1.append(r2)     // Catch:{ all -> 0x012f }
            r1.append(r10)     // Catch:{ all -> 0x012f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x012f }
            r0.<init>(r1)     // Catch:{ all -> 0x012f }
            throw r0     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            if (r11 == 0) goto L_0x0135
            r11.mo47846a()     // Catch:{ all -> 0x0154 }
        L_0x0135:
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0136:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0154 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0154 }
            r1.<init>()     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = "Table name null : "
            r1.append(r2)     // Catch:{ all -> 0x0154 }
            r1.append(r8)     // Catch:{ all -> 0x0154 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0154 }
            r0.<init>(r1)     // Catch:{ all -> 0x0154 }
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x014d:
            r6.mo47846a()     // Catch:{ all -> 0x015e }
            r15.mo47854a()
            return
        L_0x0154:
            r0 = move-exception
            r5 = r6
            goto L_0x0158
        L_0x0157:
            r0 = move-exception
        L_0x0158:
            if (r5 == 0) goto L_0x015d
            r5.mo47846a()     // Catch:{ all -> 0x015e }
        L_0x015d:
            throw r0     // Catch:{ all -> 0x015e }
        L_0x015e:
            r0 = move-exception
            r15.mo47854a()
            throw r0
        L_0x0163:
            java.lang.String r15 = "CAN'T ACCESS DATABASE"
            p446vd.C13633n.m31145a(r4, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper.logAllSQLiteTables(com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x017a, code lost:
        p446vd.C13633n.m31155k(r11, "== HELPER refreshDatabaseAtStartup =======================");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x017f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void refreshDatabaseAtStartup(com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper r12) {
        /*
            r11 = this;
            java.lang.Class<com.rmn.api.v2.main.sqlite.BaseDatabaseHelper> r0 = com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper.class
            monitor-enter(r0)
            java.util.Set<com.rmn.api.v2.main.sqlite.BaseDatabaseHelper> r1 = databasesRefreshedOnce     // Catch:{ all -> 0x0180 }
            boolean r1 = r1.contains(r11)     // Catch:{ all -> 0x0180 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0180 }
            return
        L_0x000d:
            java.util.Set<com.rmn.api.v2.main.sqlite.BaseDatabaseHelper> r1 = databasesRefreshedOnce     // Catch:{ all -> 0x0180 }
            r1.add(r11)     // Catch:{ all -> 0x0180 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0180 }
            r1.<init>()     // Catch:{ all -> 0x0180 }
            long r1 = r1.getTime()     // Catch:{ all -> 0x0180 }
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch:{ all -> 0x0180 }
            r3.<init>()     // Catch:{ all -> 0x0180 }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.rmn.api.v2.main.sqlite.IDatasourceSQL>> r4 = datasources     // Catch:{ all -> 0x0180 }
            java.lang.String r5 = r11.savedName     // Catch:{ all -> 0x0180 }
            boolean r4 = r4.containsKey(r5)     // Catch:{ all -> 0x0180 }
            if (r4 != 0) goto L_0x002c
            monitor-exit(r0)     // Catch:{ all -> 0x0180 }
            return
        L_0x002c:
            java.lang.String r4 = "== HELPER refreshDatabaseAtStartup ======================="
            p446vd.C13633n.m31155k(r11, r4)     // Catch:{ all -> 0x0180 }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.rmn.api.v2.main.sqlite.IDatasourceSQL>> r4 = datasources     // Catch:{ all -> 0x0180 }
            java.lang.String r5 = r11.savedName     // Catch:{ all -> 0x0180 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0180 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r5.<init>()     // Catch:{ all -> 0x0180 }
            java.lang.String r6 = " >>>> "
            r5.append(r6)     // Catch:{ all -> 0x0180 }
            java.lang.String r6 = r11.savedName     // Catch:{ all -> 0x0180 }
            r5.append(r6)     // Catch:{ all -> 0x0180 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0180 }
            p446vd.C13633n.m31155k(r11, r5)     // Catch:{ all -> 0x0180 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x0180 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0180 }
        L_0x0059:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0180 }
            if (r5 == 0) goto L_0x00c5
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0180 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x0180 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0180 }
            com.rmn.api.v2.main.sqlite.IDatasourceSQL r5 = (com.rmn.api.p322v2.main.sqlite.IDatasourceSQL) r5     // Catch:{ all -> 0x0180 }
            java.lang.String r6 = r5.getTableName()     // Catch:{ all -> 0x0180 }
            long r7 = r5.getColumnsChecksum()     // Catch:{ all -> 0x0180 }
            com.rmn.iosadapters.android.content.ContextContainer r9 = r11.contextContainer     // Catch:{ all -> 0x0180 }
            java.lang.String r10 = r11.savedName     // Catch:{ all -> 0x0180 }
            long r9 = retrieveDatasourceChecksum(r9, r10, r6)     // Catch:{ all -> 0x0180 }
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x00c1
            r5.dropTableIfExists(r12)     // Catch:{ all -> 0x0180 }
            com.rmn.iosadapters.android.content.ContextContainer r9 = r11.contextContainer     // Catch:{ all -> 0x0180 }
            java.lang.String r10 = r11.savedName     // Catch:{ all -> 0x0180 }
            saveDatasourceChecksum(r9, r10, r6, r7)     // Catch:{ all -> 0x0180 }
            r5.createTableIfExists(r12)     // Catch:{ all -> 0x0180 }
            com.rmn.iosadapters.android.content.ContextContainer r9 = r11.contextContainer     // Catch:{ all -> 0x0180 }
            java.lang.String r10 = r11.savedName     // Catch:{ all -> 0x0180 }
            java.lang.String r5 = r5.getTableName()     // Catch:{ all -> 0x0180 }
            saveDatasourceTime(r9, r10, r5, r1)     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r5.<init>()     // Catch:{ all -> 0x0180 }
            java.lang.String r9 = "HELPER ("
            r5.append(r9)     // Catch:{ all -> 0x0180 }
            r5.append(r6)     // Catch:{ all -> 0x0180 }
            java.lang.String r6 = ") (re)created : table checksum["
            r5.append(r6)     // Catch:{ all -> 0x0180 }
            r5.append(r7)     // Catch:{ all -> 0x0180 }
            java.lang.String r6 = "] time["
            r5.append(r6)     // Catch:{ all -> 0x0180 }
            r5.append(r1)     // Catch:{ all -> 0x0180 }
            java.lang.String r6 = "]"
            r5.append(r6)     // Catch:{ all -> 0x0180 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0180 }
            p446vd.C13633n.m31155k(r11, r5)     // Catch:{ all -> 0x0180 }
            goto L_0x0059
        L_0x00c1:
            r3.add(r5)     // Catch:{ all -> 0x0180 }
            goto L_0x0059
        L_0x00c5:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0180 }
        L_0x00c9:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0180 }
            if (r4 == 0) goto L_0x0131
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0180 }
            com.rmn.api.v2.main.sqlite.IDatasourceSQL r4 = (com.rmn.api.p322v2.main.sqlite.IDatasourceSQL) r4     // Catch:{ all -> 0x0180 }
            java.lang.String r5 = r4.getTableName()     // Catch:{ all -> 0x0180 }
            com.rmn.iosadapters.android.content.ContextContainer r6 = r11.contextContainer     // Catch:{ all -> 0x0180 }
            java.lang.String r7 = r11.savedName     // Catch:{ all -> 0x0180 }
            long r6 = retrieveDatasourceTime(r6, r7, r5)     // Catch:{ all -> 0x0180 }
            long r8 = r4.getLifetimeInMs()     // Catch:{ all -> 0x0180 }
            long r8 = r1 - r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0117
            r4.clearContent(r12)     // Catch:{ all -> 0x0180 }
            com.rmn.iosadapters.android.content.ContextContainer r4 = r11.contextContainer     // Catch:{ all -> 0x0180 }
            java.lang.String r6 = r11.savedName     // Catch:{ all -> 0x0180 }
            saveDatasourceTime(r4, r6, r5, r1)     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r4.<init>()     // Catch:{ all -> 0x0180 }
            java.lang.String r6 = "HELPER ("
            r4.append(r6)     // Catch:{ all -> 0x0180 }
            r4.append(r5)     // Catch:{ all -> 0x0180 }
            java.lang.String r5 = ") dirty cleared : time["
            r4.append(r5)     // Catch:{ all -> 0x0180 }
            r4.append(r1)     // Catch:{ all -> 0x0180 }
            java.lang.String r5 = "]"
            r4.append(r5)     // Catch:{ all -> 0x0180 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0180 }
            p446vd.C13633n.m31155k(r11, r4)     // Catch:{ all -> 0x0180 }
            goto L_0x00c9
        L_0x0117:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r4.<init>()     // Catch:{ all -> 0x0180 }
            java.lang.String r6 = "HELPER ("
            r4.append(r6)     // Catch:{ all -> 0x0180 }
            r4.append(r5)     // Catch:{ all -> 0x0180 }
            java.lang.String r5 = ") unchanged"
            r4.append(r5)     // Catch:{ all -> 0x0180 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0180 }
            p446vd.C13633n.m31155k(r11, r4)     // Catch:{ all -> 0x0180 }
            goto L_0x00c9
        L_0x0131:
            long r1 = r12.mo47857d()     // Catch:{ all -> 0x0180 }
            double r1 = (double) r1     // Catch:{ all -> 0x0180 }
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r3
            long r1 = (long) r1     // Catch:{ all -> 0x0180 }
            r5 = 1000(0x3e8, double:4.94E-321)
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x015d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r12.<init>()     // Catch:{ all -> 0x0180 }
            java.lang.String r3 = "DATABASE SIZE : "
            r12.append(r3)     // Catch:{ all -> 0x0180 }
            r12.append(r1)     // Catch:{ all -> 0x0180 }
            java.lang.String r1 = "kB"
            r12.append(r1)     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0180 }
            p446vd.C13633n.m31155k(r11, r12)     // Catch:{ all -> 0x0180 }
            goto L_0x0179
        L_0x015d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r12.<init>()     // Catch:{ all -> 0x0180 }
            java.lang.String r5 = "DATABASE SIZE : "
            r12.append(r5)     // Catch:{ all -> 0x0180 }
            double r1 = (double) r1     // Catch:{ all -> 0x0180 }
            double r1 = r1 / r3
            long r1 = (long) r1     // Catch:{ all -> 0x0180 }
            r12.append(r1)     // Catch:{ all -> 0x0180 }
            java.lang.String r1 = "MB"
            r12.append(r1)     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0180 }
            p446vd.C13633n.m31155k(r11, r12)     // Catch:{ all -> 0x0180 }
        L_0x0179:
            monitor-exit(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = "== HELPER refreshDatabaseAtStartup ======================="
            p446vd.C13633n.m31155k(r11, r12)
            return
        L_0x0180:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0180 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper.refreshDatabaseAtStartup(com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper):void");
    }

    public static void registerNewDataSource(String str, IDatasourceSQL iDatasourceSQL) {
        if (iDatasourceSQL != null) {
            synchronized (BaseDatabaseHelper.class) {
                Map map = datasources.get(str);
                if (map == null) {
                    map = new HashMap();
                    datasources.put(str, map);
                }
                String tableName = iDatasourceSQL.getTableName();
                if (!map.containsKey(tableName)) {
                    map.put(tableName, iDatasourceSQL);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    private static long retrieveDatasourceChecksum(ContextContainer contextContainer2, String str, String str2) {
        C13636q b = C13636q.m31181b(contextContainer2);
        return b.mo53297h(STORE_FIELD_NAME + str + "_" + str2, -1);
    }

    private static long retrieveDatasourceTime(ContextContainer contextContainer2, String str, String str2) {
        C13636q b = C13636q.m31181b(contextContainer2);
        return b.mo53297h(STORE_FIELD_DATE + str + "_" + str2, -1);
    }

    private static void saveDatasourceChecksum(ContextContainer contextContainer2, String str, String str2, long j) {
        C13636q b = C13636q.m31181b(contextContainer2);
        b.mo53302m(STORE_FIELD_NAME + str + "_" + str2, j);
    }

    private static void saveDatasourceTime(ContextContainer contextContainer2, String str, String str2, long j) {
        C13636q b = C13636q.m31181b(contextContainer2);
        b.mo53302m(STORE_FIELD_DATE + str + "_" + str2, j);
    }

    public void initDatabase() {
        getWritableDatabaseWrapper();
    }

    public void onCreate(SQLiteDatabaseWrapper sQLiteDatabaseWrapper) {
        refreshDatabaseAtStartup(sQLiteDatabaseWrapper);
    }

    public void onOpen(SQLiteDatabaseWrapper sQLiteDatabaseWrapper) {
        refreshDatabaseAtStartup(sQLiteDatabaseWrapper);
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [com.rmn.iosadapters.android.database.AndroidDatabaseCursorWrapper, java.lang.String[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bb, code lost:
        p446vd.C13633n.m31155k(r3, "== HELPER onUpgrade ======================================");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper r4, int r5, int r6) {
        /*
            r3 = this;
            if (r5 == r6) goto L_0x00cb
            java.lang.Class<com.rmn.api.v2.main.sqlite.BaseDatabaseHelper> r0 = com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper.class
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.rmn.api.v2.main.sqlite.IDatasourceSQL>> r1 = datasources     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = r3.savedName     // Catch:{ all -> 0x00c8 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x00c8 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x00c8 }
            return
        L_0x0011:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            r1.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = "== HELPER onUpgrade ["
            r1.append(r2)     // Catch:{ all -> 0x00c8 }
            r1.append(r5)     // Catch:{ all -> 0x00c8 }
            java.lang.String r5 = " => "
            r1.append(r5)     // Catch:{ all -> 0x00c8 }
            r1.append(r6)     // Catch:{ all -> 0x00c8 }
            java.lang.String r5 = "] ============================="
            r1.append(r5)     // Catch:{ all -> 0x00c8 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x00c8 }
            p446vd.C13633n.m31155k(r3, r5)     // Catch:{ all -> 0x00c8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            r5.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r6 = " >>>> "
            r5.append(r6)     // Catch:{ all -> 0x00c8 }
            java.lang.String r6 = r3.savedName     // Catch:{ all -> 0x00c8 }
            r5.append(r6)     // Catch:{ all -> 0x00c8 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c8 }
            p446vd.C13633n.m31155k(r3, r5)     // Catch:{ all -> 0x00c8 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x00c8 }
            r5.<init>()     // Catch:{ all -> 0x00c8 }
            r6 = 0
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type='table'"
            com.rmn.iosadapters.android.database.AndroidDatabaseCursorWrapper r6 = r4.mo47860g(r1, r6)     // Catch:{ all -> 0x00c1 }
        L_0x0054:
            boolean r1 = r6.mo47853h()     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x0078
            r1 = 0
            java.lang.String r1 = r6.mo47852g(r1)     // Catch:{ all -> 0x00c1 }
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "Table name null"
            p446vd.C13633n.m31166v(r1)     // Catch:{ all -> 0x00c1 }
            goto L_0x0054
        L_0x0067:
            java.lang.String r2 = "android_metadata"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x0070
            goto L_0x0054
        L_0x0070:
            java.lang.String r1 = com.rmn.api.p322v2.main.cache.datasource.DataSourceSQL.getFormattedTableName(r1)     // Catch:{ all -> 0x00c1 }
            r5.add(r1)     // Catch:{ all -> 0x00c1 }
            goto L_0x0054
        L_0x0078:
            r6.mo47846a()     // Catch:{ all -> 0x00c8 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00c8 }
        L_0x007f:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x00ba
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00c8 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = com.rmn.api.p322v2.main.sqlite.DatabaseManager.getSQLRequestDropTableIfExists(r6)     // Catch:{ all -> 0x00c8 }
            r4.mo47856c(r1)     // Catch:{ all -> 0x00c8 }
            com.rmn.iosadapters.android.content.ContextContainer r1 = r3.contextContainer     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = r3.savedName     // Catch:{ all -> 0x00c8 }
            clearDatasourceChecksum(r1, r2, r6)     // Catch:{ all -> 0x00c8 }
            com.rmn.iosadapters.android.content.ContextContainer r1 = r3.contextContainer     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = r3.savedName     // Catch:{ all -> 0x00c8 }
            clearDatasourceTime(r1, r2, r6)     // Catch:{ all -> 0x00c8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            r1.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = "HELPER ("
            r1.append(r2)     // Catch:{ all -> 0x00c8 }
            r1.append(r6)     // Catch:{ all -> 0x00c8 }
            java.lang.String r6 = ") dropped"
            r1.append(r6)     // Catch:{ all -> 0x00c8 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x00c8 }
            p446vd.C13633n.m31155k(r3, r6)     // Catch:{ all -> 0x00c8 }
            goto L_0x007f
        L_0x00ba:
            monitor-exit(r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r5 = "== HELPER onUpgrade ======================================"
            p446vd.C13633n.m31155k(r3, r5)
            goto L_0x00cb
        L_0x00c1:
            r4 = move-exception
            if (r6 == 0) goto L_0x00c7
            r6.mo47846a()     // Catch:{ all -> 0x00c8 }
        L_0x00c7:
            throw r4     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c8 }
            throw r4
        L_0x00cb:
            r3.onCreate(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.sqlite.BaseDatabaseHelper.onUpgrade(com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper, int, int):void");
    }

    /* access modifiers changed from: protected */
    public abstract void registerDataSources(String str, ContextContainer contextContainer2);

    public static void logAllSQLiteRows(String str, SQLiteDatabaseWrapper sQLiteDatabaseWrapper) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        }
        Class<BaseDatabaseHelper> cls = BaseDatabaseHelper.class;
        if (sQLiteDatabaseWrapper == null || !sQLiteDatabaseWrapper.mo47858e()) {
            C13633n.m31145a(cls, "CAN'T ACCESS DATABASE");
            return;
        }
        String formattedTableName = DataSourceSQL.getFormattedTableName(str);
        AndroidDatabaseCursorWrapper androidDatabaseCursorWrapper = null;
        try {
            androidDatabaseCursorWrapper = sQLiteDatabaseWrapper.mo47860g("SELECT * FROM " + formattedTableName + " LIMIT 100", (String[]) null);
            int b = androidDatabaseCursorWrapper.mo47847b();
            C13633n.m31145a(cls, "==================================");
            C13633n.m31145a(cls, "Table " + formattedTableName + " : ");
            C13633n.m31145a(cls, "   -------------------------------");
            for (int i = 0; i < b; i++) {
                C13633n.m31145a(cls, "   " + i + ") " + androidDatabaseCursorWrapper.mo47849d(i));
            }
            C13633n.m31145a(cls, "   -------------------------------");
            int i2 = 0;
            while (androidDatabaseCursorWrapper.mo47853h()) {
                for (int i3 = 0; i3 < b; i3++) {
                    C13633n.m31145a(cls, "   " + i3 + ") => " + androidDatabaseCursorWrapper.mo47852g(i3));
                }
                C13633n.m31145a(cls, "   -------------------------------");
                i2++;
            }
            C13633n.m31145a(cls, " >> " + i2 + " / " + getTableCount(formattedTableName, sQLiteDatabaseWrapper) + " row(s)");
            androidDatabaseCursorWrapper.mo47846a();
            sQLiteDatabaseWrapper.mo47854a();
        } catch (Throwable th) {
            sQLiteDatabaseWrapper.mo47854a();
            throw th;
        }
    }
}
