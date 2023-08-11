package p308ag;

import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* renamed from: ag.g */
/* compiled from: Channel.kt */
public final class C10898g {
    /* renamed from: a */
    public static final <E> C10894d<E> m23418a(int i, C10886a aVar, Function1<? super E, C11921v> function1) {
        C10894d<E> mVar;
        if (i != -2) {
            boolean z = false;
            if (i == -1) {
                if (aVar == C10886a.SUSPEND) {
                    z = true;
                }
                if (z) {
                    return new C10907m(1, C10886a.DROP_OLDEST, function1);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            } else if (i != 0) {
                if (i == Integer.MAX_VALUE) {
                    return new C10887b(Integer.MAX_VALUE, function1);
                }
                if (aVar == C10886a.SUSPEND) {
                    return new C10887b(i, function1);
                }
                return new C10907m(i, aVar, function1);
            } else if (aVar == C10886a.SUSPEND) {
                mVar = new C10887b<>(0, function1);
            } else {
                mVar = new C10907m<>(1, aVar, function1);
            }
        } else if (aVar == C10886a.SUSPEND) {
            mVar = new C10887b<>(C10894d.f16814L.mo45908a(), function1);
        } else {
            mVar = new C10907m<>(1, aVar, function1);
        }
        return mVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C10894d m23419b(int i, C10886a aVar, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            aVar = C10886a.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return m23418a(i, aVar, function1);
    }
}
