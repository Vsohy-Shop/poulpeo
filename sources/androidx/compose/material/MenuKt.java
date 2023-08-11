package androidx.compose.material;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,298:1\n931#2,4:299\n852#2,5:303\n931#2,4:308\n852#2,5:312\n67#3,3:317\n66#3:320\n25#3:327\n460#3,13:353\n473#3,3:367\n1114#4,6:321\n1114#4,6:328\n75#5,6:334\n81#5:366\n85#5:371\n75#6:340\n76#6,11:342\n89#6:370\n76#7:341\n76#8:372\n76#8:373\n154#9:374\n154#9:375\n154#9:376\n154#9:377\n154#9:378\n154#9:379\n154#9:380\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n*L\n71#1:299,4\n71#1:303,5\n97#1:308,4\n97#1:312,5\n117#1:317,3\n117#1:320\n141#1:327\n145#1:353,13\n145#1:367,3\n117#1:321,6\n141#1:328,6\n145#1:334,6\n145#1:366\n145#1:371\n145#1:340\n145#1:342,11\n145#1:370\n145#1:341\n71#1:372\n97#1:373\n187#1:374\n188#1:375\n189#1:376\n190#1:377\n191#1:378\n192#1:379\n193#1:380\n*E\n"})
/* compiled from: Menu.kt */
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMaxWidth = C1232Dp.m38468constructorimpl((float) 280);
    private static final float DropdownMenuItemDefaultMinHeight;
    private static final float DropdownMenuItemDefaultMinWidth = C1232Dp.m38468constructorimpl((float) 112);
    /* access modifiers changed from: private */
    public static final float DropdownMenuItemHorizontalPadding = C1232Dp.m38468constructorimpl((float) 16);
    private static final float DropdownMenuVerticalPadding;
    public static final int InTransitionDuration = 120;
    private static final float MenuElevation;
    private static final float MenuVerticalMargin;
    public static final int OutTransitionDuration = 75;

    static {
        float f = (float) 8;
        MenuElevation = C1232Dp.m38468constructorimpl(f);
        float f2 = (float) 48;
        MenuVerticalMargin = C1232Dp.m38468constructorimpl(f2);
        DropdownMenuVerticalPadding = C1232Dp.m38468constructorimpl(f);
        DropdownMenuItemDefaultMinHeight = C1232Dp.m38468constructorimpl(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r22, androidx.compose.runtime.MutableState<androidx.compose.p002ui.graphics.TransformOrigin> r23, androidx.compose.p002ui.Modifier r24, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r27
            java.lang.String r0 = "expandedStates"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "transformOriginState"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = 1164283597(0x45658ecd, float:3672.925)
            r3 = r26
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            r6 = r28 & 1
            if (r6 == 0) goto L_0x0027
            r6 = r5 | 6
            goto L_0x0037
        L_0x0027:
            r6 = r5 & 14
            if (r6 != 0) goto L_0x0036
            boolean r6 = r3.changed((java.lang.Object) r1)
            if (r6 == 0) goto L_0x0033
            r6 = 4
            goto L_0x0034
        L_0x0033:
            r6 = 2
        L_0x0034:
            r6 = r6 | r5
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            r7 = r28 & 2
            if (r7 == 0) goto L_0x003e
            r6 = r6 | 48
            goto L_0x004e
        L_0x003e:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004e
            boolean r7 = r3.changed((java.lang.Object) r2)
            if (r7 == 0) goto L_0x004b
            r7 = 32
            goto L_0x004d
        L_0x004b:
            r7 = 16
        L_0x004d:
            r6 = r6 | r7
        L_0x004e:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x0055
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0068
            r8 = r24
            boolean r9 = r3.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r6 = r6 | r9
            goto L_0x006a
        L_0x0068:
            r8 = r24
        L_0x006a:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0071
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0081
            boolean r9 = r3.changedInstance(r4)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r6 = r6 | r9
        L_0x0081:
            r14 = r6
            r6 = r14 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r6 != r9) goto L_0x0094
            boolean r6 = r3.getSkipping()
            if (r6 != 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            r3.skipToGroupEnd()
            goto L_0x023e
        L_0x0094:
            if (r7 == 0) goto L_0x009a
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.p002ui.Modifier.Companion
            r15 = r6
            goto L_0x009b
        L_0x009a:
            r15 = r8
        L_0x009b:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r13 = -1
            if (r6 == 0) goto L_0x00a7
            java.lang.String r6 = "androidx.compose.material.DropdownMenuContent (Menu.kt:61)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r14, r13, r6)
        L_0x00a7:
            int r0 = androidx.compose.animation.core.MutableTransitionState.$stable
            r0 = r0 | 48
            r6 = r14 & 14
            r0 = r0 | r6
            java.lang.String r6 = "DropDownMenu"
            r12 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r6, (androidx.compose.runtime.Composer) r3, (int) r0, (int) r12)
            androidx.compose.material.MenuKt$DropdownMenuContent$scale$2 r6 = androidx.compose.material.MenuKt$DropdownMenuContent$scale$2.INSTANCE
            r11 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3.startReplaceableGroup(r11)
            java.lang.String r16 = "FloatAnimation"
            kotlin.jvm.internal.h r17 = kotlin.jvm.internal.C12763h.f20419a
            androidx.compose.animation.core.TwoWayConverter r10 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r17)
            r9 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r3.startReplaceableGroup(r9)
            java.lang.Object r7 = r0.getCurrentState()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = -1958825495(0xffffffff8b3eb1e9, float:-3.6726514E-32)
            r3.startReplaceableGroup(r8)
            boolean r18 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r9 = "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:86)"
            if (r18 == 0) goto L_0x00e6
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r12, r13, r9)
        L_0x00e6:
            r18 = 1061997773(0x3f4ccccd, float:0.8)
            r19 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x00f0
            r7 = r19
            goto L_0x00f2
        L_0x00f0:
            r7 = r18
        L_0x00f2:
            boolean r20 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r20 == 0) goto L_0x00fb
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00fb:
            r3.endReplaceableGroup()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r20 = r0.getTargetState()
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            boolean r20 = r20.booleanValue()
            r3.startReplaceableGroup(r8)
            boolean r21 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r21 == 0) goto L_0x0118
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r12, r13, r9)
        L_0x0118:
            if (r20 == 0) goto L_0x011c
            r18 = r19
        L_0x011c:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x0125
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0125:
            r3.endReplaceableGroup()
            java.lang.Float r8 = java.lang.Float.valueOf(r18)
            androidx.compose.animation.core.Transition$Segment r9 = r0.getSegment()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r6.invoke(r9, r3, r11)
            r9 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            r18 = 0
            r6 = r0
            r11 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r11 = r16
            r1 = r12
            r12 = r3
            r5 = r13
            r13 = r18
            androidx.compose.runtime.State r13 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.endReplaceableGroup()
            r3.endReplaceableGroup()
            androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2 r6 = androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2.INSTANCE
            r7 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3.startReplaceableGroup(r7)
            java.lang.String r11 = "FloatAnimation"
            androidx.compose.animation.core.TwoWayConverter r10 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r17)
            r7 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r3.startReplaceableGroup(r7)
            java.lang.Object r7 = r0.getCurrentState()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = -1541356035(0xffffffffa420c5fd, float:-3.4862172E-17)
            r3.startReplaceableGroup(r8)
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r12 = "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:106)"
            if (r9 == 0) goto L_0x0181
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r1, r5, r12)
        L_0x0181:
            r9 = 0
            if (r7 == 0) goto L_0x0187
            r7 = r19
            goto L_0x0188
        L_0x0187:
            r7 = r9
        L_0x0188:
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x0191
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0191:
            r3.endReplaceableGroup()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r16 = r0.getTargetState()
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            r3.startReplaceableGroup(r8)
            boolean r17 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r17 == 0) goto L_0x01ae
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r1, r5, r12)
        L_0x01ae:
            if (r16 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r19 = r9
        L_0x01b3:
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x01bc
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01bc:
            r3.endReplaceableGroup()
            java.lang.Float r8 = java.lang.Float.valueOf(r19)
            androidx.compose.animation.core.Transition$Segment r5 = r0.getSegment()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r6.invoke(r5, r3, r1)
            r9 = r1
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            r6 = r0
            r12 = r3
            r0 = r13
            r13 = r18
            androidx.compose.runtime.State r1 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.endReplaceableGroup()
            r3.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            r6 = 1618982084(0x607fb4c4, float:7.370227E19)
            r3.startReplaceableGroup(r6)
            boolean r6 = r3.changed((java.lang.Object) r0)
            boolean r7 = r3.changed((java.lang.Object) r1)
            r6 = r6 | r7
            boolean r7 = r3.changed((java.lang.Object) r2)
            r6 = r6 | r7
            java.lang.Object r7 = r3.rememberedValue()
            if (r6 != 0) goto L_0x0205
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r7 != r6) goto L_0x020d
        L_0x0205:
            androidx.compose.material.MenuKt$DropdownMenuContent$1$1 r7 = new androidx.compose.material.MenuKt$DropdownMenuContent$1$1
            r7.<init>(r2, r0, r1)
            r3.updateRememberedValue(r7)
        L_0x020d:
            r3.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            androidx.compose.ui.Modifier r6 = androidx.compose.p002ui.graphics.GraphicsLayerModifierKt.graphicsLayer(r5, r7)
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            float r13 = MenuElevation
            androidx.compose.material.MenuKt$DropdownMenuContent$2 r0 = new androidx.compose.material.MenuKt$DropdownMenuContent$2
            r0.<init>(r15, r4, r14)
            r1 = -242468534(0xfffffffff18c394a, float:-1.3887091E30)
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r14 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r3, r1, r5, r0)
            r16 = 1769472(0x1b0000, float:2.479558E-39)
            r17 = 30
            r0 = r15
            r15 = r3
            androidx.compose.material.CardKt.m33928CardFjzlyU(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x023d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x023d:
            r8 = r0
        L_0x023e:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.endRestartGroup()
            if (r7 != 0) goto L_0x0245
            goto L_0x0259
        L_0x0245:
            androidx.compose.material.MenuKt$DropdownMenuContent$3 r9 = new androidx.compose.material.MenuKt$DropdownMenuContent$3
            r0 = r9
            r1 = r22
            r2 = r23
            r3 = r8
            r4 = r25
            r5 = r27
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.updateScope(r9)
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d5  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DropdownMenuItemContent(p404of.C13074a<p336ef.C11921v> r25, androidx.compose.p002ui.Modifier r26, boolean r27, androidx.compose.foundation.layout.PaddingValues r28, androidx.compose.foundation.interaction.MutableInteractionSource r29, p404of.C13089p<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r9 = r25
            r10 = r30
            r11 = r32
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = 87134531(0x5319143, float:8.3491804E-36)
            r1 = r31
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r12.changedInstance(r9)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r11
            goto L_0x0030
        L_0x002f:
            r1 = r11
        L_0x0030:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x004a
        L_0x0037:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004a
            r3 = r26
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
            goto L_0x004c
        L_0x004a:
            r3 = r26
        L_0x004c:
            r4 = r33 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r5 = r11 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0066
            r5 = r27
            boolean r6 = r12.changed((boolean) r5)
            if (r6 == 0) goto L_0x0062
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r6
            goto L_0x0068
        L_0x0066:
            r5 = r27
        L_0x0068:
            r6 = r33 & 8
            if (r6 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0082
            r7 = r28
            boolean r8 = r12.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r8
            goto L_0x0084
        L_0x0082:
            r7 = r28
        L_0x0084:
            r8 = r33 & 16
            if (r8 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008b:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00a0
            r13 = r29
            boolean r14 = r12.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x009c
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r14
            goto L_0x00a2
        L_0x00a0:
            r13 = r29
        L_0x00a2:
            r14 = r33 & 32
            if (r14 == 0) goto L_0x00aa
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a8:
            r1 = r1 | r14
            goto L_0x00bb
        L_0x00aa:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00bb
            boolean r14 = r12.changedInstance(r10)
            if (r14 == 0) goto L_0x00b8
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00b8:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a8
        L_0x00bb:
            r14 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r14
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r15) goto L_0x00d5
            boolean r1 = r12.getSkipping()
            if (r1 != 0) goto L_0x00cc
            goto L_0x00d5
        L_0x00cc:
            r12.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r13
            goto L_0x0235
        L_0x00d5:
            if (r2 == 0) goto L_0x00db
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r15 = r1
            goto L_0x00dc
        L_0x00db:
            r15 = r3
        L_0x00dc:
            r3 = 1
            if (r4 == 0) goto L_0x00e2
            r16 = r3
            goto L_0x00e4
        L_0x00e2:
            r16 = r5
        L_0x00e4:
            if (r6 == 0) goto L_0x00ed
            androidx.compose.material.MenuDefaults r1 = androidx.compose.material.MenuDefaults.INSTANCE
            androidx.compose.foundation.layout.PaddingValues r1 = r1.getDropdownMenuItemContentPadding()
            r7 = r1
        L_0x00ed:
            if (r8 == 0) goto L_0x010e
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r1)
            java.lang.Object r1 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x0108
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r12.updateRememberedValue(r1)
        L_0x0108:
            r12.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = (androidx.compose.foundation.interaction.MutableInteractionSource) r1
            r13 = r1
        L_0x010e:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x011a
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r14, r1, r2)
        L_0x011a:
            r1 = 1
            r2 = 0
            r4 = 0
            r6 = 6
            r0 = 6
            r8 = r3
            r3 = r4
            r5 = r12
            r17 = r7
            r7 = r0
            androidx.compose.foundation.Indication r2 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r1, r2, r3, r5, r6, r7)
            r4 = 0
            r5 = 0
            r7 = 24
            r18 = 0
            r0 = r15
            r1 = r13
            r3 = r16
            r6 = r25
            r9 = r8
            r8 = r18
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.ClickableKt.m32979clickableO2vRcR0$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            r2 = 0
            androidx.compose.ui.Modifier r18 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r0, r1, r9, r2)
            float r19 = DropdownMenuItemDefaultMinWidth
            float r21 = DropdownMenuItemDefaultMaxWidth
            float r20 = DropdownMenuItemDefaultMinHeight
            r22 = 0
            r23 = 8
            r24 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m33342sizeInqDBjuR0$default(r18, r19, r20, r21, r22, r23, r24)
            r7 = r17
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.padding(r0, r7)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r1 = r1.getCenterVertically()
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r12.startReplaceableGroup(r2)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r2 = r2.getStart()
            r6 = 48
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r2, r1, r12, r6)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.startReplaceableGroup(r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r2 = r12.consume(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.p002ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r3 = r12.consume(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p002ui.unit.LayoutDirection) r3
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r4 = r12.consume(r4)
            androidx.compose.ui.platform.ViewConfiguration r4 = (androidx.compose.p002ui.platform.ViewConfiguration) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r8 = r5.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r6 = r12.getApplier()
            boolean r6 = r6 instanceof androidx.compose.runtime.Applier
            if (r6 != 0) goto L_0x01aa
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01aa:
            r12.startReusableNode()
            boolean r6 = r12.getInserting()
            if (r6 == 0) goto L_0x01b7
            r12.createNode(r8)
            goto L_0x01ba
        L_0x01b7:
            r12.useNode()
        L_0x01ba:
            r12.disableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m35292constructorimpl(r12)
            of.o r8 = r5.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r1, r8)
            of.o r1 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r2, r1)
            of.o r1 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r3, r1)
            of.o r1 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r4, r1)
            r12.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r12)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r12, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.RowScopeInstance r3 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            r4 = 6
            androidx.compose.material.MaterialTheme r0 = androidx.compose.material.MaterialTheme.INSTANCE
            r1 = 6
            androidx.compose.material.Typography r0 = r0.getTypography(r12, r1)
            androidx.compose.ui.text.TextStyle r6 = r0.getSubtitle1()
            androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1 r8 = new androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
            r0 = r8
            r1 = r16
            r2 = r30
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1190489496(0x46f56d98, float:31414.797)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r0, r9, r8)
            r1 = 48
            androidx.compose.material.TextKt.ProvideTextStyle(r6, r0, r12, r1)
            r12.endReplaceableGroup()
            r12.endNode()
            r12.endReplaceableGroup()
            r12.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0230
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0230:
            r4 = r7
            r5 = r13
            r2 = r15
            r3 = r16
        L_0x0235:
            androidx.compose.runtime.ScopeUpdateScope r9 = r12.endRestartGroup()
            if (r9 != 0) goto L_0x023c
            goto L_0x024d
        L_0x023c:
            androidx.compose.material.MenuKt$DropdownMenuItemContent$3 r12 = new androidx.compose.material.MenuKt$DropdownMenuItemContent$3
            r0 = r12
            r1 = r25
            r6 = r30
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.updateScope(r12)
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.DropdownMenuItemContent(of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long calculateTransformOrigin(androidx.compose.p002ui.unit.IntRect r5, androidx.compose.p002ui.unit.IntRect r6) {
        /*
            java.lang.String r0 = "parentBounds"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.lang.String r0 = "menuBounds"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x0019
        L_0x0017:
            r0 = r3
            goto L_0x0053
        L_0x0019:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L_0x0025
            r0 = r2
            goto L_0x0053
        L_0x0025:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L_0x002c
            goto L_0x0017
        L_0x002c:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0053:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L_0x005f
        L_0x005d:
            r2 = r3
            goto L_0x0099
        L_0x005f:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L_0x006a
            goto L_0x0099
        L_0x006a:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L_0x0071
            goto L_0x005d
        L_0x0071:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r5 / r6
        L_0x0099:
            long r5 = androidx.compose.p002ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}
