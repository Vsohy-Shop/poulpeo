package p125j;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13127d;
import okio.C13143j;
import okio.C13145j0;
import okio.C13146k;
import okio.C13158p0;
import okio.C13175w0;
import p259w.C10065e;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p454wf.C13735j;
import p466yf.C13971h0;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14004n0;
import p466yf.C14039u2;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 FileSystem.kt\nokio/FileSystem\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,869:1\n1#2:870\n64#3:871\n52#3,5:873\n60#3,7:879\n57#3,13:886\n52#3,5:909\n60#3,7:915\n57#3,13:922\n66#4:872\n67#4:878\n79#4:906\n160#4:907\n80#4:908\n81#4:914\n361#5,7:899\n37#6,2:935\n37#6,2:937\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache\n*L\n207#1:871\n207#1:873,5\n207#1:879,7\n207#1:886,13\n320#1:909,5\n320#1:915,7\n320#1:922,13\n207#1:872\n207#1:878\n320#1:906\n320#1:907\n320#1:908\n320#1:914\n270#1:899,7\n585#1:935,2\n641#1:937,2\n*E\n"})
/* renamed from: j.b */
/* compiled from: DiskLruCache.kt */
public final class C8220b implements Closeable, Flushable {

    /* renamed from: t */
    public static final C8221a f11548t = new C8221a((DefaultConstructorMarker) null);

    /* renamed from: u */
    private static final C13735j f11549u = new C13735j("[a-z0-9_-]{1,120}");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13158p0 f11550b;

    /* renamed from: c */
    private final long f11551c;

    /* renamed from: d */
    private final int f11552d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f11553e;

    /* renamed from: f */
    private final C13158p0 f11554f;

    /* renamed from: g */
    private final C13158p0 f11555g;

    /* renamed from: h */
    private final C13158p0 f11556h;

    /* renamed from: i */
    private final LinkedHashMap<String, C8223c> f11557i;

    /* renamed from: j */
    private final C13995l0 f11558j;

    /* renamed from: k */
    private long f11559k;

    /* renamed from: l */
    private int f11560l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C13127d f11561m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f11562n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f11563o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f11564p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f11565q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f11566r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C8225e f11567s;

    /* renamed from: j.b$a */
    /* compiled from: DiskLruCache.kt */
    public static final class C8221a {
        private C8221a() {
        }

        public /* synthetic */ C8221a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Editor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    /* renamed from: j.b$b */
    /* compiled from: DiskLruCache.kt */
    public final class C8222b {

        /* renamed from: a */
        private final C8223c f11568a;

        /* renamed from: b */
        private boolean f11569b;

        /* renamed from: c */
        private final boolean[] f11570c;

        public C8222b(C8223c cVar) {
            this.f11568a = cVar;
            this.f11570c = new boolean[C8220b.this.f11553e];
        }

        /* renamed from: d */
        private final void m16302d(boolean z) {
            C8220b bVar = C8220b.this;
            synchronized (bVar) {
                if (!this.f11569b) {
                    if (C12775o.m28634d(this.f11568a.mo42153b(), this)) {
                        bVar.m16293k0(this, z);
                    }
                    this.f11569b = true;
                    C11921v vVar = C11921v.f18618a;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
        }

        /* renamed from: a */
        public final void mo42145a() {
            m16302d(false);
        }

        /* renamed from: b */
        public final void mo42146b() {
            m16302d(true);
        }

        /* renamed from: c */
        public final C8224d mo42147c() {
            C8224d u0;
            C8220b bVar = C8220b.this;
            synchronized (bVar) {
                mo42146b();
                u0 = bVar.mo42143u0(this.f11568a.mo42155d());
            }
            return u0;
        }

        /* renamed from: e */
        public final void mo42148e() {
            if (C12775o.m28634d(this.f11568a.mo42153b(), this)) {
                this.f11568a.mo42164m(true);
            }
        }

        /* renamed from: f */
        public final C13158p0 mo42149f(int i) {
            C13158p0 p0Var;
            C8220b bVar = C8220b.this;
            synchronized (bVar) {
                if (!this.f11569b) {
                    this.f11570c[i] = true;
                    C13158p0 p0Var2 = this.f11568a.mo42154c().get(i);
                    C10065e.m21133a(bVar.f11567s, p0Var2);
                    p0Var = p0Var2;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
            return p0Var;
        }

        /* renamed from: g */
        public final C8223c mo42150g() {
            return this.f11568a;
        }

        /* renamed from: h */
        public final boolean[] mo42151h() {
            return this.f11570c;
        }
    }

    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Entry\n+ 2 Collections.kt\ncoil/util/-Collections\n*L\n1#1,869:1\n12#2,4:870\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Entry\n*L\n841#1:870,4\n*E\n"})
    /* renamed from: j.b$c */
    /* compiled from: DiskLruCache.kt */
    public final class C8223c {

        /* renamed from: a */
        private final String f11572a;

        /* renamed from: b */
        private final long[] f11573b;

        /* renamed from: c */
        private final ArrayList<C13158p0> f11574c;

        /* renamed from: d */
        private final ArrayList<C13158p0> f11575d;

        /* renamed from: e */
        private boolean f11576e;

        /* renamed from: f */
        private boolean f11577f;

        /* renamed from: g */
        private C8222b f11578g;

        /* renamed from: h */
        private int f11579h;

        public C8223c(String str) {
            this.f11572a = str;
            this.f11573b = new long[C8220b.this.f11553e];
            this.f11574c = new ArrayList<>(C8220b.this.f11553e);
            this.f11575d = new ArrayList<>(C8220b.this.f11553e);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int G = C8220b.this.f11553e;
            for (int i = 0; i < G; i++) {
                sb.append(i);
                this.f11574c.add(C8220b.this.f11550b.mo52691i(sb.toString()));
                sb.append(".tmp");
                this.f11575d.add(C8220b.this.f11550b.mo52691i(sb.toString()));
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public final ArrayList<C13158p0> mo42152a() {
            return this.f11574c;
        }

        /* renamed from: b */
        public final C8222b mo42153b() {
            return this.f11578g;
        }

        /* renamed from: c */
        public final ArrayList<C13158p0> mo42154c() {
            return this.f11575d;
        }

        /* renamed from: d */
        public final String mo42155d() {
            return this.f11572a;
        }

        /* renamed from: e */
        public final long[] mo42156e() {
            return this.f11573b;
        }

        /* renamed from: f */
        public final int mo42157f() {
            return this.f11579h;
        }

        /* renamed from: g */
        public final boolean mo42158g() {
            return this.f11576e;
        }

        /* renamed from: h */
        public final boolean mo42159h() {
            return this.f11577f;
        }

        /* renamed from: i */
        public final void mo42160i(C8222b bVar) {
            this.f11578g = bVar;
        }

        /* renamed from: j */
        public final void mo42161j(List<String> list) {
            if (list.size() == C8220b.this.f11553e) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.f11573b[i] = Long.parseLong(list.get(i));
                    }
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + list);
                }
            } else {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        /* renamed from: k */
        public final void mo42162k(int i) {
            this.f11579h = i;
        }

        /* renamed from: l */
        public final void mo42163l(boolean z) {
            this.f11576e = z;
        }

        /* renamed from: m */
        public final void mo42164m(boolean z) {
            this.f11577f = z;
        }

        /* renamed from: n */
        public final C8224d mo42165n() {
            if (!this.f11576e || this.f11578g != null || this.f11577f) {
                return null;
            }
            ArrayList<C13158p0> arrayList = this.f11574c;
            C8220b bVar = C8220b.this;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!bVar.f11567s.mo52648j(arrayList.get(i))) {
                    try {
                        boolean unused = bVar.m16274C0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            this.f11579h++;
            return new C8224d(this);
        }

        /* renamed from: o */
        public final void mo42166o(C13127d dVar) {
            for (long o0 : this.f11573b) {
                dVar.writeByte(32).mo52535o0(o0);
            }
        }
    }

    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Snapshot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    /* renamed from: j.b$d */
    /* compiled from: DiskLruCache.kt */
    public final class C8224d implements Closeable {

        /* renamed from: b */
        private final C8223c f11581b;

        /* renamed from: c */
        private boolean f11582c;

        public C8224d(C8223c cVar) {
            this.f11581b = cVar;
        }

        /* renamed from: a */
        public final C8222b mo42167a() {
            C8222b t0;
            C8220b bVar = C8220b.this;
            synchronized (bVar) {
                close();
                t0 = bVar.mo42142t0(this.f11581b.mo42155d());
            }
            return t0;
        }

        /* renamed from: b */
        public final C13158p0 mo42168b(int i) {
            if (!this.f11582c) {
                return this.f11581b.mo42152a().get(i);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }

        public void close() {
            if (!this.f11582c) {
                this.f11582c = true;
                C8220b bVar = C8220b.this;
                synchronized (bVar) {
                    C8223c cVar = this.f11581b;
                    cVar.mo42162k(cVar.mo42157f() - 1);
                    if (this.f11581b.mo42157f() == 0 && this.f11581b.mo42159h()) {
                        boolean unused = bVar.m16274C0(this.f11581b);
                    }
                    C11921v vVar = C11921v.f18618a;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$fileSystem$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    /* renamed from: j.b$e */
    /* compiled from: DiskLruCache.kt */
    public static final class C8225e extends C13146k {
        C8225e(C13143j jVar) {
            super(jVar);
        }

        /* renamed from: p */
        public C13175w0 mo42170p(C13158p0 p0Var, boolean z) {
            C13158p0 g = p0Var.mo52688g();
            if (g != null) {
                mo52644d(g);
            }
            return super.mo42170p(p0Var, z);
        }
    }

    @C12739f(mo50609c = "coil.disk.DiskLruCache$launchCleanup$1", mo50610f = "DiskLruCache.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: j.b$f */
    /* compiled from: DiskLruCache.kt */
    static final class C8226f extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f11584h;

        /* renamed from: i */
        final /* synthetic */ C8220b f11585i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8226f(C8220b bVar, C12074d<? super C8226f> dVar) {
            super(2, dVar);
            this.f11585i = bVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C8226f(this.f11585i, dVar);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:9|10|11|12|13|14|15|(1:17)) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            p125j.C8220b.m16284X(r3, true);
            p125j.C8220b.m16283V(r3, okio.C13145j0.m29738c(okio.C13145j0.m29737b()));
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002c */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0022=Splitter:B:14:0x0022, B:23:0x003e=Splitter:B:23:0x003e, B:12:0x001f=Splitter:B:12:0x001f} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object unused = p362if.C12150d.m26492c()
                int r0 = r2.f11584h
                if (r0 != 0) goto L_0x0045
                p336ef.C11910n.m25701b(r3)
                j.b r3 = r2.f11585i
                monitor-enter(r3)
                boolean r0 = r3.f11563o     // Catch:{ all -> 0x0042 }
                if (r0 == 0) goto L_0x003e
                boolean r0 = r3.f11564p     // Catch:{ all -> 0x0042 }
                if (r0 == 0) goto L_0x001a
                goto L_0x003e
            L_0x001a:
                r0 = 1
                r3.m16276E0()     // Catch:{ IOException -> 0x001f }
                goto L_0x0022
            L_0x001f:
                r3.f11565q = r0     // Catch:{ all -> 0x0042 }
            L_0x0022:
                boolean r1 = r3.m16295w0()     // Catch:{ IOException -> 0x002c }
                if (r1 == 0) goto L_0x003a
                r3.m16279G0()     // Catch:{ IOException -> 0x002c }
                goto L_0x003a
            L_0x002c:
                r3.f11566r = r0     // Catch:{ all -> 0x0042 }
                okio.w0 r0 = okio.C13145j0.m29737b()     // Catch:{ all -> 0x0042 }
                okio.d r0 = okio.C13145j0.m29738c(r0)     // Catch:{ all -> 0x0042 }
                r3.f11561m = r0     // Catch:{ all -> 0x0042 }
            L_0x003a:
                monitor-exit(r3)
                ef.v r3 = p336ef.C11921v.f18618a
                return r3
            L_0x003e:
                ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0042 }
                monitor-exit(r3)
                return r0
            L_0x0042:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            L_0x0045:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p125j.C8220b.C8226f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C8226f) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: j.b$g */
    /* compiled from: DiskLruCache.kt */
    static final class C8227g extends C12777p implements Function1<IOException, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C8220b f11586g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8227g(C8220b bVar) {
            super(1);
            this.f11586g = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IOException) obj);
            return C11921v.f18618a;
        }

        public final void invoke(IOException iOException) {
            this.f11586g.f11562n = true;
        }
    }

    public C8220b(C13143j jVar, C13158p0 p0Var, C13971h0 h0Var, long j, int i, int i2) {
        boolean z;
        boolean z2;
        this.f11550b = p0Var;
        this.f11551c = j;
        this.f11552d = i;
        this.f11553e = i2;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f11554f = p0Var.mo52691i("journal");
                this.f11555g = p0Var.mo52691i("journal.tmp");
                this.f11556h = p0Var.mo52691i("journal.bkp");
                this.f11557i = new LinkedHashMap<>(0, 0.75f, true);
                this.f11558j = C13999m0.m32447a(C14039u2.m32561b((C14054y1) null, 1, (Object) null).plus(h0Var.limitedParallelism(1)));
                this.f11567s = new C8225e(jVar);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|20|(1:22)(1:23)|24|(2:26|27)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r12.f11560l = r9 - r12.f11557i.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r1.mo52552t() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        m16279G0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        r12.f11561m = m16297y0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        r0 = p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r1 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r2 = th;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0061=Splitter:B:19:0x0061, B:29:0x0084=Splitter:B:29:0x0084} */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m16272A0() {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            j.b$e r1 = r12.f11567s
            okio.p0 r2 = r12.f11554f
            okio.y0 r1 = r1.mo50374q(r2)
            okio.e r1 = okio.C13145j0.m29739d(r1)
            r2 = 0
            java.lang.String r3 = r1.mo52507U()     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = r1.mo52507U()     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = r1.mo52507U()     // Catch:{ all -> 0x00b8 }
            java.lang.String r6 = r1.mo52507U()     // Catch:{ all -> 0x00b8 }
            java.lang.String r7 = r1.mo52507U()     // Catch:{ all -> 0x00b8 }
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = kotlin.jvm.internal.C12775o.m28634d(r8, r3)     // Catch:{ all -> 0x00b8 }
            if (r8 == 0) goto L_0x0084
            java.lang.String r8 = "1"
            boolean r8 = kotlin.jvm.internal.C12775o.m28634d(r8, r4)     // Catch:{ all -> 0x00b8 }
            if (r8 == 0) goto L_0x0084
            int r8 = r12.f11552d     // Catch:{ all -> 0x00b8 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00b8 }
            boolean r8 = kotlin.jvm.internal.C12775o.m28634d(r8, r5)     // Catch:{ all -> 0x00b8 }
            if (r8 == 0) goto L_0x0084
            int r8 = r12.f11553e     // Catch:{ all -> 0x00b8 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00b8 }
            boolean r8 = kotlin.jvm.internal.C12775o.m28634d(r8, r6)     // Catch:{ all -> 0x00b8 }
            if (r8 == 0) goto L_0x0084
            int r8 = r7.length()     // Catch:{ all -> 0x00b8 }
            r9 = 0
            if (r8 <= 0) goto L_0x0054
            r8 = 1
            goto L_0x0055
        L_0x0054:
            r8 = r9
        L_0x0055:
            if (r8 != 0) goto L_0x0084
        L_0x0057:
            java.lang.String r0 = r1.mo52507U()     // Catch:{ EOFException -> 0x0061 }
            r12.m16273B0(r0)     // Catch:{ EOFException -> 0x0061 }
            int r9 = r9 + 1
            goto L_0x0057
        L_0x0061:
            java.util.LinkedHashMap<java.lang.String, j.b$c> r0 = r12.f11557i     // Catch:{ all -> 0x00b8 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b8 }
            int r9 = r9 - r0
            r12.f11560l = r9     // Catch:{ all -> 0x00b8 }
            boolean r0 = r1.mo52552t()     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x0074
            r12.m16279G0()     // Catch:{ all -> 0x00b8 }
            goto L_0x007a
        L_0x0074:
            okio.d r0 = r12.m16297y0()     // Catch:{ all -> 0x00b8 }
            r12.f11561m = r0     // Catch:{ all -> 0x00b8 }
        L_0x007a:
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00b8 }
            if (r1 == 0) goto L_0x00c6
            r1.close()     // Catch:{ all -> 0x0082 }
            goto L_0x00c6
        L_0x0082:
            r2 = move-exception
            goto L_0x00c6
        L_0x0084:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r9.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r10 = "unexpected journal header: ["
            r9.append(r10)     // Catch:{ all -> 0x00b8 }
            r9.append(r3)     // Catch:{ all -> 0x00b8 }
            r9.append(r0)     // Catch:{ all -> 0x00b8 }
            r9.append(r4)     // Catch:{ all -> 0x00b8 }
            r9.append(r0)     // Catch:{ all -> 0x00b8 }
            r9.append(r5)     // Catch:{ all -> 0x00b8 }
            r9.append(r0)     // Catch:{ all -> 0x00b8 }
            r9.append(r6)     // Catch:{ all -> 0x00b8 }
            r9.append(r0)     // Catch:{ all -> 0x00b8 }
            r9.append(r7)     // Catch:{ all -> 0x00b8 }
            r0 = 93
            r9.append(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x00b8 }
            r8.<init>(r0)     // Catch:{ all -> 0x00b8 }
            throw r8     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            if (r1 == 0) goto L_0x00c3
            r1.close()     // Catch:{ all -> 0x00bf }
            goto L_0x00c3
        L_0x00bf:
            r1 = move-exception
            p336ef.C11894b.m25683a(r0, r1)
        L_0x00c3:
            r11 = r2
            r2 = r0
            r0 = r11
        L_0x00c6:
            if (r2 != 0) goto L_0x00cc
            kotlin.jvm.internal.C12775o.m28636f(r0)
            return
        L_0x00cc:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p125j.C8220b.m16272A0():void");
    }

    /* renamed from: B0 */
    private final void m16273B0(String str) {
        String str2;
        int V = C13755w.m31570V(str, ' ', 0, false, 6, (Object) null);
        if (V != -1) {
            int i = V + 1;
            int V2 = C13755w.m31570V(str, ' ', i, false, 4, (Object) null);
            if (V2 == -1) {
                str2 = str.substring(i);
                C12775o.m28638h(str2, "this as java.lang.String).substring(startIndex)");
                if (V == 6 && C13754v.m31525E(str, "REMOVE", false, 2, (Object) null)) {
                    this.f11557i.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, V2);
                C12775o.m28638h(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            LinkedHashMap<String, C8223c> linkedHashMap = this.f11557i;
            C8223c cVar = linkedHashMap.get(str2);
            if (cVar == null) {
                cVar = new C8223c(str2);
                linkedHashMap.put(str2, cVar);
            }
            C8223c cVar2 = cVar;
            if (V2 != -1 && V == 5 && C13754v.m31525E(str, "CLEAN", false, 2, (Object) null)) {
                String substring = str.substring(V2 + 1);
                C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
                List s0 = C13755w.m31593s0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                cVar2.mo42163l(true);
                cVar2.mo42160i((C8222b) null);
                cVar2.mo42161j(s0);
            } else if (V2 == -1 && V == 5 && C13754v.m31525E(str, "DIRTY", false, 2, (Object) null)) {
                cVar2.mo42160i(new C8222b(cVar2));
            } else if (V2 != -1 || V != 4 || !C13754v.m31525E(str, "READ", false, 2, (Object) null)) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public final boolean m16274C0(C8223c cVar) {
        C13127d dVar;
        if (cVar.mo42157f() > 0 && (dVar = this.f11561m) != null) {
            dVar.mo52486F("DIRTY");
            dVar.writeByte(32);
            dVar.mo52486F(cVar.mo42155d());
            dVar.writeByte(10);
            dVar.flush();
        }
        if (cVar.mo42157f() > 0 || cVar.mo42153b() != null) {
            cVar.mo42164m(true);
            return true;
        }
        int i = this.f11553e;
        for (int i2 = 0; i2 < i; i2++) {
            this.f11567s.mo52647h(cVar.mo42152a().get(i2));
            this.f11559k -= cVar.mo42156e()[i2];
            cVar.mo42156e()[i2] = 0;
        }
        this.f11560l++;
        C13127d dVar2 = this.f11561m;
        if (dVar2 != null) {
            dVar2.mo52486F("REMOVE");
            dVar2.writeByte(32);
            dVar2.mo52486F(cVar.mo42155d());
            dVar2.writeByte(10);
        }
        this.f11557i.remove(cVar.mo42155d());
        if (m16295w0()) {
            m16296x0();
        }
        return true;
    }

    /* renamed from: D0 */
    private final boolean m16275D0() {
        for (C8223c next : this.f11557i.values()) {
            if (!next.mo42159h()) {
                m16274C0(next);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public final void m16276E0() {
        while (this.f11559k > this.f11551c) {
            if (!m16275D0()) {
                return;
            }
        }
        this.f11565q = false;
    }

    /* renamed from: F0 */
    private final void m16277F0(String str) {
        if (!f11549u.mo53412e(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2 A[Catch:{ all -> 0x0092, all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0 A[SYNTHETIC, Splitter:B:36:0x00e0] */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m16279G0() {
        /*
            r9 = this;
            monitor-enter(r9)
            okio.d r0 = r9.f11561m     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00e1 }
        L_0x0008:
            j.b$e r0 = r9.f11567s     // Catch:{ all -> 0x00e1 }
            okio.p0 r1 = r9.f11555g     // Catch:{ all -> 0x00e1 }
            r2 = 0
            okio.w0 r0 = r0.mo42170p(r1, r2)     // Catch:{ all -> 0x00e1 }
            okio.d r0 = okio.C13145j0.m29738c(r0)     // Catch:{ all -> 0x00e1 }
            r1 = 0
            java.lang.String r3 = "libcore.io.DiskLruCache"
            okio.d r3 = r0.mo52486F(r3)     // Catch:{ all -> 0x0092 }
            r4 = 10
            r3.writeByte(r4)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "1"
            okio.d r3 = r0.mo52486F(r3)     // Catch:{ all -> 0x0092 }
            r3.writeByte(r4)     // Catch:{ all -> 0x0092 }
            int r3 = r9.f11552d     // Catch:{ all -> 0x0092 }
            long r5 = (long) r3     // Catch:{ all -> 0x0092 }
            okio.d r3 = r0.mo52535o0(r5)     // Catch:{ all -> 0x0092 }
            r3.writeByte(r4)     // Catch:{ all -> 0x0092 }
            int r3 = r9.f11553e     // Catch:{ all -> 0x0092 }
            long r5 = (long) r3     // Catch:{ all -> 0x0092 }
            okio.d r3 = r0.mo52535o0(r5)     // Catch:{ all -> 0x0092 }
            r3.writeByte(r4)     // Catch:{ all -> 0x0092 }
            r0.writeByte(r4)     // Catch:{ all -> 0x0092 }
            java.util.LinkedHashMap<java.lang.String, j.b$c> r3 = r9.f11557i     // Catch:{ all -> 0x0092 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0092 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0092 }
        L_0x004b:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0092 }
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0092 }
            j.b$c r5 = (p125j.C8220b.C8223c) r5     // Catch:{ all -> 0x0092 }
            j.b$b r6 = r5.mo42153b()     // Catch:{ all -> 0x0092 }
            r7 = 32
            if (r6 == 0) goto L_0x0072
            java.lang.String r6 = "DIRTY"
            r0.mo52486F(r6)     // Catch:{ all -> 0x0092 }
            r0.writeByte(r7)     // Catch:{ all -> 0x0092 }
            java.lang.String r5 = r5.mo42155d()     // Catch:{ all -> 0x0092 }
            r0.mo52486F(r5)     // Catch:{ all -> 0x0092 }
            r0.writeByte(r4)     // Catch:{ all -> 0x0092 }
            goto L_0x004b
        L_0x0072:
            java.lang.String r6 = "CLEAN"
            r0.mo52486F(r6)     // Catch:{ all -> 0x0092 }
            r0.writeByte(r7)     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = r5.mo42155d()     // Catch:{ all -> 0x0092 }
            r0.mo52486F(r6)     // Catch:{ all -> 0x0092 }
            r5.mo42166o(r0)     // Catch:{ all -> 0x0092 }
            r0.writeByte(r4)     // Catch:{ all -> 0x0092 }
            goto L_0x004b
        L_0x0088:
            ef.v r3 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x00a0
            r0.close()     // Catch:{ all -> 0x0090 }
            goto L_0x00a0
        L_0x0090:
            r1 = move-exception
            goto L_0x00a0
        L_0x0092:
            r3 = move-exception
            if (r0 == 0) goto L_0x009d
            r0.close()     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r0 = move-exception
            p336ef.C11894b.m25683a(r3, r0)     // Catch:{ all -> 0x00e1 }
        L_0x009d:
            r8 = r3
            r3 = r1
            r1 = r8
        L_0x00a0:
            if (r1 != 0) goto L_0x00e0
            kotlin.jvm.internal.C12775o.m28636f(r3)     // Catch:{ all -> 0x00e1 }
            j.b$e r0 = r9.f11567s     // Catch:{ all -> 0x00e1 }
            okio.p0 r1 = r9.f11554f     // Catch:{ all -> 0x00e1 }
            boolean r0 = r0.mo52648j(r1)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00c9
            j.b$e r0 = r9.f11567s     // Catch:{ all -> 0x00e1 }
            okio.p0 r1 = r9.f11554f     // Catch:{ all -> 0x00e1 }
            okio.p0 r3 = r9.f11556h     // Catch:{ all -> 0x00e1 }
            r0.mo50368c(r1, r3)     // Catch:{ all -> 0x00e1 }
            j.b$e r0 = r9.f11567s     // Catch:{ all -> 0x00e1 }
            okio.p0 r1 = r9.f11555g     // Catch:{ all -> 0x00e1 }
            okio.p0 r3 = r9.f11554f     // Catch:{ all -> 0x00e1 }
            r0.mo50368c(r1, r3)     // Catch:{ all -> 0x00e1 }
            j.b$e r0 = r9.f11567s     // Catch:{ all -> 0x00e1 }
            okio.p0 r1 = r9.f11556h     // Catch:{ all -> 0x00e1 }
            r0.mo52647h(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x00d2
        L_0x00c9:
            j.b$e r0 = r9.f11567s     // Catch:{ all -> 0x00e1 }
            okio.p0 r1 = r9.f11555g     // Catch:{ all -> 0x00e1 }
            okio.p0 r3 = r9.f11554f     // Catch:{ all -> 0x00e1 }
            r0.mo50368c(r1, r3)     // Catch:{ all -> 0x00e1 }
        L_0x00d2:
            okio.d r0 = r9.m16297y0()     // Catch:{ all -> 0x00e1 }
            r9.f11561m = r0     // Catch:{ all -> 0x00e1 }
            r9.f11560l = r2     // Catch:{ all -> 0x00e1 }
            r9.f11562n = r2     // Catch:{ all -> 0x00e1 }
            r9.f11566r = r2     // Catch:{ all -> 0x00e1 }
            monitor-exit(r9)
            return
        L_0x00e0:
            throw r1     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p125j.C8220b.m16279G0():void");
    }

    /* renamed from: j0 */
    private final void m16291j0() {
        if (!(!this.f11564p)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0122, code lost:
        return;
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m16293k0(p125j.C8220b.C8222b r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            j.b$c r0 = r9.mo42150g()     // Catch:{ all -> 0x012f }
            j.b$b r1 = r0.mo42153b()     // Catch:{ all -> 0x012f }
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r9)     // Catch:{ all -> 0x012f }
            if (r1 == 0) goto L_0x0123
            r1 = 0
            if (r10 == 0) goto L_0x009c
            boolean r2 = r0.mo42159h()     // Catch:{ all -> 0x012f }
            if (r2 != 0) goto L_0x009c
            int r2 = r8.f11553e     // Catch:{ all -> 0x012f }
            r3 = r1
        L_0x001b:
            if (r3 >= r2) goto L_0x003f
            boolean[] r4 = r9.mo42151h()     // Catch:{ all -> 0x012f }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x012f }
            if (r4 == 0) goto L_0x003c
            j.b$e r4 = r8.f11567s     // Catch:{ all -> 0x012f }
            java.util.ArrayList r5 = r0.mo42154c()     // Catch:{ all -> 0x012f }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x012f }
            okio.p0 r5 = (okio.C13158p0) r5     // Catch:{ all -> 0x012f }
            boolean r4 = r4.mo52648j(r5)     // Catch:{ all -> 0x012f }
            if (r4 != 0) goto L_0x003c
            r9.mo42145a()     // Catch:{ all -> 0x012f }
            monitor-exit(r8)
            return
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x003f:
            int r9 = r8.f11553e     // Catch:{ all -> 0x012f }
        L_0x0041:
            if (r1 >= r9) goto L_0x00b2
            java.util.ArrayList r2 = r0.mo42154c()     // Catch:{ all -> 0x012f }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x012f }
            okio.p0 r2 = (okio.C13158p0) r2     // Catch:{ all -> 0x012f }
            java.util.ArrayList r3 = r0.mo42152a()     // Catch:{ all -> 0x012f }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x012f }
            okio.p0 r3 = (okio.C13158p0) r3     // Catch:{ all -> 0x012f }
            j.b$e r4 = r8.f11567s     // Catch:{ all -> 0x012f }
            boolean r4 = r4.mo52648j(r2)     // Catch:{ all -> 0x012f }
            if (r4 == 0) goto L_0x0065
            j.b$e r4 = r8.f11567s     // Catch:{ all -> 0x012f }
            r4.mo50368c(r2, r3)     // Catch:{ all -> 0x012f }
            goto L_0x0074
        L_0x0065:
            j.b$e r2 = r8.f11567s     // Catch:{ all -> 0x012f }
            java.util.ArrayList r4 = r0.mo42152a()     // Catch:{ all -> 0x012f }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x012f }
            okio.p0 r4 = (okio.C13158p0) r4     // Catch:{ all -> 0x012f }
            p259w.C10065e.m21133a(r2, r4)     // Catch:{ all -> 0x012f }
        L_0x0074:
            long[] r2 = r0.mo42156e()     // Catch:{ all -> 0x012f }
            r4 = r2[r1]     // Catch:{ all -> 0x012f }
            j.b$e r2 = r8.f11567s     // Catch:{ all -> 0x012f }
            okio.i r2 = r2.mo52649l(r3)     // Catch:{ all -> 0x012f }
            java.lang.Long r2 = r2.mo52637d()     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x008b
            long r2 = r2.longValue()     // Catch:{ all -> 0x012f }
            goto L_0x008d
        L_0x008b:
            r2 = 0
        L_0x008d:
            long[] r6 = r0.mo42156e()     // Catch:{ all -> 0x012f }
            r6[r1] = r2     // Catch:{ all -> 0x012f }
            long r6 = r8.f11559k     // Catch:{ all -> 0x012f }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.f11559k = r6     // Catch:{ all -> 0x012f }
            int r1 = r1 + 1
            goto L_0x0041
        L_0x009c:
            int r9 = r8.f11553e     // Catch:{ all -> 0x012f }
        L_0x009e:
            if (r1 >= r9) goto L_0x00b2
            j.b$e r2 = r8.f11567s     // Catch:{ all -> 0x012f }
            java.util.ArrayList r3 = r0.mo42154c()     // Catch:{ all -> 0x012f }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x012f }
            okio.p0 r3 = (okio.C13158p0) r3     // Catch:{ all -> 0x012f }
            r2.mo52647h(r3)     // Catch:{ all -> 0x012f }
            int r1 = r1 + 1
            goto L_0x009e
        L_0x00b2:
            r9 = 0
            r0.mo42160i(r9)     // Catch:{ all -> 0x012f }
            boolean r9 = r0.mo42159h()     // Catch:{ all -> 0x012f }
            if (r9 == 0) goto L_0x00c1
            r8.m16274C0(r0)     // Catch:{ all -> 0x012f }
            monitor-exit(r8)
            return
        L_0x00c1:
            int r9 = r8.f11560l     // Catch:{ all -> 0x012f }
            r1 = 1
            int r9 = r9 + r1
            r8.f11560l = r9     // Catch:{ all -> 0x012f }
            okio.d r9 = r8.f11561m     // Catch:{ all -> 0x012f }
            kotlin.jvm.internal.C12775o.m28636f(r9)     // Catch:{ all -> 0x012f }
            r2 = 10
            r3 = 32
            if (r10 != 0) goto L_0x00f5
            boolean r10 = r0.mo42158g()     // Catch:{ all -> 0x012f }
            if (r10 == 0) goto L_0x00d9
            goto L_0x00f5
        L_0x00d9:
            java.util.LinkedHashMap<java.lang.String, j.b$c> r10 = r8.f11557i     // Catch:{ all -> 0x012f }
            java.lang.String r1 = r0.mo42155d()     // Catch:{ all -> 0x012f }
            r10.remove(r1)     // Catch:{ all -> 0x012f }
            java.lang.String r10 = "REMOVE"
            r9.mo52486F(r10)     // Catch:{ all -> 0x012f }
            r9.writeByte(r3)     // Catch:{ all -> 0x012f }
            java.lang.String r10 = r0.mo42155d()     // Catch:{ all -> 0x012f }
            r9.mo52486F(r10)     // Catch:{ all -> 0x012f }
            r9.writeByte(r2)     // Catch:{ all -> 0x012f }
            goto L_0x010d
        L_0x00f5:
            r0.mo42163l(r1)     // Catch:{ all -> 0x012f }
            java.lang.String r10 = "CLEAN"
            r9.mo52486F(r10)     // Catch:{ all -> 0x012f }
            r9.writeByte(r3)     // Catch:{ all -> 0x012f }
            java.lang.String r10 = r0.mo42155d()     // Catch:{ all -> 0x012f }
            r9.mo52486F(r10)     // Catch:{ all -> 0x012f }
            r0.mo42166o(r9)     // Catch:{ all -> 0x012f }
            r9.writeByte(r2)     // Catch:{ all -> 0x012f }
        L_0x010d:
            r9.flush()     // Catch:{ all -> 0x012f }
            long r9 = r8.f11559k     // Catch:{ all -> 0x012f }
            long r0 = r8.f11551c     // Catch:{ all -> 0x012f }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x011e
            boolean r9 = r8.m16295w0()     // Catch:{ all -> 0x012f }
            if (r9 == 0) goto L_0x0121
        L_0x011e:
            r8.m16296x0()     // Catch:{ all -> 0x012f }
        L_0x0121:
            monitor-exit(r8)
            return
        L_0x0123:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012f }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x012f }
            r10.<init>(r9)     // Catch:{ all -> 0x012f }
            throw r10     // Catch:{ all -> 0x012f }
        L_0x012f:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p125j.C8220b.m16293k0(j.b$b, boolean):void");
    }

    /* renamed from: p0 */
    private final void m16294p0() {
        close();
        C10065e.m21134b(this.f11567s, this.f11550b);
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public final boolean m16295w0() {
        if (this.f11560l >= 2000) {
            return true;
        }
        return false;
    }

    /* renamed from: x0 */
    private final void m16296x0() {
        C14054y1 unused = C13985j.m32422d(this.f11558j, (C12079g) null, (C14004n0) null, new C8226f(this, (C12074d<? super C8226f>) null), 3, (Object) null);
    }

    /* renamed from: y0 */
    private final C13127d m16297y0() {
        return C13145j0.m29738c(new C8228c(this.f11567s.mo52643a(this.f11554f), new C8227g(this)));
    }

    /* renamed from: z0 */
    private final void m16298z0() {
        Iterator<C8223c> it = this.f11557i.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            C8223c next = it.next();
            int i = 0;
            if (next.mo42153b() == null) {
                int i2 = this.f11553e;
                while (i < i2) {
                    j += next.mo42156e()[i];
                    i++;
                }
            } else {
                next.mo42160i((C8222b) null);
                int i3 = this.f11553e;
                while (i < i3) {
                    this.f11567s.mo52647h(next.mo42152a().get(i));
                    this.f11567s.mo52647h(next.mo42154c().get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f11559k = j;
    }

    public synchronized void close() {
        if (this.f11563o) {
            if (!this.f11564p) {
                for (C8223c b : (C8223c[]) this.f11557i.values().toArray(new C8223c[0])) {
                    C8222b b2 = b.mo42153b();
                    if (b2 != null) {
                        b2.mo42148e();
                    }
                }
                m16276E0();
                C13999m0.m32450d(this.f11558j, (CancellationException) null, 1, (Object) null);
                C13127d dVar = this.f11561m;
                C12775o.m28636f(dVar);
                dVar.close();
                this.f11561m = null;
                this.f11564p = true;
                return;
            }
        }
        this.f11564p = true;
    }

    public synchronized void flush() {
        if (this.f11563o) {
            m16291j0();
            m16276E0();
            C13127d dVar = this.f11561m;
            C12775o.m28636f(dVar);
            dVar.flush();
        }
    }

    /* renamed from: t0 */
    public final synchronized C8222b mo42142t0(String str) {
        C8222b bVar;
        m16291j0();
        m16277F0(str);
        mo42144v0();
        C8223c cVar = this.f11557i.get(str);
        if (cVar != null) {
            bVar = cVar.mo42153b();
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return null;
        }
        if (cVar != null) {
            if (cVar.mo42157f() != 0) {
                return null;
            }
        }
        if (!this.f11565q) {
            if (!this.f11566r) {
                C13127d dVar = this.f11561m;
                C12775o.m28636f(dVar);
                dVar.mo52486F("DIRTY");
                dVar.writeByte(32);
                dVar.mo52486F(str);
                dVar.writeByte(10);
                dVar.flush();
                if (this.f11562n) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new C8223c(str);
                    this.f11557i.put(str, cVar);
                }
                C8222b bVar2 = new C8222b(cVar);
                cVar.mo42160i(bVar2);
                return bVar2;
            }
        }
        m16296x0();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        return null;
     */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p125j.C8220b.C8224d mo42143u0(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.m16291j0()     // Catch:{ all -> 0x0046 }
            r3.m16277F0(r4)     // Catch:{ all -> 0x0046 }
            r3.mo42144v0()     // Catch:{ all -> 0x0046 }
            java.util.LinkedHashMap<java.lang.String, j.b$c> r0 = r3.f11557i     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0046 }
            j.b$c r0 = (p125j.C8220b.C8223c) r0     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0043
            j.b$d r0 = r0.mo42165n()     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x001b
            goto L_0x0043
        L_0x001b:
            int r1 = r3.f11560l     // Catch:{ all -> 0x0046 }
            int r1 = r1 + 1
            r3.f11560l = r1     // Catch:{ all -> 0x0046 }
            okio.d r1 = r3.f11561m     // Catch:{ all -> 0x0046 }
            kotlin.jvm.internal.C12775o.m28636f(r1)     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "READ"
            r1.mo52486F(r2)     // Catch:{ all -> 0x0046 }
            r2 = 32
            r1.writeByte(r2)     // Catch:{ all -> 0x0046 }
            r1.mo52486F(r4)     // Catch:{ all -> 0x0046 }
            r4 = 10
            r1.writeByte(r4)     // Catch:{ all -> 0x0046 }
            boolean r4 = r3.m16295w0()     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x0041
            r3.m16296x0()     // Catch:{ all -> 0x0046 }
        L_0x0041:
            monitor-exit(r3)
            return r0
        L_0x0043:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x0046:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p125j.C8220b.mo42143u0(java.lang.String):j.b$d");
    }

    /* renamed from: v0 */
    public final synchronized void mo42144v0() {
        if (!this.f11563o) {
            this.f11567s.mo52647h(this.f11555g);
            if (this.f11567s.mo52648j(this.f11556h)) {
                if (this.f11567s.mo52648j(this.f11554f)) {
                    this.f11567s.mo52647h(this.f11556h);
                } else {
                    this.f11567s.mo50368c(this.f11556h, this.f11554f);
                }
            }
            if (this.f11567s.mo52648j(this.f11554f)) {
                try {
                    m16272A0();
                    m16298z0();
                    this.f11563o = true;
                    return;
                } catch (IOException unused) {
                    m16294p0();
                    this.f11564p = false;
                } catch (Throwable th) {
                    this.f11564p = false;
                    throw th;
                }
            }
            m16279G0();
            this.f11563o = true;
        }
    }
}
