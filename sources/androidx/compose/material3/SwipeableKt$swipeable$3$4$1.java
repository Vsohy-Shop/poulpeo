package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@C12739f(mo50609c = "androidx.compose.material3.SwipeableKt$swipeable$3$4$1", mo50610f = "Swipeable.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Swipeable.kt */
final class SwipeableKt$swipeable$3$4$1 extends C12746l implements C13089p<C13995l0, Float, C12074d<? super C11921v>, Object> {
    final /* synthetic */ SwipeableState<T> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.material3.SwipeableKt$swipeable$3$4$1$1", mo50610f = "Swipeable.kt", mo50611l = {612}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SwipeableKt$swipeable$3$4$1$1 */
    /* compiled from: Swipeable.kt */
    static final class C09171 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C09171(swipeableState, f, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                SwipeableState<T> swipeableState = swipeableState;
                float f = f;
                this.label = 1;
                if (swipeableState.performFling$material3_release(f, this) == c) {
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
            return ((C09171) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableKt$swipeable$3$4$1(SwipeableState<T> swipeableState, C12074d<? super SwipeableKt$swipeable$3$4$1> dVar) {
        super(3, dVar);
        this.$state = swipeableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C13995l0) obj, ((Number) obj2).floatValue(), (C12074d<? super C11921v>) (C12074d) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            final float f = this.F$0;
            final SwipeableState<T> swipeableState = this.$state;
            C14054y1 unused2 = C13985j.m32422d((C13995l0) this.L$0, (C12079g) null, (C14004n0) null, new C09171((C12074d<? super C09171>) null), 3, (Object) null);
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, float f, C12074d<? super C11921v> dVar) {
        SwipeableKt$swipeable$3$4$1 swipeableKt$swipeable$3$4$1 = new SwipeableKt$swipeable$3$4$1(this.$state, dVar);
        swipeableKt$swipeable$3$4$1.L$0 = l0Var;
        swipeableKt$swipeable$3$4$1.F$0 = f;
        return swipeableKt$swipeable$3$4$1.invokeSuspend(C11921v.f18618a);
    }
}
