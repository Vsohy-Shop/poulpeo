package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;
import p201q5.C9277x;

/* renamed from: com.google.android.gms.measurement.internal.aa */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6091aa extends C6343x8 {

    /* renamed from: d */
    private String f7633d;

    /* renamed from: e */
    private Set<Integer> f7634e;

    /* renamed from: f */
    private Map<Integer, C6322v9> f7635f;

    /* renamed from: g */
    private Long f7636g;

    /* renamed from: h */
    private Long f7637h;

    C6091aa(C6157g9 g9Var) {
        super(g9Var);
    }

    /* renamed from: n */
    private final C6322v9 m10458n(Integer num) {
        if (this.f7635f.containsKey(num)) {
            return this.f7635f.get(num);
        }
        C6322v9 v9Var = new C6322v9(this, this.f7633d, (C9277x) null);
        this.f7635f.put(num, v9Var);
        return v9Var;
    }

    /* renamed from: o */
    private final boolean m10459o(int i, int i2) {
        C6322v9 v9Var = this.f7635f.get(Integer.valueOf(i));
        if (v9Var == null) {
            return false;
        }
        return v9Var.f8340d.get(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo34749l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0302, code lost:
        if (r5 != null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x072e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x072f, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0731, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0732, code lost:
        r29 = r2;
        r28 = r4;
        r25 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0750, code lost:
        if (r11 != null) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x075b, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x090a, code lost:
        if (r13 == null) goto L_0x090d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0a36, code lost:
        if (r7 != false) goto L_0x0a41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0171, code lost:
        if (r5 != null) goto L_0x014f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x072e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:239:0x067b] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x075b  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x081d  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0915  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0a67  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0afb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b0 A[Catch:{ SQLiteException -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01be A[SYNTHETIC, Splitter:B:65:0x01be] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0249  */
    @androidx.annotation.WorkerThread
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.C5754g4> mo34750m(java.lang.String r66, java.util.List<com.google.android.gms.internal.measurement.C5822k4> r67, java.util.List<com.google.android.gms.internal.measurement.C5721e5> r68, java.lang.Long r69, java.lang.Long r70) {
        /*
            r65 = this;
            r10 = r65
            java.lang.String r11 = "current_results"
            p231t4.C9713p.m20271f(r66)
            p231t4.C9713p.m20275j(r67)
            p231t4.C9713p.m20275j(r68)
            r0 = r66
            r10.f7633d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f7634e = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r10.f7635f = r0
            r0 = r69
            r10.f7636g = r0
            r0 = r70
            r10.f7637h = r0
            java.util.Iterator r0 = r67.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.k4 r1 = (com.google.android.gms.internal.measurement.C5822k4) r1
            java.lang.String r1 = r1.mo34134E()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = r13
            goto L_0x0048
        L_0x0047:
            r1 = r12
        L_0x0048:
            com.google.android.gms.internal.measurement.C6055yc.m10320b()
            com.google.android.gms.measurement.internal.p4 r0 = r10.f7899a
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()
            java.lang.String r2 = r10.f7633d
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C6084a3.f7569a0
            boolean r14 = r0.mo34873B(r2, r3)
            com.google.android.gms.internal.measurement.C6055yc.m10320b()
            com.google.android.gms.measurement.internal.p4 r0 = r10.f7899a
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()
            java.lang.String r2 = r10.f7633d
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C6084a3.f7567Z
            boolean r15 = r0.mo34873B(r2, r3)
            if (r1 == 0) goto L_0x00af
            com.google.android.gms.measurement.internal.g9 r0 = r10.f8374b
            com.google.android.gms.measurement.internal.j r2 = r0.mo34914V()
            java.lang.String r3 = r10.f7633d
            r2.mo35406i()
            r2.mo34778h()
            p231t4.C9713p.m20271f(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r4 = "current_session_count"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r0.put(r4, r5)
            android.database.sqlite.SQLiteDatabase r4 = r2.mo35005R()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x009b }
            r5[r12] = r3     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)
            r2.mo35039c(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r9 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r15 == 0) goto L_0x017a
            if (r14 == 0) goto L_0x017a
            com.google.android.gms.measurement.internal.g9 r0 = r10.f8374b
            com.google.android.gms.measurement.internal.j r2 = r0.mo34914V()
            java.lang.String r3 = r10.f7633d
            p231t4.C9713p.m20271f(r3)
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.mo35005R()
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            r0[r12] = r3     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0155 }
            if (r0 == 0) goto L_0x014b
        L_0x00f1:
            byte[] r0 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0155 }
            com.google.android.gms.internal.measurement.d3 r13 = com.google.android.gms.internal.measurement.C5719e3.m9068y()     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.x9 r0 = com.google.android.gms.measurement.internal.C6179i9.m10729D(r13, r0)     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.d3 r0 = (com.google.android.gms.internal.measurement.C5702d3) r0     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.v8 r0 = r0.mo34354l()     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.e3 r0 = (com.google.android.gms.internal.measurement.C5719e3) r0     // Catch:{ IOException -> 0x012b }
            boolean r13 = r0.mo33886L()     // Catch:{ SQLiteException -> 0x0155 }
            if (r13 != 0) goto L_0x010c
            goto L_0x013d
        L_0x010c:
            int r13 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Object r16 = r4.get(r13)     // Catch:{ SQLiteException -> 0x0155 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0155 }
            if (r16 != 0) goto L_0x0125
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0155 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0155 }
            r4.put(r13, r12)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x0127
        L_0x0125:
            r12 = r16
        L_0x0127:
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x013d
        L_0x012b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r12 = r2.f7899a     // Catch:{ SQLiteException -> 0x0155 }
            com.google.android.gms.measurement.internal.l3 r12 = r12.mo34920b()     // Catch:{ SQLiteException -> 0x0155 }
            com.google.android.gms.measurement.internal.j3 r12 = r12.mo35075r()     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ SQLiteException -> 0x0155 }
            r12.mo35039c(r9, r13, r0)     // Catch:{ SQLiteException -> 0x0155 }
        L_0x013d:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0155 }
            if (r0 != 0) goto L_0x0148
            r5.close()
            r12 = r4
            goto L_0x017b
        L_0x0148:
            r12 = 0
            r13 = 1
            goto L_0x00f1
        L_0x014b:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0155 }
        L_0x014f:
            r5.close()
            goto L_0x017a
        L_0x0153:
            r0 = move-exception
            goto L_0x0174
        L_0x0155:
            r0 = move-exception
            goto L_0x015c
        L_0x0157:
            r0 = move-exception
            r5 = 0
            goto L_0x0174
        L_0x015a:
            r0 = move-exception
            r5 = 0
        L_0x015c:
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a     // Catch:{ all -> 0x0153 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x0153 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0153 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ all -> 0x0153 }
            r2.mo35039c(r8, r3, r0)     // Catch:{ all -> 0x0153 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0153 }
            if (r5 == 0) goto L_0x017a
            goto L_0x014f
        L_0x0174:
            if (r5 == 0) goto L_0x0179
            r5.close()
        L_0x0179:
            throw r0
        L_0x017a:
            r12 = r0
        L_0x017b:
            com.google.android.gms.measurement.internal.g9 r0 = r10.f8374b
            com.google.android.gms.measurement.internal.j r2 = r0.mo34914V()
            java.lang.String r3 = r10.f7633d
            r2.mo35406i()
            r2.mo34778h()
            p231t4.C9713p.m20271f(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.mo35005R()
            java.lang.String[] r18 = new java.lang.String[]{r6, r11}     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            r4 = 0
            r0[r4] = r3     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            java.lang.String r17 = "audience_filter_values"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0220 }
            if (r0 != 0) goto L_0x01be
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0220 }
            r4.close()
            r13 = r0
            r18 = r6
            r19 = r7
            goto L_0x024d
        L_0x01be:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap     // Catch:{ SQLiteException -> 0x0220 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0220 }
        L_0x01c3:
            r13 = 0
            int r16 = r4.getInt(r13)     // Catch:{ SQLiteException -> 0x0220 }
            r13 = 1
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0220 }
            com.google.android.gms.internal.measurement.z4 r13 = com.google.android.gms.internal.measurement.C5653a5.m8736C()     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.x9 r0 = com.google.android.gms.measurement.internal.C6179i9.m10729D(r13, r0)     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.z4 r0 = (com.google.android.gms.internal.measurement.C6063z4) r0     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.v8 r0 = r0.mo34354l()     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.a5 r0 = (com.google.android.gms.internal.measurement.C5653a5) r0     // Catch:{ IOException -> 0x01eb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0220 }
            r5.put(r13, r0)     // Catch:{ SQLiteException -> 0x0220 }
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x0209
        L_0x01eb:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r13 = r2.f7899a     // Catch:{ SQLiteException -> 0x0220 }
            com.google.android.gms.measurement.internal.l3 r13 = r13.mo34920b()     // Catch:{ SQLiteException -> 0x0220 }
            com.google.android.gms.measurement.internal.j3 r13 = r13.mo35075r()     // Catch:{ SQLiteException -> 0x0220 }
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ SQLiteException -> 0x021e }
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x021c }
            r13.mo35040d(r5, r6, r7, r0)     // Catch:{ SQLiteException -> 0x021c }
        L_0x0209:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021c }
            if (r0 != 0) goto L_0x0215
            r4.close()
            r13 = r17
            goto L_0x024d
        L_0x0215:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x01c3
        L_0x021c:
            r0 = move-exception
            goto L_0x0230
        L_0x021e:
            r0 = move-exception
            goto L_0x0223
        L_0x0220:
            r0 = move-exception
            r18 = r6
        L_0x0223:
            r19 = r7
            goto L_0x0230
        L_0x0226:
            r0 = move-exception
            r5 = 0
            goto L_0x0af9
        L_0x022a:
            r0 = move-exception
            r18 = r6
            r19 = r7
            r4 = 0
        L_0x0230:
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a     // Catch:{ all -> 0x0af7 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x0af7 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0af7 }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ all -> 0x0af7 }
            r2.mo35039c(r5, r3, r0)     // Catch:{ all -> 0x0af7 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0af7 }
            if (r4 == 0) goto L_0x024c
            r4.close()
        L_0x024c:
            r13 = r0
        L_0x024d:
            boolean r0 = r13.isEmpty()
            r7 = 2
            if (r0 == 0) goto L_0x025e
        L_0x0254:
            r12 = r8
            r30 = r9
            r28 = r18
            r29 = r19
            r13 = 0
            goto L_0x0587
        L_0x025e:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r13.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x03d4
            java.lang.String r1 = r10.f7633d
            p231t4.C9713p.m20271f(r1)
            p231t4.C9713p.m20275j(r13)
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x027e
            goto L_0x03cc
        L_0x027e:
            com.google.android.gms.measurement.internal.g9 r0 = r10.f8374b
            com.google.android.gms.measurement.internal.j r4 = r0.mo34914V()
            r4.mo35406i()
            r4.mo34778h()
            p231t4.C9713p.m20271f(r1)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r4.mo35005R()
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            r16 = 0
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            r16 = 1
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 == 0) goto L_0x02db
        L_0x02ac:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02e3 }
            if (r7 != 0) goto L_0x02c5
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02e3 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02e3 }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02e3 }
        L_0x02c5:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02e3 }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 != 0) goto L_0x02ac
        L_0x02d7:
            r5.close()
            goto L_0x0305
        L_0x02db:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02e3 }
            goto L_0x02d7
        L_0x02e0:
            r0 = move-exception
            goto L_0x03ce
        L_0x02e3:
            r0 = move-exception
            goto L_0x02eb
        L_0x02e5:
            r0 = move-exception
            r5 = 0
            goto L_0x03ce
        L_0x02e9:
            r0 = move-exception
            r5 = 0
        L_0x02eb:
            com.google.android.gms.measurement.internal.p4 r4 = r4.f7899a     // Catch:{ all -> 0x02e0 }
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()     // Catch:{ all -> 0x02e0 }
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35075r()     // Catch:{ all -> 0x02e0 }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r1)     // Catch:{ all -> 0x02e0 }
            r4.mo35039c(r6, r1, r0)     // Catch:{ all -> 0x02e0 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x02e0 }
            if (r5 == 0) goto L_0x0305
            goto L_0x02d7
        L_0x0305:
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x030d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03cc
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r13.get(r5)
            com.google.android.gms.internal.measurement.a5 r6 = (com.google.android.gms.internal.measurement.C5653a5) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x03bf
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0337
            goto L_0x03bf
        L_0x0337:
            com.google.android.gms.measurement.internal.g9 r5 = r10.f8374b
            com.google.android.gms.measurement.internal.i9 r5 = r5.mo34928f0()
            r17 = r0
            java.util.List r0 = r6.mo33652I()
            java.util.List r0 = r5.mo34991I(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x03bb
            com.google.android.gms.internal.measurement.s8 r5 = r6.mo34557q()
            com.google.android.gms.internal.measurement.z4 r5 = (com.google.android.gms.internal.measurement.C6063z4) r5
            r5.mo34679v()
            r5.mo34676s(r0)
            com.google.android.gms.measurement.internal.g9 r0 = r10.f8374b
            com.google.android.gms.measurement.internal.i9 r0 = r0.mo34928f0()
            r20 = r1
            java.util.List r1 = r6.mo33654K()
            java.util.List r0 = r0.mo34991I(r1, r7)
            r5.mo34680w()
            r5.mo34678u(r0)
            r0 = 0
        L_0x0370:
            int r1 = r6.mo33655w()
            if (r0 >= r1) goto L_0x038e
            com.google.android.gms.internal.measurement.i4 r1 = r6.mo33649B(r0)
            int r1 = r1.mo34089w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x038b
            r5.mo34681x(r0)
        L_0x038b:
            int r0 = r0 + 1
            goto L_0x0370
        L_0x038e:
            r0 = 0
        L_0x038f:
            int r1 = r6.mo33657y()
            if (r0 >= r1) goto L_0x03ad
            com.google.android.gms.internal.measurement.c5 r1 = r6.mo33650F(r0)
            int r1 = r1.mo33750x()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x03aa
            r5.mo34682y(r0)
        L_0x03aa:
            int r0 = r0 + 1
            goto L_0x038f
        L_0x03ad:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.internal.measurement.v8 r1 = r5.mo34354l()
            com.google.android.gms.internal.measurement.a5 r1 = (com.google.android.gms.internal.measurement.C5653a5) r1
            r3.put(r0, r1)
            goto L_0x03c6
        L_0x03bb:
            r0 = r17
            goto L_0x030d
        L_0x03bf:
            r17 = r0
            r20 = r1
            r3.put(r5, r6)
        L_0x03c6:
            r0 = r17
            r1 = r20
            goto L_0x030d
        L_0x03cc:
            r0 = r3
            goto L_0x03d5
        L_0x03ce:
            if (r5 == 0) goto L_0x03d3
            r5.close()
        L_0x03d3:
            throw r0
        L_0x03d4:
            r0 = r13
        L_0x03d5:
            java.util.Iterator r17 = r2.iterator()
        L_0x03d9:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0254
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r20 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.a5 r1 = (com.google.android.gms.internal.measurement.C5653a5) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            if (r1 == 0) goto L_0x0441
            int r2 = r1.mo33655w()
            if (r2 != 0) goto L_0x040b
            goto L_0x0441
        L_0x040b:
            java.util.List r2 = r1.mo33651H()
            java.util.Iterator r2 = r2.iterator()
        L_0x0413:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0441
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.i4 r3 = (com.google.android.gms.internal.measurement.C5788i4) r3
            boolean r4 = r3.mo34088E()
            if (r4 == 0) goto L_0x0413
            int r4 = r3.mo34089w()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r21 = r3.mo34087D()
            if (r21 == 0) goto L_0x043c
            long r21 = r3.mo34090x()
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            goto L_0x043d
        L_0x043c:
            r3 = 0
        L_0x043d:
            r7.put(r4, r3)
            goto L_0x0413
        L_0x0441:
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            if (r1 == 0) goto L_0x0491
            int r2 = r1.mo33657y()
            if (r2 != 0) goto L_0x044f
            goto L_0x0491
        L_0x044f:
            java.util.List r2 = r1.mo33653J()
            java.util.Iterator r2 = r2.iterator()
        L_0x0457:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0491
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.c5 r3 = (com.google.android.gms.internal.measurement.C5687c5) r3
            boolean r21 = r3.mo33748F()
            if (r21 == 0) goto L_0x0457
            int r21 = r3.mo33749w()
            if (r21 <= 0) goto L_0x0457
            int r21 = r3.mo33750x()
            r22 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            int r21 = r3.mo33749w()
            r23 = r2
            int r2 = r21 + -1
            long r2 = r3.mo33751y(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r0, r2)
            r0 = r22
            r2 = r23
            goto L_0x0457
        L_0x0491:
            r22 = r0
            if (r1 == 0) goto L_0x04e6
            r0 = 0
        L_0x0496:
            int r2 = r1.mo33658z()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x04e6
            java.util.List r2 = r1.mo33654K()
            boolean r2 = com.google.android.gms.measurement.internal.C6179i9.m10732N(r2, r0)
            if (r2 == 0) goto L_0x04d4
            com.google.android.gms.measurement.internal.p4 r2 = r10.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35079v()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r23 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r2.mo35039c(r9, r3, r8)
            r6.set(r0)
            java.util.List r2 = r1.mo33652I()
            boolean r2 = com.google.android.gms.measurement.internal.C6179i9.m10732N(r2, r0)
            if (r2 == 0) goto L_0x04d8
            r5.set(r0)
            goto L_0x04df
        L_0x04d4:
            r21 = r8
            r23 = r9
        L_0x04d8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x04df:
            int r0 = r0 + 1
            r8 = r21
            r9 = r23
            goto L_0x0496
        L_0x04e6:
            r21 = r8
            r23 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r13.get(r0)
            r8 = r1
            com.google.android.gms.internal.measurement.a5 r8 = (com.google.android.gms.internal.measurement.C5653a5) r8
            if (r15 == 0) goto L_0x0555
            if (r14 == 0) goto L_0x0555
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0555
            java.lang.Long r1 = r10.f7637h
            if (r1 == 0) goto L_0x0555
            java.lang.Long r1 = r10.f7636g
            if (r1 != 0) goto L_0x050a
            goto L_0x0555
        L_0x050a:
            java.util.Iterator r0 = r0.iterator()
        L_0x050e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0555
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.e3 r1 = (com.google.android.gms.internal.measurement.C5719e3) r1
            int r2 = r1.mo33890x()
            java.lang.Long r3 = r10.f7637h
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.mo33884J()
            if (r1 == 0) goto L_0x0536
            java.lang.Long r1 = r10.f7636g
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x0536:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x0547
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x0547:
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x050e
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r4.put(r1, r2)
            goto L_0x050e
        L_0x0555:
            com.google.android.gms.measurement.internal.v9 r0 = new com.google.android.gms.measurement.internal.v9
            java.lang.String r3 = r10.f7633d
            r9 = 0
            r1 = r0
            r2 = r65
            r24 = r4
            r4 = r8
            r8 = 0
            r28 = r18
            r29 = r19
            r16 = r12
            r66 = r13
            r12 = r21
            r13 = r8
            r8 = r24
            r30 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.v9> r1 = r10.f7635f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.put(r2, r0)
            r13 = r66
            r8 = r12
            r12 = r16
            r0 = r22
            r9 = r30
            goto L_0x03d9
        L_0x0587:
            boolean r0 = r67.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x0593
        L_0x058f:
            r25 = r11
            goto L_0x0813
        L_0x0593:
            com.google.android.gms.measurement.internal.w9 r2 = new com.google.android.gms.measurement.internal.w9
            r2.<init>(r10, r13)
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.util.Iterator r4 = r67.iterator()
        L_0x05a1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x058f
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.measurement.k4 r0 = (com.google.android.gms.internal.measurement.C5822k4) r0
            java.lang.String r5 = r10.f7633d
            com.google.android.gms.internal.measurement.k4 r5 = r2.mo35399a(r5, r0)
            if (r5 == 0) goto L_0x0810
            com.google.android.gms.measurement.internal.g9 r6 = r10.f8374b
            com.google.android.gms.measurement.internal.j r6 = r6.mo34914V()
            java.lang.String r7 = r10.f7633d
            java.lang.String r8 = r5.mo34134E()
            java.lang.String r9 = r0.mo34134E()
            com.google.android.gms.measurement.internal.p r9 = r6.mo35011X(r7, r9)
            if (r9 != 0) goto L_0x060a
            com.google.android.gms.measurement.internal.p4 r9 = r6.f7899a
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35080w()
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r7)
            com.google.android.gms.measurement.internal.p4 r6 = r6.f7899a
            com.google.android.gms.measurement.internal.g3 r6 = r6.mo35182D()
            java.lang.String r6 = r6.mo34899d(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r9.mo35039c(r8, r14, r6)
            com.google.android.gms.measurement.internal.p r6 = new com.google.android.gms.measurement.internal.p
            r31 = r6
            java.lang.String r33 = r0.mo34134E()
            r34 = 1
            r36 = 1
            r38 = 1
            long r40 = r0.mo34142z()
            r42 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r32 = r7
            r31.<init>(r32, r33, r34, r36, r38, r40, r42, r44, r45, r46, r47)
            goto L_0x063f
        L_0x060a:
            com.google.android.gms.measurement.internal.p r6 = new com.google.android.gms.measurement.internal.p
            r48 = r6
            java.lang.String r0 = r9.f8066a
            r49 = r0
            java.lang.String r0 = r9.f8067b
            r50 = r0
            long r7 = r9.f8068c
            r14 = 1
            long r51 = r7 + r14
            long r7 = r9.f8069d
            long r53 = r7 + r14
            long r7 = r9.f8070e
            long r55 = r7 + r14
            long r7 = r9.f8071f
            r57 = r7
            long r7 = r9.f8072g
            r59 = r7
            java.lang.Long r0 = r9.f8073h
            r61 = r0
            java.lang.Long r0 = r9.f8074i
            r62 = r0
            java.lang.Long r0 = r9.f8075j
            r63 = r0
            java.lang.Boolean r0 = r9.f8076k
            r64 = r0
            r48.<init>(r49, r50, r51, r53, r55, r57, r59, r61, r62, r63, r64)
        L_0x063f:
            com.google.android.gms.measurement.internal.g9 r0 = r10.f8374b
            com.google.android.gms.measurement.internal.j r0 = r0.mo34914V()
            r0.mo35028r(r6)
            long r7 = r6.f8068c
            java.lang.String r9 = r5.mo34134E()
            java.lang.Object r0 = r3.get(r9)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x075f
            com.google.android.gms.measurement.internal.g9 r0 = r10.f8374b
            com.google.android.gms.measurement.internal.j r14 = r0.mo34914V()
            java.lang.String r15 = r10.f7633d
            r14.mo35406i()
            r14.mo34778h()
            p231t4.C9713p.m20271f(r15)
            p231t4.C9713p.m20271f(r9)
            androidx.collection.ArrayMap r13 = new androidx.collection.ArrayMap
            r13.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r14.mo35005R()
            r24 = r2
            r67 = r4
            r4 = r28
            r2 = r29
            java.lang.String[] r18 = new java.lang.String[]{r4, r2}     // Catch:{ SQLiteException -> 0x0731, all -> 0x072e }
            r25 = r11
            r11 = 2
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            r17 = 0
            r0[r17] = r15     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            r17 = 1
            r0[r17] = r9     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=? AND event_name=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r11 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0720 }
            if (r0 == 0) goto L_0x0710
            r29 = r2
        L_0x06a4:
            r2 = 1
            byte[] r0 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x070e }
            com.google.android.gms.internal.measurement.d3 r2 = com.google.android.gms.internal.measurement.C5719e3.m9068y()     // Catch:{ IOException -> 0x06e1 }
            com.google.android.gms.internal.measurement.x9 r0 = com.google.android.gms.measurement.internal.C6179i9.m10729D(r2, r0)     // Catch:{ IOException -> 0x06e1 }
            com.google.android.gms.internal.measurement.d3 r0 = (com.google.android.gms.internal.measurement.C5702d3) r0     // Catch:{ IOException -> 0x06e1 }
            com.google.android.gms.internal.measurement.v8 r0 = r0.mo34354l()     // Catch:{ IOException -> 0x06e1 }
            com.google.android.gms.internal.measurement.e3 r0 = (com.google.android.gms.internal.measurement.C5719e3) r0     // Catch:{ IOException -> 0x06e1 }
            r2 = 0
            int r16 = r11.getInt(r2)     // Catch:{ SQLiteException -> 0x070e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x070e }
            java.lang.Object r16 = r13.get(r2)     // Catch:{ SQLiteException -> 0x070e }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x070e }
            if (r16 != 0) goto L_0x06d5
            r28 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x070c }
            r4.<init>()     // Catch:{ SQLiteException -> 0x070c }
            r13.put(r2, r4)     // Catch:{ SQLiteException -> 0x070c }
            goto L_0x06d9
        L_0x06d5:
            r28 = r4
            r4 = r16
        L_0x06d9:
            r4.add(r0)     // Catch:{ SQLiteException -> 0x070c }
            r16 = r13
            r13 = r30
            goto L_0x06f9
        L_0x06e1:
            r0 = move-exception
            r28 = r4
            com.google.android.gms.measurement.internal.p4 r2 = r14.f7899a     // Catch:{ SQLiteException -> 0x070c }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ SQLiteException -> 0x070c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ SQLiteException -> 0x070c }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r15)     // Catch:{ SQLiteException -> 0x070c }
            r16 = r13
            r13 = r30
            r2.mo35039c(r13, r4, r0)     // Catch:{ SQLiteException -> 0x071e }
        L_0x06f9:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x071e }
            if (r0 != 0) goto L_0x0705
            r11.close()
            r0 = r16
            goto L_0x0753
        L_0x0705:
            r30 = r13
            r13 = r16
            r4 = r28
            goto L_0x06a4
        L_0x070c:
            r0 = move-exception
            goto L_0x0725
        L_0x070e:
            r0 = move-exception
            goto L_0x0723
        L_0x0710:
            r29 = r2
            r28 = r4
            r13 = r30
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x071e }
        L_0x071a:
            r11.close()
            goto L_0x0753
        L_0x071e:
            r0 = move-exception
            goto L_0x073b
        L_0x0720:
            r0 = move-exception
            r29 = r2
        L_0x0723:
            r28 = r4
        L_0x0725:
            r13 = r30
            goto L_0x073b
        L_0x0728:
            r0 = move-exception
            r29 = r2
            r28 = r4
            goto L_0x0738
        L_0x072e:
            r0 = move-exception
            r5 = 0
            goto L_0x0759
        L_0x0731:
            r0 = move-exception
            r29 = r2
            r28 = r4
            r25 = r11
        L_0x0738:
            r13 = r30
            r11 = 0
        L_0x073b:
            com.google.android.gms.measurement.internal.p4 r2 = r14.f7899a     // Catch:{ all -> 0x0757 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x0757 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0757 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r15)     // Catch:{ all -> 0x0757 }
            r2.mo35039c(r12, r4, r0)     // Catch:{ all -> 0x0757 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0757 }
            if (r11 == 0) goto L_0x0753
            goto L_0x071a
        L_0x0753:
            r3.put(r9, r0)
            goto L_0x0767
        L_0x0757:
            r0 = move-exception
            r5 = r11
        L_0x0759:
            if (r5 == 0) goto L_0x075e
            r5.close()
        L_0x075e:
            throw r0
        L_0x075f:
            r24 = r2
            r67 = r4
            r25 = r11
            r13 = r30
        L_0x0767:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x076f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0808
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set<java.lang.Integer> r9 = r10.f7634e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x0799
            com.google.android.gms.measurement.internal.p4 r4 = r10.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35079v()
            r4.mo35038b(r1, r11)
            goto L_0x076f
        L_0x0799:
            java.lang.Object r9 = r0.get(r11)
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
            r11 = 1
        L_0x07a4:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x07f3
            java.lang.Object r11 = r9.next()
            com.google.android.gms.internal.measurement.e3 r11 = (com.google.android.gms.internal.measurement.C5719e3) r11
            com.google.android.gms.measurement.internal.x9 r15 = new com.google.android.gms.measurement.internal.x9
            java.lang.String r14 = r10.f7633d
            r15.<init>(r10, r14, r4, r11)
            java.lang.Long r14 = r10.f7636g
            r22 = r0
            java.lang.Long r0 = r10.f7637h
            int r11 = r11.mo33890x()
            boolean r21 = r10.m10459o(r4, r11)
            r11 = r14
            r14 = r15
            r23 = r2
            r2 = r15
            r15 = r11
            r16 = r0
            r17 = r5
            r18 = r7
            r20 = r6
            boolean r11 = r14.mo35412k(r15, r16, r17, r18, r20, r21)
            if (r11 == 0) goto L_0x07e9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.measurement.internal.v9 r0 = r10.m10458n(r0)
            r0.mo35392c(r2)
            r0 = r22
            r2 = r23
            goto L_0x07a4
        L_0x07e9:
            java.util.Set<java.lang.Integer> r0 = r10.f7634e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.add(r2)
            goto L_0x07f7
        L_0x07f3:
            r22 = r0
            r23 = r2
        L_0x07f7:
            if (r11 != 0) goto L_0x0802
            java.util.Set<java.lang.Integer> r0 = r10.f7634e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.add(r2)
        L_0x0802:
            r0 = r22
            r2 = r23
            goto L_0x076f
        L_0x0808:
            r4 = r67
            r30 = r13
            r2 = r24
            r11 = r25
        L_0x0810:
            r13 = 0
            goto L_0x05a1
        L_0x0813:
            boolean r0 = r68.isEmpty()
            if (r0 == 0) goto L_0x081d
        L_0x0819:
            r11 = r28
            goto L_0x0a4d
        L_0x081d:
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.util.Iterator r3 = r68.iterator()
        L_0x0826:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0819
            java.lang.Object r0 = r3.next()
            r4 = r0
            com.google.android.gms.internal.measurement.e5 r4 = (com.google.android.gms.internal.measurement.C5721e5) r4
            java.lang.String r5 = r4.mo33891C()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0919
            com.google.android.gms.measurement.internal.g9 r0 = r10.f8374b
            com.google.android.gms.measurement.internal.j r6 = r0.mo34914V()
            java.lang.String r7 = r10.f7633d
            r6.mo35406i()
            r6.mo34778h()
            p231t4.C9713p.m20271f(r7)
            p231t4.C9713p.m20271f(r5)
            androidx.collection.ArrayMap r8 = new androidx.collection.ArrayMap
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r13 = r6.mo35005R()
            r11 = r28
            r9 = r29
            java.lang.String[] r15 = new java.lang.String[]{r11, r9}     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            r14 = 2
            java.lang.String[] r0 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            r14 = 0
            r0[r14] = r7     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            r14 = 1
            r0[r14] = r5     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            java.lang.String r14 = "property_filters"
            java.lang.String r16 = "app_id=? AND property_name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x08ea }
            if (r0 == 0) goto L_0x08de
        L_0x0883:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x08ea }
            com.google.android.gms.internal.measurement.m3 r15 = com.google.android.gms.internal.measurement.C5870n3.m9664y()     // Catch:{ IOException -> 0x08ba }
            com.google.android.gms.internal.measurement.x9 r0 = com.google.android.gms.measurement.internal.C6179i9.m10729D(r15, r0)     // Catch:{ IOException -> 0x08ba }
            com.google.android.gms.internal.measurement.m3 r0 = (com.google.android.gms.internal.measurement.C5854m3) r0     // Catch:{ IOException -> 0x08ba }
            com.google.android.gms.internal.measurement.v8 r0 = r0.mo34354l()     // Catch:{ IOException -> 0x08ba }
            com.google.android.gms.internal.measurement.n3 r0 = (com.google.android.gms.internal.measurement.C5870n3) r0     // Catch:{ IOException -> 0x08ba }
            r15 = 0
            int r16 = r13.getInt(r15)     // Catch:{ SQLiteException -> 0x08ea }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x08ea }
            java.lang.Object r16 = r8.get(r14)     // Catch:{ SQLiteException -> 0x08ea }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x08ea }
            if (r16 != 0) goto L_0x08b2
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x08ea }
            r15.<init>()     // Catch:{ SQLiteException -> 0x08ea }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x08ea }
            goto L_0x08b4
        L_0x08b2:
            r15 = r16
        L_0x08b4:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x08ea }
            r67 = r3
            goto L_0x08d0
        L_0x08ba:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r14 = r6.f7899a     // Catch:{ SQLiteException -> 0x08ea }
            com.google.android.gms.measurement.internal.l3 r14 = r14.mo34920b()     // Catch:{ SQLiteException -> 0x08ea }
            com.google.android.gms.measurement.internal.j3 r14 = r14.mo35075r()     // Catch:{ SQLiteException -> 0x08ea }
            java.lang.String r15 = "Failed to merge filter"
            r67 = r3
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r7)     // Catch:{ SQLiteException -> 0x08e8 }
            r14.mo35039c(r15, r3, r0)     // Catch:{ SQLiteException -> 0x08e8 }
        L_0x08d0:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x08e8 }
            if (r0 != 0) goto L_0x08db
            r13.close()
            r0 = r8
            goto L_0x090d
        L_0x08db:
            r3 = r67
            goto L_0x0883
        L_0x08de:
            r67 = r3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x08e8 }
        L_0x08e4:
            r13.close()
            goto L_0x090d
        L_0x08e8:
            r0 = move-exception
            goto L_0x08f5
        L_0x08ea:
            r0 = move-exception
            r67 = r3
            goto L_0x08f5
        L_0x08ee:
            r0 = move-exception
            r5 = 0
            goto L_0x0913
        L_0x08f1:
            r0 = move-exception
            r67 = r3
            r13 = 0
        L_0x08f5:
            com.google.android.gms.measurement.internal.p4 r3 = r6.f7899a     // Catch:{ all -> 0x0911 }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ all -> 0x0911 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()     // Catch:{ all -> 0x0911 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r7)     // Catch:{ all -> 0x0911 }
            r3.mo35039c(r12, r6, r0)     // Catch:{ all -> 0x0911 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0911 }
            if (r13 == 0) goto L_0x090d
            goto L_0x08e4
        L_0x090d:
            r2.put(r5, r0)
            goto L_0x091f
        L_0x0911:
            r0 = move-exception
            r5 = r13
        L_0x0913:
            if (r5 == 0) goto L_0x0918
            r5.close()
        L_0x0918:
            throw r0
        L_0x0919:
            r67 = r3
            r11 = r28
            r9 = r29
        L_0x091f:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0927:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0a45
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set<java.lang.Integer> r6 = r10.f7634e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x0952
            com.google.android.gms.measurement.internal.p4 r0 = r10.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()
            r0.mo35038b(r1, r7)
            goto L_0x0a45
        L_0x0952:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x095d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a34
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.n3 r7 = (com.google.android.gms.internal.measurement.C5870n3) r7
            com.google.android.gms.measurement.internal.p4 r8 = r10.f7899a
            com.google.android.gms.measurement.internal.l3 r8 = r8.mo34920b()
            java.lang.String r8 = r8.mo35072C()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L_0x09c7
            com.google.android.gms.measurement.internal.p4 r8 = r10.f7899a
            com.google.android.gms.measurement.internal.l3 r8 = r8.mo34920b()
            com.google.android.gms.measurement.internal.j3 r8 = r8.mo35079v()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r15 = r7.mo34202H()
            if (r15 == 0) goto L_0x0997
            int r15 = r7.mo34204w()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0998
        L_0x0997:
            r15 = 0
        L_0x0998:
            com.google.android.gms.measurement.internal.p4 r13 = r10.f7899a
            com.google.android.gms.measurement.internal.g3 r13 = r13.mo35182D()
            r68 = r0
            java.lang.String r0 = r7.mo34198B()
            java.lang.String r0 = r13.mo34901f(r0)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r8.mo35040d(r13, r14, r15, r0)
            com.google.android.gms.measurement.internal.p4 r0 = r10.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()
            com.google.android.gms.measurement.internal.g9 r8 = r10.f8374b
            com.google.android.gms.measurement.internal.i9 r8 = r8.mo34928f0()
            java.lang.String r8 = r8.mo34990G(r7)
            java.lang.String r13 = "Filter definition"
            r0.mo35038b(r13, r8)
            goto L_0x09c9
        L_0x09c7:
            r68 = r0
        L_0x09c9:
            boolean r0 = r7.mo34202H()
            if (r0 == 0) goto L_0x0a0a
            int r0 = r7.mo34204w()
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L_0x09d8
            goto L_0x0a0a
        L_0x09d8:
            com.google.android.gms.measurement.internal.z9 r0 = new com.google.android.gms.measurement.internal.z9
            java.lang.String r8 = r10.f7633d
            r0.<init>(r10, r8, r5, r7)
            java.lang.Long r8 = r10.f7636g
            java.lang.Long r13 = r10.f7637h
            int r7 = r7.mo34204w()
            boolean r7 = r10.m10459o(r5, r7)
            boolean r7 = r0.mo35437k(r8, r13, r4, r7)
            if (r7 == 0) goto L_0x0a00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.measurement.internal.v9 r8 = r10.m10458n(r8)
            r8.mo35392c(r0)
            r0 = r68
            goto L_0x095d
        L_0x0a00:
            java.util.Set<java.lang.Integer> r0 = r10.f7634e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.add(r6)
            goto L_0x0a36
        L_0x0a0a:
            com.google.android.gms.measurement.internal.p4 r0 = r10.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()
            java.lang.String r6 = r10.f7633d
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r6)
            boolean r8 = r7.mo34202H()
            if (r8 == 0) goto L_0x0a29
            int r7 = r7.mo34204w()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0a2a
        L_0x0a29:
            r7 = 0
        L_0x0a2a:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r0.mo35039c(r8, r6, r7)
            goto L_0x0a38
        L_0x0a34:
            r68 = r0
        L_0x0a36:
            if (r7 != 0) goto L_0x0a41
        L_0x0a38:
            java.util.Set<java.lang.Integer> r0 = r10.f7634e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L_0x0a41:
            r0 = r68
            goto L_0x0927
        L_0x0a45:
            r3 = r67
            r29 = r9
            r28 = r11
            goto L_0x0826
        L_0x0a4d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.v9> r0 = r10.f7635f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r10.f7634e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0a61:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0af6
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.v9> r3 = r10.f7635f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.v9 r3 = (com.google.android.gms.measurement.internal.C6322v9) r3
            p231t4.C9713p.m20275j(r3)
            com.google.android.gms.internal.measurement.g4 r0 = r3.mo35391a(r0)
            r1.add(r0)
            com.google.android.gms.measurement.internal.g9 r3 = r10.f8374b
            com.google.android.gms.measurement.internal.j r3 = r3.mo34914V()
            java.lang.String r5 = r10.f7633d
            com.google.android.gms.internal.measurement.a5 r0 = r0.mo34039z()
            r3.mo35406i()
            r3.mo34778h()
            p231t4.C9713p.m20271f(r5)
            p231t4.C9713p.m20275j(r0)
            byte[] r0 = r0.mo34044j()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r25
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.mo35005R()     // Catch:{ SQLiteException -> 0x0add }
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r9 = 0
            long r6 = r0.insertWithOnConflict(r7, r9, r6, r8)     // Catch:{ SQLiteException -> 0x0adb }
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0af2
            com.google.android.gms.measurement.internal.p4 r0 = r3.f7899a     // Catch:{ SQLiteException -> 0x0adb }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ SQLiteException -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()     // Catch:{ SQLiteException -> 0x0adb }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r5)     // Catch:{ SQLiteException -> 0x0adb }
            r0.mo35038b(r6, r7)     // Catch:{ SQLiteException -> 0x0adb }
            goto L_0x0af2
        L_0x0adb:
            r0 = move-exception
            goto L_0x0adf
        L_0x0add:
            r0 = move-exception
            r9 = 0
        L_0x0adf:
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()
            java.lang.String r6 = "Error storing filter results. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r5)
            r3.mo35039c(r6, r5, r0)
        L_0x0af2:
            r25 = r4
            goto L_0x0a61
        L_0x0af6:
            return r1
        L_0x0af7:
            r0 = move-exception
            r5 = r4
        L_0x0af9:
            if (r5 == 0) goto L_0x0afe
            r5.close()
        L_0x0afe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6091aa.mo34750m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
