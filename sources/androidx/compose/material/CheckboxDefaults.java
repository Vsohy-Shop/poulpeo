package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,485:1\n83#2,3:486\n1114#3,6:489\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n*L\n234#1:486,3\n234#1:489,6\n*E\n"})
/* compiled from: Checkbox.kt */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.material.DefaultCheckboxColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.compose.material.DefaultCheckboxColors} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f9, code lost:
        if (r1 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x00fb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* renamed from: colors-zjMxDiM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.CheckboxColors m33930colorszjMxDiM(long r31, long r33, long r35, long r37, long r39, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            r30 = this;
            r0 = r41
            r1 = 469524104(0x1bfc5e88, float:4.1750992E-22)
            r0.startReplaceableGroup(r1)
            r2 = r43 & 1
            r3 = 6
            if (r2 == 0) goto L_0x001a
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r2 = r2.getColors(r0, r3)
            long r4 = r2.m33954getSecondary0d7_KjU()
            r21 = r4
            goto L_0x001c
        L_0x001a:
            r21 = r31
        L_0x001c:
            r2 = r43 & 2
            if (r2 == 0) goto L_0x003a
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r2 = r2.getColors(r0, r3)
            long r4 = r2.m33951getOnSurface0d7_KjU()
            r6 = 1058642330(0x3f19999a, float:0.6)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            long r4 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r4, r6, r7, r8, r9, r10, r11)
            r23 = r4
            goto L_0x003c
        L_0x003a:
            r23 = r33
        L_0x003c:
            r2 = r43 & 4
            if (r2 == 0) goto L_0x004c
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r2 = r2.getColors(r0, r3)
            long r4 = r2.m33956getSurface0d7_KjU()
            r7 = r4
            goto L_0x004e
        L_0x004c:
            r7 = r35
        L_0x004e:
            r2 = r43 & 8
            if (r2 == 0) goto L_0x007d
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r2 = r2.getColors(r0, r3)
            long r4 = r2.m33951getOnSurface0d7_KjU()
            androidx.compose.material.ContentAlpha r2 = androidx.compose.material.ContentAlpha.INSTANCE
            float r2 = r2.getDisabled(r0, r3)
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 14
            r12 = 0
            r31 = r4
            r33 = r2
            r34 = r6
            r35 = r9
            r36 = r10
            r37 = r11
            r38 = r12
            long r4 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r31, r33, r34, r35, r36, r37, r38)
            r25 = r4
            goto L_0x007f
        L_0x007d:
            r25 = r37
        L_0x007f:
            r2 = r43 & 16
            if (r2 == 0) goto L_0x00a4
            androidx.compose.material.ContentAlpha r2 = androidx.compose.material.ContentAlpha.INSTANCE
            float r2 = r2.getDisabled(r0, r3)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 14
            r9 = 0
            r31 = r21
            r33 = r2
            r34 = r3
            r35 = r4
            r36 = r5
            r37 = r6
            r38 = r9
            long r2 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r31, r33, r34, r35, r36, r37, r38)
            r27 = r2
            goto L_0x00a6
        L_0x00a4:
            r27 = r39
        L_0x00a6:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x00b4
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:226)"
            r4 = r42
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r4, r2, r3)
        L_0x00b4:
            r1 = 5
            java.lang.Object[] r2 = new java.lang.Object[r1]
            androidx.compose.ui.graphics.Color r3 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r21)
            r4 = 0
            r2[r4] = r3
            androidx.compose.ui.graphics.Color r3 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r23)
            r5 = 1
            r2[r5] = r3
            androidx.compose.ui.graphics.Color r3 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r7)
            r5 = 2
            r2[r5] = r3
            r3 = 3
            androidx.compose.ui.graphics.Color r5 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r25)
            r2[r3] = r5
            androidx.compose.ui.graphics.Color r3 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r27)
            r5 = 4
            r2[r5] = r3
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.startReplaceableGroup(r3)
            r3 = r4
        L_0x00e1:
            if (r4 >= r1) goto L_0x00ed
            r5 = r2[r4]
            boolean r5 = r0.changed((java.lang.Object) r5)
            r3 = r3 | r5
            int r4 = r4 + 1
            goto L_0x00e1
        L_0x00ed:
            java.lang.Object r1 = r41.rememberedValue()
            if (r3 != 0) goto L_0x00fb
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x0131
        L_0x00fb:
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r31 = r7
            r33 = r1
            r34 = r2
            r35 = r3
            r36 = r4
            r37 = r5
            r38 = r6
            long r9 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r31, r33, r34, r35, r36, r37, r38)
            r31 = r21
            long r13 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r31, r33, r34, r35, r36, r37, r38)
            r31 = r25
            long r17 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r31, r33, r34, r35, r36, r37, r38)
            androidx.compose.material.DefaultCheckboxColors r1 = new androidx.compose.material.DefaultCheckboxColors
            r6 = r1
            r29 = 0
            r11 = r21
            r15 = r25
            r19 = r27
            r6.<init>(r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29)
            r0.updateRememberedValue(r1)
        L_0x0131:
            r41.endReplaceableGroup()
            androidx.compose.material.DefaultCheckboxColors r1 = (androidx.compose.material.DefaultCheckboxColors) r1
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x013f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x013f:
            r41.endReplaceableGroup()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxDefaults.m33930colorszjMxDiM(long, long, long, long, long, androidx.compose.runtime.Composer, int, int):androidx.compose.material.CheckboxColors");
    }
}
