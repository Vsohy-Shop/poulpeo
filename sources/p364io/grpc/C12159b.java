package p364io.grpc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p111h6.C8003j;
import p111h6.C8012n;
import p364io.grpc.C12161c;
import p458xd.C13773a;
import p458xd.C13819p;

/* renamed from: io.grpc.b */
/* compiled from: CallOptions */
public final class C12159b {

    /* renamed from: k */
    public static final C12159b f19052k = new C12159b();

    /* renamed from: a */
    private C13819p f19053a;

    /* renamed from: b */
    private Executor f19054b;

    /* renamed from: c */
    private String f19055c;

    /* renamed from: d */
    private C13773a f19056d;

    /* renamed from: e */
    private String f19057e;

    /* renamed from: f */
    private Object[][] f19058f;

    /* renamed from: g */
    private List<C12161c.C12162a> f19059g;

    /* renamed from: h */
    private Boolean f19060h;

    /* renamed from: i */
    private Integer f19061i;

    /* renamed from: j */
    private Integer f19062j;

    /* renamed from: io.grpc.b$a */
    /* compiled from: CallOptions */
    public static final class C12160a<T> {

        /* renamed from: a */
        private final String f19063a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final T f19064b;

        private C12160a(String str, T t) {
            this.f19063a = str;
            this.f19064b = t;
        }

        /* renamed from: b */
        public static <T> C12160a<T> m26541b(String str) {
            C8012n.m15756o(str, "debugString");
            return new C12160a<>(str, (Object) null);
        }

        public String toString() {
            return this.f19063a;
        }
    }

    private C12159b() {
        this.f19059g = Collections.emptyList();
        this.f19058f = (Object[][]) Array.newInstance(Object.class, new int[]{0, 2});
    }

    /* renamed from: a */
    public String mo49616a() {
        return this.f19055c;
    }

    /* renamed from: b */
    public String mo49617b() {
        return this.f19057e;
    }

    /* renamed from: c */
    public C13773a mo49618c() {
        return this.f19056d;
    }

    /* renamed from: d */
    public C13819p mo49619d() {
        return this.f19053a;
    }

    /* renamed from: e */
    public Executor mo49620e() {
        return this.f19054b;
    }

    /* renamed from: f */
    public Integer mo49621f() {
        return this.f19061i;
    }

    /* renamed from: g */
    public Integer mo49622g() {
        return this.f19062j;
    }

    /* renamed from: h */
    public <T> T mo49623h(C12160a<T> aVar) {
        C8012n.m15756o(aVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f19058f;
            if (i >= objArr.length) {
                return aVar.f19064b;
            }
            if (aVar.equals(objArr[i][0])) {
                return this.f19058f[i][1];
            }
            i++;
        }
    }

    /* renamed from: i */
    public List<C12161c.C12162a> mo49624i() {
        return this.f19059g;
    }

    /* renamed from: j */
    public boolean mo49625j() {
        return Boolean.TRUE.equals(this.f19060h);
    }

    /* renamed from: k */
    public C12159b mo49626k(C13819p pVar) {
        C12159b bVar = new C12159b(this);
        bVar.f19053a = pVar;
        return bVar;
    }

    /* renamed from: l */
    public C12159b mo49627l(long j, TimeUnit timeUnit) {
        return mo49626k(C13819p.m31740a(j, timeUnit));
    }

    /* renamed from: m */
    public C12159b mo49628m(Executor executor) {
        C12159b bVar = new C12159b(this);
        bVar.f19054b = executor;
        return bVar;
    }

    /* renamed from: n */
    public C12159b mo49629n(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15749h(z, "invalid maxsize %s", i);
        C12159b bVar = new C12159b(this);
        bVar.f19061i = Integer.valueOf(i);
        return bVar;
    }

    /* renamed from: o */
    public C12159b mo49630o(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15749h(z, "invalid maxsize %s", i);
        C12159b bVar = new C12159b(this);
        bVar.f19062j = Integer.valueOf(i);
        return bVar;
    }

    /* renamed from: p */
    public <T> C12159b mo49631p(C12160a<T> aVar, T t) {
        int i;
        C8012n.m15756o(aVar, "key");
        C8012n.m15756o(t, "value");
        C12159b bVar = new C12159b(this);
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.f19058f;
            if (i2 >= objArr.length) {
                i2 = -1;
                break;
            } else if (aVar.equals(objArr[i2][0])) {
                break;
            } else {
                i2++;
            }
        }
        int length = this.f19058f.length;
        if (i2 == -1) {
            i = 1;
        } else {
            i = 0;
        }
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length + i;
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, iArr);
        bVar.f19058f = objArr2;
        Object[][] objArr3 = this.f19058f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i2 == -1) {
            bVar.f19058f[this.f19058f.length] = new Object[]{aVar, t};
        } else {
            bVar.f19058f[i2] = new Object[]{aVar, t};
        }
        return bVar;
    }

    /* renamed from: q */
    public C12159b mo49632q(C12161c.C12162a aVar) {
        C12159b bVar = new C12159b(this);
        ArrayList arrayList = new ArrayList(this.f19059g.size() + 1);
        arrayList.addAll(this.f19059g);
        arrayList.add(aVar);
        bVar.f19059g = Collections.unmodifiableList(arrayList);
        return bVar;
    }

    /* renamed from: r */
    public C12159b mo49633r() {
        C12159b bVar = new C12159b(this);
        bVar.f19060h = Boolean.TRUE;
        return bVar;
    }

    /* renamed from: s */
    public C12159b mo49634s() {
        C12159b bVar = new C12159b(this);
        bVar.f19060h = Boolean.FALSE;
        return bVar;
    }

    public String toString() {
        Class<?> cls;
        C8003j.C8005b d = C8003j.m15723c(this).mo41840d("deadline", this.f19053a).mo41840d("authority", this.f19055c).mo41840d("callCredentials", this.f19056d);
        Executor executor = this.f19054b;
        if (executor != null) {
            cls = executor.getClass();
        } else {
            cls = null;
        }
        return d.mo41840d("executor", cls).mo41840d("compressorName", this.f19057e).mo41840d("customOptions", Arrays.deepToString(this.f19058f)).mo41841e("waitForReady", mo49625j()).mo41840d("maxInboundMessageSize", this.f19061i).mo41840d("maxOutboundMessageSize", this.f19062j).mo41840d("streamTracerFactories", this.f19059g).toString();
    }

    private C12159b(C12159b bVar) {
        this.f19059g = Collections.emptyList();
        this.f19053a = bVar.f19053a;
        this.f19055c = bVar.f19055c;
        this.f19056d = bVar.f19056d;
        this.f19054b = bVar.f19054b;
        this.f19057e = bVar.f19057e;
        this.f19058f = bVar.f19058f;
        this.f19060h = bVar.f19060h;
        this.f19061i = bVar.f19061i;
        this.f19062j = bVar.f19062j;
        this.f19059g = bVar.f19059g;
    }
}
