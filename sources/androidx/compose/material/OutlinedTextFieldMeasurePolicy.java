package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,981:1\n1#2:982\n223#3,2:983\n223#3,2:985\n223#3,2:987\n223#3,2:989\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n*L\n622#1:983,2\n653#1:985,2\n722#1:987,2\n754#1:989,2\n*E\n"})
/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    /* access modifiers changed from: private */
    public final float animationProgress;
    private final Function1<Size, C11921v> onLabelMeasured;
    /* access modifiers changed from: private */
    public final PaddingValues paddingValues;
    /* access modifiers changed from: private */
    public final boolean singleLine;

    public OutlinedTextFieldMeasurePolicy(Function1<? super Size, C11921v> function1, boolean z, float f, PaddingValues paddingValues2) {
        C12775o.m28639i(function1, "onLabelMeasured");
        C12775o.m28639i(paddingValues2, "paddingValues");
        this.onLabelMeasured = function1;
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int intrinsicHeight(androidx.compose.p002ui.layout.IntrinsicMeasureScope r11, java.util.List<? extends androidx.compose.p002ui.layout.IntrinsicMeasurable> r12, int r13, p404of.C13088o<? super androidx.compose.p002ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> r14) {
        /*
            r10 = this;
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r0 = r12.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x010d
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.compose.ui.layout.IntrinsicMeasurable r2 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r2
            java.lang.Object r2 = androidx.compose.material.TextFieldImplKt.getLayoutId(r2)
            java.lang.String r3 = "TextField"
            boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r2, r3)
            if (r2 == 0) goto L_0x0006
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r14.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.util.Iterator r0 = r12.iterator()
        L_0x0031:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x004c
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.compose.ui.layout.IntrinsicMeasurable r4 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r4
            java.lang.Object r4 = androidx.compose.material.TextFieldImplKt.getLayoutId(r4)
            java.lang.String r5 = "Label"
            boolean r4 = kotlin.jvm.internal.C12775o.m28634d(r4, r5)
            if (r4 == 0) goto L_0x0031
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            androidx.compose.ui.layout.IntrinsicMeasurable r1 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r1
            r0 = 0
            if (r1 == 0) goto L_0x0062
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r1, r4)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = r1
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            java.util.Iterator r1 = r12.iterator()
        L_0x0067:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r1.next()
            r6 = r5
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r6
            java.lang.Object r6 = androidx.compose.material.TextFieldImplKt.getLayoutId(r6)
            java.lang.String r7 = "Trailing"
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r6, r7)
            if (r6 == 0) goto L_0x0067
            goto L_0x0082
        L_0x0081:
            r5 = r2
        L_0x0082:
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r5
            if (r5 == 0) goto L_0x0096
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r5, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r5 = r1
            goto L_0x0097
        L_0x0096:
            r5 = r0
        L_0x0097:
            java.util.Iterator r1 = r12.iterator()
        L_0x009b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r1.next()
            r7 = r6
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.getLayoutId(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r8)
            if (r7 == 0) goto L_0x009b
            goto L_0x00b6
        L_0x00b5:
            r6 = r2
        L_0x00b6:
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r6
            if (r6 == 0) goto L_0x00c9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r6, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x00ca
        L_0x00c9:
            r1 = r0
        L_0x00ca:
            java.util.Iterator r12 = r12.iterator()
        L_0x00ce:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r12.next()
            r7 = r6
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.getLayoutId(r7)
            java.lang.String r8 = "Hint"
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r8)
            if (r7 == 0) goto L_0x00ce
            r2 = r6
        L_0x00e8:
            androidx.compose.ui.layout.IntrinsicMeasurable r2 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r2
            if (r2 == 0) goto L_0x00fb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            java.lang.Object r12 = r14.invoke(r2, r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            goto L_0x00fc
        L_0x00fb:
            r12 = r0
        L_0x00fc:
            long r6 = androidx.compose.material.TextFieldImplKt.getZeroConstraints()
            float r8 = r11.getDensity()
            androidx.compose.foundation.layout.PaddingValues r9 = r10.paddingValues
            r2 = r5
            r5 = r12
            int r11 = androidx.compose.material.OutlinedTextFieldKt.m34071calculateHeightzUg2_y0(r1, r2, r3, r4, r5, r6, r8, r9)
            return r11
        L_0x010d:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
            java.lang.String r12 = "Collection contains no element matching the predicate."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldMeasurePolicy.intrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, of.o):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int intrinsicWidth(androidx.compose.p002ui.layout.IntrinsicMeasureScope r12, java.util.List<? extends androidx.compose.p002ui.layout.IntrinsicMeasurable> r13, int r14, p404of.C13088o<? super androidx.compose.p002ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> r15) {
        /*
            r11 = this;
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r0 = r13.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0119
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.compose.ui.layout.IntrinsicMeasurable r2 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r2
            java.lang.Object r2 = androidx.compose.material.TextFieldImplKt.getLayoutId(r2)
            java.lang.String r3 = "TextField"
            boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r2, r3)
            if (r2 == 0) goto L_0x0006
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.Object r0 = r15.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.util.Iterator r0 = r13.iterator()
        L_0x0031:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x004c
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.compose.ui.layout.IntrinsicMeasurable r4 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r4
            java.lang.Object r4 = androidx.compose.material.TextFieldImplKt.getLayoutId(r4)
            java.lang.String r5 = "Label"
            boolean r4 = kotlin.jvm.internal.C12775o.m28634d(r4, r5)
            if (r4 == 0) goto L_0x0031
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            androidx.compose.ui.layout.IntrinsicMeasurable r1 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r1
            r0 = 0
            if (r1 == 0) goto L_0x0062
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.Object r1 = r15.invoke(r1, r4)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = r1
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            java.util.Iterator r1 = r13.iterator()
        L_0x0067:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r1.next()
            r6 = r5
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r6
            java.lang.Object r6 = androidx.compose.material.TextFieldImplKt.getLayoutId(r6)
            java.lang.String r7 = "Trailing"
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r6, r7)
            if (r6 == 0) goto L_0x0067
            goto L_0x0082
        L_0x0081:
            r5 = r2
        L_0x0082:
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r5
            if (r5 == 0) goto L_0x0096
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object r1 = r15.invoke(r5, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r5 = r1
            goto L_0x0097
        L_0x0096:
            r5 = r0
        L_0x0097:
            java.util.Iterator r1 = r13.iterator()
        L_0x009b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r1.next()
            r7 = r6
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.getLayoutId(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r8)
            if (r7 == 0) goto L_0x009b
            goto L_0x00b6
        L_0x00b5:
            r6 = r2
        L_0x00b6:
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r6
            if (r6 == 0) goto L_0x00c9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object r1 = r15.invoke(r6, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x00ca
        L_0x00c9:
            r1 = r0
        L_0x00ca:
            java.util.Iterator r13 = r13.iterator()
        L_0x00ce:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r13.next()
            r7 = r6
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.getLayoutId(r7)
            java.lang.String r8 = "Hint"
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r8)
            if (r7 == 0) goto L_0x00ce
            r2 = r6
        L_0x00e8:
            androidx.compose.ui.layout.IntrinsicMeasurable r2 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r2
            if (r2 == 0) goto L_0x00fb
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.Object r13 = r15.invoke(r2, r13)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            goto L_0x00fc
        L_0x00fb:
            r13 = r0
        L_0x00fc:
            float r14 = r11.animationProgress
            r15 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x0107
            r14 = 1
            r6 = r14
            goto L_0x0108
        L_0x0107:
            r6 = r0
        L_0x0108:
            long r7 = androidx.compose.material.TextFieldImplKt.getZeroConstraints()
            float r9 = r12.getDensity()
            androidx.compose.foundation.layout.PaddingValues r10 = r11.paddingValues
            r2 = r5
            r5 = r13
            int r12 = androidx.compose.material.OutlinedTextFieldKt.m34072calculateWidthO3s9Psw(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return r12
        L_0x0119:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r13 = "Collection contains no element matching the predicate."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldMeasurePolicy.intrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, of.o):int");
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m34074measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Object obj;
        Placeable placeable;
        Object obj2;
        Placeable placeable2;
        boolean z;
        int i;
        Object obj3;
        Placeable placeable3;
        Object obj4;
        Placeable placeable4;
        int i2;
        int i3;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        C12775o.m28639i(measureScope2, "$this$measure");
        C12775o.m28639i(list2, "measurables");
        int r1 = measureScope2.m38443roundToPx0680j_4(this.paddingValues.m33278calculateBottomPaddingD9Ej5fM());
        long r2 = Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 10, (Object) null);
        Iterable<Measurable> iterable = list2;
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C12775o.m28634d(LayoutIdKt.getLayoutId((Measurable) obj), "Leading")) {
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        if (measurable != null) {
            placeable = measurable.m37365measureBRTryo0(r2);
        } else {
            placeable = null;
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable) + 0;
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (C12775o.m28634d(LayoutIdKt.getLayoutId((Measurable) obj2), "Trailing")) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            placeable2 = measurable2.m37365measureBRTryo0(ConstraintsKt.m38429offsetNN6EwU$default(r2, -widthOrZero, 0, 2, (Object) null));
        } else {
            placeable2 = null;
        }
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(placeable2);
        if (this.animationProgress < 1.0f) {
            z = true;
        } else {
            z = false;
        }
        int r9 = measureScope2.m38443roundToPx0680j_4(this.paddingValues.m33279calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope2.m38443roundToPx0680j_4(this.paddingValues.m33280calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
        if (z) {
            i = (-widthOrZero2) - r9;
        } else {
            i = -r9;
        }
        int i4 = -r1;
        long r22 = ConstraintsKt.m38428offsetNN6EwU(r2, i, i4);
        Iterator it3 = iterable.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (C12775o.m28634d(LayoutIdKt.getLayoutId((Measurable) obj3), "Label")) {
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj3;
        if (measurable3 != null) {
            placeable3 = measurable3.m37365measureBRTryo0(r22);
        } else {
            placeable3 = null;
        }
        if (placeable3 != null) {
            this.onLabelMeasured.invoke(Size.m35479boximpl(SizeKt.Size((float) placeable3.getWidth(), (float) placeable3.getHeight())));
        }
        long r12 = Constraints.m38403copyZbe2FdA$default(ConstraintsKt.m38428offsetNN6EwU(j, -widthOrZero2, i4 - Math.max(TextFieldImplKt.heightOrZero(placeable3) / 2, measureScope2.m38443roundToPx0680j_4(this.paddingValues.m33281calculateTopPaddingD9Ej5fM()))), 0, 0, 0, 0, 11, (Object) null);
        for (Measurable measurable4 : iterable) {
            if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                Placeable r5 = measurable4.m37365measureBRTryo0(r12);
                long r13 = Constraints.m38403copyZbe2FdA$default(r12, 0, 0, 0, 0, 14, (Object) null);
                Iterator it4 = iterable.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it4.next();
                    if (C12775o.m28634d(LayoutIdKt.getLayoutId((Measurable) obj4), "Hint")) {
                        break;
                    }
                }
                Measurable measurable5 = (Measurable) obj4;
                if (measurable5 != null) {
                    placeable4 = measurable5.m37365measureBRTryo0(r13);
                } else {
                    placeable4 = null;
                }
                int r132 = OutlinedTextFieldKt.m34072calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), r5.getWidth(), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), z, j, measureScope.getDensity(), this.paddingValues);
                int r14 = OutlinedTextFieldKt.m34071calculateHeightzUg2_y0(TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), r5.getHeight(), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeable4), j, measureScope.getDensity(), this.paddingValues);
                for (Measurable measurable6 : iterable) {
                    if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable6), OutlinedTextFieldKt.BorderId)) {
                        if (r132 != Integer.MAX_VALUE) {
                            i2 = r132;
                        } else {
                            i2 = 0;
                        }
                        if (r14 != Integer.MAX_VALUE) {
                            i3 = r14;
                        } else {
                            i3 = 0;
                        }
                        return MeasureScope.layout$default(measureScope, r132, r14, (Map) null, new OutlinedTextFieldMeasurePolicy$measure$2(r14, r132, placeable, placeable2, r5, placeable3, placeable4, measurable6.m37365measureBRTryo0(ConstraintsKt.Constraints(i2, r132, i3, r14)), this, measureScope), 4, (Object) null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            long j2 = j;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
