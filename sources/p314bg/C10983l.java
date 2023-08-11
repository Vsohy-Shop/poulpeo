package p314bg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p308ag.C10886a;
import p320cg.C11069g;
import p320cg.C11077k;
import p355hf.C12079g;

/* renamed from: bg.l */
/* compiled from: Context.kt */
final /* synthetic */ class C10983l {
    /* renamed from: a */
    public static final <T> C10962f<T> m23648a(C10962f<? extends T> fVar, int i, C10886a aVar) {
        boolean z;
        C10886a aVar2;
        int i2;
        boolean z2 = true;
        if (i >= 0 || i == -2 || i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == -1 && aVar != C10886a.SUSPEND) {
                z2 = false;
            }
            if (z2) {
                if (i == -1) {
                    aVar2 = C10886a.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    aVar2 = aVar;
                }
                if (fVar instanceof C11077k) {
                    return C11077k.C11078a.m23899a((C11077k) fVar, (C12079g) null, i2, aVar2, 1, (Object) null);
                }
                return new C11069g(fVar, (C12079g) null, i2, aVar2, 2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ C10962f m23649b(C10962f fVar, int i, C10886a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            aVar = C10886a.SUSPEND;
        }
        return C10971h.m23595b(fVar, i, aVar);
    }
}
