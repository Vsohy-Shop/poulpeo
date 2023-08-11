package p466yf;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13074a;
import p404of.C13088o;

/* renamed from: yf.u1 */
/* compiled from: Interruptible.kt */
public final class C14037u1 {

    @C12739f(mo50609c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", mo50610f = "Interruptible.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: yf.u1$a */
    /* compiled from: Interruptible.kt */
    static final class C14038a extends C12746l implements C13088o<C13995l0, C12074d<? super T>, Object> {

        /* renamed from: h */
        int f22955h;

        /* renamed from: i */
        private /* synthetic */ Object f22956i;

        /* renamed from: j */
        final /* synthetic */ C13074a<T> f22957j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14038a(C13074a<? extends T> aVar, C12074d<? super C14038a> dVar) {
            super(2, dVar);
            this.f22957j = aVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C14038a aVar = new C14038a(this.f22957j, dVar);
            aVar.f22956i = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f22955h == 0) {
                C11910n.m25701b(obj);
                return C14037u1.m32559d(((C13995l0) this.f22956i).getCoroutineContext(), this.f22957j);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super T> dVar) {
            return ((C14038a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: b */
    public static final <T> Object m32557b(C12079g gVar, C13074a<? extends T> aVar, C12074d<? super T> dVar) {
        return C13970h.m32378g(gVar, new C14038a(aVar, (C12074d<? super C14038a>) null), dVar);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m32558c(C12079g gVar, C13074a aVar, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C12085h.f18916b;
        }
        return m32557b(gVar, aVar, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final <T> T m32559d(C12079g gVar, C13074a<? extends T> aVar) {
        C14051x2 x2Var;
        try {
            x2Var = new C14051x2(C13934b2.m32226n(gVar));
            x2Var.mo53818d();
            T invoke = aVar.invoke();
            x2Var.mo53816a();
            return invoke;
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        } catch (Throwable th) {
            x2Var.mo53816a();
            throw th;
        }
    }
}
