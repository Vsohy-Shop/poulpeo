package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n658#2:243\n646#2:244\n76#3:245\n67#4,3:246\n66#4:249\n1114#5,6:250\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n43#1:243\n43#1:244\n44#1:245\n48#1:246,3\n48#1:249\n48#1:250,6\n*E\n"})
/* compiled from: MaterialTextSelectionColors.kt */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8  reason: not valid java name */
    private static final float m34042binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j, long j2, long j3) {
        boolean z;
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float r2 = (m34044calculateContrastRationb2GgbA(j, f2, j2, j3) / DesiredContrastRatio) - 1.0f;
            if (0.0f > r2 || r2 > 0.01f) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            if (r2 < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    /* renamed from: calculateContrastRatio--OWjLjI  reason: not valid java name */
    public static final float m34043calculateContrastRatioOWjLjI(long j, long j2) {
        float r0 = ColorKt.m35723luminance8_81llA(j) + 0.05f;
        float r2 = ColorKt.m35723luminance8_81llA(j2) + 0.05f;
        return Math.max(r0, r2) / Math.min(r0, r2);
    }

    /* renamed from: calculateContrastRatio-nb2GgbA  reason: not valid java name */
    private static final float m34044calculateContrastRationb2GgbA(long j, float f, long j2, long j3) {
        long r8 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j3);
        return m34043calculateContrastRatioOWjLjI(ColorKt.m35716compositeOverOWjLjI(j2, r8), r8);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8  reason: not valid java name */
    public static final long m34045calculateSelectionBackgroundColorysEtTa8(long j, long j2, long j3) {
        float r10;
        float r0 = m34044calculateContrastRationb2GgbA(j, 0.4f, j2, j3);
        float r1 = m34044calculateContrastRationb2GgbA(j, 0.2f, j2, j3);
        if (r0 >= DesiredContrastRatio) {
            r10 = 0.4f;
        } else if (r1 < DesiredContrastRatio) {
            r10 = 0.2f;
        } else {
            r10 = m34042binarySearchForAccessibleSelectionColorAlphaysEtTa8(j, j2, j3);
        }
        return Color.m35670copywmQWz5c$default(j, r10, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0090, code lost:
        if (r3 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x0092;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.TextSelectionColors rememberTextSelectionColors(androidx.compose.material.Colors r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = "colors"
            kotlin.jvm.internal.C12775o.m28639i(r0, r2)
            r2 = -721696685(0xffffffffd4fbc853, float:-8.6511814E12)
            r1.startReplaceableGroup(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x001d
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)"
            r5 = r21
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r3, r4)
        L_0x001d:
            long r5 = r19.m33952getPrimary0d7_KjU()
            long r9 = r19.m33945getBackground0d7_KjU()
            r2 = 35572910(0x21eccae, float:1.1666747E-37)
            r1.startReplaceableGroup(r2)
            long r2 = androidx.compose.material.ColorsKt.m33969contentColorFor4WTKRHQ(r0, r9)
            androidx.compose.ui.graphics.Color$Companion r4 = androidx.compose.p002ui.graphics.Color.Companion
            long r7 = r4.m35707getUnspecified0d7_KjU()
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x003b
            r4 = 1
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
            goto L_0x004d
        L_0x003f:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            java.lang.Object r2 = r1.consume(r2)
            androidx.compose.ui.graphics.Color r2 = (androidx.compose.p002ui.graphics.Color) r2
            long r2 = r2.m35681unboximpl()
        L_0x004d:
            r11 = r2
            r20.endReplaceableGroup()
            androidx.compose.material.ContentAlpha r2 = androidx.compose.material.ContentAlpha.INSTANCE
            r3 = 6
            float r13 = r2.getMedium(r1, r3)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            long r7 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r11, r13, r14, r15, r16, r17, r18)
            androidx.compose.ui.graphics.Color r2 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r5)
            androidx.compose.ui.graphics.Color r3 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r9)
            androidx.compose.ui.graphics.Color r4 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r7)
            r11 = 1618982084(0x607fb4c4, float:7.370227E19)
            r1.startReplaceableGroup(r11)
            boolean r2 = r1.changed((java.lang.Object) r2)
            boolean r3 = r1.changed((java.lang.Object) r3)
            r2 = r2 | r3
            boolean r3 = r1.changed((java.lang.Object) r4)
            r2 = r2 | r3
            java.lang.Object r3 = r20.rememberedValue()
            if (r2 != 0) goto L_0x0092
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x00a5
        L_0x0092:
            androidx.compose.foundation.text.selection.TextSelectionColors r3 = new androidx.compose.foundation.text.selection.TextSelectionColors
            long r12 = r19.m33952getPrimary0d7_KjU()
            long r14 = m34045calculateSelectionBackgroundColorysEtTa8(r5, r7, r9)
            r16 = 0
            r11 = r3
            r11.<init>(r12, r14, r16)
            r1.updateRememberedValue(r3)
        L_0x00a5:
            r20.endReplaceableGroup()
            androidx.compose.foundation.text.selection.TextSelectionColors r3 = (androidx.compose.foundation.text.selection.TextSelectionColors) r3
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00b3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00b3:
            r20.endReplaceableGroup()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MaterialTextSelectionColorsKt.rememberTextSelectionColors(androidx.compose.material.Colors, androidx.compose.runtime.Composer, int):androidx.compose.foundation.text.selection.TextSelectionColors");
    }
}
