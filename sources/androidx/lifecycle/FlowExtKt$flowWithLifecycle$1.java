package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p308ag.C10912p;
import p308ag.C10915s;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", mo50610f = "FlowExt.kt", mo50611l = {91}, mo50612m = "invokeSuspend")
/* compiled from: FlowExt.kt */
final class FlowExtKt$flowWithLifecycle$1 extends C12746l implements C13088o<C10912p<? super T>, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ C10962f<T> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", mo50610f = "FlowExt.kt", mo50611l = {92}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 */
    /* compiled from: FlowExt.kt */
    static final class C23301 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C23301(fVar, pVar2, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                C10962f<T> fVar = fVar;
                final C10912p<T> pVar = pVar2;
                C23311 r1 = new C10967g() {
                    public final Object emit(T t, C12074d<? super C11921v> dVar) {
                        Object l = pVar.mo45893l(t, dVar);
                        if (l == C12150d.m26492c()) {
                            return l;
                        }
                        return C11921v.f18618a;
                    }
                };
                this.label = 1;
                if (fVar.collect(r1, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C23301) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, C10962f<? extends T> fVar, C12074d<? super FlowExtKt$flowWithLifecycle$1> dVar) {
        super(2, dVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = fVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, dVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    public final Object invoke(C10912p<? super T> pVar, C12074d<? super C11921v> dVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(pVar, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        C10912p pVar;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final C10912p pVar2 = (C10912p) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            final C10962f<T> fVar = this.$this_flowWithLifecycle;
            C23301 r5 = new C23301((C12074d<? super C23301>) null);
            this.L$0 = pVar2;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) r5, (C12074d<? super C11921v>) this) == c) {
                return c;
            }
            pVar = pVar2;
        } else if (i == 1) {
            pVar = (C10912p) this.L$0;
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C10915s.C10916a.m23472a(pVar, (Throwable) null, 1, (Object) null);
        return C11921v.f18618a;
    }
}
