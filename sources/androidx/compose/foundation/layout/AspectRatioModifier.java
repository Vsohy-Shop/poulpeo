package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n1#2:219\n*E\n"})
/* compiled from: AspectRatio.kt */
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float aspectRatio;
    private final boolean matchHeightConstraintsFirst;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f, boolean z, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        boolean z2;
        C12775o.m28639i(function1, "inspectorInfo");
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
        if (f > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException(("aspectRatio " + f + " must be > 0").toString());
        }
    }

    /* renamed from: findSize-ToXhtMw  reason: not valid java name */
    private final long m33209findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long r2 = m33213tryMaxWidthJN0ABg$default(this, j, false, 1, (Object) null);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m38626equalsimpl0(r2, companion.m38633getZeroYbymL2g())) {
                return r2;
            }
            long r22 = m33211tryMaxHeightJN0ABg$default(this, j, false, 1, (Object) null);
            if (!IntSize.m38626equalsimpl0(r22, companion.m38633getZeroYbymL2g())) {
                return r22;
            }
            long r23 = m33217tryMinWidthJN0ABg$default(this, j, false, 1, (Object) null);
            if (!IntSize.m38626equalsimpl0(r23, companion.m38633getZeroYbymL2g())) {
                return r23;
            }
            long r24 = m33215tryMinHeightJN0ABg$default(this, j, false, 1, (Object) null);
            if (!IntSize.m38626equalsimpl0(r24, companion.m38633getZeroYbymL2g())) {
                return r24;
            }
            long r25 = m33212tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m38626equalsimpl0(r25, companion.m38633getZeroYbymL2g())) {
                return r25;
            }
            long r26 = m33210tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m38626equalsimpl0(r26, companion.m38633getZeroYbymL2g())) {
                return r26;
            }
            long r27 = m33216tryMinWidthJN0ABg(j, false);
            if (!IntSize.m38626equalsimpl0(r27, companion.m38633getZeroYbymL2g())) {
                return r27;
            }
            long r12 = m33214tryMinHeightJN0ABg(j, false);
            if (!IntSize.m38626equalsimpl0(r12, companion.m38633getZeroYbymL2g())) {
                return r12;
            }
        } else {
            long r28 = m33211tryMaxHeightJN0ABg$default(this, j, false, 1, (Object) null);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m38626equalsimpl0(r28, companion2.m38633getZeroYbymL2g())) {
                return r28;
            }
            long r29 = m33213tryMaxWidthJN0ABg$default(this, j, false, 1, (Object) null);
            if (!IntSize.m38626equalsimpl0(r29, companion2.m38633getZeroYbymL2g())) {
                return r29;
            }
            long r210 = m33215tryMinHeightJN0ABg$default(this, j, false, 1, (Object) null);
            if (!IntSize.m38626equalsimpl0(r210, companion2.m38633getZeroYbymL2g())) {
                return r210;
            }
            long r211 = m33217tryMinWidthJN0ABg$default(this, j, false, 1, (Object) null);
            if (!IntSize.m38626equalsimpl0(r211, companion2.m38633getZeroYbymL2g())) {
                return r211;
            }
            long r212 = m33210tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m38626equalsimpl0(r212, companion2.m38633getZeroYbymL2g())) {
                return r212;
            }
            long r213 = m33212tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m38626equalsimpl0(r213, companion2.m38633getZeroYbymL2g())) {
                return r213;
            }
            long r214 = m33214tryMinHeightJN0ABg(j, false);
            if (!IntSize.m38626equalsimpl0(r214, companion2.m38633getZeroYbymL2g())) {
                return r214;
            }
            long r122 = m33216tryMinWidthJN0ABg(j, false);
            if (!IntSize.m38626equalsimpl0(r122, companion2.m38633getZeroYbymL2g())) {
                return r122;
            }
        }
        return IntSize.Companion.m38633getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg  reason: not valid java name */
    private final long m33210tryMaxHeightJN0ABg(long j, boolean z) {
        int c;
        int r0 = Constraints.m38411getMaxHeightimpl(j);
        if (r0 != Integer.MAX_VALUE && (c = C13265c.m30134c(((float) r0) * this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(c, r0);
            if (!z || ConstraintsKt.m38427isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m38633getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m33211tryMaxHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m33210tryMaxHeightJN0ABg(j, z);
    }

    /* renamed from: tryMaxWidth-JN-0ABg  reason: not valid java name */
    private final long m33212tryMaxWidthJN0ABg(long j, boolean z) {
        int c;
        int r0 = Constraints.m38412getMaxWidthimpl(j);
        if (r0 != Integer.MAX_VALUE && (c = C13265c.m30134c(((float) r0) / this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(r0, c);
            if (!z || ConstraintsKt.m38427isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m38633getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m33213tryMaxWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m33212tryMaxWidthJN0ABg(j, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg  reason: not valid java name */
    private final long m33214tryMinHeightJN0ABg(long j, boolean z) {
        int r0 = Constraints.m38413getMinHeightimpl(j);
        int c = C13265c.m30134c(((float) r0) * this.aspectRatio);
        if (c > 0) {
            long IntSize = IntSizeKt.IntSize(c, r0);
            if (!z || ConstraintsKt.m38427isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m38633getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m33215tryMinHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m33214tryMinHeightJN0ABg(j, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg  reason: not valid java name */
    private final long m33216tryMinWidthJN0ABg(long j, boolean z) {
        int r0 = Constraints.m38414getMinWidthimpl(j);
        int c = C13265c.m30134c(((float) r0) / this.aspectRatio);
        if (c > 0) {
            long IntSize = IntSizeKt.IntSize(r0, c);
            if (!z || ConstraintsKt.m38427isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m38633getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m33217tryMinWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m33216tryMinWidthJN0ABg(j, z);
    }

    public boolean equals(Object obj) {
        AspectRatioModifier aspectRatioModifier;
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioModifier) {
            aspectRatioModifier = (AspectRatioModifier) obj;
        } else {
            aspectRatioModifier = null;
        }
        if (aspectRatioModifier == null) {
            return false;
        }
        if (this.aspectRatio == aspectRatioModifier.aspectRatio) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.matchHeightConstraintsFirst != ((AspectRatioModifier) obj).matchHeightConstraintsFirst) {
            return false;
        }
        return true;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.hashCode(this.aspectRatio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return C13265c.m30134c(((float) i) / this.aspectRatio);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return C13265c.m30134c(((float) i) * this.aspectRatio);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33218measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        long r0 = m33209findSizeToXhtMw(j);
        if (!IntSize.m38626equalsimpl0(r0, IntSize.Companion.m38633getZeroYbymL2g())) {
            j = Constraints.Companion.m38420fixedJhjzzOo(IntSize.m38628getWidthimpl(r0), IntSize.m38627getHeightimpl(r0));
        }
        Placeable r9 = measurable.m37365measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new AspectRatioModifier$measure$1(r9), 4, (Object) null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return C13265c.m30134c(((float) i) / this.aspectRatio);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return C13265c.m30134c(((float) i) * this.aspectRatio);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.aspectRatio + ')';
    }
}
