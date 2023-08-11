package androidx.compose.material;

import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n25#2:234\n50#2:243\n49#2:244\n1114#3,6:235\n1114#3,6:245\n75#4:241\n75#4:254\n154#5:242\n154#5:251\n154#5:252\n154#5:253\n154#5:255\n154#5:256\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n*L\n79#1:234\n116#1:243\n116#1:244\n79#1:235,6\n116#1:245,6\n83#1:241\n230#1:254\n83#1:242\n227#1:251\n228#1:252\n229#1:253\n231#1:255\n232#1:256\n*E\n"})
/* compiled from: RadioButton.kt */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = C1232Dp.m38468constructorimpl((float) 12);
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = C1232Dp.m38468constructorimpl((float) 24);
    private static final float RadioButtonSize;
    /* access modifiers changed from: private */
    public static final float RadioRadius;
    /* access modifiers changed from: private */
    public static final float RadioStrokeWidth;

    static {
        float f = (float) 2;
        RadioButtonPadding = C1232Dp.m38468constructorimpl(f);
        float r1 = C1232Dp.m38468constructorimpl((float) 20);
        RadioButtonSize = r1;
        RadioRadius = C1232Dp.m38468constructorimpl(r1 / f);
        RadioStrokeWidth = C1232Dp.m38468constructorimpl(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0144  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void RadioButton(boolean r22, p404of.C13074a<p336ef.C11921v> r23, androidx.compose.p002ui.Modifier r24, boolean r25, androidx.compose.foundation.interaction.MutableInteractionSource r26, androidx.compose.material.RadioButtonColors r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r7 = r22
            r8 = r23
            r9 = r29
            r0 = 1314435585(0x4e58b201, float:9.0888608E8)
            r1 = r28
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            r1 = r30 & 1
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
            r2 = r30 & 2
            if (r2 == 0) goto L_0x002e
            r1 = r1 | 48
            goto L_0x003e
        L_0x002e:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x003e
            boolean r2 = r6.changedInstance(r8)
            if (r2 == 0) goto L_0x003b
            r2 = 32
            goto L_0x003d
        L_0x003b:
            r2 = 16
        L_0x003d:
            r1 = r1 | r2
        L_0x003e:
            r2 = r30 & 4
            if (r2 == 0) goto L_0x0045
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0058
        L_0x0045:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0058
            r3 = r24
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
            r3 = r24
        L_0x005a:
            r4 = r30 & 8
            if (r4 == 0) goto L_0x0061
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0074
        L_0x0061:
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0074
            r10 = r25
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
            r10 = r25
        L_0x0076:
            r11 = r30 & 16
            if (r11 == 0) goto L_0x007d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0092
        L_0x007d:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r9
            if (r12 != 0) goto L_0x0092
            r12 = r26
            boolean r13 = r6.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x008e
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r1 = r1 | r13
            goto L_0x0094
        L_0x0092:
            r12 = r26
        L_0x0094:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r9
            if (r13 != 0) goto L_0x00ae
            r13 = r30 & 32
            if (r13 != 0) goto L_0x00a8
            r13 = r27
            boolean r14 = r6.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x00aa
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00a8:
            r13 = r27
        L_0x00aa:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r14
            goto L_0x00b0
        L_0x00ae:
            r13 = r27
        L_0x00b0:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r1
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00c9
            boolean r14 = r6.getSkipping()
            if (r14 != 0) goto L_0x00c0
            goto L_0x00c9
        L_0x00c0:
            r6.skipToGroupEnd()
            r4 = r3
            r3 = r6
            r5 = r12
            r6 = r13
            goto L_0x0241
        L_0x00c9:
            r6.startDefaults()
            r14 = r9 & 1
            r20 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r14 == 0) goto L_0x00ea
            boolean r14 = r6.getDefaultsInvalid()
            if (r14 == 0) goto L_0x00da
            goto L_0x00ea
        L_0x00da:
            r6.skipToGroupEnd()
            r2 = r30 & 32
            if (r2 == 0) goto L_0x00e3
            r1 = r1 & r20
        L_0x00e3:
            r15 = r3
            r14 = r10
            r17 = r12
            r12 = r13
        L_0x00e8:
            r10 = r1
            goto L_0x013b
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
            if (r11 == 0) goto L_0x0116
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r4)
            java.lang.Object r4 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r4 != r10) goto L_0x0110
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r4)
        L_0x0110:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = (androidx.compose.foundation.interaction.MutableInteractionSource) r4
            goto L_0x0117
        L_0x0116:
            r4 = r12
        L_0x0117:
            r10 = r30 & 32
            if (r10 == 0) goto L_0x0135
            androidx.compose.material.RadioButtonDefaults r10 = androidx.compose.material.RadioButtonDefaults.INSTANCE
            r11 = 0
            r13 = 0
            r15 = 0
            r18 = 3072(0xc00, float:4.305E-42)
            r19 = 7
            r17 = r6
            androidx.compose.material.RadioButtonColors r10 = r10.m34095colorsRGew2ao(r11, r13, r15, r17, r18, r19)
            r1 = r1 & r20
            r15 = r2
            r14 = r3
            r17 = r4
            r12 = r10
            goto L_0x00e8
        L_0x0135:
            r10 = r1
            r15 = r2
            r14 = r3
            r17 = r4
            r12 = r13
        L_0x013b:
            r6.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x014a
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.RadioButton (RadioButton.kt:73)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r1, r2)
        L_0x014a:
            r0 = 0
            if (r7 == 0) goto L_0x0156
            float r1 = RadioButtonDotSize
            float r2 = (float) r5
            float r1 = r1 / r2
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            goto L_0x015b
        L_0x0156:
            float r1 = (float) r0
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
        L_0x015b:
            r2 = 100
            r13 = 0
            r3 = 6
            androidx.compose.animation.core.TweenSpec r2 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r2, r0, r13, r3, r13)
            r3 = 0
            r11 = 48
            r16 = 4
            r4 = r6
            r5 = r11
            r11 = r6
            r6 = r16
            androidx.compose.runtime.State r6 = androidx.compose.animation.core.AnimateAsStateKt.m32888animateDpAsStateKz89ssw(r1, r2, r3, r4, r5, r6)
            int r1 = r10 >> 9
            r2 = r1 & 14
            int r3 = r10 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            androidx.compose.runtime.State r5 = r12.radioColor(r14, r7, r11, r1)
            r1 = 1941632354(0x73baf562, float:2.962476E31)
            r11.startReplaceableGroup(r1)
            if (r8 == 0) goto L_0x01c5
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.semantics.Role$Companion r2 = androidx.compose.p002ui.semantics.Role.Companion
            int r2 = r2.m37818getRadioButtono7Vup1c()
            r10 = 0
            float r3 = RadioButtonRippleRadius
            r18 = 0
            r4 = 54
            r16 = 4
            r24 = r11
            r11 = r3
            r20 = r12
            r3 = r13
            r12 = r18
            r18 = r14
            r14 = r24
            r21 = r15
            r15 = r4
            androidx.compose.foundation.Indication r4 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r10, r11, r12, r14, r15, r16)
            androidx.compose.ui.semantics.Role r10 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r2)
            r11 = r0
            r0 = r1
            r1 = r22
            r2 = r17
            r12 = r3
            r3 = r4
            r4 = r18
            r13 = r5
            r5 = r10
            r10 = r6
            r6 = r23
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.SelectableKt.m33587selectableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01d3
        L_0x01c5:
            r10 = r6
            r24 = r11
            r20 = r12
            r12 = r13
            r18 = r14
            r21 = r15
            r11 = r0
            r13 = r5
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
        L_0x01d3:
            r24.endReplaceableGroup()
            if (r8 == 0) goto L_0x01df
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = androidx.compose.material.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r1)
            goto L_0x01e1
        L_0x01df:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
        L_0x01e1:
            r2 = r21
            androidx.compose.ui.Modifier r1 = r2.then(r1)
            androidx.compose.ui.Modifier r0 = r1.then(r0)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getCenter()
            r3 = 2
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(r0, r1, r11, r3, r12)
            float r1 = RadioButtonPadding
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m33268padding3ABfNKs(r0, r1)
            float r1 = RadioButtonSize
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m33330requiredSize3ABfNKs(r0, r1)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3 = r24
            r3.startReplaceableGroup(r1)
            boolean r1 = r3.changed((java.lang.Object) r13)
            boolean r4 = r3.changed((java.lang.Object) r10)
            r1 = r1 | r4
            java.lang.Object r4 = r3.rememberedValue()
            if (r1 != 0) goto L_0x0221
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r4 != r1) goto L_0x0229
        L_0x0221:
            androidx.compose.material.RadioButtonKt$RadioButton$2$1 r4 = new androidx.compose.material.RadioButtonKt$RadioButton$2$1
            r4.<init>(r13, r10)
            r3.updateRememberedValue(r4)
        L_0x0229:
            r3.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.foundation.CanvasKt.Canvas(r0, r4, r3, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x023a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x023a:
            r4 = r2
            r5 = r17
            r10 = r18
            r6 = r20
        L_0x0241:
            androidx.compose.runtime.ScopeUpdateScope r11 = r3.endRestartGroup()
            if (r11 != 0) goto L_0x0248
            goto L_0x025b
        L_0x0248:
            androidx.compose.material.RadioButtonKt$RadioButton$3 r12 = new androidx.compose.material.RadioButtonKt$RadioButton$3
            r0 = r12
            r1 = r22
            r2 = r23
            r3 = r4
            r4 = r10
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.updateScope(r12)
        L_0x025b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.RadioButtonKt.RadioButton(boolean, of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.RadioButtonColors, androidx.compose.runtime.Composer, int, int):void");
    }
}
