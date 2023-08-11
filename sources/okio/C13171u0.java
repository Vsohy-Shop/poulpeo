package okio;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C12775o;

/* renamed from: okio.u0 */
/* compiled from: SegmentPool.kt */
public final class C13171u0 {

    /* renamed from: a */
    public static final C13171u0 f20974a = new C13171u0();

    /* renamed from: b */
    private static final int f20975b = 65536;

    /* renamed from: c */
    private static final C13168t0 f20976c = new C13168t0(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    private static final int f20977d;

    /* renamed from: e */
    private static final AtomicReference<C13168t0>[] f20978e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f20977d = highestOneBit;
        AtomicReference<C13168t0>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f20978e = atomicReferenceArr;
    }

    private C13171u0() {
    }

    /* renamed from: a */
    private final AtomicReference<C13168t0> m29871a() {
        return f20978e[(int) (Thread.currentThread().getId() & (((long) f20977d) - 1))];
    }

    /* renamed from: b */
    public static final void m29872b(C13168t0 t0Var) {
        boolean z;
        AtomicReference<C13168t0> a;
        C13168t0 t0Var2;
        C13168t0 andSet;
        int i;
        C12775o.m28639i(t0Var, "segment");
        if (t0Var.f20972f == null && t0Var.f20973g == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!t0Var.f20970d && (andSet = a.getAndSet(t0Var2)) != (t0Var2 = f20976c)) {
            if (andSet != null) {
                i = andSet.f20969c;
            } else {
                i = 0;
            }
            if (i >= f20975b) {
                a.set(andSet);
                return;
            }
            t0Var.f20972f = andSet;
            t0Var.f20968b = 0;
            t0Var.f20969c = i + 8192;
            (a = f20974a.m29871a()).set(t0Var);
        }
    }

    /* renamed from: c */
    public static final C13168t0 m29873c() {
        AtomicReference<C13168t0> a = f20974a.m29871a();
        C13168t0 t0Var = f20976c;
        C13168t0 andSet = a.getAndSet(t0Var);
        if (andSet == t0Var) {
            return new C13168t0();
        }
        if (andSet == null) {
            a.set((Object) null);
            return new C13168t0();
        }
        a.set(andSet.f20972f);
        andSet.f20972f = null;
        andSet.f20969c = 0;
        return andSet;
    }
}
