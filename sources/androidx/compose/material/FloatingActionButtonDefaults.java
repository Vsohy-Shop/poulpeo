package androidx.compose.material;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,336:1\n154#2:337\n154#2:338\n154#2:339\n154#2:340\n154#2:341\n154#2:342\n154#2:343\n154#2:344\n83#3,3:345\n1114#4,6:348\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n*L\n221#1:337\n222#1:338\n226#1:339\n227#1:340\n246#1:341\n247#1:342\n248#1:343\n249#1:344\n251#1:345,3\n251#1:348,6\n*E\n"})
/* compiled from: FloatingActionButton.kt */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @Composable
    /* renamed from: elevation-ixp7dh8  reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m34029elevationixp7dh8(float f, float f2, Composer composer, int i, int i2) {
        float f3;
        float f4;
        int i3 = i;
        Composer composer2 = composer;
        composer.startReplaceableGroup(-654132828);
        if ((i2 & 1) != 0) {
            f3 = C1232Dp.m38468constructorimpl((float) 6);
        } else {
            f3 = f;
        }
        if ((i2 & 2) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 12);
        } else {
            f4 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-654132828, i, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:219)");
        }
        float f5 = (float) 8;
        FloatingActionButtonElevation r0 = m34030elevationxZ9QkE(f3, f4, C1232Dp.m38468constructorimpl(f5), C1232Dp.m38468constructorimpl(f5), composer, (i3 & 14) | 3456 | (i3 & 112) | ((i3 << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: androidx.compose.material.DefaultFloatingActionButtonElevation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.material.DefaultFloatingActionButtonElevation} */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r8 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x007f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* renamed from: elevation-xZ9-QkE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.FloatingActionButtonElevation m34030elevationxZ9QkE(float r8, float r9, float r10, float r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            r7 = this;
            r0 = 380403812(0x16ac8064, float:2.7869125E-25)
            r12.startReplaceableGroup(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0010
            r8 = 6
            float r8 = (float) r8
            float r8 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r8)
        L_0x0010:
            r2 = r8
            r8 = r14 & 2
            if (r8 == 0) goto L_0x001c
            r8 = 12
            float r8 = (float) r8
            float r9 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r8)
        L_0x001c:
            r3 = r9
            r8 = r14 & 4
            r9 = 8
            if (r8 == 0) goto L_0x0028
            float r8 = (float) r9
            float r10 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r8)
        L_0x0028:
            r4 = r10
            r8 = r14 & 8
            if (r8 == 0) goto L_0x0032
            float r8 = (float) r9
            float r11 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r8)
        L_0x0032:
            r5 = r11
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x003f
            r8 = -1
            java.lang.String r9 = "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:244)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r8, r9)
        L_0x003f:
            r8 = 4
            java.lang.Object[] r9 = new java.lang.Object[r8]
            androidx.compose.ui.unit.Dp r10 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r2)
            r11 = 0
            r9[r11] = r10
            androidx.compose.ui.unit.Dp r10 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r3)
            r13 = 1
            r9[r13] = r10
            androidx.compose.ui.unit.Dp r10 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r4)
            r13 = 2
            r9[r13] = r10
            r10 = 3
            androidx.compose.ui.unit.Dp r13 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r5)
            r9[r10] = r13
            r10 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r12.startReplaceableGroup(r10)
            r10 = r11
        L_0x0065:
            if (r11 >= r8) goto L_0x0071
            r13 = r9[r11]
            boolean r13 = r12.changed((java.lang.Object) r13)
            r10 = r10 | r13
            int r11 = r11 + 1
            goto L_0x0065
        L_0x0071:
            java.lang.Object r8 = r12.rememberedValue()
            if (r10 != 0) goto L_0x007f
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r8 != r9) goto L_0x0089
        L_0x007f:
            androidx.compose.material.DefaultFloatingActionButtonElevation r8 = new androidx.compose.material.DefaultFloatingActionButtonElevation
            r6 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r12.updateRememberedValue(r8)
        L_0x0089:
            r12.endReplaceableGroup()
            androidx.compose.material.DefaultFloatingActionButtonElevation r8 = (androidx.compose.material.DefaultFloatingActionButtonElevation) r8
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x0097
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0097:
            r12.endReplaceableGroup()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonDefaults.m34030elevationxZ9QkE(float, float, float, float, androidx.compose.runtime.Composer, int, int):androidx.compose.material.FloatingActionButtonElevation");
    }
}
