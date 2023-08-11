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
/* renamed from: androidx.compose.ui.graphics.SweepGradient */
/* compiled from: Brush.kt */
public final class SweepGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final List<Float> stops;

    public /* synthetic */ SweepGradient(long j, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, list2);
    }

    /* renamed from: createShader-uvyYCjk  reason: not valid java name */
    public Shader m36067createShaderuvyYCjk(long j) {
        long j2;
        boolean z;
        float f;
        float f2;
        if (OffsetKt.m35443isUnspecifiedk4lQ0M(this.center)) {
            j2 = SizeKt.m35501getCenteruvyYCjk(j);
        } else {
            boolean z2 = true;
            if (Offset.m35422getXimpl(this.center) == Float.POSITIVE_INFINITY) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f = Size.m35491getWidthimpl(j);
            } else {
                f = Offset.m35422getXimpl(this.center);
            }
            if (Offset.m35423getYimpl(this.center) != Float.POSITIVE_INFINITY) {
                z2 = false;
            }
            if (z2) {
                f2 = Size.m35488getHeightimpl(j);
            } else {
                f2 = Offset.m35423getYimpl(this.center);
            }
            j2 = OffsetKt.Offset(f, f2);
        }
        return ShaderKt.m36017SweepGradientShader9KIMszo(j2, this.colors, this.stops);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        if (Offset.m35419equalsimpl0(this.center, sweepGradient.center) && C12775o.m28634d(this.colors, sweepGradient.colors) && C12775o.m28634d(this.stops, sweepGradient.stops)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int r0 = ((Offset.m35424hashCodeimpl(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return r0 + i;
    }

    public String toString() {
        String str;
        if (OffsetKt.m35441isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + Offset.m35430toStringimpl(this.center) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SweepGradient(long j, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? null : list2, (DefaultConstructorMarker) null);
    }

    private SweepGradient(long j, List<Color> list, List<Float> list2) {
        this.center = j;
        this.colors = list;
        this.stops = list2;
    }
}
