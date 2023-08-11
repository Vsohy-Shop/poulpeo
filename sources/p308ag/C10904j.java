package p308ag;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11822d0;
import p331dg.C11828g0;
import p331dg.C11862y;
import p336ef.C11921v;
import p355hf.C12079g;
import p466yf.C13945d3;

@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n1#2:3056\n*E\n"})
/* renamed from: ag.j */
/* compiled from: BufferedChannel.kt */
public final class C10904j<E> extends C11822d0<C10904j<E>> {

    /* renamed from: f */
    private final C10887b<E> f16822f;

    /* renamed from: g */
    private final AtomicReferenceArray f16823g = new AtomicReferenceArray(C10892c.f16795b * 2);

    public C10904j(long j, C10904j<E> jVar, C10887b<E> bVar, int i) {
        super(j, jVar, i);
        this.f16822f = bVar;
    }

    /* renamed from: z */
    private final void m23435z(int i, Object obj) {
        this.f16823g.lazySet(i * 2, obj);
    }

    /* renamed from: A */
    public final void mo45921A(int i, Object obj) {
        this.f16823g.set((i * 2) + 1, obj);
    }

    /* renamed from: B */
    public final void mo45922B(int i, E e) {
        m23435z(i, e);
    }

    /* renamed from: n */
    public int mo45923n() {
        return C10892c.f16795b;
    }

    /* renamed from: o */
    public void mo45924o(int i, Throwable th, C12079g gVar) {
        boolean z;
        C11828g0 g0Var;
        Function1<E, C11921v> function1;
        Function1<E, C11921v> function12;
        int i2 = C10892c.f16795b;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i -= i2;
        }
        Object v = mo45929v(i);
        while (true) {
            Object w = mo45930w(i);
            if ((w instanceof C13945d3) || (w instanceof C10917t)) {
                if (z) {
                    g0Var = C10892c.f16803j;
                } else {
                    g0Var = C10892c.f16804k;
                }
                if (mo45925r(i, w, g0Var)) {
                    mo45926s(i);
                    mo45931x(i, !z);
                    if (z && (function1 = mo45928u().f16783c) != null) {
                        C11862y.m25586b(function1, v, gVar);
                        return;
                    }
                    return;
                }
            } else if (w == C10892c.f16803j || w == C10892c.f16804k) {
                mo45926s(i);
            } else if (!(w == C10892c.f16800g || w == C10892c.f16799f)) {
                if (w != C10892c.f16802i && w != C10892c.f16797d && w != C10892c.m23405z()) {
                    throw new IllegalStateException(("unexpected state: " + w).toString());
                }
                return;
            }
        }
        mo45926s(i);
        if (z && (function12 = mo45928u().f16783c) != null) {
            C11862y.m25586b(function12, v, gVar);
        }
    }

    /* renamed from: r */
    public final boolean mo45925r(int i, Object obj, Object obj2) {
        return C10903i.m23434a(this.f16823g, (i * 2) + 1, obj, obj2);
    }

    /* renamed from: s */
    public final void mo45926s(int i) {
        m23435z(i, (Object) null);
    }

    /* renamed from: t */
    public final Object mo45927t(int i, Object obj) {
        return this.f16823g.getAndSet((i * 2) + 1, obj);
    }

    /* renamed from: u */
    public final C10887b<E> mo45928u() {
        C10887b<E> bVar = this.f16822f;
        C12775o.m28636f(bVar);
        return bVar;
    }

    /* renamed from: v */
    public final E mo45929v(int i) {
        return this.f16823g.get(i * 2);
    }

    /* renamed from: w */
    public final Object mo45930w(int i) {
        return this.f16823g.get((i * 2) + 1);
    }

    /* renamed from: x */
    public final void mo45931x(int i, boolean z) {
        if (z) {
            mo45928u().mo45875F0((this.f18467d * ((long) C10892c.f16795b)) + ((long) i));
        }
        mo48985p();
    }

    /* renamed from: y */
    public final E mo45932y(int i) {
        E v = mo45929v(i);
        mo45926s(i);
        return v;
    }
}
