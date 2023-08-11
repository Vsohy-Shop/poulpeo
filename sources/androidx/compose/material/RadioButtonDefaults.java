package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n67#2,3:234\n66#2:237\n1114#3,6:238\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n168#1:234,3\n168#1:237\n168#1:238,6\n*E\n"})
/* compiled from: RadioButton.kt */
public final class RadioButtonDefaults {
    public static final int $stable = 0;
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: androidx.compose.material.DefaultRadioButtonColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: androidx.compose.material.DefaultRadioButtonColors} */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0099, code lost:
        if (r2 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x009b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* renamed from: colors-RGew2ao  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.RadioButtonColors m34095colorsRGew2ao(long r20, long r22, long r24, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r19 = this;
            r0 = r26
            r1 = 1370708026(0x51b3583a, float:9.6284918E10)
            r0.startReplaceableGroup(r1)
            r2 = r28 & 1
            r3 = 6
            if (r2 == 0) goto L_0x0019
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r2 = r2.getColors(r0, r3)
            long r4 = r2.m33954getSecondary0d7_KjU()
            r7 = r4
            goto L_0x001b
        L_0x0019:
            r7 = r20
        L_0x001b:
            r2 = r28 & 2
            if (r2 == 0) goto L_0x0039
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r2 = r2.getColors(r0, r3)
            long r9 = r2.m33951getOnSurface0d7_KjU()
            r11 = 1058642330(0x3f19999a, float:0.6)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 14
            r16 = 0
            long r4 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r9, r11, r12, r13, r14, r15, r16)
            r9 = r4
            goto L_0x003b
        L_0x0039:
            r9 = r22
        L_0x003b:
            r2 = r28 & 4
            if (r2 == 0) goto L_0x005d
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r2 = r2.getColors(r0, r3)
            long r11 = r2.m33951getOnSurface0d7_KjU()
            androidx.compose.material.ContentAlpha r2 = androidx.compose.material.ContentAlpha.INSTANCE
            float r13 = r2.getDisabled(r0, r3)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            long r2 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r11, r13, r14, r15, r16, r17, r18)
            r11 = r2
            goto L_0x005f
        L_0x005d:
            r11 = r24
        L_0x005f:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x006d
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)"
            r4 = r27
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r4, r2, r3)
        L_0x006d:
            androidx.compose.ui.graphics.Color r1 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r7)
            androidx.compose.ui.graphics.Color r2 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r9)
            androidx.compose.ui.graphics.Color r3 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r11)
            r4 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.startReplaceableGroup(r4)
            boolean r1 = r0.changed((java.lang.Object) r1)
            boolean r2 = r0.changed((java.lang.Object) r2)
            r1 = r1 | r2
            boolean r2 = r0.changed((java.lang.Object) r3)
            r1 = r1 | r2
            java.lang.Object r2 = r26.rememberedValue()
            if (r1 != 0) goto L_0x009b
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x00a5
        L_0x009b:
            androidx.compose.material.DefaultRadioButtonColors r2 = new androidx.compose.material.DefaultRadioButtonColors
            r13 = 0
            r6 = r2
            r6.<init>(r7, r9, r11, r13)
            r0.updateRememberedValue(r2)
        L_0x00a5:
            r26.endReplaceableGroup()
            androidx.compose.material.DefaultRadioButtonColors r2 = (androidx.compose.material.DefaultRadioButtonColors) r2
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00b3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00b3:
            r26.endReplaceableGroup()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.RadioButtonDefaults.m34095colorsRGew2ao(long, long, long, androidx.compose.runtime.Composer, int, int):androidx.compose.material.RadioButtonColors");
    }
}
