package com.google.common.util.concurrent;

import androidx.concurrent.futures.C1248a;
import com.google.j2objc.annotations.ReflectionSupport;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;
import p111h6.C8018q;
import p152l6.C8743a;
import p152l6.C8744b;
import sun.misc.Unsafe;

@ReflectionSupport(ReflectionSupport.Level.FULL)
/* renamed from: com.google.common.util.concurrent.a */
/* compiled from: AbstractFuture */
public abstract class C6891a<V> extends C8743a implements C6906d<V> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f9061e;

    /* renamed from: f */
    private static final Logger f9062f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C6893b f9063g;

    /* renamed from: h */
    private static final Object f9064h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile Object f9065b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile C6897e f9066c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile C6903j f9067d;

    /* renamed from: com.google.common.util.concurrent.a$b */
    /* compiled from: AbstractFuture */
    private static abstract class C6893b {
        private C6893b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo39735a(C6891a<?> aVar, C6897e eVar, C6897e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo39736b(C6891a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo39737c(C6891a<?> aVar, C6903j jVar, C6903j jVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo39738d(C6903j jVar, C6903j jVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo39739e(C6903j jVar, Thread thread);
    }

    /* renamed from: com.google.common.util.concurrent.a$c */
    /* compiled from: AbstractFuture */
    private static final class C6894c {

        /* renamed from: c */
        static final C6894c f9068c;

        /* renamed from: d */
        static final C6894c f9069d;

        /* renamed from: a */
        final boolean f9070a;

        /* renamed from: b */
        final Throwable f9071b;

        static {
            if (C6891a.f9061e) {
                f9069d = null;
                f9068c = null;
                return;
            }
            f9069d = new C6894c(false, (Throwable) null);
            f9068c = new C6894c(true, (Throwable) null);
        }

        C6894c(boolean z, Throwable th) {
            this.f9070a = z;
            this.f9071b = th;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$d */
    /* compiled from: AbstractFuture */
    private static final class C6895d {

        /* renamed from: b */
        static final C6895d f9072b = new C6895d(new C6896a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f9073a;

        /* renamed from: com.google.common.util.concurrent.a$d$a */
        /* compiled from: AbstractFuture */
        class C6896a extends Throwable {
            C6896a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C6895d(Throwable th) {
            this.f9073a = (Throwable) C8012n.m15755n(th);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$e */
    /* compiled from: AbstractFuture */
    private static final class C6897e {

        /* renamed from: d */
        static final C6897e f9074d = new C6897e((Runnable) null, (Executor) null);

        /* renamed from: a */
        final Runnable f9075a;

        /* renamed from: b */
        final Executor f9076b;

        /* renamed from: c */
        C6897e f9077c;

        C6897e(Runnable runnable, Executor executor) {
            this.f9075a = runnable;
            this.f9076b = executor;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$f */
    /* compiled from: AbstractFuture */
    private static final class C6898f extends C6893b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C6903j, Thread> f9078a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C6903j, C6903j> f9079b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C6891a, C6903j> f9080c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C6891a, C6897e> f9081d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C6891a, Object> f9082e;

        C6898f(AtomicReferenceFieldUpdater<C6903j, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C6903j, C6903j> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C6891a, C6903j> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C6891a, C6897e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C6891a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f9078a = atomicReferenceFieldUpdater;
            this.f9079b = atomicReferenceFieldUpdater2;
            this.f9080c = atomicReferenceFieldUpdater3;
            this.f9081d = atomicReferenceFieldUpdater4;
            this.f9082e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo39735a(C6891a<?> aVar, C6897e eVar, C6897e eVar2) {
            return C1248a.m719a(this.f9081d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo39736b(C6891a<?> aVar, Object obj, Object obj2) {
            return C1248a.m719a(this.f9082e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo39737c(C6891a<?> aVar, C6903j jVar, C6903j jVar2) {
            return C1248a.m719a(this.f9080c, aVar, jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo39738d(C6903j jVar, C6903j jVar2) {
            this.f9079b.lazySet(jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo39739e(C6903j jVar, Thread thread) {
            this.f9078a.lazySet(jVar, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$g */
    /* compiled from: AbstractFuture */
    private static final class C6899g<V> implements Runnable {

        /* renamed from: b */
        final C6891a<V> f9083b;

        /* renamed from: c */
        final C6906d<? extends V> f9084c;

        public void run() {
            if (this.f9083b.f9065b == this) {
                if (C6891a.f9063g.mo39736b(this.f9083b, this, C6891a.m11957v(this.f9084c))) {
                    C6891a.m11954s(this.f9083b);
                }
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$h */
    /* compiled from: AbstractFuture */
    private static final class C6900h extends C6893b {
        private C6900h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo39735a(C6891a<?> aVar, C6897e eVar, C6897e eVar2) {
            synchronized (aVar) {
                if (aVar.f9066c != eVar) {
                    return false;
                }
                C6897e unused = aVar.f9066c = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo39736b(C6891a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f9065b != obj) {
                    return false;
                }
                Object unused = aVar.f9065b = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo39737c(C6891a<?> aVar, C6903j jVar, C6903j jVar2) {
            synchronized (aVar) {
                if (aVar.f9067d != jVar) {
                    return false;
                }
                C6903j unused = aVar.f9067d = jVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo39738d(C6903j jVar, C6903j jVar2) {
            jVar.f9093b = jVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo39739e(C6903j jVar, Thread thread) {
            jVar.f9092a = thread;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$i */
    /* compiled from: AbstractFuture */
    private static final class C6901i extends C6893b {

        /* renamed from: a */
        static final Unsafe f9085a;

        /* renamed from: b */
        static final long f9086b;

        /* renamed from: c */
        static final long f9087c;

        /* renamed from: d */
        static final long f9088d;

        /* renamed from: e */
        static final long f9089e;

        /* renamed from: f */
        static final long f9090f;

        /* renamed from: com.google.common.util.concurrent.a$i$a */
        /* compiled from: AbstractFuture */
        class C6902a implements PrivilegedExceptionAction<Unsafe> {
            C6902a() {
            }

            /* renamed from: a */
            public Unsafe run() {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.C6891a.C6901i.C6902a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.common.util.concurrent.a$j> r0 = com.google.common.util.concurrent.C6891a.C6903j.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.common.util.concurrent.a$i$a r1 = new com.google.common.util.concurrent.a$i$a     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<com.google.common.util.concurrent.a> r2 = com.google.common.util.concurrent.C6891a.class
                java.lang.String r3 = "d"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f9087c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "c"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f9086b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "b"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f9088d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f9089e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f9090f = r2     // Catch:{ Exception -> 0x0053 }
                f9085a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                p111h6.C8020s.m15785f(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C6891a.C6901i.<clinit>():void");
        }

        private C6901i() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo39735a(C6891a<?> aVar, C6897e eVar, C6897e eVar2) {
            return C6904b.m11989a(f9085a, aVar, f9086b, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo39736b(C6891a<?> aVar, Object obj, Object obj2) {
            return C6904b.m11989a(f9085a, aVar, f9088d, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo39737c(C6891a<?> aVar, C6903j jVar, C6903j jVar2) {
            return C6904b.m11989a(f9085a, aVar, f9087c, jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo39738d(C6903j jVar, C6903j jVar2) {
            f9085a.putObject(jVar, f9090f, jVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo39739e(C6903j jVar, Thread thread) {
            f9085a.putObject(jVar, f9089e, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$j */
    /* compiled from: AbstractFuture */
    private static final class C6903j {

        /* renamed from: c */
        static final C6903j f9091c = new C6903j(false);

        /* renamed from: a */
        volatile Thread f9092a;

        /* renamed from: b */
        volatile C6903j f9093b;

        C6903j() {
            C6891a.f9063g.mo39739e(this, Thread.currentThread());
        }

        C6903j(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo39744a(C6903j jVar) {
            C6891a.f9063g.mo39738d(this, jVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo39745b() {
            Thread thread = this.f9092a;
            if (thread != null) {
                this.f9092a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        boolean z;
        C6893b bVar;
        Class<C6903j> cls = C6903j.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f9061e = z;
        Class<C6891a> cls2 = C6891a.class;
        f9062f = Logger.getLogger(cls2.getName());
        Throwable th = null;
        try {
            bVar = new C6901i();
            th = null;
        } catch (Throwable th2) {
            bVar = new C6900h();
            th = th2;
        }
        f9063g = bVar;
        if (th != null) {
            Logger logger = f9062f;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    protected C6891a() {
    }

    /* renamed from: A */
    private void m11937A(C6903j jVar) {
        jVar.f9092a = null;
        while (true) {
            C6903j jVar2 = this.f9067d;
            if (jVar2 != C6903j.f9091c) {
                C6903j jVar3 = null;
                while (jVar2 != null) {
                    C6903j jVar4 = jVar2.f9093b;
                    if (jVar2.f9092a != null) {
                        jVar3 = jVar2;
                    } else if (jVar3 != null) {
                        jVar3.f9093b = jVar4;
                        if (jVar3.f9092a == null) {
                        }
                    } else if (!f9063g.mo39737c(this, jVar2, jVar4)) {
                    }
                    jVar2 = jVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: l */
    private void m11948l(StringBuilder sb) {
        try {
            Object w = m11958w(this);
            sb.append("SUCCESS, result=[");
            m11950o(sb, w);
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: m */
    private void m11949m(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f9065b;
        if (obj instanceof C6899g) {
            sb.append(", setFuture=[");
            m11951p(sb, ((C6899g) obj).f9084c);
            sb.append("]");
        } else {
            try {
                str = C8018q.m15776a(mo39734y());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(valueOf);
                str = sb2.toString();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m11948l(sb);
        }
    }

    /* renamed from: o */
    private void m11950o(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* renamed from: p */
    private void m11951p(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: q */
    private static CancellationException m11952q(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: r */
    private C6897e m11953r(C6897e eVar) {
        C6897e eVar2;
        do {
            eVar2 = this.f9066c;
        } while (!f9063g.mo39735a(this, eVar2, C6897e.f9074d));
        C6897e eVar3 = eVar2;
        C6897e eVar4 = eVar;
        C6897e eVar5 = eVar3;
        while (eVar5 != null) {
            C6897e eVar6 = eVar5.f9077c;
            eVar5.f9077c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static void m11954s(C6891a<?> aVar) {
        C6897e eVar = null;
        C6891a<V> aVar2 = aVar;
        while (true) {
            aVar2.m11959z();
            aVar2.mo39731n();
            C6897e r = aVar2.m11953r(eVar);
            while (true) {
                if (r != null) {
                    eVar = r.f9077c;
                    Runnable runnable = r.f9075a;
                    if (runnable instanceof C6899g) {
                        C6899g gVar = (C6899g) runnable;
                        C6891a<V> aVar3 = gVar.f9083b;
                        if (aVar3.f9065b == gVar) {
                            if (f9063g.mo39736b(aVar3, gVar, m11957v(gVar.f9084c))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m11955t(runnable, r.f9076b);
                    }
                    r = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private static void m11955t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f9062f;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), e);
        }
    }

    /* renamed from: u */
    private V m11956u(Object obj) {
        if (obj instanceof C6894c) {
            throw m11952q("Task was cancelled.", ((C6894c) obj).f9071b);
        } else if (obj instanceof C6895d) {
            throw new ExecutionException(((C6895d) obj).f9073a);
        } else if (obj == f9064h) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static Object m11957v(C6906d<?> dVar) {
        Throwable a;
        if ((dVar instanceof C8743a) && (a = C8744b.m17690a((C8743a) dVar)) != null) {
            return new C6895d(a);
        }
        boolean isCancelled = dVar.isCancelled();
        if ((!f9061e) && isCancelled) {
            return C6894c.f9069d;
        }
        try {
            Object w = m11958w(dVar);
            if (isCancelled) {
                String valueOf = String.valueOf(dVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new C6894c(false, new IllegalArgumentException(sb.toString()));
            } else if (w == null) {
                return f9064h;
            } else {
                return w;
            }
        } catch (ExecutionException e) {
            if (!isCancelled) {
                return new C6895d(e.getCause());
            }
            String valueOf2 = String.valueOf(dVar);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(valueOf2);
            return new C6894c(false, new IllegalArgumentException(sb2.toString(), e));
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C6894c(false, e2);
            }
            String valueOf3 = String.valueOf(dVar);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 77);
            sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb3.append(valueOf3);
            return new C6895d(new IllegalArgumentException(sb3.toString(), e2));
        } catch (Throwable th) {
            return new C6895d(th);
        }
    }

    /* renamed from: w */
    private static <V> V m11958w(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: z */
    private void m11959z() {
        C6903j jVar;
        do {
            jVar = this.f9067d;
        } while (!f9063g.mo39737c(this, jVar, C6903j.f9091c));
        while (jVar != null) {
            jVar.mo39745b();
            jVar = jVar.f9093b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo39723B(V v) {
        if (v == null) {
            v = f9064h;
        }
        if (!f9063g.mo39736b(this, (Object) null, v)) {
            return false;
        }
        m11954s(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo39724C(Throwable th) {
        if (!f9063g.mo39736b(this, (Object) null, new C6895d((Throwable) C8012n.m15755n(th)))) {
            return false;
        }
        m11954s(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Throwable mo39725a() {
        return null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        C6897e eVar;
        C8012n.m15756o(runnable, "Runnable was null.");
        C8012n.m15756o(executor, "Executor was null.");
        if (isDone() || (eVar = this.f9066c) == C6897e.f9074d) {
            m11955t(runnable, executor);
        }
        C6897e eVar2 = new C6897e(runnable, executor);
        do {
            eVar2.f9077c = eVar;
            if (!f9063g.mo39735a(this, eVar, eVar2)) {
                eVar = this.f9066c;
            } else {
                return;
            }
        } while (eVar != C6897e.f9074d);
        m11955t(runnable, executor);
    }

    public boolean cancel(boolean z) {
        boolean z2;
        C6894c cVar;
        Object obj = this.f9065b;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || (obj instanceof C6899g)) {
            if (f9061e) {
                cVar = new C6894c(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                cVar = C6894c.f9068c;
            } else {
                cVar = C6894c.f9069d;
            }
            while (!f9063g.mo39736b(this, obj, cVar)) {
                obj = this.f9065b;
                if (!(obj instanceof C6899g)) {
                }
            }
            if (z) {
                mo39733x();
            }
            m11954s(this);
            if (!(obj instanceof C6899g)) {
                return true;
            }
            ((C6899g) obj).f9084c.cancel(z);
            return true;
        }
        return false;
    }

    public V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f9065b;
            if ((obj != null) && (!(obj instanceof C6899g))) {
                return m11956u(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C6903j jVar = this.f9067d;
                if (jVar != C6903j.f9091c) {
                    C6903j jVar2 = new C6903j();
                    do {
                        jVar2.mo39744a(jVar);
                        if (f9063g.mo39737c(this, jVar, jVar2)) {
                            do {
                                C6908f.m11992a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f9065b;
                                    if ((obj2 != null) && (!(obj2 instanceof C6899g))) {
                                        return m11956u(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m11937A(jVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m11937A(jVar2);
                        } else {
                            jVar = this.f9067d;
                        }
                    } while (jVar != C6903j.f9091c);
                }
                return m11956u(this.f9065b);
            }
            while (nanos > 0) {
                Object obj3 = this.f9065b;
                if ((obj3 != null) && (!(obj3 instanceof C6899g))) {
                    return m11956u(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(aVar).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(aVar);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f9065b instanceof C6894c;
    }

    public boolean isDone() {
        boolean z;
        Object obj = this.f9065b;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof C6899g)) & z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m11948l(sb);
        } else {
            m11949m(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public String mo39734y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo39731n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo39733x() {
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9065b;
            if ((obj2 != null) && (!(obj2 instanceof C6899g))) {
                return m11956u(obj2);
            }
            C6903j jVar = this.f9067d;
            if (jVar != C6903j.f9091c) {
                C6903j jVar2 = new C6903j();
                do {
                    jVar2.mo39744a(jVar);
                    if (f9063g.mo39737c(this, jVar, jVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9065b;
                            } else {
                                m11937A(jVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C6899g))));
                        return m11956u(obj);
                    }
                    jVar = this.f9067d;
                } while (jVar != C6903j.f9091c);
            }
            return m11956u(this.f9065b);
        }
        throw new InterruptedException();
    }
}
