package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.autofill.HintConstants;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.internal.measurement.C5822k4;
import com.google.android.gms.internal.measurement.C5831kd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.j */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6180j extends C6343x8 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f7874f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f7875g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f7876h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f7877i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f7878j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f7879k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String[] f7880l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String[] f7881m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C6169i f7882d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6299t8 f7883e = new C6299t8(this.f7899a.mo34922c());

    C6180j(C6157g9 g9Var) {
        super(g9Var);
        this.f7899a.mo35211z();
        this.f7882d = new C6169i(this, this.f7899a.mo34927f(), "google_app_measurement.db");
    }

    @WorkerThread
    /* renamed from: J */
    static final void m10769J(ContentValues contentValues, String str, Object obj) {
        C9713p.m20271f("value");
        C9713p.m20275j(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    /* renamed from: L */
    private final long m10770L(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo35005R().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: M */
    private final long m10771M(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo35005R().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x003e=Splitter:B:12:0x003e, B:29:0x008e=Splitter:B:29:0x008e} */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34999I(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.C6146f9 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            p231t4.C9713p.m20275j(r26)
            r20.mo34778h()
            r20.mo35406i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo35005R()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0077
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            java.lang.String r5 = "rowid <= ? and "
        L_0x003e:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            int r4 = r4 + 148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = "select app_id, metadata_fingerprint from raw_events where "
            r7.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r5 != 0) goto L_0x0068
            r4.close()
            return
        L_0x0068:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0074 }
            r4.close()     // Catch:{ SQLiteException -> 0x0074 }
            goto L_0x00bf
        L_0x0074:
            r0 = move-exception
            goto L_0x0219
        L_0x0077:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0086
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            goto L_0x008a
        L_0x0086:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
        L_0x008a:
            if (r4 == 0) goto L_0x008e
            java.lang.String r5 = " and rowid <= ?"
        L_0x008e:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            int r4 = r4 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = " order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r5 != 0) goto L_0x00b8
            r4.close()
            return
        L_0x00b8:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0074 }
            r4.close()     // Catch:{ SQLiteException -> 0x0074 }
        L_0x00bf:
            r16 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = r11
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            if (r4 != 0) goto L_0x0100
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r0.mo35038b(r2, r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r12.close()
            return
        L_0x0100:
            byte[] r4 = r12.getBlob(r15)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            com.google.android.gms.internal.measurement.t4 r5 = com.google.android.gms.internal.measurement.C5983u4.m10013J1()     // Catch:{ IOException -> 0x01e3 }
            com.google.android.gms.internal.measurement.x9 r4 = com.google.android.gms.measurement.internal.C6179i9.m10729D(r5, r4)     // Catch:{ IOException -> 0x01e3 }
            com.google.android.gms.internal.measurement.t4 r4 = (com.google.android.gms.internal.measurement.C5967t4) r4     // Catch:{ IOException -> 0x01e3 }
            com.google.android.gms.internal.measurement.v8 r4 = r4.mo34354l()     // Catch:{ IOException -> 0x01e3 }
            com.google.android.gms.internal.measurement.u4 r4 = (com.google.android.gms.internal.measurement.C5983u4) r4     // Catch:{ IOException -> 0x01e3 }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            if (r5 == 0) goto L_0x012d
            com.google.android.gms.measurement.internal.p4 r5 = r1.f7899a     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35080w()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r5.mo35038b(r6, r7)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
        L_0x012d:
            r12.close()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            p231t4.C9713p.m20275j(r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r2.f7777a = r4     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            r13 = 3
            if (r4 == 0) goto L_0x014d
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r14 = 1
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r7 = r4
            r8 = r5
            goto L_0x0159
        L_0x014d:
            r14 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r7 = r4
            r8 = r6
        L_0x0159:
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r16 = 0
            r4 = r0
            r17 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r0 == 0) goto L_0x01cc
        L_0x017c:
            long r5 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x0074 }
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.internal.measurement.j4 r7 = com.google.android.gms.internal.measurement.C5822k4.m9480B()     // Catch:{ IOException -> 0x01ad }
            com.google.android.gms.internal.measurement.x9 r0 = com.google.android.gms.measurement.internal.C6179i9.m10729D(r7, r0)     // Catch:{ IOException -> 0x01ad }
            com.google.android.gms.internal.measurement.j4 r0 = (com.google.android.gms.internal.measurement.C5805j4) r0     // Catch:{ IOException -> 0x01ad }
            java.lang.String r7 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x0074 }
            r0.mo34120z(r7)     // Catch:{ SQLiteException -> 0x0074 }
            r7 = 2
            long r8 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x0074 }
            r0.mo34107E(r8)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.internal.measurement.v8 r0 = r0.mo34354l()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.internal.measurement.k4 r0 = (com.google.android.gms.internal.measurement.C5822k4) r0     // Catch:{ SQLiteException -> 0x0074 }
            boolean r0 = r2.mo34871a(r5, r0)     // Catch:{ SQLiteException -> 0x0074 }
            if (r0 != 0) goto L_0x01c2
            r4.close()
            return
        L_0x01ad:
            r0 = move-exception
            r7 = 2
            com.google.android.gms.measurement.internal.p4 r5 = r1.f7899a     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ SQLiteException -> 0x0074 }
            r5.mo35039c(r6, r8, r0)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x01c2:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r0 != 0) goto L_0x017c
            r4.close()
            return
        L_0x01cc:
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ SQLiteException -> 0x0074 }
            r0.mo35038b(r2, r5)     // Catch:{ SQLiteException -> 0x0074 }
            r4.close()
            return
        L_0x01e3:
            r0 = move-exception
            r17 = r12
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            r2.mo35039c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            r17.close()
            return
        L_0x01fd:
            r0 = move-exception
            goto L_0x0204
        L_0x01ff:
            r0 = move-exception
            goto L_0x020a
        L_0x0201:
            r0 = move-exception
            r17 = r12
        L_0x0204:
            r3 = r17
            goto L_0x0234
        L_0x0207:
            r0 = move-exception
            r17 = r12
        L_0x020a:
            r4 = r17
            goto L_0x0219
        L_0x020d:
            r0 = move-exception
            r3 = r16
            goto L_0x0234
        L_0x0211:
            r0 = move-exception
            r4 = r16
            goto L_0x0219
        L_0x0215:
            r0 = move-exception
            goto L_0x0234
        L_0x0217:
            r0 = move-exception
            r4 = r3
        L_0x0219:
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a     // Catch:{ all -> 0x0232 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x0232 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0232 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ all -> 0x0232 }
            r2.mo35039c(r5, r3, r0)     // Catch:{ all -> 0x0232 }
            if (r4 == 0) goto L_0x0231
            r4.close()
        L_0x0231:
            return
        L_0x0232:
            r0 = move-exception
            r3 = r4
        L_0x0234:
            if (r3 == 0) goto L_0x0239
            r3.close()
        L_0x0239:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6180j.mo34999I(java.lang.String, long, long, com.google.android.gms.measurement.internal.f9):void");
    }

    @WorkerThread
    /* renamed from: K */
    public final int mo35000K(String str, String str2) {
        C9713p.m20271f(str);
        C9713p.m20271f(str2);
        mo34778h();
        mo35406i();
        try {
            return mo35005R().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35040d("Error deleting conditional property", C6206l3.m10862z(str), this.f7899a.mo35182D().mo34901f(str2), e);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: N */
    public final long mo35001N(String str, String str2) {
        long j;
        SQLiteException e;
        C9713p.m20271f(str);
        C9713p.m20271f("first_open_count");
        mo34778h();
        mo35406i();
        SQLiteDatabase R = mo35005R();
        R.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(48);
            sb.append("select ");
            sb.append("first_open_count");
            sb.append(" from app2 where app_id=?");
            j = m10771M(sb.toString(), new String[]{str}, -1);
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (R.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f7899a.mo34920b().mo35075r().mo35039c("Failed to insert column (got -1). appId", C6206l3.m10862z(str), "first_open_count");
                    R.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + j));
                if (((long) R.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    this.f7899a.mo34920b().mo35075r().mo35039c("Failed to update column (got 0). appId", C6206l3.m10862z(str), "first_open_count");
                    R.endTransaction();
                    return -1;
                }
                R.setTransactionSuccessful();
                R.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            j = 0;
            e = e3;
            try {
                this.f7899a.mo34920b().mo35075r().mo35040d("Error inserting column. appId", C6206l3.m10862z(str), "first_open_count", e);
                R.endTransaction();
                return j;
            } catch (Throwable th) {
                R.endTransaction();
                throw th;
            }
        }
    }

    @WorkerThread
    /* renamed from: O */
    public final long mo35002O() {
        return m10771M("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    @WorkerThread
    /* renamed from: P */
    public final long mo35003P() {
        return m10771M("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: Q */
    public final long mo35004Q(String str) {
        C9713p.m20271f(str);
        return m10771M("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: R */
    public final SQLiteDatabase mo35005R() {
        mo34778h();
        try {
            return this.f7882d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35080w().mo35038b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo35006S(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo34778h()
            r7.mo35406i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo35005R()     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ba }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.p4 r8 = r7.f7899a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.l3 r8 = r8.mo34920b()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.j3 r8 = r8.mo35079v()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo35037a(r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.internal.measurement.j4 r3 = com.google.android.gms.internal.measurement.C5822k4.m9480B()     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.x9 r2 = com.google.android.gms.measurement.internal.C6179i9.m10729D(r3, r2)     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.j4 r2 = (com.google.android.gms.internal.measurement.C5805j4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.v8 r2 = r2.mo34354l()     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.k4 r2 = (com.google.android.gms.internal.measurement.C5822k4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.measurement.internal.g9 r8 = r7.f8374b     // Catch:{ SQLiteException -> 0x00ba }
            r8.mo34928f0()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.List r8 = r2.mo34135F()     // Catch:{ SQLiteException -> 0x00ba }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00ba }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00ba }
        L_0x0056:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00ba }
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.internal.measurement.o4 r3 = (com.google.android.gms.internal.measurement.C5887o4) r3     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = r3.mo34240D()     // Catch:{ SQLiteException -> 0x00ba }
            boolean r5 = r3.mo34243S()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0074
            double r5 = r3.mo34248w()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0074:
            boolean r5 = r3.mo34244T()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0082
            float r3 = r3.mo34249x()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0082:
            boolean r5 = r3.mo34247X()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0090
            java.lang.String r3 = r3.mo34241E()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0090:
            boolean r5 = r3.mo34245U()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0056
            long r5 = r3.mo34251z()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x009e:
            r1.close()
            return r2
        L_0x00a2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.p4 r3 = r7.f7899a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r8)     // Catch:{ SQLiteException -> 0x00ba }
            r3.mo35039c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x00ba:
            r8 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8 = move-exception
            goto L_0x00d7
        L_0x00be:
            r8 = move-exception
            r1 = r0
        L_0x00c0:
            com.google.android.gms.measurement.internal.p4 r2 = r7.f7899a     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo35038b(r3, r8)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
            r1.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r8 = move-exception
            r0 = r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r0.close()
        L_0x00dc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6180j.mo35006S(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0117 A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x011b A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0157 A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0170 A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x018c A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018d A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019c A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01bf A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01d1 A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020b  */
    @androidx.annotation.WorkerThread
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C6306u4 mo35007T(java.lang.String r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            p231t4.C9713p.m20271f(r34)
            r33.mo34778h()
            r33.mo35406i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r33.mo35005R()     // Catch:{ SQLiteException -> 0x01ec, all -> 0x01ea }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}     // Catch:{ SQLiteException -> 0x01ec, all -> 0x01ea }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01ec, all -> 0x01ea }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x01ec, all -> 0x01ea }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x01ec, all -> 0x01ea }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01e8 }
            if (r5 != 0) goto L_0x0069
            r4.close()
            return r3
        L_0x0069:
            com.google.android.gms.measurement.internal.u4 r5 = new com.google.android.gms.measurement.internal.u4     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.g9 r6 = r1.f8374b     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.p4 r6 = r6.mo34921b0()     // Catch:{ SQLiteException -> 0x01e8 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x01e8 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35356i(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35375y(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35321H(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35317D(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35318E(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35316C(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35360k(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35358j(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35376z(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35370t(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r7 != 0) goto L_0x00d5
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r6 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r6 = r12
            goto L_0x00d6
        L_0x00d5:
            r6 = r0
        L_0x00d6:
            r5.mo35319F(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35369s(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35367q(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35366p(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35364n(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35363m(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35372v(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r7 == 0) goto L_0x011b
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0120
        L_0x011b:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x0120:
            r5.mo35362l(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35373w(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35365o(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35368r(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35315B(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.p4 r6 = r1.f7899a     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.g r6 = r6.mo35211z()     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C6084a3.f7597o0     // Catch:{ SQLiteException -> 0x01e8 }
            boolean r6 = r6.mo34873B(r3, r7)     // Catch:{ SQLiteException -> 0x01e8 }
            r7 = 0
            if (r6 != 0) goto L_0x0168
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r9 == 0) goto L_0x0161
            r9 = r7
            goto L_0x0165
        L_0x0161:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x0165:
            r5.mo35354h(r9)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x0168:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r9 != 0) goto L_0x0178
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r6 == 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r0 = r12
        L_0x0178:
            r5.mo35352g(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35350f(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r6 == 0) goto L_0x018d
            goto L_0x0191
        L_0x018d:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x0191:
            r5.mo35371u(r7)     // Catch:{ SQLiteException -> 0x01e8 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r6 != 0) goto L_0x01ae
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01e8 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35322I(r0)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x01ae:
            com.google.android.gms.internal.measurement.C5831kd.m9523b()     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C6084a3.f7577e0     // Catch:{ SQLiteException -> 0x01e8 }
            boolean r0 = r0.mo34873B(r2, r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r0 == 0) goto L_0x01c8
            r0 = 27
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo35374x(r0)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x01c8:
            r5.mo35346d()     // Catch:{ SQLiteException -> 0x01e8 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01e8 }
            if (r0 == 0) goto L_0x01e4
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()     // Catch:{ SQLiteException -> 0x01e8 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r34)     // Catch:{ SQLiteException -> 0x01e8 }
            r0.mo35038b(r6, r7)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x01e4:
            r4.close()
            return r5
        L_0x01e8:
            r0 = move-exception
            goto L_0x01ee
        L_0x01ea:
            r0 = move-exception
            goto L_0x0209
        L_0x01ec:
            r0 = move-exception
            r4 = r3
        L_0x01ee:
            com.google.android.gms.measurement.internal.p4 r5 = r1.f7899a     // Catch:{ all -> 0x0207 }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ all -> 0x0207 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ all -> 0x0207 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r34)     // Catch:{ all -> 0x0207 }
            r5.mo35039c(r6, r2, r0)     // Catch:{ all -> 0x0207 }
            if (r4 == 0) goto L_0x0206
            r4.close()
        L_0x0206:
            return r3
        L_0x0207:
            r0 = move-exception
            r3 = r4
        L_0x0209:
            if (r3 == 0) goto L_0x020e
            r3.close()
        L_0x020e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6180j.mo35007T(java.lang.String):com.google.android.gms.measurement.internal.u4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0126  */
    @androidx.annotation.WorkerThread
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C6103c mo35008U(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            p231t4.C9713p.m20271f(r31)
            p231t4.C9713p.m20271f(r32)
            r30.mo34778h()
            r30.mo35406i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo35005R()     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = ""
        L_0x0057:
            r17 = r4
            java.lang.Object r6 = r1.mo35013a0(r10, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r0 == 0) goto L_0x0066
            r21 = r3
            goto L_0x0068
        L_0x0066:
            r21 = r2
        L_0x0068:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.g9 r0 = r1.f8374b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.i9 r0 = r0.mo34928f0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.t> r3 = com.google.android.gms.measurement.internal.C6290t.CREATOR     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo34985A(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r23 = r0
            com.google.android.gms.measurement.internal.t r23 = (com.google.android.gms.measurement.internal.C6290t) r23     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.g9 r0 = r1.f8374b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.i9 r0 = r0.mo34928f0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo34985A(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r26 = r0
            com.google.android.gms.measurement.internal.t r26 = (com.google.android.gms.measurement.internal.C6290t) r26     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.g9 r0 = r1.f8374b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.i9 r0 = r0.mo34928f0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo34985A(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r29 = r0
            com.google.android.gms.measurement.internal.t r29 = (com.google.android.gms.measurement.internal.C6290t) r29     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.j9 r18 = new com.google.android.gms.measurement.internal.j9     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.c r0 = new com.google.android.gms.measurement.internal.c     // Catch:{ SQLiteException -> 0x00f9 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r31)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.p4 r5 = r1.f7899a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.g3 r5 = r5.mo35182D()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = r5.mo34901f(r8)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.mo35039c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00f5:
            r10.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            goto L_0x0124
        L_0x00fd:
            r0 = move-exception
            r10 = r9
        L_0x00ff:
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r31)     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.p4 r5 = r1.f7899a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.g3 r5 = r5.mo35182D()     // Catch:{ all -> 0x0122 }
            java.lang.String r5 = r5.mo34901f(r8)     // Catch:{ all -> 0x0122 }
            r2.mo35040d(r3, r4, r5, r0)     // Catch:{ all -> 0x0122 }
            if (r10 == 0) goto L_0x0121
            r10.close()
        L_0x0121:
            return r9
        L_0x0122:
            r0 = move-exception
            r9 = r10
        L_0x0124:
            if (r9 == 0) goto L_0x0129
            r9.close()
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6180j.mo35008U(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.c");
    }

    @WorkerThread
    /* renamed from: V */
    public final C6158h mo35009V(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo35010W(j, str, 1, false, false, z3, false, z5);
    }

    @WorkerThread
    /* renamed from: W */
    public final C6158h mo35010W(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C9713p.m20271f(str);
        mo34778h();
        mo35406i();
        String[] strArr = {str};
        C6158h hVar = new C6158h();
        Cursor cursor = null;
        try {
            SQLiteDatabase R = mo35005R();
            cursor = R.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f7899a.mo34920b().mo35080w().mo35038b("Not updating daily counts, app is not known. appId", C6206l3.m10862z(str));
                cursor.close();
                return hVar;
            }
            if (cursor.getLong(0) == j) {
                hVar.f7832b = cursor.getLong(1);
                hVar.f7831a = cursor.getLong(2);
                hVar.f7833c = cursor.getLong(3);
                hVar.f7834d = cursor.getLong(4);
                hVar.f7835e = cursor.getLong(5);
            }
            if (z) {
                hVar.f7832b += j2;
            }
            if (z2) {
                hVar.f7831a += j2;
            }
            if (z3) {
                hVar.f7833c += j2;
            }
            if (z4) {
                hVar.f7834d += j2;
            }
            if (z5) {
                hVar.f7835e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(hVar.f7831a));
            contentValues.put("daily_events_count", Long.valueOf(hVar.f7832b));
            contentValues.put("daily_conversions_count", Long.valueOf(hVar.f7833c));
            contentValues.put("daily_error_events_count", Long.valueOf(hVar.f7834d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(hVar.f7835e));
            R.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return hVar;
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Error updating daily counts. appId", C6206l3.m10862z(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return hVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    @androidx.annotation.WorkerThread
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C6246p mo35011X(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            p231t4.C9713p.m20271f(r28)
            p231t4.C9713p.m20271f(r29)
            r27.mo34778h()
            r27.mo35406i()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo35005R()     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = r11
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r9 = r2
        L_0x00dc:
            com.google.android.gms.measurement.internal.p r24 = new com.google.android.gms.measurement.internal.p     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r28)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            r0.mo35038b(r2, r3)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
        L_0x010d:
            r25.close()
            return r24
        L_0x0111:
            r0 = move-exception
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            r25 = r13
        L_0x0118:
            r19 = r25
            goto L_0x014e
        L_0x011b:
            r0 = move-exception
            r25 = r13
        L_0x011e:
            r13 = r25
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            goto L_0x014e
        L_0x0123:
            r0 = move-exception
            r13 = r19
        L_0x0126:
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r28)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.p4 r5 = r1.f7899a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.g3 r5 = r5.mo35182D()     // Catch:{ all -> 0x014b }
            r6 = r29
            java.lang.String r5 = r5.mo34899d(r6)     // Catch:{ all -> 0x014b }
            r2.mo35040d(r3, r4, r5, r0)     // Catch:{ all -> 0x014b }
            if (r13 == 0) goto L_0x014a
            r13.close()
        L_0x014a:
            return r19
        L_0x014b:
            r0 = move-exception
            r19 = r13
        L_0x014e:
            if (r19 == 0) goto L_0x0153
            r19.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6180j.mo35011X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.p");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    @androidx.annotation.WorkerThread
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C6212l9 mo35012Z(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            p231t4.C9713p.m20271f(r20)
            p231t4.C9713p.m20271f(r21)
            r19.mo34778h()
            r19.mo35406i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo35005R()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.Object r8 = r1.mo35013a0(r11, r3)     // Catch:{ SQLiteException -> 0x0079 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.l9 r0 = new com.google.android.gms.measurement.internal.l9     // Catch:{ SQLiteException -> 0x0079 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r2 == 0) goto L_0x0075
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r20)     // Catch:{ SQLiteException -> 0x0079 }
            r2.mo35038b(r3, r4)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0075:
            r11.close()
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            goto L_0x00a4
        L_0x007d:
            r0 = move-exception
            r11 = r10
        L_0x007f:
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r20)     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.p4 r5 = r1.f7899a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.g3 r5 = r5.mo35182D()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.mo34901f(r9)     // Catch:{ all -> 0x00a2 }
            r2.mo35040d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a2 }
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            return r10
        L_0x00a2:
            r0 = move-exception
            r10 = r11
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r10.close()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6180j.mo35012Z(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.l9");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a0 */
    public final Object mo35013a0(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f7899a.mo34920b().mo35075r().mo35037a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f7899a.mo34920b().mo35075r().mo35038b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f7899a.mo34920b().mo35075r().mo35037a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    @androidx.annotation.WorkerThread
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo35014b0() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo35005R()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003e
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            com.google.android.gms.measurement.internal.p4 r3 = r6.f7899a     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo35038b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6180j.mo35014b0():java.lang.String");
    }

    @WorkerThread
    /* renamed from: c0 */
    public final List<C6103c> mo35015c0(String str, String str2, String str3) {
        C9713p.m20271f(str);
        mo34778h();
        mo35406i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(ProxyConfig.MATCH_ALL_SCHEMES));
            sb.append(" and name glob ?");
        }
        return mo35016d0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: d0 */
    public final List<C6103c> mo35016d0(String str, String[] strArr) {
        boolean z;
        mo34778h();
        mo35406i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase R = mo35005R();
            String[] strArr2 = {"app_id", "origin", HintConstants.AUTOFILL_HINT_NAME, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            this.f7899a.mo35211z();
            Cursor query = R.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f7899a.mo35211z();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object a0 = mo35013a0(query, 3);
                        if (query.getInt(4) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        C6179i9 f0 = this.f8374b.mo34928f0();
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator creator = C6290t.CREATOR;
                        arrayList.add(new C6103c(string, string2, new C6190j9(string3, query.getLong(10), a0, string2), query.getLong(8), z, string4, (C6290t) f0.mo34985A(blob, creator), j, (C6290t) this.f8374b.mo34928f0().mo34985A(query.getBlob(9), creator), query.getLong(11), (C6290t) this.f8374b.mo34928f0().mo34985A(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        C6184j3 r = this.f7899a.mo34920b().mo35075r();
                        this.f7899a.mo35211z();
                        r.mo35038b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Error querying conditional user property value", e);
            List<C6103c> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: e0 */
    public final List<C6212l9> mo35017e0(String str) {
        C9713p.m20271f(str);
        mo34778h();
        mo35406i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f7899a.mo35211z();
            Cursor query = mo35005R().query("user_attributes", new String[]{HintConstants.AUTOFILL_HINT_NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object a0 = mo35013a0(query, 3);
                    if (a0 == null) {
                        this.f7899a.mo34920b().mo35075r().mo35038b("Read invalid user property value, ignoring it. appId", C6206l3.m10862z(str));
                    } else {
                        arrayList.add(new C6212l9(str, str2, string, j, a0));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Error querying user properties. appId", C6206l3.m10862z(str), e);
            List<C6212l9> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x011d A[DONT_GENERATE] */
    @androidx.annotation.WorkerThread
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C6212l9> mo35018f0(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r16 = this;
            r1 = r16
            p231t4.C9713p.m20271f(r17)
            r16.mo34778h()
            r16.mo35406i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            r11 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ff }
            r12 = 3
            r2.<init>(r12)     // Catch:{ SQLiteException -> 0x00ff }
            r13 = r17
            r2.add(r13)     // Catch:{ SQLiteException -> 0x00fd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fd }
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x00fd }
            boolean r4 = android.text.TextUtils.isEmpty(r18)     // Catch:{ SQLiteException -> 0x00fd }
            if (r4 != 0) goto L_0x0036
            r14 = r18
            r2.add(r14)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = " and origin=?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00f9 }
            goto L_0x0038
        L_0x0036:
            r14 = r18
        L_0x0038:
            boolean r4 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.add(r4)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x0050:
            int r4 = r2.size()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ SQLiteException -> 0x00f9 }
            r6 = r2
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ SQLiteException -> 0x00f9 }
            android.database.sqlite.SQLiteDatabase r2 = r16.mo35005R()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = "user_attributes"
            java.lang.String r5 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r5, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r7 = r3.toString()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r9 = "rowid"
            com.google.android.gms.measurement.internal.p4 r3 = r1.f7899a     // Catch:{ SQLiteException -> 0x00f9 }
            r3.mo35211z()     // Catch:{ SQLiteException -> 0x00f9 }
            r8 = 0
            r15 = 0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r15
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 != 0) goto L_0x008f
            r11.close()
            return r0
        L_0x008f:
            int r2 = r0.size()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.p4 r3 = r1.f7899a     // Catch:{ SQLiteException -> 0x00f9 }
            r3.mo35211z()     // Catch:{ SQLiteException -> 0x00f9 }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L_0x00b5
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.p4 r5 = r1.f7899a     // Catch:{ SQLiteException -> 0x00f9 }
            r5.mo35211z()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.mo35038b(r4, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            goto L_0x00f5
        L_0x00b5:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 1
            long r7 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 2
            java.lang.Object r9 = r1.mo35013a0(r11, r2)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r14 = r11.getString(r12)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r9 != 0) goto L_0x00e0
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r17)     // Catch:{ SQLiteException -> 0x00f9 }
            r10 = r19
            r2.mo35040d(r3, r4, r14, r10)     // Catch:{ SQLiteException -> 0x00f9 }
            goto L_0x00ee
        L_0x00e0:
            r10 = r19
            com.google.android.gms.measurement.internal.l9 r2 = new com.google.android.gms.measurement.internal.l9     // Catch:{ SQLiteException -> 0x00f9 }
            r3 = r2
            r4 = r17
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x00f9 }
            r0.add(r2)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00ee:
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            goto L_0x008f
        L_0x00f5:
            r11.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x0121
        L_0x00fd:
            r0 = move-exception
            goto L_0x0102
        L_0x00ff:
            r0 = move-exception
            r13 = r17
        L_0x0102:
            r14 = r18
        L_0x0104:
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a     // Catch:{ all -> 0x00fb }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x00fb }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r17)     // Catch:{ all -> 0x00fb }
            r2.mo35040d(r3, r4, r14, r0)     // Catch:{ all -> 0x00fb }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0120
            r11.close()
        L_0x0120:
            return r0
        L_0x0121:
            if (r11 == 0) goto L_0x0126
            r11.close()
        L_0x0126:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6180j.mo35018f0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @WorkerThread
    /* renamed from: g0 */
    public final void mo35019g0() {
        mo35406i();
        mo35005R().beginTransaction();
    }

    /* renamed from: h0 */
    public final void mo35020h0(List<Long> list) {
        C9713p.m20275j(list);
        mo34778h();
        mo35406i();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(list.get(i).longValue());
        }
        sb.append(")");
        int delete = mo35005R().delete("raw_events", sb.toString(), (String[]) null);
        if (delete != list.size()) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    @WorkerThread
    /* renamed from: i0 */
    public final void mo35021i0() {
        mo35406i();
        mo35005R().endTransaction();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: j0 */
    public final void mo35022j0(List<Long> list) {
        mo34778h();
        mo35406i();
        C9713p.m20275j(list);
        C9713p.m20277l(list.size());
        if (mo35033w()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m10770L(sb3.toString(), (String[]) null) > 0) {
                this.f7899a.mo34920b().mo35080w().mo35037a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase R = mo35005R();
                StringBuilder sb4 = new StringBuilder(sb2.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < ");
                sb4.append(Integer.MAX_VALUE);
                sb4.append(")");
                R.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                this.f7899a.mo34920b().mo35075r().mo35038b("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo34749l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: m */
    public final void mo35023m() {
        mo34778h();
        mo35406i();
        if (mo35033w()) {
            long a = this.f8374b.mo34925d0().f7752g.mo35384a();
            long b = this.f7899a.mo34922c().mo33548b();
            long abs = Math.abs(b - a);
            this.f7899a.mo35211z();
            if (abs > C6084a3.f7618z.mo35421a(null).longValue()) {
                this.f8374b.mo34925d0().f7752g.mo35385b(b);
                mo34778h();
                mo35406i();
                if (mo35033w()) {
                    SQLiteDatabase R = mo35005R();
                    this.f7899a.mo35211z();
                    int delete = R.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f7899a.mo34922c().mo33547a()), String.valueOf(C6147g.m10589i())});
                    if (delete > 0) {
                        this.f7899a.mo34920b().mo35079v().mo35038b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo35024n(String str, String str2) {
        C9713p.m20271f(str);
        C9713p.m20271f(str2);
        mo34778h();
        mo35406i();
        try {
            mo35005R().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35040d("Error deleting user property. appId", C6206l3.m10862z(str), this.f7899a.mo35182D().mo34901f(str2), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0326, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.mo34198B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0338, code lost:
        if (r3.mo34203I() == false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x033a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.mo34201F());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0343, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0344, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0358, code lost:
        if (mo35005R().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x035a, code lost:
        r9.f7899a.mo34920b().mo35075r().mo35038b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C6206l3.m10862z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036e, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0372, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r9.f7899a.mo34920b().mo35075r().mo35039c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C6206l3.m10862z(r24), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03bd, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018b, code lost:
        r11 = r0.mo33741E().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0197, code lost:
        if (r11.hasNext() == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (r11.next().mo34202H() != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a5, code lost:
        r9.f7899a.mo34920b().mo35080w().mo35039c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C6206l3.m10862z(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01be, code lost:
        r11 = r0.mo33740D().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r11.hasNext() == false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12 = r11.next();
        mo35406i();
        mo34778h();
        p231t4.C9713p.m20271f(r24);
        p231t4.C9713p.m20275j(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f0, code lost:
        if (android.text.TextUtils.isEmpty(r12.mo33881D()) == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f2, code lost:
        r0 = r9.f7899a.mo34920b().mo35080w();
        r8 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x020a, code lost:
        if (r12.mo33887M() == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020c, code lost:
        r20 = java.lang.Integer.valueOf(r12.mo33890x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0217, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0219, code lost:
        r0.mo35040d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0224, code lost:
        r3 = r12.mo34044j();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r2);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x023d, code lost:
        if (r12.mo33887M() == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x023f, code lost:
        r8 = java.lang.Integer.valueOf(r12.mo33890x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0248, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0249, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.mo33881D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0259, code lost:
        if (r12.mo33888N() == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025b, code lost:
        r8 = java.lang.Boolean.valueOf(r12.mo33885K());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0264, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0265, code lost:
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0279, code lost:
        if (mo35005R().insertWithOnConflict("event_filters", (java.lang.String) null, r4, 5) != -1) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027b, code lost:
        r9.f7899a.mo34920b().mo35075r().mo35038b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C6206l3.m10862z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x028e, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02aa, code lost:
        r21 = r4;
        r0 = r0.mo33741E().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02b8, code lost:
        if (r0.hasNext() == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02ba, code lost:
        r3 = r0.next();
        mo35406i();
        mo34778h();
        p231t4.C9713p.m20271f(r24);
        p231t4.C9713p.m20275j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d4, code lost:
        if (android.text.TextUtils.isEmpty(r3.mo34198B()) == false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d6, code lost:
        r0 = r9.f7899a.mo34920b().mo35080w();
        r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ee, code lost:
        if (r3.mo34202H() == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f0, code lost:
        r3 = java.lang.Integer.valueOf(r3.mo34204w());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f9, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02fa, code lost:
        r0.mo35040d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0303, code lost:
        r4 = r3.mo34044j();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r2);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x031a, code lost:
        if (r3.mo34202H() == false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x031c, code lost:
        r12 = java.lang.Integer.valueOf(r3.mo34204w());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0325, code lost:
        r12 = null;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35025o(java.lang.String r24, java.util.List<com.google.android.gms.internal.measurement.C5685c3> r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            p231t4.C9713p.m20275j(r25)
            r8 = 0
        L_0x0012:
            int r9 = r25.size()
            if (r8 >= r9) goto L_0x00e9
            java.lang.Object r9 = r3.get(r8)
            com.google.android.gms.internal.measurement.c3 r9 = (com.google.android.gms.internal.measurement.C5685c3) r9
            com.google.android.gms.internal.measurement.s8 r9 = r9.mo34557q()
            com.google.android.gms.internal.measurement.b3 r9 = (com.google.android.gms.internal.measurement.C5668b3) r9
            int r11 = r9.mo33692r()
            if (r11 == 0) goto L_0x00a6
            r12 = r9
            r11 = 0
        L_0x002c:
            int r13 = r12.mo33692r()
            if (r11 >= r13) goto L_0x00a3
            com.google.android.gms.internal.measurement.e3 r13 = r12.mo33696v(r11)
            com.google.android.gms.internal.measurement.s8 r13 = r13.mo34557q()
            com.google.android.gms.internal.measurement.d3 r13 = (com.google.android.gms.internal.measurement.C5702d3) r13
            com.google.android.gms.internal.measurement.s8 r14 = r13.clone()
            com.google.android.gms.internal.measurement.d3 r14 = (com.google.android.gms.internal.measurement.C5702d3) r14
            java.lang.String r15 = r13.mo33824v()
            java.lang.String r15 = p201q5.C9267n.m19030b(r15)
            if (r15 == 0) goto L_0x0051
            r14.mo33821s(r15)
            r15 = 1
            goto L_0x0052
        L_0x0051:
            r15 = 0
        L_0x0052:
            r7 = 0
        L_0x0053:
            int r10 = r13.mo33820r()
            if (r7 >= r10) goto L_0x008b
            com.google.android.gms.internal.measurement.g3 r10 = r13.mo33823u(r7)
            r16 = r13
            java.lang.String r13 = r10.mo34025B()
            r17 = r4
            java.lang.String[] r4 = p201q5.C9268o.f13611a
            java.lang.String[] r1 = p201q5.C9268o.f13612b
            java.lang.String r1 = p201q5.C9274u.m19049b(r13, r4, r1)
            if (r1 == 0) goto L_0x0082
            com.google.android.gms.internal.measurement.s8 r4 = r10.mo34557q()
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.C5736f3) r4
            r4.mo33988r(r1)
            com.google.android.gms.internal.measurement.v8 r1 = r4.mo34354l()
            com.google.android.gms.internal.measurement.g3 r1 = (com.google.android.gms.internal.measurement.C5753g3) r1
            r14.mo33822t(r7, r1)
            r15 = 1
        L_0x0082:
            int r7 = r7 + 1
            r1 = r23
            r13 = r16
            r4 = r17
            goto L_0x0053
        L_0x008b:
            r17 = r4
            if (r15 == 0) goto L_0x009c
            r12.mo33694t(r11, r14)
            com.google.android.gms.internal.measurement.v8 r1 = r9.mo34354l()
            com.google.android.gms.internal.measurement.c3 r1 = (com.google.android.gms.internal.measurement.C5685c3) r1
            r3.set(r8, r1)
            r12 = r9
        L_0x009c:
            int r11 = r11 + 1
            r1 = r23
            r4 = r17
            goto L_0x002c
        L_0x00a3:
            r17 = r4
            goto L_0x00a9
        L_0x00a6:
            r17 = r4
            r12 = r9
        L_0x00a9:
            int r1 = r12.mo33693s()
            if (r1 == 0) goto L_0x00e1
            r1 = 0
        L_0x00b0:
            int r4 = r12.mo33693s()
            if (r1 >= r4) goto L_0x00e1
            com.google.android.gms.internal.measurement.n3 r4 = r12.mo33697w(r1)
            java.lang.String r7 = r4.mo34198B()
            java.lang.String[] r10 = p201q5.C9269p.f13615a
            java.lang.String[] r11 = p201q5.C9269p.f13616b
            java.lang.String r7 = p201q5.C9274u.m19049b(r7, r10, r11)
            if (r7 == 0) goto L_0x00de
            com.google.android.gms.internal.measurement.s8 r4 = r4.mo34557q()
            com.google.android.gms.internal.measurement.m3 r4 = (com.google.android.gms.internal.measurement.C5854m3) r4
            r4.mo34176r(r7)
            r12.mo33695u(r1, r4)
            com.google.android.gms.internal.measurement.v8 r4 = r9.mo34354l()
            com.google.android.gms.internal.measurement.c3 r4 = (com.google.android.gms.internal.measurement.C5685c3) r4
            r3.set(r8, r4)
            r12 = r9
        L_0x00de:
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00e1:
            int r8 = r8 + 1
            r1 = r23
            r4 = r17
            goto L_0x0012
        L_0x00e9:
            r17 = r4
            r23.mo35406i()
            r23.mo34778h()
            p231t4.C9713p.m20271f(r24)
            p231t4.C9713p.m20275j(r25)
            android.database.sqlite.SQLiteDatabase r1 = r23.mo35005R()
            r1.beginTransaction()
            r23.mo35406i()     // Catch:{ all -> 0x04ba }
            r23.mo34778h()     // Catch:{ all -> 0x04ba }
            p231t4.C9713p.m20271f(r24)     // Catch:{ all -> 0x04ba }
            android.database.sqlite.SQLiteDatabase r4 = r23.mo35005R()     // Catch:{ all -> 0x04ba }
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04ba }
            r9 = 0
            r8[r9] = r2     // Catch:{ all -> 0x04ba }
            r4.delete(r6, r0, r8)     // Catch:{ all -> 0x04ba }
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04ba }
            r8[r9] = r2     // Catch:{ all -> 0x04ba }
            r4.delete(r5, r0, r8)     // Catch:{ all -> 0x04ba }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04ba }
        L_0x011f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x03c3
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x04ba }
            com.google.android.gms.internal.measurement.c3 r0 = (com.google.android.gms.internal.measurement.C5685c3) r0     // Catch:{ all -> 0x04ba }
            r23.mo35406i()     // Catch:{ all -> 0x04ba }
            r23.mo34778h()     // Catch:{ all -> 0x04ba }
            p231t4.C9713p.m20271f(r24)     // Catch:{ all -> 0x04ba }
            p231t4.C9713p.m20275j(r0)     // Catch:{ all -> 0x04ba }
            boolean r9 = r0.mo33742I()     // Catch:{ all -> 0x04ba }
            if (r9 != 0) goto L_0x0153
            r9 = r23
            com.google.android.gms.measurement.internal.p4 r0 = r9.f7899a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = "Audience with no ID. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24)     // Catch:{ all -> 0x04b8 }
            r0.mo35038b(r7, r8)     // Catch:{ all -> 0x04b8 }
            goto L_0x011f
        L_0x0153:
            r9 = r23
            int r10 = r0.mo33743w()     // Catch:{ all -> 0x04b8 }
            java.util.List r11 = r0.mo33740D()     // Catch:{ all -> 0x04b8 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04b8 }
        L_0x0161:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x018b
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.internal.measurement.e3 r12 = (com.google.android.gms.internal.measurement.C5719e3) r12     // Catch:{ all -> 0x04b8 }
            boolean r12 = r12.mo33887M()     // Catch:{ all -> 0x04b8 }
            if (r12 != 0) goto L_0x0161
            com.google.android.gms.measurement.internal.p4 r0 = r9.f7899a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r0.mo35039c(r7, r8, r10)     // Catch:{ all -> 0x04b8 }
            goto L_0x011f
        L_0x018b:
            java.util.List r11 = r0.mo33741E()     // Catch:{ all -> 0x04b8 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04b8 }
        L_0x0193:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x01be
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.internal.measurement.n3 r12 = (com.google.android.gms.internal.measurement.C5870n3) r12     // Catch:{ all -> 0x04b8 }
            boolean r12 = r12.mo34202H()     // Catch:{ all -> 0x04b8 }
            if (r12 != 0) goto L_0x0193
            com.google.android.gms.measurement.internal.p4 r0 = r9.f7899a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r0.mo35039c(r7, r8, r10)     // Catch:{ all -> 0x04b8 }
            goto L_0x011f
        L_0x01be:
            java.util.List r11 = r0.mo33740D()     // Catch:{ all -> 0x04b8 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04b8 }
        L_0x01c6:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r8 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L_0x02aa
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.internal.measurement.e3 r12 = (com.google.android.gms.internal.measurement.C5719e3) r12     // Catch:{ all -> 0x04b8 }
            r23.mo35406i()     // Catch:{ all -> 0x04b8 }
            r23.mo34778h()     // Catch:{ all -> 0x04b8 }
            p231t4.C9713p.m20271f(r24)     // Catch:{ all -> 0x04b8 }
            p231t4.C9713p.m20275j(r12)     // Catch:{ all -> 0x04b8 }
            java.lang.String r21 = r12.mo33881D()     // Catch:{ all -> 0x04b8 }
            boolean r21 = android.text.TextUtils.isEmpty(r21)     // Catch:{ all -> 0x04b8 }
            if (r21 == 0) goto L_0x0224
            com.google.android.gms.measurement.internal.p4 r0 = r9.f7899a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            boolean r13 = r12.mo33887M()     // Catch:{ all -> 0x04b8 }
            if (r13 == 0) goto L_0x0217
            int r12 = r12.mo33890x()     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04b8 }
            r20 = r12
            goto L_0x0219
        L_0x0217:
            r20 = 0
        L_0x0219:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x04b8 }
            r0.mo35040d(r7, r8, r11, r12)     // Catch:{ all -> 0x04b8 }
            r21 = r4
            goto L_0x0386
        L_0x0224:
            byte[] r3 = r12.mo34044j()     // Catch:{ all -> 0x04b8 }
            r21 = r4
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x04b8 }
            r4.<init>()     // Catch:{ all -> 0x04b8 }
            r4.put(r15, r2)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r4.put(r8, r15)     // Catch:{ all -> 0x04b8 }
            boolean r8 = r12.mo33887M()     // Catch:{ all -> 0x04b8 }
            if (r8 == 0) goto L_0x0248
            int r8 = r12.mo33890x()     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04b8 }
            goto L_0x0249
        L_0x0248:
            r8 = 0
        L_0x0249:
            r4.put(r14, r8)     // Catch:{ all -> 0x04b8 }
            java.lang.String r8 = "event_name"
            java.lang.String r14 = r12.mo33881D()     // Catch:{ all -> 0x04b8 }
            r4.put(r8, r14)     // Catch:{ all -> 0x04b8 }
            boolean r8 = r12.mo33888N()     // Catch:{ all -> 0x04b8 }
            if (r8 == 0) goto L_0x0264
            boolean r8 = r12.mo33885K()     // Catch:{ all -> 0x04b8 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04b8 }
            goto L_0x0265
        L_0x0264:
            r8 = 0
        L_0x0265:
            r4.put(r13, r8)     // Catch:{ all -> 0x04b8 }
            r4.put(r7, r3)     // Catch:{ all -> 0x04b8 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo35005R()     // Catch:{ SQLiteException -> 0x0294 }
            r7 = 5
            r8 = 0
            long r3 = r3.insertWithOnConflict(r5, r8, r4, r7)     // Catch:{ SQLiteException -> 0x0294 }
            r7 = -1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x028e
            com.google.android.gms.measurement.internal.p4 r3 = r9.f7899a     // Catch:{ SQLiteException -> 0x0294 }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ SQLiteException -> 0x0294 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()     // Catch:{ SQLiteException -> 0x0294 }
            java.lang.String r4 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24)     // Catch:{ SQLiteException -> 0x0294 }
            r3.mo35038b(r4, r7)     // Catch:{ SQLiteException -> 0x0294 }
        L_0x028e:
            r3 = r25
            r4 = r21
            goto L_0x01c6
        L_0x0294:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r3 = r9.f7899a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "Error storing event filter. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24)     // Catch:{ all -> 0x04b8 }
            r3.mo35039c(r4, r7, r0)     // Catch:{ all -> 0x04b8 }
            goto L_0x0386
        L_0x02aa:
            r21 = r4
            java.util.List r0 = r0.mo33741E()     // Catch:{ all -> 0x04b8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x04b8 }
        L_0x02b4:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x04b8 }
            if (r3 == 0) goto L_0x03bd
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.internal.measurement.n3 r3 = (com.google.android.gms.internal.measurement.C5870n3) r3     // Catch:{ all -> 0x04b8 }
            r23.mo35406i()     // Catch:{ all -> 0x04b8 }
            r23.mo34778h()     // Catch:{ all -> 0x04b8 }
            p231t4.C9713p.m20271f(r24)     // Catch:{ all -> 0x04b8 }
            p231t4.C9713p.m20275j(r3)     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = r3.mo34198B()     // Catch:{ all -> 0x04b8 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x04b8 }
            if (r4 == 0) goto L_0x0303
            com.google.android.gms.measurement.internal.p4 r0 = r9.f7899a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            boolean r11 = r3.mo34202H()     // Catch:{ all -> 0x04b8 }
            if (r11 == 0) goto L_0x02f9
            int r3 = r3.mo34204w()     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x04b8 }
            goto L_0x02fa
        L_0x02f9:
            r3 = 0
        L_0x02fa:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x04b8 }
            r0.mo35040d(r4, r7, r8, r3)     // Catch:{ all -> 0x04b8 }
            goto L_0x0386
        L_0x0303:
            byte[] r4 = r3.mo34044j()     // Catch:{ all -> 0x04b8 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x04b8 }
            r11.<init>()     // Catch:{ all -> 0x04b8 }
            r11.put(r15, r2)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r11.put(r8, r12)     // Catch:{ all -> 0x04b8 }
            boolean r12 = r3.mo34202H()     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x0325
            int r12 = r3.mo34204w()     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04b8 }
            goto L_0x0326
        L_0x0325:
            r12 = 0
        L_0x0326:
            r11.put(r14, r12)     // Catch:{ all -> 0x04b8 }
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.mo34198B()     // Catch:{ all -> 0x04b8 }
            r11.put(r12, r0)     // Catch:{ all -> 0x04b8 }
            boolean r0 = r3.mo34203I()     // Catch:{ all -> 0x04b8 }
            if (r0 == 0) goto L_0x0343
            boolean r0 = r3.mo34201F()     // Catch:{ all -> 0x04b8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04b8 }
            goto L_0x0344
        L_0x0343:
            r0 = 0
        L_0x0344:
            r11.put(r13, r0)     // Catch:{ all -> 0x04b8 }
            r11.put(r7, r4)     // Catch:{ all -> 0x04b8 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo35005R()     // Catch:{ SQLiteException -> 0x0372 }
            r3 = 0
            r4 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r4)     // Catch:{ SQLiteException -> 0x0372 }
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036e
            com.google.android.gms.measurement.internal.p4 r0 = r9.f7899a     // Catch:{ SQLiteException -> 0x0372 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ SQLiteException -> 0x0372 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()     // Catch:{ SQLiteException -> 0x0372 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24)     // Catch:{ SQLiteException -> 0x0372 }
            r0.mo35038b(r3, r4)     // Catch:{ SQLiteException -> 0x0372 }
            goto L_0x0386
        L_0x036e:
            r0 = r22
            goto L_0x02b4
        L_0x0372:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r3 = r9.f7899a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "Error storing property filter. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24)     // Catch:{ all -> 0x04b8 }
            r3.mo35039c(r4, r7, r0)     // Catch:{ all -> 0x04b8 }
        L_0x0386:
            r23.mo35406i()     // Catch:{ all -> 0x04b8 }
            r23.mo34778h()     // Catch:{ all -> 0x04b8 }
            p231t4.C9713p.m20271f(r24)     // Catch:{ all -> 0x04b8 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo35005R()     // Catch:{ all -> 0x04b8 }
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x04b8 }
            r3 = 0
            r4[r3] = r2     // Catch:{ all -> 0x04b8 }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r7 = 1
            r4[r7] = r3     // Catch:{ all -> 0x04b8 }
            r3 = r17
            r0.delete(r6, r3, r4)     // Catch:{ all -> 0x04b8 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x04b8 }
            r7 = 0
            r4[r7] = r2     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r8 = 1
            r4[r8] = r7     // Catch:{ all -> 0x04b8 }
            r0.delete(r5, r3, r4)     // Catch:{ all -> 0x04b8 }
            r17 = r3
            r4 = r21
            r3 = r25
            goto L_0x011f
        L_0x03bd:
            r3 = r25
            r4 = r21
            goto L_0x011f
        L_0x03c3:
            r3 = 0
            r9 = r23
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x04b8 }
            r0.<init>()     // Catch:{ all -> 0x04b8 }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04b8 }
        L_0x03cf:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x04b8 }
            if (r5 == 0) goto L_0x03ef
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.internal.measurement.c3 r5 = (com.google.android.gms.internal.measurement.C5685c3) r5     // Catch:{ all -> 0x04b8 }
            boolean r6 = r5.mo33742I()     // Catch:{ all -> 0x04b8 }
            if (r6 == 0) goto L_0x03ea
            int r5 = r5.mo33743w()     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x04b8 }
            goto L_0x03eb
        L_0x03ea:
            r8 = r3
        L_0x03eb:
            r0.add(r8)     // Catch:{ all -> 0x04b8 }
            goto L_0x03cf
        L_0x03ef:
            p231t4.C9713p.m20271f(r24)     // Catch:{ all -> 0x04b8 }
            r23.mo35406i()     // Catch:{ all -> 0x04b8 }
            r23.mo34778h()     // Catch:{ all -> 0x04b8 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo35005R()     // Catch:{ all -> 0x04b8 }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x049d }
            r4 = 0
            r5[r4] = r2     // Catch:{ SQLiteException -> 0x049d }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            long r4 = r9.m10770L(r4, r5)     // Catch:{ SQLiteException -> 0x049d }
            com.google.android.gms.measurement.internal.p4 r6 = r9.f7899a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.g r6 = r6.mo35211z()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C6084a3.f7548G     // Catch:{ all -> 0x04b8 }
            int r6 = r6.mo34884o(r2, r7)     // Catch:{ all -> 0x04b8 }
            r7 = 2000(0x7d0, float:2.803E-42)
            int r6 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x04b8 }
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)     // Catch:{ all -> 0x04b8 }
            long r7 = (long) r6     // Catch:{ all -> 0x04b8 }
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0426
            goto L_0x04b1
        L_0x0426:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x04b8 }
            r4.<init>()     // Catch:{ all -> 0x04b8 }
            r5 = 0
        L_0x042c:
            int r7 = r0.size()     // Catch:{ all -> 0x04b8 }
            if (r5 >= r7) goto L_0x0448
            java.lang.Object r7 = r0.get(r5)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x04b8 }
            if (r7 == 0) goto L_0x04b1
            int r7 = r7.intValue()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x04b8 }
            r4.add(r7)     // Catch:{ all -> 0x04b8 }
            int r5 = r5 + 1
            goto L_0x042c
        L_0x0448:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04b8 }
            int r4 = r4.length()     // Catch:{ all -> 0x04b8 }
            r5 = 2
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x04b8 }
            r5.<init>(r4)     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "("
            r5.append(r4)     // Catch:{ all -> 0x04b8 }
            r5.append(r0)     // Catch:{ all -> 0x04b8 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x04b8 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "audience_filter_values"
            int r5 = r0.length()     // Catch:{ all -> 0x04b8 }
            int r5 = r5 + 140
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x04b8 }
            r7.<init>(r5)     // Catch:{ all -> 0x04b8 }
            java.lang.String r5 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r7.append(r5)     // Catch:{ all -> 0x04b8 }
            r7.append(r0)     // Catch:{ all -> 0x04b8 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r7.append(r0)     // Catch:{ all -> 0x04b8 }
            r5 = 2
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x04b8 }
            r5 = 0
            r0[r5] = r2     // Catch:{ all -> 0x04b8 }
            java.lang.String r2 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x04b8 }
            r5 = 1
            r0[r5] = r2     // Catch:{ all -> 0x04b8 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x04b8 }
            r3.delete(r4, r2, r0)     // Catch:{ all -> 0x04b8 }
            goto L_0x04b1
        L_0x049d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r3 = r9.f7899a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "Database error querying filters. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r24)     // Catch:{ all -> 0x04b8 }
            r3.mo35039c(r4, r2, r0)     // Catch:{ all -> 0x04b8 }
        L_0x04b1:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x04b8 }
            r1.endTransaction()
            return
        L_0x04b8:
            r0 = move-exception
            goto L_0x04bd
        L_0x04ba:
            r0 = move-exception
            r9 = r23
        L_0x04bd:
            r1.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6180j.mo35025o(java.lang.String, java.util.List):void");
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo35026p() {
        mo35406i();
        mo35005R().setTransactionSuccessful();
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo35027q(C6306u4 u4Var) {
        C9713p.m20275j(u4Var);
        mo34778h();
        mo35406i();
        String e0 = u4Var.mo35349e0();
        C9713p.m20275j(e0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e0);
        contentValues.put("app_instance_id", u4Var.mo35351f0());
        contentValues.put("gmp_app_id", u4Var.mo35361k0());
        contentValues.put("resettable_device_id_hash", u4Var.mo35342b());
        contentValues.put("last_bundle_index", Long.valueOf(u4Var.mo35339Z()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(u4Var.mo35341a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(u4Var.mo35338Y()));
        contentValues.put("app_version", u4Var.mo35355h0());
        contentValues.put("app_store", u4Var.mo35353g0());
        contentValues.put("gmp_version", Long.valueOf(u4Var.mo35337X()));
        contentValues.put("dev_cert_hash", Long.valueOf(u4Var.mo35334U()));
        contentValues.put("measurement_enabled", Boolean.valueOf(u4Var.mo35324K()));
        contentValues.put("day", Long.valueOf(u4Var.mo35333T()));
        contentValues.put("daily_public_events_count", Long.valueOf(u4Var.mo35331R()));
        contentValues.put("daily_events_count", Long.valueOf(u4Var.mo35330Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(u4Var.mo35328O()));
        contentValues.put("config_fetched_time", Long.valueOf(u4Var.mo35327N()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(u4Var.mo35336W()));
        contentValues.put("app_version_int", Long.valueOf(u4Var.mo35326M()));
        contentValues.put("firebase_instance_id", u4Var.mo35357i0());
        contentValues.put("daily_error_events_count", Long.valueOf(u4Var.mo35329P()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(u4Var.mo35332S()));
        contentValues.put("health_monitor_sample", u4Var.mo35340a());
        contentValues.put("android_id", Long.valueOf(u4Var.mo35314A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(u4Var.mo35323J()));
        contentValues.put("admob_app_id", u4Var.mo35345c0());
        contentValues.put("dynamite_version", Long.valueOf(u4Var.mo35335V()));
        List<String> c = u4Var.mo35344c();
        if (c != null) {
            if (c.size() == 0) {
                this.f7899a.mo34920b().mo35080w().mo35038b("Safelisted events should not be an empty list. appId", e0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c));
            }
        }
        C5831kd.m9523b();
        if (this.f7899a.mo35211z().mo34873B(e0, C6084a3.f7577e0)) {
            contentValues.put("ga_app_id", u4Var.mo35359j0());
        }
        try {
            SQLiteDatabase R = mo35005R();
            if (((long) R.update("apps", contentValues, "app_id = ?", new String[]{e0})) == 0 && R.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f7899a.mo34920b().mo35075r().mo35038b("Failed to insert/update app (got -1). appId", C6206l3.m10862z(e0));
            }
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Error storing app. appId", C6206l3.m10862z(e0), e);
        }
    }

    @WorkerThread
    /* renamed from: r */
    public final void mo35028r(C6246p pVar) {
        long j;
        C9713p.m20275j(pVar);
        mo34778h();
        mo35406i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", pVar.f8066a);
        contentValues.put(HintConstants.AUTOFILL_HINT_NAME, pVar.f8067b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.f8068c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.f8069d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.f8071f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pVar.f8072g));
        contentValues.put("last_bundled_day", pVar.f8073h);
        contentValues.put("last_sampled_complex_event_id", pVar.f8074i);
        contentValues.put("last_sampling_rate", pVar.f8075j);
        contentValues.put("current_session_count", Long.valueOf(pVar.f8070e));
        Boolean bool = pVar.f8076k;
        if (bool == null || !bool.booleanValue()) {
            j = null;
        } else {
            j = 1L;
        }
        contentValues.put("last_exempt_from_sampling", j);
        try {
            if (mo35005R().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f7899a.mo34920b().mo35075r().mo35038b("Failed to insert/update event aggregates (got -1). appId", C6206l3.m10862z(pVar.f8066a));
            }
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Error storing event aggregates. appId", C6206l3.m10862z(pVar.f8066a), e);
        }
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo35029s(String str, byte[] bArr, String str2) {
        C9713p.m20271f(str);
        mo34778h();
        mo35406i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (((long) mo35005R().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                this.f7899a.mo34920b().mo35075r().mo35038b("Failed to update remote config (got 0). appId", C6206l3.m10862z(str));
            }
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Error storing remote config. appId", C6206l3.m10862z(str), e);
        }
    }

    /* renamed from: t */
    public final boolean mo35030t() {
        if (m10770L("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final boolean mo35031u() {
        if (m10770L("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo35032v() {
        if (m10770L("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo35033w() {
        Context f = this.f7899a.mo34927f();
        this.f7899a.mo35211z();
        return f.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: x */
    public final boolean mo35034x(String str, Long l, long j, C5822k4 k4Var) {
        mo34778h();
        mo35406i();
        C9713p.m20275j(k4Var);
        C9713p.m20271f(str);
        C9713p.m20275j(l);
        byte[] j2 = k4Var.mo34044j();
        this.f7899a.mo34920b().mo35079v().mo35039c("Saving complex main event, appId, data size", this.f7899a.mo35182D().mo34899d(str), Integer.valueOf(j2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", j2);
        try {
            if (mo35005R().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f7899a.mo34920b().mo35075r().mo35038b("Failed to insert complex main event (got -1). appId", C6206l3.m10862z(str));
            return false;
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Error storing complex main event. appId", C6206l3.m10862z(str), e);
            return false;
        }
    }

    @WorkerThread
    /* renamed from: y */
    public final boolean mo35035y(C6103c cVar) {
        C9713p.m20275j(cVar);
        mo34778h();
        mo35406i();
        String str = cVar.f7652b;
        C9713p.m20275j(str);
        if (mo35012Z(str, cVar.f7654d.f7907c) == null) {
            long L = m10770L("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f7899a.mo35211z();
            if (L >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", cVar.f7653c);
        contentValues.put(HintConstants.AUTOFILL_HINT_NAME, cVar.f7654d.f7907c);
        m10769J(contentValues, "value", C9713p.m20275j(cVar.f7654d.mo35057A()));
        contentValues.put("active", Boolean.valueOf(cVar.f7656f));
        contentValues.put("trigger_event_name", cVar.f7657g);
        contentValues.put("trigger_timeout", Long.valueOf(cVar.f7659i));
        contentValues.put("timed_out_event", this.f7899a.mo35191N().mo35137c0(cVar.f7658h));
        contentValues.put("creation_timestamp", Long.valueOf(cVar.f7655e));
        contentValues.put("triggered_event", this.f7899a.mo35191N().mo35137c0(cVar.f7660j));
        contentValues.put("triggered_timestamp", Long.valueOf(cVar.f7654d.f7908d));
        contentValues.put("time_to_live", Long.valueOf(cVar.f7661k));
        contentValues.put("expired_event", this.f7899a.mo35191N().mo35137c0(cVar.f7662l));
        try {
            if (mo35005R().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f7899a.mo34920b().mo35075r().mo35038b("Failed to insert/update conditional user property (got -1)", C6206l3.m10862z(str));
            }
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Error storing conditional user property", C6206l3.m10862z(str), e);
        }
        return true;
    }

    @WorkerThread
    /* renamed from: z */
    public final boolean mo35036z(C6212l9 l9Var) {
        C9713p.m20275j(l9Var);
        mo34778h();
        mo35406i();
        if (mo35012Z(l9Var.f7960a, l9Var.f7962c) == null) {
            if (C6234n9.m10922W(l9Var.f7962c)) {
                if (m10770L("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{l9Var.f7960a}) >= ((long) this.f7899a.mo35211z().mo34885p(l9Var.f7960a, C6084a3.f7549H, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(l9Var.f7962c)) {
                long L = m10770L("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{l9Var.f7960a, l9Var.f7961b});
                this.f7899a.mo35211z();
                if (L >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", l9Var.f7960a);
        contentValues.put("origin", l9Var.f7961b);
        contentValues.put(HintConstants.AUTOFILL_HINT_NAME, l9Var.f7962c);
        contentValues.put("set_timestamp", Long.valueOf(l9Var.f7963d));
        m10769J(contentValues, "value", l9Var.f7964e);
        try {
            if (mo35005R().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f7899a.mo34920b().mo35075r().mo35038b("Failed to insert/update user property (got -1). appId", C6206l3.m10862z(l9Var.f7960a));
            }
        } catch (SQLiteException e) {
            this.f7899a.mo34920b().mo35075r().mo35039c("Error storing user property. appId", C6206l3.m10862z(l9Var.f7960a), e);
        }
        return true;
    }
}
