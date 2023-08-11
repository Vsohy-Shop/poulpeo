package p314bg;

import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p320cg.C11069g;
import p331dg.C11828g0;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* renamed from: bg.z */
/* compiled from: SharedFlow.kt */
public final class C11033z {

    /* renamed from: a */
    public static final C11828g0 f17083a = new C11828g0("NO_VALUE");

    /* renamed from: a */
    public static final <T> C11024t<T> m23721a(int i, int i2, C10886a aVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i <= 0 && i2 <= 0 && aVar != C10886a.SUSPEND) {
                    z3 = false;
                }
                if (z3) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new C11029y(i, i3, aVar);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ C11024t m23722b(int i, int i2, C10886a aVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            aVar = C10886a.SUSPEND;
        }
        return m23721a(i, i2, aVar);
    }

    /* renamed from: e */
    public static final <T> C10962f<T> m23725e(C11028x<? extends T> xVar, C12079g gVar, int i, C10886a aVar) {
        if ((i == 0 || i == -3) && aVar == C10886a.SUSPEND) {
            return xVar;
        }
        return new C11069g(xVar, gVar, i, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final Object m23726f(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m23727g(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
