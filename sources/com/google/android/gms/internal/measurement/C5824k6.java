package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.k6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final /* synthetic */ class C5824k6 implements C5655a7 {

    /* renamed from: b */
    public final /* synthetic */ Context f7034b;

    public /* synthetic */ C5824k6(Context context) {
        this.f7034b = context;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0139 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza() {
        /*
            r13 = this;
            java.lang.String r0 = "HermeticFileOverrides"
            android.content.Context r1 = r13.f7034b
            int r2 = com.google.android.gms.internal.measurement.C5953s6.f7364l
            java.lang.String r2 = android.os.Build.TYPE
            java.lang.String r3 = android.os.Build.TAGS
            java.lang.String r4 = "eng"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x001b
            java.lang.String r4 = "userdebug"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            java.lang.String r2 = "dev-keys"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "test-keys"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            com.google.android.gms.internal.measurement.x6 r0 = com.google.android.gms.internal.measurement.C6033x6.m10252c()
            goto L_0x0148
        L_0x0032:
            boolean r2 = com.google.android.gms.internal.measurement.C5968t5.m9965a()
            if (r2 == 0) goto L_0x0042
            boolean r2 = r1.isDeviceProtectedStorage()
            if (r2 != 0) goto L_0x0042
            android.content.Context r1 = r1.createDeviceProtectedStorageContext()
        L_0x0042:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0149 }
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ RuntimeException -> 0x0067 }
            java.lang.String r5 = "phenotype_hermetic"
            java.io.File r1 = r1.getDir(r5, r3)     // Catch:{ RuntimeException -> 0x0067 }
            java.lang.String r5 = "overrides.txt"
            r4.<init>(r1, r5)     // Catch:{ RuntimeException -> 0x0067 }
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0149 }
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.measurement.x6 r1 = com.google.android.gms.internal.measurement.C6033x6.m10253d(r4)     // Catch:{ all -> 0x0149 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.internal.measurement.x6 r1 = com.google.android.gms.internal.measurement.C6033x6.m10252c()     // Catch:{ all -> 0x0149 }
            goto L_0x0071
        L_0x0067:
            r1 = move-exception
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r0, r4, r1)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.measurement.x6 r1 = com.google.android.gms.internal.measurement.C6033x6.m10252c()     // Catch:{ all -> 0x0149 }
        L_0x0071:
            boolean r4 = r1.mo34546b()     // Catch:{ all -> 0x0149 }
            if (r4 == 0) goto L_0x0141
            java.lang.Object r1 = r1.mo34545a()     // Catch:{ all -> 0x0149 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0149 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x013a }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x013a }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x013a }
            r6.<init>(r1)     // Catch:{ IOException -> 0x013a }
            r5.<init>(r6)     // Catch:{ IOException -> 0x013a }
            r4.<init>(r5)     // Catch:{ IOException -> 0x013a }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0135 }
            r5.<init>()     // Catch:{ all -> 0x0135 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0135 }
            r6.<init>()     // Catch:{ all -> 0x0135 }
        L_0x0096:
            java.lang.String r7 = r4.readLine()     // Catch:{ all -> 0x0135 }
            if (r7 == 0) goto L_0x010a
            java.lang.String r8 = " "
            r9 = 3
            java.lang.String[] r8 = r7.split(r8, r9)     // Catch:{ all -> 0x0135 }
            int r10 = r8.length     // Catch:{ all -> 0x0135 }
            if (r10 == r9) goto L_0x00bc
            java.lang.String r8 = "Invalid: "
            int r9 = r7.length()     // Catch:{ all -> 0x0135 }
            if (r9 == 0) goto L_0x00b3
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x0135 }
            goto L_0x00b8
        L_0x00b3:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0135 }
            r7.<init>(r8)     // Catch:{ all -> 0x0135 }
        L_0x00b8:
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x0135 }
            goto L_0x0096
        L_0x00bc:
            r7 = r8[r3]     // Catch:{ all -> 0x0135 }
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0135 }
            r9.<init>(r7)     // Catch:{ all -> 0x0135 }
            r7 = 1
            r7 = r8[r7]     // Catch:{ all -> 0x0135 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0135 }
            r10.<init>(r7)     // Catch:{ all -> 0x0135 }
            java.lang.String r7 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x0135 }
            r10 = 2
            r11 = r8[r10]     // Catch:{ all -> 0x0135 }
            java.lang.Object r11 = r6.get(r11)     // Catch:{ all -> 0x0135 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0135 }
            if (r11 != 0) goto L_0x00f2
            r8 = r8[r10]     // Catch:{ all -> 0x0135 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0135 }
            r10.<init>(r8)     // Catch:{ all -> 0x0135 }
            java.lang.String r11 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x0135 }
            int r8 = r11.length()     // Catch:{ all -> 0x0135 }
            r12 = 1024(0x400, float:1.435E-42)
            if (r8 < r12) goto L_0x00ef
            if (r11 != r10) goto L_0x00f2
        L_0x00ef:
            r6.put(r10, r11)     // Catch:{ all -> 0x0135 }
        L_0x00f2:
            boolean r8 = r5.containsKey(r9)     // Catch:{ all -> 0x0135 }
            if (r8 != 0) goto L_0x0100
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0135 }
            r8.<init>()     // Catch:{ all -> 0x0135 }
            r5.put(r9, r8)     // Catch:{ all -> 0x0135 }
        L_0x0100:
            java.lang.Object r8 = r5.get(r9)     // Catch:{ all -> 0x0135 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x0135 }
            r8.put(r7, r11)     // Catch:{ all -> 0x0135 }
            goto L_0x0096
        L_0x010a:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0135 }
            int r3 = r1.length()     // Catch:{ all -> 0x0135 }
            int r3 = r3 + 7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r6.<init>(r3)     // Catch:{ all -> 0x0135 }
            java.lang.String r3 = "Parsed "
            r6.append(r3)     // Catch:{ all -> 0x0135 }
            r6.append(r1)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0135 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0135 }
            com.google.android.gms.internal.measurement.g6 r0 = new com.google.android.gms.internal.measurement.g6     // Catch:{ all -> 0x0135 }
            r0.<init>(r5)     // Catch:{ all -> 0x0135 }
            r4.close()     // Catch:{ IOException -> 0x013a }
            com.google.android.gms.internal.measurement.x6 r0 = com.google.android.gms.internal.measurement.C6033x6.m10253d(r0)     // Catch:{ all -> 0x0149 }
            goto L_0x0145
        L_0x0135:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0139 }
        L_0x0139:
            throw r0     // Catch:{ IOException -> 0x013a }
        L_0x013a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0149 }
            r1.<init>(r0)     // Catch:{ all -> 0x0149 }
            throw r1     // Catch:{ all -> 0x0149 }
        L_0x0141:
            com.google.android.gms.internal.measurement.x6 r0 = com.google.android.gms.internal.measurement.C6033x6.m10252c()     // Catch:{ all -> 0x0149 }
        L_0x0145:
            android.os.StrictMode.setThreadPolicy(r2)
        L_0x0148:
            return r0
        L_0x0149:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5824k6.zza():java.lang.Object");
    }
}
