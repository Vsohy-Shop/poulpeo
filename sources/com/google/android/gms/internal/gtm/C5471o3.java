package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p286y4.C10671e;
import p286y4.C10673g;
import p286y4.C10674h;

/* renamed from: com.google.android.gms.internal.gtm.o3 */
final class C5471o3 implements C5290c3 {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String f6180i = String.format("CREATE TABLE IF NOT EXISTS %s ('%s' TEXT UNIQUE);", new Object[]{"gtm_hit_unique_ids", "hit_unique_id"});
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f6181j = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT UNIQUE, '%s' TEXT, '%s' TEXT);", new Object[]{"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"});
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String f6182k = String.format("CREATE TRIGGER IF NOT EXISTS %s DELETE ON %s FOR EACH ROW WHEN OLD.%s NOTNULL BEGIN     INSERT OR IGNORE INTO %s (%s) VALUES (OLD.%s); END;", new Object[]{"save_unique_on_delete", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id"});
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f6183l = String.format("CREATE TRIGGER IF NOT EXISTS %s BEFORE INSERT ON %s FOR EACH ROW WHEN NEW.%s NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM %s WHERE %s = NEW.%s); END;", new Object[]{"check_unique_on_insert", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id"});

    /* renamed from: a */
    private final C5504q3 f6184a;

    /* renamed from: b */
    private volatile C5548t2 f6185b;

    /* renamed from: c */
    private final C5305d3 f6186c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f6187d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f6188e;

    /* renamed from: f */
    private long f6189f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C10671e f6190g;

    /* renamed from: h */
    private final int f6191h;

    C5471o3(C5305d3 d3Var, Context context) {
        this(d3Var, context, "gtm_urls.db", 2000);
    }

    /* renamed from: e */
    private final void m8273e(String[] strArr) {
        SQLiteDatabase g;
        String str;
        if (strArr != null && strArr.length != 0 && (g = m8275g("Error opening database for deleteHits.")) != null) {
            boolean z = true;
            try {
                g.delete("gtm_hits", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                C5305d3 d3Var = this.f6186c;
                if (m8278j("gtm_hits") != 0) {
                    z = false;
                }
                d3Var.mo33168n(z);
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str = "Error deleting hits: ".concat(valueOf);
                } else {
                    str = new String("Error deleting hits: ");
                }
                C5426l3.m8134d(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f1, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ba, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bb, code lost:
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01db, code lost:
        r0 = "Error in peekHits fetching hitIds: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e0, code lost:
        r0 = new java.lang.String("Error in peekHits fetching hitIds: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ea, code lost:
        r14.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0178 A[Catch:{ all -> 0x01b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017d A[Catch:{ all -> 0x01b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0191 A[Catch:{ all -> 0x01b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ba A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01db A[Catch:{ all -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01e0 A[Catch:{ all -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ea  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.google.android.gms.internal.gtm.C5608x2> m8274f(int r25) {
        /*
            r24 = this;
            java.lang.String r0 = "%s ASC"
            java.lang.String r1 = "hit_id"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "Error opening database for peekHits"
            r4 = r24
            android.database.sqlite.SQLiteDatabase r3 = r4.m8275g(r3)
            if (r3 != 0) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.String r6 = "gtm_hits"
            java.lang.String r5 = "hit_time"
            java.lang.String r7 = "hit_first_send_time"
            java.lang.String[] r7 = new java.lang.String[]{r1, r5, r7}     // Catch:{ SQLiteException -> 0x01c9, all -> 0x01c6 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r15 = 1
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ SQLiteException -> 0x01c9, all -> 0x01c6 }
            r13 = 0
            r5[r13] = r1     // Catch:{ SQLiteException -> 0x01c9, all -> 0x01c6 }
            java.lang.String r12 = java.lang.String.format(r0, r5)     // Catch:{ SQLiteException -> 0x01c9, all -> 0x01c6 }
            r16 = 40
            java.lang.String r17 = java.lang.Integer.toString(r16)     // Catch:{ SQLiteException -> 0x01c9, all -> 0x01c6 }
            r5 = r3
            r14 = r13
            r13 = r17
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x01c9, all -> 0x01c6 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01c0, all -> 0x01ba }
            r12.<init>()     // Catch:{ SQLiteException -> 0x01c0, all -> 0x01ba }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x01b7, all -> 0x01ba }
            r11 = 2
            if (r2 == 0) goto L_0x006c
        L_0x0046:
            com.google.android.gms.internal.gtm.x2 r2 = new com.google.android.gms.internal.gtm.x2     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            long r18 = r13.getLong(r14)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            long r20 = r13.getLong(r15)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            long r22 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            r17 = r2
            r17.<init>(r18, r20, r22)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            r12.add(r2)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            boolean r2 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            if (r2 != 0) goto L_0x0046
            goto L_0x006c
        L_0x0063:
            r0 = move-exception
            r14 = r13
            goto L_0x01ef
        L_0x0067:
            r0 = move-exception
            r2 = r12
            r14 = r13
            goto L_0x01cb
        L_0x006c:
            r13.close()
            java.lang.String r6 = "gtm_hits"
            java.lang.String r2 = "hit_url"
            java.lang.String r5 = "hit_method"
            java.lang.String r7 = "hit_headers"
            java.lang.String r8 = "hit_body"
            java.lang.String[] r7 = new java.lang.String[]{r1, r2, r5, r7, r8}     // Catch:{ SQLiteException -> 0x0164, all -> 0x0160 }
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = 0
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ SQLiteException -> 0x0164, all -> 0x0160 }
            r5[r14] = r1     // Catch:{ SQLiteException -> 0x0164, all -> 0x0160 }
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ SQLiteException -> 0x0164, all -> 0x0160 }
            java.lang.String r1 = java.lang.Integer.toString(r16)     // Catch:{ SQLiteException -> 0x0164, all -> 0x0160 }
            r5 = r3
            r3 = r11
            r11 = r2
            r2 = r12
            r12 = r0
            r16 = r13
            r13 = r1
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x015c, all -> 0x0158 }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0156 }
            if (r0 == 0) goto L_0x0152
            r1 = r14
        L_0x00a0:
            r0 = r13
            android.database.sqlite.SQLiteCursor r0 = (android.database.sqlite.SQLiteCursor) r0     // Catch:{ SQLiteException -> 0x0156 }
            android.database.CursorWindow r0 = r0.getWindow()     // Catch:{ SQLiteException -> 0x0156 }
            int r0 = r0.getNumRows()     // Catch:{ SQLiteException -> 0x0156 }
            if (r0 <= 0) goto L_0x012f
            java.lang.Object r0 = r2.get(r1)     // Catch:{ SQLiteException -> 0x0156 }
            com.google.android.gms.internal.gtm.x2 r0 = (com.google.android.gms.internal.gtm.C5608x2) r0     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String r5 = r13.getString(r15)     // Catch:{ SQLiteException -> 0x0156 }
            r0.mo33606a(r5)     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ SQLiteException -> 0x0156 }
            com.google.android.gms.internal.gtm.x2 r0 = (com.google.android.gms.internal.gtm.C5608x2) r0     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String r5 = r13.getString(r3)     // Catch:{ SQLiteException -> 0x0156 }
            r0.mo33607b(r5)     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ SQLiteException -> 0x0156 }
            com.google.android.gms.internal.gtm.x2 r0 = (com.google.android.gms.internal.gtm.C5608x2) r0     // Catch:{ SQLiteException -> 0x0156 }
            r5 = 4
            java.lang.String r5 = r13.getString(r5)     // Catch:{ SQLiteException -> 0x0156 }
            r0.mo33608c(r5)     // Catch:{ SQLiteException -> 0x0156 }
            r0 = 3
            java.lang.String r0 = r13.getString(r0)     // Catch:{ JSONException -> 0x010c }
            if (r0 == 0) goto L_0x0101
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x010c }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x010c }
            org.json.JSONArray r0 = r5.names()     // Catch:{ JSONException -> 0x010c }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ JSONException -> 0x010c }
            r6.<init>()     // Catch:{ JSONException -> 0x010c }
            r7 = r14
        L_0x00eb:
            int r8 = r0.length()     // Catch:{ JSONException -> 0x010c }
            if (r7 >= r8) goto L_0x0102
            java.lang.String r8 = r0.getString(r7)     // Catch:{ JSONException -> 0x010c }
            java.lang.Object r9 = r5.opt(r8)     // Catch:{ JSONException -> 0x010c }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x010c }
            r6.put(r8, r9)     // Catch:{ JSONException -> 0x010c }
            int r7 = r7 + 1
            goto L_0x00eb
        L_0x0101:
            r6 = 0
        L_0x0102:
            java.lang.Object r0 = r2.get(r1)     // Catch:{ SQLiteException -> 0x0156 }
            com.google.android.gms.internal.gtm.x2 r0 = (com.google.android.gms.internal.gtm.C5608x2) r0     // Catch:{ SQLiteException -> 0x0156 }
            r0.mo33609d(r6)     // Catch:{ SQLiteException -> 0x0156 }
            goto L_0x014a
        L_0x010c:
            r0 = move-exception
            java.lang.String r5 = "Failed to read headers for hitId %d: %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.Object r7 = r2.get(r1)     // Catch:{ SQLiteException -> 0x0156 }
            com.google.android.gms.internal.gtm.x2 r7 = (com.google.android.gms.internal.gtm.C5608x2) r7     // Catch:{ SQLiteException -> 0x0156 }
            long r7 = r7.mo33610e()     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0156 }
            r6[r14] = r7     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ SQLiteException -> 0x0156 }
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String r0 = java.lang.String.format(r5, r6)     // Catch:{ SQLiteException -> 0x0156 }
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)     // Catch:{ SQLiteException -> 0x0156 }
            goto L_0x014c
        L_0x012f:
            java.lang.String r0 = "HitString for hitId %d too large. Hit will be deleted."
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.Object r6 = r2.get(r1)     // Catch:{ SQLiteException -> 0x0156 }
            com.google.android.gms.internal.gtm.x2 r6 = (com.google.android.gms.internal.gtm.C5608x2) r6     // Catch:{ SQLiteException -> 0x0156 }
            long r6 = r6.mo33610e()     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x0156 }
            r5[r14] = r6     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ SQLiteException -> 0x0156 }
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)     // Catch:{ SQLiteException -> 0x0156 }
        L_0x014a:
            int r1 = r1 + 1
        L_0x014c:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0156 }
            if (r0 != 0) goto L_0x00a0
        L_0x0152:
            r13.close()
            return r2
        L_0x0156:
            r0 = move-exception
            goto L_0x0168
        L_0x0158:
            r0 = move-exception
            r13 = r16
            goto L_0x01b1
        L_0x015c:
            r0 = move-exception
            r13 = r16
            goto L_0x0168
        L_0x0160:
            r0 = move-exception
            r16 = r13
            goto L_0x01b1
        L_0x0164:
            r0 = move-exception
            r2 = r12
            r16 = r13
        L_0x0168:
            java.lang.String r1 = "Error in peekHits fetching hit url: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01b0 }
            int r3 = r0.length()     // Catch:{ all -> 0x01b0 }
            if (r3 == 0) goto L_0x017d
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x01b0 }
            goto L_0x0182
        L_0x017d:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x01b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x01b0 }
        L_0x0182:
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)     // Catch:{ all -> 0x01b0 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01b0 }
            r0.<init>()     // Catch:{ all -> 0x01b0 }
            int r1 = r2.size()     // Catch:{ all -> 0x01b0 }
            r3 = r14
        L_0x018f:
            if (r14 >= r1) goto L_0x01aa
            java.lang.Object r5 = r2.get(r14)     // Catch:{ all -> 0x01b0 }
            int r14 = r14 + 1
            com.google.android.gms.internal.gtm.x2 r5 = (com.google.android.gms.internal.gtm.C5608x2) r5     // Catch:{ all -> 0x01b0 }
            java.lang.String r6 = r5.mo33612g()     // Catch:{ all -> 0x01b0 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01b0 }
            if (r6 == 0) goto L_0x01a6
            if (r3 != 0) goto L_0x01aa
            r3 = r15
        L_0x01a6:
            r0.add(r5)     // Catch:{ all -> 0x01b0 }
            goto L_0x018f
        L_0x01aa:
            if (r13 == 0) goto L_0x01af
            r13.close()
        L_0x01af:
            return r0
        L_0x01b0:
            r0 = move-exception
        L_0x01b1:
            if (r13 == 0) goto L_0x01b6
            r13.close()
        L_0x01b6:
            throw r0
        L_0x01b7:
            r0 = move-exception
            r2 = r12
            goto L_0x01c1
        L_0x01ba:
            r0 = move-exception
            r16 = r13
            r14 = r16
            goto L_0x01ef
        L_0x01c0:
            r0 = move-exception
        L_0x01c1:
            r16 = r13
            r14 = r16
            goto L_0x01cb
        L_0x01c6:
            r0 = move-exception
            r14 = 0
            goto L_0x01ef
        L_0x01c9:
            r0 = move-exception
            r14 = 0
        L_0x01cb:
            java.lang.String r1 = "Error in peekHits fetching hitIds: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01ee }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01ee }
            int r3 = r0.length()     // Catch:{ all -> 0x01ee }
            if (r3 == 0) goto L_0x01e0
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x01ee }
            goto L_0x01e5
        L_0x01e0:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x01ee }
            r0.<init>(r1)     // Catch:{ all -> 0x01ee }
        L_0x01e5:
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)     // Catch:{ all -> 0x01ee }
            if (r14 == 0) goto L_0x01ed
            r14.close()
        L_0x01ed:
            return r2
        L_0x01ee:
            r0 = move-exception
        L_0x01ef:
            if (r14 == 0) goto L_0x01f4
            r14.close()
        L_0x01f4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5471o3.m8274f(int):java.util.List");
    }

    /* renamed from: g */
    private final SQLiteDatabase m8275g(String str) {
        try {
            return this.f6184a.getWritableDatabase();
        } catch (SQLiteException e) {
            Context context = this.f6187d;
            C5426l3.m8137g(str, e);
            if (C10673g.m22679a(context, e)) {
                C5426l3.m8133c("Crash reported successfully.");
                return null;
            }
            C5426l3.m8133c("Failed to report crash");
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m8277i(long j, long j2) {
        SQLiteDatabase g = m8275g("Error opening database for getNumStoredHits.");
        if (g != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_first_send_time", Long.valueOf(j2));
            try {
                g.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
            } catch (SQLiteException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 70);
                sb.append("Error setting HIT_FIRST_DISPATCH_TIME for hitId ");
                sb.append(j);
                sb.append(": ");
                sb.append(message);
                C5426l3.m8134d(sb.toString());
                m8280m(j);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: j */
    private final int m8278j(String str) {
        String str2;
        String str3;
        SQLiteDatabase g = m8275g("Error opening database for getNumRecords.");
        int i = 0;
        if (g == null) {
            return 0;
        }
        ? r2 = 0;
        try {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "SELECT COUNT(*) from ".concat(valueOf);
            } else {
                str3 = new String("SELECT COUNT(*) from ");
            }
            Cursor rawQuery = g.rawQuery(str3, r2);
            if (rawQuery.moveToFirst()) {
                i = (int) rawQuery.getLong(0);
            }
            rawQuery.close();
        } catch (SQLiteException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Error getting numStoredRecords: ".concat(valueOf2);
            } else {
                str2 = new String("Error getting numStoredRecords: ");
            }
            C5426l3.m8134d(str2);
            if (r2 != 0) {
                r2.close();
            }
        } catch (Throwable th) {
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m8280m(long j) {
        m8273e(new String[]{String.valueOf(j)});
    }

    /* renamed from: n */
    private final int m8281n() {
        String str;
        SQLiteDatabase g = m8275g("Error opening database for getNumStoredHits.");
        int i = 0;
        if (g == null) {
            return 0;
        }
        Cursor cursor = null;
        try {
            Cursor query = g.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", (String[]) null, (String) null, (String) null, (String) null);
            i = query.getCount();
            query.close();
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Error getting num untried hits: ".concat(valueOf);
            } else {
                str = new String("Error getting num untried hits: ");
            }
            C5426l3.m8134d(str);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return i;
    }

    /* renamed from: s */
    private final List<String> m8286s(int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            C5426l3.m8134d("Invalid maxHits specified. Skipping");
            return arrayList;
        }
        SQLiteDatabase g = m8275g("Error opening database for peekHitIds.");
        if (g == null) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            Cursor query = g.query("gtm_hits", new String[]{"hit_id"}, (String) null, (String[]) null, (String) null, (String) null, String.format("%s ASC", new Object[]{"hit_id"}), Integer.toString(i));
            if (query.moveToFirst()) {
                do {
                    arrayList.add(String.valueOf(query.getLong(0)));
                } while (query.moveToNext());
            }
            query.close();
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Error in peekHits fetching hitIds: ".concat(valueOf);
            } else {
                str = new String("Error in peekHits fetching hitIds: ");
            }
            C5426l3.m8134d(str);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo33155a(long j, String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        String str5;
        String str6;
        String str7;
        boolean z;
        long a = this.f6190g.mo33547a();
        if (a > this.f6189f + 86400000) {
            this.f6189f = a;
            SQLiteDatabase g = m8275g("Error opening database for deleteStaleHits.");
            if (g != null) {
                int delete = g.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.f6190g.mo33547a() - 2592000000L)});
                StringBuilder sb = new StringBuilder(31);
                sb.append("Removed ");
                sb.append(delete);
                sb.append(" stale hits.");
                C5426l3.m8133c(sb.toString());
                C5305d3 d3Var = this.f6186c;
                if (m8278j("gtm_hits") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                d3Var.mo33168n(z);
            }
        }
        int j2 = (m8278j("gtm_hits") - this.f6191h) + 1;
        if (j2 > 0) {
            List<String> s = m8286s(j2);
            int size = s.size();
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Store full, deleting ");
            sb2.append(size);
            sb2.append(" hits to make room.");
            C5426l3.m8133c(sb2.toString());
            m8273e((String[]) s.toArray(new String[0]));
        }
        SQLiteDatabase g2 = m8275g("Error opening database for putHit");
        if (g2 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", 0);
            if (str2 == null) {
                str2 = ShareTarget.METHOD_GET;
            }
            contentValues.put("hit_method", str2);
            contentValues.put("hit_unique_id", str3);
            if (map == null) {
                str5 = null;
            } else {
                str5 = new JSONObject(map).toString();
            }
            contentValues.put("hit_headers", str5);
            contentValues.put("hit_body", str4);
            try {
                g2.insertOrThrow("gtm_hits", (String) null, contentValues);
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 19);
                sb3.append("Hit stored (url = ");
                sb3.append(str);
                sb3.append(")");
                C5426l3.m8133c(sb3.toString());
                this.f6186c.mo33168n(false);
            } catch (SQLiteConstraintException unused) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str6 = "Hit has already been sent: ".concat(valueOf);
                } else {
                    str6 = new String("Hit has already been sent: ");
                }
                C5426l3.m8133c(str6);
            } catch (SQLiteException e) {
                String valueOf2 = String.valueOf(e.getMessage());
                if (valueOf2.length() != 0) {
                    str7 = "Error storing hit: ".concat(valueOf2);
                } else {
                    str7 = new String("Error storing hit: ");
                }
                C5426l3.m8134d(str7);
            }
        }
        if (C5549t3.m8514e().mo33532b()) {
            C5426l3.m8133c("Sending hits immediately under preview.");
            mo33156k();
        }
    }

    /* renamed from: k */
    public final void mo33156k() {
        C5426l3.m8133c("GTM Dispatch running...");
        if (this.f6185b.mo33318a()) {
            List<C5608x2> f = m8274f(40);
            if (f.isEmpty()) {
                C5426l3.m8133c("...nothing to dispatch");
                this.f6186c.mo33168n(true);
                return;
            }
            this.f6185b.mo33319b(f);
            if (m8281n() > 0) {
                C5321e4.m7887n().mo33186c();
            }
        }
    }

    private C5471o3(C5305d3 d3Var, Context context, String str, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f6187d = applicationContext;
        this.f6188e = str;
        this.f6186c = d3Var;
        this.f6190g = C10674h.m22680c();
        this.f6184a = new C5504q3(this, applicationContext, str);
        this.f6185b = new C5412k4(applicationContext, new C5489p3(this));
        this.f6189f = 0;
        this.f6191h = 2000;
    }
}
