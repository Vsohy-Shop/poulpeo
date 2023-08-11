package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5822k4;
import p201q5.C9278y;

/* renamed from: com.google.android.gms.measurement.internal.w9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6333w9 {

    /* renamed from: a */
    private C5822k4 f8375a;

    /* renamed from: b */
    private Long f8376b;

    /* renamed from: c */
    private long f8377c;

    /* renamed from: d */
    final /* synthetic */ C6091aa f8378d;

    /* synthetic */ C6333w9(C6091aa aaVar, C9278y yVar) {
        this.f8378d = aaVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        if (r14 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C5822k4 mo35399a(java.lang.String r18, com.google.android.gms.internal.measurement.C5822k4 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.mo34134E()
            java.util.List r9 = r19.mo34135F()
            com.google.android.gms.measurement.internal.aa r2 = r1.f8378d
            com.google.android.gms.measurement.internal.g9 r2 = r2.f8374b
            r2.mo34928f0()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6179i9.m10737p(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0233
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01e6
            p231t4.C9713p.m20275j(r4)
            com.google.android.gms.measurement.internal.aa r0 = r1.f8378d
            com.google.android.gms.measurement.internal.g9 r0 = r0.f8374b
            r0.mo34928f0()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C6179i9.m10737p(r8, r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.measurement.internal.aa r0 = r1.f8378d
            com.google.android.gms.measurement.internal.p4 r0 = r0.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35077t()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo35038b(r2, r4)
            return r5
        L_0x0055:
            com.google.android.gms.internal.measurement.k4 r0 = r1.f8375a
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Long r0 = r1.f8376b
            if (r0 == 0) goto L_0x006d
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f8376b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
        L_0x006d:
            com.google.android.gms.measurement.internal.aa r0 = r1.f8378d
            com.google.android.gms.measurement.internal.g9 r0 = r0.f8374b
            com.google.android.gms.measurement.internal.j r13 = r0.mo34914V()
            r13.mo34778h()
            r13.mo35406i()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo35005R()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r11] = r15     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00e3 }
            if (r0 != 0) goto L_0x00aa
            com.google.android.gms.measurement.internal.p4 r0 = r13.f7899a     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Main event not found"
            r0.mo35037a(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            r0 = r5
            goto L_0x0100
        L_0x00aa:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00e3 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.internal.measurement.j4 r5 = com.google.android.gms.internal.measurement.C5822k4.m9480B()     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.x9 r0 = com.google.android.gms.measurement.internal.C6179i9.m10729D(r5, r0)     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.j4 r0 = (com.google.android.gms.internal.measurement.C5805j4) r0     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.v8 r0 = r0.mo34354l()     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.k4 r0 = (com.google.android.gms.internal.measurement.C5822k4) r0     // Catch:{ IOException -> 0x00ce }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            goto L_0x0100
        L_0x00ce:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r5 = r13.f7899a     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r18)     // Catch:{ SQLiteException -> 0x00e3 }
            r5.mo35040d(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00e3 }
            goto L_0x00fc
        L_0x00e3:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e5:
            r0 = move-exception
            r5 = 0
            goto L_0x01e0
        L_0x00e9:
            r0 = move-exception
            r14 = 0
        L_0x00eb:
            com.google.android.gms.measurement.internal.p4 r5 = r13.f7899a     // Catch:{ all -> 0x01de }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ all -> 0x01de }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ all -> 0x01de }
            java.lang.String r12 = "Error selecting main event"
            r5.mo35038b(r12, r0)     // Catch:{ all -> 0x01de }
            if (r14 == 0) goto L_0x00ff
        L_0x00fc:
            r14.close()
        L_0x00ff:
            r0 = 0
        L_0x0100:
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0108
            goto L_0x01cb
        L_0x0108:
            com.google.android.gms.internal.measurement.k4 r5 = (com.google.android.gms.internal.measurement.C5822k4) r5
            r1.f8375a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f8377c = r12
            com.google.android.gms.measurement.internal.aa r0 = r1.f8378d
            com.google.android.gms.measurement.internal.g9 r0 = r0.f8374b
            r0.mo34928f0()
            com.google.android.gms.internal.measurement.k4 r0 = r1.f8375a
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C6179i9.m10737p(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f8376b = r0
        L_0x0127:
            long r12 = r1.f8377c
            r14 = -1
            long r12 = r12 + r14
            r1.f8377c = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x016c
            com.google.android.gms.measurement.internal.aa r0 = r1.f8378d
            com.google.android.gms.measurement.internal.g9 r0 = r0.f8374b
            com.google.android.gms.measurement.internal.j r2 = r0.mo34914V()
            r2.mo34778h()
            com.google.android.gms.measurement.internal.p4 r0 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo35038b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo35005R()     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x015b }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x015b }
            goto L_0x017d
        L_0x015b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo35038b(r3, r0)
            goto L_0x017d
        L_0x016c:
            com.google.android.gms.measurement.internal.aa r0 = r1.f8378d
            com.google.android.gms.measurement.internal.g9 r0 = r0.f8374b
            com.google.android.gms.measurement.internal.j r2 = r0.mo34914V()
            long r5 = r1.f8377c
            com.google.android.gms.internal.measurement.k4 r7 = r1.f8375a
            r3 = r18
            r2.mo35034x(r3, r4, r5, r7)
        L_0x017d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.k4 r2 = r1.f8375a
            java.util.List r2 = r2.mo34135F()
            java.util.Iterator r2 = r2.iterator()
        L_0x018c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ad
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.o4 r3 = (com.google.android.gms.internal.measurement.C5887o4) r3
            com.google.android.gms.measurement.internal.aa r4 = r1.f8378d
            com.google.android.gms.measurement.internal.g9 r4 = r4.f8374b
            r4.mo34928f0()
            java.lang.String r4 = r3.mo34240D()
            com.google.android.gms.internal.measurement.o4 r4 = com.google.android.gms.measurement.internal.C6179i9.m10736o(r8, r4)
            if (r4 != 0) goto L_0x018c
            r0.add(r3)
            goto L_0x018c
        L_0x01ad:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01b8
            r0.addAll(r9)
            r9 = r0
            goto L_0x01c9
        L_0x01b8:
            com.google.android.gms.measurement.internal.aa r0 = r1.f8378d
            com.google.android.gms.measurement.internal.p4 r0 = r0.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35077t()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo35038b(r2, r10)
        L_0x01c9:
            r0 = r10
            goto L_0x0233
        L_0x01cb:
            com.google.android.gms.measurement.internal.aa r0 = r1.f8378d
            com.google.android.gms.measurement.internal.p4 r0 = r0.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35077t()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo35039c(r2, r10, r4)
            r2 = 0
            return r2
        L_0x01de:
            r0 = move-exception
            r5 = r14
        L_0x01e0:
            if (r5 == 0) goto L_0x01e5
            r5.close()
        L_0x01e5:
            throw r0
        L_0x01e6:
            r1.f8376b = r4
            r1.f8375a = r8
            com.google.android.gms.measurement.internal.aa r2 = r1.f8378d
            com.google.android.gms.measurement.internal.g9 r2 = r2.f8374b
            r2.mo34928f0()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C6179i9.m10737p(r8, r5)
            if (r5 == 0) goto L_0x01fe
            r2 = r5
        L_0x01fe:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f8377c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x021c
            com.google.android.gms.measurement.internal.aa r2 = r1.f8378d
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35077t()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo35038b(r3, r0)
            goto L_0x0233
        L_0x021c:
            com.google.android.gms.measurement.internal.aa r2 = r1.f8378d
            com.google.android.gms.measurement.internal.g9 r2 = r2.f8374b
            com.google.android.gms.measurement.internal.j r2 = r2.mo34914V()
            java.lang.Object r4 = p231t4.C9713p.m20275j(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.f8377c
            r3 = r18
            r7 = r19
            r2.mo35034x(r3, r4, r5, r7)
        L_0x0233:
            com.google.android.gms.internal.measurement.s8 r2 = r19.mo34557q()
            com.google.android.gms.internal.measurement.j4 r2 = (com.google.android.gms.internal.measurement.C5805j4) r2
            r2.mo34120z(r0)
            r2.mo34118x()
            r2.mo34115u(r9)
            com.google.android.gms.internal.measurement.v8 r0 = r2.mo34354l()
            com.google.android.gms.internal.measurement.k4 r0 = (com.google.android.gms.internal.measurement.C5822k4) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6333w9.mo35399a(java.lang.String, com.google.android.gms.internal.measurement.k4):com.google.android.gms.internal.measurement.k4");
    }
}
