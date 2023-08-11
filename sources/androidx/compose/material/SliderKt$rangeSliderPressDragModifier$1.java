package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C13999m0;

@C12739f(mo50609c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", mo50610f = "Slider.kt", mo50611l = {982}, mo50612m = "invokeSuspend")
/* compiled from: Slider.kt */
final class SliderKt$rangeSliderPressDragModifier$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ State<Function1<Boolean, C11921v>> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ State<C13088o<Boolean, Float, C11921v>> $onDrag;
    final /* synthetic */ State<Float> $rawOffsetEnd;
    final /* synthetic */ State<Float> $rawOffsetStart;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", mo50610f = "Slider.kt", mo50611l = {983}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1 */
    /* compiled from: Slider.kt */
    static final class C07771 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C07771 r0 = new C07771(pointerInputScope, z, f, rangeSliderLogic2, state, state2, state3, state4, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                final C13995l0 l0Var = (C13995l0) this.L$0;
                PointerInputScope pointerInputScope = pointerInputScope;
                final boolean z = z;
                final float f = f;
                final RangeSliderLogic rangeSliderLogic = rangeSliderLogic2;
                final State<Float> state = state;
                final State<Function1<Boolean, C11921v>> state2 = state2;
                final State<Float> state3 = state3;
                final State<C13088o<Boolean, Float, C11921v>> state4 = state4;
                C07781 r3 = new C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object>((C12074d<? super C07781>) null) {
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;

                    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                        C07781 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        SliderKt$rangeSliderPressDragModifier$1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends C13088o<? super Boolean, ? super Float, C11921v>> state3, boolean z, float f, State<? extends Function1<? super Boolean, C11921v>> state4, C12074d<? super SliderKt$rangeSliderPressDragModifier$1> dVar) {
                            super(2, dVar);
                            this.$startInteractionSource = mutableInteractionSource;
                            this.$endInteractionSource = mutableInteractionSource2;
                            this.$rawOffsetStart = state;
                            this.$rawOffsetEnd = state2;
                            this.$onDrag = state3;
                            this.$isRtl = z;
                            this.$maxPx = f;
                            this.$gestureEndAction = state4;
                        }

                        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                            SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, dVar);
                            sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
                            return sliderKt$rangeSliderPressDragModifier$1;
                        }

                        public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
                            return ((SliderKt$rangeSliderPressDragModifier$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object c = C12150d.m26492c();
                            int i = this.label;
                            if (i == 0) {
                                C11910n.m25701b(obj);
                                final PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                                RangeSliderLogic rangeSliderLogic = new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag);
                                final boolean z = this.$isRtl;
                                final float f = this.$maxPx;
                                final State<Float> state = this.$rawOffsetStart;
                                final State<Function1<Boolean, C11921v>> state2 = this.$gestureEndAction;
                                final State<Float> state3 = this.$rawOffsetEnd;
                                final State<C13088o<Boolean, Float, C11921v>> state4 = this.$onDrag;
                                final RangeSliderLogic rangeSliderLogic2 = rangeSliderLogic;
                                C07771 r3 = new C07771((C12074d<? super C07771>) null);
                                this.label = 1;
                                if (C13999m0.m32451e(r3, this) == c) {
                                    return c;
                                }
                            } else if (i == 1) {
                                C11910n.m25701b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return C11921v.f18618a;
                        }
                    }
