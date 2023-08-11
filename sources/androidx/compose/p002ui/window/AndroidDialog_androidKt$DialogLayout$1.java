package androidx.compose.p002ui.window;

import androidx.compose.p002ui.layout.MeasurePolicy;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,456:1\n151#2,3:457\n33#2,4:460\n154#2,2:464\n38#2:466\n156#2:467\n171#2,13:468\n171#2,13:481\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n*L\n448#1:457,3\n448#1:460,4\n448#1:464,2\n448#1:466\n448#1:467\n449#1:468,13\n450#1:481,13\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1 */
/* compiled from: AndroidDialog.android.kt */
final class AndroidDialog_androidKt$DialogLayout$1 implements MeasurePolicy {
    public static final AndroidDialog_androidKt$DialogLayout$1 INSTANCE = new AndroidDialog_androidKt$DialogLayout$1();

    AndroidDialog_androidKt$DialogLayout$1() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.ui.layout.Placeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.layout.MeasureResult m38709measure3p2s80s(androidx.compose.p002ui.layout.MeasureScope r12, java.util.List<? extends androidx.compose.p002ui.layout.Measurable> r13, long r14) {
        /*
            r11 = this;
            java.lang.String r0 = "$this$Layout"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "measurables"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.size()
            r0.<init>(r1)
            int r1 = r13.size()
            r2 = 0
            r3 = r2
        L_0x0019:
            if (r3 >= r1) goto L_0x002b
            java.lang.Object r4 = r13.get(r3)
            androidx.compose.ui.layout.Measurable r4 = (androidx.compose.p002ui.layout.Measurable) r4
            androidx.compose.ui.layout.Placeable r4 = r4.m37365measureBRTryo0(r14)
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x0019
        L_0x002b:
            boolean r13 = r0.isEmpty()
            r1 = 0
            r3 = 1
            if (r13 == 0) goto L_0x0035
            r13 = r1
            goto L_0x005b
        L_0x0035:
            java.lang.Object r13 = r0.get(r2)
            r4 = r13
            androidx.compose.ui.layout.Placeable r4 = (androidx.compose.p002ui.layout.Placeable) r4
            int r4 = r4.getWidth()
            int r5 = kotlin.collections.C12726w.m28526m(r0)
            if (r3 > r5) goto L_0x005b
            r6 = r3
        L_0x0047:
            java.lang.Object r7 = r0.get(r6)
            r8 = r7
            androidx.compose.ui.layout.Placeable r8 = (androidx.compose.p002ui.layout.Placeable) r8
            int r8 = r8.getWidth()
            if (r4 >= r8) goto L_0x0056
            r13 = r7
            r4 = r8
        L_0x0056:
            if (r6 == r5) goto L_0x005b
            int r6 = r6 + 1
            goto L_0x0047
        L_0x005b:
            androidx.compose.ui.layout.Placeable r13 = (androidx.compose.p002ui.layout.Placeable) r13
            if (r13 == 0) goto L_0x0064
            int r13 = r13.getWidth()
            goto L_0x0068
        L_0x0064:
            int r13 = androidx.compose.p002ui.unit.Constraints.m38414getMinWidthimpl(r14)
        L_0x0068:
            r5 = r13
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L_0x0070
            goto L_0x0096
        L_0x0070:
            java.lang.Object r13 = r0.get(r2)
            r1 = r13
            androidx.compose.ui.layout.Placeable r1 = (androidx.compose.p002ui.layout.Placeable) r1
            int r1 = r1.getHeight()
            int r2 = kotlin.collections.C12726w.m28526m(r0)
            if (r3 > r2) goto L_0x0095
        L_0x0081:
            java.lang.Object r4 = r0.get(r3)
            r6 = r4
            androidx.compose.ui.layout.Placeable r6 = (androidx.compose.p002ui.layout.Placeable) r6
            int r6 = r6.getHeight()
            if (r1 >= r6) goto L_0x0090
            r13 = r4
            r1 = r6
        L_0x0090:
            if (r3 == r2) goto L_0x0095
            int r3 = r3 + 1
            goto L_0x0081
        L_0x0095:
            r1 = r13
        L_0x0096:
            androidx.compose.ui.layout.Placeable r1 = (androidx.compose.p002ui.layout.Placeable) r1
            if (r1 == 0) goto L_0x009f
            int r13 = r1.getHeight()
            goto L_0x00a3
        L_0x009f:
            int r13 = androidx.compose.p002ui.unit.Constraints.m38413getMinHeightimpl(r14)
        L_0x00a3:
            r6 = r13
            r7 = 0
            androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$measure$1 r8 = new androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$measure$1
            r8.<init>(r0)
            r9 = 4
            r10 = 0
            r4 = r12
            androidx.compose.ui.layout.MeasureResult r12 = androidx.compose.p002ui.layout.MeasureScope.layout$default(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.AndroidDialog_androidKt$DialogLayout$1.m38709measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }
}
