package p126j0;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p336ef.C11906l;
import p404of.C13074a;

/* renamed from: j0.a */
public final class C8233a {

    /* renamed from: a */
    private static final String f11596a = C8266c.f11641a.mo42215o("BrazeFileUtils");

    /* renamed from: b */
    public static final List<String> f11597b = C12726w.m28527n(ProxyConfig.MATCH_HTTP, "https", "ftp", "ftps", "about", "javascript");

    /* renamed from: j0.a$a */
    static final class C8234a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ File f11598g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8234a(File file) {
            super(0);
            this.f11598g = file;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Could not recursively delete ", this.f11598g.getName());
        }
    }

    /* renamed from: j0.a$b */
    static final class C8235b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11599g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8235b(String str) {
            super(0);
            this.f11599g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("SDK is offline. File not downloaded for url: ", this.f11599g);
        }
    }

    /* renamed from: j0.a$c */
    static final class C8236c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8236c f11600g = new C8236c();

        C8236c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Download directory null or blank. File not downloaded.";
        }
    }

    /* renamed from: j0.a$d */
    static final class C8237d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8237d f11601g = new C8237d();

        C8237d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Zip file url null or blank. File not downloaded.";
        }
    }

    /* renamed from: j0.a$e */
    static final class C8238e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8238e f11602g = new C8238e();

        C8238e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Output filename null or blank. File not downloaded.";
        }
    }

    /* renamed from: j0.a$f */
    static final class C8239f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11603g;

        /* renamed from: h */
        final /* synthetic */ String f11604h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8239f(int i, String str) {
            super(0);
            this.f11603g = i;
            this.f11604h = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "HTTP response code was " + this.f11603g + ". File with url " + this.f11604h + " could not be downloaded.";
        }
    }

    /* renamed from: j0.a$g */
    static final class C8240g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11605g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8240g(String str) {
            super(0);
            this.f11605g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Exception during download of file from url : ", this.f11605g);
        }
    }

    /* renamed from: j0.a$h */
    static final class C8241h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8241h f11606g = new C8241h();

        C8241h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Null or blank Uri scheme.";
        }
    }

    /* renamed from: a */
    public static final void m16339a(File file) {
        C12775o.m28639i(file, "fileOrDirectory");
        if (!C12956j.m29270e(file)) {
            C8266c.m16397f(C8266c.f11641a, f11596a, C8266c.C8267a.f11651g, (Throwable) null, false, new C8234a(file), 12, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        p392mf.C12941b.m29245a(r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        p392mf.C12941b.m29245a(r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046 A[Catch:{ Exception -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062 A[Catch:{ Exception -> 0x00d8, all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009e A[Catch:{ Exception -> 0x00d8, all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p336ef.C11906l<java.io.File, java.util.Map<java.lang.String, java.lang.String>> m16340b(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "downloadDirectoryAbsolutePath"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "remoteFileUrl"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "outputFilename"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r0)
            x.b$a r0 = p270x.C10156b.f15345m
            boolean r0 = r0.mo44812h()
            if (r0 != 0) goto L_0x014d
            boolean r0 = p454wf.C13754v.m31532t(r9)
            if (r0 != 0) goto L_0x0135
            boolean r0 = p454wf.C13754v.m31532t(r10)
            if (r0 != 0) goto L_0x011d
            boolean r0 = p454wf.C13754v.m31532t(r11)
            if (r0 != 0) goto L_0x0105
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00de }
            r1.<init>(r9)     // Catch:{ Exception -> 0x00de }
            r1.mkdirs()     // Catch:{ Exception -> 0x00de }
            r1 = 0
            if (r12 == 0) goto L_0x0043
            boolean r2 = p454wf.C13754v.m31532t(r12)     // Catch:{ Exception -> 0x00de }
            if (r2 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r2 = r1
            goto L_0x0044
        L_0x0043:
            r2 = 1
        L_0x0044:
            if (r2 != 0) goto L_0x004a
            java.lang.String r11 = kotlin.jvm.internal.C12775o.m28647q(r11, r12)     // Catch:{ Exception -> 0x00de }
        L_0x004a:
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x00de }
            r12.<init>(r9, r11)     // Catch:{ Exception -> 0x00de }
            java.net.URL r9 = new java.net.URL     // Catch:{ Exception -> 0x00de }
            r9.<init>(r10)     // Catch:{ Exception -> 0x00de }
            bo.app.s6 r11 = p042bo.app.C3672s6.f2557a     // Catch:{ Exception -> 0x00de }
            java.net.HttpURLConnection r9 = r11.mo29643a(r9)     // Catch:{ Exception -> 0x00de }
            int r11 = r9.getResponseCode()     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r11 != r2) goto L_0x009e
            java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.io.InputStream r2 = r9.getInputStream()     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r11.<init>(r2)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0097 }
            r2.<init>(r12)     // Catch:{ all -> 0x0097 }
            r3 = 2
            p392mf.C12940a.m29243b(r11, r2, r1, r3, r0)     // Catch:{ all -> 0x0090 }
            p392mf.C12941b.m29245a(r2, r0)     // Catch:{ all -> 0x0097 }
            p392mf.C12941b.m29245a(r11, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.util.Map r11 = r9.getHeaderFields()     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.lang.String r0 = "urlConnection.headerFields"
            kotlin.jvm.internal.C12775o.m28638h(r11, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.util.Map r10 = p042bo.app.C3745v1.m4014a((java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) r11)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r9.disconnect()
            ef.l r9 = new ef.l
            r9.<init>(r12, r10)
            return r9
        L_0x0090:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            p392mf.C12941b.m29245a(r2, r12)     // Catch:{ all -> 0x0097 }
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            p392mf.C12941b.m29245a(r11, r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            throw r0     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
        L_0x009e:
            j0.c r0 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.lang.String r1 = f11596a     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r2 = 0
            r3 = 0
            r4 = 0
            j0.a$f r5 = new j0.a$f     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r5.<init>(r11, r10)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r6 = 14
            r7 = 0
            p126j0.C8266c.m16397f(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r0.<init>()     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.lang.String r1 = "HTTP response code was "
            r0.append(r1)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r0.append(r11)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.lang.String r11 = ". File with url "
            r0.append(r11)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r0.append(r10)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.lang.String r11 = " could not be downloaded."
            r0.append(r11)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            java.lang.String r11 = r0.toString()     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            throw r12     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
        L_0x00d4:
            r10 = move-exception
            r0 = r9
            r9 = r10
            goto L_0x00fe
        L_0x00d8:
            r11 = move-exception
            r0 = r9
            r4 = r11
            goto L_0x00e0
        L_0x00dc:
            r9 = move-exception
            goto L_0x00fe
        L_0x00de:
            r9 = move-exception
            r4 = r9
        L_0x00e0:
            j0.c r1 = p126j0.C8266c.f11641a     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = f11596a     // Catch:{ all -> 0x00dc }
            j0.c$a r3 = p126j0.C8266c.C8267a.f11649e     // Catch:{ all -> 0x00dc }
            r5 = 0
            j0.a$g r6 = new j0.a$g     // Catch:{ all -> 0x00dc }
            r6.<init>(r10)     // Catch:{ all -> 0x00dc }
            r7 = 8
            r8 = 0
            p126j0.C8266c.m16397f(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00dc }
            java.lang.Exception r9 = new java.lang.Exception     // Catch:{ all -> 0x00dc }
            java.lang.String r11 = "Exception during download of file from url : "
            java.lang.String r10 = kotlin.jvm.internal.C12775o.m28647q(r11, r10)     // Catch:{ all -> 0x00dc }
            r9.<init>(r10)     // Catch:{ all -> 0x00dc }
            throw r9     // Catch:{ all -> 0x00dc }
        L_0x00fe:
            if (r0 != 0) goto L_0x0101
            goto L_0x0104
        L_0x0101:
            r0.disconnect()
        L_0x0104:
            throw r9
        L_0x0105:
            j0.c r1 = p126j0.C8266c.f11641a
            java.lang.String r2 = f11596a
            j0.c$a r3 = p126j0.C8266c.C8267a.I
            j0.a$e r6 = p126j0.C8233a.C8238e.f11602g
            r4 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            p126j0.C8266c.m16397f(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Output filename is blank. File not downloaded."
            r9.<init>(r10)
            throw r9
        L_0x011d:
            j0.c r0 = p126j0.C8266c.f11641a
            java.lang.String r1 = f11596a
            j0.c$a r2 = p126j0.C8266c.C8267a.I
            j0.a$d r5 = p126j0.C8233a.C8237d.f11601g
            r3 = 0
            r4 = 0
            r6 = 12
            r7 = 0
            p126j0.C8266c.m16397f(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Zip file url is blank. File not downloaded."
            r9.<init>(r10)
            throw r9
        L_0x0135:
            j0.c r0 = p126j0.C8266c.f11641a
            java.lang.String r1 = f11596a
            j0.c$a r2 = p126j0.C8266c.C8267a.I
            j0.a$c r5 = p126j0.C8233a.C8236c.f11600g
            r3 = 0
            r4 = 0
            r6 = 12
            r7 = 0
            p126j0.C8266c.m16397f(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Download directory is blank. File not downloaded."
            r9.<init>(r10)
            throw r9
        L_0x014d:
            j0.c r0 = p126j0.C8266c.f11641a
            java.lang.String r1 = f11596a
            j0.c$a r2 = p126j0.C8266c.C8267a.I
            j0.a$b r5 = new j0.a$b
            r5.<init>(r10)
            r3 = 0
            r4 = 0
            r6 = 12
            r7 = 0
            p126j0.C8266c.m16397f(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r11 = "SDK is offline. File not downloaded for url: "
            java.lang.String r10 = kotlin.jvm.internal.C12775o.m28647q(r11, r10)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p126j0.C8233a.m16340b(java.lang.String, java.lang.String, java.lang.String, java.lang.String):ef.l");
    }

    /* renamed from: c */
    public static /* synthetic */ C11906l m16341c(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return m16340b(str, str2, str3, str4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        p392mf.C12941b.m29245a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        throw r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m16342d(android.content.res.AssetManager r1, java.lang.String r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "assetPath"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.io.InputStream r1 = r1.open(r2)
            java.lang.String r2 = "this.open(assetPath)"
            kotlin.jvm.internal.C12775o.m28638h(r1, r2)
            java.nio.charset.Charset r2 = p454wf.C13726d.f22152b
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r2)
            boolean r1 = r0 instanceof java.io.BufferedReader
            if (r1 == 0) goto L_0x0021
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L_0x0029
        L_0x0021:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r0, r2)
            r0 = r1
        L_0x0029:
            java.lang.String r1 = p392mf.C12957k.m29276c(r0)     // Catch:{ all -> 0x0032 }
            r2 = 0
            p392mf.C12941b.m29245a(r0, r2)
            return r1
        L_0x0032:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r2 = move-exception
            p392mf.C12941b.m29245a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p126j0.C8233a.m16342d(android.content.res.AssetManager, java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public static final boolean m16343e(Uri uri) {
        boolean z;
        C12775o.m28639i(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme == null || C13754v.m31532t(scheme)) {
            z = true;
        } else {
            z = false;
        }
        if (z || C12775o.m28634d(scheme, "file")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m16344f(Uri uri) {
        boolean z;
        C12775o.m28639i(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme == null || C13754v.m31532t(scheme)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return f11597b.contains(scheme);
        }
        C8266c.m16397f(C8266c.f11641a, f11596a, C8266c.C8267a.I, (Throwable) null, false, C8241h.f11606g, 12, (Object) null);
        return false;
    }
}
