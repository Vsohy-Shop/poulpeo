package androidx.compose.p002ui.graphics;

import android.graphics.Shader;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.RadialGradient */
/* compiled from: Brush.kt */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, f, i);
    }

    /* renamed from: createShader-uvyYCjk  reason: not valid java name */
    public Shader m35991createShaderuvyYCjk(long j) {
        float f;
        float f2;
        float f3;
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (OffsetKt.m35443isUnspecifiedk4lQ0M(this.center)) {
            long r4 = SizeKt.m35501getCenteruvyYCjk(j);
            f2 = Offset.m35422getXimpl(r4);
            f = Offset.m35423getYimpl(r4);
        } else {
            if (Offset.m35422getXimpl(this.center) == Float.POSITIVE_INFINITY) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f2 = Size.m35491getWidthimpl(j);
            } else {
                f2 = Offset.m35422getXimpl(this.center);
            }
            if (Offset.m35423getYimpl(this.center) == Float.POSITIVE_INFINITY) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f = Size.m35488getHeightimpl(j);
            } else {
                f = Offset.m35423getYimpl(this.center);
            }
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long Offset = OffsetKt.Offset(f2, f);
        float f4 = this.radius;
        if (f4 != Float.POSITIVE_INFINITY) {
            z3 = false;
        }
        if (z3) {
            f3 = Size.m35490getMinDimensionimpl(j) / ((float) 2);
        } else {
            f3 = f4;
        }
        return ShaderKt.m36015RadialGradientShader8uybcMk(Offset, f3, list, list2, this.tileMode);
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        if (!C12775o.m28634d(this.colors, radialGradient.colors) || !C12775o.m28634d(this.stops, radialGradient.stops) || !Offset.m35419equalsimpl0(this.center, radialGradient.center)) {
            return false;
        }
        if (this.radius == radialGradient.radius) {
            z = true;
        } else {
            z = false;
        }
        if (z && TileMode.m36071equalsimpl0(this.tileMode, radialGradient.tileMode)) {
            return true;
        }
        return false;
    }

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long m35992getIntrinsicSizeNHjbRc() {
        boolean z;
        float f = this.radius;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return Size.Companion.m35499getUnspecifiedNHjbRc();
        }
        float f2 = this.radius;
        float f3 = (float) 2;
        return SizeKt.Size(f2 * f3, f2 * f3);
    }

    public int hashCode() {
        int i;
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + Offset.m35424hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m36072hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        boolean z;
        String str2 = "";
        if (OffsetKt.m35441isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + Offset.m35430toStringimpl(this.center) + ", ";
        } else {
            str = str2;
        }
        float f = this.radius;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + TileMode.m36073toStringimpl(this.tileMode) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, f, (i2 & 16) != 0 ? TileMode.Companion.m36075getClamp3opZhB0() : i, (DefaultConstructorMarker) null);
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j, float f, int i) {
        this.colors = list;
        this.stops = list2;
        this.center = j;
        this.radius = f;
        this.tileMode = i;
    }
}
