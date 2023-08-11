package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12775o;

/* compiled from: InfiniteTransition.kt */
public final class InfiniteTransitionKt {
    @Composable
    public static final State<Float> animateFloat(InfiniteTransition infiniteTransition, float f, float f2, InfiniteRepeatableSpec<Float> infiniteRepeatableSpec, Composer composer, int i) {
        C12775o.m28639i(infiniteTransition, "<this>");
        C12775o.m28639i(infiniteRepeatableSpec, "animationSpec");
        composer.startReplaceableGroup(469472752);
        State<Float> animateValue = animateValue(infiniteTransition, Float.valueOf(f), Float.valueOf(f2), VectorConvertersKt.getVectorConverter(C12763h.f20419a), infiniteRepeatableSpec, composer, (i & 112) | 8 | (i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i << 3) & 57344));
        composer.endReplaceableGroup();
        return animateValue;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState} */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> animateValue(androidx.compose.animation.core.InfiniteTransition r7, T r8, T r9, androidx.compose.animation.core.TwoWayConverter<T, V> r10, androidx.compose.animation.core.InfiniteRepeatableSpec<T> r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            java.lang.String r13 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r7, r13)
            java.lang.String r13 = "typeConverter"
            kotlin.jvm.internal.C12775o.m28639i(r10, r13)
            java.lang.String r13 = "animationSpec"
            kotlin.jvm.internal.C12775o.m28639i(r11, r13)
            r13 = -1695411770(0xffffffff9af211c6, float:-1.0011757E-22)
            r12.startReplaceableGroup(r13)
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r13)
            java.lang.Object r13 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r13 != r0) goto L_0x0035
            androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState r13 = new androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState
            r1 = r13
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r12.updateRememberedValue(r13)
        L_0x0035:
            r12.endReplaceableGroup()
            androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState r13 = (androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) r13
            androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1 r10 = new androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1
            r10.<init>(r8, r13, r9, r11)
            r8 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r10, r12, r8)
            androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2 r8 = new androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2
            r8.<init>(r7, r13)
            r7 = 6
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r13, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r8, (androidx.compose.runtime.Composer) r12, (int) r7)
            r12.endReplaceableGroup()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransitionKt.animateValue(androidx.compose.animation.core.InfiniteTransition, java.lang.Object, java.lang.Object, androidx.compose.animation.core.TwoWayConverter, androidx.compose.animation.core.InfiniteRepeatableSpec, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    @Composable
    public static final InfiniteTransition rememberInfiniteTransition(Composer composer, int i) {
        composer.startReplaceableGroup(-840193660);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InfiniteTransition();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InfiniteTransition infiniteTransition = (InfiniteTransition) rememberedValue;
        infiniteTransition.run$animation_core_release(composer, 8);
        composer.endReplaceableGroup();
        return infiniteTransition;
    }
}
