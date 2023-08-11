package p331dg;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11822d0;
import p355hf.C12079g;
import p466yf.C14009n2;

@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,269:1\n252#2,4:270\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n225#1:270,4\n*E\n"})
/* renamed from: dg.d0 */
/* compiled from: ConcurrentLinkedList.kt */
public abstract class C11822d0<S extends C11822d0<S>> extends C11823e<S> implements C14009n2 {

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f18466e = AtomicIntegerFieldUpdater.newUpdater(C11822d0.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: d */
    public final long f18467d;

    public C11822d0(long j, S s, int i) {
        super(s);
        this.f18467d = j;
        this.cleanedAndPointers = i << 16;
    }

    /* renamed from: h */
    public boolean mo48983h() {
        if (f18466e.get(this) != mo45923n() || mo48990i()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean mo48984m() {
        if (f18466e.addAndGet(this, SupportMenu.CATEGORY_MASK) != mo45923n() || mo48990i()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public abstract int mo45923n();

    /* renamed from: o */
    public abstract void mo45924o(int i, Throwable th, C12079g gVar);

    /* renamed from: p */
    public final void mo48985p() {
        if (f18466e.incrementAndGet(this) == mo45923n()) {
            mo48992k();
        }
    }

    /* renamed from: q */
    public final boolean mo48986q() {
        int i;
        boolean z;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18466e;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != mo45923n() || mo48990i()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
