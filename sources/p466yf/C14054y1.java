package p466yf;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p448vf.C13650g;

/* renamed from: yf.y1 */
/* compiled from: Job.kt */
public interface C14054y1 extends C12079g.C12082b {

    /* renamed from: b0 */
    public static final C14056b f22970b0 = C14056b.f22971b;

    /* renamed from: yf.y1$a */
    /* compiled from: Job.kt */
    public static final class C14055a {
        /* renamed from: a */
        public static /* synthetic */ void m32600a(C14054y1 y1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                y1Var.cancel(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static <R> R m32601b(C14054y1 y1Var, R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
            return C12079g.C12082b.C12083a.m26262a(y1Var, r, oVar);
        }

        /* renamed from: c */
        public static <E extends C12079g.C12082b> E m32602c(C14054y1 y1Var, C12079g.C12084c<E> cVar) {
            return C12079g.C12082b.C12083a.m26263b(y1Var, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ C13943d1 m32603d(C14054y1 y1Var, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return y1Var.mo53717k(z, z2, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static C12079g m32604e(C14054y1 y1Var, C12079g.C12084c<?> cVar) {
            return C12079g.C12082b.C12083a.m26264c(y1Var, cVar);
        }

        /* renamed from: f */
        public static C12079g m32605f(C14054y1 y1Var, C12079g gVar) {
            return C12079g.C12082b.C12083a.m26265d(y1Var, gVar);
        }
    }

    /* renamed from: yf.y1$b */
    /* compiled from: Job.kt */
    public static final class C14056b implements C12079g.C12084c<C14054y1> {

        /* renamed from: b */
        static final /* synthetic */ C14056b f22971b = new C14056b();

        private C14056b() {
        }
    }

    /* renamed from: A */
    CancellationException mo53700A();

    /* renamed from: G */
    Object mo53703G(C12074d<? super C11921v> dVar);

    /* renamed from: O */
    C13943d1 mo53704O(Function1<? super Throwable, C11921v> function1);

    /* renamed from: a */
    boolean mo45937a();

    void cancel(CancellationException cancellationException);

    C13650g<C14054y1> getChildren();

    C14054y1 getParent();

    /* renamed from: j0 */
    boolean mo53716j0();

    /* renamed from: k */
    C13943d1 mo53717k(boolean z, boolean z2, Function1<? super Throwable, C11921v> function1);

    /* renamed from: p0 */
    C14030t mo53718p0(C14040v vVar);

    boolean start();
}
