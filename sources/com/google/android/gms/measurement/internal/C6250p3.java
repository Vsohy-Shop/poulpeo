package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.net.URL;
import java.util.Map;
import p231t4.C9713p;

@WorkerThread
/* renamed from: com.google.android.gms.measurement.internal.p3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6250p3 implements Runnable {

    /* renamed from: b */
    private final URL f8080b;

    /* renamed from: c */
    private final byte[] f8081c;

    /* renamed from: d */
    private final C6228n3 f8082d;

    /* renamed from: e */
    private final String f8083e;

    /* renamed from: f */
    private final Map<String, String> f8084f;

    /* renamed from: g */
    final /* synthetic */ C6261q3 f8085g;

    public C6250p3(C6261q3 q3Var, String str, URL url, byte[] bArr, Map<String, String> map, C6228n3 n3Var) {
        this.f8085g = q3Var;
        C9713p.m20271f(str);
        C9713p.m20275j(url);
        C9713p.m20275j(n3Var);
        this.f8080b = url;
        this.f8081c = bArr;
        this.f8082d = n3Var;
        this.f8083e = str;
        this.f8084f = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f5 A[SYNTHETIC, Splitter:B:43:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0128 A[SYNTHETIC, Splitter:B:64:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0168 A[SYNTHETIC, Splitter:B:76:0x0168] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.q3 r1 = r14.f8085g
            r1.mo35053g()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.q3 r3 = r14.f8085g     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            java.net.URL r4 = r14.f8080b     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            if (r5 == 0) goto L_0x0119
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            r4.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            com.google.android.gms.measurement.internal.p4 r5 = r3.f7899a     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            r5.mo35211z()     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            r3.mo35211z()     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            r3 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r3)     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            r4.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            r3 = 1
            r4.setDoInput(r3)     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r14.f8084f     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            if (r5 == 0) goto L_0x005f
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
        L_0x0043:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            goto L_0x0043
        L_0x005f:
            byte[] r5 = r14.f8081c     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            if (r5 == 0) goto L_0x00ae
            com.google.android.gms.measurement.internal.q3 r5 = r14.f8085g     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            com.google.android.gms.measurement.internal.g9 r5 = r5.f8374b     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            com.google.android.gms.measurement.internal.i9 r5 = r5.mo34928f0()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            byte[] r6 = r14.f8081c     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            byte[] r5 = r5.mo34996Q(r6)     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            com.google.android.gms.measurement.internal.q3 r6 = r14.f8085g     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            com.google.android.gms.measurement.internal.p4 r6 = r6.f7899a     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            com.google.android.gms.measurement.internal.l3 r6 = r6.mo34920b()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            com.google.android.gms.measurement.internal.j3 r6 = r6.mo35079v()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            int r7 = r5.length     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            java.lang.String r8 = "Uploading data. size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            r6.mo35038b(r8, r9)     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            r4.setDoOutput(r3)     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r3, r6)     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            r4.setFixedLengthStreamingMode(r7)     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            r4.connect()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            r3.write(r5)     // Catch:{ IOException -> 0x00a8, all -> 0x00a2 }
            r3.close()     // Catch:{ IOException -> 0x00a8, all -> 0x00a2 }
            goto L_0x00ae
        L_0x00a2:
            r5 = move-exception
            r9 = r1
            r12 = r2
            r2 = r3
            goto L_0x0126
        L_0x00a8:
            r5 = move-exception
            r9 = r1
            r12 = r2
            r2 = r3
            goto L_0x0165
        L_0x00ae:
            int r8 = r4.getResponseCode()     // Catch:{ IOException -> 0x0114, all -> 0x010f }
            java.util.Map r11 = r4.getHeaderFields()     // Catch:{ IOException -> 0x0109, all -> 0x0105 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00f1 }
            r3.<init>()     // Catch:{ all -> 0x00f1 }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x00f1 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00ef }
        L_0x00c3:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00ef }
            if (r7 <= 0) goto L_0x00cd
            r3.write(r6, r1, r7)     // Catch:{ all -> 0x00ef }
            goto L_0x00c3
        L_0x00cd:
            byte[] r10 = r3.toByteArray()     // Catch:{ all -> 0x00ef }
            r5.close()     // Catch:{ IOException -> 0x00fe, all -> 0x00f9 }
            r4.disconnect()
            com.google.android.gms.measurement.internal.q3 r0 = r14.f8085g
            com.google.android.gms.measurement.internal.p4 r0 = r0.f7899a
            com.google.android.gms.measurement.internal.n4 r0 = r0.mo34919a()
            com.google.android.gms.measurement.internal.o3 r1 = new com.google.android.gms.measurement.internal.o3
            java.lang.String r6 = r14.f8083e
            com.google.android.gms.measurement.internal.n3 r7 = r14.f8082d
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x00eb:
            r0.mo35110z(r1)
            return
        L_0x00ef:
            r1 = move-exception
            goto L_0x00f3
        L_0x00f1:
            r1 = move-exception
            r5 = r2
        L_0x00f3:
            if (r5 == 0) goto L_0x00f8
            r5.close()     // Catch:{ IOException -> 0x00fe, all -> 0x00f9 }
        L_0x00f8:
            throw r1     // Catch:{ IOException -> 0x00fe, all -> 0x00f9 }
        L_0x00f9:
            r1 = move-exception
            r5 = r1
            r9 = r8
            r12 = r11
            goto L_0x0126
        L_0x00fe:
            r1 = move-exception
            r5 = r1
            r10 = r5
            r9 = r8
            r12 = r11
            goto L_0x0166
        L_0x0105:
            r5 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x0126
        L_0x0109:
            r5 = move-exception
            r12 = r2
            r10 = r5
            r9 = r8
            goto L_0x0166
        L_0x010f:
            r3 = move-exception
            r9 = r1
            r12 = r2
            r5 = r3
            goto L_0x0126
        L_0x0114:
            r3 = move-exception
            r9 = r1
            r12 = r2
            r10 = r3
            goto L_0x0166
        L_0x0119:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
            throw r3     // Catch:{ IOException -> 0x0160, all -> 0x0121 }
        L_0x0121:
            r3 = move-exception
            r5 = r3
            r9 = r1
            r4 = r2
            r12 = r4
        L_0x0126:
            if (r2 == 0) goto L_0x0142
            r2.close()     // Catch:{ IOException -> 0x012c }
            goto L_0x0142
        L_0x012c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.q3 r2 = r14.f8085g
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()
            java.lang.String r3 = r14.f8083e
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)
            r2.mo35039c(r0, r3, r1)
        L_0x0142:
            if (r4 == 0) goto L_0x0147
            r4.disconnect()
        L_0x0147:
            com.google.android.gms.measurement.internal.q3 r0 = r14.f8085g
            com.google.android.gms.measurement.internal.p4 r0 = r0.f7899a
            com.google.android.gms.measurement.internal.n4 r0 = r0.mo34919a()
            com.google.android.gms.measurement.internal.o3 r1 = new com.google.android.gms.measurement.internal.o3
            java.lang.String r7 = r14.f8083e
            com.google.android.gms.measurement.internal.n3 r8 = r14.f8082d
            r10 = 0
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.mo35110z(r1)
            throw r5
        L_0x0160:
            r3 = move-exception
            r5 = r3
            r9 = r1
            r4 = r2
            r12 = r4
        L_0x0165:
            r10 = r5
        L_0x0166:
            if (r2 == 0) goto L_0x0182
            r2.close()     // Catch:{ IOException -> 0x016c }
            goto L_0x0182
        L_0x016c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.q3 r2 = r14.f8085g
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()
            java.lang.String r3 = r14.f8083e
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)
            r2.mo35039c(r0, r3, r1)
        L_0x0182:
            if (r4 == 0) goto L_0x0187
            r4.disconnect()
        L_0x0187:
            com.google.android.gms.measurement.internal.q3 r0 = r14.f8085g
            com.google.android.gms.measurement.internal.p4 r0 = r0.f7899a
            com.google.android.gms.measurement.internal.n4 r0 = r0.mo34919a()
            com.google.android.gms.measurement.internal.o3 r1 = new com.google.android.gms.measurement.internal.o3
            java.lang.String r7 = r14.f8083e
            com.google.android.gms.measurement.internal.n3 r8 = r14.f8082d
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00eb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6250p3.run():void");
    }
}
