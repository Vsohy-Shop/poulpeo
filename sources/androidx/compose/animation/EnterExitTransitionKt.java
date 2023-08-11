package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.TransformOrigin;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: EnterExitTransition.kt */
public final class EnterExitTransitionKt {
    private static final MutableState<Float> DefaultAlpha = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), (SnapshotMutationPolicy) null, 2, (Object) null);
    /* access modifiers changed from: private */
    public static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
    /* access modifiers changed from: private */
    public static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
    /* access modifiers changed from: private */
    public static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m38620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(EnterExitTransitionKt$TransformOriginVectorConverter$1.INSTANCE, EnterExitTransitionKt$TransformOriginVectorConverter$2.INSTANCE);

    /* compiled from: EnterExitTransition.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.compose.runtime.MutableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.compose.runtime.MutableState} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x034e  */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier createModifier(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r24, androidx.compose.animation.EnterTransition r25, androidx.compose.animation.ExitTransition r26, java.lang.String r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "enter"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "exit"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = 914000546(0x367a8aa2, float:3.7333598E-6)
            r12.startReplaceableGroup(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.animation.TransitionData r1 = r25.getData$animation_release()
            androidx.compose.animation.Slide r1 = r1.getSlide()
            r2 = 0
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r1, r12, r2)
            androidx.compose.animation.TransitionData r3 = r26.getData$animation_release()
            androidx.compose.animation.Slide r3 = r3.getSlide()
            androidx.compose.runtime.State r3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r3, r12, r2)
            androidx.compose.ui.Modifier r0 = slideInOut(r0, r8, r1, r3, r11)
            androidx.compose.animation.TransitionData r1 = r25.getData$animation_release()
            androidx.compose.animation.ChangeSize r1 = r1.getChangeSize()
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r1, r12, r2)
            androidx.compose.animation.TransitionData r3 = r26.getData$animation_release()
            androidx.compose.animation.ChangeSize r3 = r3.getChangeSize()
            androidx.compose.runtime.State r3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r3, r12, r2)
            androidx.compose.ui.Modifier r13 = shrinkExpand(r0, r8, r1, r3, r11)
            r14 = r29 & 14
            r0 = 1157296644(0x44faf204, float:2007.563)
            r12.startReplaceableGroup(r0)
            boolean r1 = r12.changed((java.lang.Object) r8)
            java.lang.Object r3 = r28.rememberedValue()
            r15 = 2
            r7 = 0
            if (r1 != 0) goto L_0x007b
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x0084
        L_0x007b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, r7, r15, r7)
            r12.updateRememberedValue(r3)
        L_0x0084:
            r28.endReplaceableGroup()
            r6 = r3
            androidx.compose.runtime.MutableState r6 = (androidx.compose.runtime.MutableState) r6
            r12.startReplaceableGroup(r0)
            boolean r0 = r12.changed((java.lang.Object) r8)
            java.lang.Object r1 = r28.rememberedValue()
            if (r0 != 0) goto L_0x009f
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00a8
        L_0x009f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r7, r15, r7)
            r12.updateRememberedValue(r1)
        L_0x00a8:
            r28.endReplaceableGroup()
            r5 = r1
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            java.lang.Object r0 = r24.getCurrentState()
            java.lang.Object r1 = r24.getTargetState()
            r4 = 1
            if (r0 != r1) goto L_0x00c6
            boolean r0 = r24.isSeeking()
            if (r0 != 0) goto L_0x00c6
            m32838createModifier$lambda2(r6, r2)
            m32840createModifier$lambda5(r5, r2)
            goto L_0x00f4
        L_0x00c6:
            androidx.compose.animation.TransitionData r0 = r25.getData$animation_release()
            androidx.compose.animation.Fade r0 = r0.getFade()
            if (r0 != 0) goto L_0x00da
            androidx.compose.animation.TransitionData r0 = r26.getData$animation_release()
            androidx.compose.animation.Fade r0 = r0.getFade()
            if (r0 == 0) goto L_0x00dd
        L_0x00da:
            m32838createModifier$lambda2(r6, r4)
        L_0x00dd:
            androidx.compose.animation.TransitionData r0 = r25.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 != 0) goto L_0x00f1
            androidx.compose.animation.TransitionData r0 = r26.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x00f4
        L_0x00f1:
            m32840createModifier$lambda5(r5, r4)
        L_0x00f4:
            r0 = 1657240548(0x62c77be4, float:1.8399147E21)
            r12.startReplaceableGroup(r0)
            boolean r0 = m32835createModifier$lambda1(r6)
            r3 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r16 = 458752(0x70000, float:6.42848E-40)
            r1 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r17 = 57344(0xe000, float:8.0356E-41)
            r15 = 3
            r18 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0228
            androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2
            r0.<init>(r9, r10)
            r12.startReplaceableGroup(r2)
            java.lang.Object r2 = r28.rememberedValue()
            androidx.compose.runtime.Composer$Companion r20 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r20.getEmpty()
            if (r2 != r7) goto L_0x0139
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r7 = " alpha"
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r12.updateRememberedValue(r2)
        L_0x0139:
            r28.endReplaceableGroup()
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r2 = r14 | 384(0x180, float:5.38E-43)
            r12.startReplaceableGroup(r3)
            kotlin.jvm.internal.h r20 = kotlin.jvm.internal.C12763h.f20419a
            androidx.compose.animation.core.TwoWayConverter r20 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r20)
            r22 = r2 & 14
            int r2 = r2 << r15
            r3 = r2 & 896(0x380, float:1.256E-42)
            r3 = r22 | r3
            r15 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r15
            r2 = r2 & r17
            r2 = r2 | r3
            r12.startReplaceableGroup(r1)
            java.lang.Object r3 = r24.getCurrentState()
            androidx.compose.animation.EnterExitState r3 = (androidx.compose.animation.EnterExitState) r3
            r15 = 755689166(0x2d0ae6ce, float:7.895641E-12)
            r12.startReplaceableGroup(r15)
            int[] r23 = androidx.compose.animation.EnterExitTransitionKt.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r23[r3]
            if (r3 == r4) goto L_0x019a
            r1 = 2
            if (r3 == r1) goto L_0x018b
            r1 = 3
            if (r3 != r1) goto L_0x0185
            androidx.compose.animation.TransitionData r1 = r26.getData$animation_release()
            androidx.compose.animation.Fade r1 = r1.getFade()
            if (r1 == 0) goto L_0x019a
            float r1 = r1.getAlpha()
            goto L_0x019c
        L_0x0185:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x018b:
            androidx.compose.animation.TransitionData r1 = r25.getData$animation_release()
            androidx.compose.animation.Fade r1 = r1.getFade()
            if (r1 == 0) goto L_0x019a
            float r1 = r1.getAlpha()
            goto L_0x019c
        L_0x019a:
            r1 = r18
        L_0x019c:
            r28.endReplaceableGroup()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object r3 = r24.getTargetState()
            androidx.compose.animation.EnterExitState r3 = (androidx.compose.animation.EnterExitState) r3
            r12.startReplaceableGroup(r15)
            int r3 = r3.ordinal()
            r3 = r23[r3]
            if (r3 == r4) goto L_0x01de
            r15 = 2
            if (r3 == r15) goto L_0x01cf
            r15 = 3
            if (r3 != r15) goto L_0x01c9
            androidx.compose.animation.TransitionData r3 = r26.getData$animation_release()
            androidx.compose.animation.Fade r3 = r3.getFade()
            if (r3 == 0) goto L_0x01de
            float r3 = r3.getAlpha()
            goto L_0x01e0
        L_0x01c9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01cf:
            androidx.compose.animation.TransitionData r3 = r25.getData$animation_release()
            androidx.compose.animation.Fade r3 = r3.getFade()
            if (r3 == 0) goto L_0x01de
            float r3 = r3.getAlpha()
            goto L_0x01e0
        L_0x01de:
            r3 = r18
        L_0x01e0:
            r28.endReplaceableGroup()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.animation.core.Transition$Segment r15 = r24.getSegment()
            int r23 = r2 >> 3
            r23 = r23 & 112(0x70, float:1.57E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            java.lang.Object r0 = r0.invoke(r15, r12, r4)
            r4 = r0
            androidx.compose.animation.core.FiniteAnimationSpec r4 = (androidx.compose.animation.core.FiniteAnimationSpec) r4
            r0 = r2 & 14
            int r15 = r2 << 9
            r15 = r15 & r17
            r0 = r0 | r15
            int r2 = r2 << 6
            r2 = r2 & r16
            r15 = r0 | r2
            r0 = r24
            r2 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2 = r3
            r3 = r4
            r4 = r20
            r19 = r5
            r5 = r7
            r20 = r6
            r6 = r28
            r21 = 0
            r7 = r15
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r0, r1, r2, r3, r4, r5, r6, r7)
            r28.endReplaceableGroup()
            r28.endReplaceableGroup()
            goto L_0x0231
        L_0x0228:
            r8 = r2
            r19 = r5
            r20 = r6
            r21 = r7
            androidx.compose.runtime.MutableState<java.lang.Float> r0 = DefaultAlpha
        L_0x0231:
            r15 = r0
            r28.endReplaceableGroup()
            boolean r0 = m32839createModifier$lambda4(r19)
            if (r0 == 0) goto L_0x04b5
            androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2
            r0.<init>(r9, r10)
            r12.startReplaceableGroup(r8)
            java.lang.Object r1 = r28.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x0263
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = " scale"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r12.updateRememberedValue(r1)
        L_0x0263:
            r28.endReplaceableGroup()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r1 = r14 | 384(0x180, float:5.38E-43)
            r2 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r12.startReplaceableGroup(r2)
            kotlin.jvm.internal.h r2 = kotlin.jvm.internal.C12763h.f20419a
            androidx.compose.animation.core.TwoWayConverter r4 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r2)
            r2 = r1 & 14
            r3 = 3
            int r1 = r1 << r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r1 = r1 & r17
            r1 = r1 | r2
            r8 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r12.startReplaceableGroup(r8)
            java.lang.Object r2 = r24.getCurrentState()
            androidx.compose.animation.EnterExitState r2 = (androidx.compose.animation.EnterExitState) r2
            r3 = -596129937(0xffffffffdc77c76f, float:-2.78974395E17)
            r12.startReplaceableGroup(r3)
            int[] r11 = androidx.compose.animation.EnterExitTransitionKt.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r11[r2]
            r7 = 1
            if (r2 == r7) goto L_0x02cb
            r6 = 2
            if (r2 == r6) goto L_0x02bc
            r6 = 3
            if (r2 != r6) goto L_0x02b6
            androidx.compose.animation.TransitionData r2 = r26.getData$animation_release()
            androidx.compose.animation.Scale r2 = r2.getScale()
            if (r2 == 0) goto L_0x02cb
            float r2 = r2.getScale()
            goto L_0x02cd
        L_0x02b6:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02bc:
            androidx.compose.animation.TransitionData r2 = r25.getData$animation_release()
            androidx.compose.animation.Scale r2 = r2.getScale()
            if (r2 == 0) goto L_0x02cb
            float r2 = r2.getScale()
            goto L_0x02cd
        L_0x02cb:
            r2 = r18
        L_0x02cd:
            r28.endReplaceableGroup()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r6 = r24.getTargetState()
            androidx.compose.animation.EnterExitState r6 = (androidx.compose.animation.EnterExitState) r6
            r12.startReplaceableGroup(r3)
            int r3 = r6.ordinal()
            r3 = r11[r3]
            if (r3 == r7) goto L_0x030e
            r6 = 2
            if (r3 == r6) goto L_0x0300
            r6 = 3
            if (r3 != r6) goto L_0x02fa
            androidx.compose.animation.TransitionData r3 = r26.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x030e
            float r18 = r3.getScale()
            goto L_0x030e
        L_0x02fa:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0300:
            androidx.compose.animation.TransitionData r3 = r25.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x030e
            float r18 = r3.getScale()
        L_0x030e:
            r28.endReplaceableGroup()
            java.lang.Float r3 = java.lang.Float.valueOf(r18)
            androidx.compose.animation.core.Transition$Segment r6 = r24.getSegment()
            int r18 = r1 >> 3
            r18 = r18 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            java.lang.Object r0 = r0.invoke(r6, r12, r7)
            r6 = r0
            androidx.compose.animation.core.FiniteAnimationSpec r6 = (androidx.compose.animation.core.FiniteAnimationSpec) r6
            r0 = r1 & 14
            int r7 = r1 << 9
            r7 = r7 & r17
            r0 = r0 | r7
            int r1 = r1 << 6
            r1 = r1 & r16
            r7 = r0 | r1
            r0 = r24
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r28
            androidx.compose.runtime.State r7 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r0, r1, r2, r3, r4, r5, r6, r7)
            r28.endReplaceableGroup()
            r28.endReplaceableGroup()
            java.lang.Object r0 = r24.getCurrentState()
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter
            if (r0 != r1) goto L_0x036c
            androidx.compose.animation.TransitionData r0 = r25.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x0361
        L_0x0358:
            long r0 = r0.m32870getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r0 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r0)
            goto L_0x038c
        L_0x0361:
            androidx.compose.animation.TransitionData r0 = r26.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x038a
            goto L_0x0358
        L_0x036c:
            androidx.compose.animation.TransitionData r0 = r26.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x037f
        L_0x0376:
            long r0 = r0.m32870getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r0 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r0)
            goto L_0x038c
        L_0x037f:
            androidx.compose.animation.TransitionData r0 = r25.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x038a
            goto L_0x0376
        L_0x038a:
            r0 = r21
        L_0x038c:
            androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.TransformOrigin, androidx.compose.animation.core.AnimationVector2D> r4 = TransformOriginVectorConverter
            java.lang.String r5 = "TransformOriginInterruptionHandling"
            r1 = r14 | 3136(0xc40, float:4.394E-42)
            r12.startReplaceableGroup(r8)
            androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1 r2 = androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1.INSTANCE
            java.lang.Object r3 = r24.getCurrentState()
            androidx.compose.animation.EnterExitState r3 = (androidx.compose.animation.EnterExitState) r3
            r6 = -288165413(0xffffffffeed2f1db, float:-3.2642119E28)
            r12.startReplaceableGroup(r6)
            int r3 = r3.ordinal()
            r3 = r11[r3]
            r8 = 1
            if (r3 == r8) goto L_0x03f7
            r14 = 2
            if (r3 == r14) goto L_0x03d6
            r14 = 3
            if (r3 != r14) goto L_0x03d0
            androidx.compose.animation.TransitionData r3 = r26.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x03c5
        L_0x03bc:
            long r18 = r3.m32870getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r3 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r18)
            goto L_0x03f8
        L_0x03c5:
            androidx.compose.animation.TransitionData r3 = r25.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x03f4
            goto L_0x03bc
        L_0x03d0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03d6:
            androidx.compose.animation.TransitionData r3 = r25.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x03e9
        L_0x03e0:
            long r18 = r3.m32870getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r3 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r18)
            goto L_0x03f8
        L_0x03e9:
            androidx.compose.animation.TransitionData r3 = r26.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x03f4
            goto L_0x03e0
        L_0x03f4:
            r3 = r21
            goto L_0x03f8
        L_0x03f7:
            r3 = r0
        L_0x03f8:
            if (r3 == 0) goto L_0x03ff
            long r18 = r3.m36092unboximpl()
            goto L_0x0405
        L_0x03ff:
            androidx.compose.ui.graphics.TransformOrigin$Companion r3 = androidx.compose.p002ui.graphics.TransformOrigin.Companion
            long r18 = r3.m36093getCenterSzJe1aQ()
        L_0x0405:
            r28.endReplaceableGroup()
            androidx.compose.ui.graphics.TransformOrigin r3 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r18)
            java.lang.Object r14 = r24.getTargetState()
            androidx.compose.animation.EnterExitState r14 = (androidx.compose.animation.EnterExitState) r14
            r12.startReplaceableGroup(r6)
            int r6 = r14.ordinal()
            r6 = r11[r6]
            if (r6 == r8) goto L_0x0467
            r8 = 2
            if (r6 == r8) goto L_0x0447
            r0 = 3
            if (r6 != r0) goto L_0x0441
            androidx.compose.animation.TransitionData r0 = r26.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x0436
        L_0x042d:
            long r8 = r0.m32870getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r0 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r8)
            goto L_0x0467
        L_0x0436:
            androidx.compose.animation.TransitionData r0 = r25.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x0465
            goto L_0x042d
        L_0x0441:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0447:
            androidx.compose.animation.TransitionData r0 = r25.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x045a
        L_0x0451:
            long r8 = r0.m32870getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r0 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r8)
            goto L_0x0467
        L_0x045a:
            androidx.compose.animation.TransitionData r0 = r26.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x0465
            goto L_0x0451
        L_0x0465:
            r0 = r21
        L_0x0467:
            if (r0 == 0) goto L_0x046e
            long r8 = r0.m36092unboximpl()
            goto L_0x0474
        L_0x046e:
            androidx.compose.ui.graphics.TransformOrigin$Companion r0 = androidx.compose.p002ui.graphics.TransformOrigin.Companion
            long r8 = r0.m36093getCenterSzJe1aQ()
        L_0x0474:
            r28.endReplaceableGroup()
            androidx.compose.ui.graphics.TransformOrigin r6 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r8)
            androidx.compose.animation.core.Transition$Segment r0 = r24.getSegment()
            int r8 = r1 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r2.invoke(r0, r12, r8)
            r8 = r0
            androidx.compose.animation.core.FiniteAnimationSpec r8 = (androidx.compose.animation.core.FiniteAnimationSpec) r8
            r0 = r1 & 14
            int r2 = r1 << 9
            r2 = r2 & r17
            r0 = r0 | r2
            int r1 = r1 << 6
            r1 = r1 & r16
            r9 = r0 | r1
            r0 = r24
            r1 = r3
            r2 = r6
            r3 = r8
            r6 = r28
            r8 = r7
            r7 = r9
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r0, r1, r2, r3, r4, r5, r6, r7)
            r28.endReplaceableGroup()
            androidx.compose.animation.EnterExitTransitionKt$createModifier$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$1
            r1.<init>(r15, r8, r0)
            androidx.compose.ui.Modifier r13 = androidx.compose.p002ui.graphics.GraphicsLayerModifierKt.graphicsLayer(r13, r1)
            goto L_0x04c4
        L_0x04b5:
            boolean r0 = m32835createModifier$lambda1(r20)
            if (r0 == 0) goto L_0x04c4
            androidx.compose.animation.EnterExitTransitionKt$createModifier$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$2
            r0.<init>(r15)
            androidx.compose.ui.Modifier r13 = androidx.compose.p002ui.graphics.GraphicsLayerModifierKt.graphicsLayer(r13, r0)
        L_0x04c4:
            r28.endReplaceableGroup()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    /* renamed from: createModifier$lambda-1  reason: not valid java name */
    private static final boolean m32835createModifier$lambda1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: createModifier$lambda-11  reason: not valid java name */
    public static final float m32836createModifier$lambda11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: createModifier$lambda-13  reason: not valid java name */
    public static final long m32837createModifier$lambda13(State<TransformOrigin> state) {
        return state.getValue().m36092unboximpl();
    }

    /* renamed from: createModifier$lambda-2  reason: not valid java name */
    private static final void m32838createModifier$lambda2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: createModifier$lambda-4  reason: not valid java name */
    private static final boolean m32839createModifier$lambda4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: createModifier$lambda-5  reason: not valid java name */
    private static final void m32840createModifier$lambda5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: createModifier$lambda-8  reason: not valid java name */
    public static final float m32841createModifier$lambda8(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Stable
    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1<? super Integer, Integer> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(horizontal, "expandFrom");
        C12775o.m28639i(function1, "initialWidth");
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z, new EnterExitTransitionKt$expandHorizontally$2(function1));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m38620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$expandHorizontally$1.INSTANCE;
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    @Stable
    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, Function1<? super IntSize, IntSize> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(alignment, "expandFrom");
        C12775o.m28639i(function1, "initialSize");
        return new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, new ChangeSize(alignment, function1, finiteAnimationSpec, z), (Scale) null, 11, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m38620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$expandIn$1.INSTANCE;
        }
        return expandIn(finiteAnimationSpec, alignment, z, function1);
    }

    @Stable
    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1<? super Integer, Integer> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(vertical, "expandFrom");
        C12775o.m28639i(function1, "initialHeight");
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z, new EnterExitTransitionKt$expandVertically$2(function1));
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m38620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$expandVertically$1.INSTANCE;
        }
        return expandVertically(finiteAnimationSpec, vertical, z, function1);
    }

    @Stable
    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), (Slide) null, (ChangeSize) null, (Scale) null, 14, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    @Stable
    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), (Slide) null, (ChangeSize) null, (Scale) null, 14, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    @ExperimentalAnimationApi
    @Stable
    /* renamed from: scaleIn-L8ZKh-E  reason: not valid java name */
    public static final EnterTransition m32842scaleInL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, new Scale(f, j, finiteAnimationSpec, (DefaultConstructorMarker) null), 7, (DefaultConstructorMarker) null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default  reason: not valid java name */
    public static /* synthetic */ EnterTransition m32843scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
        }
        return m32842scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    @ExperimentalAnimationApi
    @Stable
    /* renamed from: scaleOut-L8ZKh-E  reason: not valid java name */
    public static final ExitTransition m32844scaleOutL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, new Scale(f, j, finiteAnimationSpec, (DefaultConstructorMarker) null), 7, (DefaultConstructorMarker) null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default  reason: not valid java name */
    public static /* synthetic */ ExitTransition m32845scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
        }
        return m32844scaleOutL8ZKhE(finiteAnimationSpec, f, j);
    }

    private static final Modifier shrinkExpand(Modifier modifier, Transition<EnterExitState> transition, State<ChangeSize> state, State<ChangeSize> state2, String str) {
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new EnterExitTransitionKt$shrinkExpand$1(transition, state, state2, str), 1, (Object) null);
    }

    @Stable
    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1<? super Integer, Integer> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(horizontal, "shrinkTowards");
        C12775o.m28639i(function1, "targetWidth");
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z, new EnterExitTransitionKt$shrinkHorizontally$2(function1));
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m38620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkHorizontally$1.INSTANCE;
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    @Stable
    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, Function1<? super IntSize, IntSize> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(alignment, "shrinkTowards");
        C12775o.m28639i(function1, "targetSize");
        return new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, new ChangeSize(alignment, function1, finiteAnimationSpec, z), (Scale) null, 11, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m38620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkOut$1.INSTANCE;
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, function1);
    }

    @Stable
    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1<? super Integer, Integer> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(vertical, "shrinkTowards");
        C12775o.m28639i(function1, "targetHeight");
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z, new EnterExitTransitionKt$shrinkVertically$2(function1));
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m38620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkVertically$1.INSTANCE;
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, function1);
    }

    @Stable
    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super IntSize, IntOffset> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(function1, "initialOffset");
        return new EnterTransitionImpl(new TransitionData((Fade) null, new Slide(function1, finiteAnimationSpec), (ChangeSize) null, (Scale) null, 13, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    @Stable
    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(function1, "initialOffsetX");
        return slideIn(finiteAnimationSpec, new EnterExitTransitionKt$slideInHorizontally$2(function1));
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideInHorizontally$1.INSTANCE;
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    private static final Modifier slideInOut(Modifier modifier, Transition<EnterExitState> transition, State<Slide> state, State<Slide> state2, String str) {
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new EnterExitTransitionKt$slideInOut$1(transition, state, state2, str), 1, (Object) null);
    }

    @Stable
    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(function1, "initialOffsetY");
        return slideIn(finiteAnimationSpec, new EnterExitTransitionKt$slideInVertically$2(function1));
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideInVertically$1.INSTANCE;
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    @Stable
    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super IntSize, IntOffset> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(function1, "targetOffset");
        return new ExitTransitionImpl(new TransitionData((Fade) null, new Slide(function1, finiteAnimationSpec), (ChangeSize) null, (Scale) null, 13, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    @Stable
    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(function1, "targetOffsetX");
        return slideOut(finiteAnimationSpec, new EnterExitTransitionKt$slideOutHorizontally$2(function1));
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideOutHorizontally$1.INSTANCE;
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    @Stable
    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(function1, "targetOffsetY");
        return slideOut(finiteAnimationSpec, new EnterExitTransitionKt$slideOutVertically$2(function1));
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideOutVertically$1.INSTANCE;
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.Companion;
        if (C12775o.m28634d(horizontal, companion.getStart())) {
            return companion.getCenterStart();
        }
        if (C12775o.m28634d(horizontal, companion.getEnd())) {
            return companion.getCenterEnd();
        }
        return companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.Companion;
        if (C12775o.m28634d(vertical, companion.getTop())) {
            return companion.getTopCenter();
        }
        if (C12775o.m28634d(vertical, companion.getBottom())) {
            return companion.getBottomCenter();
        }
        return companion.getCenter();
    }
}
