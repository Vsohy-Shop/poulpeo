package p343fg;

import androidx.concurrent.futures.C1248a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10903i;

@SourceDebugExtension({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,255:1\n90#2:256\n90#2:257\n90#2:258\n90#2:261\n90#2:262\n1#3:259\n25#4:260\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n95#1:256\n162#1:257\n185#1:258\n205#1:261\n249#1:262\n205#1:260\n*E\n"})
/* renamed from: fg.n */
/* compiled from: WorkQueue.kt */
public final class C12004n {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f18763b;

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f18764c;

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f18765d;

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f18766e;

    /* renamed from: a */
    private final AtomicReferenceArray<C11998h> f18767a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<C12004n> cls = C12004n.class;
        f18763b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f18764c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f18765d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f18766e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    private final C11998h m26067b(C11998h hVar) {
        if (m26069d() == 127) {
            return hVar;
        }
        boolean z = true;
        if (hVar.f18751c.mo49429b() != 1) {
            z = false;
        }
        if (z) {
            f18766e.incrementAndGet(this);
        }
        int i = f18764c.get(this) & 127;
        while (this.f18767a.get(i) != null) {
            Thread.yield();
        }
        this.f18767a.lazySet(i, hVar);
        f18764c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    private final void m26068c(C11998h hVar) {
        if (hVar != null) {
            boolean z = true;
            if (hVar.f18751c.mo49429b() != 1) {
                z = false;
            }
            if (z) {
                f18766e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: d */
    private final int m26069d() {
        return f18764c.get(this) - f18765d.get(this);
    }

    /* renamed from: i */
    private final C11998h m26070i() {
        C11998h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18765d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f18764c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.f18767a.getAndSet(i2, (Object) null)) != null) {
                m26068c(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m26071j(C11994d dVar) {
        C11998h i = m26070i();
        if (i == null) {
            return false;
        }
        dVar.mo49042a(i);
        return true;
    }

    /* renamed from: k */
    private final C11998h m26072k(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C11998h hVar;
        do {
            atomicReferenceFieldUpdater = f18763b;
            hVar = (C11998h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                boolean z2 = true;
                if (hVar.f18751c.mo49429b() != 1) {
                    z2 = false;
                }
                if (z2 == z) {
                }
            }
            int i = f18765d.get(this);
            int i2 = f18764c.get(this);
            while (i != i2) {
                if (z && f18766e.get(this) == 0) {
                    return null;
                }
                i2--;
                C11998h m = m26074m(i2, z);
                if (m != null) {
                    return m;
                }
            }
            return null;
        } while (!C1248a.m719a(atomicReferenceFieldUpdater, this, hVar, (Object) null));
        return hVar;
    }

    /* renamed from: l */
    private final C11998h m26073l(int i) {
        int i2 = f18765d.get(this);
        int i3 = f18764c.get(this);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        while (i2 != i3) {
            if (z && f18766e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            C11998h m = m26074m(i2, z);
            if (m != null) {
                return m;
            }
            i2 = i4;
        }
        return null;
    }

    /* renamed from: m */
    private final C11998h m26074m(int i, boolean z) {
        int i2 = i & 127;
        C11998h hVar = this.f18767a.get(i2);
        if (hVar != null) {
            boolean z2 = true;
            if (hVar.f18751c.mo49429b() != 1) {
                z2 = false;
            }
            if (z2 == z && C10903i.m23434a(this.f18767a, i2, hVar, (Object) null)) {
                if (z) {
                    f18766e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: o */
    private final long m26075o(int i, Ref$ObjectRef<C11998h> ref$ObjectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        T t;
        boolean z;
        do {
            atomicReferenceFieldUpdater = f18763b;
            t = (C11998h) atomicReferenceFieldUpdater.get(this);
            if (t == null) {
                return -2;
            }
            int i2 = 1;
            if (t.f18751c.mo49429b() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i2 = 2;
            }
            if ((i2 & i) == 0) {
                return -2;
            }
            long a = C12002l.f18759f.mo49426a() - t.f18750b;
            long j = C12002l.f18755b;
            if (a < j) {
                return j - a;
            }
        } while (!C1248a.m719a(atomicReferenceFieldUpdater, this, t, (Object) null));
        ref$ObjectRef.f20403b = t;
        return -1;
    }

    /* renamed from: a */
    public final C11998h mo49432a(C11998h hVar, boolean z) {
        if (z) {
            return m26067b(hVar);
        }
        C11998h hVar2 = (C11998h) f18763b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return m26067b(hVar2);
    }

    /* renamed from: e */
    public final int mo49433e() {
        if (f18763b.get(this) != null) {
            return m26069d() + 1;
        }
        return m26069d();
    }

    /* renamed from: f */
    public final void mo49434f(C11994d dVar) {
        C11998h hVar = (C11998h) f18763b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.mo49042a(hVar);
        }
        do {
        } while (m26071j(dVar));
    }

    /* renamed from: g */
    public final C11998h mo49435g() {
        C11998h hVar = (C11998h) f18763b.getAndSet(this, (Object) null);
        if (hVar == null) {
            return m26070i();
        }
        return hVar;
    }

    /* renamed from: h */
    public final C11998h mo49436h() {
        return m26072k(true);
    }

    /* renamed from: n */
    public final long mo49437n(int i, Ref$ObjectRef<C11998h> ref$ObjectRef) {
        T t;
        if (i == 3) {
            t = m26070i();
        } else {
            t = m26073l(i);
        }
        if (t == null) {
            return m26075o(i, ref$ObjectRef);
        }
        ref$ObjectRef.f20403b = t;
        return -1;
    }
}
