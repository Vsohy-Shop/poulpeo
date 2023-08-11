package androidx.compose.material3;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: RadioButton.kt */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = C1232Dp.m38468constructorimpl((float) 12);
    private static final float RadioButtonPadding;
    /* access modifiers changed from: private */
    public static final float RadioStrokeWidth;

    static {
        float f = (float) 2;
        RadioButtonPadding = C1232Dp.m38468constructorimpl(f);
        RadioStrokeWidth = C1232Dp.m38468constructorimpl(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void RadioButton(boolean r24, p404of.C13074a<p336ef.C11921v> r25, androidx.compose.p002ui.Modifier r26, boolean r27, androidx.compose.material3.RadioButtonColors r28, androidx.compose.foundation.interaction.MutableInteractionSource r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r7 = r24
            r8 = r25
            r9 = r31
            r0 = 408580840(0x185a72e8, float:2.8233852E-24)
            r1 = r30
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            r1 = r32 & 1
            r5 = 2
            if (r1 == 0) goto L_0x0017
            r1 = r9 | 6
            goto L_0x0027
        L_0x0017:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x0026
            boolean r1 = r6.changed((boolean) r7)
            if (r1 == 0) goto L_0x0023
            r1 = 4
            goto L_0x0024
        L_0x0023:
            r1 = r5
        L_0x0024:
            r1 = r1 | r9
            goto L_0x0027
        L_0x0026:
            r1 = r9
        L_0x0027:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x002e
            r1 = r1 | 48
            goto L_0x003e
        L_0x002e:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x003e
            boolean r2 = r6.changed((java.lang.Object) r8)
            if (r2 == 0) goto L_0x003b
            r2 = 32
            goto L_0x003d
        L_0x003b:
            r2 = 16
        L_0x003d:
            r1 = r1 | r2
        L_0x003e:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x0045
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0058
        L_0x0045:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0058
            r3 = r26
            boolean r4 = r6.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0054
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r1 = r1 | r4
            goto L_0x005a
        L_0x0058:
            r3 = r26
        L_0x005a:
            r4 = r32 & 8
            if (r4 == 0) goto L_0x0061
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0074
        L_0x0061:
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0074
            r10 = r27
            boolean r11 = r6.changed((boolean) r10)
            if (r11 == 0) goto L_0x0070
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r1 = r1 | r11
            goto L_0x0076
        L_0x0074:
            r10 = r27
        L_0x0076:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x0091
            r11 = r32 & 16
            if (r11 != 0) goto L_0x008b
            r11 = r28
            boolean r12 = r6.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x008d
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008b:
            r11 = r28
        L_0x008d:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r1 = r1 | r12
            goto L_0x0093
        L_0x0091:
            r11 = r28
        L_0x0093:
            r22 = r32 & 32
            if (r22 == 0) goto L_0x009d
            r12 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r12
            r15 = r29
            goto L_0x00b0
        L_0x009d:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            r15 = r29
            if (r12 != 0) goto L_0x00b0
            boolean r12 = r6.changed((java.lang.Object) r15)
            if (r12 == 0) goto L_0x00ad
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r1 = r1 | r12
        L_0x00b0:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00c9
            boolean r12 = r6.getSkipping()
            if (r12 != 0) goto L_0x00c0
            goto L_0x00c9
        L_0x00c0:
            r6.skipToGroupEnd()
            r2 = r6
            r4 = r10
            r5 = r11
            r6 = r15
            goto L_0x025a
        L_0x00c9:
            r6.startDefaults()
            r12 = r9 & 1
            r23 = -57345(0xffffffffffff1fff, float:NaN)
            if (r12 == 0) goto L_0x00ea
            boolean r12 = r6.getDefaultsInvalid()
            if (r12 == 0) goto L_0x00da
            goto L_0x00ea
        L_0x00da:
            r6.skipToGroupEnd()
            r2 = r32 & 16
            if (r2 == 0) goto L_0x00e3
            r1 = r1 & r23
        L_0x00e3:
            r14 = r10
            r12 = r11
            r17 = r15
            r10 = r1
            r15 = r3
            goto L_0x0140
        L_0x00ea:
            if (r2 == 0) goto L_0x00ef
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00f0
        L_0x00ef:
            r2 = r3
        L_0x00f0:
            if (r4 == 0) goto L_0x00f4
            r3 = 1
            goto L_0x00f5
        L_0x00f4:
            r3 = r10
        L_0x00f5:
            r4 = r32 & 16
            if (r4 == 0) goto L_0x0114
            androidx.compose.material3.RadioButtonDefaults r10 = androidx.compose.material3.RadioButtonDefaults.INSTANCE
            r11 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 24576(0x6000, float:3.4438E-41)
            r21 = 15
            r15 = r16
            r17 = r18
            r19 = r6
            androidx.compose.material3.RadioButtonColors r4 = r10.m34554colorsro_MJ88(r11, r13, r15, r17, r19, r20, r21)
            r1 = r1 & r23
            r11 = r4
        L_0x0114:
            if (r22 == 0) goto L_0x013a
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r4)
            java.lang.Object r4 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r4 != r10) goto L_0x012f
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r4)
        L_0x012f:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = (androidx.compose.foundation.interaction.MutableInteractionSource) r4
            r10 = r1
            r15 = r2
            r14 = r3
            r17 = r4
            goto L_0x013f
        L_0x013a:
            r17 = r29
            r10 = r1
            r15 = r2
            r14 = r3
        L_0x013f:
            r12 = r11
        L_0x0140:
            r6.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x014f
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.RadioButton (RadioButton.kt:72)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r1, r2)
        L_0x014f:
            r0 = 0
            if (r7 == 0) goto L_0x015b
            float r1 = RadioButtonDotSize
            float r2 = (float) r5
            float r1 = r1 / r2
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            goto L_0x0160
        L_0x015b:
            float r1 = (float) r0
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
        L_0x0160:
            r2 = 100
            r13 = 0
            r11 = 6
            androidx.compose.animation.core.TweenSpec r2 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r2, r0, r13, r11, r13)
            r3 = 0
            r16 = 48
            r18 = 4
            r4 = r6
            r26 = r15
            r15 = r5
            r5 = r16
            r13 = r6
            r6 = r18
            androidx.compose.runtime.State r6 = androidx.compose.animation.core.AnimateAsStateKt.m32888animateDpAsStateKz89ssw(r1, r2, r3, r4, r5, r6)
            int r1 = r10 >> 9
            r1 = r1 & 14
            int r2 = r10 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r10 >> 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            androidx.compose.runtime.State r5 = r12.radioColor$material3_release(r14, r7, r13, r1)
            r1 = 735546407(0x2bd78c27, float:1.5315569E-12)
            r13.startReplaceableGroup(r1)
            if (r8 == 0) goto L_0x01dc
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.semantics.Role$Companion r2 = androidx.compose.p002ui.semantics.Role.Companion
            int r2 = r2.m37818getRadioButtono7Vup1c()
            r10 = 0
            androidx.compose.material3.tokens.RadioButtonTokens r3 = androidx.compose.material3.tokens.RadioButtonTokens.INSTANCE
            float r3 = r3.m35159getStateLayerSizeD9Ej5fM()
            float r4 = (float) r15
            float r3 = r3 / r4
            float r11 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r3)
            r3 = 0
            r16 = 54
            r18 = 4
            r19 = r12
            r28 = r13
            r12 = r3
            r20 = r14
            r14 = r28
            r4 = r26
            r3 = r15
            r15 = r16
            r16 = r18
            androidx.compose.foundation.Indication r10 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r10, r11, r12, r14, r15, r16)
            androidx.compose.ui.semantics.Role r11 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r2)
            r12 = r0
            r0 = r1
            r1 = r24
            r2 = r17
            r13 = r3
            r3 = r10
            r10 = r4
            r4 = r20
            r14 = r5
            r5 = r11
            r11 = r6
            r6 = r25
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.SelectableKt.m33587selectableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ea
        L_0x01dc:
            r10 = r26
            r11 = r6
            r19 = r12
            r28 = r13
            r20 = r14
            r13 = r15
            r12 = r0
            r14 = r5
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
        L_0x01ea:
            r28.endReplaceableGroup()
            if (r8 == 0) goto L_0x01f6
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = androidx.compose.material3.TouchTargetKt.minimumTouchTargetSize(r1)
            goto L_0x01f8
        L_0x01f6:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
        L_0x01f8:
            androidx.compose.ui.Modifier r1 = r10.then(r1)
            androidx.compose.ui.Modifier r0 = r1.then(r0)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getCenter()
            r2 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(r0, r1, r12, r13, r2)
            float r1 = RadioButtonPadding
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m33268padding3ABfNKs(r0, r1)
            androidx.compose.material3.tokens.RadioButtonTokens r1 = androidx.compose.material3.tokens.RadioButtonTokens.INSTANCE
            float r1 = r1.m35158getIconSizeD9Ej5fM()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m33330requiredSize3ABfNKs(r0, r1)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2 = r28
            r2.startReplaceableGroup(r1)
            boolean r1 = r2.changed((java.lang.Object) r14)
            boolean r3 = r2.changed((java.lang.Object) r11)
            r1 = r1 | r3
            java.lang.Object r3 = r2.rememberedValue()
            if (r1 != 0) goto L_0x023a
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x0242
        L_0x023a:
            androidx.compose.material3.RadioButtonKt$RadioButton$2$1 r3 = new androidx.compose.material3.RadioButtonKt$RadioButton$2$1
            r3.<init>(r14, r11)
            r2.updateRememberedValue(r3)
        L_0x0242:
            r2.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.foundation.CanvasKt.Canvas(r0, r3, r2, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0253
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0253:
            r3 = r10
            r6 = r17
            r5 = r19
            r4 = r20
        L_0x025a:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.endRestartGroup()
            if (r10 != 0) goto L_0x0261
            goto L_0x0272
        L_0x0261:
            androidx.compose.material3.RadioButtonKt$RadioButton$3 r11 = new androidx.compose.material3.RadioButtonKt$RadioButton$3
            r0 = r11
            r1 = r24
            r2 = r25
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.updateScope(r11)
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.RadioButtonKt.RadioButton(boolean, of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.RadioButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }
}
