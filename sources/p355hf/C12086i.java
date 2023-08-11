package p355hf;

import androidx.concurrent.futures.C1248a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C12738e;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11907m;
import p362if.C12145a;

/* renamed from: hf.i */
/* compiled from: SafeContinuationJvm.kt */
public final class C12086i<T> implements C12074d<T>, C12738e {

    /* renamed from: c */
    private static final C12087a f18917c = new C12087a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater<C12086i<?>, Object> f18918d = AtomicReferenceFieldUpdater.newUpdater(C12086i.class, Object.class, "result");

    /* renamed from: b */
    private final C12074d<T> f18919b;
    private volatile Object result;

    /* renamed from: hf.i$a */
    /* compiled from: SafeContinuationJvm.kt */
    private static final class C12087a {
        private C12087a() {
        }

        public /* synthetic */ C12087a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12086i(C12074d<? super T> dVar, Object obj) {
        C12775o.m28639i(dVar, "delegate");
        this.f18919b = dVar;
        this.result = obj;
    }

    /* renamed from: b */
    public final Object mo49514b() {
        Object obj = this.result;
        C12145a aVar = C12145a.UNDECIDED;
        if (obj == aVar) {
            if (C1248a.m719a(f18918d, this, aVar, C12150d.m26492c())) {
                return C12150d.m26492c();
            }
            obj = this.result;
        }
        if (obj == C12145a.RESUMED) {
            return C12150d.m26492c();
        }
        if (!(obj instanceof C11907m.C11909b)) {
            return obj;
        }
        throw ((C11907m.C11909b) obj).f18601b;
    }

    public C12738e getCallerFrame() {
        C12074d<T> dVar = this.f18919b;
        if (dVar instanceof C12738e) {
            return (C12738e) dVar;
        }
        return null;
    }

    public C12079g getContext() {
        return this.f18919b.getContext();
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            C12145a aVar = C12145a.UNDECIDED;
            if (obj2 == aVar) {
                if (C1248a.m719a(f18918d, this, aVar, obj)) {
                    return;
                }
            } else if (obj2 != C12150d.m26492c()) {
                throw new IllegalStateException("Already resumed");
            } else if (C1248a.m719a(f18918d, this, C12150d.m26492c(), C12145a.RESUMED)) {
                this.f18919b.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f18919b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12086i(C12074d<? super T> dVar) {
        this(dVar, C12145a.UNDECIDED);
        C12775o.m28639i(dVar, "delegate");
    }
}
