package p308ag;

import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;

/* renamed from: ag.s */
/* compiled from: Channel.kt */
public interface C10915s<E> {

    /* renamed from: ag.s$a */
    /* compiled from: Channel.kt */
    public static final class C10916a {
        /* renamed from: a */
        public static /* synthetic */ boolean m23472a(C10915s sVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return sVar.mo45886e(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    /* renamed from: e */
    boolean mo45886e(Throwable th);

    /* renamed from: g */
    void mo45888g(Function1<? super Throwable, C11921v> function1);

    /* renamed from: l */
    Object mo45893l(E e, C12074d<? super C11921v> dVar);

    /* renamed from: m */
    Object mo45894m(E e);

    /* renamed from: n */
    boolean mo45895n();
}
