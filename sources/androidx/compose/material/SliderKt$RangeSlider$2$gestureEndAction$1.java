package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p436tf.C13522b;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: Slider.kt */
final class SliderKt$RangeSlider$2$gestureEndAction$1 extends C12777p implements Function1<Boolean, C11921v> {
    final /* synthetic */ C12757e0 $maxPx;
    final /* synthetic */ C12757e0 $minPx;
    final /* synthetic */ C13074a<C11921v> $onValueChangeFinished;
    final /* synthetic */ State<Function1<C13522b<Float>, C11921v>> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
    final /* synthetic */ MutableState<Float> $rawOffsetStart;
    final /* synthetic */ C13995l0 $scope;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ C13522b<Float> $valueRange;

    @C12739f(mo50609c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", mo50610f = "Slider.kt", mo50611l = {360}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1 */
    /* compiled from: Slider.kt */
    static final class C07711 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C07711(floatValue, access$snapValueToTick, aVar2, z2, mutableState, mutableState2, state, e0Var, e0Var2, bVar, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                Animatable Animatable$default = AnimatableKt.Animatable$default(floatValue, 0.0f, 2, (Object) null);
                Float b = C12735b.m28559b(access$snapValueToTick);
                TweenSpec access$getSliderToTickAnimation$p = SliderKt.SliderToTickAnimation;
                Float b2 = C12735b.m28559b(0.0f);
                final boolean z = z2;
                final MutableState<Float> mutableState = mutableState;
                final MutableState<Float> mutableState2 = mutableState2;
                final State<Function1<C13522b<Float>, C11921v>> state = state;
                final C12757e0 e0Var = e0Var;
                final C12757e0 e0Var2 = e0Var2;
                final C13522b<Float> bVar = bVar;
                C07721 r8 = new Function1<Animatable<Float, AnimationVector1D>, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Animatable<Float, AnimationVector1D>) (Animatable) obj);
                        return C11921v.f18618a;
                    }

                    public final void invoke(Animatable<Float, AnimationVector1D> animatable) {
                        C12775o.m28639i(animatable, "$this$animateTo");
                        (z ? mutableState : mutableState2).setValue(animatable.getValue());
                        state.getValue().invoke(SliderKt$RangeSlider$2.invoke$scaleToUserValue(e0Var, e0Var2, bVar, C13536k.m30875b(mutableState.getValue().floatValue(), mutableState2.getValue().floatValue())));
                    }
                };
                this.label = 1;
                if (Animatable$default.animateTo(b, access$getSliderToTickAnimation$p, b2, r8, this) == c) {
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
            return ((C07711) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSlider$2$gestureEndAction$1(MutableState<Float> mutableState, MutableState<Float> mutableState2, List<Float> list, C12757e0 e0Var, C12757e0 e0Var2, C13074a<C11921v> aVar, C13995l0 l0Var, State<? extends Function1<? super C13522b<Float>, C11921v>> state, C13522b<Float> bVar) {
        super(1);
        this.$rawOffsetStart = mutableState;
        this.$rawOffsetEnd = mutableState2;
        this.$tickFractions = list;
        this.$minPx = e0Var;
        this.$maxPx = e0Var2;
        this.$onValueChangeFinished = aVar;
        this.$scope = l0Var;
        this.$onValueChangeState = state;
        this.$valueRange = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C11921v.f18618a;
    }

    public final void invoke(boolean z) {
        final float floatValue = (z ? this.$rawOffsetStart : this.$rawOffsetEnd).getValue().floatValue();
        final float access$snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx.f20408b, this.$maxPx.f20408b);
        if (floatValue == access$snapValueToTick) {
            C13074a<C11921v> aVar = this.$onValueChangeFinished;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        C13995l0 l0Var = this.$scope;
        final C13074a<C11921v> aVar2 = this.$onValueChangeFinished;
        final MutableState<Float> mutableState = this.$rawOffsetStart;
        final MutableState<Float> mutableState2 = this.$rawOffsetEnd;
        final State<Function1<C13522b<Float>, C11921v>> state = this.$onValueChangeState;
        final C12757e0 e0Var = this.$minPx;
        final C12757e0 e0Var2 = this.$maxPx;
        final C13522b<Float> bVar = this.$valueRange;
        final boolean z2 = z;
        C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C07711((C12074d<? super C07711>) null), 3, (Object) null);
    }
}
