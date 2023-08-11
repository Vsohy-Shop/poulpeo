package p331dg;

import androidx.concurrent.futures.C1248a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* renamed from: dg.b */
/* compiled from: Atomic.kt */
public abstract class C11817b<T> extends C11864z {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f18462a = AtomicReferenceFieldUpdater.newUpdater(C11817b.class, Object.class, "_consensus");
    private volatile Object _consensus = C11815a.f18460a;

    /* renamed from: c */
    private final Object m25421c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18462a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = C11815a.f18460a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (C1248a.m719a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    /* renamed from: a */
    public final Object mo48974a(Object obj) {
        Object obj2 = f18462a.get(this);
        if (obj2 == C11815a.f18460a) {
            obj2 = m25421c(mo48976d(obj));
        }
        mo48975b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo48975b(T t, Object obj);

    /* renamed from: d */
    public abstract Object mo48976d(T t);
}
