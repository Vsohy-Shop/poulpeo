package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.layout.AlignmentLineKt;
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
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,929:1\n1#2:930\n223#3,2:931\n223#3,2:933\n223#3,2:935\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n*L\n599#1:931,2\n704#1:933,2\n733#1:935,2\n*E\n"})
/* compiled from: TextField.kt */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    /* access modifiers changed from: private */
    public final float animationProgress;
    /* access modifiers changed from: private */
    public final PaddingValues paddingValues;
    /* access modifiers changed from: private */
    public final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues2) {
        C12775o.m28639i(paddingValues2, "paddingValues");
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int intrinsicHeight(androidx.compose.p002ui.layout.IntrinsicMeasureScope r12, java.util.List<? extends androidx.compose.p002ui.layout.IntrinsicMeasurable> r13, int r14, p404of.C13088o<? super androidx.compose.p002ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> r15) {
        /*
            r11 = this;
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r0 = r13.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0115
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
            int r1 = r0.intValue()
            java.util.Iterator r0 = r13.iterator()
        L_0x0031:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r0.next()
            r4 = r2
            androidx.compose.ui.layout.IntrinsicMeasurable r4 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r4
            java.lang.Object r4 = androidx.compose.material.TextFieldImplKt.getLayoutId(r4)
            java.lang.String r5 = "Label"
            boolean r4 = kotlin.jvm.internal.C12775o.m28634d(r4, r5)
            if (r4 == 0) goto L_0x0031
            goto L_0x004d
        L_0x004c:
            r2 = r3
        L_0x004d:
            androidx.compose.ui.layout.IntrinsicMeasurable r2 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r2
            r0 = 0
            if (r2 == 0) goto L_0x0062
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r15.invoke(r2, r4)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r4 = r2
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            java.util.Iterator r2 = r13.iterator()
        L_0x0067:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r2.next()
            r6 = r5
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r6
            java.lang.Object r6 = androidx.compose.material.TextFieldImplKt.getLayoutId(r6)
            java.lang.String r7 = "Trailing"
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r6, r7)
            if (r6 == 0) goto L_0x0067
            goto L_0x0082
        L_0x0081:
            r5 = r3
        L_0x0082:
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r5
            if (r5 == 0) goto L_0x0096
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r15.invoke(r5, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r5 = r2
            goto L_0x0097
        L_0x0096:
            r5 = r0
        L_0x0097:
            java.util.Iterator r2 = r13.iterator()
        L_0x009b:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r2.next()
            r7 = r6
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.getLayoutId(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r8)
            if (r7 == 0) goto L_0x009b
            goto L_0x00b6
        L_0x00b5:
            r6 = r3
        L_0x00b6:
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r6
            if (r6 == 0) goto L_0x00ca
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r15.invoke(r6, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r6 = r2
            goto L_0x00cb
        L_0x00ca:
            r6 = r0
        L_0x00cb:
            java.util.Iterator r13 = r13.iterator()
        L_0x00cf:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x00e9
            java.lang.Object r2 = r13.next()
            r7 = r2
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.getLayoutId(r7)
            java.lang.String r8 = "Hint"
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r8)
            if (r7 == 0) goto L_0x00cf
            r3 = r2
        L_0x00e9:
            androidx.compose.ui.layout.IntrinsicMeasurable r3 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r3
            if (r3 == 0) goto L_0x00fc
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.Object r13 = r15.invoke(r3, r13)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            goto L_0x00fd
        L_0x00fc:
            r13 = r0
        L_0x00fd:
            if (r4 <= 0) goto L_0x0102
            r14 = 1
            r2 = r14
            goto L_0x0103
        L_0x0102:
            r2 = r0
        L_0x0103:
            long r7 = androidx.compose.material.TextFieldImplKt.getZeroConstraints()
            float r9 = r12.getDensity()
            androidx.compose.foundation.layout.PaddingValues r10 = r11.paddingValues
            r3 = r4
            r4 = r6
            r6 = r13
            int r12 = androidx.compose.material.TextFieldKt.m34196calculateHeightO3s9Psw(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return r12
        L_0x0115:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r13 = "Collection contains no element matching the predicate."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldMeasurePolicy.intrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, of.o):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int intrinsicWidth(java.util.List<? extends androidx.compose.p002ui.layout.IntrinsicMeasurable> r10, int r11, p404of.C13088o<? super androidx.compose.p002ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> r12) {
        /*
            r9 = this;
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r0 = r10.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0107
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.compose.ui.layout.IntrinsicMeasurable r2 = (androidx.compose.p002ui.layout.IntrinsicMeasurable) r2
            java.lang.Object r2 = androidx.compose.material.TextFieldImplKt.getLayoutId(r2)
            java.lang.String r3 = "TextField"
            boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r2, r3)
            if (r2 == 0) goto L_0x0006
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r12.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.util.Iterator r0 = r10.iterator()
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
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.Object r1 = r12.invoke(r1, r4)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = r1
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            java.util.Iterator r1 = r10.iterator()
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
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Object r1 = r12.invoke(r5, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r5 = r1
            goto L_0x0097
        L_0x0096:
            r5 = r0
        L_0x0097:
            java.util.Iterator r1 = r10.iterator()
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
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Object r1 = r12.invoke(r6, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x00ca
        L_0x00c9:
            r1 = r0
        L_0x00ca:
            java.util.Iterator r10 = r10.iterator()
        L_0x00ce:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r10.next()
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
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            java.lang.Object r10 = r12.invoke(r2, r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            goto L_0x00fc
        L_0x00fb:
            r10 = r0
        L_0x00fc:
            long r6 = androidx.compose.material.TextFieldImplKt.getZeroConstraints()
            r2 = r5
            r5 = r10
            int r10 = androidx.compose.material.TextFieldKt.m34197calculateWidthVsPV1Ek(r1, r2, r3, r4, r5, r6)
            return r10
        L_0x0107:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r11 = "Collection contains no element matching the predicate."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldMeasurePolicy.intrinsicWidth(java.util.List, int, of.o):int");
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, list, i, TextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicWidth(list, i, TextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m34198measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Object obj;
        Placeable placeable;
        Object obj2;
        Placeable placeable2;
        Object obj3;
        Placeable placeable3;
        int i;
        int i2;
        Object obj4;
        Placeable placeable4;
        boolean z;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        C12775o.m28639i(measureScope2, "$this$measure");
        C12775o.m28639i(list2, "measurables");
        int r2 = measureScope2.m38443roundToPx0680j_4(this.paddingValues.m33281calculateTopPaddingD9Ej5fM());
        int r1 = measureScope2.m38443roundToPx0680j_4(this.paddingValues.m33278calculateBottomPaddingD9Ej5fM());
        int r12 = measureScope2.m38443roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
        long r3 = Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 10, (Object) null);
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
            placeable = measurable.m37365measureBRTryo0(r3);
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
            placeable2 = measurable2.m37365measureBRTryo0(ConstraintsKt.m38429offsetNN6EwU$default(r3, -widthOrZero, 0, 2, (Object) null));
        } else {
            placeable2 = null;
        }
        int i3 = -r1;
        int i4 = -(widthOrZero + TextFieldImplKt.widthOrZero(placeable2));
        long r32 = ConstraintsKt.m38428offsetNN6EwU(r3, i4, i3);
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
            placeable3 = measurable3.m37365measureBRTryo0(r32);
        } else {
            placeable3 = null;
        }
        if (placeable3 != null) {
            i = placeable3.get(AlignmentLineKt.getLastBaseline());
            if (i == Integer.MIN_VALUE) {
                i = placeable3.getHeight();
            }
        } else {
            i = 0;
        }
        int max = Math.max(i, r2);
        if (placeable3 != null) {
            i2 = (i3 - r12) - max;
        } else {
            i2 = (-r2) - r1;
        }
        int i5 = r12;
        long r5 = ConstraintsKt.m38428offsetNN6EwU(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null), i4, i2);
        for (Measurable measurable4 : iterable) {
            if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                Placeable r7 = measurable4.m37365measureBRTryo0(r5);
                long r52 = Constraints.m38403copyZbe2FdA$default(r5, 0, 0, 0, 0, 14, (Object) null);
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
                    placeable4 = measurable5.m37365measureBRTryo0(r52);
                } else {
                    placeable4 = null;
                }
                int r28 = TextFieldKt.m34197calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), r7.getWidth(), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), j);
                int height = r7.getHeight();
                if (placeable3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                int r16 = TextFieldKt.m34196calculateHeightO3s9Psw(height, z, max, TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), TextFieldImplKt.heightOrZero(placeable4), j, measureScope.getDensity(), this.paddingValues);
                return MeasureScope.layout$default(measureScope, r28, r16, (Map) null, new TextFieldMeasurePolicy$measure$1(placeable3, r2, i, r28, r16, r7, placeable4, placeable, placeable2, this, max, i5, measureScope), 4, (Object) null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, list, i, TextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicWidth(list, i, TextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
