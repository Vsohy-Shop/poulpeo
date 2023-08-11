package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Offset.kt */
final class OffsetPxModifier extends InspectorValueInfo implements LayoutModifier {
    private final Function1<Density, IntOffset> offset;
    private final boolean rtlAware;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetPxModifier(Function1<? super Density, IntOffset> function1, boolean z, Function1<? super InspectorInfo, C11921v> function12) {
        super(function12);
        C12775o.m28639i(function1, "offset");
        C12775o.m28639i(function12, "inspectorInfo");
        this.offset = function1;
        this.rtlAware = z;
    }

    public boolean equals(Object obj) {
        OffsetPxModifier offsetPxModifier;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxModifier) {
            offsetPxModifier = (OffsetPxModifier) obj;
        } else {
            offsetPxModifier = null;
        }
        if (offsetPxModifier == null) {
            return false;
        }
        if (!C12775o.m28634d(this.offset, offsetPxModifier.offset) || this.rtlAware != offsetPxModifier.rtlAware) {
            return false;
        }
        return true;
    }

    public final Function1<Density, IntOffset> getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    public int hashCode() {
        return (this.offset.hashCode() * 31) + Boolean.hashCode(this.rtlAware);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33259measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r9 = measurable.m37365measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new OffsetPxModifier$measure$1(this, measureScope, r9), 4, (Object) null);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.offset + ", rtlAware=" + this.rtlAware + ')';
    }
}
