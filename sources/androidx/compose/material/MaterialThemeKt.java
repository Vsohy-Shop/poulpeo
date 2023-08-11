package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n25#2:140\n1114#3,6:141\n1#4:147\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n*L\n65#1:140\n65#1:141,6\n*E\n"})
/* compiled from: MaterialTheme.kt */
public final class MaterialThemeKt {
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ae, code lost:
        if ((r50 & 4) != 0) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b1  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void MaterialTheme(androidx.compose.material.Colors r44, androidx.compose.material.Typography r45, androidx.compose.material.Shapes r46, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r47, androidx.compose.runtime.Composer r48, int r49, int r50) {
        /*
            r4 = r47
            r5 = r49
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = -891417079(0xffffffffcade0e09, float:-7276292.5)
            r1 = r48
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r5 & 14
            r13 = 2
            if (r2 != 0) goto L_0x002a
            r2 = r50 & 1
            if (r2 != 0) goto L_0x0025
            r2 = r44
            boolean r6 = r1.changed((java.lang.Object) r2)
            if (r6 == 0) goto L_0x0027
            r6 = 4
            goto L_0x0028
        L_0x0025:
            r2 = r44
        L_0x0027:
            r6 = r13
        L_0x0028:
            r6 = r6 | r5
            goto L_0x002d
        L_0x002a:
            r2 = r44
            r6 = r5
        L_0x002d:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0046
            r7 = r50 & 2
            if (r7 != 0) goto L_0x0040
            r7 = r45
            boolean r8 = r1.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0042
            r8 = 32
            goto L_0x0044
        L_0x0040:
            r7 = r45
        L_0x0042:
            r8 = 16
        L_0x0044:
            r6 = r6 | r8
            goto L_0x0048
        L_0x0046:
            r7 = r45
        L_0x0048:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0061
            r8 = r50 & 4
            if (r8 != 0) goto L_0x005b
            r8 = r46
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x005d
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005b:
            r8 = r46
        L_0x005d:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r6 = r6 | r9
            goto L_0x0063
        L_0x0061:
            r8 = r46
        L_0x0063:
            r9 = r50 & 8
            if (r9 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007a
            boolean r9 = r1.changedInstance(r4)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r6 = r6 | r9
        L_0x007a:
            r9 = r6 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008e
            boolean r9 = r1.getSkipping()
            if (r9 != 0) goto L_0x0087
            goto L_0x008e
        L_0x0087:
            r1.skipToGroupEnd()
            r15 = r7
            r3 = r8
            goto L_0x01b4
        L_0x008e:
            r1.startDefaults()
            r9 = r5 & 1
            r14 = 6
            if (r9 == 0) goto L_0x00b1
            boolean r9 = r1.getDefaultsInvalid()
            if (r9 == 0) goto L_0x009d
            goto L_0x00b1
        L_0x009d:
            r1.skipToGroupEnd()
            r9 = r50 & 1
            if (r9 == 0) goto L_0x00a6
            r6 = r6 & -15
        L_0x00a6:
            r9 = r50 & 2
            if (r9 == 0) goto L_0x00ac
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ac:
            r9 = r50 & 4
            if (r9 == 0) goto L_0x00d5
            goto L_0x00d3
        L_0x00b1:
            r9 = r50 & 1
            if (r9 == 0) goto L_0x00bd
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r2 = r2.getColors(r1, r14)
            r6 = r6 & -15
        L_0x00bd:
            r9 = r50 & 2
            if (r9 == 0) goto L_0x00c9
            androidx.compose.material.MaterialTheme r7 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Typography r7 = r7.getTypography(r1, r14)
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c9:
            r9 = r50 & 4
            if (r9 == 0) goto L_0x00d5
            androidx.compose.material.MaterialTheme r8 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Shapes r8 = r8.getShapes(r1, r14)
        L_0x00d3:
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00d5:
            r10 = r6
            r12 = r7
            r11 = r8
            r1.endDefaults()
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x00e7
            r6 = -1
            java.lang.String r7 = "androidx.compose.material.MaterialTheme (MaterialTheme.kt:58)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r6, r7)
        L_0x00e7:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r0)
            java.lang.Object r0 = r1.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L_0x011f
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
            r41 = 8191(0x1fff, float:1.1478E-41)
            r42 = 0
            r15 = r2
            androidx.compose.material.Colors r0 = androidx.compose.material.Colors.m33943copypvPzIIM$default(r15, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r41, r42)
            r1.updateRememberedValue(r0)
        L_0x011f:
            r1.endReplaceableGroup()
            androidx.compose.material.Colors r0 = (androidx.compose.material.Colors) r0
            androidx.compose.material.ColorsKt.updateColorsFrom(r0, r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r15 = 0
            r16 = 7
            r43 = r10
            r10 = r1
            r3 = r11
            r11 = r15
            r15 = r12
            r12 = r16
            androidx.compose.foundation.Indication r6 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r6, r7, r8, r10, r11, r12)
            r7 = 0
            androidx.compose.foundation.text.selection.TextSelectionColors r8 = androidx.compose.material.MaterialTextSelectionColorsKt.rememberTextSelectionColors(r0, r1, r7)
            r9 = 7
            androidx.compose.runtime.ProvidedValue[] r9 = new androidx.compose.runtime.ProvidedValue[r9]
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.material.ColorsKt.getLocalColors()
            androidx.compose.runtime.ProvidedValue r0 = r10.provides(r0)
            r9[r7] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha()
            androidx.compose.material.ContentAlpha r7 = androidx.compose.material.ContentAlpha.INSTANCE
            float r7 = r7.getHigh(r1, r14)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r7)
            r7 = 1
            r9[r7] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.IndicationKt.getLocalIndication()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r6)
            r9[r13] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ripple.RippleThemeKt.getLocalRippleTheme()
            androidx.compose.material.MaterialRippleTheme r6 = androidx.compose.material.MaterialRippleTheme.INSTANCE
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r6)
            r6 = 3
            r9[r6] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ShapesKt.getLocalShapes()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r3)
            r6 = 4
            r9[r6] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r8)
            r6 = 5
            r9[r6] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.TypographyKt.getLocalTypography()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r15)
            r9[r14] = r0
            androidx.compose.material.MaterialThemeKt$MaterialTheme$1 r0 = new androidx.compose.material.MaterialThemeKt$MaterialTheme$1
            r6 = r43
            r0.<init>(r15, r4, r6)
            r6 = -1740102967(0xffffffff984822c9, float:-2.5866956E-24)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r6, r7, r0)
            r6 = 56
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r9, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r0, (androidx.compose.runtime.Composer) r1, (int) r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01b4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01b4:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.endRestartGroup()
            if (r7 != 0) goto L_0x01bb
            goto L_0x01cc
        L_0x01bb:
            androidx.compose.material.MaterialThemeKt$MaterialTheme$2 r8 = new androidx.compose.material.MaterialThemeKt$MaterialTheme$2
            r0 = r8
            r1 = r2
            r2 = r15
            r4 = r47
            r5 = r49
            r6 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.updateScope(r8)
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MaterialThemeKt.MaterialTheme(androidx.compose.material.Colors, androidx.compose.material.Typography, androidx.compose.material.Shapes, of.o, androidx.compose.runtime.Composer, int, int):void");
    }
}
