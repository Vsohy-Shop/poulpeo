package androidx.compose.animation;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.MeasurePolicy;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentScope<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentScope<?> animatedContentScope) {
        C12775o.m28639i(animatedContentScope, "rootScope");
        this.rootScope = animatedContentScope;
    }

    public final AnimatedContentScope<?> getRootScope() {
        return this.rootScope;
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        Integer num = (Integer) C13662o.m31289v(C13662o.m31287t(C12686e0.m28213R(list), new AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        Integer num = (Integer) C13662o.m31289v(C13662o.m31287t(C12686e0.m28213R(list), new AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.compose.ui.layout.Placeable[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: androidx.compose.animation.AnimatedContentScope$ChildData} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.compose.ui.layout.Placeable] */
    /* JADX WARNING: type inference failed for: r10v1, types: [androidx.compose.ui.layout.Placeable] */
    /* JADX WARNING: type inference failed for: r10v3, types: [androidx.compose.ui.layout.Placeable] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r4v3, types: [androidx.compose.ui.layout.Placeable] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r1v7, types: [androidx.compose.ui.layout.Placeable] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r9v5, types: [androidx.compose.ui.layout.Placeable] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.p002ui.layout.MeasureResult m32796measure3p2s80s(androidx.compose.p002ui.layout.MeasureScope r16, java.util.List<? extends androidx.compose.p002ui.layout.Measurable> r17, long r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            r2 = r18
            java.lang.String r4 = "$this$measure"
            r5 = r16
            kotlin.jvm.internal.C12775o.m28639i(r5, r4)
            java.lang.String r4 = "measurables"
            kotlin.jvm.internal.C12775o.m28639i(r1, r4)
            int r4 = r17.size()
            androidx.compose.ui.layout.Placeable[] r6 = new androidx.compose.p002ui.layout.Placeable[r4]
            int r7 = r17.size()
            r8 = 0
            r9 = r8
        L_0x001d:
            r10 = 0
            r11 = 1
            if (r9 >= r7) goto L_0x0047
            java.lang.Object r12 = r1.get(r9)
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.p002ui.layout.Measurable) r12
            java.lang.Object r13 = r12.getParentData()
            boolean r14 = r13 instanceof androidx.compose.animation.AnimatedContentScope.ChildData
            if (r14 == 0) goto L_0x0032
            r10 = r13
            androidx.compose.animation.AnimatedContentScope$ChildData r10 = (androidx.compose.animation.AnimatedContentScope.ChildData) r10
        L_0x0032:
            if (r10 == 0) goto L_0x003b
            boolean r10 = r10.isTarget()
            if (r10 != r11) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r11 = r8
        L_0x003c:
            if (r11 == 0) goto L_0x0044
            androidx.compose.ui.layout.Placeable r10 = r12.m37365measureBRTryo0(r2)
            r6[r9] = r10
        L_0x0044:
            int r9 = r9 + 1
            goto L_0x001d
        L_0x0047:
            int r7 = r17.size()
            r9 = r8
        L_0x004c:
            if (r9 >= r7) goto L_0x0061
            java.lang.Object r12 = r1.get(r9)
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.p002ui.layout.Measurable) r12
            r13 = r6[r9]
            if (r13 != 0) goto L_0x005e
            androidx.compose.ui.layout.Placeable r12 = r12.m37365measureBRTryo0(r2)
            r6[r9] = r12
        L_0x005e:
            int r9 = r9 + 1
            goto L_0x004c
        L_0x0061:
            if (r4 != 0) goto L_0x0065
            r1 = r11
            goto L_0x0066
        L_0x0065:
            r1 = r8
        L_0x0066:
            if (r1 == 0) goto L_0x006a
            r1 = r10
            goto L_0x0091
        L_0x006a:
            r1 = r6[r8]
            int r2 = kotlin.collections.C12710p.m28385M(r6)
            if (r2 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r1 == 0) goto L_0x007a
            int r3 = r1.getWidth()
            goto L_0x007b
        L_0x007a:
            r3 = r8
        L_0x007b:
            if (r11 > r2) goto L_0x0091
            r7 = r11
        L_0x007e:
            r9 = r6[r7]
            if (r9 == 0) goto L_0x0087
            int r12 = r9.getWidth()
            goto L_0x0088
        L_0x0087:
            r12 = r8
        L_0x0088:
            if (r3 >= r12) goto L_0x008c
            r1 = r9
            r3 = r12
        L_0x008c:
            if (r7 == r2) goto L_0x0091
            int r7 = r7 + 1
            goto L_0x007e
        L_0x0091:
            if (r1 == 0) goto L_0x0098
            int r1 = r1.getWidth()
            goto L_0x0099
        L_0x0098:
            r1 = r8
        L_0x0099:
            if (r4 != 0) goto L_0x009d
            r2 = r11
            goto L_0x009e
        L_0x009d:
            r2 = r8
        L_0x009e:
            if (r2 == 0) goto L_0x00a1
            goto L_0x00c7
        L_0x00a1:
            r10 = r6[r8]
            int r2 = kotlin.collections.C12710p.m28385M(r6)
            if (r2 != 0) goto L_0x00aa
            goto L_0x00c7
        L_0x00aa:
            if (r10 == 0) goto L_0x00b1
            int r3 = r10.getHeight()
            goto L_0x00b2
        L_0x00b1:
            r3 = r8
        L_0x00b2:
            if (r11 > r2) goto L_0x00c7
        L_0x00b4:
            r4 = r6[r11]
            if (r4 == 0) goto L_0x00bd
            int r7 = r4.getHeight()
            goto L_0x00be
        L_0x00bd:
            r7 = r8
        L_0x00be:
            if (r3 >= r7) goto L_0x00c2
            r10 = r4
            r3 = r7
        L_0x00c2:
            if (r11 == r2) goto L_0x00c7
            int r11 = r11 + 1
            goto L_0x00b4
        L_0x00c7:
            if (r10 == 0) goto L_0x00cf
            int r2 = r10.getHeight()
            r7 = r2
            goto L_0x00d0
        L_0x00cf:
            r7 = r8
        L_0x00d0:
            androidx.compose.animation.AnimatedContentScope<?> r2 = r0.rootScope
            long r3 = androidx.compose.p002ui.unit.IntSizeKt.IntSize(r1, r7)
            r2.m32808setMeasuredSizeozmzZPI$animation_release(r3)
            r8 = 0
            androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3 r9 = new androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            r9.<init>(r6, r15, r1, r7)
            r10 = 4
            r11 = 0
            r5 = r16
            r6 = r1
            androidx.compose.ui.layout.MeasureResult r1 = androidx.compose.p002ui.layout.MeasureScope.layout$default(r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentMeasurePolicy.m32796measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        Integer num = (Integer) C13662o.m31289v(C13662o.m31287t(C12686e0.m28213R(list), new AnimatedContentMeasurePolicy$minIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        Integer num = (Integer) C13662o.m31289v(C13662o.m31287t(C12686e0.m28213R(list), new AnimatedContentMeasurePolicy$minIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
