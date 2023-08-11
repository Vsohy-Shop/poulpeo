package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,618:1\n154#2:619\n154#2:620\n154#2:621\n154#2:622\n154#2:623\n154#2:624\n154#2:625\n154#2:626\n154#2:627\n154#2:628\n154#2:638\n154#2:639\n154#2:640\n154#2:641\n154#2:642\n154#2:643\n154#2:644\n154#2:645\n83#3,3:629\n1114#4,6:632\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n*L\n347#1:619\n348#1:620\n349#1:621\n354#1:622\n355#1:623\n373#1:624\n374#1:625\n375#1:626\n376#1:627\n377#1:628\n295#1:638\n296#1:639\n312#1:640\n318#1:641\n325#1:642\n332#1:643\n470#1:644\n481#1:645\n379#1:629,3\n379#1:632,6\n*E\n"})
/* compiled from: Button.kt */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize = C1232Dp.m38468constructorimpl((float) 18);
    private static final float IconSpacing;
    private static final float MinHeight = C1232Dp.m38468constructorimpl((float) 36);
    private static final float MinWidth = C1232Dp.m38468constructorimpl((float) 64);
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize = C1232Dp.m38468constructorimpl((float) 1);
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float r0 = C1232Dp.m38468constructorimpl((float) 16);
        ButtonHorizontalPadding = r0;
        float f = (float) 8;
        float r2 = C1232Dp.m38468constructorimpl(f);
        ButtonVerticalPadding = r2;
        PaddingValues r02 = PaddingKt.m33264PaddingValuesa9UjIt4(r0, r2, r0, r2);
        ContentPadding = r02;
        IconSpacing = C1232Dp.m38468constructorimpl(f);
        float r1 = C1232Dp.m38468constructorimpl(f);
        TextButtonHorizontalPadding = r1;
        TextButtonContentPadding = PaddingKt.m33264PaddingValuesa9UjIt4(r1, r02.m33281calculateTopPaddingD9Ej5fM(), r1, r02.m33278calculateBottomPaddingD9Ej5fM());
    }

    private ButtonDefaults() {
    }

    @Composable
    /* renamed from: buttonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m33917buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(1870371134);
        if ((i2 & 1) != 0) {
            j5 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorsKt.m33970contentColorForek8zF_U(j5, composer2, i3 & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j7 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(materialTheme.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme.getColors(composer2, 6).m33956getSurface0d7_KjU());
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i3, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:405)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.material.DefaultButtonElevation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.compose.material.DefaultButtonElevation} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if (r1 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x009c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* renamed from: elevation-R_JCAzs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.ButtonElevation m33918elevationR_JCAzs(float r14, float r15, float r16, float r17, float r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            r13 = this;
            r0 = r19
            r1 = -737170518(0xffffffffd40fabaa, float:-2.46824147E12)
            r0.startReplaceableGroup(r1)
            r2 = r21 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0014
            float r2 = (float) r3
            float r2 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r2)
            r5 = r2
            goto L_0x0015
        L_0x0014:
            r5 = r14
        L_0x0015:
            r2 = r21 & 2
            if (r2 == 0) goto L_0x0022
            r2 = 8
            float r2 = (float) r2
            float r2 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r2)
            r6 = r2
            goto L_0x0023
        L_0x0022:
            r6 = r15
        L_0x0023:
            r2 = r21 & 4
            r4 = 0
            if (r2 == 0) goto L_0x002f
            float r2 = (float) r4
            float r2 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r2)
            r7 = r2
            goto L_0x0031
        L_0x002f:
            r7 = r16
        L_0x0031:
            r2 = r21 & 8
            r8 = 4
            if (r2 == 0) goto L_0x003c
            float r2 = (float) r8
            float r2 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r2)
            goto L_0x003e
        L_0x003c:
            r2 = r17
        L_0x003e:
            r9 = r21 & 16
            if (r9 == 0) goto L_0x0048
            float r9 = (float) r8
            float r9 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r9)
            goto L_0x004a
        L_0x0048:
            r9 = r18
        L_0x004a:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0058
            r10 = -1
            java.lang.String r11 = "androidx.compose.material.ButtonDefaults.elevation (Button.kt:371)"
            r12 = r20
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r12, r10, r11)
        L_0x0058:
            r1 = 5
            java.lang.Object[] r10 = new java.lang.Object[r1]
            androidx.compose.ui.unit.Dp r11 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r5)
            r10[r4] = r11
            androidx.compose.ui.unit.Dp r11 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r6)
            r12 = 1
            r10[r12] = r11
            androidx.compose.ui.unit.Dp r11 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r7)
            r10[r3] = r11
            r3 = 3
            androidx.compose.ui.unit.Dp r11 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r2)
            r10[r3] = r11
            androidx.compose.ui.unit.Dp r3 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r9)
            r10[r8] = r3
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.startReplaceableGroup(r3)
            r3 = r4
        L_0x0082:
            if (r4 >= r1) goto L_0x008e
            r8 = r10[r4]
            boolean r8 = r0.changed((java.lang.Object) r8)
            r3 = r3 | r8
            int r4 = r4 + 1
            goto L_0x0082
        L_0x008e:
            java.lang.Object r1 = r19.rememberedValue()
            if (r3 != 0) goto L_0x009c
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r1 != r3) goto L_0x00a7
        L_0x009c:
            androidx.compose.material.DefaultButtonElevation r1 = new androidx.compose.material.DefaultButtonElevation
            r10 = 0
            r4 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.updateRememberedValue(r1)
        L_0x00a7:
            r19.endReplaceableGroup()
            androidx.compose.material.DefaultButtonElevation r1 = (androidx.compose.material.DefaultButtonElevation) r1
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x00b5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00b5:
            r19.endReplaceableGroup()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonDefaults.m33918elevationR_JCAzs(float, float, float, float, float, androidx.compose.runtime.Composer, int, int):androidx.compose.material.ButtonElevation");
    }

    @Composable
    /* renamed from: elevation-yajeYGU  reason: not valid java name */
    public final /* synthetic */ ButtonElevation m33919elevationyajeYGU(float f, float f2, float f3, Composer composer, int i, int i2) {
        float f4;
        float f5;
        float f6;
        int i3 = i;
        composer.startReplaceableGroup(1428576874);
        if ((i2 & 1) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 2);
        } else {
            f4 = f;
        }
        if ((i2 & 2) != 0) {
            f5 = C1232Dp.m38468constructorimpl((float) 8);
        } else {
            f5 = f2;
        }
        if ((i2 & 4) != 0) {
            f6 = C1232Dp.m38468constructorimpl((float) 0);
        } else {
            f6 = f3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i3, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:345)");
        }
        float f7 = (float) 4;
        ButtonElevation r0 = m33918elevationR_JCAzs(f4, f5, f6, C1232Dp.m38468constructorimpl(f7), C1232Dp.m38468constructorimpl(f7), composer, (i3 & 14) | 27648 | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i3 << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m33920getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM  reason: not valid java name */
    public final float m33921getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m33922getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m33923getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    public final BorderStroke getOutlinedBorder(Composer composer, int i) {
        composer.startReplaceableGroup(-2091313033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        BorderStroke r11 = BorderStrokeKt.m32976BorderStrokecXLIe8U(OutlinedBorderSize, Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m33951getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r11;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM  reason: not valid java name */
    public final float m33924getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    /* renamed from: outlinedButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m33925outlinedButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        long j4;
        long j5;
        long j6;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-2124406093);
        if ((i2 & 1) != 0) {
            j4 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33956getSurface0d7_KjU();
        } else {
            j4 = j;
        }
        if ((i2 & 2) != 0) {
            j5 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU();
        } else {
            j5 = j2;
        }
        if ((i2 & 4) != 0) {
            j6 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j6 = j3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:428)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j4, j5, j4, j6, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    /* renamed from: textButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m33926textButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        long j4;
        long j5;
        long j6;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(182742216);
        if ((i2 & 1) != 0) {
            j4 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j4 = j;
        }
        if ((i2 & 2) != 0) {
            j5 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU();
        } else {
            j5 = j2;
        }
        if ((i2 & 4) != 0) {
            j6 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j6 = j3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:449)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j4, j5, j4, j6, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }
}
