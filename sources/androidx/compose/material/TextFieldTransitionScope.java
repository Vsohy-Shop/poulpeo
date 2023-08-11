package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,374:1\n934#2:375\n852#2,5:376\n934#2:381\n852#2,5:382\n852#2,5:398\n852#2,5:414\n69#3,2:387\n71#3:393\n74#3:397\n69#3,2:403\n71#3:409\n74#3:413\n36#4:389\n36#4:405\n1057#5,3:390\n1060#5,3:394\n1057#5,3:406\n1060#5,3:410\n76#6:419\n76#6:420\n76#6:421\n76#6:422\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n*L\n279#1:375\n279#1:376,5\n290#1:381\n290#1:382,5\n318#1:398,5\n328#1:414,5\n318#1:387,2\n318#1:393\n318#1:397\n328#1:403,2\n328#1:409\n328#1:413\n318#1:389\n328#1:405\n318#1:390,3\n318#1:394,3\n328#1:406,3\n328#1:410,3\n279#1:419\n290#1:420\n318#1:421\n328#1:422\n*E\n"})
/* compiled from: TextFieldImpl.kt */
final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: TextFieldImpl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material.InputPhase[] r0 = androidx.compose.material.InputPhase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.InputPhase r1 = androidx.compose.material.InputPhase.Focused     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.InputPhase r1 = androidx.compose.material.InputPhase.UnfocusedEmpty     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material.InputPhase r1 = androidx.compose.material.InputPhase.UnfocusedNotEmpty     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.WhenMappings.<clinit>():void");
        }
    }

    private TextFieldTransitionScope() {
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$5(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$6(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01ff, code lost:
        if (r8 != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c2, code lost:
        if (r8 != false) goto L_0x01b9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b3  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0][0]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Transition-DTcfvLk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m34199TransitionDTcfvLk(androidx.compose.material.InputPhase r26, long r27, long r29, p404of.C13089p<? super androidx.compose.material.InputPhase, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.p002ui.graphics.Color> r31, boolean r32, p404of.C13092s<? super java.lang.Float, ? super androidx.compose.p002ui.graphics.Color, ? super androidx.compose.p002ui.graphics.Color, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            r25 = this;
            r2 = r26
            r7 = r31
            r8 = r32
            r5 = r33
            r6 = r35
            java.lang.String r0 = "inputState"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "contentColor"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            r0 = 1988729962(0x76899c6a, float:1.3955413E33)
            r1 = r34
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r1.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r6
            goto L_0x0032
        L_0x0031:
            r3 = r6
        L_0x0032:
            r9 = r6 & 112(0x70, float:1.57E-43)
            r14 = r27
            if (r9 != 0) goto L_0x0044
            boolean r9 = r1.changed((long) r14)
            if (r9 == 0) goto L_0x0041
            r9 = 32
            goto L_0x0043
        L_0x0041:
            r9 = 16
        L_0x0043:
            r3 = r3 | r9
        L_0x0044:
            r9 = r6 & 896(0x380, float:1.256E-42)
            r12 = r29
            if (r9 != 0) goto L_0x0056
            boolean r9 = r1.changed((long) r12)
            if (r9 == 0) goto L_0x0053
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0053:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r3 = r3 | r9
        L_0x0056:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0066
            boolean r9 = r1.changedInstance(r7)
            if (r9 == 0) goto L_0x0063
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0065
        L_0x0063:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0065:
            r3 = r3 | r9
        L_0x0066:
            r17 = 57344(0xe000, float:8.0356E-41)
            r9 = r6 & r17
            if (r9 != 0) goto L_0x0079
            boolean r9 = r1.changed((boolean) r8)
            if (r9 == 0) goto L_0x0076
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0078
        L_0x0076:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0078:
            r3 = r3 | r9
        L_0x0079:
            r18 = 458752(0x70000, float:6.42848E-40)
            r9 = r6 & r18
            if (r9 != 0) goto L_0x008b
            boolean r9 = r1.changedInstance(r5)
            if (r9 == 0) goto L_0x0088
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x008a
        L_0x0088:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x008a:
            r3 = r3 | r9
        L_0x008b:
            r9 = 374491(0x5b6db, float:5.24774E-40)
            r9 = r9 & r3
            r10 = 74898(0x12492, float:1.04954E-40)
            if (r9 != r10) goto L_0x00a0
            boolean r9 = r1.getSkipping()
            if (r9 != 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            r1.skipToGroupEnd()
            goto L_0x040d
        L_0x00a0:
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r11 = -1
            if (r9 == 0) goto L_0x00ac
            java.lang.String r9 = "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:260)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r11, r9)
        L_0x00ac:
            r0 = r3 & 14
            r0 = r0 | 48
            java.lang.String r9 = "TextFieldInputState"
            r10 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.updateTransition(r2, (java.lang.String) r9, (androidx.compose.runtime.Composer) r1, (int) r0, (int) r10)
            androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2 r9 = androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2.INSTANCE
            java.lang.String r16 = "LabelProgress"
            r4 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r1.startReplaceableGroup(r4)
            kotlin.jvm.internal.h r19 = kotlin.jvm.internal.C12763h.f20419a
            androidx.compose.animation.core.TwoWayConverter r20 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r19)
            r4 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r1.startReplaceableGroup(r4)
            java.lang.Object r21 = r0.getCurrentState()
            androidx.compose.material.InputPhase r21 = (androidx.compose.material.InputPhase) r21
            r4 = -1158004136(0xffffffffbafa4258, float:-0.0019093258)
            r1.startReplaceableGroup(r4)
            boolean r22 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r2 = "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:281)"
            if (r22 == 0) goto L_0x00e4
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r10, r11, r2)
        L_0x00e4:
            int[] r22 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0
            int r21 = r21.ordinal()
            r10 = r22[r21]
            r21 = 0
            r11 = 3
            r4 = 1
            r24 = 1065353216(0x3f800000, float:1.0)
            if (r10 == r4) goto L_0x0103
            r4 = 2
            if (r10 == r4) goto L_0x0100
            if (r10 != r11) goto L_0x00fa
            goto L_0x0103
        L_0x00fa:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0100:
            r4 = r21
            goto L_0x0105
        L_0x0103:
            r4 = r24
        L_0x0105:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x010e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x010e:
            r1.endReplaceableGroup()
            java.lang.Float r10 = java.lang.Float.valueOf(r4)
            java.lang.Object r4 = r0.getTargetState()
            androidx.compose.material.InputPhase r4 = (androidx.compose.material.InputPhase) r4
            r11 = -1158004136(0xffffffffbafa4258, float:-0.0019093258)
            r1.startReplaceableGroup(r11)
            boolean r23 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r23 == 0) goto L_0x012d
            r5 = 0
            r6 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r5, r6, r2)
            goto L_0x012e
        L_0x012d:
            r6 = -1
        L_0x012e:
            int r2 = r4.ordinal()
            r2 = r22[r2]
            r4 = 1
            if (r2 == r4) goto L_0x0148
            r4 = 2
            if (r2 == r4) goto L_0x0144
            r4 = 3
            if (r2 != r4) goto L_0x013e
            goto L_0x0149
        L_0x013e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0144:
            r4 = 3
            r2 = r21
            goto L_0x014b
        L_0x0148:
            r4 = 3
        L_0x0149:
            r2 = r24
        L_0x014b:
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x0154
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0154:
            r1.endReplaceableGroup()
            java.lang.Float r11 = java.lang.Float.valueOf(r2)
            androidx.compose.animation.core.Transition$Segment r2 = r0.getSegment()
            r5 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r9.invoke(r2, r1, r4)
            androidx.compose.animation.core.FiniteAnimationSpec r2 = (androidx.compose.animation.core.FiniteAnimationSpec) r2
            r4 = 196608(0x30000, float:2.75506E-40)
            r9 = r0
            r12 = r2
            r13 = r20
            r14 = r16
            r15 = r1
            r16 = r4
            androidx.compose.runtime.State r2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2 r9 = androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2.INSTANCE
            java.lang.String r14 = "PlaceholderOpacity"
            r10 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r1.startReplaceableGroup(r10)
            androidx.compose.animation.core.TwoWayConverter r13 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r19)
            r10 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r1.startReplaceableGroup(r10)
            java.lang.Object r10 = r0.getCurrentState()
            androidx.compose.material.InputPhase r10 = (androidx.compose.material.InputPhase) r10
            r11 = -1376159017(0xffffffffadf97ad7, float:-2.8362574E-11)
            r1.startReplaceableGroup(r11)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r15 = "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:309)"
            if (r12 == 0) goto L_0x01aa
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r5, r6, r15)
        L_0x01aa:
            int r10 = r10.ordinal()
            r10 = r22[r10]
            r12 = 1
            if (r10 == r12) goto L_0x01c5
            r12 = 2
            if (r10 == r12) goto L_0x01c2
            r12 = 3
            if (r10 != r12) goto L_0x01bc
        L_0x01b9:
            r10 = r21
            goto L_0x01c7
        L_0x01bc:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01c2:
            if (r8 == 0) goto L_0x01c5
            goto L_0x01b9
        L_0x01c5:
            r10 = r24
        L_0x01c7:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x01d0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01d0:
            r1.endReplaceableGroup()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object r12 = r0.getTargetState()
            androidx.compose.material.InputPhase r12 = (androidx.compose.material.InputPhase) r12
            r1.startReplaceableGroup(r11)
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x01e9
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r5, r6, r15)
        L_0x01e9:
            int r11 = r12.ordinal()
            r11 = r22[r11]
            r12 = 1
            if (r11 == r12) goto L_0x0202
            r12 = 2
            if (r11 == r12) goto L_0x01ff
            r12 = 3
            if (r11 != r12) goto L_0x01f9
            goto L_0x0204
        L_0x01f9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01ff:
            if (r8 == 0) goto L_0x0202
            goto L_0x0204
        L_0x0202:
            r21 = r24
        L_0x0204:
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x020d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x020d:
            r1.endReplaceableGroup()
            java.lang.Float r11 = java.lang.Float.valueOf(r21)
            androidx.compose.animation.core.Transition$Segment r12 = r0.getSegment()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            java.lang.Object r9 = r9.invoke(r12, r1, r15)
            r12 = r9
            androidx.compose.animation.core.FiniteAnimationSpec r12 = (androidx.compose.animation.core.FiniteAnimationSpec) r12
            r9 = r0
            r15 = r1
            r16 = r4
            androidx.compose.runtime.State r4 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2 r9 = androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE
            java.lang.String r14 = "LabelTextStyleColor"
            r10 = -1939694975(0xffffffff8c629a81, float:-1.7456901E-31)
            r1.startReplaceableGroup(r10)
            java.lang.Object r10 = r0.getTargetState()
            androidx.compose.material.InputPhase r10 = (androidx.compose.material.InputPhase) r10
            r11 = -1490209928(0xffffffffa72d3378, float:-2.4036474E-15)
            r1.startReplaceableGroup(r11)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r13 = "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:320)"
            if (r12 == 0) goto L_0x0252
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r5, r6, r13)
        L_0x0252:
            int r10 = r10.ordinal()
            r10 = r22[r10]
            r12 = 1
            if (r10 != r12) goto L_0x025e
            r15 = r27
            goto L_0x0260
        L_0x025e:
            r15 = r29
        L_0x0260:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0269
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0269:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.colorspace.ColorSpace r10 = androidx.compose.p002ui.graphics.Color.m35675getColorSpaceimpl(r15)
            r12 = 1157296644(0x44faf204, float:2007.563)
            r1.startReplaceableGroup(r12)
            boolean r12 = r1.changed((java.lang.Object) r10)
            java.lang.Object r15 = r1.rememberedValue()
            if (r12 != 0) goto L_0x0288
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r15 != r12) goto L_0x0298
        L_0x0288:
            androidx.compose.ui.graphics.Color$Companion r12 = androidx.compose.p002ui.graphics.Color.Companion
            kotlin.jvm.functions.Function1 r12 = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(r12)
            java.lang.Object r10 = r12.invoke(r10)
            r15 = r10
            androidx.compose.animation.core.TwoWayConverter r15 = (androidx.compose.animation.core.TwoWayConverter) r15
            r1.updateRememberedValue(r15)
        L_0x0298:
            r1.endReplaceableGroup()
            androidx.compose.animation.core.TwoWayConverter r15 = (androidx.compose.animation.core.TwoWayConverter) r15
            r10 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r1.startReplaceableGroup(r10)
            java.lang.Object r10 = r0.getCurrentState()
            androidx.compose.material.InputPhase r10 = (androidx.compose.material.InputPhase) r10
            r1.startReplaceableGroup(r11)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x02b5
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r5, r6, r13)
        L_0x02b5:
            int r10 = r10.ordinal()
            r10 = r22[r10]
            r12 = 1
            if (r10 != r12) goto L_0x02c1
            r19 = r27
            goto L_0x02c3
        L_0x02c1:
            r19 = r29
        L_0x02c3:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x02cc
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02cc:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.Color r10 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r19)
            java.lang.Object r12 = r0.getTargetState()
            androidx.compose.material.InputPhase r12 = (androidx.compose.material.InputPhase) r12
            r1.startReplaceableGroup(r11)
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x02e5
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r5, r6, r13)
        L_0x02e5:
            int r6 = r12.ordinal()
            r6 = r22[r6]
            r11 = 1
            if (r6 != r11) goto L_0x02f1
            r11 = r27
            goto L_0x02f3
        L_0x02f1:
            r11 = r29
        L_0x02f3:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x02fc
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02fc:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.Color r11 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r11)
            androidx.compose.animation.core.Transition$Segment r6 = r0.getSegment()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r9.invoke(r6, r1, r5)
            r12 = r5
            androidx.compose.animation.core.FiniteAnimationSpec r12 = (androidx.compose.animation.core.FiniteAnimationSpec) r12
            r16 = 229376(0x38000, float:3.21424E-40)
            r9 = r0
            r13 = r15
            r15 = r1
            androidx.compose.runtime.State r5 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2 r6 = androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE
            java.lang.String r14 = "LabelContentColor"
            r9 = r3 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | 384(0x180, float:5.38E-43)
            r10 = -1939694975(0xffffffff8c629a81, float:-1.7456901E-31)
            r1.startReplaceableGroup(r10)
            java.lang.Object r10 = r0.getTargetState()
            int r11 = r9 >> 6
            r11 = r11 & 112(0x70, float:1.57E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r10 = r7.invoke(r10, r1, r11)
            androidx.compose.ui.graphics.Color r10 = (androidx.compose.p002ui.graphics.Color) r10
            long r10 = r10.m35681unboximpl()
            androidx.compose.ui.graphics.colorspace.ColorSpace r10 = androidx.compose.p002ui.graphics.Color.m35675getColorSpaceimpl(r10)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r1.startReplaceableGroup(r11)
            boolean r11 = r1.changed((java.lang.Object) r10)
            java.lang.Object r12 = r1.rememberedValue()
            if (r11 != 0) goto L_0x0362
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x0372
        L_0x0362:
            androidx.compose.ui.graphics.Color$Companion r11 = androidx.compose.p002ui.graphics.Color.Companion
            kotlin.jvm.functions.Function1 r11 = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(r11)
            java.lang.Object r10 = r11.invoke(r10)
            r12 = r10
            androidx.compose.animation.core.TwoWayConverter r12 = (androidx.compose.animation.core.TwoWayConverter) r12
            r1.updateRememberedValue(r12)
        L_0x0372:
            r1.endReplaceableGroup()
            r13 = r12
            androidx.compose.animation.core.TwoWayConverter r13 = (androidx.compose.animation.core.TwoWayConverter) r13
            r10 = r9 & 14
            r10 = r10 | 64
            r11 = 3
            int r9 = r9 << r11
            r11 = r9 & 896(0x380, float:1.256E-42)
            r10 = r10 | r11
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r9 = r9 & r17
            r9 = r9 | r10
            r10 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r1.startReplaceableGroup(r10)
            java.lang.Object r10 = r0.getCurrentState()
            int r11 = r9 >> 9
            r11 = r11 & 112(0x70, float:1.57E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Object r10 = r7.invoke(r10, r1, r12)
            java.lang.Object r12 = r0.getTargetState()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r7.invoke(r12, r1, r11)
            androidx.compose.animation.core.Transition$Segment r12 = r0.getSegment()
            int r15 = r9 >> 3
            r15 = r15 & 112(0x70, float:1.57E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Object r6 = r6.invoke(r12, r1, r15)
            r12 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r12 = (androidx.compose.animation.core.FiniteAnimationSpec) r12
            r6 = r9 & 14
            int r15 = r9 << 9
            r15 = r15 & r17
            r6 = r6 | r15
            int r9 = r9 << 6
            r9 = r9 & r18
            r16 = r6 | r9
            r9 = r0
            r15 = r1
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            float r2 = Transition_DTcfvLk$lambda$1(r2)
            java.lang.Float r10 = java.lang.Float.valueOf(r2)
            long r5 = Transition_DTcfvLk$lambda$5(r5)
            androidx.compose.ui.graphics.Color r11 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r5)
            long r5 = Transition_DTcfvLk$lambda$6(r0)
            androidx.compose.ui.graphics.Color r12 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r5)
            float r0 = Transition_DTcfvLk$lambda$3(r4)
            java.lang.Float r13 = java.lang.Float.valueOf(r0)
            r0 = 3
            int r0 = r3 >> 3
            r0 = r0 & r17
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r9 = r33
            r14 = r1
            r9.invoke(r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x040d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x040d:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.endRestartGroup()
            if (r11 != 0) goto L_0x0414
            goto L_0x042d
        L_0x0414:
            androidx.compose.material.TextFieldTransitionScope$Transition$1 r12 = new androidx.compose.material.TextFieldTransitionScope$Transition$1
            r0 = r12
            r1 = r25
            r2 = r26
            r3 = r27
            r5 = r29
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r35
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            r11.updateScope(r12)
        L_0x042d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.m34199TransitionDTcfvLk(androidx.compose.material.InputPhase, long, long, of.p, boolean, of.s, androidx.compose.runtime.Composer, int):void");
    }
}
