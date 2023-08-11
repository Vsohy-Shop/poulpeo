package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$slideInOut$1 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ String $labelPrefix;
    final /* synthetic */ State<Slide> $slideIn;
    final /* synthetic */ State<Slide> $slideOut;
    final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$slideInOut$1(Transition<EnterExitState> transition, State<Slide> state, State<Slide> state2, String str) {
        super(3);
        this.$transition = transition;
        this.$slideIn = state;
        this.$slideOut = state2;
        this.$labelPrefix = str;
    }

    /* renamed from: invoke$lambda-1  reason: not valid java name */
    private static final boolean m32857invoke$lambda1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: invoke$lambda-2  reason: not valid java name */
    private static final void m32858invoke$lambda2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(158379472);
        Transition<EnterExitState> transition = this.$transition;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (this.$transition.getCurrentState() == this.$transition.getTargetState() && !this.$transition.isSeeking()) {
            m32858invoke$lambda2(mutableState, false);
        } else if (!(this.$slideIn.getValue() == null && this.$slideOut.getValue() == null)) {
            m32858invoke$lambda2(mutableState, true);
        }
        if (m32857invoke$lambda1(mutableState)) {
            Transition<EnterExitState> transition2 = this.$transition;
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            String str = this.$labelPrefix;
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue2 = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = str + " slide";
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Transition.DeferredAnimation<IntOffset, AnimationVector2D> createDeferredAnimation = TransitionKt.createDeferredAnimation(transition2, vectorConverter, (String) rememberedValue2, composer, 448, 0);
            Transition<EnterExitState> transition3 = this.$transition;
            State<Slide> state = this.$slideIn;
            State<Slide> state2 = this.$slideOut;
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed((Object) transition3);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new SlideModifier(createDeferredAnimation, state, state2);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            modifier = modifier.then((SlideModifier) rememberedValue3);
        }
        composer.endReplaceableGroup();
        return modifier;
    }
}
