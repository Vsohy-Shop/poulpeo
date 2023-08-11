package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p002ui.unit.Velocity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
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

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", mo50610f = "Scrollable.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class ScrollableKt$pointerScrollable$3$1 extends C12746l implements C13089p<C13995l0, Velocity, C12074d<? super C11921v>, Object> {
    final /* synthetic */ MutableState<NestedScrollDispatcher> $nestedScrollDispatcher;
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;
    /* synthetic */ long J$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", mo50610f = "Scrollable.kt", mo50611l = {278}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1 */
    /* compiled from: Scrollable.kt */
    static final class C04151 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C04151(state, j, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                long j = j;
                this.label = 1;
                if (state.getValue().m33136onDragStoppedsFctU(j, this) == c) {
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
            return ((C04151) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableKt$pointerScrollable$3$1(MutableState<NestedScrollDispatcher> mutableState, State<ScrollingLogic> state, C12074d<? super ScrollableKt$pointerScrollable$3$1> dVar) {
        super(3, dVar);
        this.$nestedScrollDispatcher = mutableState;
        this.$scrollLogic = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m33130invokeLuvzFrg((C13995l0) obj, ((Velocity) obj2).m38702unboximpl(), (C12074d) obj3);
    }

    /* renamed from: invoke-LuvzFrg  reason: not valid java name */
    public final Object m33130invokeLuvzFrg(C13995l0 l0Var, long j, C12074d<? super C11921v> dVar) {
        ScrollableKt$pointerScrollable$3$1 scrollableKt$pointerScrollable$3$1 = new ScrollableKt$pointerScrollable$3$1(this.$nestedScrollDispatcher, this.$scrollLogic, dVar);
        scrollableKt$pointerScrollable$3$1.J$0 = j;
        return scrollableKt$pointerScrollable$3$1.invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            final long j = this.J$0;
            C13995l0 coroutineScope = this.$nestedScrollDispatcher.getValue().getCoroutineScope();
            final State<ScrollingLogic> state = this.$scrollLogic;
            C14054y1 unused2 = C13985j.m32422d(coroutineScope, (C12079g) null, (C14004n0) null, new C04151((C12074d<? super C04151>) null), 3, (Object) null);
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
