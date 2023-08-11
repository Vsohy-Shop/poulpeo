package p125j;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13133f;
import okio.C13143j;
import okio.C13158p0;
import p125j.C8216a;
import p125j.C8220b;
import p466yf.C13971h0;

@SourceDebugExtension({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
/* renamed from: j.d */
/* compiled from: RealDiskCache.kt */
public final class C8229d implements C8216a {

    /* renamed from: e */
    public static final C8230a f11589e = new C8230a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final long f11590a;

    /* renamed from: b */
    private final C13158p0 f11591b;

    /* renamed from: c */
    private final C13143j f11592c;

    /* renamed from: d */
    private final C8220b f11593d;

    /* renamed from: j.d$a */
    /* compiled from: RealDiskCache.kt */
    public static final class C8230a {
        private C8230a() {
        }

        public /* synthetic */ C8230a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @SourceDebugExtension({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache$RealEditor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
    /* renamed from: j.d$b */
    /* compiled from: RealDiskCache.kt */
    private static final class C8231b implements C8216a.C8218b {

        /* renamed from: a */
        private final C8220b.C8222b f11594a;

        public C8231b(C8220b.C8222b bVar) {
            this.f11594a = bVar;
        }

        public void abort() {
            this.f11594a.mo42145a();
        }

        /* renamed from: b */
        public C8232c mo42133a() {
            C8220b.C8224d c = this.f11594a.mo42147c();
            if (c != null) {
                return new C8232c(c);
            }
            return null;
        }

        /* renamed from: g */
        public C13158p0 mo42135g() {
            return this.f11594a.mo42149f(0);
        }

        public C13158p0 getData() {
            return this.f11594a.mo42149f(1);
        }
    }

    @SourceDebugExtension({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache$RealSnapshot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
    /* renamed from: j.d$c */
    /* compiled from: RealDiskCache.kt */
    private static final class C8232c implements C8216a.C8219c {

        /* renamed from: b */
        private final C8220b.C8224d f11595b;

        public C8232c(C8220b.C8224d dVar) {
            this.f11595b = dVar;
        }

        /* renamed from: a */
        public C8231b mo42137D() {
            C8220b.C8222b a = this.f11595b.mo42167a();
            if (a != null) {
                return new C8231b(a);
            }
            return null;
        }

        public void close() {
            this.f11595b.close();
        }

        /* renamed from: g */
        public C13158p0 mo42138g() {
            return this.f11595b.mo42168b(0);
        }

        public C13158p0 getData() {
            return this.f11595b.mo42168b(1);
        }
    }

    public C8229d(long j, C13158p0 p0Var, C13143j jVar, C13971h0 h0Var) {
        this.f11590a = j;
        this.f11591b = p0Var;
        this.f11592c = jVar;
        this.f11593d = new C8220b(getFileSystem(), mo42176c(), h0Var, mo42177d(), 1, 2);
    }

    /* renamed from: e */
    private final String m16328e(String str) {
        return C13133f.f20903e.mo52622d(str).mo52589F().mo52609l();
    }

    /* renamed from: a */
    public C8216a.C8218b mo42127a(String str) {
        C8220b.C8222b t0 = this.f11593d.mo42142t0(m16328e(str));
        if (t0 != null) {
            return new C8231b(t0);
        }
        return null;
    }

    /* renamed from: b */
    public C8216a.C8219c mo42128b(String str) {
        C8220b.C8224d u0 = this.f11593d.mo42143u0(m16328e(str));
        if (u0 != null) {
            return new C8232c(u0);
        }
        return null;
    }

    /* renamed from: c */
    public C13158p0 mo42176c() {
        return this.f11591b;
    }

    /* renamed from: d */
    public long mo42177d() {
        return this.f11590a;
    }

    public C13143j getFileSystem() {
        return this.f11592c;
    }
}
