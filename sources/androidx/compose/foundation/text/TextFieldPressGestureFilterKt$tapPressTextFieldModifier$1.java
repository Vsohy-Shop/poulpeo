package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
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

@SourceDebugExtension({"SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,86:1\n474#2,4:87\n478#2,2:95\n482#2:101\n25#3:91\n25#3:102\n50#3:109\n49#3:110\n1114#4,3:92\n1117#4,3:98\n1114#4,6:103\n1114#4,6:111\n474#5:97\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n*L\n42#1:87,4\n42#1:95,2\n42#1:101\n42#1:91\n43#1:102\n45#1:109\n45#1:110\n42#1:92,3\n42#1:98,3\n43#1:103,6\n45#1:111,6\n42#1:97\n*E\n"})
/* compiled from: TextFieldPressGestureFilter.kt */
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Function1<Offset, C11921v> $onTap;

    @C12739f(mo50609c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", mo50610f = "TextFieldPressGestureFilter.kt", mo50611l = {55}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2 */
    /* compiled from: TextFieldPressGestureFilter.kt */
    static final class C06402 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C06402 r0 = new C06402(coroutineScope, mutableState, mutableInteractionSource3, rememberUpdatedState, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
            return ((C06402) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                final C13995l0 l0Var = coroutineScope;
                final MutableState<PressInteraction.Press> mutableState = mutableState;
                final MutableInteractionSource mutableInteractionSource = mutableInteractionSource3;
                C06411 r1 = new C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object>((C12074d<? super C06411>) null) {
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return m33724invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m35432unboximpl(), (C12074d) obj3);
                    }

                    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
                    public final Object m33724invoked4ec7I(PressGestureScope pressGestureScope, long j, C12074d<? super C11921v> dVar) {
                        C06411 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(Function1<? super Offset, C11921v> function1, MutableInteractionSource mutableInteractionSource) {
                            super(3);
                            this.$onTap = function1;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                        }

                        @Composable
                        public final Modifier invoke(Modifier modifier, Composer composer, int i) {
                            C12775o.m28639i(modifier, "$this$composed");
                            composer.startReplaceableGroup(-102778667);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-102778667, i, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                            }
                            composer.startReplaceableGroup(773894976);
                            composer.startReplaceableGroup(-492369756);
                            Object rememberedValue = composer.rememberedValue();
                            Composer.Companion companion = Composer.Companion;
                            if (rememberedValue == companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(C12085h.f18916b, composer));
                                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer.endReplaceableGroup();
                            final C13995l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            composer.endReplaceableGroup();
                            composer.startReplaceableGroup(-492369756);
                            Object rememberedValue2 = composer.rememberedValue();
                            if (rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                                composer.updateRememberedValue(rememberedValue2);
                            }
                            composer.endReplaceableGroup();
                            final MutableState mutableState = (MutableState) rememberedValue2;
                            final State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$onTap, composer, 0);
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            composer.startReplaceableGroup(511388516);
                            boolean changed = composer.changed((Object) mutableState) | composer.changed((Object) mutableInteractionSource);
                            Object rememberedValue3 = composer.rememberedValue();
                            if (changed || rememberedValue3 == companion.getEmpty()) {
                                rememberedValue3 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1(mutableState, mutableInteractionSource);
                                composer.updateRememberedValue(rememberedValue3);
                            }
                            composer.endReplaceableGroup();
                            EffectsKt.DisposableEffect((Object) mutableInteractionSource, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) (Function1) rememberedValue3, composer, 0);
                            Modifier.Companion companion2 = Modifier.Companion;
                            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion2, (Object) mutableInteractionSource2, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new C06402((C12074d<? super C06402>) null));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceableGroup();
                            return pointerInput;
                        }
                    }
