package androidx.compose.animation.core;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12774n;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p308ag.C10886a;
import p308ag.C10894d;
import p308ag.C10898g;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

/* compiled from: AnimateAsState.kt */
public final class AnimateAsStateKt {
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null);
    private static final SpringSpec<C1232Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, C1232Dp.m38466boximpl(VisibilityThresholdsKt.getVisibilityThreshold(C1232Dp.Companion)), 3, (Object) null);
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(C12774n.f20424a)), 3, (Object) null);
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, (Object) null);
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m38620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, (Object) null);
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m35411boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, (Object) null);
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, (Object) null);
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m35479boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, (Object) null);

    @Composable
    /* renamed from: animateDpAsState-Kz89ssw  reason: not valid java name */
    public static final State<C1232Dp> m32888animateDpAsStateKz89ssw(float f, AnimationSpec<C1232Dp> animationSpec, Function1<? super C1232Dp, C11921v> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(704104481);
        if ((i2 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec<C1232Dp> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        State<C1232Dp> animateValueAsState = animateValueAsState(C1232Dp.m38466boximpl(f), VectorConvertersKt.getVectorConverter(C1232Dp.Companion), animationSpec2, (C1232Dp) null, function1, composer, (i & 14) | ((i << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i << 6) & 57344), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: androidx.compose.animation.core.AnimationSpec<java.lang.Float>} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.State<java.lang.Float> animateFloatAsState(float r9, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r10, float r11, kotlin.jvm.functions.Function1<? super java.lang.Float, p336ef.C11921v> r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            r0 = 1091643291(0x4111279b, float:9.072169)
            r13.startReplaceableGroup(r0)
            r0 = r15 & 2
            if (r0 == 0) goto L_0x000c
            androidx.compose.animation.core.SpringSpec<java.lang.Float> r10 = defaultAnimation
        L_0x000c:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0013
            r11 = 1008981770(0x3c23d70a, float:0.01)
        L_0x0013:
            r15 = r15 & 8
            r0 = 0
            if (r15 == 0) goto L_0x001a
            r5 = r0
            goto L_0x001b
        L_0x001a:
            r5 = r12
        L_0x001b:
            r12 = 841393485(0x3226a54d, float:9.700057E-9)
            r13.startReplaceableGroup(r12)
            androidx.compose.animation.core.SpringSpec<java.lang.Float> r12 = defaultAnimation
            r15 = 3
            if (r10 != r12) goto L_0x0054
            java.lang.Float r10 = java.lang.Float.valueOf(r11)
            r12 = 1157296644(0x44faf204, float:2007.563)
            r13.startReplaceableGroup(r12)
            boolean r10 = r13.changed((java.lang.Object) r10)
            java.lang.Object r12 = r13.rememberedValue()
            if (r10 != 0) goto L_0x0042
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r12 != r10) goto L_0x004e
        L_0x0042:
            java.lang.Float r10 = java.lang.Float.valueOf(r11)
            r12 = 0
            androidx.compose.animation.core.SpringSpec r12 = androidx.compose.animation.core.AnimationSpecKt.spring$default(r12, r12, r10, r15, r0)
            r13.updateRememberedValue(r12)
        L_0x004e:
            r13.endReplaceableGroup()
            r10 = r12
            androidx.compose.animation.core.AnimationSpec r10 = (androidx.compose.animation.core.AnimationSpec) r10
        L_0x0054:
            r3 = r10
            r13.endReplaceableGroup()
            java.lang.Float r1 = java.lang.Float.valueOf(r9)
            kotlin.jvm.internal.h r9 = kotlin.jvm.internal.C12763h.f20419a
            androidx.compose.animation.core.TwoWayConverter r2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r9)
            java.lang.Float r4 = java.lang.Float.valueOf(r11)
            r9 = r14 & 14
            int r10 = r14 << 3
            r11 = r10 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r11
            r7 = r9 | r10
            r8 = 0
            r6 = r13
            androidx.compose.runtime.State r9 = animateValueAsState(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.endReplaceableGroup()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(float, androidx.compose.animation.core.AnimationSpec, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }

    @Composable
    public static final State<Integer> animateIntAsState(int i, AnimationSpec<Integer> animationSpec, Function1<? super Integer, C11921v> function1, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-842612981);
        if ((i3 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec<Integer> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<Integer> animateValueAsState = animateValueAsState(Integer.valueOf(i), VectorConvertersKt.getVectorConverter(C12774n.f20424a), animationSpec2, (Integer) null, function1, composer, (i2 & 14) | ((i2 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i2 << 6) & 57344), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateIntOffsetAsState-8f6pmRE  reason: not valid java name */
    public static final State<IntOffset> m32889animateIntOffsetAsState8f6pmRE(long j, AnimationSpec<IntOffset> animationSpec, Function1<? super IntOffset, C11921v> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1010307371);
        if ((i2 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec<IntOffset> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        State<IntOffset> animateValueAsState = animateValueAsState(IntOffset.m38577boximpl(j), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, (IntOffset) null, function1, composer, (i & 14) | ((i << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i << 6) & 57344), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateIntSizeAsState-zTRF_AQ  reason: not valid java name */
    public static final State<IntSize> m32890animateIntSizeAsStatezTRF_AQ(long j, AnimationSpec<IntSize> animationSpec, Function1<? super IntSize, C11921v> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1749239765);
        if ((i2 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec<IntSize> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        State<IntSize> animateValueAsState = animateValueAsState(IntSize.m38620boximpl(j), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, (IntSize) null, function1, composer, (i & 14) | ((i << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i << 6) & 57344), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateOffsetAsState-N6fFfp4  reason: not valid java name */
    public static final State<Offset> m32891animateOffsetAsStateN6fFfp4(long j, AnimationSpec<Offset> animationSpec, Function1<? super Offset, C11921v> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-456513133);
        if ((i2 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec<Offset> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        State<Offset> animateValueAsState = animateValueAsState(Offset.m35411boximpl(j), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, (Offset) null, function1, composer, (i & 14) | ((i << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i << 6) & 57344), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    public static final State<Rect> animateRectAsState(Rect rect, AnimationSpec<Rect> animationSpec, Function1<? super Rect, C11921v> function1, Composer composer, int i, int i2) {
        C12775o.m28639i(rect, "targetValue");
        composer.startReplaceableGroup(-782613967);
        if ((i2 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec<Rect> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        Rect rect2 = rect;
        State<Rect> animateValueAsState = animateValueAsState(rect2, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, (Rect) null, function1, composer, (i & 14) | ((i << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i << 6) & 57344), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateSizeAsState-LjSzlW0  reason: not valid java name */
    public static final State<Size> m32892animateSizeAsStateLjSzlW0(long j, AnimationSpec<Size> animationSpec, Function1<? super Size, C11921v> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(875212471);
        if ((i2 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec<Size> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        State<Size> animateValueAsState = animateValueAsState(Size.m35479boximpl(j), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, (Size) null, function1, composer, (i & 14) | ((i << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i << 6) & 57344), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    public static final <T, V extends AnimationVector> State<T> animateValueAsState(T t, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, T t2, Function1<? super T, C11921v> function1, Composer composer, int i, int i2) {
        AnimationSpec<T> animationSpec2;
        Function1<? super T, C11921v> function12;
        Composer composer2 = composer;
        C12775o.m28639i(twoWayConverter, "typeConverter");
        composer2.startReplaceableGroup(-846382129);
        if ((i2 & 4) != 0) {
            composer2.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, t2, 3, (Object) null);
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i2 & 16) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        composer2.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        Animatable animatable = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            Animatable animatable2 = new Animatable(t, twoWayConverter, (Object) null, 4, (DefaultConstructorMarker) null);
            composer2.updateRememberedValue(animatable2);
            animatable = animatable2;
        }
        composer.endReplaceableGroup();
        Animatable animatable3 = (Animatable) animatable;
        State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function12, composer2, (i >> 12) & 14);
        State<T> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpec2, composer2, (i >> 6) & 14);
        composer2.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = C10898g.m23419b(-1, (C10886a) null, (Function1) null, 6, (Object) null);
            composer2.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        C10894d dVar = (C10894d) rememberedValue3;
        EffectsKt.SideEffect(new AnimateAsStateKt$animateValueAsState$2(dVar, t), composer2, 0);
        EffectsKt.LaunchedEffect((Object) dVar, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new AnimateAsStateKt$animateValueAsState$3(dVar, animatable3, rememberUpdatedState2, rememberUpdatedState, (C12074d<? super AnimateAsStateKt$animateValueAsState$3>) null), composer2, 8);
        State<T> asState = animatable3.asState();
        composer.endReplaceableGroup();
        return asState;
    }

    /* access modifiers changed from: private */
    /* renamed from: animateValueAsState$lambda-3  reason: not valid java name */
    public static final <T> Function1<T, C11921v> m32893animateValueAsState$lambda3(State<? extends Function1<? super T, C11921v>> state) {
        return (Function1) state.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: animateValueAsState$lambda-4  reason: not valid java name */
    public static final <T> AnimationSpec<T> m32894animateValueAsState$lambda4(State<? extends AnimationSpec<T>> state) {
        return (AnimationSpec) state.getValue();
    }
}
