package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12774n;
import kotlin.jvm.internal.C12775o;
import p404of.C13089p;

/* compiled from: Transition.kt */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final <S> State<C1232Dp> animateDp(Transition<S> transition, C13089p<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<C1232Dp>> pVar, String str, C13089p<? super S, ? super Composer, ? super Integer, C1232Dp> pVar2, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(pVar2, "targetValueByState");
        composer.startReplaceableGroup(184732935);
        if ((i2 & 1) != 0) {
            pVar = TransitionKt$animateDp$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        TwoWayConverter<C1232Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C1232Dp.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<C1232Dp> createTransitionAnimation = createTransitionAnimation(transition, pVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), pVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), (FiniteAnimationSpec) pVar.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final <S> State<Float> animateFloat(Transition<S> transition, C13089p<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> pVar, String str, C13089p<? super S, ? super Composer, ? super Integer, Float> pVar2, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(pVar2, "targetValueByState");
        composer.startReplaceableGroup(-1338768149);
        if ((i2 & 1) != 0) {
            pVar = TransitionKt$animateFloat$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C12763h.f20419a);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<Float> createTransitionAnimation = createTransitionAnimation(transition, pVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), pVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), (FiniteAnimationSpec) pVar.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final <S> State<Integer> animateInt(Transition<S> transition, C13089p<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> pVar, String str, C13089p<? super S, ? super Composer, ? super Integer, Integer> pVar2, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(pVar2, "targetValueByState");
        composer.startReplaceableGroup(1318902782);
        if ((i2 & 1) != 0) {
            pVar = TransitionKt$animateInt$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C12774n.f20424a);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<Integer> createTransitionAnimation = createTransitionAnimation(transition, pVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), pVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), (FiniteAnimationSpec) pVar.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final <S> State<IntOffset> animateIntOffset(Transition<S> transition, C13089p<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> pVar, String str, C13089p<? super S, ? super Composer, ? super Integer, IntOffset> pVar2, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(pVar2, "targetValueByState");
        composer.startReplaceableGroup(776131825);
        if ((i2 & 1) != 0) {
            pVar = TransitionKt$animateIntOffset$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<IntOffset> createTransitionAnimation = createTransitionAnimation(transition, pVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), pVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), (FiniteAnimationSpec) pVar.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final <S> State<IntSize> animateIntSize(Transition<S> transition, C13089p<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> pVar, String str, C13089p<? super S, ? super Composer, ? super Integer, IntSize> pVar2, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(pVar2, "targetValueByState");
        composer.startReplaceableGroup(-2104123233);
        if ((i2 & 1) != 0) {
            pVar = TransitionKt$animateIntSize$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<IntSize> createTransitionAnimation = createTransitionAnimation(transition, pVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), pVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), (FiniteAnimationSpec) pVar.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final <S> State<Offset> animateOffset(Transition<S> transition, C13089p<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> pVar, String str, C13089p<? super S, ? super Composer, ? super Integer, Offset> pVar2, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(pVar2, "targetValueByState");
        composer.startReplaceableGroup(2078477582);
        if ((i2 & 1) != 0) {
            pVar = TransitionKt$animateOffset$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<Offset> createTransitionAnimation = createTransitionAnimation(transition, pVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), pVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), (FiniteAnimationSpec) pVar.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final <S> State<Rect> animateRect(Transition<S> transition, C13089p<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> pVar, String str, C13089p<? super S, ? super Composer, ? super Integer, Rect> pVar2, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(pVar2, "targetValueByState");
        composer.startReplaceableGroup(1496278239);
        if ((i2 & 1) != 0) {
            pVar = TransitionKt$animateRect$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        TwoWayConverter<Rect, AnimationVector4D> vectorConverter = VectorConvertersKt.getVectorConverter(Rect.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<Rect> createTransitionAnimation = createTransitionAnimation(transition, pVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), pVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), (FiniteAnimationSpec) pVar.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final <S> State<Size> animateSize(Transition<S> transition, C13089p<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> pVar, String str, C13089p<? super S, ? super Composer, ? super Integer, Size> pVar2, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(pVar2, "targetValueByState");
        composer.startReplaceableGroup(-802210820);
        if ((i2 & 1) != 0) {
            pVar = TransitionKt$animateSize$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<Size, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Size.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<Size> createTransitionAnimation = createTransitionAnimation(transition, pVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), pVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), (FiniteAnimationSpec) pVar.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final <S, T, V extends AnimationVector> State<T> animateValue(Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, C13089p<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> pVar, String str, C13089p<? super S, ? super Composer, ? super Integer, ? extends T> pVar2, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(twoWayConverter, "typeConverter");
        C12775o.m28639i(pVar2, "targetValueByState");
        composer.startReplaceableGroup(-142660079);
        if ((i2 & 2) != 0) {
            pVar = TransitionKt$animateValue$1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i3 = (i >> 9) & 112;
        Transition<S> transition2 = transition;
        TwoWayConverter<T, V> twoWayConverter2 = twoWayConverter;
        State<T> createTransitionAnimation = createTransitionAnimation(transition2, pVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i3)), pVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i3)), (FiniteAnimationSpec) pVar.invoke(transition.getSegment(), composer, Integer.valueOf((i >> 3) & 112)), twoWayConverter2, str, composer, (i & 14) | (57344 & (i << 9)) | ((i << 6) & 458752));
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @ExperimentalTransitionApi
    @Composable
    public static final <S, T> Transition<T> createChildTransition(Transition<S> transition, String str, C13089p<? super S, ? super Composer, ? super Integer, ? extends T> pVar, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(pVar, "transformToChildState");
        composer.startReplaceableGroup(1215497572);
        if ((i2 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i3 = i & 14;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) transition);
        S rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        if (transition.isSeeking()) {
            rememberedValue = transition.getCurrentState();
        }
        int i4 = (i >> 3) & 112;
        Transition<T> createChildTransitionInternal = createChildTransitionInternal(transition, pVar.invoke(rememberedValue, composer, Integer.valueOf(i4)), pVar.invoke(transition.getTargetState(), composer, Integer.valueOf(i4)), str2, composer, i3 | ((i << 6) & 7168));
        composer.endReplaceableGroup();
        return createChildTransitionInternal;
    }

    @Composable
    public static final <S, T> Transition<T> createChildTransitionInternal(Transition<S> transition, T t, T t2, String str, Composer composer, int i) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(str, "childLabel");
        composer.startReplaceableGroup(-198307638);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            MutableTransitionState mutableTransitionState = new MutableTransitionState(t);
            rememberedValue = new Transition(mutableTransitionState, transition.getLabel() + " > " + str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition2 = (Transition) rememberedValue;
        EffectsKt.DisposableEffect((Object) transition2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new TransitionKt$createChildTransitionInternal$1(transition, transition2), composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t, t2, transition.getLastSeekedTimeNanos$animation_core_release());
        } else {
            transition2.updateTarget$animation_core_release(t2, composer, ((i >> 3) & 8) | ((i >> 6) & 14));
            transition2.setSeeking$animation_core_release(false);
        }
        composer.endReplaceableGroup();
        return transition2;
    }

    @InternalAnimationApi
    @Composable
    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i, int i2) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(twoWayConverter, "typeConverter");
        composer.startReplaceableGroup(-1714122528);
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition.DeferredAnimation(transition, twoWayConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) rememberedValue;
        EffectsKt.DisposableEffect((Object) deferredAnimation, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new TransitionKt$createDeferredAnimation$1(transition, deferredAnimation), composer, 8);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        composer.endReplaceableGroup();
        return deferredAnimation;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: androidx.compose.animation.core.Transition$TransitionAnimationState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: androidx.compose.animation.core.Transition$TransitionAnimationState} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x0032;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> createTransitionAnimation(androidx.compose.animation.core.Transition<S> r7, T r8, T r9, androidx.compose.animation.core.FiniteAnimationSpec<T> r10, androidx.compose.animation.core.TwoWayConverter<T, V> r11, java.lang.String r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            java.lang.String r14 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r7, r14)
            java.lang.String r14 = "animationSpec"
            kotlin.jvm.internal.C12775o.m28639i(r10, r14)
            java.lang.String r14 = "typeConverter"
            kotlin.jvm.internal.C12775o.m28639i(r11, r14)
            java.lang.String r14 = "label"
            kotlin.jvm.internal.C12775o.m28639i(r12, r14)
            r14 = -304821198(0xffffffffedd4cc32, float:-8.23221E27)
            r13.startReplaceableGroup(r14)
            r14 = 1157296644(0x44faf204, float:2007.563)
            r13.startReplaceableGroup(r14)
            boolean r14 = r13.changed((java.lang.Object) r7)
            java.lang.Object r0 = r13.rememberedValue()
            if (r14 != 0) goto L_0x0032
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r14 = r14.getEmpty()
            if (r0 != r14) goto L_0x0043
        L_0x0032:
            androidx.compose.animation.core.Transition$TransitionAnimationState r0 = new androidx.compose.animation.core.Transition$TransitionAnimationState
            androidx.compose.animation.core.AnimationVector r4 = androidx.compose.animation.core.AnimationStateKt.createZeroVectorFrom(r11, r9)
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r13.updateRememberedValue(r0)
        L_0x0043:
            r13.endReplaceableGroup()
            androidx.compose.animation.core.Transition$TransitionAnimationState r0 = (androidx.compose.animation.core.Transition.TransitionAnimationState) r0
            boolean r11 = r7.isSeeking()
            if (r11 == 0) goto L_0x0052
            r0.updateInitialAndTargetValue$animation_core_release(r8, r9, r10)
            goto L_0x0055
        L_0x0052:
            r0.updateTargetValue$animation_core_release(r9, r10)
        L_0x0055:
            androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1 r8 = new androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1
            r8.<init>(r7, r0)
            r7 = 0
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r8, (androidx.compose.runtime.Composer) r13, (int) r7)
            r13.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TransitionKt.createTransitionAnimation(androidx.compose.animation.core.Transition, java.lang.Object, java.lang.Object, androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.TwoWayConverter, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    @Composable
    public static final <T> Transition<T> updateTransition(T t, String str, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition(t, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(t, composer, (i & 8) | 48 | (i & 14));
        EffectsKt.DisposableEffect((Object) transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new TransitionKt$updateTransition$1(transition), composer, 6);
        composer.endReplaceableGroup();
        return transition;
    }

    @Composable
    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> mutableTransitionState, String str, Composer composer, int i, int i2) {
        C12775o.m28639i(mutableTransitionState, "transitionState");
        composer.startReplaceableGroup(882913843);
        if ((i2 & 2) != 0) {
            str = null;
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) mutableTransitionState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition(mutableTransitionState, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(mutableTransitionState.getTargetState(), composer, 0);
        EffectsKt.DisposableEffect((Object) transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new TransitionKt$updateTransition$2(transition), composer, 0);
        composer.endReplaceableGroup();
        return transition;
    }
}
