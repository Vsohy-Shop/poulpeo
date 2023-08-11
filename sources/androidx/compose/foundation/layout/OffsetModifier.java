package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.C1232Dp;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: Offset.kt */
final class OffsetModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean rtlAware;

    /* renamed from: x */
    private final float f231x;

    /* renamed from: y */
    private final float f232y;

    public /* synthetic */ OffsetModifier(float f, float f2, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, z, function1);
    }

    public boolean equals(Object obj) {
        OffsetModifier offsetModifier;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetModifier) {
            offsetModifier = (OffsetModifier) obj;
        } else {
            offsetModifier = null;
        }
        if (offsetModifier == null) {
            return false;
        }
        if (!C1232Dp.m38473equalsimpl0(this.f231x, offsetModifier.f231x) || !C1232Dp.m38473equalsimpl0(this.f232y, offsetModifier.f232y) || this.rtlAware != offsetModifier.rtlAware) {
            return false;
        }
        return true;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM  reason: not valid java name */
    public final float m33256getXD9Ej5fM() {
        return this.f231x;
    }

    /* renamed from: getY-D9Ej5fM  reason: not valid java name */
    public final float m33257getYD9Ej5fM() {
        return this.f232y;
    }

    public int hashCode() {
        return (((C1232Dp.m38474hashCodeimpl(this.f231x) * 31) + C1232Dp.m38474hashCodeimpl(this.f232y)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33258measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r9 = measurable.m37365measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new OffsetModifier$measure$1(this, r9, measureScope), 4, (Object) null);
    }

    public String toString() {
        return "OffsetModifier(x=" + C1232Dp.m38479toStringimpl(this.f231x) + ", y=" + C1232Dp.m38479toStringimpl(this.f232y) + ", rtlAware=" + this.rtlAware + ')';
    }

    private OffsetModifier(float f, float f2, boolean z, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        this.f231x = f;
        this.f232y = f2;
        this.rtlAware = z;
    }
}
