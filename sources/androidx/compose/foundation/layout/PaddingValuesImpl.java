package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n305#1:437\n307#1:438\n309#1:439\n311#1:440\n*E\n"})
/* compiled from: Padding.kt */
public final class PaddingValuesImpl implements PaddingValues {
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* renamed from: calculateBottomPadding-D9Ej5fM  reason: not valid java name */
    public float m33294calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: calculateLeftPadding-u2uoSUM  reason: not valid java name */
    public float m33295calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.start;
        }
        return this.end;
    }

    /* renamed from: calculateRightPadding-u2uoSUM  reason: not valid java name */
    public float m33296calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.end;
        }
        return this.start;
    }

    /* renamed from: calculateTopPadding-D9Ej5fM  reason: not valid java name */
    public float m33297calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        if (!C1232Dp.m38473equalsimpl0(this.start, paddingValuesImpl.start) || !C1232Dp.m38473equalsimpl0(this.top, paddingValuesImpl.top) || !C1232Dp.m38473equalsimpl0(this.end, paddingValuesImpl.end) || !C1232Dp.m38473equalsimpl0(this.bottom, paddingValuesImpl.bottom)) {
            return false;
        }
        return true;
    }

    /* renamed from: getBottom-D9Ej5fM  reason: not valid java name */
    public final float m33298getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM  reason: not valid java name */
    public final float m33299getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM  reason: not valid java name */
    public final float m33300getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM  reason: not valid java name */
    public final float m33301getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((C1232Dp.m38474hashCodeimpl(this.start) * 31) + C1232Dp.m38474hashCodeimpl(this.top)) * 31) + C1232Dp.m38474hashCodeimpl(this.end)) * 31) + C1232Dp.m38474hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + C1232Dp.m38479toStringimpl(this.start) + ", top=" + C1232Dp.m38479toStringimpl(this.top) + ", end=" + C1232Dp.m38479toStringimpl(this.end) + ", bottom=" + C1232Dp.m38479toStringimpl(this.bottom) + ')';
    }

    private PaddingValuesImpl(float f, float f2, float f3, float f4) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f, (i & 2) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f2, (i & 4) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f3, (i & 8) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f4, (DefaultConstructorMarker) null);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m33290getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getEnd-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m33291getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getStart-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m33292getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m33293getTopD9Ej5fM$annotations() {
    }
}
