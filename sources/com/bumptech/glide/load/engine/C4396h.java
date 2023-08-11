package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.C4366d;
import com.bumptech.glide.C4368f;
import com.bumptech.glide.load.engine.C4393f;
import com.bumptech.glide.load.engine.C4405i;
import com.bumptech.glide.load.resource.bitmap.C4467m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p020a2.C2125a;
import p020a2.C2133b;
import p020a2.C2134c;
import p058d1.C7214a;
import p058d1.C7218e;
import p058d1.C7219f;
import p058d1.C7222g;
import p058d1.C7225j;
import p058d1.C7226k;
import p070e1.C7422d;
import p070e1.C7424e;
import p094g1.C7737a;
import p094g1.C7743b;
import p094g1.C7744c;
import p117i1.C8064a;
import p294z1.C10787f;

/* renamed from: com.bumptech.glide.load.engine.h */
/* compiled from: DecodeJob */
class C4396h<R> implements C4393f.C4394a, Runnable, Comparable<C4396h<?>>, C2125a.C2131f {

    /* renamed from: A */
    private Object f3814A;

    /* renamed from: B */
    private C7214a f3815B;

    /* renamed from: C */
    private C7422d<?> f3816C;

    /* renamed from: D */
    private volatile C4393f f3817D;

    /* renamed from: E */
    private volatile boolean f3818E;

    /* renamed from: F */
    private volatile boolean f3819F;

    /* renamed from: b */
    private final C4395g<R> f3820b = new C4395g<>();

    /* renamed from: c */
    private final List<Throwable> f3821c = new ArrayList();

    /* renamed from: d */
    private final C2134c f3822d = C2134c.m1493a();

    /* renamed from: e */
    private final C4401e f3823e;

    /* renamed from: f */
    private final Pools.Pool<C4396h<?>> f3824f;

    /* renamed from: g */
    private final C4400d<?> f3825g = new C4400d<>();

    /* renamed from: h */
    private final C4402f f3826h = new C4402f();

    /* renamed from: i */
    private C4366d f3827i;

    /* renamed from: j */
    private C7218e f3828j;

    /* renamed from: k */
    private C4368f f3829k;

    /* renamed from: l */
    private C4421m f3830l;

    /* renamed from: m */
    private int f3831m;

    /* renamed from: n */
    private int f3832n;

    /* renamed from: o */
    private C7737a f3833o;

    /* renamed from: p */
    private C7222g f3834p;

    /* renamed from: q */
    private C4398b<R> f3835q;

    /* renamed from: r */
    private int f3836r;

    /* renamed from: s */
    private C4404h f3837s;

    /* renamed from: t */
    private C4403g f3838t;

    /* renamed from: u */
    private long f3839u;

    /* renamed from: v */
    private boolean f3840v;

    /* renamed from: w */
    private Object f3841w;

    /* renamed from: x */
    private Thread f3842x;

    /* renamed from: y */
    private C7218e f3843y;

    /* renamed from: z */
    private C7218e f3844z;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    /* compiled from: DecodeJob */
    static /* synthetic */ class C4397a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3845a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3846b;

        /* renamed from: c */
        static final /* synthetic */ int[] f3847c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                d1.c[] r0 = p058d1.C7216c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3847c = r0
                r1 = 1
                d1.c r2 = p058d1.C7216c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3847c     // Catch:{ NoSuchFieldError -> 0x001d }
                d1.c r3 = p058d1.C7216c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.h$h[] r2 = com.bumptech.glide.load.engine.C4396h.C4404h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f3846b = r2
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.C4396h.C4404h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f3846b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.C4396h.C4404h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f3846b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C4396h.C4404h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f3846b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C4396h.C4404h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f3846b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C4396h.C4404h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.h$g[] r3 = com.bumptech.glide.load.engine.C4396h.C4403g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3845a = r3
                com.bumptech.glide.load.engine.h$g r4 = com.bumptech.glide.load.engine.C4396h.C4403g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f3845a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.h$g r3 = com.bumptech.glide.load.engine.C4396h.C4403g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f3845a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.h$g r1 = com.bumptech.glide.load.engine.C4396h.C4403g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C4396h.C4397a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$b */
    /* compiled from: DecodeJob */
    interface C4398b<R> {
        /* renamed from: a */
        void mo31312a(GlideException glideException);

        /* renamed from: b */
        void mo31313b(C7744c<R> cVar, C7214a aVar);

        /* renamed from: c */
        void mo31314c(C4396h<?> hVar);
    }

    /* renamed from: com.bumptech.glide.load.engine.h$c */
    /* compiled from: DecodeJob */
    private final class C4399c<Z> implements C4405i.C4406a<Z> {

        /* renamed from: a */
        private final C7214a f3848a;

        C4399c(C7214a aVar) {
            this.f3848a = aVar;
        }

        @NonNull
        /* renamed from: a */
        public C7744c<Z> mo31315a(@NonNull C7744c<Z> cVar) {
            return C4396h.this.mo31310v(this.f3848a, cVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$d */
    /* compiled from: DecodeJob */
    private static class C4400d<Z> {

        /* renamed from: a */
        private C7218e f3850a;

        /* renamed from: b */
        private C7225j<Z> f3851b;

        /* renamed from: c */
        private C4427r<Z> f3852c;

        C4400d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo31316a() {
            this.f3850a = null;
            this.f3851b = null;
            this.f3852c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo31317b(C4401e eVar, C7222g gVar) {
            C2133b.m1489a("DecodeJob.encode");
            try {
                eVar.mo31320a().mo41893a(this.f3850a, new C4392e(this.f3851b, this.f3852c, gVar));
            } finally {
                this.f3852c.mo31379f();
                C2133b.m1492d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo31318c() {
            if (this.f3852c != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <X> void mo31319d(C7218e eVar, C7225j<X> jVar, C4427r<X> rVar) {
            this.f3850a = eVar;
            this.f3851b = jVar;
            this.f3852c = rVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$e */
    /* compiled from: DecodeJob */
    interface C4401e {
        /* renamed from: a */
        C8064a mo31320a();
    }

    /* renamed from: com.bumptech.glide.load.engine.h$f */
    /* compiled from: DecodeJob */
    private static class C4402f {

        /* renamed from: a */
        private boolean f3853a;

        /* renamed from: b */
        private boolean f3854b;

        /* renamed from: c */
        private boolean f3855c;

        C4402f() {
        }

        /* renamed from: a */
        private boolean m5216a(boolean z) {
            if ((this.f3855c || z || this.f3854b) && this.f3853a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo31321b() {
            this.f3854b = true;
            return m5216a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo31322c() {
            this.f3855c = true;
            return m5216a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized boolean mo31323d(boolean z) {
            this.f3853a = true;
            return m5216a(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public synchronized void mo31324e() {
            this.f3854b = false;
            this.f3853a = false;
            this.f3855c = false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$g */
    /* compiled from: DecodeJob */
    private enum C4403g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.engine.h$h */
    /* compiled from: DecodeJob */
    private enum C4404h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C4396h(C4401e eVar, Pools.Pool<C4396h<?>> pool) {
        this.f3823e = eVar;
        this.f3824f = pool;
    }

    /* renamed from: B */
    private void m5178B() {
        this.f3826h.mo31324e();
        this.f3825g.mo31316a();
        this.f3820b.mo31280a();
        this.f3818E = false;
        this.f3827i = null;
        this.f3828j = null;
        this.f3834p = null;
        this.f3829k = null;
        this.f3830l = null;
        this.f3835q = null;
        this.f3837s = null;
        this.f3817D = null;
        this.f3842x = null;
        this.f3843y = null;
        this.f3814A = null;
        this.f3815B = null;
        this.f3816C = null;
        this.f3839u = 0;
        this.f3819F = false;
        this.f3841w = null;
        this.f3821c.clear();
        this.f3824f.release(this);
    }

    /* renamed from: C */
    private void m5179C() {
        this.f3842x = Thread.currentThread();
        this.f3839u = C10787f.m22932b();
        boolean z = false;
        while (!this.f3819F && this.f3817D != null && !(z = this.f3817D.mo31268b())) {
            this.f3837s = m5187k(this.f3837s);
            this.f3817D = m5186j();
            if (this.f3837s == C4404h.SOURCE) {
                mo31278c();
                return;
            }
        }
        if ((this.f3837s == C4404h.FINISHED || this.f3819F) && !z) {
            m5194s();
        }
    }

    /* renamed from: D */
    private <Data, ResourceType> C7744c<R> m5180D(Data data, C7214a aVar, C4426q<Data, ResourceType, R> qVar) {
        C7222g l = m5188l(aVar);
        C7424e l2 = this.f3827i.mo31199g().mo31168l(data);
        try {
            return qVar.mo31377a(l2, l, this.f3831m, this.f3832n, new C4399c(aVar));
        } finally {
            l2.mo41086b();
        }
    }

    /* renamed from: E */
    private void m5181E() {
        int i = C4397a.f3845a[this.f3838t.ordinal()];
        if (i == 1) {
            this.f3837s = m5187k(C4404h.INITIALIZE);
            this.f3817D = m5186j();
            m5179C();
        } else if (i == 2) {
            m5179C();
        } else if (i == 3) {
            m5185i();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f3838t);
        }
    }

    /* renamed from: F */
    private void m5182F() {
        Throwable th;
        this.f3822d.mo23273c();
        if (this.f3818E) {
            if (this.f3821c.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f3821c;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f3818E = true;
    }

    /* renamed from: g */
    private <Data> C7744c<R> m5183g(C7422d<?> dVar, Data data, C7214a aVar) {
        if (data == null) {
            dVar.mo41074b();
            return null;
        }
        try {
            long b = C10787f.m22932b();
            C7744c<R> h = m5184h(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m5190o("Decoded result " + h, b);
            }
            return h;
        } finally {
            dVar.mo41074b();
        }
    }

    /* renamed from: h */
    private <Data> C7744c<R> m5184h(Data data, C7214a aVar) {
        return m5180D(data, aVar, this.f3820b.mo31287h(data.getClass()));
    }

    /* renamed from: i */
    private void m5185i() {
        C7744c<R> cVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f3839u;
            m5191p("Retrieved data", j, "data: " + this.f3814A + ", cache key: " + this.f3843y + ", fetcher: " + this.f3816C);
        }
        try {
            cVar = m5183g(this.f3816C, this.f3814A, this.f3815B);
        } catch (GlideException e) {
            e.mo31249i(this.f3844z, this.f3815B);
            this.f3821c.add(e);
            cVar = null;
        }
        if (cVar != null) {
            m5193r(cVar, this.f3815B);
        } else {
            m5179C();
        }
    }

    /* renamed from: j */
    private C4393f m5186j() {
        int i = C4397a.f3846b[this.f3837s.ordinal()];
        if (i == 1) {
            return new C4429s(this.f3820b, this);
        }
        if (i == 2) {
            return new C4390c(this.f3820b, this);
        }
        if (i == 3) {
            return new C4433v(this.f3820b, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f3837s);
    }

    /* renamed from: k */
    private C4404h m5187k(C4404h hVar) {
        int i = C4397a.f3846b[hVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return C4404h.FINISHED;
                }
                if (i != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: " + hVar);
                } else if (this.f3833o.mo41378b()) {
                    return C4404h.RESOURCE_CACHE;
                } else {
                    return m5187k(C4404h.RESOURCE_CACHE);
                }
            } else if (this.f3840v) {
                return C4404h.FINISHED;
            } else {
                return C4404h.SOURCE;
            }
        } else if (this.f3833o.mo41377a()) {
            return C4404h.DATA_CACHE;
        } else {
            return m5187k(C4404h.DATA_CACHE);
        }
    }

    @NonNull
    /* renamed from: l */
    private C7222g m5188l(C7214a aVar) {
        boolean z;
        C7222g gVar = this.f3834p;
        if (Build.VERSION.SDK_INT < 26) {
            return gVar;
        }
        if (aVar == C7214a.RESOURCE_DISK_CACHE || this.f3820b.mo31302w()) {
            z = true;
        } else {
            z = false;
        }
        C7219f fVar = C4467m.f4030j;
        Boolean bool = (Boolean) gVar.mo40779c(fVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return gVar;
        }
        C7222g gVar2 = new C7222g();
        gVar2.mo40780d(this.f3834p);
        gVar2.mo40781e(fVar, Boolean.valueOf(z));
        return gVar2;
    }

    /* renamed from: m */
    private int m5189m() {
        return this.f3829k.ordinal();
    }

    /* renamed from: o */
    private void m5190o(String str, long j) {
        m5191p(str, j, (String) null);
    }

    /* renamed from: p */
    private void m5191p(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C10787f.m22931a(j));
        sb.append(", load key: ");
        sb.append(this.f3830l);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: q */
    private void m5192q(C7744c<R> cVar, C7214a aVar) {
        m5182F();
        this.f3835q.mo31313b(cVar, aVar);
    }

    /* renamed from: r */
    private void m5193r(C7744c<R> cVar, C7214a aVar) {
        C4427r<R> rVar;
        C4427r<R> rVar2;
        if (cVar instanceof C7743b) {
            ((C7743b) cVar).initialize();
        }
        if (this.f3825g.mo31318c()) {
            C4427r<R> c = C4427r.m5287c(cVar);
            rVar2 = c;
            rVar = c;
        } else {
            rVar2 = null;
            rVar = cVar;
        }
        m5192q(rVar, aVar);
        this.f3837s = C4404h.ENCODE;
        try {
            if (this.f3825g.mo31318c()) {
                this.f3825g.mo31317b(this.f3823e, this.f3834p);
            }
            m5195t();
        } finally {
            if (rVar2 != null) {
                rVar2.mo31379f();
            }
        }
    }

    /* renamed from: s */
    private void m5194s() {
        m5182F();
        this.f3835q.mo31312a(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f3821c)));
        m5196u();
    }

    /* renamed from: t */
    private void m5195t() {
        if (this.f3826h.mo31321b()) {
            m5178B();
        }
    }

    /* renamed from: u */
    private void m5196u() {
        if (this.f3826h.mo31322c()) {
            m5178B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo31304H() {
        C4404h k = m5187k(C4404h.INITIALIZE);
        if (k == C4404h.RESOURCE_CACHE || k == C4404h.DATA_CACHE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo31277a(C7218e eVar, Exception exc, C7422d<?> dVar, C7214a aVar) {
        dVar.mo41074b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.mo31250j(eVar, aVar, dVar.mo41069a());
        this.f3821c.add(glideException);
        if (Thread.currentThread() != this.f3842x) {
            this.f3838t = C4403g.SWITCH_TO_SOURCE_SERVICE;
            this.f3835q.mo31314c(this);
            return;
        }
        m5179C();
    }

    /* renamed from: b */
    public void mo31305b() {
        this.f3819F = true;
        C4393f fVar = this.f3817D;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: c */
    public void mo31278c() {
        this.f3838t = C4403g.SWITCH_TO_SOURCE_SERVICE;
        this.f3835q.mo31314c(this);
    }

    @NonNull
    /* renamed from: d */
    public C2134c mo23271d() {
        return this.f3822d;
    }

    /* renamed from: e */
    public void mo31279e(C7218e eVar, Object obj, C7422d<?> dVar, C7214a aVar, C7218e eVar2) {
        this.f3843y = eVar;
        this.f3814A = obj;
        this.f3816C = dVar;
        this.f3815B = aVar;
        this.f3844z = eVar2;
        if (Thread.currentThread() != this.f3842x) {
            this.f3838t = C4403g.DECODE_DATA;
            this.f3835q.mo31314c(this);
            return;
        }
        C2133b.m1489a("DecodeJob.decodeFromRetrievedData");
        try {
            m5185i();
        } finally {
            C2133b.m1492d();
        }
    }

    /* renamed from: f */
    public int compareTo(@NonNull C4396h<?> hVar) {
        int m = m5189m() - hVar.m5189m();
        if (m == 0) {
            return this.f3836r - hVar.f3836r;
        }
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C4396h<R> mo31308n(C4366d dVar, Object obj, C4421m mVar, C7218e eVar, int i, int i2, Class<?> cls, Class<R> cls2, C4368f fVar, C7737a aVar, Map<Class<?>, C7226k<?>> map, boolean z, boolean z2, boolean z3, C7222g gVar, C4398b<R> bVar, int i3) {
        this.f3820b.mo31300u(dVar, obj, eVar, i, i2, aVar, cls, cls2, fVar, gVar, map, z, z2, this.f3823e);
        this.f3827i = dVar;
        this.f3828j = eVar;
        this.f3829k = fVar;
        this.f3830l = mVar;
        this.f3831m = i;
        this.f3832n = i2;
        this.f3833o = aVar;
        this.f3840v = z3;
        this.f3834p = gVar;
        this.f3835q = bVar;
        this.f3836r = i3;
        this.f3838t = C4403g.INITIALIZE;
        this.f3841w = obj;
        return this;
    }

    public void run() {
        C2133b.m1490b("DecodeJob#run(model=%s)", this.f3841w);
        C7422d<?> dVar = this.f3816C;
        try {
            if (this.f3819F) {
                m5194s();
                if (dVar != null) {
                    dVar.mo41074b();
                }
                C2133b.m1492d();
                return;
            }
            m5181E();
            if (dVar != null) {
                dVar.mo41074b();
            }
            C2133b.m1492d();
        } catch (C4389b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo41074b();
            }
            C2133b.m1492d();
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.bumptech.glide.load.engine.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.bumptech.glide.load.engine.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.bumptech.glide.load.engine.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.bumptech.glide.load.engine.t} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.NonNull
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> p094g1.C7744c<Z> mo31310v(p058d1.C7214a r12, @androidx.annotation.NonNull p094g1.C7744c<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            d1.a r0 = p058d1.C7214a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.g<R> r0 = r11.f3820b
            d1.k r0 = r0.mo31297r(r8)
            com.bumptech.glide.d r2 = r11.f3827i
            int r3 = r11.f3831m
            int r4 = r11.f3832n
            g1.c r2 = r0.mo31430b(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.recycle()
        L_0x002b:
            com.bumptech.glide.load.engine.g<R> r13 = r11.f3820b
            boolean r13 = r13.mo31301v(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.engine.g<R> r13 = r11.f3820b
            d1.j r1 = r13.mo31293n(r0)
            d1.g r13 = r11.f3834p
            d1.c r13 = r1.mo31398b(r13)
            goto L_0x0042
        L_0x0040:
            d1.c r13 = p058d1.C7216c.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.engine.g<R> r1 = r11.f3820b
            d1.e r2 = r11.f3843y
            boolean r1 = r1.mo31303x(r2)
            r2 = 1
            r1 = r1 ^ r2
            g1.a r3 = r11.f3833o
            boolean r12 = r3.mo41380d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.engine.C4396h.C4397a.f3847c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.engine.t r12 = new com.bumptech.glide.load.engine.t
            com.bumptech.glide.load.engine.g<R> r13 = r11.f3820b
            h1.b r2 = r13.mo31281b()
            d1.e r3 = r11.f3843y
            d1.e r4 = r11.f3828j
            int r5 = r11.f3831m
            int r6 = r11.f3832n
            d1.g r9 = r11.f3834p
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.engine.d r12 = new com.bumptech.glide.load.engine.d
            d1.e r13 = r11.f3843y
            d1.e r1 = r11.f3828j
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.engine.r r0 = com.bumptech.glide.load.engine.C4427r.m5287c(r0)
            com.bumptech.glide.load.engine.h$d<?> r13 = r11.f3825g
            r13.mo31319d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C4396h.mo31310v(d1.a, g1.c):g1.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo31311w(boolean z) {
        if (this.f3826h.mo31323d(z)) {
            m5178B();
        }
    }
}
