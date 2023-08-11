package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,417:1\n135#2:418\n1#3:419\n154#4:420\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n*L\n142#1:418\n91#1:420\n*E\n"})
/* compiled from: BasicMarquee.kt */
public final class BasicMarqueeKt {
    private static final int DefaultMarqueeDelayMillis = 1200;
    private static final int DefaultMarqueeIterations = 3;
    private static final MarqueeSpacing DefaultMarqueeSpacing = MarqueeSpacing.Companion.fractionOfContainer(0.33333334f);
    private static final float DefaultMarqueeVelocity = C1232Dp.m38468constructorimpl((float) 30);

    @ExperimentalFoundationApi
    /* renamed from: MarqueeSpacing-0680j_4  reason: not valid java name */
    public static final MarqueeSpacing m32958MarqueeSpacing0680j_4(float f) {
        return new BasicMarqueeKt$MarqueeSpacing$1(f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* renamed from: basicMarquee-1Mj1MLw  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier m32960basicMarquee1Mj1MLw(androidx.compose.p002ui.Modifier r9, int r10, int r11, int r12, int r13, androidx.compose.foundation.MarqueeSpacing r14, float r15) {
        /*
            java.lang.String r0 = "$this$basicMarquee"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "spacing"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            boolean r0 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r0 == 0) goto L_0x001d
            androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0021
        L_0x001d:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0021:
            androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2 r8 = new androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2
            r1 = r8
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r15
            r6 = r14
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier r9 = androidx.compose.p002ui.ComposedModifierKt.composed(r9, r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicMarqueeKt.m32960basicMarquee1Mj1MLw(androidx.compose.ui.Modifier, int, int, int, int, androidx.compose.foundation.MarqueeSpacing, float):androidx.compose.ui.Modifier");
    }

    /* renamed from: basicMarquee-1Mj1MLw$default  reason: not valid java name */
    public static /* synthetic */ Modifier m32961basicMarquee1Mj1MLw$default(Modifier modifier, int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = DefaultMarqueeIterations;
        }
        if ((i5 & 2) != 0) {
            i2 = MarqueeAnimationMode.Companion.m33018getImmediatelyZbEOnfQ();
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = DefaultMarqueeDelayMillis;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            if (MarqueeAnimationMode.m33012equalsimpl0(i6, MarqueeAnimationMode.Companion.m33018getImmediatelyZbEOnfQ())) {
                i4 = i7;
            } else {
                i4 = 0;
            }
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            marqueeSpacing = DefaultMarqueeSpacing;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        if ((i5 & 32) != 0) {
            f = DefaultMarqueeVelocity;
        }
        return m32960basicMarquee1Mj1MLw(modifier, i, i6, i7, i8, marqueeSpacing2, f);
    }

    /* access modifiers changed from: private */
    /* renamed from: createMarqueeAnimationSpec-Z4HSEVQ  reason: not valid java name */
    public static final AnimationSpec<Float> m32962createMarqueeAnimationSpecZ4HSEVQ(int i, float f, int i2, int i3, float f2, Density density) {
        TweenSpec<Float> velocityBasedTween = velocityBasedTween(Math.abs(density.m38449toPx0680j_4(f2)), f, i3);
        long r3 = StartOffset.m32917constructorimpl$default((-i3) + i2, 0, 2, (DefaultConstructorMarker) null);
        if (i == Integer.MAX_VALUE) {
            return AnimationSpecKt.m32896infiniteRepeatable9IiC70o$default(velocityBasedTween, (RepeatMode) null, r3, 2, (Object) null);
        }
        return AnimationSpecKt.m32898repeatable91I0pcU$default(i, velocityBasedTween, (RepeatMode) null, r3, 4, (Object) null);
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeDelayMillis() {
        return DefaultMarqueeDelayMillis;
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeIterations() {
        return DefaultMarqueeIterations;
    }

    @ExperimentalFoundationApi
    public static final MarqueeSpacing getDefaultMarqueeSpacing() {
        return DefaultMarqueeSpacing;
    }

    @ExperimentalFoundationApi
    public static final float getDefaultMarqueeVelocity() {
        return DefaultMarqueeVelocity;
    }

    private static final TweenSpec<Float> velocityBasedTween(float f, float f2, int i) {
        return AnimationSpecKt.tween((int) ((float) Math.ceil((double) (f2 / (f / 1000.0f)))), i, EasingKt.getLinearEasing());
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeDelayMillis$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeIterations$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeSpacing$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeVelocity$annotations() {
    }
}
