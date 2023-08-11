package p331dg;

import androidx.concurrent.futures.C1248a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11823e;

@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n107#1,7:270\n1#2:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n115#1:270,7\n*E\n"})
/* renamed from: dg.e */
/* compiled from: ConcurrentLinkedList.kt */
public abstract class C11823e<N extends C11823e<N>> {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f18468b;

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f18469c;
    private volatile Object _next;
    private volatile Object _prev;

    static {
        Class<C11823e> cls = C11823e.class;
        Class<Object> cls2 = Object.class;
        f18468b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f18469c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
    }

    public C11823e(N n) {
        this._prev = n;
    }

    /* renamed from: c */
    private final N m25442c() {
        N g = mo48989g();
        while (g != null && g.mo48983h()) {
            g = (C11823e) f18469c.get(g);
        }
        return g;
    }

    /* renamed from: d */
    private final N m25443d() {
        N e;
        N e2 = mo48988e();
        C12775o.m28636f(e2);
        while (e2.mo48983h() && (e = e2.mo48988e()) != null) {
            e2 = e;
        }
        return e2;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final Object m25444f() {
        return f18468b.get(this);
    }

    /* renamed from: b */
    public final void mo48987b() {
        f18469c.lazySet(this, (Object) null);
    }

    /* renamed from: e */
    public final N mo48988e() {
        N a = m25444f();
        if (a == C11821d.f18465a) {
            return null;
        }
        return (C11823e) a;
    }

    /* renamed from: g */
    public final N mo48989g() {
        return (C11823e) f18469c.get(this);
    }

    /* renamed from: h */
    public abstract boolean mo48983h();

    /* renamed from: i */
    public final boolean mo48990i() {
        if (mo48988e() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo48991j() {
        return C1248a.m719a(f18468b, this, (Object) null, C11821d.f18465a);
    }

    /* renamed from: k */
    public final void mo48992k() {
        Object obj;
        C11823e eVar;
        if (!mo48990i()) {
            while (true) {
                C11823e c = m25442c();
                C11823e d = m25443d();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18469c;
                do {
                    obj = atomicReferenceFieldUpdater.get(d);
                    if (((C11823e) obj) == null) {
                        eVar = null;
                    } else {
                        eVar = c;
                    }
                } while (!C1248a.m719a(atomicReferenceFieldUpdater, d, obj, eVar));
                if (c != null) {
                    f18468b.set(c, d);
                }
                if ((!d.mo48983h() || d.mo48990i()) && (c == null || !c.mo48983h())) {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean mo48993l(N n) {
        return C1248a.m719a(f18468b, this, (Object) null, n);
    }
}
