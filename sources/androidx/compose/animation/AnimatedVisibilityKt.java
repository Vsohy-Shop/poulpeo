package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Updater;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

/* compiled from: AnimatedVisibility.kt */
public final class AnimatedVisibilityKt {
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void AnimatedEnterExitImpl(androidx.compose.animation.core.Transition<T> r19, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r20, androidx.compose.p002ui.Modifier r21, androidx.compose.animation.EnterTransition r22, androidx.compose.animation.ExitTransition r23, p404of.C13089p<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r24
            r10 = r26
            r0 = 808253933(0x302cf9ed, float:6.29284E-10)
            r1 = r25
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            r0 = r10 & 14
            r1 = 2
            if (r0 != 0) goto L_0x0023
            boolean r0 = r15.changed((java.lang.Object) r6)
            if (r0 == 0) goto L_0x0020
            r0 = 4
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            r0 = r0 | r10
            goto L_0x0024
        L_0x0023:
            r0 = r10
        L_0x0024:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0034
            boolean r2 = r15.changed((java.lang.Object) r7)
            if (r2 == 0) goto L_0x0031
            r2 = 32
            goto L_0x0033
        L_0x0031:
            r2 = 16
        L_0x0033:
            r0 = r0 | r2
        L_0x0034:
            r2 = r10 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0044
            boolean r2 = r15.changed((java.lang.Object) r8)
            if (r2 == 0) goto L_0x0041
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r0 = r0 | r2
        L_0x0044:
            r2 = r10 & 7168(0x1c00, float:1.0045E-41)
            r14 = r22
            if (r2 != 0) goto L_0x0056
            boolean r2 = r15.changed((java.lang.Object) r14)
            if (r2 == 0) goto L_0x0053
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r0 = r0 | r2
        L_0x0056:
            r11 = 57344(0xe000, float:8.0356E-41)
            r2 = r10 & r11
            r13 = r23
            if (r2 != 0) goto L_0x006b
            boolean r2 = r15.changed((java.lang.Object) r13)
            if (r2 == 0) goto L_0x0068
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006a
        L_0x0068:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x006a:
            r0 = r0 | r2
        L_0x006b:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r10
            if (r2 != 0) goto L_0x007c
            boolean r2 = r15.changed((java.lang.Object) r9)
            if (r2 == 0) goto L_0x0079
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007b
        L_0x0079:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x007b:
            r0 = r0 | r2
        L_0x007c:
            r12 = r0
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r0 & r12
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r2) goto L_0x0093
            boolean r0 = r15.getSkipping()
            if (r0 != 0) goto L_0x008d
            goto L_0x0093
        L_0x008d:
            r15.skipToGroupEnd()
        L_0x0090:
            r2 = r15
            goto L_0x02b6
        L_0x0093:
            r0 = r12 & 14
            r5 = 1157296644(0x44faf204, float:2007.563)
            r15.startReplaceableGroup(r5)
            boolean r2 = r15.changed((java.lang.Object) r6)
            java.lang.Object r3 = r15.rememberedValue()
            r4 = 0
            if (r2 != 0) goto L_0x00ae
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x00bd
        L_0x00ae:
            java.lang.Object r2 = r19.getCurrentState()
            java.lang.Object r2 = r7.invoke(r2)
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r4, r1, r4)
            r15.updateRememberedValue(r3)
        L_0x00bd:
            r15.endReplaceableGroup()
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            java.lang.Object r1 = r19.getTargetState()
            java.lang.Object r1 = r7.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00e4
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00e4
            boolean r1 = r19.isSeeking()
            if (r1 == 0) goto L_0x0090
        L_0x00e4:
            java.lang.String r16 = "EnterExitTransition"
            r1 = r0 | 48
            r2 = 1215497572(0x48730564, float:248853.56)
            r15.startReplaceableGroup(r2)
            r2 = r1 & 14
            r15.startReplaceableGroup(r5)
            boolean r17 = r15.changed((java.lang.Object) r6)
            java.lang.Object r4 = r15.rememberedValue()
            if (r17 != 0) goto L_0x0105
            androidx.compose.runtime.Composer$Companion r17 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r17.getEmpty()
            if (r4 != r5) goto L_0x010c
        L_0x0105:
            java.lang.Object r4 = r19.getCurrentState()
            r15.updateRememberedValue(r4)
        L_0x010c:
            r15.endReplaceableGroup()
            boolean r5 = r19.isSeeking()
            if (r5 == 0) goto L_0x0119
            java.lang.Object r4 = r19.getCurrentState()
        L_0x0119:
            int r5 = r1 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r11 = -1220581778(0xffffffffb73f666e, float:-1.1408336E-5)
            r15.startReplaceableGroup(r11)
            r18 = r12 & 112(0x70, float:1.57E-43)
            r0 = r0 | r18
            int r5 = r5 << 6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r0 = r0 | r5
            androidx.compose.animation.EnterExitState r4 = targetEnterExit(r6, r7, r4, r15, r0)
            r15.endReplaceableGroup()
            java.lang.Object r5 = r19.getTargetState()
            r15.startReplaceableGroup(r11)
            androidx.compose.animation.EnterExitState r5 = targetEnterExit(r6, r7, r5, r15, r0)
            r15.endReplaceableGroup()
            int r0 = r1 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r11 = r2 | r0
            r0 = r19
            r1 = r4
            r2 = r5
            r5 = r3
            r3 = r16
            r6 = 0
            r4 = r15
            r6 = r5
            r7 = 1157296644(0x44faf204, float:2007.563)
            r5 = r11
            androidx.compose.animation.core.Transition r11 = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(r0, r1, r2, r3, r4, r5)
            r15.endReplaceableGroup()
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.startReplaceableGroup(r0)
            boolean r0 = r15.changed((java.lang.Object) r11)
            boolean r1 = r15.changed((java.lang.Object) r6)
            r0 = r0 | r1
            java.lang.Object r1 = r15.rememberedValue()
            if (r0 != 0) goto L_0x0179
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x0182
        L_0x0179:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 r1 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1
            r0 = 0
            r1.<init>(r11, r6, r0)
            r15.updateRememberedValue(r1)
        L_0x0182:
            r15.endReplaceableGroup()
            of.o r1 = (p404of.C13088o) r1
            r0 = 0
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r11, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r1, (androidx.compose.runtime.Composer) r15, (int) r0)
            int r1 = r12 >> 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r1 = r1 | r2
            r2 = -1967270694(0xffffffff8abdd4da, float:-1.8280104E-32)
            r15.startReplaceableGroup(r2)
            java.lang.Object r2 = r11.getCurrentState()
            androidx.compose.animation.EnterExitState r3 = androidx.compose.animation.EnterExitState.Visible
            if (r2 == r3) goto L_0x01b2
            java.lang.Object r2 = r11.getTargetState()
            if (r2 != r3) goto L_0x01af
            goto L_0x01b2
        L_0x01af:
            r2 = r15
            goto L_0x02b3
        L_0x01b2:
            r2 = r1 & 14
            r15.startReplaceableGroup(r7)
            boolean r3 = r15.changed((java.lang.Object) r11)
            java.lang.Object r4 = r15.rememberedValue()
            if (r3 != 0) goto L_0x01c9
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r4 != r3) goto L_0x01d1
        L_0x01c9:
            androidx.compose.animation.AnimatedVisibilityScopeImpl r4 = new androidx.compose.animation.AnimatedVisibilityScopeImpl
            r4.<init>(r11)
            r15.updateRememberedValue(r4)
        L_0x01d1:
            r15.endReplaceableGroup()
            androidx.compose.animation.AnimatedVisibilityScopeImpl r4 = (androidx.compose.animation.AnimatedVisibilityScopeImpl) r4
            java.lang.String r3 = "Built-in"
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            int r5 = r1 >> 3
            r6 = r5 & 112(0x70, float:1.57E-43)
            r2 = r2 | r6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r16 = r2 | r5
            r12 = r22
            r13 = r23
            r14 = r3
            r2 = r15
            androidx.compose.ui.Modifier r3 = androidx.compose.animation.EnterExitTransitionKt.createModifier(r11, r12, r13, r14, r15, r16)
            androidx.compose.ui.Modifier r3 = r8.then(r3)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r5)
            java.lang.Object r5 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r5 != r6) goto L_0x020b
            androidx.compose.animation.AnimatedEnterExitMeasurePolicy r5 = new androidx.compose.animation.AnimatedEnterExitMeasurePolicy
            r5.<init>(r4)
            r2.updateRememberedValue(r5)
        L_0x020b:
            r2.endReplaceableGroup()
            androidx.compose.ui.layout.MeasurePolicy r5 = (androidx.compose.p002ui.layout.MeasurePolicy) r5
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r6)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.p002ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r7 = r2.consume(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p002ui.unit.LayoutDirection) r7
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r11 = r2.consume(r11)
            androidx.compose.ui.platform.ViewConfiguration r11 = (androidx.compose.p002ui.platform.ViewConfiguration) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r13 = r12.getConstructor()
            of.p r3 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r3)
            androidx.compose.runtime.Applier r14 = r2.getApplier()
            boolean r14 = r14 instanceof androidx.compose.runtime.Applier
            if (r14 != 0) goto L_0x0249
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0249:
            r2.startReusableNode()
            boolean r14 = r2.getInserting()
            if (r14 == 0) goto L_0x0256
            r2.createNode(r13)
            goto L_0x0259
        L_0x0256:
            r2.useNode()
        L_0x0259:
            r2.disableReusing()
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r14 = r12.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r13, r5, r14)
            of.o r5 = r12.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r13, r6, r5)
            of.o r5 = r12.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r13, r7, r5)
            of.o r5 = r12.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r13, r11, r5)
            r2.enableReusing()
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r5 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r5, r2, r0)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = 1797450476(0x6b22eaec, float:1.9695537E26)
            r2.startReplaceableGroup(r0)
            int r0 = r1 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.invoke(r4, r2, r0)
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
        L_0x02b3:
            r2.endReplaceableGroup()
        L_0x02b6:
            androidx.compose.runtime.ScopeUpdateScope r11 = r2.endRestartGroup()
            if (r11 != 0) goto L_0x02bd
            goto L_0x02d4
        L_0x02bd:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2
            r0 = r12
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.updateScope(r12)
        L_0x02d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl(androidx.compose.animation.core.Transition, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, of.p, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(boolean r23, androidx.compose.p002ui.Modifier r24, androidx.compose.animation.EnterTransition r25, androidx.compose.animation.ExitTransition r26, java.lang.String r27, p404of.C13089p<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r8 = r28
            r9 = r30
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = 2088733774(0x7c7f8c4e, float:5.3075257E36)
            r1 = r29
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r0 = r31 & 1
            if (r0 == 0) goto L_0x001b
            r0 = r9 | 6
            r11 = r23
            goto L_0x002d
        L_0x001b:
            r0 = r9 & 14
            r11 = r23
            if (r0 != 0) goto L_0x002c
            boolean r0 = r10.changed((boolean) r11)
            if (r0 == 0) goto L_0x0029
            r0 = 4
            goto L_0x002a
        L_0x0029:
            r0 = 2
        L_0x002a:
            r0 = r0 | r9
            goto L_0x002d
        L_0x002c:
            r0 = r9
        L_0x002d:
            r1 = r31 & 2
            if (r1 == 0) goto L_0x0034
            r0 = r0 | 48
            goto L_0x0047
        L_0x0034:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0047
            r2 = r24
            boolean r3 = r10.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0043
            r3 = 32
            goto L_0x0045
        L_0x0043:
            r3 = 16
        L_0x0045:
            r0 = r0 | r3
            goto L_0x0049
        L_0x0047:
            r2 = r24
        L_0x0049:
            r3 = r31 & 4
            if (r3 == 0) goto L_0x0050
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            r4 = r25
            boolean r5 = r10.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r0 = r0 | r5
            goto L_0x0065
        L_0x0063:
            r4 = r25
        L_0x0065:
            r5 = r31 & 8
            if (r5 == 0) goto L_0x006c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007f
            r6 = r26
            boolean r7 = r10.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x007b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r0 = r0 | r7
            goto L_0x0081
        L_0x007f:
            r6 = r26
        L_0x0081:
            r7 = r31 & 16
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x008b
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r13 = r9 & r12
            if (r13 != 0) goto L_0x009e
            r13 = r27
            boolean r14 = r10.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x009a
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r0 = r0 | r14
            goto L_0x00a0
        L_0x009e:
            r13 = r27
        L_0x00a0:
            r14 = r31 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00aa
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a8:
            r0 = r0 | r14
            goto L_0x00ba
        L_0x00aa:
            r14 = r9 & r15
            if (r14 != 0) goto L_0x00ba
            boolean r14 = r10.changed((java.lang.Object) r8)
            if (r14 == 0) goto L_0x00b7
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00b7:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a8
        L_0x00ba:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r0
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d2
            boolean r14 = r10.getSkipping()
            if (r14 != 0) goto L_0x00ca
            goto L_0x00d2
        L_0x00ca:
            r10.skipToGroupEnd()
            r3 = r4
            r4 = r6
        L_0x00cf:
            r5 = r13
            goto L_0x014c
        L_0x00d2:
            if (r1 == 0) goto L_0x00d8
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r14 = r1
            goto L_0x00d9
        L_0x00d8:
            r14 = r2
        L_0x00d9:
            r1 = 0
            r2 = 3
            r15 = 0
            if (r3 == 0) goto L_0x00f9
            androidx.compose.animation.EnterTransition r3 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r15, r1, r2, r15)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            androidx.compose.animation.EnterTransition r4 = androidx.compose.animation.EnterExitTransitionKt.expandIn$default(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.EnterTransition r3 = r3.plus(r4)
            r16 = r3
            goto L_0x00fb
        L_0x00f9:
            r16 = r4
        L_0x00fb:
            if (r5 == 0) goto L_0x0117
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.ExitTransition r3 = androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.ExitTransition r1 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r15, r1, r2, r15)
            androidx.compose.animation.ExitTransition r1 = r3.plus(r1)
            r15 = r1
            goto L_0x0118
        L_0x0117:
            r15 = r6
        L_0x0118:
            if (r7 == 0) goto L_0x011d
            java.lang.String r1 = "AnimatedVisibility"
            r13 = r1
        L_0x011d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r23)
            r2 = r0 & 14
            int r3 = r0 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = 0
            androidx.compose.animation.core.Transition r1 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r13, (androidx.compose.runtime.Composer) r10, (int) r2, (int) r3)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1 r2 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1.INSTANCE
            int r3 = r0 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r3 = r3 & r12
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r4
            r7 = r3 | r0
            r0 = r1
            r1 = r2
            r2 = r14
            r3 = r16
            r4 = r15
            r5 = r28
            r6 = r10
            AnimatedEnterExitImpl(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00cf
        L_0x014c:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L_0x0153
            goto L_0x0164
        L_0x0153:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
            r0 = r12
            r1 = r23
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.updateScope(r12)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, Function1<? super T, Boolean> function1, T t, Composer composer, int i) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        composer.startMovableGroup(-721837481, transition);
        if (!transition.isSeeking()) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            if (function1.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else if (function1.invoke(t).booleanValue()) {
            enterExitState = EnterExitState.Visible;
        } else if (function1.invoke(transition.getCurrentState()).booleanValue()) {
            enterExitState = EnterExitState.PostExit;
        } else {
            enterExitState = EnterExitState.PreEnter;
        }
        composer.endMovableGroup();
        composer.endReplaceableGroup();
        return enterExitState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.RowScope r23, boolean r24, androidx.compose.p002ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, p404of.C13089p<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r8 = r29
            r9 = r31
            java.lang.String r0 = "<this>"
            r10 = r23
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = -1741346906(0xffffffff983527a6, float:-2.341372E-24)
            r1 = r30
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r0 = r32 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r9 | 48
            r12 = r24
            goto L_0x0036
        L_0x0022:
            r0 = r9 & 112(0x70, float:1.57E-43)
            r12 = r24
            if (r0 != 0) goto L_0x0035
            boolean r0 = r11.changed((boolean) r12)
            if (r0 == 0) goto L_0x0031
            r0 = 32
            goto L_0x0033
        L_0x0031:
            r0 = 16
        L_0x0033:
            r0 = r0 | r9
            goto L_0x0036
        L_0x0035:
            r0 = r9
        L_0x0036:
            r1 = r32 & 2
            if (r1 == 0) goto L_0x003d
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0050
        L_0x003d:
            r2 = r9 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0050
            r2 = r25
            boolean r3 = r11.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x004c
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x004e
        L_0x004c:
            r3 = 128(0x80, float:1.794E-43)
        L_0x004e:
            r0 = r0 | r3
            goto L_0x0052
        L_0x0050:
            r2 = r25
        L_0x0052:
            r3 = r32 & 4
            if (r3 == 0) goto L_0x0059
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x006c
        L_0x0059:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x006c
            r4 = r26
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0068
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x006a
        L_0x0068:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x006a:
            r0 = r0 | r5
            goto L_0x006e
        L_0x006c:
            r4 = r26
        L_0x006e:
            r5 = r32 & 8
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r5 == 0) goto L_0x0078
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008b
        L_0x0078:
            r7 = r9 & r6
            if (r7 != 0) goto L_0x008b
            r7 = r27
            boolean r13 = r11.changed((java.lang.Object) r7)
            if (r13 == 0) goto L_0x0087
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r0 = r0 | r13
            goto L_0x008d
        L_0x008b:
            r7 = r27
        L_0x008d:
            r13 = r32 & 16
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r13 == 0) goto L_0x0097
            r15 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r15
            goto L_0x00ab
        L_0x0097:
            r15 = r9 & r14
            if (r15 != 0) goto L_0x00ab
            r15 = r28
            boolean r16 = r11.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00a6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r0 = r0 | r16
            goto L_0x00ad
        L_0x00ab:
            r15 = r28
        L_0x00ad:
            r16 = r32 & 32
            if (r16 == 0) goto L_0x00b6
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b3:
            r0 = r0 | r16
            goto L_0x00c8
        L_0x00b6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x00c8
            boolean r16 = r11.changed((java.lang.Object) r8)
            if (r16 == 0) goto L_0x00c5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b3
        L_0x00c5:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b3
        L_0x00c8:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r14 = r0 & r16
            r6 = 599184(0x92490, float:8.39636E-40)
            if (r14 != r6) goto L_0x00e1
            boolean r6 = r11.getSkipping()
            if (r6 != 0) goto L_0x00d9
            goto L_0x00e1
        L_0x00d9:
            r11.skipToGroupEnd()
            r3 = r2
            r5 = r7
            r6 = r15
            goto L_0x0161
        L_0x00e1:
            if (r1 == 0) goto L_0x00e7
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r14 = r1
            goto L_0x00e8
        L_0x00e7:
            r14 = r2
        L_0x00e8:
            r1 = 0
            r2 = 3
            r6 = 0
            if (r3 == 0) goto L_0x0108
            androidx.compose.animation.EnterTransition r3 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r6, r1, r2, r6)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.EnterTransition r4 = androidx.compose.animation.EnterExitTransitionKt.expandHorizontally$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r3 = r3.plus(r4)
            r17 = r3
            goto L_0x010a
        L_0x0108:
            r17 = r4
        L_0x010a:
            if (r5 == 0) goto L_0x0122
            androidx.compose.animation.ExitTransition r1 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r6, r1, r2, r6)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            androidx.compose.animation.ExitTransition r2 = androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally$default(r2, r3, r4, r5, r6, r7)
            androidx.compose.animation.ExitTransition r1 = r1.plus(r2)
            r18 = r1
            goto L_0x0124
        L_0x0122:
            r18 = r7
        L_0x0124:
            if (r13 == 0) goto L_0x0129
            java.lang.String r1 = "AnimatedVisibility"
            r15 = r1
        L_0x0129:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r24)
            int r2 = r0 >> 3
            r3 = r2 & 14
            int r4 = r0 >> 12
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.animation.core.Transition r1 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r15, (androidx.compose.runtime.Composer) r11, (int) r3, (int) r4)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3 r3 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3.INSTANCE
            r4 = r0 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r0 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r5
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r7 = r0 | r2
            r0 = r1
            r1 = r3
            r2 = r14
            r3 = r17
            r4 = r18
            r5 = r29
            r6 = r11
            AnimatedEnterExitImpl(r0, r1, r2, r3, r4, r5, r6, r7)
            r3 = r14
            r6 = r15
            r4 = r17
            r5 = r18
        L_0x0161:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.endRestartGroup()
            if (r11 != 0) goto L_0x0168
            goto L_0x017b
        L_0x0168:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
            r0 = r13
            r1 = r23
            r2 = r24
            r7 = r29
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.updateScope(r13)
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope r23, boolean r24, androidx.compose.p002ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, p404of.C13089p<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r8 = r29
            r9 = r31
            java.lang.String r0 = "<this>"
            r10 = r23
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = 1766503102(0x694ab2be, float:1.5315444E25)
            r1 = r30
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r0 = r32 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r9 | 48
            r12 = r24
            goto L_0x0036
        L_0x0022:
            r0 = r9 & 112(0x70, float:1.57E-43)
            r12 = r24
            if (r0 != 0) goto L_0x0035
            boolean r0 = r11.changed((boolean) r12)
            if (r0 == 0) goto L_0x0031
            r0 = 32
            goto L_0x0033
        L_0x0031:
            r0 = 16
        L_0x0033:
            r0 = r0 | r9
            goto L_0x0036
        L_0x0035:
            r0 = r9
        L_0x0036:
            r1 = r32 & 2
            if (r1 == 0) goto L_0x003d
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0050
        L_0x003d:
            r2 = r9 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0050
            r2 = r25
            boolean r3 = r11.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x004c
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x004e
        L_0x004c:
            r3 = 128(0x80, float:1.794E-43)
        L_0x004e:
            r0 = r0 | r3
            goto L_0x0052
        L_0x0050:
            r2 = r25
        L_0x0052:
            r3 = r32 & 4
            if (r3 == 0) goto L_0x0059
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x006c
        L_0x0059:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x006c
            r4 = r26
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0068
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x006a
        L_0x0068:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x006a:
            r0 = r0 | r5
            goto L_0x006e
        L_0x006c:
            r4 = r26
        L_0x006e:
            r5 = r32 & 8
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r5 == 0) goto L_0x0078
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008b
        L_0x0078:
            r7 = r9 & r6
            if (r7 != 0) goto L_0x008b
            r7 = r27
            boolean r13 = r11.changed((java.lang.Object) r7)
            if (r13 == 0) goto L_0x0087
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r0 = r0 | r13
            goto L_0x008d
        L_0x008b:
            r7 = r27
        L_0x008d:
            r13 = r32 & 16
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r13 == 0) goto L_0x0097
            r15 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r15
            goto L_0x00ab
        L_0x0097:
            r15 = r9 & r14
            if (r15 != 0) goto L_0x00ab
            r15 = r28
            boolean r16 = r11.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00a6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r0 = r0 | r16
            goto L_0x00ad
        L_0x00ab:
            r15 = r28
        L_0x00ad:
            r16 = r32 & 32
            if (r16 == 0) goto L_0x00b6
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b3:
            r0 = r0 | r16
            goto L_0x00c8
        L_0x00b6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x00c8
            boolean r16 = r11.changed((java.lang.Object) r8)
            if (r16 == 0) goto L_0x00c5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b3
        L_0x00c5:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b3
        L_0x00c8:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r14 = r0 & r16
            r6 = 599184(0x92490, float:8.39636E-40)
            if (r14 != r6) goto L_0x00e1
            boolean r6 = r11.getSkipping()
            if (r6 != 0) goto L_0x00d9
            goto L_0x00e1
        L_0x00d9:
            r11.skipToGroupEnd()
            r3 = r2
            r5 = r7
            r6 = r15
            goto L_0x0161
        L_0x00e1:
            if (r1 == 0) goto L_0x00e7
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r14 = r1
            goto L_0x00e8
        L_0x00e7:
            r14 = r2
        L_0x00e8:
            r1 = 0
            r2 = 3
            r6 = 0
            if (r3 == 0) goto L_0x0108
            androidx.compose.animation.EnterTransition r3 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r6, r1, r2, r6)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.EnterTransition r4 = androidx.compose.animation.EnterExitTransitionKt.expandVertically$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r3 = r3.plus(r4)
            r17 = r3
            goto L_0x010a
        L_0x0108:
            r17 = r4
        L_0x010a:
            if (r5 == 0) goto L_0x0122
            androidx.compose.animation.ExitTransition r1 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r6, r1, r2, r6)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            androidx.compose.animation.ExitTransition r2 = androidx.compose.animation.EnterExitTransitionKt.shrinkVertically$default(r2, r3, r4, r5, r6, r7)
            androidx.compose.animation.ExitTransition r1 = r1.plus(r2)
            r18 = r1
            goto L_0x0124
        L_0x0122:
            r18 = r7
        L_0x0124:
            if (r13 == 0) goto L_0x0129
            java.lang.String r1 = "AnimatedVisibility"
            r15 = r1
        L_0x0129:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r24)
            int r2 = r0 >> 3
            r3 = r2 & 14
            int r4 = r0 >> 12
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.animation.core.Transition r1 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r15, (androidx.compose.runtime.Composer) r11, (int) r3, (int) r4)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5 r3 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5.INSTANCE
            r4 = r0 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r0 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r5
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r7 = r0 | r2
            r0 = r1
            r1 = r3
            r2 = r14
            r3 = r17
            r4 = r18
            r5 = r29
            r6 = r11
            AnimatedEnterExitImpl(r0, r1, r2, r3, r4, r5, r6, r7)
            r3 = r14
            r6 = r15
            r4 = r17
            r5 = r18
        L_0x0161:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.endRestartGroup()
            if (r11 != 0) goto L_0x0168
            goto L_0x017b
        L_0x0168:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
            r0 = r13
            r1 = r23
            r2 = r24
            r7 = r29
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.updateScope(r13)
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r23, androidx.compose.p002ui.Modifier r24, androidx.compose.animation.EnterTransition r25, androidx.compose.animation.ExitTransition r26, java.lang.String r27, p404of.C13089p<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r1 = r23
            r10 = r28
            r11 = r30
            java.lang.String r0 = "visibleState"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = -222898426(0xfffffffff2b6d706, float:-7.243036E30)
            r2 = r29
            androidx.compose.runtime.Composer r0 = r2.startRestartGroup(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0020
            r2 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x002f
            boolean r2 = r0.changed((java.lang.Object) r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r11
            goto L_0x0030
        L_0x002f:
            r2 = r11
        L_0x0030:
            r3 = r31 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x004a
        L_0x0037:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004a
            r4 = r24
            boolean r5 = r0.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0046
            r5 = 32
            goto L_0x0048
        L_0x0046:
            r5 = 16
        L_0x0048:
            r2 = r2 | r5
            goto L_0x004c
        L_0x004a:
            r4 = r24
        L_0x004c:
            r5 = r31 & 4
            if (r5 == 0) goto L_0x0053
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0066
            r6 = r25
            boolean r7 = r0.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0062
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r2 = r2 | r7
            goto L_0x0068
        L_0x0066:
            r6 = r25
        L_0x0068:
            r7 = r31 & 8
            if (r7 == 0) goto L_0x006f
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0082
            r8 = r26
            boolean r9 = r0.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r2 = r2 | r9
            goto L_0x0084
        L_0x0082:
            r8 = r26
        L_0x0084:
            r9 = r31 & 16
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008e:
            r13 = r11 & r12
            if (r13 != 0) goto L_0x00a1
            r13 = r27
            boolean r14 = r0.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x009d
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r2 = r2 | r14
            goto L_0x00a3
        L_0x00a1:
            r13 = r27
        L_0x00a3:
            r14 = r31 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00ad
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00ab:
            r2 = r2 | r14
            goto L_0x00bd
        L_0x00ad:
            r14 = r11 & r15
            if (r14 != 0) goto L_0x00bd
            boolean r14 = r0.changed((java.lang.Object) r10)
            if (r14 == 0) goto L_0x00ba
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00ba:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ab
        L_0x00bd:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r2
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d6
            boolean r14 = r0.getSkipping()
            if (r14 != 0) goto L_0x00cd
            goto L_0x00d6
        L_0x00cd:
            r0.skipToGroupEnd()
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r13
            goto L_0x0153
        L_0x00d6:
            if (r3 == 0) goto L_0x00dc
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            r14 = r3
            goto L_0x00dd
        L_0x00dc:
            r14 = r4
        L_0x00dd:
            r3 = 0
            r4 = 3
            r15 = 0
            if (r5 == 0) goto L_0x00fd
            androidx.compose.animation.EnterTransition r5 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r15, r3, r4, r15)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.expandIn$default(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.EnterTransition r5 = r5.plus(r6)
            r16 = r5
            goto L_0x00ff
        L_0x00fd:
            r16 = r6
        L_0x00ff:
            if (r7 == 0) goto L_0x011b
            androidx.compose.animation.ExitTransition r3 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r15, r3, r4, r15)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.ExitTransition r4 = androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.ExitTransition r3 = r3.plus(r4)
            r15 = r3
            goto L_0x011c
        L_0x011b:
            r15 = r8
        L_0x011c:
            if (r9 == 0) goto L_0x0121
            java.lang.String r3 = "AnimatedVisibility"
            r13 = r3
        L_0x0121:
            int r3 = androidx.compose.animation.core.MutableTransitionState.$stable
            r4 = r2 & 14
            r3 = r3 | r4
            int r4 = r2 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.animation.core.Transition r3 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r13, (androidx.compose.runtime.Composer) r0, (int) r3, (int) r4)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7 r4 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7.INSTANCE
            int r5 = r2 << 3
            r6 = r5 & 896(0x380, float:1.256E-42)
            r6 = r6 | 48
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r7
            r5 = r5 & r12
            r5 = r5 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r6
            r9 = r5 | r2
            r2 = r3
            r3 = r4
            r4 = r14
            r5 = r16
            r6 = r15
            r7 = r28
            r8 = r0
            AnimatedEnterExitImpl(r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r13
            r2 = r14
            r4 = r15
            r3 = r16
        L_0x0153:
            androidx.compose.runtime.ScopeUpdateScope r9 = r0.endRestartGroup()
            if (r9 != 0) goto L_0x015a
            goto L_0x016b
        L_0x015a:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
            r0 = r12
            r1 = r23
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.updateScope(r12)
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.RowScope r24, androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r25, androidx.compose.p002ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, p404of.C13089p<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r2 = r25
            r11 = r30
            r12 = r32
            java.lang.String r0 = "<this>"
            r1 = r24
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "visibleState"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = 836509870(0x31dc20ae, float:6.406558E-9)
            r3 = r31
            androidx.compose.runtime.Composer r0 = r3.startRestartGroup(r0)
            r3 = r33 & 1
            if (r3 == 0) goto L_0x0027
            r3 = r12 | 48
            goto L_0x0039
        L_0x0027:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0038
            boolean r3 = r0.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0034
            r3 = 32
            goto L_0x0036
        L_0x0034:
            r3 = 16
        L_0x0036:
            r3 = r3 | r12
            goto L_0x0039
        L_0x0038:
            r3 = r12
        L_0x0039:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0053
        L_0x0040:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0053
            r5 = r26
            boolean r6 = r0.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x004f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0051
        L_0x004f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0051:
            r3 = r3 | r6
            goto L_0x0055
        L_0x0053:
            r5 = r26
        L_0x0055:
            r6 = r33 & 4
            if (r6 == 0) goto L_0x005c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x006f
        L_0x005c:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x006f
            r7 = r27
            boolean r8 = r0.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x006b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r3 = r3 | r8
            goto L_0x0071
        L_0x006f:
            r7 = r27
        L_0x0071:
            r8 = r33 & 8
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x007b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007b:
            r10 = r12 & r9
            if (r10 != 0) goto L_0x008e
            r10 = r28
            boolean r13 = r0.changed((java.lang.Object) r10)
            if (r13 == 0) goto L_0x008a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x008a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r3 = r3 | r13
            goto L_0x0090
        L_0x008e:
            r10 = r28
        L_0x0090:
            r13 = r33 & 16
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r13 == 0) goto L_0x009a
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00ae
        L_0x009a:
            r15 = r12 & r14
            if (r15 != 0) goto L_0x00ae
            r15 = r29
            boolean r16 = r0.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00a9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r3 = r3 | r16
            goto L_0x00b0
        L_0x00ae:
            r15 = r29
        L_0x00b0:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00b9
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b6:
            r3 = r3 | r16
            goto L_0x00cb
        L_0x00b9:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00cb
            boolean r16 = r0.changed((java.lang.Object) r11)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b6
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b6
        L_0x00cb:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r14 = r3 & r16
            r9 = 599184(0x92490, float:8.39636E-40)
            if (r14 != r9) goto L_0x00e5
            boolean r9 = r0.getSkipping()
            if (r9 != 0) goto L_0x00dc
            goto L_0x00e5
        L_0x00dc:
            r0.skipToGroupEnd()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r15
            goto L_0x0169
        L_0x00e5:
            if (r4 == 0) goto L_0x00eb
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            r14 = r4
            goto L_0x00ec
        L_0x00eb:
            r14 = r5
        L_0x00ec:
            r4 = 0
            r5 = 3
            r9 = 0
            if (r6 == 0) goto L_0x010c
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.expandHorizontally$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r7 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r9, r4, r5, r9)
            androidx.compose.animation.EnterTransition r6 = r6.plus(r7)
            r17 = r6
            goto L_0x010e
        L_0x010c:
            r17 = r7
        L_0x010e:
            if (r8 == 0) goto L_0x012b
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.ExitTransition r6 = androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally$default(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.ExitTransition r4 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r9, r4, r5, r9)
            androidx.compose.animation.ExitTransition r4 = r6.plus(r4)
            r18 = r4
            goto L_0x012d
        L_0x012b:
            r18 = r10
        L_0x012d:
            if (r13 == 0) goto L_0x0132
            java.lang.String r4 = "AnimatedVisibility"
            r15 = r4
        L_0x0132:
            int r4 = androidx.compose.animation.core.MutableTransitionState.$stable
            int r5 = r3 >> 3
            r6 = r5 & 14
            r4 = r4 | r6
            int r6 = r3 >> 12
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            r6 = 0
            androidx.compose.animation.core.Transition r4 = androidx.compose.animation.core.TransitionKt.updateTransition(r2, (java.lang.String) r15, (androidx.compose.runtime.Composer) r0, (int) r4, (int) r6)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9 r6 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9.INSTANCE
            r7 = r3 & 896(0x380, float:1.256E-42)
            r7 = r7 | 48
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r8
            r3 = r3 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r7
            r10 = r3 | r5
            r3 = r4
            r4 = r6
            r5 = r14
            r6 = r17
            r7 = r18
            r8 = r30
            r9 = r0
            AnimatedEnterExitImpl(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = r14
            r6 = r15
            r4 = r17
            r5 = r18
        L_0x0169:
            androidx.compose.runtime.ScopeUpdateScope r10 = r0.endRestartGroup()
            if (r10 != 0) goto L_0x0170
            goto L_0x0183
        L_0x0170:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.updateScope(r13)
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope r24, androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r25, androidx.compose.p002ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, p404of.C13089p<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r2 = r25
            r11 = r30
            r12 = r32
            java.lang.String r0 = "<this>"
            r1 = r24
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "visibleState"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = -850656618(0xffffffffcd4c0296, float:-2.13920096E8)
            r3 = r31
            androidx.compose.runtime.Composer r0 = r3.startRestartGroup(r0)
            r3 = r33 & 1
            if (r3 == 0) goto L_0x0027
            r3 = r12 | 48
            goto L_0x0039
        L_0x0027:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0038
            boolean r3 = r0.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0034
            r3 = 32
            goto L_0x0036
        L_0x0034:
            r3 = 16
        L_0x0036:
            r3 = r3 | r12
            goto L_0x0039
        L_0x0038:
            r3 = r12
        L_0x0039:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0053
        L_0x0040:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0053
            r5 = r26
            boolean r6 = r0.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x004f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0051
        L_0x004f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0051:
            r3 = r3 | r6
            goto L_0x0055
        L_0x0053:
            r5 = r26
        L_0x0055:
            r6 = r33 & 4
            if (r6 == 0) goto L_0x005c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x006f
        L_0x005c:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x006f
            r7 = r27
            boolean r8 = r0.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x006b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r3 = r3 | r8
            goto L_0x0071
        L_0x006f:
            r7 = r27
        L_0x0071:
            r8 = r33 & 8
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x007b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007b:
            r10 = r12 & r9
            if (r10 != 0) goto L_0x008e
            r10 = r28
            boolean r13 = r0.changed((java.lang.Object) r10)
            if (r13 == 0) goto L_0x008a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x008a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r3 = r3 | r13
            goto L_0x0090
        L_0x008e:
            r10 = r28
        L_0x0090:
            r13 = r33 & 16
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r13 == 0) goto L_0x009a
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00ae
        L_0x009a:
            r15 = r12 & r14
            if (r15 != 0) goto L_0x00ae
            r15 = r29
            boolean r16 = r0.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00a9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r3 = r3 | r16
            goto L_0x00b0
        L_0x00ae:
            r15 = r29
        L_0x00b0:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00b9
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b6:
            r3 = r3 | r16
            goto L_0x00cb
        L_0x00b9:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00cb
            boolean r16 = r0.changed((java.lang.Object) r11)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b6
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b6
        L_0x00cb:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r14 = r3 & r16
            r9 = 599184(0x92490, float:8.39636E-40)
            if (r14 != r9) goto L_0x00e5
            boolean r9 = r0.getSkipping()
            if (r9 != 0) goto L_0x00dc
            goto L_0x00e5
        L_0x00dc:
            r0.skipToGroupEnd()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r15
            goto L_0x0169
        L_0x00e5:
            if (r4 == 0) goto L_0x00eb
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            r14 = r4
            goto L_0x00ec
        L_0x00eb:
            r14 = r5
        L_0x00ec:
            r4 = 0
            r5 = 3
            r9 = 0
            if (r6 == 0) goto L_0x010c
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.expandVertically$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r7 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r9, r4, r5, r9)
            androidx.compose.animation.EnterTransition r6 = r6.plus(r7)
            r17 = r6
            goto L_0x010e
        L_0x010c:
            r17 = r7
        L_0x010e:
            if (r8 == 0) goto L_0x012b
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.ExitTransition r6 = androidx.compose.animation.EnterExitTransitionKt.shrinkVertically$default(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.ExitTransition r4 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r9, r4, r5, r9)
            androidx.compose.animation.ExitTransition r4 = r6.plus(r4)
            r18 = r4
            goto L_0x012d
        L_0x012b:
            r18 = r10
        L_0x012d:
            if (r13 == 0) goto L_0x0132
            java.lang.String r4 = "AnimatedVisibility"
            r15 = r4
        L_0x0132:
            int r4 = androidx.compose.animation.core.MutableTransitionState.$stable
            int r5 = r3 >> 3
            r6 = r5 & 14
            r4 = r4 | r6
            int r6 = r3 >> 12
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            r6 = 0
            androidx.compose.animation.core.Transition r4 = androidx.compose.animation.core.TransitionKt.updateTransition(r2, (java.lang.String) r15, (androidx.compose.runtime.Composer) r0, (int) r4, (int) r6)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11 r6 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11.INSTANCE
            r7 = r3 & 896(0x380, float:1.256E-42)
            r7 = r7 | 48
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r8
            r3 = r3 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r7
            r10 = r3 | r5
            r3 = r4
            r4 = r6
            r5 = r14
            r6 = r17
            r7 = r18
            r8 = r30
            r9 = r0
            AnimatedEnterExitImpl(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = r14
            r6 = r15
            r4 = r17
            r5 = r18
        L_0x0169:
            androidx.compose.runtime.ScopeUpdateScope r10 = r0.endRestartGroup()
            if (r10 != 0) goto L_0x0170
            goto L_0x0183
        L_0x0170:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.updateScope(r13)
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void AnimatedVisibility(androidx.compose.animation.core.Transition<T> r23, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r24, androidx.compose.p002ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, p404of.C13089p<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r8 = r23
            r9 = r24
            r10 = r28
            r11 = r30
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "visible"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = 1031950689(0x3d825161, float:0.06363178)
            r1 = r29
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r31 & r0
            if (r0 == 0) goto L_0x0029
            r0 = r11 | 6
            goto L_0x0039
        L_0x0029:
            r0 = r11 & 14
            if (r0 != 0) goto L_0x0038
            boolean r0 = r12.changed((java.lang.Object) r8)
            if (r0 == 0) goto L_0x0035
            r0 = 4
            goto L_0x0036
        L_0x0035:
            r0 = 2
        L_0x0036:
            r0 = r0 | r11
            goto L_0x0039
        L_0x0038:
            r0 = r11
        L_0x0039:
            r1 = r31 & 1
            if (r1 == 0) goto L_0x0040
            r0 = r0 | 48
            goto L_0x0050
        L_0x0040:
            r1 = r11 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0050
            boolean r1 = r12.changed((java.lang.Object) r9)
            if (r1 == 0) goto L_0x004d
            r1 = 32
            goto L_0x004f
        L_0x004d:
            r1 = 16
        L_0x004f:
            r0 = r0 | r1
        L_0x0050:
            r1 = r31 & 2
            if (r1 == 0) goto L_0x0057
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006a
            r2 = r25
            boolean r3 = r12.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0066
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r0 = r0 | r3
            goto L_0x006c
        L_0x006a:
            r2 = r25
        L_0x006c:
            r3 = r31 & 4
            if (r3 == 0) goto L_0x0073
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r4 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0086
            r4 = r26
            boolean r5 = r12.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0082
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r0 = r0 | r5
            goto L_0x0088
        L_0x0086:
            r4 = r26
        L_0x0088:
            r5 = r31 & 8
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r5 == 0) goto L_0x0092
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0092:
            r7 = r11 & r6
            if (r7 != 0) goto L_0x00a5
            r7 = r27
            boolean r13 = r12.changed((java.lang.Object) r7)
            if (r13 == 0) goto L_0x00a1
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r0 = r0 | r13
            goto L_0x00a7
        L_0x00a5:
            r7 = r27
        L_0x00a7:
            r13 = r31 & 16
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r13 == 0) goto L_0x00b1
            r13 = 196608(0x30000, float:2.75506E-40)
        L_0x00af:
            r0 = r0 | r13
            goto L_0x00c1
        L_0x00b1:
            r13 = r11 & r14
            if (r13 != 0) goto L_0x00c1
            boolean r13 = r12.changed((java.lang.Object) r10)
            if (r13 == 0) goto L_0x00be
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00be:
            r13 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00af
        L_0x00c1:
            r13 = 374491(0x5b6db, float:5.24774E-40)
            r13 = r13 & r0
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r15) goto L_0x00d8
            boolean r13 = r12.getSkipping()
            if (r13 != 0) goto L_0x00d1
            goto L_0x00d8
        L_0x00d1:
            r12.skipToGroupEnd()
            r3 = r2
            r5 = r7
            goto L_0x0141
        L_0x00d8:
            if (r1 == 0) goto L_0x00de
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r13 = r1
            goto L_0x00df
        L_0x00de:
            r13 = r2
        L_0x00df:
            r1 = 3
            r2 = 0
            r15 = 0
            if (r3 == 0) goto L_0x00ff
            androidx.compose.animation.EnterTransition r3 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r15, r2, r1, r15)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            androidx.compose.animation.EnterTransition r4 = androidx.compose.animation.EnterExitTransitionKt.expandIn$default(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.EnterTransition r3 = r3.plus(r4)
            r16 = r3
            goto L_0x0101
        L_0x00ff:
            r16 = r4
        L_0x0101:
            if (r5 == 0) goto L_0x011d
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.ExitTransition r3 = androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.ExitTransition r1 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r15, r2, r1, r15)
            androidx.compose.animation.ExitTransition r1 = r3.plus(r1)
            r15 = r1
            goto L_0x011e
        L_0x011d:
            r15 = r7
        L_0x011e:
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r6
            r1 = r1 | r2
            r0 = r0 & r14
            r7 = r1 | r0
            r0 = r23
            r1 = r24
            r2 = r13
            r3 = r16
            r4 = r15
            r5 = r28
            r6 = r12
            AnimatedEnterExitImpl(r0, r1, r2, r3, r4, r5, r6, r7)
            r3 = r13
            r5 = r15
            r4 = r16
        L_0x0141:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.endRestartGroup()
            if (r12 != 0) goto L_0x0148
            goto L_0x015b
        L_0x0148:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
            r0 = r13
            r1 = r23
            r2 = r24
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.updateScope(r13)
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.Transition, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(boolean r17, androidx.compose.p002ui.Modifier r18, androidx.compose.animation.EnterTransition r19, androidx.compose.animation.ExitTransition r20, boolean r21, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r9 = r19
            r10 = r20
            r11 = r22
            r12 = r24
            java.lang.String r0 = "enter"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "exit"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = 1121582420(0x42d9fd54, float:108.99478)
            r1 = r23
            androidx.compose.runtime.Composer r13 = r1.startRestartGroup(r0)
            r0 = r25 & 1
            if (r0 == 0) goto L_0x0029
            r0 = r12 | 6
            r14 = r17
            goto L_0x003b
        L_0x0029:
            r0 = r12 & 14
            r14 = r17
            if (r0 != 0) goto L_0x003a
            boolean r0 = r13.changed((boolean) r14)
            if (r0 == 0) goto L_0x0037
            r0 = 4
            goto L_0x0038
        L_0x0037:
            r0 = 2
        L_0x0038:
            r0 = r0 | r12
            goto L_0x003b
        L_0x003a:
            r0 = r12
        L_0x003b:
            r1 = r25 & 2
            if (r1 == 0) goto L_0x0042
            r0 = r0 | 48
            goto L_0x0055
        L_0x0042:
            r2 = r12 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0055
            r2 = r18
            boolean r3 = r13.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0051
            r3 = 32
            goto L_0x0053
        L_0x0051:
            r3 = 16
        L_0x0053:
            r0 = r0 | r3
            goto L_0x0057
        L_0x0055:
            r2 = r18
        L_0x0057:
            r3 = r25 & 4
            if (r3 == 0) goto L_0x005e
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r3 = r12 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x006e
            boolean r3 = r13.changed((java.lang.Object) r9)
            if (r3 == 0) goto L_0x006b
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r3 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r0 = r0 | r3
        L_0x006e:
            r3 = r25 & 8
            if (r3 == 0) goto L_0x0075
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0085
        L_0x0075:
            r3 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0085
            boolean r3 = r13.changed((java.lang.Object) r10)
            if (r3 == 0) goto L_0x0082
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r0 = r0 | r3
        L_0x0085:
            r3 = r25 & 16
            if (r3 == 0) goto L_0x008e
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r15 = r21
            goto L_0x00a2
        L_0x008e:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r15 = r21
            if (r3 != 0) goto L_0x00a2
            boolean r3 = r13.changed((boolean) r15)
            if (r3 == 0) goto L_0x009f
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r0 = r0 | r3
        L_0x00a2:
            r3 = r25 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00aa
            r0 = r0 | r4
            goto L_0x00bb
        L_0x00aa:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r12
            if (r3 != 0) goto L_0x00bb
            boolean r3 = r13.changed((java.lang.Object) r11)
            if (r3 == 0) goto L_0x00b8
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r0 = r0 | r3
        L_0x00bb:
            r3 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r0
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r5) goto L_0x00cf
            boolean r3 = r13.getSkipping()
            if (r3 != 0) goto L_0x00cb
            goto L_0x00cf
        L_0x00cb:
            r13.skipToGroupEnd()
            goto L_0x012e
        L_0x00cf:
            if (r1 == 0) goto L_0x00d6
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r16 = r1
            goto L_0x00d8
        L_0x00d6:
            r16 = r2
        L_0x00d8:
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r1)
            java.lang.Object r1 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x00f6
            androidx.compose.animation.core.MutableTransitionState r1 = new androidx.compose.animation.core.MutableTransitionState
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r21)
            r1.<init>(r2)
            r13.updateRememberedValue(r1)
        L_0x00f6:
            r13.endReplaceableGroup()
            androidx.compose.animation.core.MutableTransitionState r1 = (androidx.compose.animation.core.MutableTransitionState) r1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            r1.setTargetState(r2)
            r5 = 0
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16 r2 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
            r2.<init>(r11, r0)
            r3 = 1996320812(0x76fd702c, float:2.5701684E33)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r3, r6, r2)
            int r2 = androidx.compose.animation.core.MutableTransitionState.$stable
            r2 = r2 | r4
            r3 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r7 = r2 | r0
            r8 = 16
            r0 = r1
            r1 = r16
            r2 = r19
            r3 = r20
            r4 = r5
            r5 = r6
            r6 = r13
            AnimatedVisibility((androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean>) r0, (androidx.compose.p002ui.Modifier) r1, (androidx.compose.animation.EnterTransition) r2, (androidx.compose.animation.ExitTransition) r3, (java.lang.String) r4, (p404of.C13089p<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r5, (androidx.compose.runtime.Composer) r6, (int) r7, (int) r8)
            r2 = r16
        L_0x012e:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.endRestartGroup()
            if (r13 != 0) goto L_0x0135
            goto L_0x014d
        L_0x0135:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17 r8 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17
            r0 = r8
            r1 = r17
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r24
            r9 = r8
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.updateScope(r9)
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, boolean, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    private static final void AnimatedEnterExitImpl(Transition<EnterExitState> transition, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, C13089p<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, C11921v> pVar, Composer composer, int i) {
        composer.startReplaceableGroup(-1967270694);
        EnterExitState currentState = transition.getCurrentState();
        EnterExitState enterExitState = EnterExitState.Visible;
        if (currentState == enterExitState || transition.getTargetState() == enterExitState) {
            int i2 = i & 14;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed((Object) transition);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedVisibilityScopeImpl(transition);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue;
            int i3 = i >> 3;
            Modifier then = modifier.then(EnterExitTransitionKt.createModifier(transition, enterTransition, exitTransition, "Built-in", composer, i2 | 3072 | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH)));
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(then);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer r3 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r3, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r3, density, companion.getSetDensity());
            Updater.m35299setimpl(r3, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r3, viewConfiguration, companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(1797450476);
            pVar.invoke(animatedVisibilityScopeImpl, composer, Integer.valueOf(((i >> 9) & 112) | 8));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }
}
