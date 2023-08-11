package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p002ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SingleValueAnimation.kt */
public final class SingleValueAnimationKt {
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null);

    /* renamed from: Animatable-8_81llA  reason: not valid java name */
    public static final Animatable<Color, AnimationVector4D> m32871Animatable8_81llA(long j) {
        return new Animatable(Color.m35661boximpl(j), ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m35675getColorSpaceimpl(j)), (Object) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* renamed from: animateColorAsState-KTwxG1Y  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.State<androidx.compose.p002ui.graphics.Color> m32872animateColorAsStateKTwxG1Y(long r8, androidx.compose.animation.core.AnimationSpec<androidx.compose.p002ui.graphics.Color> r10, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.graphics.Color, p336ef.C11921v> r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            r0 = -1942442407(0xffffffff8c38ae59, float:-1.422731E-31)
            r12.startReplaceableGroup(r0)
            r0 = r14 & 2
            if (r0 == 0) goto L_0x000c
            androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> r10 = colorDefaultSpring
        L_0x000c:
            r2 = r10
            r10 = r14 & 4
            if (r10 == 0) goto L_0x0012
            r11 = 0
        L_0x0012:
            r4 = r11
            androidx.compose.ui.graphics.colorspace.ColorSpace r10 = androidx.compose.p002ui.graphics.Color.m35675getColorSpaceimpl(r8)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r12.startReplaceableGroup(r11)
            boolean r10 = r12.changed((java.lang.Object) r10)
            java.lang.Object r11 = r12.rememberedValue()
            if (r10 != 0) goto L_0x002f
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r11 != r10) goto L_0x0043
        L_0x002f:
            androidx.compose.ui.graphics.Color$Companion r10 = androidx.compose.p002ui.graphics.Color.Companion
            kotlin.jvm.functions.Function1 r10 = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(r10)
            androidx.compose.ui.graphics.colorspace.ColorSpace r11 = androidx.compose.p002ui.graphics.Color.m35675getColorSpaceimpl(r8)
            java.lang.Object r10 = r10.invoke(r11)
            r11 = r10
            androidx.compose.animation.core.TwoWayConverter r11 = (androidx.compose.animation.core.TwoWayConverter) r11
            r12.updateRememberedValue(r11)
        L_0x0043:
            r12.endReplaceableGroup()
            r1 = r11
            androidx.compose.animation.core.TwoWayConverter r1 = (androidx.compose.animation.core.TwoWayConverter) r1
            androidx.compose.ui.graphics.Color r0 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r8)
            r3 = 0
            r8 = r13 & 14
            r8 = r8 | 576(0x240, float:8.07E-43)
            int r9 = r13 << 6
            r10 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r10
            r6 = r8 | r9
            r7 = 8
            r5 = r12
            androidx.compose.runtime.State r8 = androidx.compose.animation.core.AnimateAsStateKt.animateValueAsState(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.endReplaceableGroup()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(long, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }
}
