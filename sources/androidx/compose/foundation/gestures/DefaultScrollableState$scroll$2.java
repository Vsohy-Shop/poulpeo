package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", mo50610f = "ScrollableState.kt", mo50611l = {175}, mo50612m = "invokeSuspend")
/* compiled from: ScrollableState.kt */
final class DefaultScrollableState$scroll$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<ScrollScope, C12074d<? super C11921v>, Object> $block;
    final /* synthetic */ MutatePriority $scrollPriority;
    int label;
    final /* synthetic */ DefaultScrollableState this$0;

    @C12739f(mo50609c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", mo50610f = "ScrollableState.kt", mo50611l = {178}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1 */
    /* compiled from: ScrollableState.kt */
    static final class C04021 extends C12746l implements C13088o<ScrollScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C04021 r0 = new C04021(defaultScrollableState, oVar, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(ScrollScope scrollScope, C12074d<? super C11921v> dVar) {
            return ((C04021) create(scrollScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                ScrollScope scrollScope = (ScrollScope) this.L$0;
                defaultScrollableState.isScrollingState.setValue(C12735b.m28558a(true));
                C13088o<ScrollScope, C12074d<? super C11921v>, Object> oVar = oVar;
                this.label = 1;
                if (oVar.invoke(scrollScope, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                try {
                    C11910n.m25701b(obj);
                } catch (Throwable th) {
                    defaultScrollableState.isScrollingState.setValue(C12735b.m28558a(false));
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultScrollableState.isScrollingState.setValue(C12735b.m28558a(false));
            return C11921v.f18618a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultScrollableState$scroll$2(DefaultScrollableState defaultScrollableState, MutatePriority mutatePriority, C13088o<? super ScrollScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super DefaultScrollableState$scroll$2> dVar) {
        super(2, dVar);
        this.this$0 = defaultScrollableState;
        this.$scrollPriority = mutatePriority;
        this.$block = oVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new DefaultScrollableState$scroll$2(this.this$0, this.$scrollPriority, this.$block, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            MutatorMutex access$getScrollMutex$p = this.this$0.scrollMutex;
            ScrollScope access$getScrollScope$p = this.this$0.scrollScope;
            MutatePriority mutatePriority = this.$scrollPriority;
            final DefaultScrollableState defaultScrollableState = this.this$0;
            final C13088o<ScrollScope, C12074d<? super C11921v>, Object> oVar = this.$block;
            C04021 r4 = new C04021((C12074d<? super C04021>) null);
            this.label = 1;
            if (access$getScrollMutex$p.mutateWith(access$getScrollScope$p, mutatePriority, r4, this) == c) {
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
        return ((DefaultScrollableState$scroll$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
