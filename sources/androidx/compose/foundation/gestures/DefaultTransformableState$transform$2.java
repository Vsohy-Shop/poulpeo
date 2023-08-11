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

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", mo50610f = "TransformableState.kt", mo50611l = {249}, mo50612m = "invokeSuspend")
/* compiled from: TransformableState.kt */
final class DefaultTransformableState$transform$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<TransformScope, C12074d<? super C11921v>, Object> $block;
    final /* synthetic */ MutatePriority $transformPriority;
    int label;
    final /* synthetic */ DefaultTransformableState this$0;

    @C12739f(mo50609c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", mo50610f = "TransformableState.kt", mo50611l = {252}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1 */
    /* compiled from: TransformableState.kt */
    static final class C04031 extends C12746l implements C13088o<TransformScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C04031 r0 = new C04031(defaultTransformableState, oVar, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(TransformScope transformScope, C12074d<? super C11921v> dVar) {
            return ((C04031) create(transformScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                TransformScope transformScope = (TransformScope) this.L$0;
                defaultTransformableState.isTransformingState.setValue(C12735b.m28558a(true));
                C13088o<TransformScope, C12074d<? super C11921v>, Object> oVar = oVar;
                this.label = 1;
                if (oVar.invoke(transformScope, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                try {
                    C11910n.m25701b(obj);
                } catch (Throwable th) {
                    defaultTransformableState.isTransformingState.setValue(C12735b.m28558a(false));
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultTransformableState.isTransformingState.setValue(C12735b.m28558a(false));
            return C11921v.f18618a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultTransformableState$transform$2(DefaultTransformableState defaultTransformableState, MutatePriority mutatePriority, C13088o<? super TransformScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super DefaultTransformableState$transform$2> dVar) {
        super(2, dVar);
        this.this$0 = defaultTransformableState;
        this.$transformPriority = mutatePriority;
        this.$block = oVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new DefaultTransformableState$transform$2(this.this$0, this.$transformPriority, this.$block, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            MutatorMutex access$getTransformMutex$p = this.this$0.transformMutex;
            TransformScope access$getTransformScope$p = this.this$0.transformScope;
            MutatePriority mutatePriority = this.$transformPriority;
            final DefaultTransformableState defaultTransformableState = this.this$0;
            final C13088o<TransformScope, C12074d<? super C11921v>, Object> oVar = this.$block;
            C04031 r4 = new C04031((C12074d<? super C04031>) null);
            this.label = 1;
            if (access$getTransformMutex$p.mutateWith(access$getTransformScope$p, mutatePriority, r4, this) == c) {
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
        return ((DefaultTransformableState$transform$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
