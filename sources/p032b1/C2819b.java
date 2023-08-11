package p032b1;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: b1.b */
/* compiled from: DiskLruCache */
public final class C2819b implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final File f1127b;

    /* renamed from: c */
    private final File f1128c;

    /* renamed from: d */
    private final File f1129d;

    /* renamed from: e */
    private final File f1130e;

    /* renamed from: f */
    private final int f1131f;

    /* renamed from: g */
    private long f1132g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f1133h;

    /* renamed from: i */
    private long f1134i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Writer f1135j;

    /* renamed from: k */
    private final LinkedHashMap<String, C2823d> f1136k = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f1137l;

    /* renamed from: m */
    private long f1138m = 0;

    /* renamed from: n */
    final ThreadPoolExecutor f1139n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2821b((C2820a) null));

    /* renamed from: o */
    private final Callable<Void> f1140o = new C2820a();

    /* renamed from: b1.b$a */
    /* compiled from: DiskLruCache */
    class C2820a implements Callable<Void> {
        C2820a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                b1.b r0 = p032b1.C2819b.this
                monitor-enter(r0)
                b1.b r1 = p032b1.C2819b.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f1135j     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                b1.b r1 = p032b1.C2819b.this     // Catch:{ all -> 0x0028 }
                r1.m2095B0()     // Catch:{ all -> 0x0028 }
                b1.b r1 = p032b1.C2819b.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m2109t0()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                b1.b r1 = p032b1.C2819b.this     // Catch:{ all -> 0x0028 }
                r1.m2114y0()     // Catch:{ all -> 0x0028 }
                b1.b r1 = p032b1.C2819b.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f1137l = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p032b1.C2819b.C2820a.call():java.lang.Void");
        }
    }

    /* renamed from: b1.b$b */
    /* compiled from: DiskLruCache */
    private static final class C2821b implements ThreadFactory {
        private C2821b() {
        }

        /* synthetic */ C2821b(C2820a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: b1.b$c */
    /* compiled from: DiskLruCache */
    public final class C2822c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C2823d f1142a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f1143b;

        /* renamed from: c */
        private boolean f1144c;

        /* synthetic */ C2822c(C2819b bVar, C2823d dVar, C2820a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo28314a() {
            C2819b.this.m2101X(this, false);
        }

        /* renamed from: b */
        public void mo28315b() {
            if (!this.f1144c) {
                try {
                    mo28314a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo28316e() {
            C2819b.this.m2101X(this, true);
            this.f1144c = true;
        }

        /* renamed from: f */
        public File mo28317f(int i) {
            File k;
            synchronized (C2819b.this) {
                if (this.f1142a.f1151f == this) {
                    if (!this.f1142a.f1150e) {
                        this.f1143b[i] = true;
                    }
                    k = this.f1142a.mo28319k(i);
                    if (!C2819b.this.f1127b.exists()) {
                        C2819b.this.f1127b.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        private C2822c(C2823d dVar) {
            this.f1142a = dVar;
            this.f1143b = dVar.f1150e ? null : new boolean[C2819b.this.f1133h];
        }
    }

    /* renamed from: b1.b$d */
    /* compiled from: DiskLruCache */
    private final class C2823d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f1146a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f1147b;

        /* renamed from: c */
        File[] f1148c;

        /* renamed from: d */
        File[] f1149d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f1150e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2822c f1151f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f1152g;

        /* synthetic */ C2823d(C2819b bVar, String str, C2820a aVar) {
            this(str);
        }

        /* renamed from: m */
        private IOException m2135m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m2136n(String[] strArr) {
            if (strArr.length == C2819b.this.f1133h) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f1147b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m2135m(strArr);
                    }
                }
                return;
            }
            throw m2135m(strArr);
        }

        /* renamed from: j */
        public File mo28318j(int i) {
            return this.f1148c[i];
        }

        /* renamed from: k */
        public File mo28319k(int i) {
            return this.f1149d[i];
        }

        /* renamed from: l */
        public String mo28320l() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f1147b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private C2823d(String str) {
            this.f1146a = str;
            this.f1147b = new long[C2819b.this.f1133h];
            this.f1148c = new File[C2819b.this.f1133h];
            this.f1149d = new File[C2819b.this.f1133h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C2819b.this.f1133h; i++) {
                sb.append(i);
                this.f1148c[i] = new File(C2819b.this.f1127b, sb.toString());
                sb.append(".tmp");
                this.f1149d[i] = new File(C2819b.this.f1127b, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: b1.b$e */
    /* compiled from: DiskLruCache */
    public final class C2824e {

        /* renamed from: a */
        private final String f1154a;

        /* renamed from: b */
        private final long f1155b;

        /* renamed from: c */
        private final long[] f1156c;

        /* renamed from: d */
        private final File[] f1157d;

        /* synthetic */ C2824e(C2819b bVar, String str, long j, File[] fileArr, long[] jArr, C2820a aVar) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo28321a(int i) {
            return this.f1157d[i];
        }

        private C2824e(String str, long j, File[] fileArr, long[] jArr) {
            this.f1154a = str;
            this.f1155b = j;
            this.f1157d = fileArr;
            this.f1156c = jArr;
        }
    }

    private C2819b(File file, int i, int i2, long j) {
        File file2 = file;
        this.f1127b = file2;
        this.f1131f = i;
        this.f1128c = new File(file2, "journal");
        this.f1129d = new File(file2, "journal.tmp");
        this.f1130e = new File(file2, "journal.bkp");
        this.f1133h = i2;
        this.f1132g = j;
    }

    /* renamed from: A0 */
    private static void m2094A0(File file, File file2, boolean z) {
        if (z) {
            m2103a0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m2095B0() {
        while (this.f1134i > this.f1132g) {
            mo28310z0((String) this.f1136k.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: R */
    private void m2099R() {
        if (this.f1135j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: V */
    private static void m2100V(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m2101X(p032b1.C2819b.C2822c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            b1.b$d r0 = r10.f1142a     // Catch:{ all -> 0x010e }
            b1.b$c r1 = r0.f1151f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f1150e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = r1
        L_0x0015:
            int r3 = r9.f1133h     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f1143b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo28319k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo28314a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo28314a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f1133h     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo28319k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo28318j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f1147b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f1147b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f1134i     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f1134i = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m2103a0(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f1137l     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f1137l = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            p032b1.C2819b.C2822c unused = r0.f1151f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f1150e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f1150e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f1135j     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f1135j     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f1135j     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f1146a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f1135j     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo28320l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f1135j     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f1138m     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f1138m = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f1152g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, b1.b$d> r10 = r9.f1136k     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f1146a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f1135j     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f1135j     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f1135j     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f1146a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f1135j     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f1135j     // Catch:{ all -> 0x010e }
            m2108k0(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f1134i     // Catch:{ all -> 0x010e }
            long r0 = r9.f1132g     // Catch:{ all -> 0x010e }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ff
            boolean r10 = r9.m2109t0()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f1139n     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f1140o     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p032b1.C2819b.m2101X(b1.b$c, boolean):void");
    }

    /* renamed from: a0 */
    private static void m2103a0(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p032b1.C2819b.C2822c m2106j0(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m2099R()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, b1.b$d> r0 = r5.f1136k     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            b1.b$d r0 = (p032b1.C2819b.C2823d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r3 = r0.f1152g     // Catch:{ all -> 0x005d }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r2
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            b1.b$d r0 = new b1.b$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, b1.b$d> r7 = r5.f1136k     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            b1.b$c r7 = r0.f1151f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r2
        L_0x0034:
            b1.b$c r7 = new b1.b$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x005d }
            p032b1.C2819b.C2822c unused = r0.f1151f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f1135j     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f1135j     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f1135j     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f1135j     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f1135j     // Catch:{ all -> 0x005d }
            m2108k0(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p032b1.C2819b.m2106j0(java.lang.String, long):b1.b$c");
    }

    /* renamed from: k0 */
    private static void m2108k0(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public boolean m2109t0() {
        int i = this.f1137l;
        if (i < 2000 || i < this.f1136k.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: u0 */
    public static C2819b m2110u0(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m2094A0(file2, file3, false);
                }
            }
            C2819b bVar = new C2819b(file, i, i2, j);
            if (bVar.f1128c.exists()) {
                try {
                    bVar.m2112w0();
                    bVar.m2111v0();
                    return bVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    bVar.mo28306Y();
                }
            }
            file.mkdirs();
            C2819b bVar2 = new C2819b(file, i, i2, j);
            bVar2.m2114y0();
            return bVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: v0 */
    private void m2111v0() {
        m2103a0(this.f1129d);
        Iterator<C2823d> it = this.f1136k.values().iterator();
        while (it.hasNext()) {
            C2823d next = it.next();
            int i = 0;
            if (next.f1151f == null) {
                while (i < this.f1133h) {
                    this.f1134i += next.f1147b[i];
                    i++;
                }
            } else {
                C2822c unused = next.f1151f = null;
                while (i < this.f1133h) {
                    m2103a0(next.mo28318j(i));
                    m2103a0(next.mo28319k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f1137l = r0 - r9.f1136k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo28322c() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m2114y0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f1135j = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f1128c, true), p032b1.C2827d.f1165a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2112w0() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            b1.c r1 = new b1.c
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f1128c
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p032b1.C2827d.f1165a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo28324k()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo28324k()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo28324k()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo28324k()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo28324k()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f1131f     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f1133h     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo28324k()     // Catch:{ EOFException -> 0x005f }
            r9.m2113x0(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, b1.b$d> r2 = r9.f1136k     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f1137l = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo28322c()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m2114y0()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f1128c     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p032b1.C2827d.f1165a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f1135j = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p032b1.C2827d.m2145a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            p032b1.C2827d.m2145a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p032b1.C2819b.m2112w0():void");
    }

    /* renamed from: x0 */
    private void m2113x0(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f1136k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C2823d dVar = this.f1136k.get(str2);
            if (dVar == null) {
                dVar = new C2823d(this, str2, (C2820a) null);
                this.f1136k.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f1150e = true;
                C2822c unused2 = dVar.f1151f = null;
                dVar.m2136n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C2822c unused3 = dVar.f1151f = new C2822c(this, dVar, (C2820a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public synchronized void m2114y0() {
        Writer writer = this.f1135j;
        if (writer != null) {
            m2100V(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1129d), C2827d.f1165a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f1131f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f1133h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C2823d next : this.f1136k.values()) {
                if (next.f1151f != null) {
                    bufferedWriter.write("DIRTY " + next.f1146a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f1146a + next.mo28320l() + 10);
                }
            }
            m2100V(bufferedWriter);
            if (this.f1128c.exists()) {
                m2094A0(this.f1128c, this.f1130e, true);
            }
            m2094A0(this.f1129d, this.f1128c, false);
            this.f1130e.delete();
            this.f1135j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1128c, true), C2827d.f1165a));
        } catch (Throwable th) {
            m2100V(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: Y */
    public void mo28306Y() {
        close();
        C2827d.m2146b(this.f1127b);
    }

    /* renamed from: c0 */
    public C2822c mo28307c0(String str) {
        return m2106j0(str, -1);
    }

    public synchronized void close() {
        if (this.f1135j != null) {
            Iterator it = new ArrayList(this.f1136k.values()).iterator();
            while (it.hasNext()) {
                C2823d dVar = (C2823d) it.next();
                if (dVar.f1151f != null) {
                    dVar.f1151f.mo28314a();
                }
            }
            m2095B0();
            m2100V(this.f1135j);
            this.f1135j = null;
        }
    }

    /* renamed from: p0 */
    public synchronized C2824e mo28309p0(String str) {
        m2099R();
        C2823d dVar = this.f1136k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f1150e) {
            return null;
        }
        for (File exists : dVar.f1148c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f1137l++;
        this.f1135j.append("READ");
        this.f1135j.append(' ');
        this.f1135j.append(str);
        this.f1135j.append(10);
        if (m2109t0()) {
            this.f1139n.submit(this.f1140o);
        }
        return new C2824e(this, str, dVar.f1152g, dVar.f1148c, dVar.f1147b, (C2820a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo28310z0(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m2099R()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, b1.b$d> r0 = r7.f1136k     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            b1.b$d r0 = (p032b1.C2819b.C2823d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            b1.b$c r2 = r0.f1151f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f1133h     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo28318j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f1134i     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f1147b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f1134i = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f1147b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f1137l     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f1137l = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f1135j     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f1135j     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f1135j     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f1135j     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, b1.b$d> r0 = r7.f1136k     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m2109t0()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f1139n     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f1140o     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p032b1.C2819b.mo28310z0(java.lang.String):boolean");
    }
}
