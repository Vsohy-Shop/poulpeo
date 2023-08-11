package p320cg;

import p308ag.C10886a;
import p314bg.C10962f;
import p355hf.C12079g;
import p355hf.C12085h;

/* renamed from: cg.k */
/* compiled from: ChannelFlow.kt */
public interface C11077k<T> extends C10962f<T> {

    /* renamed from: cg.k$a */
    /* compiled from: ChannelFlow.kt */
    public static final class C11078a {
        /* renamed from: a */
        public static /* synthetic */ C10962f m23899a(C11077k kVar, C12079g gVar, int i, C10886a aVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    gVar = C12085h.f18916b;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    aVar = C10886a.SUSPEND;
                }
                return kVar.mo46038a(gVar, i, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    /* renamed from: a */
    C10962f<T> mo46038a(C12079g gVar, int i, C10886a aVar);
}
