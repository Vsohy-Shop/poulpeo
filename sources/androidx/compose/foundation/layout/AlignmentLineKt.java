package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.HorizontalAlignmentLine;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,325:1\n135#2:326\n135#2:327\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:326\n121#1:327\n*E\n"})
/* compiled from: AlignmentLine.kt */
public final class AlignmentLineKt {
    /* access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA  reason: not valid java name */
    public static final MeasureResult m33160alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, AlignmentLine alignmentLine, float f, float f2, Measurable measurable, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        MeasureScope measureScope2 = measureScope;
        float f3 = f;
        float f4 = f2;
        if (getHorizontal(alignmentLine)) {
            j2 = Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null);
        } else {
            j2 = Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 14, (Object) null);
        }
        Placeable r7 = measurable.m37365measureBRTryo0(j2);
        AlignmentLine alignmentLine2 = alignmentLine;
        int i7 = r7.get(alignmentLine);
        if (i7 == Integer.MIN_VALUE) {
            i7 = 0;
        }
        if (getHorizontal(alignmentLine)) {
            i = r7.getHeight();
        } else {
            i = r7.getWidth();
        }
        if (getHorizontal(alignmentLine)) {
            i2 = Constraints.m38411getMaxHeightimpl(j);
        } else {
            i2 = Constraints.m38412getMaxWidthimpl(j);
        }
        C1232Dp.Companion companion = C1232Dp.Companion;
        if (!C1232Dp.m38473equalsimpl0(f3, companion.m38488getUnspecifiedD9Ej5fM())) {
            i3 = measureScope.m38443roundToPx0680j_4(f3);
        } else {
            i3 = 0;
        }
        int i8 = i2 - i;
        int m = C13537l.m30886m(i3 - i7, 0, i8);
        if (!C1232Dp.m38473equalsimpl0(f4, companion.m38488getUnspecifiedD9Ej5fM())) {
            i4 = measureScope.m38443roundToPx0680j_4(f4);
        } else {
            i4 = 0;
        }
        int m2 = C13537l.m30886m((i4 - i) + i7, 0, i8 - m);
        if (getHorizontal(alignmentLine)) {
            i5 = r7.getWidth();
        } else {
            i5 = Math.max(r7.getWidth() + m + m2, Constraints.m38414getMinWidthimpl(j));
        }
        int i9 = i5;
        if (getHorizontal(alignmentLine)) {
            i6 = Math.max(r7.getHeight() + m + m2, Constraints.m38413getMinHeightimpl(j));
        } else {
            i6 = r7.getHeight();
        }
        int i10 = i6;
        return MeasureScope.layout$default(measureScope, i9, i10, (Map) null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, f, m, i9, m2, r7, i10), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    /* renamed from: paddingFrom-4j6BHR0  reason: not valid java name */
    public static final Modifier m33161paddingFrom4j6BHR0(Modifier modifier, AlignmentLine alignmentLine, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$paddingFrom");
        C12775o.m28639i(alignmentLine, "alignmentLine");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0450x29bde906(alignmentLine, f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AlignmentLineOffsetDp(alignmentLine, f, f2, function1, (DefaultConstructorMarker) null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33162paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f2 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        return m33161paddingFrom4j6BHR0(modifier, alignmentLine, f, f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Stable
    /* renamed from: paddingFrom-Y_r0B1c  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier m33163paddingFromY_r0B1c(androidx.compose.p002ui.Modifier r9, androidx.compose.p002ui.layout.AlignmentLine r10, long r11, long r13) {
        /*
            java.lang.String r0 = "$this$paddingFrom"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "alignmentLine"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            androidx.compose.foundation.layout.AlignmentLineOffsetTextUnit r0 = new androidx.compose.foundation.layout.AlignmentLineOffsetTextUnit
            boolean r1 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r1 == 0) goto L_0x001c
            androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r10
            r4 = r11
            r6 = r13
            r2.<init>(r3, r4, r6)
            goto L_0x0020
        L_0x001c:
            kotlin.jvm.functions.Function1 r1 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0020:
            r7 = r1
            r8 = 0
            r1 = r0
            r2 = r10
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5, r7, r8)
            androidx.compose.ui.Modifier r9 = r9.then(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AlignmentLineKt.m33163paddingFromY_r0B1c(androidx.compose.ui.Modifier, androidx.compose.ui.layout.AlignmentLine, long, long):androidx.compose.ui.Modifier");
    }

    /* renamed from: paddingFrom-Y_r0B1c$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33164paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = TextUnit.Companion.m38660getUnspecifiedXSAIIZE();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = TextUnit.Companion.m38660getUnspecifiedXSAIIZE();
        }
        return m33163paddingFromY_r0B1c(modifier, alignmentLine, j3, j2);
    }

    @Stable
    /* renamed from: paddingFromBaseline-VpY3zN4  reason: not valid java name */
    public static final Modifier m33165paddingFromBaselineVpY3zN4(Modifier modifier, float f, float f2) {
        Modifier modifier2;
        Modifier modifier3;
        C12775o.m28639i(modifier, "$this$paddingFromBaseline");
        C1232Dp.Companion companion = C1232Dp.Companion;
        if (!C1232Dp.m38473equalsimpl0(f, companion.m38488getUnspecifiedD9Ej5fM())) {
            modifier2 = m33162paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.p002ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, (Object) null);
        } else {
            modifier2 = Modifier.Companion;
        }
        Modifier then = modifier.then(modifier2);
        if (!C1232Dp.m38473equalsimpl0(f2, companion.m38488getUnspecifiedD9Ej5fM())) {
            modifier3 = m33162paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.p002ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f2, 2, (Object) null);
        } else {
            modifier3 = Modifier.Companion;
        }
        return then.then(modifier3);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33166paddingFromBaselineVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        return m33165paddingFromBaselineVpY3zN4(modifier, f, f2);
    }

    @Stable
    /* renamed from: paddingFromBaseline-wCyjxdI  reason: not valid java name */
    public static final Modifier m33167paddingFromBaselinewCyjxdI(Modifier modifier, long j, long j2) {
        Modifier modifier2;
        Modifier modifier3;
        C12775o.m28639i(modifier, "$this$paddingFromBaseline");
        if (!TextUnitKt.m38667isUnspecifiedR2X_6o(j)) {
            modifier2 = m33164paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.p002ui.layout.AlignmentLineKt.getFirstBaseline(), j, 0, 4, (Object) null);
        } else {
            modifier2 = Modifier.Companion;
        }
        Modifier then = modifier.then(modifier2);
        if (!TextUnitKt.m38667isUnspecifiedR2X_6o(j2)) {
            modifier3 = m33164paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.p002ui.layout.AlignmentLineKt.getLastBaseline(), 0, j2, 2, (Object) null);
        } else {
            modifier3 = Modifier.Companion;
        }
        return then.then(modifier3);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33168paddingFromBaselinewCyjxdI$default(Modifier modifier, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = TextUnit.Companion.m38660getUnspecifiedXSAIIZE();
        }
        if ((i & 2) != 0) {
            j2 = TextUnit.Companion.m38660getUnspecifiedXSAIIZE();
        }
        return m33167paddingFromBaselinewCyjxdI(modifier, j, j2);
    }
}
