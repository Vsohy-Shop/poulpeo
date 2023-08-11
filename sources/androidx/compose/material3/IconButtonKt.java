package androidx.compose.material3;

/* compiled from: IconButton.kt */
public final class IconButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f3  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FilledIconButton(p404of.C13074a<p336ef.C11921v> r27, androidx.compose.p002ui.Modifier r28, boolean r29, androidx.compose.p002ui.graphics.Shape r30, androidx.compose.material3.IconButtonColors r31, androidx.compose.foundation.interaction.MutableInteractionSource r32, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r13 = r27
            r11 = r33
            r3 = r35
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = 1594730011(0x5f0da61b, float:1.0206875E19)
            r1 = r34
            androidx.compose.runtime.Composer r2 = r1.startRestartGroup(r0)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r3 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r3 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r2.changed((java.lang.Object) r13)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r3
            goto L_0x0030
        L_0x002f:
            r1 = r3
        L_0x0030:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x004a
        L_0x0037:
            r5 = r3 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r28
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r1 = r1 | r6
            goto L_0x004c
        L_0x004a:
            r5 = r28
        L_0x004c:
            r6 = r36 & 4
            if (r6 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r7 = r3 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0066
            r7 = r29
            boolean r8 = r2.changed((boolean) r7)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r8
            goto L_0x0068
        L_0x0066:
            r7 = r29
        L_0x0068:
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0081
            r8 = r36 & 8
            if (r8 != 0) goto L_0x007b
            r8 = r30
            boolean r9 = r2.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x007d
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007b:
            r8 = r30
        L_0x007d:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r9
            goto L_0x0083
        L_0x0081:
            r8 = r30
        L_0x0083:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r3
            if (r9 != 0) goto L_0x009e
            r9 = r36 & 16
            if (r9 != 0) goto L_0x0098
            r9 = r31
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x009a
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x0098:
            r9 = r31
        L_0x009a:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r10
            goto L_0x00a0
        L_0x009e:
            r9 = r31
        L_0x00a0:
            r10 = r36 & 32
            if (r10 == 0) goto L_0x00a8
            r12 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r12
            goto L_0x00bc
        L_0x00a8:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r3
            if (r12 != 0) goto L_0x00bc
            r12 = r32
            boolean r14 = r2.changed((java.lang.Object) r12)
            if (r14 == 0) goto L_0x00b8
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r14
            goto L_0x00be
        L_0x00bc:
            r12 = r32
        L_0x00be:
            r14 = r36 & 64
            if (r14 == 0) goto L_0x00c6
            r14 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c4:
            r1 = r1 | r14
            goto L_0x00d7
        L_0x00c6:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r3
            if (r14 != 0) goto L_0x00d7
            boolean r14 = r2.changed((java.lang.Object) r11)
            if (r14 == 0) goto L_0x00d4
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00d4:
            r14 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c4
        L_0x00d7:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r1
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r15) goto L_0x00f3
            boolean r14 = r2.getSkipping()
            if (r14 != 0) goto L_0x00e7
            goto L_0x00f3
        L_0x00e7:
            r2.skipToGroupEnd()
            r22 = r2
            r2 = r5
            r3 = r7
            r4 = r8
            r5 = r9
            r6 = r12
            goto L_0x020d
        L_0x00f3:
            r2.startDefaults()
            r14 = r3 & 1
            r26 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 1
            if (r14 == 0) goto L_0x0120
            boolean r14 = r2.getDefaultsInvalid()
            if (r14 == 0) goto L_0x0105
            goto L_0x0120
        L_0x0105:
            r2.skipToGroupEnd()
            r4 = r36 & 8
            if (r4 == 0) goto L_0x010e
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x010e:
            r4 = r36 & 16
            if (r4 == 0) goto L_0x0114
            r1 = r1 & r26
        L_0x0114:
            r17 = r5
            r18 = r8
            r19 = r12
            r14 = r15
            r12 = r1
            r1 = r7
        L_0x011d:
            r15 = r9
            goto L_0x0189
        L_0x0120:
            if (r4 == 0) goto L_0x0125
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0126
        L_0x0125:
            r4 = r5
        L_0x0126:
            if (r6 == 0) goto L_0x0129
            r7 = r15
        L_0x0129:
            r5 = r36 & 8
            if (r5 == 0) goto L_0x0137
            androidx.compose.material3.IconButtonDefaults r5 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r6 = 6
            androidx.compose.ui.graphics.Shape r5 = r5.getFilledShape(r2, r6)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r5
        L_0x0137:
            r5 = r36 & 16
            if (r5 == 0) goto L_0x0156
            androidx.compose.material3.IconButtonDefaults r14 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r5 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r25 = 15
            r9 = r15
            r15 = r5
            r23 = r2
            androidx.compose.material3.IconButtonColors r5 = r14.m34456filledIconButtonColorsro_MJ88(r15, r17, r19, r21, r23, r24, r25)
            r1 = r1 & r26
            r14 = r9
            r9 = r5
            goto L_0x0157
        L_0x0156:
            r14 = r15
        L_0x0157:
            if (r10 == 0) goto L_0x0180
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r5)
            java.lang.Object r5 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r5 != r6) goto L_0x0172
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r2.updateRememberedValue(r5)
        L_0x0172:
            r2.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = (androidx.compose.foundation.interaction.MutableInteractionSource) r5
            r12 = r1
            r17 = r4
            r19 = r5
            r1 = r7
            r18 = r8
            goto L_0x011d
        L_0x0180:
            r17 = r4
            r18 = r8
            r15 = r9
            r19 = r12
            r12 = r1
            r1 = r7
        L_0x0189:
            r2.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x0198
            r4 = -1
            java.lang.String r5 = "androidx.compose.material3.FilledIconButton (IconButton.kt:196)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r4, r5)
        L_0x0198:
            int r0 = r12 >> 6
            r0 = r0 & 14
            int r4 = r12 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r0 = r0 | r4
            androidx.compose.runtime.State r4 = r15.containerColor$material3_release(r1, r2, r0)
            java.lang.Object r4 = r4.getValue()
            androidx.compose.ui.graphics.Color r4 = (androidx.compose.p002ui.graphics.Color) r4
            long r4 = r4.m35681unboximpl()
            androidx.compose.runtime.State r0 = r15.contentColor$material3_release(r1, r2, r0)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r6 = r0.m35681unboximpl()
            r8 = 0
            r9 = 0
            r10 = 0
            androidx.compose.material3.IconButtonKt$FilledIconButton$2 r0 = new androidx.compose.material3.IconButtonKt$FilledIconButton$2
            r0.<init>(r11, r12)
            r8 = -1560623888(0xffffffffa2fac4f0, float:-6.797115E-18)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r8, r14, r0)
            r8 = r12
            r12 = r0
            r0 = r8 & 14
            r14 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 | r14
            r14 = r8 & 896(0x380, float:1.256E-42)
            r0 = r0 | r14
            r14 = r8 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r14
            int r8 = r8 << 12
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r8 = r8 & r14
            r14 = r0 | r8
            r0 = 6
            r20 = r15
            r15 = r0
            r16 = 448(0x1c0, float:6.28E-43)
            r0 = r27
            r21 = r1
            r1 = r17
            r22 = r2
            r2 = r21
            r3 = r18
            r11 = r19
            r13 = r22
            r8 = 0
            androidx.compose.material3.SurfaceKt.m34605Surfaceo_FOJdg(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0203
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0203:
            r2 = r17
            r4 = r18
            r6 = r19
            r5 = r20
            r3 = r21
        L_0x020d:
            androidx.compose.runtime.ScopeUpdateScope r10 = r22.endRestartGroup()
            if (r10 != 0) goto L_0x0214
            goto L_0x0225
        L_0x0214:
            androidx.compose.material3.IconButtonKt$FilledIconButton$3 r11 = new androidx.compose.material3.IconButtonKt$FilledIconButton$3
            r0 = r11
            r1 = r27
            r7 = r33
            r8 = r35
            r9 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.updateScope(r11)
        L_0x0225:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.FilledIconButton(of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0112  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FilledIconToggleButton(boolean r33, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r34, androidx.compose.p002ui.Modifier r35, boolean r36, androidx.compose.p002ui.graphics.Shape r37, androidx.compose.material3.IconToggleButtonColors r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            r14 = r33
            r12 = r34
            r4 = r40
            r3 = r42
            r1 = r43
            java.lang.String r0 = "onCheckedChange"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = -1708189280(0xffffffff9a2f19a0, float:-3.620985E-23)
            r2 = r41
            androidx.compose.runtime.Composer r13 = r2.startRestartGroup(r0)
            r2 = r1 & 1
            if (r2 == 0) goto L_0x0024
            r2 = r3 | 6
            goto L_0x0034
        L_0x0024:
            r2 = r3 & 14
            if (r2 != 0) goto L_0x0033
            boolean r2 = r13.changed((boolean) r14)
            if (r2 == 0) goto L_0x0030
            r2 = 4
            goto L_0x0031
        L_0x0030:
            r2 = 2
        L_0x0031:
            r2 = r2 | r3
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            r5 = r1 & 2
            if (r5 == 0) goto L_0x003b
            r2 = r2 | 48
            goto L_0x004b
        L_0x003b:
            r5 = r3 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            boolean r5 = r13.changed((java.lang.Object) r12)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r2 = r2 | r5
        L_0x004b:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r6 = r3 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r35
            boolean r7 = r13.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0061
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r2 = r2 | r7
            goto L_0x0067
        L_0x0065:
            r6 = r35
        L_0x0067:
            r7 = r1 & 8
            if (r7 == 0) goto L_0x006e
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0081
            r8 = r36
            boolean r9 = r13.changed((boolean) r8)
            if (r9 == 0) goto L_0x007d
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r2 = r2 | r9
            goto L_0x0083
        L_0x0081:
            r8 = r36
        L_0x0083:
            r31 = 57344(0xe000, float:8.0356E-41)
            r9 = r3 & r31
            if (r9 != 0) goto L_0x009f
            r9 = r1 & 16
            if (r9 != 0) goto L_0x0099
            r9 = r37
            boolean r10 = r13.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x009b
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r9 = r37
        L_0x009b:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r2 = r2 | r10
            goto L_0x00a1
        L_0x009f:
            r9 = r37
        L_0x00a1:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x00bb
            r10 = r1 & 32
            if (r10 != 0) goto L_0x00b5
            r10 = r38
            boolean r11 = r13.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x00b7
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b5:
            r10 = r38
        L_0x00b7:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r2 = r2 | r11
            goto L_0x00bd
        L_0x00bb:
            r10 = r38
        L_0x00bd:
            r11 = r1 & 64
            if (r11 == 0) goto L_0x00c5
            r15 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r15
            goto L_0x00da
        L_0x00c5:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r3
            if (r15 != 0) goto L_0x00da
            r15 = r39
            boolean r16 = r13.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r2 = r2 | r16
            goto L_0x00dc
        L_0x00da:
            r15 = r39
        L_0x00dc:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e4
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e2:
            r2 = r2 | r0
            goto L_0x00f5
        L_0x00e4:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r13.changed((java.lang.Object) r4)
            if (r0 == 0) goto L_0x00f2
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e2
        L_0x00f2:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e2
        L_0x00f5:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r2
            r6 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r6) goto L_0x0112
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x0105
            goto L_0x0112
        L_0x0105:
            r13.skipToGroupEnd()
            r3 = r35
            r4 = r8
            r5 = r9
            r6 = r10
            r22 = r13
            r7 = r15
            goto L_0x0248
        L_0x0112:
            r13.startDefaults()
            r0 = r3 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r10 = 1
            if (r0 == 0) goto L_0x0141
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0127
            goto L_0x0141
        L_0x0127:
            r13.skipToGroupEnd()
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0130
            r2 = r2 & r16
        L_0x0130:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0135
            r2 = r2 & r6
        L_0x0135:
            r0 = r35
            r11 = r38
            r18 = r9
            r19 = r15
            r9 = r2
        L_0x013e:
            r15 = r8
            goto L_0x01a8
        L_0x0141:
            if (r5 == 0) goto L_0x0146
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0148
        L_0x0146:
            r0 = r35
        L_0x0148:
            if (r7 == 0) goto L_0x014b
            r8 = r10
        L_0x014b:
            r5 = r1 & 16
            if (r5 == 0) goto L_0x0159
            androidx.compose.material3.IconButtonDefaults r5 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r7 = 6
            androidx.compose.ui.graphics.Shape r5 = r5.getFilledShape(r13, r7)
            r2 = r2 & r16
            goto L_0x015a
        L_0x0159:
            r5 = r9
        L_0x015a:
            r7 = r1 & 32
            if (r7 == 0) goto L_0x0179
            androidx.compose.material3.IconButtonDefaults r7 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 1572864(0x180000, float:2.204052E-39)
            r30 = 63
            r15 = r7
            r28 = r13
            androidx.compose.material3.IconToggleButtonColors r7 = r15.m34457filledIconToggleButtonColors5tl4gsc(r16, r18, r20, r22, r24, r26, r28, r29, r30)
            r2 = r2 & r6
            goto L_0x017b
        L_0x0179:
            r7 = r38
        L_0x017b:
            if (r11 == 0) goto L_0x01a1
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r6)
            java.lang.Object r6 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r6 != r9) goto L_0x0196
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r13.updateRememberedValue(r6)
        L_0x0196:
            r13.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = (androidx.compose.foundation.interaction.MutableInteractionSource) r6
            r9 = r2
            r18 = r5
            r19 = r6
            goto L_0x01a6
        L_0x01a1:
            r19 = r39
            r9 = r2
            r18 = r5
        L_0x01a6:
            r11 = r7
            goto L_0x013e
        L_0x01a8:
            r13.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x01ba
            r2 = -1
            java.lang.String r5 = "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:314)"
            r6 = -1708189280(0xffffffff9a2f19a0, float:-3.620985E-23)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r9, r2, r5)
        L_0x01ba:
            androidx.compose.material3.IconButtonKt$FilledIconToggleButton$2 r2 = androidx.compose.material3.IconButtonKt$FilledIconToggleButton$2.INSTANCE
            r5 = 0
            r6 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r0, r6, r2, r10, r5)
            int r5 = r9 >> 9
            r6 = r5 & 14
            int r7 = r9 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            r5 = r5 & 896(0x380, float:1.256E-42)
            r7 = r6 | r5
            androidx.compose.runtime.State r5 = r11.containerColor$material3_release(r15, r14, r13, r7)
            java.lang.Object r5 = r5.getValue()
            androidx.compose.ui.graphics.Color r5 = (androidx.compose.p002ui.graphics.Color) r5
            long r5 = r5.m35681unboximpl()
            androidx.compose.runtime.State r7 = r11.contentColor$material3_release(r15, r14, r13, r7)
            java.lang.Object r7 = r7.getValue()
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.p002ui.graphics.Color) r7
            long r7 = r7.m35681unboximpl()
            r16 = 0
            r32 = r9
            r9 = r16
            r9 = r10
            r10 = r16
            r16 = 0
            r20 = r11
            r11 = r16
            androidx.compose.material3.IconButtonKt$FilledIconToggleButton$3 r10 = new androidx.compose.material3.IconButtonKt$FilledIconToggleButton$3
            r11 = r32
            r10.<init>(r4, r11)
            r21 = r0
            r0 = 1235871670(0x49a9e7b6, float:1391862.8)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r0, r9, r10)
            r22 = r13
            r13 = r0
            r0 = r11 & 14
            r9 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 | r9
            r9 = r11 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r9
            r9 = r11 & r31
            r0 = r0 | r9
            r23 = r15
            r15 = r0
            int r0 = r11 >> 18
            r0 = r0 & 14
            r16 = r0 | 48
            r17 = 896(0x380, float:1.256E-42)
            r0 = r33
            r1 = r34
            r3 = r23
            r4 = r18
            r12 = r19
            r14 = r22
            r9 = 0
            r10 = 0
            r11 = 0
            androidx.compose.material3.SurfaceKt.m34603Surfaced85dljk((boolean) r0, (kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v>) r1, (androidx.compose.p002ui.Modifier) r2, (boolean) r3, (androidx.compose.p002ui.graphics.Shape) r4, (long) r5, (long) r7, (float) r9, (float) r10, (androidx.compose.foundation.BorderStroke) r11, (androidx.compose.foundation.interaction.MutableInteractionSource) r12, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r13, (androidx.compose.runtime.Composer) r14, (int) r15, (int) r16, (int) r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x023e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x023e:
            r5 = r18
            r7 = r19
            r6 = r20
            r3 = r21
            r4 = r23
        L_0x0248:
            androidx.compose.runtime.ScopeUpdateScope r11 = r22.endRestartGroup()
            if (r11 != 0) goto L_0x024f
            goto L_0x0262
        L_0x024f:
            androidx.compose.material3.IconButtonKt$FilledIconToggleButton$4 r12 = new androidx.compose.material3.IconButtonKt$FilledIconToggleButton$4
            r0 = r12
            r1 = r33
            r2 = r34
            r8 = r40
            r9 = r42
            r10 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.updateScope(r12)
        L_0x0262:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.FilledIconToggleButton(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconToggleButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f3  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FilledTonalIconButton(p404of.C13074a<p336ef.C11921v> r27, androidx.compose.p002ui.Modifier r28, boolean r29, androidx.compose.p002ui.graphics.Shape r30, androidx.compose.material3.IconButtonColors r31, androidx.compose.foundation.interaction.MutableInteractionSource r32, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r13 = r27
            r11 = r33
            r3 = r35
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = -783937767(0xffffffffd1460f19, float:-5.3166051E10)
            r1 = r34
            androidx.compose.runtime.Composer r2 = r1.startRestartGroup(r0)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r3 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r3 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r2.changed((java.lang.Object) r13)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r3
            goto L_0x0030
        L_0x002f:
            r1 = r3
        L_0x0030:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x004a
        L_0x0037:
            r5 = r3 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r28
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r1 = r1 | r6
            goto L_0x004c
        L_0x004a:
            r5 = r28
        L_0x004c:
            r6 = r36 & 4
            if (r6 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r7 = r3 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0066
            r7 = r29
            boolean r8 = r2.changed((boolean) r7)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r8
            goto L_0x0068
        L_0x0066:
            r7 = r29
        L_0x0068:
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0081
            r8 = r36 & 8
            if (r8 != 0) goto L_0x007b
            r8 = r30
            boolean r9 = r2.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x007d
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007b:
            r8 = r30
        L_0x007d:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r9
            goto L_0x0083
        L_0x0081:
            r8 = r30
        L_0x0083:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r3
            if (r9 != 0) goto L_0x009e
            r9 = r36 & 16
            if (r9 != 0) goto L_0x0098
            r9 = r31
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x009a
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x0098:
            r9 = r31
        L_0x009a:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r10
            goto L_0x00a0
        L_0x009e:
            r9 = r31
        L_0x00a0:
            r10 = r36 & 32
            if (r10 == 0) goto L_0x00a8
            r12 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r12
            goto L_0x00bc
        L_0x00a8:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r3
            if (r12 != 0) goto L_0x00bc
            r12 = r32
            boolean r14 = r2.changed((java.lang.Object) r12)
            if (r14 == 0) goto L_0x00b8
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r14
            goto L_0x00be
        L_0x00bc:
            r12 = r32
        L_0x00be:
            r14 = r36 & 64
            if (r14 == 0) goto L_0x00c6
            r14 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c4:
            r1 = r1 | r14
            goto L_0x00d7
        L_0x00c6:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r3
            if (r14 != 0) goto L_0x00d7
            boolean r14 = r2.changed((java.lang.Object) r11)
            if (r14 == 0) goto L_0x00d4
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00d4:
            r14 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c4
        L_0x00d7:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r1
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r15) goto L_0x00f3
            boolean r14 = r2.getSkipping()
            if (r14 != 0) goto L_0x00e7
            goto L_0x00f3
        L_0x00e7:
            r2.skipToGroupEnd()
            r22 = r2
            r2 = r5
            r3 = r7
            r4 = r8
            r5 = r9
            r6 = r12
            goto L_0x020d
        L_0x00f3:
            r2.startDefaults()
            r14 = r3 & 1
            r26 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 1
            if (r14 == 0) goto L_0x0120
            boolean r14 = r2.getDefaultsInvalid()
            if (r14 == 0) goto L_0x0105
            goto L_0x0120
        L_0x0105:
            r2.skipToGroupEnd()
            r4 = r36 & 8
            if (r4 == 0) goto L_0x010e
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x010e:
            r4 = r36 & 16
            if (r4 == 0) goto L_0x0114
            r1 = r1 & r26
        L_0x0114:
            r17 = r5
            r18 = r8
            r19 = r12
            r14 = r15
            r12 = r1
            r1 = r7
        L_0x011d:
            r15 = r9
            goto L_0x0189
        L_0x0120:
            if (r4 == 0) goto L_0x0125
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0126
        L_0x0125:
            r4 = r5
        L_0x0126:
            if (r6 == 0) goto L_0x0129
            r7 = r15
        L_0x0129:
            r5 = r36 & 8
            if (r5 == 0) goto L_0x0137
            androidx.compose.material3.IconButtonDefaults r5 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r6 = 6
            androidx.compose.ui.graphics.Shape r5 = r5.getFilledShape(r2, r6)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r5
        L_0x0137:
            r5 = r36 & 16
            if (r5 == 0) goto L_0x0156
            androidx.compose.material3.IconButtonDefaults r14 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r5 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r25 = 15
            r9 = r15
            r15 = r5
            r23 = r2
            androidx.compose.material3.IconButtonColors r5 = r14.m34458filledTonalIconButtonColorsro_MJ88(r15, r17, r19, r21, r23, r24, r25)
            r1 = r1 & r26
            r14 = r9
            r9 = r5
            goto L_0x0157
        L_0x0156:
            r14 = r15
        L_0x0157:
            if (r10 == 0) goto L_0x0180
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r5)
            java.lang.Object r5 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r5 != r6) goto L_0x0172
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r2.updateRememberedValue(r5)
        L_0x0172:
            r2.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = (androidx.compose.foundation.interaction.MutableInteractionSource) r5
            r12 = r1
            r17 = r4
            r19 = r5
            r1 = r7
            r18 = r8
            goto L_0x011d
        L_0x0180:
            r17 = r4
            r18 = r8
            r15 = r9
            r19 = r12
            r12 = r1
            r1 = r7
        L_0x0189:
            r2.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x0198
            r4 = -1
            java.lang.String r5 = "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:257)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r4, r5)
        L_0x0198:
            int r0 = r12 >> 6
            r0 = r0 & 14
            int r4 = r12 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r0 = r0 | r4
            androidx.compose.runtime.State r4 = r15.containerColor$material3_release(r1, r2, r0)
            java.lang.Object r4 = r4.getValue()
            androidx.compose.ui.graphics.Color r4 = (androidx.compose.p002ui.graphics.Color) r4
            long r4 = r4.m35681unboximpl()
            androidx.compose.runtime.State r0 = r15.contentColor$material3_release(r1, r2, r0)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r6 = r0.m35681unboximpl()
            r8 = 0
            r9 = 0
            r10 = 0
            androidx.compose.material3.IconButtonKt$FilledTonalIconButton$2 r0 = new androidx.compose.material3.IconButtonKt$FilledTonalIconButton$2
            r0.<init>(r11, r12)
            r8 = -1772884636(0xffffffff9653ed64, float:-1.7119352E-25)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r8, r14, r0)
            r8 = r12
            r12 = r0
            r0 = r8 & 14
            r14 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 | r14
            r14 = r8 & 896(0x380, float:1.256E-42)
            r0 = r0 | r14
            r14 = r8 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r14
            int r8 = r8 << 12
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r8 = r8 & r14
            r14 = r0 | r8
            r0 = 6
            r20 = r15
            r15 = r0
            r16 = 448(0x1c0, float:6.28E-43)
            r0 = r27
            r21 = r1
            r1 = r17
            r22 = r2
            r2 = r21
            r3 = r18
            r11 = r19
            r13 = r22
            r8 = 0
            androidx.compose.material3.SurfaceKt.m34605Surfaceo_FOJdg(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0203
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0203:
            r2 = r17
            r4 = r18
            r6 = r19
            r5 = r20
            r3 = r21
        L_0x020d:
            androidx.compose.runtime.ScopeUpdateScope r10 = r22.endRestartGroup()
            if (r10 != 0) goto L_0x0214
            goto L_0x0225
        L_0x0214:
            androidx.compose.material3.IconButtonKt$FilledTonalIconButton$3 r11 = new androidx.compose.material3.IconButtonKt$FilledTonalIconButton$3
            r0 = r11
            r1 = r27
            r7 = r33
            r8 = r35
            r9 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.updateScope(r11)
        L_0x0225:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.FilledTonalIconButton(of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0112  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FilledTonalIconToggleButton(boolean r33, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r34, androidx.compose.p002ui.Modifier r35, boolean r36, androidx.compose.p002ui.graphics.Shape r37, androidx.compose.material3.IconToggleButtonColors r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            r14 = r33
            r12 = r34
            r4 = r40
            r3 = r42
            r1 = r43
            java.lang.String r0 = "onCheckedChange"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = 1676089246(0x63e7179e, float:8.5257994E21)
            r2 = r41
            androidx.compose.runtime.Composer r13 = r2.startRestartGroup(r0)
            r2 = r1 & 1
            if (r2 == 0) goto L_0x0024
            r2 = r3 | 6
            goto L_0x0034
        L_0x0024:
            r2 = r3 & 14
            if (r2 != 0) goto L_0x0033
            boolean r2 = r13.changed((boolean) r14)
            if (r2 == 0) goto L_0x0030
            r2 = 4
            goto L_0x0031
        L_0x0030:
            r2 = 2
        L_0x0031:
            r2 = r2 | r3
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            r5 = r1 & 2
            if (r5 == 0) goto L_0x003b
            r2 = r2 | 48
            goto L_0x004b
        L_0x003b:
            r5 = r3 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            boolean r5 = r13.changed((java.lang.Object) r12)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r2 = r2 | r5
        L_0x004b:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r6 = r3 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r35
            boolean r7 = r13.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0061
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r2 = r2 | r7
            goto L_0x0067
        L_0x0065:
            r6 = r35
        L_0x0067:
            r7 = r1 & 8
            if (r7 == 0) goto L_0x006e
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0081
            r8 = r36
            boolean r9 = r13.changed((boolean) r8)
            if (r9 == 0) goto L_0x007d
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r2 = r2 | r9
            goto L_0x0083
        L_0x0081:
            r8 = r36
        L_0x0083:
            r31 = 57344(0xe000, float:8.0356E-41)
            r9 = r3 & r31
            if (r9 != 0) goto L_0x009f
            r9 = r1 & 16
            if (r9 != 0) goto L_0x0099
            r9 = r37
            boolean r10 = r13.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x009b
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r9 = r37
        L_0x009b:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r2 = r2 | r10
            goto L_0x00a1
        L_0x009f:
            r9 = r37
        L_0x00a1:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x00bb
            r10 = r1 & 32
            if (r10 != 0) goto L_0x00b5
            r10 = r38
            boolean r11 = r13.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x00b7
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b5:
            r10 = r38
        L_0x00b7:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r2 = r2 | r11
            goto L_0x00bd
        L_0x00bb:
            r10 = r38
        L_0x00bd:
            r11 = r1 & 64
            if (r11 == 0) goto L_0x00c5
            r15 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r15
            goto L_0x00da
        L_0x00c5:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r3
            if (r15 != 0) goto L_0x00da
            r15 = r39
            boolean r16 = r13.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r2 = r2 | r16
            goto L_0x00dc
        L_0x00da:
            r15 = r39
        L_0x00dc:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e4
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e2:
            r2 = r2 | r0
            goto L_0x00f5
        L_0x00e4:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r13.changed((java.lang.Object) r4)
            if (r0 == 0) goto L_0x00f2
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e2
        L_0x00f2:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e2
        L_0x00f5:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r2
            r6 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r6) goto L_0x0112
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x0105
            goto L_0x0112
        L_0x0105:
            r13.skipToGroupEnd()
            r3 = r35
            r4 = r8
            r5 = r9
            r6 = r10
            r22 = r13
            r7 = r15
            goto L_0x0248
        L_0x0112:
            r13.startDefaults()
            r0 = r3 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r10 = 1
            if (r0 == 0) goto L_0x0141
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0127
            goto L_0x0141
        L_0x0127:
            r13.skipToGroupEnd()
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0130
            r2 = r2 & r16
        L_0x0130:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0135
            r2 = r2 & r6
        L_0x0135:
            r0 = r35
            r11 = r38
            r18 = r9
            r19 = r15
            r9 = r2
        L_0x013e:
            r15 = r8
            goto L_0x01a8
        L_0x0141:
            if (r5 == 0) goto L_0x0146
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0148
        L_0x0146:
            r0 = r35
        L_0x0148:
            if (r7 == 0) goto L_0x014b
            r8 = r10
        L_0x014b:
            r5 = r1 & 16
            if (r5 == 0) goto L_0x0159
            androidx.compose.material3.IconButtonDefaults r5 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r7 = 6
            androidx.compose.ui.graphics.Shape r5 = r5.getFilledShape(r13, r7)
            r2 = r2 & r16
            goto L_0x015a
        L_0x0159:
            r5 = r9
        L_0x015a:
            r7 = r1 & 32
            if (r7 == 0) goto L_0x0179
            androidx.compose.material3.IconButtonDefaults r7 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 1572864(0x180000, float:2.204052E-39)
            r30 = 63
            r15 = r7
            r28 = r13
            androidx.compose.material3.IconToggleButtonColors r7 = r15.m34459filledTonalIconToggleButtonColors5tl4gsc(r16, r18, r20, r22, r24, r26, r28, r29, r30)
            r2 = r2 & r6
            goto L_0x017b
        L_0x0179:
            r7 = r38
        L_0x017b:
            if (r11 == 0) goto L_0x01a1
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r6)
            java.lang.Object r6 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r6 != r9) goto L_0x0196
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r13.updateRememberedValue(r6)
        L_0x0196:
            r13.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = (androidx.compose.foundation.interaction.MutableInteractionSource) r6
            r9 = r2
            r18 = r5
            r19 = r6
            goto L_0x01a6
        L_0x01a1:
            r19 = r39
            r9 = r2
            r18 = r5
        L_0x01a6:
            r11 = r7
            goto L_0x013e
        L_0x01a8:
            r13.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x01ba
            r2 = -1
            java.lang.String r5 = "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:378)"
            r6 = 1676089246(0x63e7179e, float:8.5257994E21)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r9, r2, r5)
        L_0x01ba:
            androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$2 r2 = androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$2.INSTANCE
            r5 = 0
            r6 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r0, r6, r2, r10, r5)
            int r5 = r9 >> 9
            r6 = r5 & 14
            int r7 = r9 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            r5 = r5 & 896(0x380, float:1.256E-42)
            r7 = r6 | r5
            androidx.compose.runtime.State r5 = r11.containerColor$material3_release(r15, r14, r13, r7)
            java.lang.Object r5 = r5.getValue()
            androidx.compose.ui.graphics.Color r5 = (androidx.compose.p002ui.graphics.Color) r5
            long r5 = r5.m35681unboximpl()
            androidx.compose.runtime.State r7 = r11.contentColor$material3_release(r15, r14, r13, r7)
            java.lang.Object r7 = r7.getValue()
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.p002ui.graphics.Color) r7
            long r7 = r7.m35681unboximpl()
            r16 = 0
            r32 = r9
            r9 = r16
            r9 = r10
            r10 = r16
            r16 = 0
            r20 = r11
            r11 = r16
            androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$3 r10 = new androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$3
            r11 = r32
            r10.<init>(r4, r11)
            r21 = r0
            r0 = -58218680(0xfffffffffc87a748, float:-5.6348235E36)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r0, r9, r10)
            r22 = r13
            r13 = r0
            r0 = r11 & 14
            r9 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 | r9
            r9 = r11 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r9
            r9 = r11 & r31
            r0 = r0 | r9
            r23 = r15
            r15 = r0
            int r0 = r11 >> 18
            r0 = r0 & 14
            r16 = r0 | 48
            r17 = 896(0x380, float:1.256E-42)
            r0 = r33
            r1 = r34
            r3 = r23
            r4 = r18
            r12 = r19
            r14 = r22
            r9 = 0
            r10 = 0
            r11 = 0
            androidx.compose.material3.SurfaceKt.m34603Surfaced85dljk((boolean) r0, (kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v>) r1, (androidx.compose.p002ui.Modifier) r2, (boolean) r3, (androidx.compose.p002ui.graphics.Shape) r4, (long) r5, (long) r7, (float) r9, (float) r10, (androidx.compose.foundation.BorderStroke) r11, (androidx.compose.foundation.interaction.MutableInteractionSource) r12, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r13, (androidx.compose.runtime.Composer) r14, (int) r15, (int) r16, (int) r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x023e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x023e:
            r5 = r18
            r7 = r19
            r6 = r20
            r3 = r21
            r4 = r23
        L_0x0248:
            androidx.compose.runtime.ScopeUpdateScope r11 = r22.endRestartGroup()
            if (r11 != 0) goto L_0x024f
            goto L_0x0262
        L_0x024f:
            androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$4 r12 = new androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$4
            r0 = r12
            r1 = r33
            r2 = r34
            r8 = r40
            r9 = r42
            r10 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.updateScope(r12)
        L_0x0262:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.FilledTonalIconToggleButton(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconToggleButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d4  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void IconButton(p404of.C13074a<p336ef.C11921v> r25, androidx.compose.p002ui.Modifier r26, boolean r27, androidx.compose.material3.IconButtonColors r28, androidx.compose.foundation.interaction.MutableInteractionSource r29, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r9 = r25
            r10 = r30
            r11 = r32
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = -1142896114(0xffffffffbbe0ca0e, float:-0.0068600243)
            r1 = r31
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            r1 = r33 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0021
            r1 = r11 | 6
            goto L_0x0031
        L_0x0021:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0030
            boolean r1 = r8.changed((java.lang.Object) r9)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            r1 = r1 | r11
            goto L_0x0031
        L_0x0030:
            r1 = r11
        L_0x0031:
            r3 = r33 & 2
            if (r3 == 0) goto L_0x0038
            r1 = r1 | 48
            goto L_0x004b
        L_0x0038:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            r4 = r26
            boolean r5 = r8.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0047
            r5 = 32
            goto L_0x0049
        L_0x0047:
            r5 = 16
        L_0x0049:
            r1 = r1 | r5
            goto L_0x004d
        L_0x004b:
            r4 = r26
        L_0x004d:
            r5 = r33 & 4
            if (r5 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r27
            boolean r7 = r8.changed((boolean) r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r27
        L_0x0069:
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0082
            r7 = r33 & 8
            if (r7 != 0) goto L_0x007c
            r7 = r28
            boolean r12 = r8.changed((java.lang.Object) r7)
            if (r12 == 0) goto L_0x007e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r7 = r28
        L_0x007e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r12
            goto L_0x0084
        L_0x0082:
            r7 = r28
        L_0x0084:
            r24 = r33 & 16
            if (r24 == 0) goto L_0x008d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r15 = r29
            goto L_0x00a1
        L_0x008d:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r11
            r15 = r29
            if (r12 != 0) goto L_0x00a1
            boolean r12 = r8.changed((java.lang.Object) r15)
            if (r12 == 0) goto L_0x009e
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r1 = r1 | r12
        L_0x00a1:
            r12 = r33 & 32
            if (r12 == 0) goto L_0x00a9
            r12 = 196608(0x30000, float:2.75506E-40)
        L_0x00a7:
            r1 = r1 | r12
            goto L_0x00ba
        L_0x00a9:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r11
            if (r12 != 0) goto L_0x00ba
            boolean r12 = r8.changed((java.lang.Object) r10)
            if (r12 == 0) goto L_0x00b7
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a7
        L_0x00b7:
            r12 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a7
        L_0x00ba:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00d4
            boolean r12 = r8.getSkipping()
            if (r12 != 0) goto L_0x00ca
            goto L_0x00d4
        L_0x00ca:
            r8.skipToGroupEnd()
            r2 = r4
            r3 = r6
            r4 = r7
            r9 = r8
            r5 = r15
            goto L_0x02b0
        L_0x00d4:
            r8.startDefaults()
            r12 = r11 & 1
            r13 = 1
            if (r12 == 0) goto L_0x00f5
            boolean r12 = r8.getDefaultsInvalid()
            if (r12 == 0) goto L_0x00e3
            goto L_0x00f5
        L_0x00e3:
            r8.skipToGroupEnd()
            r3 = r33 & 8
            if (r3 == 0) goto L_0x00ec
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ec:
            r14 = r6
            r12 = r13
            r16 = r15
            r13 = r4
        L_0x00f1:
            r15 = r7
            r7 = r1
            goto L_0x014d
        L_0x00f5:
            if (r3 == 0) goto L_0x00fa
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00fb
        L_0x00fa:
            r3 = r4
        L_0x00fb:
            if (r5 == 0) goto L_0x00fe
            r6 = r13
        L_0x00fe:
            r4 = r33 & 8
            if (r4 == 0) goto L_0x0123
            androidx.compose.material3.IconButtonDefaults r12 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r4 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 24576(0x6000, float:3.4438E-41)
            r23 = 15
            r7 = r13
            r13 = r4
            r15 = r16
            r17 = r18
            r19 = r20
            r21 = r8
            androidx.compose.material3.IconButtonColors r4 = r12.m34460iconButtonColorsro_MJ88(r13, r15, r17, r19, r21, r22, r23)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r12 = r7
            r7 = r4
            goto L_0x0124
        L_0x0123:
            r12 = r13
        L_0x0124:
            if (r24 == 0) goto L_0x0148
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r4)
            java.lang.Object r4 = r8.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x013f
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r8.updateRememberedValue(r4)
        L_0x013f:
            r8.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = (androidx.compose.foundation.interaction.MutableInteractionSource) r4
            r13 = r3
            r16 = r4
            goto L_0x014b
        L_0x0148:
            r16 = r29
            r13 = r3
        L_0x014b:
            r14 = r6
            goto L_0x00f1
        L_0x014d:
            r8.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x015c
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.IconButton (IconButton.kt:72)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r7, r1, r3)
        L_0x015c:
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.TouchTargetKt.minimumTouchTargetSize(r13)
            androidx.compose.material3.tokens.IconButtonTokens r1 = androidx.compose.material3.tokens.IconButtonTokens.INSTANCE
            float r3 = r1.m34997getStateLayerSizeD9Ej5fM()
            androidx.compose.ui.Modifier r17 = androidx.compose.foundation.layout.SizeKt.m33338size3ABfNKs(r0, r3)
            int r0 = r7 >> 6
            r3 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            androidx.compose.runtime.State r3 = r15.containerColor$material3_release(r14, r8, r0)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.p002ui.graphics.Color) r3
            long r18 = r3.m35681unboximpl()
            r20 = 0
            r21 = 2
            r22 = 0
            androidx.compose.ui.Modifier r17 = androidx.compose.foundation.BackgroundKt.m32957backgroundbw27NRU$default(r17, r18, r20, r21, r22)
            androidx.compose.ui.semantics.Role$Companion r3 = androidx.compose.p002ui.semantics.Role.Companion
            int r18 = r3.m37814getButtono7Vup1c()
            r3 = 0
            float r1 = r1.m34997getStateLayerSizeD9Ej5fM()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            r4 = 0
            r6 = 54
            r19 = 4
            r1 = r3
            r3 = r4
            r5 = r8
            r20 = r7
            r7 = r19
            androidx.compose.foundation.Indication r2 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r1, r2, r3, r5, r6, r7)
            r4 = 0
            androidx.compose.ui.semantics.Role r5 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r18)
            r7 = 8
            r18 = 0
            r6 = r0
            r0 = r17
            r1 = r16
            r3 = r14
            r12 = r6
            r6 = r25
            r9 = r8
            r8 = r18
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.ClickableKt.m32979clickableO2vRcR0$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getCenter()
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r9.startReplaceableGroup(r2)
            r2 = 0
            r3 = 6
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r1, r2, r9, r3)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r9.startReplaceableGroup(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r3 = r9.consume(r3)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.p002ui.unit.Density) r3
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r4 = r9.consume(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p002ui.unit.LayoutDirection) r4
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r5 = r9.consume(r5)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.p002ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r7 = r6.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r8 = r9.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x020f
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x020f:
            r9.startReusableNode()
            boolean r8 = r9.getInserting()
            if (r8 == 0) goto L_0x021c
            r9.createNode(r7)
            goto L_0x021f
        L_0x021c:
            r9.useNode()
        L_0x021f:
            r9.disableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m35292constructorimpl(r9)
            of.o r8 = r6.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r1, r8)
            of.o r1 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r3, r1)
            of.o r1 = r6.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r4, r1)
            of.o r1 = r6.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r5, r1)
            r9.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r9)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r9, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r9.startReplaceableGroup(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r9.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r0 = 1428615496(0x5526f148, float:1.14722016E13)
            r9.startReplaceableGroup(r0)
            androidx.compose.runtime.State r0 = r15.contentColor$material3_release(r14, r9, r12)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r0 = r0.m35681unboximpl()
            r3 = 1
            androidx.compose.runtime.ProvidedValue[] r3 = new androidx.compose.runtime.ProvidedValue[r3]
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            androidx.compose.ui.graphics.Color r0 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r0)
            androidx.compose.runtime.ProvidedValue r0 = r4.provides(r0)
            r3[r2] = r0
            int r0 = r20 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r3, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r10, (androidx.compose.runtime.Composer) r9, (int) r0)
            r9.endReplaceableGroup()
            r9.endReplaceableGroup()
            r9.endReplaceableGroup()
            r9.endNode()
            r9.endReplaceableGroup()
            r9.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02ab
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02ab:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
        L_0x02b0:
            androidx.compose.runtime.ScopeUpdateScope r9 = r9.endRestartGroup()
            if (r9 != 0) goto L_0x02b7
            goto L_0x02c8
        L_0x02b7:
            androidx.compose.material3.IconButtonKt$IconButton$3 r12 = new androidx.compose.material3.IconButtonKt$IconButton$3
            r0 = r12
            r1 = r25
            r6 = r30
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.updateScope(r12)
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.IconButton(of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.IconButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ef  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void IconToggleButton(boolean r29, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r30, androidx.compose.p002ui.Modifier r31, boolean r32, androidx.compose.material3.IconToggleButtonColors r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r7 = r29
            r8 = r30
            r9 = r35
            r10 = r37
            java.lang.String r0 = "onCheckedChange"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            r0 = 692561811(0x2947a793, float:4.4332224E-14)
            r1 = r36
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            r1 = r38 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0023
            r1 = r10 | 6
            goto L_0x0033
        L_0x0023:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0032
            boolean r1 = r6.changed((boolean) r7)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            r1 = r1 | r10
            goto L_0x0033
        L_0x0032:
            r1 = r10
        L_0x0033:
            r3 = r38 & 2
            if (r3 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x004a
        L_0x003a:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004a
            boolean r3 = r6.changed((java.lang.Object) r8)
            if (r3 == 0) goto L_0x0047
            r3 = 32
            goto L_0x0049
        L_0x0047:
            r3 = 16
        L_0x0049:
            r1 = r1 | r3
        L_0x004a:
            r3 = r38 & 4
            if (r3 == 0) goto L_0x0051
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0051:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0064
            r4 = r31
            boolean r5 = r6.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r5
            goto L_0x0066
        L_0x0064:
            r4 = r31
        L_0x0066:
            r5 = r38 & 8
            if (r5 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r11 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0080
            r11 = r32
            boolean r12 = r6.changed((boolean) r11)
            if (r12 == 0) goto L_0x007c
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r12
            goto L_0x0082
        L_0x0080:
            r11 = r32
        L_0x0082:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x009d
            r12 = r38 & 16
            if (r12 != 0) goto L_0x0097
            r12 = r33
            boolean r13 = r6.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x0099
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0097:
            r12 = r33
        L_0x0099:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r1 = r1 | r13
            goto L_0x009f
        L_0x009d:
            r12 = r33
        L_0x009f:
            r27 = r38 & 32
            if (r27 == 0) goto L_0x00a9
            r13 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r13
            r14 = r34
            goto L_0x00bc
        L_0x00a9:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r10
            r14 = r34
            if (r13 != 0) goto L_0x00bc
            boolean r13 = r6.changed((java.lang.Object) r14)
            if (r13 == 0) goto L_0x00b9
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r13
        L_0x00bc:
            r13 = r38 & 64
            if (r13 == 0) goto L_0x00c4
            r13 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c2:
            r1 = r1 | r13
            goto L_0x00d5
        L_0x00c4:
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00d5
            boolean r13 = r6.changed((java.lang.Object) r9)
            if (r13 == 0) goto L_0x00d2
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c2
        L_0x00d2:
            r13 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c2
        L_0x00d5:
            r13 = 2995931(0x2db6db, float:4.198194E-39)
            r13 = r13 & r1
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r13 != r15) goto L_0x00ef
            boolean r13 = r6.getSkipping()
            if (r13 != 0) goto L_0x00e5
            goto L_0x00ef
        L_0x00e5:
            r6.skipToGroupEnd()
            r3 = r4
            r4 = r11
            r5 = r12
            r12 = r6
            r6 = r14
            goto L_0x02dd
        L_0x00ef:
            r6.startDefaults()
            r13 = r10 & 1
            r28 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 1
            if (r13 == 0) goto L_0x0113
            boolean r13 = r6.getDefaultsInvalid()
            if (r13 == 0) goto L_0x0101
            goto L_0x0113
        L_0x0101:
            r6.skipToGroupEnd()
            r3 = r38 & 16
            if (r3 == 0) goto L_0x010a
            r1 = r1 & r28
        L_0x010a:
            r3 = r1
            r18 = r4
            r5 = r11
            r4 = r12
            r19 = r14
            goto L_0x0178
        L_0x0113:
            if (r3 == 0) goto L_0x0118
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0119
        L_0x0118:
            r3 = r4
        L_0x0119:
            if (r5 == 0) goto L_0x011d
            r4 = r15
            goto L_0x011e
        L_0x011d:
            r4 = r11
        L_0x011e:
            r5 = r38 & 16
            if (r5 == 0) goto L_0x0149
            androidx.compose.material3.IconButtonDefaults r11 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r12 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r5 = 1572864(0x180000, float:2.204052E-39)
            r26 = 63
            r14 = r16
            r16 = r18
            r18 = r20
            r20 = r22
            r22 = r24
            r24 = r6
            r25 = r5
            androidx.compose.material3.IconToggleButtonColors r5 = r11.m34461iconToggleButtonColors5tl4gsc(r12, r14, r16, r18, r20, r22, r24, r25, r26)
            r1 = r1 & r28
            r12 = r5
        L_0x0149:
            if (r27 == 0) goto L_0x0171
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r5)
            java.lang.Object r5 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r5 != r11) goto L_0x0164
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r5)
        L_0x0164:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = (androidx.compose.foundation.interaction.MutableInteractionSource) r5
            r18 = r3
            r19 = r5
            r3 = r1
            r5 = r4
            r4 = r12
            goto L_0x0178
        L_0x0171:
            r19 = r34
            r18 = r3
            r5 = r4
            r4 = r12
            r3 = r1
        L_0x0178:
            r6.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0187
            r1 = -1
            java.lang.String r11 = "androidx.compose.material3.IconToggleButton (IconButton.kt:132)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r1, r11)
        L_0x0187:
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.TouchTargetKt.minimumTouchTargetSize(r18)
            androidx.compose.material3.tokens.IconButtonTokens r1 = androidx.compose.material3.tokens.IconButtonTokens.INSTANCE
            float r11 = r1.m34997getStateLayerSizeD9Ej5fM()
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.m33338size3ABfNKs(r0, r11)
            int r0 = r3 >> 9
            r0 = r0 & 14
            int r11 = r3 << 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 | r11
            int r11 = r3 >> 6
            r11 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 | r11
            androidx.compose.runtime.State r11 = r4.containerColor$material3_release(r5, r7, r6, r0)
            java.lang.Object r11 = r11.getValue()
            androidx.compose.ui.graphics.Color r11 = (androidx.compose.p002ui.graphics.Color) r11
            long r13 = r11.m35681unboximpl()
            r15 = 0
            r16 = 2
            r17 = 0
            androidx.compose.ui.Modifier r20 = androidx.compose.foundation.BackgroundKt.m32957backgroundbw27NRU$default(r12, r13, r15, r16, r17)
            androidx.compose.ui.semantics.Role$Companion r11 = androidx.compose.p002ui.semantics.Role.Companion
            int r21 = r11.m37815getCheckboxo7Vup1c()
            r11 = 0
            float r1 = r1.m34997getStateLayerSizeD9Ej5fM()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r12 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            r13 = 0
            r16 = 54
            r17 = 4
            r15 = r6
            androidx.compose.foundation.Indication r11 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r11, r12, r13, r15, r16, r17)
            androidx.compose.ui.semantics.Role r12 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r21)
            r13 = r0
            r0 = r20
            r1 = r29
            r2 = r19
            r14 = r3
            r3 = r11
            r11 = r4
            r4 = r5
            r15 = r5
            r5 = r12
            r12 = r6
            r6 = r30
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.m33591toggleableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getCenter()
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r12.startReplaceableGroup(r2)
            r2 = 0
            r3 = 6
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r1, r2, r12, r3)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.startReplaceableGroup(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r3 = r12.consume(r3)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.p002ui.unit.Density) r3
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r4 = r12.consume(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p002ui.unit.LayoutDirection) r4
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r5 = r12.consume(r5)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.p002ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r2 = r6.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r8 = r12.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x0239
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0239:
            r12.startReusableNode()
            boolean r8 = r12.getInserting()
            if (r8 == 0) goto L_0x0246
            r12.createNode(r2)
            goto L_0x0249
        L_0x0246:
            r12.useNode()
        L_0x0249:
            r12.disableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.Updater.m35292constructorimpl(r12)
            of.o r8 = r6.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r1, r8)
            of.o r1 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r3, r1)
            of.o r1 = r6.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r4, r1)
            of.o r1 = r6.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r5, r1)
            r12.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r12)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r12, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.startReplaceableGroup(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r12.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r0 = -1952715315(0xffffffff8b9bedcd, float:-6.006163E-32)
            r12.startReplaceableGroup(r0)
            androidx.compose.runtime.State r0 = r11.contentColor$material3_release(r15, r7, r12, r13)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r0 = r0.m35681unboximpl()
            r2 = 1
            androidx.compose.runtime.ProvidedValue[] r2 = new androidx.compose.runtime.ProvidedValue[r2]
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            androidx.compose.ui.graphics.Color r0 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r0)
            androidx.compose.runtime.ProvidedValue r0 = r3.provides(r0)
            r1 = 0
            r2[r1] = r0
            int r0 = r14 >> 15
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r2, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r9, (androidx.compose.runtime.Composer) r12, (int) r0)
            r12.endReplaceableGroup()
            r12.endReplaceableGroup()
            r12.endReplaceableGroup()
            r12.endNode()
            r12.endReplaceableGroup()
            r12.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02d7
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02d7:
            r5 = r11
            r4 = r15
            r3 = r18
            r6 = r19
        L_0x02dd:
            androidx.compose.runtime.ScopeUpdateScope r11 = r12.endRestartGroup()
            if (r11 != 0) goto L_0x02e4
            goto L_0x02f7
        L_0x02e4:
            androidx.compose.material3.IconButtonKt$IconToggleButton$3 r12 = new androidx.compose.material3.IconButtonKt$IconToggleButton$3
            r0 = r12
            r1 = r29
            r2 = r30
            r7 = r35
            r8 = r37
            r9 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.updateScope(r12)
        L_0x02f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.IconToggleButton(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.IconToggleButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0111  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void OutlinedIconButton(p404of.C13074a<p336ef.C11921v> r29, androidx.compose.p002ui.Modifier r30, boolean r31, androidx.compose.p002ui.graphics.Shape r32, androidx.compose.material3.IconButtonColors r33, androidx.compose.foundation.BorderStroke r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r13 = r29
            r11 = r36
            r10 = r38
            r3 = r39
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = -1746603025(0xffffffff97e4f3ef, float:-1.4795732E-24)
            r1 = r37
            androidx.compose.runtime.Composer r2 = r1.startRestartGroup(r0)
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r10 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r2.changed((java.lang.Object) r13)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r10
            goto L_0x0032
        L_0x0031:
            r1 = r10
        L_0x0032:
            r4 = r3 & 2
            if (r4 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r30
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r1 = r1 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r30
        L_0x004e:
            r6 = r3 & 4
            if (r6 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r31
            boolean r8 = r2.changed((boolean) r7)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r8
            goto L_0x006a
        L_0x0068:
            r7 = r31
        L_0x006a:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r3 & 8
            if (r8 != 0) goto L_0x007d
            r8 = r32
            boolean r9 = r2.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007d:
            r8 = r32
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r32
        L_0x0085:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x00a0
            r9 = r3 & 16
            if (r9 != 0) goto L_0x009a
            r9 = r33
            boolean r12 = r2.changed((java.lang.Object) r9)
            if (r12 == 0) goto L_0x009c
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r9 = r33
        L_0x009c:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r12
            goto L_0x00a2
        L_0x00a0:
            r9 = r33
        L_0x00a2:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x00bc
            r12 = r3 & 32
            if (r12 != 0) goto L_0x00b6
            r12 = r34
            boolean r14 = r2.changed((java.lang.Object) r12)
            if (r14 == 0) goto L_0x00b8
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b6:
            r12 = r34
        L_0x00b8:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r14
            goto L_0x00be
        L_0x00bc:
            r12 = r34
        L_0x00be:
            r26 = r3 & 64
            if (r26 == 0) goto L_0x00c8
            r14 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r14
            r15 = r35
            goto L_0x00db
        L_0x00c8:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r10
            r15 = r35
            if (r14 != 0) goto L_0x00db
            boolean r14 = r2.changed((java.lang.Object) r15)
            if (r14 == 0) goto L_0x00d8
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r1 = r1 | r14
        L_0x00db:
            r14 = r3 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x00e3
            r14 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e1:
            r1 = r1 | r14
            goto L_0x00f4
        L_0x00e3:
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00f4
            boolean r14 = r2.changed((java.lang.Object) r11)
            if (r14 == 0) goto L_0x00f1
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e1
        L_0x00f1:
            r14 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e1
        L_0x00f4:
            r14 = 23967451(0x16db6db, float:4.3661218E-38)
            r14 = r14 & r1
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r14 != r0) goto L_0x0111
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x0104
            goto L_0x0111
        L_0x0104:
            r2.skipToGroupEnd()
            r23 = r2
            r2 = r5
            r3 = r7
            r4 = r8
            r5 = r9
            r6 = r12
            r7 = r15
            goto L_0x0254
        L_0x0111:
            r2.startDefaults()
            r0 = r10 & 1
            r27 = -458753(0xfffffffffff8ffff, float:NaN)
            r28 = -57345(0xffffffffffff1fff, float:NaN)
            r14 = 1
            if (r0 == 0) goto L_0x0149
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0126
            goto L_0x0149
        L_0x0126:
            r2.skipToGroupEnd()
            r0 = r3 & 8
            if (r0 == 0) goto L_0x012f
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x012f:
            r0 = r3 & 16
            if (r0 == 0) goto L_0x0135
            r1 = r1 & r28
        L_0x0135:
            r0 = r3 & 32
            if (r0 == 0) goto L_0x013b
            r1 = r1 & r27
        L_0x013b:
            r17 = r5
            r18 = r8
            r0 = r9
            r19 = r12
            r6 = r14
            r20 = r15
            r14 = r1
            r1 = r7
            goto L_0x01c7
        L_0x0149:
            if (r4 == 0) goto L_0x014e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r5 = r0
        L_0x014e:
            if (r6 == 0) goto L_0x0151
            r7 = r14
        L_0x0151:
            r0 = r3 & 8
            if (r0 == 0) goto L_0x015f
            androidx.compose.material3.IconButtonDefaults r0 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r4 = 6
            androidx.compose.ui.graphics.Shape r0 = r0.getOutlinedShape(r2, r4)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r0
        L_0x015f:
            r0 = r3 & 16
            if (r0 == 0) goto L_0x0185
            androidx.compose.material3.IconButtonDefaults r0 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r25 = 15
            r6 = r14
            r14 = r0
            r15 = r16
            r17 = r18
            r19 = r20
            r21 = r22
            r23 = r2
            androidx.compose.material3.IconButtonColors r0 = r14.m34462outlinedIconButtonColorsro_MJ88(r15, r17, r19, r21, r23, r24, r25)
            r1 = r1 & r28
            r9 = r0
            goto L_0x0186
        L_0x0185:
            r6 = r14
        L_0x0186:
            r0 = r3 & 32
            if (r0 == 0) goto L_0x0199
            androidx.compose.material3.IconButtonDefaults r0 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            int r4 = r1 >> 6
            r4 = r4 & 14
            r4 = r4 | 48
            androidx.compose.foundation.BorderStroke r0 = r0.outlinedIconButtonBorder(r7, r2, r4)
            r1 = r1 & r27
            r12 = r0
        L_0x0199:
            if (r26 == 0) goto L_0x01bc
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r0)
            java.lang.Object r0 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r0 != r4) goto L_0x01b4
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r2.updateRememberedValue(r0)
        L_0x01b4:
            r2.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r20 = r0
            goto L_0x01be
        L_0x01bc:
            r20 = r35
        L_0x01be:
            r14 = r1
            r17 = r5
            r1 = r7
            r18 = r8
            r0 = r9
            r19 = r12
        L_0x01c7:
            r2.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x01d9
            r4 = -1
            java.lang.String r5 = "androidx.compose.material3.OutlinedIconButton (IconButton.kt:444)"
            r7 = -1746603025(0xffffffff97e4f3ef, float:-1.4795732E-24)
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r14, r4, r5)
        L_0x01d9:
            int r4 = r14 >> 6
            r4 = r4 & 14
            int r5 = r14 >> 9
            r5 = r5 & 112(0x70, float:1.57E-43)
            r7 = r4 | r5
            androidx.compose.runtime.State r4 = r0.containerColor$material3_release(r1, r2, r7)
            java.lang.Object r4 = r4.getValue()
            androidx.compose.ui.graphics.Color r4 = (androidx.compose.p002ui.graphics.Color) r4
            long r4 = r4.m35681unboximpl()
            androidx.compose.runtime.State r7 = r0.contentColor$material3_release(r1, r2, r7)
            java.lang.Object r7 = r7.getValue()
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.p002ui.graphics.Color) r7
            long r7 = r7.m35681unboximpl()
            r12 = r6
            r6 = r7
            r8 = 0
            r9 = 0
            androidx.compose.material3.IconButtonKt$OutlinedIconButton$2 r15 = new androidx.compose.material3.IconButtonKt$OutlinedIconButton$2
            r15.<init>(r11, r14)
            r8 = 582332538(0x22b5b07a, float:4.9247E-18)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r8, r12, r15)
            r8 = r14 & 14
            r15 = r14 & 112(0x70, float:1.57E-43)
            r8 = r8 | r15
            r15 = r14 & 896(0x380, float:1.256E-42)
            r8 = r8 | r15
            r15 = r14 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r15
            int r14 = r14 << 9
            r15 = 234881024(0xe000000, float:1.5777218E-30)
            r15 = r15 & r14
            r8 = r8 | r15
            r15 = 1879048192(0x70000000, float:1.58456325E29)
            r14 = r14 & r15
            r14 = r14 | r8
            r15 = 6
            r16 = 192(0xc0, float:2.69E-43)
            r21 = r0
            r0 = r29
            r22 = r1
            r1 = r17
            r23 = r2
            r2 = r22
            r3 = r18
            r10 = r19
            r11 = r20
            r13 = r23
            r8 = 0
            androidx.compose.material3.SurfaceKt.m34605Surfaceo_FOJdg(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0248
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0248:
            r2 = r17
            r4 = r18
            r6 = r19
            r7 = r20
            r5 = r21
            r3 = r22
        L_0x0254:
            androidx.compose.runtime.ScopeUpdateScope r11 = r23.endRestartGroup()
            if (r11 != 0) goto L_0x025b
            goto L_0x026c
        L_0x025b:
            androidx.compose.material3.IconButtonKt$OutlinedIconButton$3 r12 = new androidx.compose.material3.IconButtonKt$OutlinedIconButton$3
            r0 = r12
            r1 = r29
            r8 = r36
            r9 = r38
            r10 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.updateScope(r12)
        L_0x026c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.OutlinedIconButton(of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconButtonColors, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0101  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void OutlinedIconToggleButton(boolean r34, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r35, androidx.compose.p002ui.Modifier r36, boolean r37, androidx.compose.p002ui.graphics.Shape r38, androidx.compose.material3.IconToggleButtonColors r39, androidx.compose.foundation.BorderStroke r40, androidx.compose.foundation.interaction.MutableInteractionSource r41, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r42, androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            r14 = r34
            r12 = r35
            r11 = r42
            r4 = r44
            r3 = r45
            java.lang.String r0 = "onCheckedChange"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = 1470292106(0x57a2e08a, float:3.58170543E14)
            r1 = r43
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r3 & 1
            if (r2 == 0) goto L_0x0024
            r2 = r4 | 6
            goto L_0x0034
        L_0x0024:
            r2 = r4 & 14
            if (r2 != 0) goto L_0x0033
            boolean r2 = r1.changed((boolean) r14)
            if (r2 == 0) goto L_0x0030
            r2 = 4
            goto L_0x0031
        L_0x0030:
            r2 = 2
        L_0x0031:
            r2 = r2 | r4
            goto L_0x0034
        L_0x0033:
            r2 = r4
        L_0x0034:
            r5 = r3 & 2
            if (r5 == 0) goto L_0x003b
            r2 = r2 | 48
            goto L_0x004b
        L_0x003b:
            r5 = r4 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            boolean r5 = r1.changed((java.lang.Object) r12)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r2 = r2 | r5
        L_0x004b:
            r5 = r3 & 4
            if (r5 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r6 = r4 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r36
            boolean r7 = r1.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0061
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r2 = r2 | r7
            goto L_0x0067
        L_0x0065:
            r6 = r36
        L_0x0067:
            r7 = r3 & 8
            if (r7 == 0) goto L_0x006e
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r8 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0081
            r8 = r37
            boolean r9 = r1.changed((boolean) r8)
            if (r9 == 0) goto L_0x007d
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r2 = r2 | r9
            goto L_0x0083
        L_0x0081:
            r8 = r37
        L_0x0083:
            r31 = 57344(0xe000, float:8.0356E-41)
            r9 = r4 & r31
            if (r9 != 0) goto L_0x009f
            r9 = r3 & 16
            if (r9 != 0) goto L_0x0099
            r9 = r38
            boolean r10 = r1.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x009b
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r9 = r38
        L_0x009b:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r2 = r2 | r10
            goto L_0x00a1
        L_0x009f:
            r9 = r38
        L_0x00a1:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r4
            if (r10 != 0) goto L_0x00bb
            r10 = r3 & 32
            if (r10 != 0) goto L_0x00b5
            r10 = r39
            boolean r13 = r1.changed((java.lang.Object) r10)
            if (r13 == 0) goto L_0x00b7
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b5:
            r10 = r39
        L_0x00b7:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r2 = r2 | r13
            goto L_0x00bd
        L_0x00bb:
            r10 = r39
        L_0x00bd:
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r4
            if (r13 != 0) goto L_0x00d7
            r13 = r3 & 64
            if (r13 != 0) goto L_0x00d1
            r13 = r40
            boolean r15 = r1.changed((java.lang.Object) r13)
            if (r15 == 0) goto L_0x00d3
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d1:
            r13 = r40
        L_0x00d3:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r2 = r2 | r15
            goto L_0x00d9
        L_0x00d7:
            r13 = r40
        L_0x00d9:
            r15 = r3 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x00e4
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r16
            r0 = r41
            goto L_0x00f9
        L_0x00e4:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r4 & r16
            r0 = r41
            if (r16 != 0) goto L_0x00f9
            boolean r16 = r1.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00f5
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r2 = r2 | r16
        L_0x00f9:
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0101
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00ff:
            r2 = r2 | r0
            goto L_0x0112
        L_0x0101:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r4
            if (r0 != 0) goto L_0x0112
            boolean r0 = r1.changed((java.lang.Object) r11)
            if (r0 == 0) goto L_0x010f
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00ff
        L_0x010f:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00ff
        L_0x0112:
            r0 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r0 & r2
            r6 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r6) goto L_0x0131
            boolean r0 = r1.getSkipping()
            if (r0 != 0) goto L_0x0122
            goto L_0x0131
        L_0x0122:
            r1.skipToGroupEnd()
            r3 = r36
            r24 = r1
            r4 = r8
            r5 = r9
            r6 = r10
            r7 = r13
            r8 = r41
            goto L_0x0294
        L_0x0131:
            r1.startDefaults()
            r0 = r4 & 1
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r32 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r10 = 1
            if (r0 == 0) goto L_0x016b
            boolean r0 = r1.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0149
            goto L_0x016b
        L_0x0149:
            r1.skipToGroupEnd()
            r0 = r3 & 16
            if (r0 == 0) goto L_0x0152
            r2 = r2 & r16
        L_0x0152:
            r0 = r3 & 32
            if (r0 == 0) goto L_0x0158
            r2 = r2 & r32
        L_0x0158:
            r0 = r3 & 64
            if (r0 == 0) goto L_0x015d
            r2 = r2 & r6
        L_0x015d:
            r0 = r36
            r20 = r41
            r15 = r8
            r18 = r9
            r19 = r13
            r13 = r39
            r9 = r2
            goto L_0x01ee
        L_0x016b:
            if (r5 == 0) goto L_0x0170
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0172
        L_0x0170:
            r0 = r36
        L_0x0172:
            if (r7 == 0) goto L_0x0175
            r8 = r10
        L_0x0175:
            r5 = r3 & 16
            if (r5 == 0) goto L_0x0183
            androidx.compose.material3.IconButtonDefaults r5 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r7 = 6
            androidx.compose.ui.graphics.Shape r5 = r5.getOutlinedShape(r1, r7)
            r2 = r2 & r16
            goto L_0x0184
        L_0x0183:
            r5 = r9
        L_0x0184:
            r7 = r3 & 32
            if (r7 == 0) goto L_0x01a5
            androidx.compose.material3.IconButtonDefaults r7 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 1572864(0x180000, float:2.204052E-39)
            r30 = 63
            r9 = r15
            r15 = r7
            r28 = r1
            androidx.compose.material3.IconToggleButtonColors r7 = r15.m34463outlinedIconToggleButtonColors5tl4gsc(r16, r18, r20, r22, r24, r26, r28, r29, r30)
            r2 = r2 & r32
            goto L_0x01a8
        L_0x01a5:
            r9 = r15
            r7 = r39
        L_0x01a8:
            r15 = r3 & 64
            if (r15 == 0) goto L_0x01bf
            androidx.compose.material3.IconButtonDefaults r13 = androidx.compose.material3.IconButtonDefaults.INSTANCE
            int r15 = r2 >> 9
            r15 = r15 & 14
            r15 = r15 | 384(0x180, float:5.38E-43)
            int r16 = r2 << 3
            r16 = r16 & 112(0x70, float:1.57E-43)
            r15 = r15 | r16
            androidx.compose.foundation.BorderStroke r13 = r13.outlinedIconToggleButtonBorder(r8, r14, r1, r15)
            r2 = r2 & r6
        L_0x01bf:
            if (r9 == 0) goto L_0x01e5
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r6)
            java.lang.Object r6 = r1.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r6 != r9) goto L_0x01da
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r1.updateRememberedValue(r6)
        L_0x01da:
            r1.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = (androidx.compose.foundation.interaction.MutableInteractionSource) r6
            r9 = r2
            r18 = r5
            r20 = r6
            goto L_0x01ea
        L_0x01e5:
            r20 = r41
            r9 = r2
            r18 = r5
        L_0x01ea:
            r15 = r8
            r19 = r13
            r13 = r7
        L_0x01ee:
            r1.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0200
            r2 = -1
            java.lang.String r5 = "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:505)"
            r6 = 1470292106(0x57a2e08a, float:3.58170543E14)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r9, r2, r5)
        L_0x0200:
            androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$2 r2 = androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$2.INSTANCE
            r5 = 0
            r6 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r0, r6, r2, r10, r5)
            int r5 = r9 >> 9
            r6 = r5 & 14
            int r7 = r9 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            r5 = r5 & 896(0x380, float:1.256E-42)
            r7 = r6 | r5
            androidx.compose.runtime.State r5 = r13.containerColor$material3_release(r15, r14, r1, r7)
            java.lang.Object r5 = r5.getValue()
            androidx.compose.ui.graphics.Color r5 = (androidx.compose.p002ui.graphics.Color) r5
            long r5 = r5.m35681unboximpl()
            androidx.compose.runtime.State r7 = r13.contentColor$material3_release(r15, r14, r1, r7)
            java.lang.Object r7 = r7.getValue()
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.p002ui.graphics.Color) r7
            long r7 = r7.m35681unboximpl()
            r16 = 0
            r33 = r9
            r9 = r16
            r9 = r10
            r10 = r16
            androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$3 r10 = new androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$3
            r9 = r33
            r10.<init>(r11, r9)
            r21 = r0
            r0 = 1207657396(0x47fb63b4, float:128711.41)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r3, r10)
            r22 = r13
            r13 = r0
            r0 = r9 & 14
            r3 = r9 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r9 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = r9 & r31
            r0 = r0 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            int r10 = r9 << 9
            r3 = r3 & r10
            r0 = r0 | r3
            r23 = r15
            r15 = r0
            int r0 = r9 >> 21
            r0 = r0 & 14
            r16 = r0 | 48
            r17 = 384(0x180, float:5.38E-43)
            r0 = r34
            r24 = r1
            r1 = r35
            r3 = r23
            r4 = r18
            r11 = r19
            r12 = r20
            r14 = r24
            r9 = 0
            r10 = 0
            androidx.compose.material3.SurfaceKt.m34603Surfaced85dljk((boolean) r0, (kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v>) r1, (androidx.compose.p002ui.Modifier) r2, (boolean) r3, (androidx.compose.p002ui.graphics.Shape) r4, (long) r5, (long) r7, (float) r9, (float) r10, (androidx.compose.foundation.BorderStroke) r11, (androidx.compose.foundation.interaction.MutableInteractionSource) r12, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r13, (androidx.compose.runtime.Composer) r14, (int) r15, (int) r16, (int) r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0288
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0288:
            r5 = r18
            r7 = r19
            r8 = r20
            r3 = r21
            r6 = r22
            r4 = r23
        L_0x0294:
            androidx.compose.runtime.ScopeUpdateScope r12 = r24.endRestartGroup()
            if (r12 != 0) goto L_0x029b
            goto L_0x02ae
        L_0x029b:
            androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$4 r13 = new androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$4
            r0 = r13
            r1 = r34
            r2 = r35
            r9 = r42
            r10 = r44
            r11 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.updateScope(r13)
        L_0x02ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.OutlinedIconToggleButton(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconToggleButtonColors, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }
}
