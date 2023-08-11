package p466yf;

import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;

/* renamed from: yf.n */
/* compiled from: CancellableContinuation.kt */
public interface C14002n<T> extends C12074d<T> {

    /* renamed from: yf.n$a */
    /* compiled from: CancellableContinuation.kt */
    public static final class C14003a {
        /* renamed from: a */
        public static /* synthetic */ boolean m32463a(C14002n nVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return nVar.mo49530j(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    /* renamed from: a */
    boolean mo49522a();

    /* renamed from: c */
    void mo49523c(C13971h0 h0Var, T t);

    /* renamed from: f */
    void mo49526f(Function1<? super Throwable, C11921v> function1);

    /* renamed from: h */
    Object mo49528h(T t, Object obj, Function1<? super Throwable, C11921v> function1);

    /* renamed from: i */
    void mo49529i(T t, Function1<? super Throwable, C11921v> function1);

    /* renamed from: j */
    boolean mo49530j(Throwable th);

    /* renamed from: o */
    void mo49531o(Object obj);
}
