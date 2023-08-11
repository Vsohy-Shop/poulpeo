package androidx.compose.animation;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.MeasurePolicy;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    private final AnimatedVisibilityScopeImpl scope;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        C12775o.m28639i(animatedVisibilityScopeImpl, "scope");
        this.scope = animatedVisibilityScopeImpl;
    }

    public final AnimatedVisibilityScopeImpl getScope() {
        return this.scope;
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        Integer num = (Integer) C13662o.m31289v(C13662o.m31287t(C12686e0.m28213R(list), new AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        Integer num = (Integer) C13662o.m31289v(C13662o.m31287t(C12686e0.m28213R(list), new AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.ui.layout.Placeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.p002ui.layout.MeasureResult m32826measure3p2s80s(androidx.compose.p002ui.layout.MeasureScope r10, java.util.List<? extends androidx.compose.p002ui.layout.Measurable> r11, long r12) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$measure"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "measurables"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C12728x.m28544v(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L_0x001b:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r11.next()
            androidx.compose.ui.layout.Measurable r1 = (androidx.compose.p002ui.layout.Measurable) r1
            androidx.compose.ui.layout.Placeable r1 = r1.m37365measureBRTryo0(r12)
            r0.add(r1)
            goto L_0x001b
        L_0x002f:
            boolean r11 = r0.isEmpty()
            r12 = 0
            r13 = 1
            r1 = 0
            if (r11 == 0) goto L_0x003a
            r11 = r12
            goto L_0x0060
        L_0x003a:
            java.lang.Object r11 = r0.get(r1)
            r2 = r11
            androidx.compose.ui.layout.Placeable r2 = (androidx.compose.p002ui.layout.Placeable) r2
            int r2 = r2.getWidth()
            int r3 = kotlin.collections.C12726w.m28526m(r0)
            if (r13 > r3) goto L_0x0060
            r4 = r13
        L_0x004c:
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            androidx.compose.ui.layout.Placeable r6 = (androidx.compose.p002ui.layout.Placeable) r6
            int r6 = r6.getWidth()
            if (r2 >= r6) goto L_0x005b
            r11 = r5
            r2 = r6
        L_0x005b:
            if (r4 == r3) goto L_0x0060
            int r4 = r4 + 1
            goto L_0x004c
        L_0x0060:
            androidx.compose.ui.layout.Placeable r11 = (androidx.compose.p002ui.layout.Placeable) r11
            if (r11 == 0) goto L_0x006a
            int r11 = r11.getWidth()
            r3 = r11
            goto L_0x006b
        L_0x006a:
            r3 = r1
        L_0x006b:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x0072
            goto L_0x0098
        L_0x0072:
            java.lang.Object r11 = r0.get(r1)
            r12 = r11
            androidx.compose.ui.layout.Placeable r12 = (androidx.compose.p002ui.layout.Placeable) r12
            int r12 = r12.getHeight()
            int r2 = kotlin.collections.C12726w.m28526m(r0)
            if (r13 > r2) goto L_0x0097
        L_0x0083:
            java.lang.Object r4 = r0.get(r13)
            r5 = r4
            androidx.compose.ui.layout.Placeable r5 = (androidx.compose.p002ui.layout.Placeable) r5
            int r5 = r5.getHeight()
            if (r12 >= r5) goto L_0x0092
            r11 = r4
            r12 = r5
        L_0x0092:
            if (r13 == r2) goto L_0x0097
            int r13 = r13 + 1
            goto L_0x0083
        L_0x0097:
            r12 = r11
        L_0x0098:
            androidx.compose.ui.layout.Placeable r12 = (androidx.compose.p002ui.layout.Placeable) r12
            if (r12 == 0) goto L_0x00a0
            int r1 = r12.getHeight()
        L_0x00a0:
            r4 = r1
            androidx.compose.animation.AnimatedVisibilityScopeImpl r11 = r9.scope
            androidx.compose.runtime.MutableState r11 = r11.getTargetSize$animation_release()
            long r12 = androidx.compose.p002ui.unit.IntSizeKt.IntSize(r3, r4)
            androidx.compose.ui.unit.IntSize r12 = androidx.compose.p002ui.unit.IntSize.m38620boximpl(r12)
            r11.setValue(r12)
            r5 = 0
            androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1 r6 = new androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            r6.<init>(r0)
            r7 = 4
            r8 = 0
            r2 = r10
            androidx.compose.ui.layout.MeasureResult r10 = androidx.compose.p002ui.layout.MeasureScope.layout$default(r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedEnterExitMeasurePolicy.m32826measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        Integer num = (Integer) C13662o.m31289v(C13662o.m31287t(C12686e0.m28213R(list), new AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        Integer num = (Integer) C13662o.m31289v(C13662o.m31287t(C12686e0.m28213R(list), new AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
