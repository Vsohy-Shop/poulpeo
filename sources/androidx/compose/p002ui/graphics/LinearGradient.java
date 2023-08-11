package androidx.compose.p002ui.graphics;

import android.graphics.Shader;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.LinearGradient */
/* compiled from: Brush.kt */
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    /* renamed from: createShader-uvyYCjk  reason: not valid java name */
    public Shader m35894createShaderuvyYCjk(long j) {
        boolean z;
        float f;
        boolean z2;
        float f2;
        boolean z3;
        float f3;
        float f4;
        boolean z4 = true;
        if (Offset.m35422getXimpl(this.start) == Float.POSITIVE_INFINITY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = Size.m35491getWidthimpl(j);
        } else {
            f = Offset.m35422getXimpl(this.start);
        }
        if (Offset.m35423getYimpl(this.start) == Float.POSITIVE_INFINITY) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = Size.m35488getHeightimpl(j);
        } else {
            f2 = Offset.m35423getYimpl(this.start);
        }
        if (Offset.m35422getXimpl(this.end) == Float.POSITIVE_INFINITY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f3 = Size.m35491getWidthimpl(j);
        } else {
            f3 = Offset.m35422getXimpl(this.end);
        }
        if (Offset.m35423getYimpl(this.end) != Float.POSITIVE_INFINITY) {
            z4 = false;
        }
        if (z4) {
            f4 = Size.m35488getHeightimpl(j);
        } else {
            f4 = Offset.m35423getYimpl(this.end);
        }
        return ShaderKt.m36013LinearGradientShaderVjE6UOU(OffsetKt.Offset(f, f2), OffsetKt.Offset(f3, f4), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        if (C12775o.m28634d(this.colors, linearGradient.colors) && C12775o.m28634d(this.stops, linearGradient.stops) && Offset.m35419equalsimpl0(this.start, linearGradient.start) && Offset.m35419equalsimpl0(this.end, linearGradient.end) && TileMode.m36071equalsimpl0(this.tileMode, linearGradient.tileMode)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m35895getIntrinsicSizeNHjbRc() {
        /*
            r6 = this;
            long r0 = r6.start
            float r0 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0016
            r0 = r2
            goto L_0x0017
        L_0x0016:
            r0 = r3
        L_0x0017:
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L_0x0044
            long r4 = r6.end
            float r0 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r4)
            boolean r4 = java.lang.Float.isInfinite(r0)
            if (r4 != 0) goto L_0x002f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x002f
            r0 = r2
            goto L_0x0030
        L_0x002f:
            r0 = r3
        L_0x0030:
            if (r0 == 0) goto L_0x0044
            long r4 = r6.start
            float r0 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r4)
            long r4 = r6.end
            float r4 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r4)
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            long r4 = r6.start
            float r4 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r4)
            boolean r5 = java.lang.Float.isInfinite(r4)
            if (r5 != 0) goto L_0x0059
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0059
            r4 = r2
            goto L_0x005a
        L_0x0059:
            r4 = r3
        L_0x005a:
            if (r4 == 0) goto L_0x0083
            long r4 = r6.end
            float r4 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r4)
            boolean r5 = java.lang.Float.isInfinite(r4)
            if (r5 != 0) goto L_0x006f
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            if (r2 == 0) goto L_0x0083
            long r1 = r6.start
            float r1 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r1)
            long r2 = r6.end
            float r2 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r2)
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
        L_0x0083:
            long r0 = androidx.compose.p002ui.geometry.SizeKt.Size(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.LinearGradient.m35895getIntrinsicSizeNHjbRc():long");
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
        return ((((((hashCode + i) * 31) + Offset.m35424hashCodeimpl(this.start)) * 31) + Offset.m35424hashCodeimpl(this.end)) * 31) + TileMode.m36072hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m35439isFinitek4lQ0M(this.start)) {
            str = "start=" + Offset.m35430toStringimpl(this.start) + ", ";
        } else {
            str = str2;
        }
        if (OffsetKt.m35439isFinitek4lQ0M(this.end)) {
            str2 = "end=" + Offset.m35430toStringimpl(this.end) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + TileMode.m36073toStringimpl(this.tileMode) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? TileMode.Companion.m36075getClamp3opZhB0() : i, (DefaultConstructorMarker) null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j, long j2, int i) {
        this.colors = list;
        this.stops = list2;
        this.start = j;
        this.end = j2;
        this.tileMode = i;
    }
}
