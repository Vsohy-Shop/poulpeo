package p250v1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.C4366d;
import com.bumptech.glide.C4368f;
import com.bumptech.glide.load.engine.C4407j;
import com.bumptech.glide.load.engine.GlideException;
import java.util.List;
import java.util.concurrent.Executor;
import p020a2.C2134c;
import p058d1.C7214a;
import p094g1.C7744c;
import p177o1.C8947a;
import p261w1.C10103c;
import p261w1.C10104d;
import p272x1.C10387c;
import p294z1.C10787f;
import p294z1.C10792k;

/* renamed from: v1.h */
/* compiled from: SingleRequest */
public final class C9922h<R> implements C9916c, C10103c, C9921g {

    /* renamed from: D */
    private static final boolean f14881D = Log.isLoggable("Request", 2);
    @GuardedBy("requestLock")

    /* renamed from: A */
    private int f14882A;
    @GuardedBy("requestLock")

    /* renamed from: B */
    private boolean f14883B;
    @Nullable

    /* renamed from: C */
    private RuntimeException f14884C;
    @Nullable

    /* renamed from: a */
    private final String f14885a;

    /* renamed from: b */
    private final C2134c f14886b;

    /* renamed from: c */
    private final Object f14887c;
    @Nullable

    /* renamed from: d */
    private final C9919e<R> f14888d;

    /* renamed from: e */
    private final C9917d f14889e;

    /* renamed from: f */
    private final Context f14890f;

    /* renamed from: g */
    private final C4366d f14891g;
    @Nullable

    /* renamed from: h */
    private final Object f14892h;

    /* renamed from: i */
    private final Class<R> f14893i;

    /* renamed from: j */
    private final C9914a<?> f14894j;

    /* renamed from: k */
    private final int f14895k;

    /* renamed from: l */
    private final int f14896l;

    /* renamed from: m */
    private final C4368f f14897m;

    /* renamed from: n */
    private final C10104d<R> f14898n;
    @Nullable

    /* renamed from: o */
    private final List<C9919e<R>> f14899o;

    /* renamed from: p */
    private final C10387c<? super R> f14900p;

    /* renamed from: q */
    private final Executor f14901q;
    @GuardedBy("requestLock")

    /* renamed from: r */
    private C7744c<R> f14902r;
    @GuardedBy("requestLock")

    /* renamed from: s */
    private C4407j.C4413d f14903s;
    @GuardedBy("requestLock")

    /* renamed from: t */
    private long f14904t;

    /* renamed from: u */
    private volatile C4407j f14905u;
    @GuardedBy("requestLock")

    /* renamed from: v */
    private C9923a f14906v;
    @GuardedBy("requestLock")
    @Nullable

    /* renamed from: w */
    private Drawable f14907w;
    @GuardedBy("requestLock")
    @Nullable

    /* renamed from: x */
    private Drawable f14908x;
    @GuardedBy("requestLock")
    @Nullable

    /* renamed from: y */
    private Drawable f14909y;
    @GuardedBy("requestLock")

    /* renamed from: z */
    private int f14910z;

    /* renamed from: v1.h$a */
    /* compiled from: SingleRequest */
    private enum C9923a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C9922h(Context context, C4366d dVar, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, C9914a<?> aVar, int i, int i2, C4368f fVar, C10104d<R> dVar2, @Nullable C9919e<R> eVar, @Nullable List<C9919e<R>> list, C9917d dVar3, C4407j jVar, C10387c<? super R> cVar, Executor executor) {
        String str;
        if (f14881D) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f14885a = str;
        this.f14886b = C2134c.m1493a();
        this.f14887c = obj;
        this.f14890f = context;
        this.f14891g = dVar;
        this.f14892h = obj2;
        this.f14893i = cls;
        this.f14894j = aVar;
        this.f14895k = i;
        this.f14896l = i2;
        this.f14897m = fVar;
        this.f14898n = dVar2;
        this.f14888d = eVar;
        this.f14899o = list;
        this.f14889e = dVar3;
        this.f14905u = jVar;
        this.f14900p = cVar;
        this.f14901q = executor;
        this.f14906v = C9923a.PENDING;
        if (this.f14884C == null && dVar.mo31200h()) {
            this.f14884C = new RuntimeException("Glide request origin trace");
        }
    }

    @GuardedBy("requestLock")
    /* renamed from: A */
    private void m20690A() {
        Drawable drawable;
        if (m20693l()) {
            if (this.f14892h == null) {
                drawable = m20697p();
            } else {
                drawable = null;
            }
            if (drawable == null) {
                drawable = m20696o();
            }
            if (drawable == null) {
                drawable = m20698q();
            }
            this.f14898n.mo44679g(drawable);
        }
    }

    @GuardedBy("requestLock")
    /* renamed from: i */
    private void m20691i() {
        if (this.f14883B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @GuardedBy("requestLock")
    /* renamed from: k */
    private boolean m20692k() {
        C9917d dVar = this.f14889e;
        if (dVar == null || dVar.mo44481b(this)) {
            return true;
        }
        return false;
    }

    @GuardedBy("requestLock")
    /* renamed from: l */
    private boolean m20693l() {
        C9917d dVar = this.f14889e;
        if (dVar == null || dVar.mo44490i(this)) {
            return true;
        }
        return false;
    }

    @GuardedBy("requestLock")
    /* renamed from: m */
    private boolean m20694m() {
        C9917d dVar = this.f14889e;
        if (dVar == null || dVar.mo44480a(this)) {
            return true;
        }
        return false;
    }

    @GuardedBy("requestLock")
    /* renamed from: n */
    private void m20695n() {
        m20691i();
        this.f14886b.mo23273c();
        this.f14898n.mo44678f(this);
        C4407j.C4413d dVar = this.f14903s;
        if (dVar != null) {
            dVar.mo31337a();
            this.f14903s = null;
        }
    }

    @GuardedBy("requestLock")
    /* renamed from: o */
    private Drawable m20696o() {
        if (this.f14907w == null) {
            Drawable i = this.f14894j.mo44463i();
            this.f14907w = i;
            if (i == null && this.f14894j.mo44461h() > 0) {
                this.f14907w = m20700s(this.f14894j.mo44461h());
            }
        }
        return this.f14907w;
    }

    @GuardedBy("requestLock")
    /* renamed from: p */
    private Drawable m20697p() {
        if (this.f14909y == null) {
            Drawable j = this.f14894j.mo44464j();
            this.f14909y = j;
            if (j == null && this.f14894j.mo44465l() > 0) {
                this.f14909y = m20700s(this.f14894j.mo44465l());
            }
        }
        return this.f14909y;
    }

    @GuardedBy("requestLock")
    /* renamed from: q */
    private Drawable m20698q() {
        if (this.f14908x == null) {
            Drawable q = this.f14894j.mo44470q();
            this.f14908x = q;
            if (q == null && this.f14894j.mo44471r() > 0) {
                this.f14908x = m20700s(this.f14894j.mo44471r());
            }
        }
        return this.f14908x;
    }

    @GuardedBy("requestLock")
    /* renamed from: r */
    private boolean m20699r() {
        C9917d dVar = this.f14889e;
        if (dVar == null || !dVar.getRoot().mo44482c()) {
            return true;
        }
        return false;
    }

    @GuardedBy("requestLock")
    /* renamed from: s */
    private Drawable m20700s(@DrawableRes int i) {
        Resources.Theme theme;
        if (this.f14894j.mo44476w() != null) {
            theme = this.f14894j.mo44476w();
        } else {
            theme = this.f14890f.getTheme();
        }
        return C8947a.m18149a(this.f14891g, i, theme);
    }

    /* renamed from: t */
    private void m20701t(String str) {
        Log.v("Request", str + " this: " + this.f14885a);
    }

    /* renamed from: u */
    private static int m20702u(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return i;
        }
        return Math.round(f * ((float) i));
    }

    @GuardedBy("requestLock")
    /* renamed from: v */
    private void m20703v() {
        C9917d dVar = this.f14889e;
        if (dVar != null) {
            dVar.mo44484d(this);
        }
    }

    @GuardedBy("requestLock")
    /* renamed from: w */
    private void m20704w() {
        C9917d dVar = this.f14889e;
        if (dVar != null) {
            dVar.mo44486f(this);
        }
    }

    /* renamed from: x */
    public static <R> C9922h<R> m20705x(Context context, C4366d dVar, Object obj, Object obj2, Class<R> cls, C9914a<?> aVar, int i, int i2, C4368f fVar, C10104d<R> dVar2, C9919e<R> eVar, @Nullable List<C9919e<R>> list, C9917d dVar3, C4407j jVar, C10387c<? super R> cVar, Executor executor) {
        return new C9922h(context, dVar, obj, obj2, cls, aVar, i, i2, fVar, dVar2, eVar, list, dVar3, jVar, cVar, executor);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: y */
    private void m20706y(GlideException glideException, int i) {
        boolean z;
        this.f14886b.mo23273c();
        synchronized (this.f14887c) {
            glideException.mo31251k(this.f14884C);
            int f = this.f14891g.mo31198f();
            if (f <= i) {
                Log.w("Glide", "Load failed for " + this.f14892h + " with size [" + this.f14910z + "x" + this.f14882A + "]", glideException);
                if (f <= 4) {
                    glideException.mo31247g("Glide");
                }
            }
            this.f14903s = null;
            this.f14906v = C9923a.FAILED;
            boolean z2 = true;
            this.f14883B = true;
            try {
                List<C9919e<R>> list = this.f14899o;
                if (list != null) {
                    z = false;
                    for (C9919e<R> a : list) {
                        z |= a.mo44496a(glideException, this.f14892h, this.f14898n, m20699r());
                    }
                } else {
                    z = false;
                }
                C9919e<R> eVar = this.f14888d;
                if (eVar == null || !eVar.mo44496a(glideException, this.f14892h, this.f14898n, m20699r())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m20690A();
                }
                this.f14883B = false;
                m20703v();
            } catch (Throwable th) {
                this.f14883B = false;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7 A[Catch:{ all -> 0x00b8 }] */
    @androidx.annotation.GuardedBy("requestLock")
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20707z(p094g1.C7744c<R> r11, R r12, p058d1.C7214a r13) {
        /*
            r10 = this;
            boolean r6 = r10.m20699r()
            v1.h$a r0 = p250v1.C9922h.C9923a.COMPLETE
            r10.f14906v = r0
            r10.f14902r = r11
            com.bumptech.glide.d r11 = r10.f14891g
            int r11 = r11.mo31198f()
            r0 = 3
            if (r11 > r0) goto L_0x006a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Finished loading "
            r11.append(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f14892h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.f14910z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.f14882A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.f14904t
            double r0 = p294z1.C10787f.m22931a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x006a:
            r11 = 1
            r10.f14883B = r11
            r7 = 0
            java.util.List<v1.e<R>> r0 = r10.f14899o     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0090
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00b8 }
            r9 = r7
        L_0x0077:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00b8 }
            v1.e r0 = (p250v1.C9919e) r0     // Catch:{ all -> 0x00b8 }
            java.lang.Object r2 = r10.f14892h     // Catch:{ all -> 0x00b8 }
            w1.d<R> r3 = r10.f14898n     // Catch:{ all -> 0x00b8 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo44497b(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            r9 = r9 | r0
            goto L_0x0077
        L_0x0090:
            r9 = r7
        L_0x0091:
            v1.e<R> r0 = r10.f14888d     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r2 = r10.f14892h     // Catch:{ all -> 0x00b8 }
            w1.d<R> r3 = r10.f14898n     // Catch:{ all -> 0x00b8 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo44497b(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r11 = r7
        L_0x00a4:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b2
            x1.c<? super R> r11 = r10.f14900p     // Catch:{ all -> 0x00b8 }
            x1.b r11 = r11.mo45085a(r13, r6)     // Catch:{ all -> 0x00b8 }
            w1.d<R> r13 = r10.f14898n     // Catch:{ all -> 0x00b8 }
            r13.mo43366d(r12, r11)     // Catch:{ all -> 0x00b8 }
        L_0x00b2:
            r10.f14883B = r7
            r10.m20704w()
            return
        L_0x00b8:
            r11 = move-exception
            r10.f14883B = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9922h.m20707z(g1.c, java.lang.Object, d1.a):void");
    }

    /* renamed from: a */
    public void mo44498a(GlideException glideException) {
        m20706y(glideException, 5);
    }

    /* renamed from: b */
    public void mo44499b(C7744c<?> cVar, C7214a aVar) {
        Object obj;
        String str;
        this.f14886b.mo23273c();
        C7744c<?> cVar2 = null;
        try {
            synchronized (this.f14887c) {
                try {
                    this.f14903s = null;
                    if (cVar == null) {
                        mo44498a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f14893i + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = cVar.get();
                    if (obj2 != null) {
                        if (this.f14893i.isAssignableFrom(obj2.getClass())) {
                            if (!m20694m()) {
                                try {
                                    this.f14902r = null;
                                    this.f14906v = C9923a.COMPLETE;
                                    this.f14905u.mo31332k(cVar);
                                    return;
                                } catch (Throwable th) {
                                    cVar2 = cVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                m20707z(cVar, obj2, aVar);
                                return;
                            }
                        }
                    }
                    this.f14902r = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f14893i);
                    sb.append(" but instead got ");
                    if (obj2 != null) {
                        obj = obj2.getClass();
                    } else {
                        obj = "";
                    }
                    sb.append(obj);
                    sb.append("{");
                    sb.append(obj2);
                    sb.append("} inside Resource{");
                    sb.append(cVar);
                    sb.append("}.");
                    if (obj2 != null) {
                        str = "";
                    } else {
                        str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                    }
                    sb.append(str);
                    mo44498a(new GlideException(sb.toString()));
                    this.f14905u.mo31332k(cVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (cVar2 != null) {
                this.f14905u.mo31332k(cVar2);
            }
            throw th3;
        }
    }

    /* renamed from: c */
    public boolean mo44482c() {
        boolean z;
        synchronized (this.f14887c) {
            if (this.f14906v == C9923a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.f14905u.mo31332k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f14887c
            monitor-enter(r0)
            r5.m20691i()     // Catch:{ all -> 0x0039 }
            a2.c r1 = r5.f14886b     // Catch:{ all -> 0x0039 }
            r1.mo23273c()     // Catch:{ all -> 0x0039 }
            v1.h$a r1 = r5.f14906v     // Catch:{ all -> 0x0039 }
            v1.h$a r2 = p250v1.C9922h.C9923a.CLEARED     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0013:
            r5.m20695n()     // Catch:{ all -> 0x0039 }
            g1.c<R> r1 = r5.f14902r     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f14902r = r3     // Catch:{ all -> 0x0039 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.m20692k()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x002e
            w1.d<R> r3 = r5.f14898n     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r4 = r5.m20698q()     // Catch:{ all -> 0x0039 }
            r3.mo43367i(r4)     // Catch:{ all -> 0x0039 }
        L_0x002e:
            r5.f14906v = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            com.bumptech.glide.load.engine.j r0 = r5.f14905u
            r0.mo31332k(r1)
        L_0x0038:
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9922h.clear():void");
    }

    /* renamed from: d */
    public void mo44501d(int i, int i2) {
        Object obj;
        this.f14886b.mo23273c();
        Object obj2 = this.f14887c;
        synchronized (obj2) {
            try {
                boolean z = f14881D;
                if (z) {
                    m20701t("Got onSizeReady in " + C10787f.m22931a(this.f14904t));
                }
                if (this.f14906v == C9923a.WAITING_FOR_SIZE) {
                    C9923a aVar = C9923a.RUNNING;
                    this.f14906v = aVar;
                    float v = this.f14894j.mo44475v();
                    this.f14910z = m20702u(i, v);
                    this.f14882A = m20702u(i2, v);
                    if (z) {
                        m20701t("finished setup for calling load in " + C10787f.m22931a(this.f14904t));
                    }
                    C9923a aVar2 = aVar;
                    boolean z2 = z;
                    C9923a aVar3 = aVar2;
                    obj = obj2;
                    try {
                        this.f14903s = this.f14905u.mo31331f(this.f14891g, this.f14892h, this.f14894j.mo44474u(), this.f14910z, this.f14882A, this.f14894j.mo44473t(), this.f14893i, this.f14897m, this.f14894j.mo44460g(), this.f14894j.mo44477x(), this.f14894j.mo44441H(), this.f14894j.mo44440D(), this.f14894j.mo44467n(), this.f14894j.mo44438B(), this.f14894j.mo44479z(), this.f14894j.mo44478y(), this.f14894j.mo44466m(), this, this.f14901q);
                        if (this.f14906v != aVar3) {
                            this.f14903s = null;
                        }
                        if (z2) {
                            m20701t("finished onSizeReady in " + C10787f.m22931a(this.f14904t));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: e */
    public boolean mo44485e(C9916c cVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C9914a<?> aVar;
        C4368f fVar;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        C9914a<?> aVar2;
        C4368f fVar2;
        int i6;
        C9916c cVar2 = cVar;
        if (!(cVar2 instanceof C9922h)) {
            return false;
        }
        synchronized (this.f14887c) {
            i = this.f14895k;
            i2 = this.f14896l;
            obj = this.f14892h;
            cls = this.f14893i;
            aVar = this.f14894j;
            fVar = this.f14897m;
            List<C9919e<R>> list = this.f14899o;
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
        }
        C9922h hVar = (C9922h) cVar2;
        synchronized (hVar.f14887c) {
            i4 = hVar.f14895k;
            i5 = hVar.f14896l;
            obj2 = hVar.f14892h;
            cls2 = hVar.f14893i;
            aVar2 = hVar.f14894j;
            fVar2 = hVar.f14897m;
            List<C9919e<R>> list2 = hVar.f14899o;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        if (i == i4 && i2 == i5 && C10792k.m22951b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && fVar == fVar2 && i3 == i6) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Object mo44500f() {
        this.f14886b.mo23273c();
        return this.f14887c;
    }

    /* renamed from: g */
    public boolean mo44487g() {
        boolean z;
        synchronized (this.f14887c) {
            if (this.f14906v == C9923a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44489h() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f14887c
            monitor-enter(r0)
            r5.m20691i()     // Catch:{ all -> 0x00a7 }
            a2.c r1 = r5.f14886b     // Catch:{ all -> 0x00a7 }
            r1.mo23273c()     // Catch:{ all -> 0x00a7 }
            long r1 = p294z1.C10787f.m22932b()     // Catch:{ all -> 0x00a7 }
            r5.f14904t = r1     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r5.f14892h     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f14895k     // Catch:{ all -> 0x00a7 }
            int r2 = r5.f14896l     // Catch:{ all -> 0x00a7 }
            boolean r1 = p294z1.C10792k.m22967r(r1, r2)     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f14895k     // Catch:{ all -> 0x00a7 }
            r5.f14910z = r1     // Catch:{ all -> 0x00a7 }
            int r1 = r5.f14896l     // Catch:{ all -> 0x00a7 }
            r5.f14882A = r1     // Catch:{ all -> 0x00a7 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.m20697p()     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00a7 }
            r5.m20706y(r2, r1)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x003c:
            v1.h$a r1 = r5.f14906v     // Catch:{ all -> 0x00a7 }
            v1.h$a r2 = p250v1.C9922h.C9923a.RUNNING     // Catch:{ all -> 0x00a7 }
            if (r1 == r2) goto L_0x009f
            v1.h$a r3 = p250v1.C9922h.C9923a.COMPLETE     // Catch:{ all -> 0x00a7 }
            if (r1 != r3) goto L_0x004f
            g1.c<R> r1 = r5.f14902r     // Catch:{ all -> 0x00a7 }
            d1.a r2 = p058d1.C7214a.MEMORY_CACHE     // Catch:{ all -> 0x00a7 }
            r5.mo44499b(r1, r2)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x004f:
            v1.h$a r1 = p250v1.C9922h.C9923a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00a7 }
            r5.f14906v = r1     // Catch:{ all -> 0x00a7 }
            int r3 = r5.f14895k     // Catch:{ all -> 0x00a7 }
            int r4 = r5.f14896l     // Catch:{ all -> 0x00a7 }
            boolean r3 = p294z1.C10792k.m22967r(r3, r4)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0065
            int r3 = r5.f14895k     // Catch:{ all -> 0x00a7 }
            int r4 = r5.f14896l     // Catch:{ all -> 0x00a7 }
            r5.mo44501d(r3, r4)     // Catch:{ all -> 0x00a7 }
            goto L_0x006a
        L_0x0065:
            w1.d<R> r3 = r5.f14898n     // Catch:{ all -> 0x00a7 }
            r3.mo44677c(r5)     // Catch:{ all -> 0x00a7 }
        L_0x006a:
            v1.h$a r3 = r5.f14906v     // Catch:{ all -> 0x00a7 }
            if (r3 == r2) goto L_0x0070
            if (r3 != r1) goto L_0x007f
        L_0x0070:
            boolean r1 = r5.m20693l()     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x007f
            w1.d<R> r1 = r5.f14898n     // Catch:{ all -> 0x00a7 }
            android.graphics.drawable.Drawable r2 = r5.m20698q()     // Catch:{ all -> 0x00a7 }
            r1.mo44680h(r2)     // Catch:{ all -> 0x00a7 }
        L_0x007f:
            boolean r1 = f14881D     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x009d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r1.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            long r2 = r5.f14904t     // Catch:{ all -> 0x00a7 }
            double r2 = p294z1.C10787f.m22931a(r2)     // Catch:{ all -> 0x00a7 }
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a7 }
            r5.m20701t(r1)     // Catch:{ all -> 0x00a7 }
        L_0x009d:
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x009f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00a7 }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9922h.mo44489h():void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f14887c) {
            C9923a aVar = this.f14906v;
            if (aVar != C9923a.RUNNING) {
                if (aVar != C9923a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo44492j() {
        boolean z;
        synchronized (this.f14887c) {
            if (this.f14906v == C9923a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void pause() {
        synchronized (this.f14887c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
