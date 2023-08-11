package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12085h;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1189:1\n474#2,4:1190\n478#2,2:1198\n482#2:1204\n25#3:1194\n1114#4,3:1195\n1117#4,3:1201\n474#5:1200\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2\n*L\n907#1:1190,4\n907#1:1198,2\n907#1:1204\n907#1:1194\n907#1:1195,3\n907#1:1201,3\n907#1:1200\n*E\n"})
/* compiled from: Slider.kt */
final class SliderKt$sliderTapModifier$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ DraggableState $draggableState;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ State<Function1<Float, C11921v>> $gestureEndAction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ State<Float> $rawOffset;

    @C12739f(mo50609c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", mo50610f = "Slider.kt", mo50611l = {909}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1 */
    /* compiled from: Slider.kt */
    static final class C07821 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C07821 r0 = new C07821(z, f, mutableState, state, coroutineScope, draggableState, state2, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
            return ((C07821) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                final boolean z = z;
                final float f = f;
                final MutableState<Float> mutableState = mutableState;
                final State<Float> state = state;
                C07831 r6 = new C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object>((C12074d<? super C07831>) null) {
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return m34105invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m35432unboximpl(), (C12074d) obj3);
                    }

                    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
                    public final Object m34105invoked4ec7I(PressGestureScope pressGestureScope, long j, C12074d<? super C11921v> dVar) {
                        C07831 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        SliderKt$sliderTapModifier$2(boolean z, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f, boolean z2, MutableState<Float> mutableState, State<Float> state, State<? extends Function1<? super Float, C11921v>> state2) {
                            super(3);
                            this.$enabled = z;
                            this.$draggableState = draggableState;
                            this.$interactionSource = mutableInteractionSource;
                            this.$maxPx = f;
                            this.$isRtl = z2;
                            this.$pressOffset = mutableState;
                            this.$rawOffset = state;
                            this.$gestureEndAction = state2;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                        }

                        @Composable
                        public final Modifier invoke(Modifier modifier, Composer composer, int i) {
                            C12775o.m28639i(modifier, "$this$composed");
                            composer.startReplaceableGroup(1945228890);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1945228890, i, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:904)");
                            }
                            if (this.$enabled) {
                                composer.startReplaceableGroup(773894976);
                                composer.startReplaceableGroup(-492369756);
                                Object rememberedValue = composer.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(C12085h.f18916b, composer));
                                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                composer.endReplaceableGroup();
                                final C13995l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                composer.endReplaceableGroup();
                                Object[] objArr = {this.$draggableState, this.$interactionSource, Float.valueOf(this.$maxPx), Boolean.valueOf(this.$isRtl)};
                                final boolean z = this.$isRtl;
                                final float f = this.$maxPx;
                                final MutableState<Float> mutableState = this.$pressOffset;
                                final State<Float> state = this.$rawOffset;
                                final DraggableState draggableState = this.$draggableState;
                                final State<Function1<Float, C11921v>> state2 = this.$gestureEndAction;
                                modifier = SuspendingPointerInputFilterKt.pointerInput(modifier, objArr, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new C07821((C12074d<? super C07821>) null));
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceableGroup();
                            return modifier;
                        }
                    }
