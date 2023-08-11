package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;

/* compiled from: MaterialTheme.kt */
public final class MaterialThemeKt {
    /* access modifiers changed from: private */
    public static final RippleAlpha DefaultRippleAlpha = new RippleAlpha(0.16f, 0.12f, 0.08f, 0.12f);
    public static final float TextSelectionBackgroundOpacity = 0.4f;

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00af, code lost:
        if ((r84 & 4) != 0) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c0  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void MaterialTheme(androidx.compose.material3.ColorScheme r78, androidx.compose.material3.Shapes r79, androidx.compose.material3.Typography r80, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r81, androidx.compose.runtime.Composer r82, int r83, int r84) {
        /*
            r4 = r81
            r5 = r83
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = -2127166334(0xffffffff81360482, float:-3.3431355E-38)
            r1 = r82
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r5 & 14
            r3 = 4
            r13 = 2
            if (r2 != 0) goto L_0x002b
            r2 = r84 & 1
            if (r2 != 0) goto L_0x0026
            r2 = r78
            boolean r6 = r1.changed((java.lang.Object) r2)
            if (r6 == 0) goto L_0x0028
            r6 = r3
            goto L_0x0029
        L_0x0026:
            r2 = r78
        L_0x0028:
            r6 = r13
        L_0x0029:
            r6 = r6 | r5
            goto L_0x002e
        L_0x002b:
            r2 = r78
            r6 = r5
        L_0x002e:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r84 & 2
            if (r7 != 0) goto L_0x0041
            r7 = r79
            boolean r8 = r1.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0041:
            r7 = r79
        L_0x0043:
            r8 = 16
        L_0x0045:
            r6 = r6 | r8
            goto L_0x0049
        L_0x0047:
            r7 = r79
        L_0x0049:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r84 & 4
            if (r8 != 0) goto L_0x005c
            r8 = r80
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005c:
            r8 = r80
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r9
            goto L_0x0064
        L_0x0062:
            r8 = r80
        L_0x0064:
            r9 = r84 & 8
            if (r9 == 0) goto L_0x006b
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007b
            boolean r9 = r1.changed((java.lang.Object) r4)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r6 = r6 | r9
        L_0x007b:
            r9 = r6 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008f
            boolean r9 = r1.getSkipping()
            if (r9 != 0) goto L_0x0088
            goto L_0x008f
        L_0x0088:
            r1.skipToGroupEnd()
            r15 = r7
        L_0x008c:
            r3 = r8
            goto L_0x01c5
        L_0x008f:
            r1.startDefaults()
            r9 = r5 & 1
            r14 = 6
            if (r9 == 0) goto L_0x00b2
            boolean r9 = r1.getDefaultsInvalid()
            if (r9 == 0) goto L_0x009e
            goto L_0x00b2
        L_0x009e:
            r1.skipToGroupEnd()
            r9 = r84 & 1
            if (r9 == 0) goto L_0x00a7
            r6 = r6 & -15
        L_0x00a7:
            r9 = r84 & 2
            if (r9 == 0) goto L_0x00ad
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ad:
            r9 = r84 & 4
            if (r9 == 0) goto L_0x00d6
            goto L_0x00d4
        L_0x00b2:
            r9 = r84 & 1
            if (r9 == 0) goto L_0x00be
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r2 = r2.getColorScheme(r1, r14)
            r6 = r6 & -15
        L_0x00be:
            r9 = r84 & 2
            if (r9 == 0) goto L_0x00ca
            androidx.compose.material3.MaterialTheme r7 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Shapes r7 = r7.getShapes(r1, r14)
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ca:
            r9 = r84 & 4
            if (r9 == 0) goto L_0x00d6
            androidx.compose.material3.MaterialTheme r8 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r8 = r8.getTypography(r1, r14)
        L_0x00d4:
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00d6:
            r10 = r6
            r12 = r7
            r11 = r8
            r1.endDefaults()
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x00e8
            r6 = -1
            java.lang.String r7 = "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:57)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r6, r7)
        L_0x00e8:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r0)
            java.lang.Object r0 = r1.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L_0x0141
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 536870911(0x1fffffff, float:1.0842021E-19)
            r75 = 0
            r15 = r2
            androidx.compose.material3.ColorScheme r0 = androidx.compose.material3.ColorScheme.m34297copyG1PFcw$default(r15, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r75)
            r1.updateRememberedValue(r0)
        L_0x0141:
            r1.endReplaceableGroup()
            androidx.compose.material3.ColorScheme r0 = (androidx.compose.material3.ColorScheme) r0
            androidx.compose.material3.ColorSchemeKt.updateColorSchemeFrom(r0, r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r15 = 0
            r16 = 7
            r76 = r10
            r10 = r1
            r77 = r11
            r11 = r15
            r15 = r12
            r12 = r16
            androidx.compose.foundation.Indication r6 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r6, r7, r8, r10, r11, r12)
            r7 = 0
            androidx.compose.foundation.text.selection.TextSelectionColors r8 = rememberTextSelectionColors(r0, r1, r7)
            androidx.compose.runtime.ProvidedValue[] r9 = new androidx.compose.runtime.ProvidedValue[r14]
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.material3.ColorSchemeKt.getLocalColorScheme()
            androidx.compose.runtime.ProvidedValue r0 = r10.provides(r0)
            r9[r7] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.IndicationKt.getLocalIndication()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r6)
            r6 = 1
            r9[r6] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ripple.RippleThemeKt.getLocalRippleTheme()
            androidx.compose.material3.MaterialRippleTheme r7 = androidx.compose.material3.MaterialRippleTheme.INSTANCE
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r7)
            r9[r13] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ShapesKt.getLocalShapes()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r15)
            r7 = 3
            r9[r7] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r8)
            r9[r3] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.TypographyKt.getLocalTypography()
            r8 = r77
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r8)
            r3 = 5
            r9[r3] = r0
            androidx.compose.material3.MaterialThemeKt$MaterialTheme$1 r0 = new androidx.compose.material3.MaterialThemeKt$MaterialTheme$1
            r3 = r76
            r0.<init>(r8, r4, r3)
            r3 = -1066563262(0xffffffffc06d8942, float:-3.7115026)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r3, r6, r0)
            r3 = 56
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r9, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r0, (androidx.compose.runtime.Composer) r1, (int) r3)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x008c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x008c
        L_0x01c5:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.endRestartGroup()
            if (r7 != 0) goto L_0x01cc
            goto L_0x01dd
        L_0x01cc:
            androidx.compose.material3.MaterialThemeKt$MaterialTheme$2 r8 = new androidx.compose.material3.MaterialThemeKt$MaterialTheme$2
            r0 = r8
            r1 = r2
            r2 = r15
            r4 = r81
            r5 = r83
            r6 = r84
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.updateScope(r8)
        L_0x01dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.MaterialTheme(androidx.compose.material3.ColorScheme, androidx.compose.material3.Shapes, androidx.compose.material3.Typography, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        if (r13 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x0037;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.TextSelectionColors rememberTextSelectionColors(androidx.compose.material3.ColorScheme r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            java.lang.String r0 = "colorScheme"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = 1866455512(0x6f3fd9d8, float:5.9374994E28)
            r12.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0017
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:132)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r1, r2)
        L_0x0017:
            long r0 = r11.m34318getPrimary0d7_KjU()
            androidx.compose.ui.graphics.Color r11 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r0)
            r13 = 1157296644(0x44faf204, float:2007.563)
            r12.startReplaceableGroup(r13)
            boolean r11 = r12.changed((java.lang.Object) r11)
            java.lang.Object r13 = r12.rememberedValue()
            if (r11 != 0) goto L_0x0037
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r13 != r11) goto L_0x0050
        L_0x0037:
            androidx.compose.foundation.text.selection.TextSelectionColors r13 = new androidx.compose.foundation.text.selection.TextSelectionColors
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 14
            r10 = 0
            r3 = r0
            long r6 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r3, r5, r6, r7, r8, r9, r10)
            r8 = 0
            r3 = r13
            r4 = r0
            r3.<init>(r4, r6, r8)
            r12.updateRememberedValue(r13)
        L_0x0050:
            r12.endReplaceableGroup()
            androidx.compose.foundation.text.selection.TextSelectionColors r13 = (androidx.compose.foundation.text.selection.TextSelectionColors) r13
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x005e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x005e:
            r12.endReplaceableGroup()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.rememberTextSelectionColors(androidx.compose.material3.ColorScheme, androidx.compose.runtime.Composer, int):androidx.compose.foundation.text.selection.TextSelectionColors");
    }
}
