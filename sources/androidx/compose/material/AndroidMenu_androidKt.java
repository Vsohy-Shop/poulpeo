package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,145:1\n154#2:146\n25#3:147\n25#3:154\n36#3:162\n25#3:169\n1114#4,6:148\n1114#4,6:155\n1114#4,6:163\n1114#4,6:170\n76#5:161\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n*L\n78#1:146\n82#1:147\n86#1:154\n91#1:162\n133#1:169\n82#1:148,6\n86#1:155,6\n91#1:163,6\n133#1:170,6\n87#1:161\n*E\n"})
/* compiled from: AndroidMenu.android.kt */
public final class AndroidMenu_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: of.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d2  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: DropdownMenu-ILWXrKs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33872DropdownMenuILWXrKs(boolean r26, p404of.C13074a<p336ef.C11921v> r27, androidx.compose.p002ui.Modifier r28, long r29, androidx.compose.p002ui.window.PopupProperties r31, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r7 = r27
            r8 = r32
            r9 = r34
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = -840283139(0xffffffffcdea4bfd, float:-4.91356064E8)
            r1 = r33
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r35 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r9 | 6
            r11 = r26
            goto L_0x0034
        L_0x0022:
            r1 = r9 & 14
            r11 = r26
            if (r1 != 0) goto L_0x0033
            boolean r1 = r10.changed((boolean) r11)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r9
            goto L_0x0034
        L_0x0033:
            r1 = r9
        L_0x0034:
            r3 = r35 & 2
            if (r3 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            boolean r3 = r10.changedInstance(r7)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r1 = r1 | r3
        L_0x004b:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0065
            r4 = r28
            boolean r5 = r10.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0061
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r5
            goto L_0x0067
        L_0x0065:
            r4 = r28
        L_0x0067:
            r5 = r35 & 8
            if (r5 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r12 = r29
            goto L_0x0082
        L_0x0070:
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            r12 = r29
            if (r6 != 0) goto L_0x0082
            boolean r6 = r10.changed((long) r12)
            if (r6 == 0) goto L_0x007f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r6
        L_0x0082:
            r6 = r35 & 16
            if (r6 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x0089:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x009e
            r14 = r31
            boolean r15 = r10.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x009a
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r15
            goto L_0x00a0
        L_0x009e:
            r14 = r31
        L_0x00a0:
            r15 = r35 & 32
            if (r15 == 0) goto L_0x00a8
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00a6:
            r1 = r1 | r15
            goto L_0x00b9
        L_0x00a8:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00b9
            boolean r15 = r10.changedInstance(r8)
            if (r15 == 0) goto L_0x00b6
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00b6:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a6
        L_0x00b9:
            r15 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r15
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x00d2
            boolean r1 = r10.getSkipping()
            if (r1 != 0) goto L_0x00ca
            goto L_0x00d2
        L_0x00ca:
            r10.skipToGroupEnd()
            r3 = r4
            r4 = r12
            r6 = r14
            goto L_0x01ea
        L_0x00d2:
            if (r3 == 0) goto L_0x00d9
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r16 = r1
            goto L_0x00db
        L_0x00d9:
            r16 = r4
        L_0x00db:
            if (r5 == 0) goto L_0x00ec
            r1 = 0
            float r1 = (float) r1
            float r2 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            long r1 = androidx.compose.p002ui.unit.DpKt.m38489DpOffsetYgX7TsA(r2, r1)
            r12 = r1
        L_0x00ec:
            if (r6 == 0) goto L_0x0106
            androidx.compose.ui.window.PopupProperties r1 = new androidx.compose.ui.window.PopupProperties
            r18 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 62
            r25 = 0
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r14 = r1
        L_0x0106:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0112
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:73)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r15, r1, r2)
        L_0x0112:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.Object r1 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r2.getEmpty()
            if (r1 != r3) goto L_0x012e
            androidx.compose.animation.core.MutableTransitionState r1 = new androidx.compose.animation.core.MutableTransitionState
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.<init>(r3)
            r10.updateRememberedValue(r1)
        L_0x012e:
            r10.endReplaceableGroup()
            androidx.compose.animation.core.MutableTransitionState r1 = (androidx.compose.animation.core.MutableTransitionState) r1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r26)
            r1.setTargetState(r3)
            java.lang.Object r3 = r1.getCurrentState()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0152
            java.lang.Object r3 = r1.getTargetState()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x01dd
        L_0x0152:
            r10.startReplaceableGroup(r0)
            java.lang.Object r0 = r10.rememberedValue()
            java.lang.Object r3 = r2.getEmpty()
            if (r0 != r3) goto L_0x0172
            androidx.compose.ui.graphics.TransformOrigin$Companion r0 = androidx.compose.p002ui.graphics.TransformOrigin.Companion
            long r3 = r0.m36093getCenterSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r0 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r3)
            r3 = 0
            r4 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r3, r4, r3)
            r10.updateRememberedValue(r0)
        L_0x0172:
            r10.endReplaceableGroup()
            r3 = r0
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r10.consume(r0)
            r20 = r0
            androidx.compose.ui.unit.Density r20 = (androidx.compose.p002ui.unit.Density) r20
            r0 = 1157296644(0x44faf204, float:2007.563)
            r10.startReplaceableGroup(r0)
            boolean r0 = r10.changed((java.lang.Object) r3)
            java.lang.Object r4 = r10.rememberedValue()
            if (r0 != 0) goto L_0x019a
            java.lang.Object r0 = r2.getEmpty()
            if (r4 != r0) goto L_0x01a2
        L_0x019a:
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 r4 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
            r4.<init>(r3)
            r10.updateRememberedValue(r4)
        L_0x01a2:
            r10.endReplaceableGroup()
            r21 = r4
            of.o r21 = (p404of.C13088o) r21
            r22 = 0
            androidx.compose.material.DropdownMenuPositionProvider r6 = new androidx.compose.material.DropdownMenuPositionProvider
            r17 = r6
            r18 = r12
            r17.<init>(r18, r20, r21, r22)
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1 r5 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
            r0 = r5
            r2 = r3
            r3 = r16
            r4 = r32
            r7 = r5
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 79632374(0x4bf17f6, float:4.492589E-36)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r0, r1, r7)
            r0 = r15 & 112(0x70, float:1.57E-43)
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r1 = r15 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r7 = 0
            r0 = r6
            r1 = r27
            r2 = r14
            r4 = r10
            r6 = r7
            androidx.compose.p002ui.window.AndroidPopup_androidKt.Popup(r0, r1, r2, r3, r4, r5, r6)
        L_0x01dd:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01e6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e6:
            r4 = r12
            r6 = r14
            r3 = r16
        L_0x01ea:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L_0x01f1
            goto L_0x0204
        L_0x01f1:
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2 r12 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
            r0 = r12
            r1 = r26
            r2 = r27
            r7 = r32
            r8 = r34
            r9 = r35
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            r10.updateScope(r12)
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidMenu_androidKt.m33872DropdownMenuILWXrKs(boolean, of.a, androidx.compose.ui.Modifier, long, androidx.compose.ui.window.PopupProperties, of.p, androidx.compose.runtime.Composer, int, int):void");
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
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DropdownMenuItem(p404of.C13074a<p336ef.C11921v> r18, androidx.compose.p002ui.Modifier r19, boolean r20, androidx.compose.foundation.layout.PaddingValues r21, androidx.compose.foundation.interaction.MutableInteractionSource r22, p404of.C13089p<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r9 = r18
            r10 = r23
            r11 = r25
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = -1988562892(0xffffffff8978f034, float:-2.9964857E-33)
            r1 = r24
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            r1 = r26 & 1
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
            r2 = r26 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x004a
        L_0x0037:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004a
            r3 = r19
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
            r3 = r19
        L_0x004c:
            r4 = r26 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r5 = r11 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0066
            r5 = r20
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
            r5 = r20
        L_0x0068:
            r6 = r26 & 8
            if (r6 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0082
            r7 = r21
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
            r7 = r21
        L_0x0084:
            r8 = r26 & 16
            r13 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008e:
            r14 = r11 & r13
            if (r14 != 0) goto L_0x00a1
            r14 = r22
            boolean r15 = r12.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x009d
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r15
            goto L_0x00a3
        L_0x00a1:
            r14 = r22
        L_0x00a3:
            r15 = r26 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00ad
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00ab:
            r1 = r1 | r15
            goto L_0x00bd
        L_0x00ad:
            r15 = r11 & r16
            if (r15 != 0) goto L_0x00bd
            boolean r15 = r12.changedInstance(r10)
            if (r15 == 0) goto L_0x00ba
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00ba:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ab
        L_0x00bd:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r13) goto L_0x00d6
            boolean r13 = r12.getSkipping()
            if (r13 != 0) goto L_0x00cd
            goto L_0x00d6
        L_0x00cd:
            r12.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r14
            goto L_0x014d
        L_0x00d6:
            if (r2 == 0) goto L_0x00dc
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            r13 = r2
            goto L_0x00dd
        L_0x00dc:
            r13 = r3
        L_0x00dd:
            if (r4 == 0) goto L_0x00e2
            r2 = 1
            r15 = r2
            goto L_0x00e3
        L_0x00e2:
            r15 = r5
        L_0x00e3:
            if (r6 == 0) goto L_0x00ee
            androidx.compose.material.MenuDefaults r2 = androidx.compose.material.MenuDefaults.INSTANCE
            androidx.compose.foundation.layout.PaddingValues r2 = r2.getDropdownMenuItemContentPadding()
            r17 = r2
            goto L_0x00f0
        L_0x00ee:
            r17 = r7
        L_0x00f0:
            if (r8 == 0) goto L_0x0111
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r2)
            java.lang.Object r2 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x010b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r12.updateRememberedValue(r2)
        L_0x010b:
            r12.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r14 = r2
        L_0x0111:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x011d
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:127)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x011d:
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r7 = r0 | r1
            r8 = 0
            r0 = r18
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r23
            r6 = r12
            androidx.compose.material.MenuKt.DropdownMenuItemContent(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0148
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0148:
            r2 = r13
            r5 = r14
            r3 = r15
            r4 = r17
        L_0x014d:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.endRestartGroup()
            if (r12 != 0) goto L_0x0154
            goto L_0x0165
        L_0x0154:
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$2 r13 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$2
            r0 = r13
            r1 = r18
            r6 = r23
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.updateScope(r13)
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem(of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, of.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
