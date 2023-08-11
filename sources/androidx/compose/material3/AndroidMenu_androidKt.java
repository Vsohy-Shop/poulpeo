package androidx.compose.material3;

/* compiled from: AndroidMenu.android.kt */
public final class AndroidMenu_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: of.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d0  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: DropdownMenu-ILWXrKs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34247DropdownMenuILWXrKs(boolean r25, p404of.C13074a<p336ef.C11921v> r26, androidx.compose.p002ui.Modifier r27, long r28, androidx.compose.p002ui.window.PopupProperties r30, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r7 = r26
            r8 = r31
            r9 = r33
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = 354826666(0x152639aa, float:3.3568922E-26)
            r1 = r32
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r34 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0023
            r1 = r9 | 6
            r11 = r25
            goto L_0x0035
        L_0x0023:
            r1 = r9 & 14
            r11 = r25
            if (r1 != 0) goto L_0x0034
            boolean r1 = r10.changed((boolean) r11)
            if (r1 == 0) goto L_0x0031
            r1 = 4
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            r1 = r1 | r9
            goto L_0x0035
        L_0x0034:
            r1 = r9
        L_0x0035:
            r3 = r34 & 2
            if (r3 == 0) goto L_0x003c
            r1 = r1 | 48
            goto L_0x004c
        L_0x003c:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            boolean r3 = r10.changed((java.lang.Object) r7)
            if (r3 == 0) goto L_0x0049
            r3 = 32
            goto L_0x004b
        L_0x0049:
            r3 = 16
        L_0x004b:
            r1 = r1 | r3
        L_0x004c:
            r3 = r34 & 4
            if (r3 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0066
            r4 = r27
            boolean r5 = r10.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0062
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r5
            goto L_0x0068
        L_0x0066:
            r4 = r27
        L_0x0068:
            r5 = r34 & 8
            if (r5 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r12 = r28
            goto L_0x0083
        L_0x0071:
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            r12 = r28
            if (r6 != 0) goto L_0x0083
            boolean r6 = r10.changed((long) r12)
            if (r6 == 0) goto L_0x0080
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r1 = r1 | r6
        L_0x0083:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r9
            if (r6 != 0) goto L_0x009e
            r6 = r34 & 16
            if (r6 != 0) goto L_0x0098
            r6 = r30
            boolean r14 = r10.changed((java.lang.Object) r6)
            if (r14 == 0) goto L_0x009a
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x0098:
            r6 = r30
        L_0x009a:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r14
            goto L_0x00a0
        L_0x009e:
            r6 = r30
        L_0x00a0:
            r14 = r34 & 32
            if (r14 == 0) goto L_0x00a8
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a6:
            r1 = r1 | r14
            goto L_0x00b9
        L_0x00a8:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00b9
            boolean r14 = r10.changed((java.lang.Object) r8)
            if (r14 == 0) goto L_0x00b6
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00b6:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a6
        L_0x00b9:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r1
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d0
            boolean r14 = r10.getSkipping()
            if (r14 != 0) goto L_0x00c9
            goto L_0x00d0
        L_0x00c9:
            r10.skipToGroupEnd()
            r3 = r4
            r4 = r12
            goto L_0x0214
        L_0x00d0:
            r10.startDefaults()
            r14 = r9 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r14 == 0) goto L_0x00f0
            boolean r14 = r10.getDefaultsInvalid()
            if (r14 == 0) goto L_0x00e1
            goto L_0x00f0
        L_0x00e1:
            r10.skipToGroupEnd()
            r3 = r34 & 16
            if (r3 == 0) goto L_0x00e9
            r1 = r1 & r15
        L_0x00e9:
            r21 = r6
            r19 = r12
            r6 = r1
            r12 = r4
            goto L_0x012f
        L_0x00f0:
            if (r3 == 0) goto L_0x00f5
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00f6
        L_0x00f5:
            r3 = r4
        L_0x00f6:
            if (r5 == 0) goto L_0x0107
            r4 = 0
            float r4 = (float) r4
            float r5 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r4)
            float r4 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r4)
            long r4 = androidx.compose.p002ui.unit.DpKt.m38489DpOffsetYgX7TsA(r5, r4)
            r12 = r4
        L_0x0107:
            r4 = r34 & 16
            if (r4 == 0) goto L_0x0129
            androidx.compose.ui.window.PopupProperties r4 = new androidx.compose.ui.window.PopupProperties
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 62
            r24 = 0
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r1 & r15
            r6 = r1
            r21 = r4
            r19 = r12
            goto L_0x012e
        L_0x0129:
            r21 = r6
            r19 = r12
            r6 = r1
        L_0x012e:
            r12 = r3
        L_0x012f:
            r10.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x013e
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r1, r3)
        L_0x013e:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.Object r1 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r3.getEmpty()
            if (r1 != r4) goto L_0x015a
            androidx.compose.animation.core.MutableTransitionState r1 = new androidx.compose.animation.core.MutableTransitionState
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.<init>(r4)
            r10.updateRememberedValue(r1)
        L_0x015a:
            r10.endReplaceableGroup()
            androidx.compose.animation.core.MutableTransitionState r1 = (androidx.compose.animation.core.MutableTransitionState) r1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r25)
            r1.setTargetState(r4)
            java.lang.Object r4 = r1.getCurrentState()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x017e
            java.lang.Object r4 = r1.getTargetState()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0206
        L_0x017e:
            r10.startReplaceableGroup(r0)
            java.lang.Object r0 = r10.rememberedValue()
            java.lang.Object r4 = r3.getEmpty()
            if (r0 != r4) goto L_0x019d
            androidx.compose.ui.graphics.TransformOrigin$Companion r0 = androidx.compose.p002ui.graphics.TransformOrigin.Companion
            long r4 = r0.m36093getCenterSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r0 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r4)
            r4 = 0
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r4, r2, r4)
            r10.updateRememberedValue(r0)
        L_0x019d:
            r10.endReplaceableGroup()
            r2 = r0
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r10.consume(r0)
            r16 = r0
            androidx.compose.ui.unit.Density r16 = (androidx.compose.p002ui.unit.Density) r16
            r0 = 1157296644(0x44faf204, float:2007.563)
            r10.startReplaceableGroup(r0)
            boolean r0 = r10.changed((java.lang.Object) r2)
            java.lang.Object r4 = r10.rememberedValue()
            if (r0 != 0) goto L_0x01c5
            java.lang.Object r0 = r3.getEmpty()
            if (r4 != r0) goto L_0x01cd
        L_0x01c5:
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 r4 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
            r4.<init>(r2)
            r10.updateRememberedValue(r4)
        L_0x01cd:
            r10.endReplaceableGroup()
            r17 = r4
            of.o r17 = (p404of.C13088o) r17
            r18 = 0
            androidx.compose.material3.DropdownMenuPositionProvider r22 = new androidx.compose.material3.DropdownMenuPositionProvider
            r13 = r22
            r14 = r19
            r13.<init>(r14, r16, r17, r18)
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1 r13 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
            r0 = r13
            r3 = r12
            r4 = r31
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1192563503(0xffffffffb8eaecd1, float:-1.12021E-4)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r0, r1, r13)
            r0 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r1 = r6 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r6 = 0
            r0 = r22
            r1 = r26
            r2 = r21
            r4 = r10
            androidx.compose.p002ui.window.AndroidPopup_androidKt.Popup(r0, r1, r2, r3, r4, r5, r6)
        L_0x0206:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x020f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x020f:
            r3 = r12
            r4 = r19
            r6 = r21
        L_0x0214:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L_0x021b
            goto L_0x022e
        L_0x021b:
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2 r12 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
            r0 = r12
            r1 = r25
            r2 = r26
            r7 = r31
            r8 = r33
            r9 = r34
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            r10.updateScope(r12)
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidMenu_androidKt.m34247DropdownMenuILWXrKs(boolean, of.a, androidx.compose.ui.Modifier, long, androidx.compose.ui.window.PopupProperties, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012d  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DropdownMenuItem(p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r35, p404of.C13074a<p336ef.C11921v> r36, androidx.compose.p002ui.Modifier r37, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r38, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r39, boolean r40, androidx.compose.material3.MenuItemColors r41, androidx.compose.foundation.layout.PaddingValues r42, androidx.compose.foundation.interaction.MutableInteractionSource r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            r11 = r35
            r12 = r36
            r13 = r45
            r14 = r46
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = 1826340448(0x6cdbbe60, float:2.1252302E27)
            r1 = r44
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r10.changed((java.lang.Object) r11)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0049
            boolean r2 = r10.changed((java.lang.Object) r12)
            if (r2 == 0) goto L_0x0046
            r2 = 32
            goto L_0x0048
        L_0x0046:
            r2 = 16
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0063
            r3 = r37
            boolean r4 = r10.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
            goto L_0x0065
        L_0x0063:
            r3 = r37
        L_0x0065:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007f
            r5 = r38
            boolean r6 = r10.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x007b
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r6
            goto L_0x0081
        L_0x007f:
            r5 = r38
        L_0x0081:
            r6 = r14 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r8 = r13 & r7
            if (r8 != 0) goto L_0x009e
            r8 = r39
            boolean r9 = r10.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x009a
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r9
            goto L_0x00a0
        L_0x009e:
            r8 = r39
        L_0x00a0:
            r9 = r14 & 32
            r31 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00aa
            r15 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r15
            goto L_0x00be
        L_0x00aa:
            r15 = r13 & r31
            if (r15 != 0) goto L_0x00be
            r15 = r40
            boolean r16 = r10.changed((boolean) r15)
            if (r16 == 0) goto L_0x00b9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r16
            goto L_0x00c0
        L_0x00be:
            r15 = r40
        L_0x00c0:
            r32 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r32
            if (r16 != 0) goto L_0x00da
            r16 = r14 & 64
            r7 = r41
            if (r16 != 0) goto L_0x00d5
            boolean r16 = r10.changed((java.lang.Object) r7)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r1 = r1 | r16
            goto L_0x00dc
        L_0x00da:
            r7 = r41
        L_0x00dc:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r33 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00e9
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r3 = r42
            goto L_0x00fc
        L_0x00e9:
            r16 = r13 & r33
            r3 = r42
            if (r16 != 0) goto L_0x00fc
            boolean r16 = r10.changed((java.lang.Object) r3)
            if (r16 == 0) goto L_0x00f8
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r1 = r1 | r16
        L_0x00fc:
            r3 = r14 & 256(0x100, float:3.59E-43)
            r34 = 234881024(0xe000000, float:1.5777218E-30)
            if (r3 == 0) goto L_0x0109
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r16
            r5 = r43
            goto L_0x011c
        L_0x0109:
            r16 = r13 & r34
            r5 = r43
            if (r16 != 0) goto L_0x011c
            boolean r16 = r10.changed((java.lang.Object) r5)
            if (r16 == 0) goto L_0x0118
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011a
        L_0x0118:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011a:
            r1 = r1 | r16
        L_0x011c:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r5 = r1 & r16
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r5 != r7) goto L_0x0140
            boolean r5 = r10.getSkipping()
            if (r5 != 0) goto L_0x012d
            goto L_0x0140
        L_0x012d:
            r10.skipToGroupEnd()
            r3 = r37
            r4 = r38
            r7 = r41
            r9 = r43
            r5 = r8
            r23 = r10
            r6 = r15
            r8 = r42
            goto L_0x023c
        L_0x0140:
            r10.startDefaults()
            r5 = r13 & 1
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r5 == 0) goto L_0x0169
            boolean r5 = r10.getDefaultsInvalid()
            if (r5 == 0) goto L_0x0151
            goto L_0x0169
        L_0x0151:
            r10.skipToGroupEnd()
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0159
            r1 = r1 & r7
        L_0x0159:
            r16 = r38
            r19 = r41
            r20 = r42
            r21 = r43
            r17 = r8
            r18 = r15
            r15 = r37
            goto L_0x01de
        L_0x0169:
            if (r2 == 0) goto L_0x016e
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0170
        L_0x016e:
            r2 = r37
        L_0x0170:
            r5 = 0
            if (r4 == 0) goto L_0x0175
            r4 = r5
            goto L_0x0177
        L_0x0175:
            r4 = r38
        L_0x0177:
            if (r6 == 0) goto L_0x017a
            goto L_0x017b
        L_0x017a:
            r5 = r8
        L_0x017b:
            if (r9 == 0) goto L_0x017f
            r6 = 1
            goto L_0x0180
        L_0x017f:
            r6 = r15
        L_0x0180:
            r8 = r14 & 64
            if (r8 == 0) goto L_0x019e
            androidx.compose.material3.MenuDefaults r15 = androidx.compose.material3.MenuDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 1572864(0x180000, float:2.204052E-39)
            r30 = 63
            r28 = r10
            androidx.compose.material3.MenuItemColors r8 = r15.m34486itemColors5tl4gsc(r16, r18, r20, r22, r24, r26, r28, r29, r30)
            r1 = r1 & r7
            goto L_0x01a0
        L_0x019e:
            r8 = r41
        L_0x01a0:
            if (r0 == 0) goto L_0x01a9
            androidx.compose.material3.MenuDefaults r0 = androidx.compose.material3.MenuDefaults.INSTANCE
            androidx.compose.foundation.layout.PaddingValues r0 = r0.getDropdownMenuItemContentPadding()
            goto L_0x01ab
        L_0x01a9:
            r0 = r42
        L_0x01ab:
            if (r3 == 0) goto L_0x01d1
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r3)
            java.lang.Object r3 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r3 != r7) goto L_0x01c6
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r3)
        L_0x01c6:
            r10.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r20 = r0
            r15 = r2
            r21 = r3
            goto L_0x01d6
        L_0x01d1:
            r21 = r43
            r20 = r0
            r15 = r2
        L_0x01d6:
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r8
        L_0x01de:
            r10.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01f0
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)"
            r3 = 1826340448(0x6cdbbe60, float:2.1252302E27)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01f0:
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
            r2 = r1 & r31
            r0 = r0 | r2
            r2 = r1 & r32
            r0 = r0 | r2
            r2 = r1 & r33
            r0 = r0 | r2
            r1 = r1 & r34
            r22 = r0 | r1
            r0 = r35
            r1 = r36
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r10
            r23 = r10
            r10 = r22
            androidx.compose.material3.MenuKt.DropdownMenuItemContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x022f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x022f:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
        L_0x023c:
            androidx.compose.runtime.ScopeUpdateScope r15 = r23.endRestartGroup()
            if (r15 != 0) goto L_0x0243
            goto L_0x0255
        L_0x0243:
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2 r10 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
            r0 = r10
            r1 = r35
            r2 = r36
            r12 = r10
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.updateScope(r12)
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem(of.o, of.a, androidx.compose.ui.Modifier, of.o, of.o, boolean, androidx.compose.material3.MenuItemColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }
}
