package p042bo.app;

import com.rmn.api.p322v2.main.debug.AbstractDebugRequestMapper;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p126j0.C8266c;

/* renamed from: bo.app.n0 */
public final class C3453n0 {

    /* renamed from: o */
    static final Pattern f2202o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: p */
    private static final String f2203p = C8266c.m16405n(C3453n0.class);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final OutputStream f2204q = new C3455b();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final File f2205a;

    /* renamed from: b */
    private final File f2206b;

    /* renamed from: c */
    private final File f2207c;

    /* renamed from: d */
    private final File f2208d;

    /* renamed from: e */
    private final int f2209e;

    /* renamed from: f */
    private long f2210f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f2211g;

    /* renamed from: h */
    private long f2212h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Writer f2213i;

    /* renamed from: j */
    private final LinkedHashMap<String, C3694t0> f2214j = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f2215k;

    /* renamed from: l */
    private long f2216l = 0;

    /* renamed from: m */
    final ThreadPoolExecutor f2217m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n */
    private final Callable<Void> f2218n = new C3454a();

    /* renamed from: bo.app.n0$a */
    class C3454a implements Callable<Void> {
        C3454a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                bo.app.n0 r0 = p042bo.app.C3453n0.this
                monitor-enter(r0)
                bo.app.n0 r1 = p042bo.app.C3453n0.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f2213i     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                bo.app.n0 r1 = p042bo.app.C3453n0.this     // Catch:{ all -> 0x0028 }
                r1.m3462i()     // Catch:{ all -> 0x0028 }
                bo.app.n0 r1 = p042bo.app.C3453n0.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m3456e()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                bo.app.n0 r1 = p042bo.app.C3453n0.this     // Catch:{ all -> 0x0028 }
                r1.m3461h()     // Catch:{ all -> 0x0028 }
                bo.app.n0 r1 = p042bo.app.C3453n0.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f2215k = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3453n0.C3454a.call():java.lang.Void");
        }
    }

    /* renamed from: bo.app.n0$c */
    public final class C3456c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C3694t0 f2220a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f2221b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f2222c;

        /* renamed from: d */
        private boolean f2223d;

        /* renamed from: bo.app.n0$c$a */
        private class C3457a extends FilterOutputStream {
            /* synthetic */ C3457a(C3456c cVar, OutputStream outputStream, C3454a aVar) {
                this(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = C3456c.this.f2222c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = C3456c.this.f2222c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = C3456c.this.f2222c = true;
                }
            }

            private C3457a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = C3456c.this.f2222c = true;
                }
            }
        }

        /* synthetic */ C3456c(C3453n0 n0Var, C3694t0 t0Var, C3454a aVar) {
            this(t0Var);
        }

        private C3456c(C3694t0 t0Var) {
            this.f2220a = t0Var;
            this.f2221b = t0Var.f2598c ? null : new boolean[C3453n0.this.f2211g];
        }

        /* renamed from: b */
        public void mo29386b() {
            if (this.f2222c) {
                C3453n0.this.m3446a(this, false);
                C3453n0.this.mo29380d(this.f2220a.f2596a);
            } else {
                C3453n0.this.m3446a(this, true);
            }
            this.f2223d = true;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0026 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo29384a(int r5) {
            /*
                r4 = this;
                if (r5 < 0) goto L_0x004b
                bo.app.n0 r0 = p042bo.app.C3453n0.this
                int r0 = r0.f2211g
                if (r5 >= r0) goto L_0x004b
                bo.app.n0 r0 = p042bo.app.C3453n0.this
                monitor-enter(r0)
                bo.app.t0 r1 = r4.f2220a     // Catch:{ all -> 0x0048 }
                bo.app.n0$c r2 = r1.f2599d     // Catch:{ all -> 0x0048 }
                if (r2 != r4) goto L_0x0042
                boolean r2 = r1.f2598c     // Catch:{ all -> 0x0048 }
                if (r2 != 0) goto L_0x001c
                boolean[] r2 = r4.f2221b     // Catch:{ all -> 0x0048 }
                r3 = 1
                r2[r5] = r3     // Catch:{ all -> 0x0048 }
            L_0x001c:
                java.io.File r5 = r1.mo29677b((int) r5)     // Catch:{ all -> 0x0048 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0026 }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0026 }
                goto L_0x0034
            L_0x0026:
                bo.app.n0 r1 = p042bo.app.C3453n0.this     // Catch:{ all -> 0x0048 }
                java.io.File r1 = r1.f2205a     // Catch:{ all -> 0x0048 }
                r1.mkdirs()     // Catch:{ all -> 0x0048 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003c }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x003c }
            L_0x0034:
                bo.app.n0$c$a r5 = new bo.app.n0$c$a     // Catch:{ all -> 0x0048 }
                r2 = 0
                r5.<init>(r4, r1, r2)     // Catch:{ all -> 0x0048 }
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                return r5
            L_0x003c:
                java.io.OutputStream r5 = p042bo.app.C3453n0.f2204q     // Catch:{ all -> 0x0048 }
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                return r5
            L_0x0042:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0048 }
                r5.<init>()     // Catch:{ all -> 0x0048 }
                throw r5     // Catch:{ all -> 0x0048 }
            L_0x0048:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                throw r5
            L_0x004b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected index "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = " to be greater than 0 and less than the maximum value count of "
                r1.append(r5)
                bo.app.n0 r5 = p042bo.app.C3453n0.this
                int r5 = r5.f2211g
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3453n0.C3456c.mo29384a(int):java.io.OutputStream");
        }

        /* renamed from: a */
        public void mo29385a() {
            C3453n0.this.m3446a(this, false);
        }
    }

    /* renamed from: bo.app.n0$d */
    public final class C3458d implements Closeable {

        /* renamed from: b */
        private final String f2226b;

        /* renamed from: c */
        private final long f2227c;

        /* renamed from: d */
        private final InputStream[] f2228d;

        /* renamed from: e */
        private final long[] f2229e;

        /* synthetic */ C3458d(C3453n0 n0Var, String str, long j, InputStream[] inputStreamArr, long[] jArr, C3454a aVar) {
            this(str, j, inputStreamArr, jArr);
        }

        /* renamed from: a */
        public InputStream mo29391a(int i) {
            return this.f2228d[i];
        }

        public void close() {
            for (InputStream a : this.f2228d) {
                C3757v6.m4026a((Closeable) a);
            }
        }

        private C3458d(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f2226b = str;
            this.f2227c = j;
            this.f2228d = inputStreamArr;
            this.f2229e = jArr;
        }
    }

    private C3453n0(File file, int i, int i2, long j) {
        File file2 = file;
        this.f2205a = file2;
        this.f2209e = i;
        this.f2206b = new File(file2, "journal");
        this.f2207c = new File(file2, "journal.tmp");
        this.f2208d = new File(file2, "journal.bkp");
        this.f2211g = i2;
        this.f2210f = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f2215k = r0 - r9.f2214j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo29639b() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m3461h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f2213i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f2206b, true), p042bo.app.C3757v6.f2716a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3460g() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            bo.app.s5 r1 = new bo.app.s5
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f2206b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p042bo.app.C3757v6.f2716a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo29640c()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo29640c()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo29640c()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo29640c()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo29640c()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f2209e     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f2211g     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo29640c()     // Catch:{ EOFException -> 0x005f }
            r9.m3453c((java.lang.String) r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r2 = r9.f2214j     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f2215k = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo29639b()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m3461h()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f2206b     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p042bo.app.C3757v6.f2716a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f2213i = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p042bo.app.C3757v6.m4026a((java.io.Closeable) r1)
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
            p042bo.app.C3757v6.m4026a((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3453n0.m3460g():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m3461h() {
        Writer writer = this.f2213i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2207c), C3757v6.f2716a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f2209e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f2211g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C3694t0 next : this.f2214j.values()) {
                if (next.f2599d != null) {
                    bufferedWriter.write("DIRTY " + next.f2596a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f2596a + next.mo29676a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f2206b.exists()) {
                m3449a(this.f2206b, this.f2208d, true);
            }
            m3449a(this.f2207c, this.f2206b, false);
            this.f2208d.delete();
            this.f2213i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2206b, true), C3757v6.f2716a));
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return;
        throw th;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m3462i() {
        while (this.f2212h > this.f2210f) {
            mo29380d((String) this.f2214j.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: c */
    private void m3453c(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f2214j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C3694t0 t0Var = this.f2214j.get(str2);
            if (t0Var == null) {
                t0Var = new C3694t0(str2, this.f2211g, this.f2205a);
                this.f2214j.put(str2, t0Var);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                t0Var.f2598c = true;
                t0Var.f2599d = null;
                t0Var.mo29678b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                t0Var.f2599d = new C3456c(this, t0Var, (C3454a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m3456e() {
        int i = this.f2215k;
        return i >= 2000 && i >= this.f2214j.size();
    }

    /* renamed from: f */
    private void m3458f() {
        m3448a(this.f2207c);
        Iterator<C3694t0> it = this.f2214j.values().iterator();
        while (it.hasNext()) {
            C3694t0 next = it.next();
            int i = 0;
            if (next.f2599d == null) {
                while (i < this.f2211g) {
                    this.f2212h += next.f2597b[i];
                    i++;
                }
            } else {
                next.f2599d = null;
                while (i < this.f2211g) {
                    m3448a(next.mo29674a(i));
                    m3448a(next.mo29677b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f2215k++;
        r11.f2213i.append("READ " + r12 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (m3456e() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r11.f2217m.submit(r11.f2218n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        return new p042bo.app.C3453n0.C3458d(r11, r12, r0.f2600e, r8, r0.f2597b, (p042bo.app.C3453n0.C3454a) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p042bo.app.C3453n0.C3458d mo29377b(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.m3450b()     // Catch:{ all -> 0x007f }
            r11.m3455e((java.lang.String) r12)     // Catch:{ all -> 0x007f }
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r0 = r11.f2214j     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x007f }
            bo.app.t0 r0 = (p042bo.app.C3694t0) r0     // Catch:{ all -> 0x007f }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f2598c     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r11)
            return r1
        L_0x001a:
            int r2 = r11.f2211g     // Catch:{ all -> 0x007f }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x007f }
            r2 = 0
            r3 = r2
        L_0x0020:
            int r4 = r11.f2211g     // Catch:{ FileNotFoundException -> 0x006f }
            if (r3 >= r4) goto L_0x0032
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006f }
            java.io.File r5 = r0.mo29674a((int) r3)     // Catch:{ FileNotFoundException -> 0x006f }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006f }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x006f }
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0032:
            int r1 = r11.f2215k     // Catch:{ all -> 0x007f }
            int r1 = r1 + 1
            r11.f2215k = r1     // Catch:{ all -> 0x007f }
            java.io.Writer r1 = r11.f2213i     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r2.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x007f }
            r2.append(r12)     // Catch:{ all -> 0x007f }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007f }
            r1.append(r2)     // Catch:{ all -> 0x007f }
            boolean r1 = r11.m3456e()     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0060
            java.util.concurrent.ThreadPoolExecutor r1 = r11.f2217m     // Catch:{ all -> 0x007f }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.f2218n     // Catch:{ all -> 0x007f }
            r1.submit(r2)     // Catch:{ all -> 0x007f }
        L_0x0060:
            bo.app.n0$d r1 = new bo.app.n0$d     // Catch:{ all -> 0x007f }
            long r6 = r0.f2600e     // Catch:{ all -> 0x007f }
            long[] r9 = r0.f2597b     // Catch:{ all -> 0x007f }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch:{ all -> 0x007f }
            monitor-exit(r11)
            return r1
        L_0x006f:
            int r12 = r11.f2211g     // Catch:{ all -> 0x007f }
            if (r2 >= r12) goto L_0x007d
            r12 = r8[r2]     // Catch:{ all -> 0x007f }
            if (r12 == 0) goto L_0x007d
            p042bo.app.C3757v6.m4026a((java.io.Closeable) r12)     // Catch:{ all -> 0x007f }
            int r2 = r2 + 1
            goto L_0x006f
        L_0x007d:
            monitor-exit(r11)
            return r1
        L_0x007f:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3453n0.mo29377b(java.lang.String):bo.app.n0$d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo29380d(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m3450b()     // Catch:{ all -> 0x008a }
            r7.m3455e((java.lang.String) r8)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r0 = r7.f2214j     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008a }
            bo.app.t0 r0 = (p042bo.app.C3694t0) r0     // Catch:{ all -> 0x008a }
            r1 = 0
            if (r0 == 0) goto L_0x0088
            bo.app.n0$c r2 = r0.f2599d     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0017
            goto L_0x0088
        L_0x0017:
            int r2 = r7.f2211g     // Catch:{ all -> 0x008a }
            if (r1 >= r2) goto L_0x0053
            java.io.File r2 = r0.mo29674a((int) r1)     // Catch:{ all -> 0x008a }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r0.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008a }
            r8.<init>(r0)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x0043:
            long r2 = r7.f2212h     // Catch:{ all -> 0x008a }
            long[] r4 = r0.f2597b     // Catch:{ all -> 0x008a }
            r5 = r4[r1]     // Catch:{ all -> 0x008a }
            long r2 = r2 - r5
            r7.f2212h = r2     // Catch:{ all -> 0x008a }
            r2 = 0
            r4[r1] = r2     // Catch:{ all -> 0x008a }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0053:
            int r0 = r7.f2215k     // Catch:{ all -> 0x008a }
            r1 = 1
            int r0 = r0 + r1
            r7.f2215k = r0     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.f2213i     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r2.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x008a }
            r2.append(r8)     // Catch:{ all -> 0x008a }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r0 = r7.f2214j     // Catch:{ all -> 0x008a }
            r0.remove(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = r7.m3456e()     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x0086
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f2217m     // Catch:{ all -> 0x008a }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f2218n     // Catch:{ all -> 0x008a }
            r8.submit(r0)     // Catch:{ all -> 0x008a }
        L_0x0086:
            monitor-exit(r7)
            return r1
        L_0x0088:
            monitor-exit(r7)
            return r1
        L_0x008a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3453n0.mo29380d(java.lang.String):boolean");
    }

    /* renamed from: e */
    private void m3455e(String str) {
        if (!f2202o.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + AbstractDebugRequestMapper.QUOTE);
        }
    }

    /* renamed from: a */
    public static C3453n0 m3443a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m3449a(file2, file3, false);
                }
            }
            C3453n0 n0Var = new C3453n0(file, i, i2, j);
            if (n0Var.f2206b.exists()) {
                try {
                    n0Var.m3460g();
                    n0Var.m3458f();
                    return n0Var;
                } catch (IOException e) {
                    String str = f2203p;
                    C8266c.m16416z(str, "DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    n0Var.mo29379d();
                }
            }
            file.mkdirs();
            C3453n0 n0Var2 = new C3453n0(file, i, i2, j);
            n0Var2.m3461h();
            return n0Var2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: b */
    private void m3450b() {
        if (this.f2213i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: d */
    public void mo29379d() {
        mo29378c();
        C3757v6.m4027a(this.f2205a);
    }

    /* renamed from: c */
    public synchronized void mo29378c() {
        if (this.f2213i != null) {
            Iterator it = new ArrayList(this.f2214j.values()).iterator();
            while (it.hasNext()) {
                C3456c cVar = ((C3694t0) it.next()).f2599d;
                if (cVar != null) {
                    cVar.mo29385a();
                }
            }
            m3462i();
            this.f2213i.close();
            this.f2213i = null;
        }
    }

    /* renamed from: bo.app.n0$b */
    class C3455b extends OutputStream {
        C3455b() {
        }

        public void write(int i) {
        }
    }

    /* renamed from: a */
    private static void m3448a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m3449a(File file, File file2, boolean z) {
        if (z) {
            m3448a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public C3456c mo29376a(String str) {
        return m3442a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p042bo.app.C3453n0.C3456c m3442a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m3450b()     // Catch:{ all -> 0x0060 }
            r5.m3455e((java.lang.String) r6)     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r0 = r5.f2214j     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0060 }
            bo.app.t0 r0 = (p042bo.app.C3694t0) r0     // Catch:{ all -> 0x0060 }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x001e
            long r3 = r0.f2600e     // Catch:{ all -> 0x0060 }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0020
        L_0x001e:
            monitor-exit(r5)
            return r2
        L_0x0020:
            if (r0 != 0) goto L_0x0031
            bo.app.t0 r0 = new bo.app.t0     // Catch:{ all -> 0x0060 }
            int r7 = r5.f2211g     // Catch:{ all -> 0x0060 }
            java.io.File r8 = r5.f2205a     // Catch:{ all -> 0x0060 }
            r0.<init>(r6, r7, r8)     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r7 = r5.f2214j     // Catch:{ all -> 0x0060 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0037
        L_0x0031:
            bo.app.n0$c r7 = r0.f2599d     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r2
        L_0x0037:
            bo.app.n0$c r7 = new bo.app.n0$c     // Catch:{ all -> 0x0060 }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x0060 }
            r0.f2599d = r7     // Catch:{ all -> 0x0060 }
            java.io.Writer r8 = r5.f2213i     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch:{ all -> 0x0060 }
            r0.append(r6)     // Catch:{ all -> 0x0060 }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0060 }
            r8.write(r6)     // Catch:{ all -> 0x0060 }
            java.io.Writer r6 = r5.f2213i     // Catch:{ all -> 0x0060 }
            r6.flush()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return r7
        L_0x0060:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3453n0.m3442a(java.lang.String, long):bo.app.n0$c");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m3446a(p042bo.app.C3453n0.C3456c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            bo.app.t0 r0 = r10.f2220a     // Catch:{ all -> 0x00fd }
            bo.app.n0$c r1 = r0.f2599d     // Catch:{ all -> 0x00fd }
            if (r1 != r10) goto L_0x00f7
            r1 = 0
            if (r11 == 0) goto L_0x0049
            boolean r2 = r0.f2598c     // Catch:{ all -> 0x00fd }
            if (r2 != 0) goto L_0x0049
            r2 = r1
        L_0x0011:
            int r3 = r9.f2211g     // Catch:{ all -> 0x00fd }
            if (r2 >= r3) goto L_0x0049
            boolean[] r3 = r10.f2221b     // Catch:{ all -> 0x00fd }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fd }
            if (r3 == 0) goto L_0x002f
            java.io.File r3 = r0.mo29677b((int) r2)     // Catch:{ all -> 0x00fd }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00fd }
            if (r3 != 0) goto L_0x002c
            r10.mo29385a()     // Catch:{ all -> 0x00fd }
            monitor-exit(r9)
            return
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x002f:
            r10.mo29385a()     // Catch:{ all -> 0x00fd }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r11.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fd }
            r11.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fd }
            r10.<init>(r11)     // Catch:{ all -> 0x00fd }
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x0049:
            int r10 = r9.f2211g     // Catch:{ all -> 0x00fd }
            if (r1 >= r10) goto L_0x0079
            java.io.File r10 = r0.mo29677b((int) r1)     // Catch:{ all -> 0x00fd }
            if (r11 == 0) goto L_0x0073
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x0076
            java.io.File r2 = r0.mo29674a((int) r1)     // Catch:{ all -> 0x00fd }
            r10.renameTo(r2)     // Catch:{ all -> 0x00fd }
            long[] r10 = r0.f2597b     // Catch:{ all -> 0x00fd }
            r3 = r10[r1]     // Catch:{ all -> 0x00fd }
            long r5 = r2.length()     // Catch:{ all -> 0x00fd }
            long[] r10 = r0.f2597b     // Catch:{ all -> 0x00fd }
            r10[r1] = r5     // Catch:{ all -> 0x00fd }
            long r7 = r9.f2212h     // Catch:{ all -> 0x00fd }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f2212h = r7     // Catch:{ all -> 0x00fd }
            goto L_0x0076
        L_0x0073:
            m3448a((java.io.File) r10)     // Catch:{ all -> 0x00fd }
        L_0x0076:
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0079:
            int r10 = r9.f2215k     // Catch:{ all -> 0x00fd }
            r1 = 1
            int r10 = r10 + r1
            r9.f2215k = r10     // Catch:{ all -> 0x00fd }
            r10 = 0
            r0.f2599d = r10     // Catch:{ all -> 0x00fd }
            boolean r10 = r0.f2598c     // Catch:{ all -> 0x00fd }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b9
            r0.f2598c = r1     // Catch:{ all -> 0x00fd }
            java.io.Writer r10 = r9.f2213i     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r1.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = r0.f2596a     // Catch:{ all -> 0x00fd }
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = r0.mo29676a()     // Catch:{ all -> 0x00fd }
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            r1.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fd }
            r10.write(r1)     // Catch:{ all -> 0x00fd }
            if (r11 == 0) goto L_0x00db
            long r10 = r9.f2216l     // Catch:{ all -> 0x00fd }
            r1 = 1
            long r1 = r1 + r10
            r9.f2216l = r1     // Catch:{ all -> 0x00fd }
            r0.f2600e = r10     // Catch:{ all -> 0x00fd }
            goto L_0x00db
        L_0x00b9:
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r10 = r9.f2214j     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r0.f2596a     // Catch:{ all -> 0x00fd }
            r10.remove(r11)     // Catch:{ all -> 0x00fd }
            java.io.Writer r10 = r9.f2213i     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r11.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r0.f2596a     // Catch:{ all -> 0x00fd }
            r11.append(r0)     // Catch:{ all -> 0x00fd }
            r11.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fd }
            r10.write(r11)     // Catch:{ all -> 0x00fd }
        L_0x00db:
            java.io.Writer r10 = r9.f2213i     // Catch:{ all -> 0x00fd }
            r10.flush()     // Catch:{ all -> 0x00fd }
            long r10 = r9.f2212h     // Catch:{ all -> 0x00fd }
            long r0 = r9.f2210f     // Catch:{ all -> 0x00fd }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ee
            boolean r10 = r9.m3456e()     // Catch:{ all -> 0x00fd }
            if (r10 == 0) goto L_0x00f5
        L_0x00ee:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f2217m     // Catch:{ all -> 0x00fd }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f2218n     // Catch:{ all -> 0x00fd }
            r10.submit(r11)     // Catch:{ all -> 0x00fd }
        L_0x00f5:
            monitor-exit(r9)
            return
        L_0x00f7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            r10.<init>()     // Catch:{ all -> 0x00fd }
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3453n0.m3446a(bo.app.n0$c, boolean):void");
    }
}
