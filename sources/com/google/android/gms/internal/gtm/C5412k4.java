package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.gtm.k4 */
final class C5412k4 implements C5548t2 {

    /* renamed from: a */
    private final String f6085a;

    /* renamed from: b */
    private final Context f6086b;

    /* renamed from: c */
    private final C5457n4 f6087c;

    /* renamed from: d */
    private final C5442m4 f6088d;

    private C5412k4(C5457n4 n4Var, Context context, C5442m4 m4Var) {
        this.f6087c = n4Var;
        this.f6086b = context.getApplicationContext();
        this.f6088d = m4Var;
        String str = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String str2 = null;
        if (!(locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (!(locale.getCountry() == null || locale.getCountry().length() == 0)) {
                sb.append("-");
                sb.append(locale.getCountry().toLowerCase());
            }
            str2 = sb.toString();
        }
        this.f6085a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleTagManager", "5.06", str, str2, Build.MODEL, Build.ID});
    }

    /* renamed from: c */
    private static URL m8119c(C5608x2 x2Var) {
        try {
            return new URL(x2Var.mo33612g());
        } catch (MalformedURLException unused) {
            C5426l3.m8135e("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo33318a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f6086b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        C5426l3.m8133c("...no network connectivity");
        return false;
    }

    /* JADX WARNING: type inference failed for: r12v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x016e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0171, code lost:
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0173, code lost:
        r14.setRequestMethod(r0);
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0176, code lost:
        r4 = r14.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x017c, code lost:
        if (r4 < 200) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0180, code lost:
        if (r4 < 300) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0183, code lost:
        r15 = r14.getInputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r4 = java.lang.String.valueOf(r11);
        r13 = new java.lang.StringBuilder((r4.length() + 23) + r0.length());
        r13.append("Hit sent to ");
        r13.append(r4);
        r13.append("(method = ");
        r13.append(r0);
        r13.append(")");
        com.google.android.gms.internal.gtm.C5426l3.m8133c(r13.toString());
        r1.f6088d.mo33356b(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01be, code lost:
        r0 = th;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c1, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r0 = java.lang.String.valueOf(r11);
        r13 = new java.lang.StringBuilder(r0.length() + 39);
        r13.append("Bad response received for ");
        r13.append(r0);
        r13.append(": ");
        r13.append(r4);
        com.google.android.gms.internal.gtm.C5426l3.m8134d(r13.toString());
        r0 = new java.lang.StringBuilder();
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r4 = r14.getErrorStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ee, code lost:
        if (r4 == null) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f0, code lost:
        r5 = new java.io.BufferedReader(new java.io.InputStreamReader(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r4 = r5.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01fe, code lost:
        if (r4 == null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0200, code lost:
        r0.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0204, code lost:
        r0 = java.lang.String.valueOf(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0212, code lost:
        if (r0.length() == 0) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0214, code lost:
        r0 = "Error Message: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0219, code lost:
        r0 = new java.lang.String("Error Message: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x021e, code lost:
        com.google.android.gms.internal.gtm.C5426l3.m8134d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0222, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0224, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0225, code lost:
        if (r5 == null) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0227, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x022a, code lost:
        r1.f6088d.mo33357c(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x022f, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0230, code lost:
        if (r15 == null) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0232, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0235, code lost:
        r14.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0239, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x023a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x023b, code lost:
        if (r5 == null) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x023d, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0240, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0241, code lost:
        r0 = th;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0258, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x029c, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x011e, code lost:
        if (r5 == 0) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0120, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0121, code lost:
        if (r5 == 1) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0123, code lost:
        if (r5 == 2) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0126, code lost:
        if (r5 == 3) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0128, code lost:
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r14.setRequestMethod(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012e, code lost:
        if (r13 == null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0130, code lost:
        r14.setDoOutput(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r4 = r13.getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING));
        r14.setFixedLengthStreamingMode(r4.length);
        r5 = new java.io.BufferedOutputStream(r14.getOutputStream());
        r5.write(r4);
        r5.flush();
        r5.close();
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x015a, code lost:
        if (r13 == null) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015c, code lost:
        r4 = new java.lang.Object[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0161, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r4[0] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0163, code lost:
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r4[1] = r13;
        com.google.android.gms.internal.gtm.C5426l3.m8134d(java.lang.String.format("Body of %s hit is ignored: %s.", r4));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x023d A[SYNTHETIC, Splitter:B:142:0x023d] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0251 A[SYNTHETIC, Splitter:B:155:0x0251] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0240 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0254 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33319b(java.util.List<com.google.android.gms.internal.gtm.C5608x2> r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "GET"
            java.lang.String r3 = ": "
            int r0 = r18.size()
            r4 = 40
            int r4 = java.lang.Math.min(r0, r4)
            r5 = 1
            r8 = r5
            r7 = 0
        L_0x0013:
            if (r7 >= r4) goto L_0x02a3
            r9 = r18
            java.lang.Object r0 = r9.get(r7)
            r10 = r0
            com.google.android.gms.internal.gtm.x2 r10 = (com.google.android.gms.internal.gtm.C5608x2) r10
            java.net.URL r11 = m8119c(r10)
            java.lang.String r0 = r10.mo33613h()
            java.util.Map r12 = r10.mo33614i()
            java.lang.String r13 = r10.mo33615j()
            if (r11 != 0) goto L_0x0040
            java.lang.String r0 = "No destination: discarding hit."
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)
            com.google.android.gms.internal.gtm.m4 r0 = r1.f6088d
            r0.mo33355a(r10)
        L_0x003a:
            r16 = r4
            r12 = r5
            r6 = 0
            goto L_0x029c
        L_0x0040:
            com.google.android.gms.internal.gtm.n4 r14 = r1.f6087c     // Catch:{ IOException -> 0x025a }
            java.net.HttpURLConnection r14 = r14.mo33324a(r11)     // Catch:{ IOException -> 0x025a }
            if (r8 == 0) goto L_0x004e
            android.content.Context r15 = r1.f6086b     // Catch:{ all -> 0x0249 }
            com.google.android.gms.internal.gtm.C5456n3.m8217a(r15)     // Catch:{ all -> 0x0249 }
            r8 = 0
        L_0x004e:
            java.lang.String r15 = "User-Agent"
            java.lang.String r6 = r1.f6085a     // Catch:{ all -> 0x0249 }
            r14.setRequestProperty(r15, r6)     // Catch:{ all -> 0x0249 }
            if (r12 == 0) goto L_0x007b
            java.util.Set r6 = r12.entrySet()     // Catch:{ all -> 0x0249 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0249 }
        L_0x005f:
            boolean r12 = r6.hasNext()     // Catch:{ all -> 0x0249 }
            if (r12 == 0) goto L_0x007b
            java.lang.Object r12 = r6.next()     // Catch:{ all -> 0x0249 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x0249 }
            java.lang.Object r15 = r12.getKey()     // Catch:{ all -> 0x0249 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0249 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0249 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0249 }
            r14.setRequestProperty(r15, r12)     // Catch:{ all -> 0x0249 }
            goto L_0x005f
        L_0x007b:
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "Hit %d retrieved from the store has null HTTP method."
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0249 }
            long r12 = r10.mo33610e()     // Catch:{ all -> 0x0249 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0249 }
            r13 = 0
            r6[r13] = r12     // Catch:{ all -> 0x009c }
            java.lang.String r0 = java.lang.String.format(r0, r6)     // Catch:{ all -> 0x0249 }
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)     // Catch:{ all -> 0x0249 }
            com.google.android.gms.internal.gtm.m4 r0 = r1.f6088d     // Catch:{ all -> 0x0249 }
            r0.mo33355a(r10)     // Catch:{ all -> 0x0249 }
            r14.disconnect()     // Catch:{ IOException -> 0x025a }
            goto L_0x003a
        L_0x009c:
            r0 = move-exception
            r16 = r4
            r12 = r5
            r6 = r13
            goto L_0x024e
        L_0x00a3:
            boolean r6 = r0.equals(r2)     // Catch:{ all -> 0x0249 }
            java.lang.String r12 = "POST"
            java.lang.String r15 = "PUT"
            java.lang.String r5 = "HEAD"
            if (r6 != 0) goto L_0x00ef
            boolean r6 = r0.equals(r5)     // Catch:{ all -> 0x0243 }
            if (r6 != 0) goto L_0x00ef
            boolean r6 = r0.equals(r12)     // Catch:{ all -> 0x0243 }
            if (r6 != 0) goto L_0x00ef
            boolean r6 = r0.equals(r15)     // Catch:{ all -> 0x0243 }
            if (r6 != 0) goto L_0x00ef
            java.lang.String r5 = "Unrecongnized HTTP method %s. Supported methods are GET, HEAD, PUT and/or POST"
            r6 = 1
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ea }
            r6 = 0
            r12[r6] = r0     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = java.lang.String.format(r5, r12)     // Catch:{ all -> 0x0243 }
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)     // Catch:{ all -> 0x0243 }
            com.google.android.gms.internal.gtm.m4 r0 = r1.f6088d     // Catch:{ all -> 0x0243 }
            r0.mo33355a(r10)     // Catch:{ all -> 0x0243 }
            r14.disconnect()     // Catch:{ IOException -> 0x00de }
            r16 = r4
            r6 = 0
            r12 = 1
            goto L_0x029c
        L_0x00de:
            r0 = move-exception
            r16 = r4
            r6 = 0
            r12 = 1
            goto L_0x025f
        L_0x00e5:
            r0 = move-exception
            r16 = r4
            goto L_0x0247
        L_0x00ea:
            r0 = move-exception
            r16 = r4
            goto L_0x0157
        L_0x00ef:
            int r6 = r0.hashCode()     // Catch:{ all -> 0x0243 }
            r16 = r4
            r4 = 2
            switch(r6) {
                case 70454: goto L_0x0112;
                case 79599: goto L_0x010a;
                case 2213344: goto L_0x0102;
                case 2461856: goto L_0x00fa;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            goto L_0x011d
        L_0x00fa:
            boolean r5 = r0.equals(r12)     // Catch:{ all -> 0x011a }
            if (r5 == 0) goto L_0x011d
            r5 = r4
            goto L_0x011e
        L_0x0102:
            boolean r5 = r0.equals(r5)     // Catch:{ all -> 0x011a }
            if (r5 == 0) goto L_0x011d
            r5 = 1
            goto L_0x011e
        L_0x010a:
            boolean r5 = r0.equals(r15)     // Catch:{ all -> 0x011a }
            if (r5 == 0) goto L_0x011d
            r5 = 3
            goto L_0x011e
        L_0x0112:
            boolean r5 = r0.equals(r2)     // Catch:{ all -> 0x011a }
            if (r5 == 0) goto L_0x011d
            r5 = 0
            goto L_0x011e
        L_0x011a:
            r0 = move-exception
            goto L_0x0246
        L_0x011d:
            r5 = -1
        L_0x011e:
            if (r5 == 0) goto L_0x015a
            r6 = 1
            if (r5 == r6) goto L_0x015a
            if (r5 == r4) goto L_0x012b
            r4 = 3
            if (r5 == r4) goto L_0x012b
        L_0x0128:
            r12 = r6
            r6 = 0
            goto L_0x0176
        L_0x012b:
            r14.setRequestMethod(r0)     // Catch:{ all -> 0x0156 }
            if (r13 == 0) goto L_0x0128
            r14.setDoOutput(r6)     // Catch:{ all -> 0x0156 }
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch:{ all -> 0x011a }
            byte[] r4 = r13.getBytes(r4)     // Catch:{ all -> 0x011a }
            int r5 = r4.length     // Catch:{ all -> 0x011a }
            r14.setFixedLengthStreamingMode(r5)     // Catch:{ all -> 0x011a }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x011a }
            java.io.OutputStream r6 = r14.getOutputStream()     // Catch:{ all -> 0x011a }
            r5.<init>(r6)     // Catch:{ all -> 0x011a }
            r5.write(r4)     // Catch:{ all -> 0x011a }
            r5.flush()     // Catch:{ all -> 0x011a }
            r5.close()     // Catch:{ all -> 0x011a }
            r6 = 0
            r12 = 1
            goto L_0x0176
        L_0x0156:
            r0 = move-exception
        L_0x0157:
            r12 = r6
            goto L_0x024d
        L_0x015a:
            if (r13 == 0) goto L_0x0171
            java.lang.String r5 = "Body of %s hit is ignored: %s."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x011a }
            r6 = 0
            r4[r6] = r0     // Catch:{ all -> 0x016e }
            r12 = 1
            r4[r12] = r13     // Catch:{ all -> 0x0241 }
            java.lang.String r4 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x0241 }
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r4)     // Catch:{ all -> 0x0241 }
            goto L_0x0173
        L_0x016e:
            r0 = move-exception
            goto L_0x0247
        L_0x0171:
            r6 = 0
            r12 = 1
        L_0x0173:
            r14.setRequestMethod(r0)     // Catch:{ all -> 0x0241 }
        L_0x0176:
            int r4 = r14.getResponseCode()     // Catch:{ all -> 0x0241 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 < r5) goto L_0x01c1
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 < r5) goto L_0x0183
            goto L_0x01c1
        L_0x0183:
            java.io.InputStream r15 = r14.getInputStream()     // Catch:{ all -> 0x0241 }
            java.lang.String r4 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01be }
            int r5 = r4.length()     // Catch:{ all -> 0x01be }
            int r5 = r5 + 23
            int r13 = r0.length()     // Catch:{ all -> 0x01be }
            int r5 = r5 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r13.<init>(r5)     // Catch:{ all -> 0x01be }
            java.lang.String r5 = "Hit sent to "
            r13.append(r5)     // Catch:{ all -> 0x01be }
            r13.append(r4)     // Catch:{ all -> 0x01be }
            java.lang.String r4 = "(method = "
            r13.append(r4)     // Catch:{ all -> 0x01be }
            r13.append(r0)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = ")"
            r13.append(r0)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.gtm.C5426l3.m8133c(r0)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.gtm.m4 r0 = r1.f6088d     // Catch:{ all -> 0x01be }
            r0.mo33356b(r10)     // Catch:{ all -> 0x01be }
            goto L_0x0230
        L_0x01be:
            r0 = move-exception
            goto L_0x024f
        L_0x01c1:
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0241 }
            int r5 = r0.length()     // Catch:{ all -> 0x0241 }
            int r5 = r5 + 39
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r13.<init>(r5)     // Catch:{ all -> 0x0241 }
            java.lang.String r5 = "Bad response received for "
            r13.append(r5)     // Catch:{ all -> 0x0241 }
            r13.append(r0)     // Catch:{ all -> 0x0241 }
            r13.append(r3)     // Catch:{ all -> 0x0241 }
            r13.append(r4)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0241 }
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)     // Catch:{ all -> 0x0241 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r0.<init>()     // Catch:{ all -> 0x0241 }
            java.io.InputStream r4 = r14.getErrorStream()     // Catch:{ all -> 0x0239 }
            if (r4 == 0) goto L_0x0224
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0239 }
            java.io.InputStreamReader r13 = new java.io.InputStreamReader     // Catch:{ all -> 0x0239 }
            r13.<init>(r4)     // Catch:{ all -> 0x0239 }
            r5.<init>(r13)     // Catch:{ all -> 0x0239 }
        L_0x01fa:
            java.lang.String r4 = r5.readLine()     // Catch:{ all -> 0x0222 }
            if (r4 == 0) goto L_0x0204
            r0.append(r4)     // Catch:{ all -> 0x0222 }
            goto L_0x01fa
        L_0x0204:
            java.lang.String r4 = "Error Message: "
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0222 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0222 }
            int r13 = r0.length()     // Catch:{ all -> 0x0222 }
            if (r13 == 0) goto L_0x0219
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x0222 }
            goto L_0x021e
        L_0x0219:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0222 }
            r0.<init>(r4)     // Catch:{ all -> 0x0222 }
        L_0x021e:
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)     // Catch:{ all -> 0x0222 }
            goto L_0x0225
        L_0x0222:
            r0 = move-exception
            goto L_0x023b
        L_0x0224:
            r5 = 0
        L_0x0225:
            if (r5 == 0) goto L_0x022a
            r5.close()     // Catch:{ all -> 0x0241 }
        L_0x022a:
            com.google.android.gms.internal.gtm.m4 r0 = r1.f6088d     // Catch:{ all -> 0x0241 }
            r0.mo33357c(r10)     // Catch:{ all -> 0x0241 }
            r15 = 0
        L_0x0230:
            if (r15 == 0) goto L_0x0235
            r15.close()     // Catch:{ IOException -> 0x0258 }
        L_0x0235:
            r14.disconnect()     // Catch:{ IOException -> 0x0258 }
            goto L_0x029c
        L_0x0239:
            r0 = move-exception
            r5 = 0
        L_0x023b:
            if (r5 == 0) goto L_0x0240
            r5.close()     // Catch:{ all -> 0x0241 }
        L_0x0240:
            throw r0     // Catch:{ all -> 0x0241 }
        L_0x0241:
            r0 = move-exception
            goto L_0x024e
        L_0x0243:
            r0 = move-exception
            r16 = r4
        L_0x0246:
            r6 = 0
        L_0x0247:
            r12 = 1
            goto L_0x024e
        L_0x0249:
            r0 = move-exception
            r16 = r4
            r12 = r5
        L_0x024d:
            r6 = 0
        L_0x024e:
            r15 = 0
        L_0x024f:
            if (r15 == 0) goto L_0x0254
            r15.close()     // Catch:{ IOException -> 0x0258 }
        L_0x0254:
            r14.disconnect()     // Catch:{ IOException -> 0x0258 }
            throw r0     // Catch:{ IOException -> 0x0258 }
        L_0x0258:
            r0 = move-exception
            goto L_0x025f
        L_0x025a:
            r0 = move-exception
            r16 = r4
            r12 = r5
            r6 = 0
        L_0x025f:
            java.lang.String r4 = java.lang.String.valueOf(r11)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            int r11 = r4.length()
            int r11 = r11 + 27
            int r13 = r5.length()
            int r11 = r11 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r11)
            java.lang.String r11 = "Exception sending hit to "
            r13.append(r11)
            r13.append(r4)
            r13.append(r3)
            r13.append(r5)
            java.lang.String r4 = r13.toString()
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r4)
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)
            com.google.android.gms.internal.gtm.m4 r0 = r1.f6088d
            r0.mo33357c(r10)
        L_0x029c:
            int r7 = r7 + 1
            r5 = r12
            r4 = r16
            goto L_0x0013
        L_0x02a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5412k4.mo33319b(java.util.List):void");
    }

    C5412k4(Context context, C5442m4 m4Var) {
        this(new C5427l4(), context, m4Var);
    }
}
