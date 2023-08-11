package p042bo.app;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p031b0.C2807d;
import p031b0.C2811f;
import p126j0.C8266c;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;

/* renamed from: bo.app.z0 */
public final class C3822z0 implements C3285j2 {

    /* renamed from: a */
    private final C3834z4 f2827a;

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<C2811f<?>>> f2828b = new ConcurrentHashMap();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<C2811f<?>>> f2829c = new ConcurrentHashMap();

    /* renamed from: d */
    private final ConcurrentMap<Class<?>, Object> f2830d = new ConcurrentHashMap();

    /* renamed from: e */
    private final ReentrantLock f2831e = new ReentrantLock();

    /* renamed from: f */
    private final ReentrantLock f2832f = new ReentrantLock();

    /* renamed from: g */
    private final ReentrantLock f2833g = new ReentrantLock();

    /* renamed from: bo.app.z0$a */
    static final class C3823a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f2834b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3823a(Class<T> cls) {
            super(0);
            this.f2834b = cls;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Publishing cached event for class: ", this.f2834b);
        }
    }

    /* renamed from: bo.app.z0$b */
    static final class C3824b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f2835b;

        /* renamed from: c */
        final /* synthetic */ CopyOnWriteArraySet<C2811f<?>> f2836c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3824b(Class<T> cls, CopyOnWriteArraySet<C2811f<?>> copyOnWriteArraySet) {
            super(0);
            this.f2835b = cls;
            this.f2836c = copyOnWriteArraySet;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Triggering " + this.f2835b.getName() + " on " + this.f2836c.size() + " subscribers.";
        }
    }

    /* renamed from: bo.app.z0$c */
    static final class C3825c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f2837b;

        /* renamed from: c */
        final /* synthetic */ T f2838c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3825c(Class<T> cls, T t) {
            super(0);
            this.f2837b = cls;
            this.f2838c = t;
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not publishing event class: " + this.f2837b.getName() + " and message: " + this.f2838c;
        }
    }

    /* renamed from: bo.app.z0$d */
    static final class C3826d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f2839b;

        /* renamed from: c */
        final /* synthetic */ T f2840c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3826d(Class<T> cls, T t) {
            super(0);
            this.f2839b = cls;
            this.f2840c = t;
        }

        /* renamed from: a */
        public final String invoke() {
            return this.f2839b.getName() + " fired: " + this.f2840c;
        }
    }

    @C12739f(mo50609c = "com.braze.events.EventManager$publish$3", mo50610f = "EventManager.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.z0$e */
    static final class C3827e extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f2841b;

        /* renamed from: c */
        final /* synthetic */ C2811f<T> f2842c;

        /* renamed from: d */
        final /* synthetic */ T f2843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3827e(C2811f<T> fVar, T t, C12074d<? super C3827e> dVar) {
            super(2, dVar);
            this.f2842c = fVar;
            this.f2843d = t;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3827e) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C3827e(this.f2842c, this.f2843d, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f2841b == 0) {
                C11910n.m25701b(obj);
                this.f2842c.mo28291a(this.f2843d);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.z0$f */
    static final class C3828f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f2844b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3828f(Class<T> cls) {
            super(0);
            this.f2844b = cls;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Event was published, but no subscribers were found. But not saving event for publishing later. Event class: ", this.f2844b);
        }
    }

    /* renamed from: bo.app.z0$g */
    static final class C3829g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f2845b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3829g(Class<T> cls) {
            super(0);
            this.f2845b = cls;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: ", this.f2845b);
        }
    }

    public C3822z0(C3834z4 z4Var) {
        C12775o.m28639i(z4Var, "sdkEnablementProvider");
        this.f2827a = z4Var;
    }

    /* renamed from: a */
    public <T> boolean mo29153a(C2811f<T> fVar, Class<T> cls) {
        C12775o.m28639i(fVar, "subscriber");
        C12775o.m28639i(cls, "eventClass");
        ReentrantLock reentrantLock = this.f2832f;
        reentrantLock.lock();
        try {
            return m4201a(fVar, cls, this.f2829c);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public <T> boolean mo29154b(C2811f<T> fVar, Class<T> cls) {
        C12775o.m28639i(fVar, "subscriber");
        C12775o.m28639i(cls, "eventClass");
        ReentrantLock reentrantLock = this.f2831e;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = this.f2828b.get(cls);
            if (copyOnWriteArraySet == null) {
                reentrantLock.unlock();
                return false;
            }
            boolean a = m4202a((CopyOnWriteArraySet<C2811f<?>>) copyOnWriteArraySet, fVar);
            reentrantLock.unlock();
            return a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final ConcurrentMap<Class<?>, Object> mo29840c() {
        return this.f2830d;
    }

    /* renamed from: c */
    public <T> void mo29155c(C2811f<T> fVar, Class<T> cls) {
        C12775o.m28639i(fVar, "subscriber");
        C12775o.m28639i(cls, "eventClass");
        ReentrantLock reentrantLock = this.f2831e;
        reentrantLock.lock();
        try {
            m4201a(fVar, cls, this.f2828b);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0095, code lost:
        if (r3.isEmpty() == false) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void mo29152a(T r18, java.lang.Class<T> r19) {
        /*
            r17 = this;
            r9 = r17
            r0 = r18
            r10 = r19
            java.lang.String r1 = "eventClass"
            kotlin.jvm.internal.C12775o.m28639i(r10, r1)
            bo.app.z4 r1 = r9.f2827a
            boolean r1 = r1.mo29850a()
            if (r1 == 0) goto L_0x0025
            j0.c r1 = p126j0.C8266c.f11641a
            bo.app.z0$c r6 = new bo.app.z0$c
            r6.<init>(r10, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 7
            r8 = 0
            r2 = r17
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            j0.c r1 = p126j0.C8266c.f11641a
            bo.app.z0$d r6 = new bo.app.z0$d
            r6.<init>(r10, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 7
            r8 = 0
            r2 = r17
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<b0.f<?>>> r1 = r9.f2828b
            java.lang.Object r1 = r1.get(r10)
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            r2 = 1
            if (r1 == 0) goto L_0x006e
            java.util.concurrent.CopyOnWriteArraySet r3 = r9.m4199a(r10, (java.util.concurrent.CopyOnWriteArraySet<p031b0.C2811f<?>>) r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x0049:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r3.next()
            b0.f r4 = (p031b0.C2811f) r4
            y.a r11 = p281y.C10606a.f16162b
            bo.app.z0$e r14 = new bo.app.z0$e
            r5 = 0
            r14.<init>(r4, r0, r5)
            r12 = 0
            r13 = 0
            r15 = 3
            r16 = 0
            p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r11, r12, r13, r14, r15, r16)
            goto L_0x0049
        L_0x0066:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x006e
            r1 = r2
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<b0.f<?>>> r3 = r9.f2829c
            java.lang.Object r3 = r3.get(r10)
            java.util.concurrent.CopyOnWriteArraySet r3 = (java.util.concurrent.CopyOnWriteArraySet) r3
            if (r3 == 0) goto L_0x0098
            java.util.concurrent.CopyOnWriteArraySet r4 = r9.m4199a(r10, (java.util.concurrent.CopyOnWriteArraySet<p031b0.C2811f<?>>) r3)
            java.util.Iterator r4 = r4.iterator()
        L_0x0081:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0091
            java.lang.Object r5 = r4.next()
            b0.f r5 = (p031b0.C2811f) r5
            r5.mo28291a(r0)
            goto L_0x0081
        L_0x0091:
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r2 = r1
        L_0x0099:
            if (r2 != 0) goto L_0x00df
            if (r0 == 0) goto L_0x00df
            java.lang.Class<b0.i> r1 = p031b0.C2814i.class
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r10, r1)
            if (r1 == 0) goto L_0x00b8
            j0.c r1 = p126j0.C8266c.f11641a
            j0.c$a r3 = p126j0.C8266c.C8267a.I
            bo.app.z0$f r6 = new bo.app.z0$f
            r6.<init>(r10)
            r4 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r2 = r17
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00df
        L_0x00b8:
            j0.c r1 = p126j0.C8266c.f11641a
            j0.c$a r3 = p126j0.C8266c.C8267a.I
            bo.app.z0$g r6 = new bo.app.z0$g
            r6.<init>(r10)
            r4 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r2 = r17
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.locks.ReentrantLock r1 = r9.f2833g
            r1.lock()
            java.util.concurrent.ConcurrentMap r2 = r17.mo29840c()     // Catch:{ all -> 0x00da }
            r2.put(r10, r0)     // Catch:{ all -> 0x00da }
            r1.unlock()
            goto L_0x00df
        L_0x00da:
            r0 = move-exception
            r1.unlock()
            throw r0
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3822z0.mo29152a(java.lang.Object, java.lang.Class):void");
    }

    /* renamed from: b */
    public void mo29839b() {
        ReentrantLock reentrantLock = this.f2833g;
        reentrantLock.lock();
        try {
            mo29840c().remove(C2807d.class);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo29151a() {
        ReentrantLock reentrantLock = this.f2831e;
        reentrantLock.lock();
        try {
            this.f2828b.clear();
            C11921v vVar = C11921v.f18618a;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f2832f;
            reentrantLock2.lock();
            try {
                this.f2829c.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = new java.util.concurrent.CopyOnWriteArraySet();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> boolean m4201a(p031b0.C2811f<T> r2, java.lang.Class<T> r3, java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<p031b0.C2811f<?>>> r4) {
        /*
            r1 = this;
            java.lang.Object r0 = r4.get(r3)
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            if (r0 != 0) goto L_0x0017
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            java.lang.Object r4 = r4.putIfAbsent(r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4
            if (r4 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r0 = r4
        L_0x0017:
            boolean r2 = r0.add(r2)
            r1.m4200a(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3822z0.m4201a(b0.f, java.lang.Class, java.util.concurrent.ConcurrentMap):boolean");
    }

    /* renamed from: a */
    private final <T> void m4200a(Class<T> cls) {
        ReentrantLock reentrantLock = this.f2833g;
        reentrantLock.lock();
        try {
            if (mo29840c().containsKey(cls)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3823a(cls), 6, (Object) null);
                Object remove = mo29840c().remove(cls);
                if (remove != null) {
                    mo29152a(remove, cls);
                }
            }
            C11921v vVar = C11921v.f18618a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    private final <T> boolean m4202a(CopyOnWriteArraySet<C2811f<?>> copyOnWriteArraySet, C2811f<T> fVar) {
        return copyOnWriteArraySet.remove(fVar);
    }

    /* renamed from: a */
    private final <T> CopyOnWriteArraySet<C2811f<T>> m4199a(Class<T> cls, CopyOnWriteArraySet<C2811f<?>> copyOnWriteArraySet) {
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3824b(cls, copyOnWriteArraySet), 7, (Object) null);
        return copyOnWriteArraySet;
    }
}
