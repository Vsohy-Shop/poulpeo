package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: Slider.kt */
final class SliderKt$Slider$3$gestureEndAction$1 extends C12777p implements Function1<Float, C11921v> {
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ C12757e0 $maxPx;
    final /* synthetic */ C12757e0 $minPx;
    final /* synthetic */ C13074a<C11921v> $onValueChangeFinished;
    final /* synthetic */ MutableState<Float> $rawOffset;
    final /* synthetic */ C13995l0 $scope;
    final /* synthetic */ List<Float> $tickFractions;

    @C12739f(mo50609c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", mo50610f = "Slider.kt", mo50611l = {212}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1 */
    /* compiled from: Slider.kt */
    static final class C07741 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C07741(sliderDraggableState, floatValue, access$snapValueToTick, f2, aVar2, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                SliderDraggableState sliderDraggableState = sliderDraggableState;
                float f = floatValue;
                float f2 = access$snapValueToTick;
                float f3 = f2;
                this.label = 1;
                if (SliderKt.animateToTarget(sliderDraggableState, f, f2, f3, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13074a<C11921v> aVar = aVar2;
            if (aVar != null) {
                aVar.invoke();
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C07741) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$3$gestureEndAction$1(MutableState<Float> mutableState, List<Float> list, C12757e0 e0Var, C12757e0 e0Var2, C13995l0 l0Var, SliderDraggableState sliderDraggableState, C13074a<C11921v> aVar) {
        super(1);
        this.$rawOffset = mutableState;
        this.$tickFractions = list;
        this.$minPx = e0Var;
        this.$maxPx = e0Var2;
        this.$scope = l0Var;
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(float f) {
        C13074a<C11921v> aVar;
        final float floatValue = this.$rawOffset.getValue().floatValue();
        final float access$snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx.f20408b, this.$maxPx.f20408b);
        if (!(floatValue == access$snapValueToTick)) {
            C13995l0 l0Var = this.$scope;
            final SliderDraggableState sliderDraggableState = this.$draggableState;
            final C13074a<C11921v> aVar2 = this.$onValueChangeFinished;
            final float f2 = f;
            C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C07741((C12074d<? super C07741>) null), 3, (Object) null);
        } else if (!this.$draggableState.isDragging() && (aVar = this.$onValueChangeFinished) != null) {
            aVar.invoke();
        }
    }
}
