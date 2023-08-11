package androidx.compose.animation;

import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;

/* compiled from: Transition.kt */
public final class TransitionKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0][0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> androidx.compose.runtime.State<androidx.compose.p002ui.graphics.Color> animateColor(androidx.compose.animation.core.Transition<S> r8, p404of.C13089p<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.p002ui.graphics.Color>> r9, java.lang.String r10, p404of.C13089p<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.p002ui.graphics.Color> r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "targetValueByState"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = -1939694975(0xffffffff8c629a81, float:-1.7456901E-31)
            r12.startReplaceableGroup(r0)
            r0 = r14 & 1
            if (r0 == 0) goto L_0x0016
            androidx.compose.animation.TransitionKt$animateColor$1 r9 = androidx.compose.animation.TransitionKt$animateColor$1.INSTANCE
        L_0x0016:
            r14 = r14 & 2
            if (r14 == 0) goto L_0x001c
            java.lang.String r10 = "ColorAnimation"
        L_0x001c:
            r5 = r10
            java.lang.Object r10 = r8.getTargetState()
            int r14 = r13 >> 6
            r14 = r14 & 112(0x70, float:1.57E-43)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r10 = r11.invoke(r10, r12, r14)
            androidx.compose.ui.graphics.Color r10 = (androidx.compose.p002ui.graphics.Color) r10
            long r0 = r10.m35681unboximpl()
            androidx.compose.ui.graphics.colorspace.ColorSpace r10 = androidx.compose.p002ui.graphics.Color.m35675getColorSpaceimpl(r0)
            r14 = 1157296644(0x44faf204, float:2007.563)
            r12.startReplaceableGroup(r14)
            boolean r14 = r12.changed((java.lang.Object) r10)
            java.lang.Object r0 = r12.rememberedValue()
            if (r14 != 0) goto L_0x004f
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r14 = r14.getEmpty()
            if (r0 != r14) goto L_0x005f
        L_0x004f:
            androidx.compose.ui.graphics.Color$Companion r14 = androidx.compose.p002ui.graphics.Color.Companion
            kotlin.jvm.functions.Function1 r14 = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(r14)
            java.lang.Object r10 = r14.invoke(r10)
            r0 = r10
            androidx.compose.animation.core.TwoWayConverter r0 = (androidx.compose.animation.core.TwoWayConverter) r0
            r12.updateRememberedValue(r0)
        L_0x005f:
            r12.endReplaceableGroup()
            r4 = r0
            androidx.compose.animation.core.TwoWayConverter r4 = (androidx.compose.animation.core.TwoWayConverter) r4
            r10 = r13 & 14
            r10 = r10 | 64
            int r13 = r13 << 3
            r14 = r13 & 896(0x380, float:1.256E-42)
            r10 = r10 | r14
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r14
            r10 = r10 | r13
            r13 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r12.startReplaceableGroup(r13)
            java.lang.Object r13 = r8.getCurrentState()
            int r0 = r10 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r11.invoke(r13, r12, r1)
            java.lang.Object r13 = r8.getTargetState()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r11.invoke(r13, r12, r0)
            androidx.compose.animation.core.Transition$Segment r11 = r8.getSegment()
            int r13 = r10 >> 3
            r13 = r13 & 112(0x70, float:1.57E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r9 = r9.invoke(r11, r12, r13)
            r3 = r9
            androidx.compose.animation.core.FiniteAnimationSpec r3 = (androidx.compose.animation.core.FiniteAnimationSpec) r3
            r9 = r10 & 14
            int r11 = r10 << 9
            r11 = r11 & r14
            r9 = r9 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            int r10 = r10 << 6
            r10 = r10 & r11
            r7 = r9 | r10
            r0 = r8
            r6 = r12
            androidx.compose.runtime.State r8 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.endReplaceableGroup()
            r12.endReplaceableGroup()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.TransitionKt.animateColor(androidx.compose.animation.core.Transition, of.p, java.lang.String, of.p, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }

    @Composable
    /* renamed from: animateColor-RIQooxk  reason: not valid java name */
    public static final State<Color> m32885animateColorRIQooxk(InfiniteTransition infiniteTransition, long j, long j2, InfiniteRepeatableSpec<Color> infiniteRepeatableSpec, Composer composer, int i) {
        C12775o.m28639i(infiniteTransition, "$this$animateColor");
        C12775o.m28639i(infiniteRepeatableSpec, "animationSpec");
        composer.startReplaceableGroup(1400583834);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m35675getColorSpaceimpl(j2));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InfiniteTransition infiniteTransition2 = infiniteTransition;
        State<Color> animateValue = InfiniteTransitionKt.animateValue(infiniteTransition2, Color.m35661boximpl(j), Color.m35661boximpl(j2), (TwoWayConverter) rememberedValue, infiniteRepeatableSpec, composer, InfiniteTransition.$stable | 4096 | (i & 14) | (i & 112) | (i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (InfiniteRepeatableSpec.$stable << 12) | ((i << 3) & 57344));
        composer.endReplaceableGroup();
        return animateValue;
    }
}
