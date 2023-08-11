package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.PathFillType;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.StrokeJoin;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.vector.VectorPath */
/* compiled from: ImageVector.kt */
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;
    private final Brush fill;
    private final float fillAlpha;
    private final String name;
    private final List<PathNode> pathData;
    private final int pathFillType;
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    public /* synthetic */ VectorPath(String str, List list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this == obj) {
            return true;
        }
        if (obj == null || VectorPath.class != obj.getClass()) {
            return false;
        }
        VectorPath vectorPath = (VectorPath) obj;
        if (!C12775o.m28634d(this.name, vectorPath.name) || !C12775o.m28634d(this.fill, vectorPath.fill)) {
            return false;
        }
        if (this.fillAlpha == vectorPath.fillAlpha) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !C12775o.m28634d(this.stroke, vectorPath.stroke)) {
            return false;
        }
        if (this.strokeAlpha == vectorPath.strokeAlpha) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.strokeLineWidth == vectorPath.strokeLineWidth) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 || !StrokeCap.m36050equalsimpl0(this.strokeLineCap, vectorPath.strokeLineCap) || !StrokeJoin.m36060equalsimpl0(this.strokeLineJoin, vectorPath.strokeLineJoin)) {
            return false;
        }
        if (this.strokeLineMiter == vectorPath.strokeLineMiter) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.trimPathStart == vectorPath.trimPathStart) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.trimPathEnd == vectorPath.trimPathEnd) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.trimPathOffset == vectorPath.trimPathOffset) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && PathFillType.m35960equalsimpl0(this.pathFillType, vectorPath.pathFillType) && C12775o.m28634d(this.pathData, vectorPath.pathData)) {
            return true;
        }
        return false;
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os  reason: not valid java name */
    public final int m36394getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw  reason: not valid java name */
    public final int m36395getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8  reason: not valid java name */
    public final int m36396getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        Brush brush = this.fill;
        int i2 = 0;
        if (brush != null) {
            i = brush.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + Float.hashCode(this.fillAlpha)) * 31;
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            i2 = brush2.hashCode();
        }
        return ((((((((((((((((((hashCode2 + i2) * 31) + Float.hashCode(this.strokeAlpha)) * 31) + Float.hashCode(this.strokeLineWidth)) * 31) + StrokeCap.m36051hashCodeimpl(this.strokeLineCap)) * 31) + StrokeJoin.m36061hashCodeimpl(this.strokeLineJoin)) * 31) + Float.hashCode(this.strokeLineMiter)) * 31) + Float.hashCode(this.trimPathStart)) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + PathFillType.m35961hashCodeimpl(this.pathFillType);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VectorPath(java.lang.String r19, java.util.List r20, int r21, androidx.compose.p002ui.graphics.Brush r22, float r23, androidx.compose.p002ui.graphics.Brush r24, float r25, float r26, int r27, int r28, float r29, float r30, float r31, float r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = ""
            r3 = r1
            goto L_0x000c
        L_0x000a:
            r3 = r19
        L_0x000c:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r6 = r2
            goto L_0x0015
        L_0x0013:
            r6 = r22
        L_0x0015:
            r1 = r0 & 16
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x001d
            r7 = r4
            goto L_0x001f
        L_0x001d:
            r7 = r23
        L_0x001f:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0025
            r8 = r2
            goto L_0x0027
        L_0x0025:
            r8 = r24
        L_0x0027:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002d
            r9 = r4
            goto L_0x002f
        L_0x002d:
            r9 = r25
        L_0x002f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0036
            r10 = r2
            goto L_0x0038
        L_0x0036:
            r10 = r26
        L_0x0038:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0042
            int r1 = androidx.compose.p002ui.graphics.vector.VectorKt.getDefaultStrokeLineCap()
            r11 = r1
            goto L_0x0044
        L_0x0042:
            r11 = r27
        L_0x0044:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004e
            int r1 = androidx.compose.p002ui.graphics.vector.VectorKt.getDefaultStrokeLineJoin()
            r12 = r1
            goto L_0x0050
        L_0x004e:
            r12 = r28
        L_0x0050:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0058
            r1 = 1082130432(0x40800000, float:4.0)
            r13 = r1
            goto L_0x005a
        L_0x0058:
            r13 = r29
        L_0x005a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0060
            r14 = r2
            goto L_0x0062
        L_0x0060:
            r14 = r30
        L_0x0062:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0068
            r15 = r4
            goto L_0x006a
        L_0x0068:
            r15 = r31
        L_0x006a:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0071
            r16 = r2
            goto L_0x0073
        L_0x0071:
            r16 = r32
        L_0x0073:
            r17 = 0
            r2 = r18
            r4 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.vector.VectorPath.<init>(java.lang.String, java.util.List, int, androidx.compose.ui.graphics.Brush, float, androidx.compose.ui.graphics.Brush, float, float, int, int, float, float, float, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private VectorPath(String str, List<? extends PathNode> list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super((DefaultConstructorMarker) null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i;
        this.fill = brush;
        this.fillAlpha = f;
        this.stroke = brush2;
        this.strokeAlpha = f2;
        this.strokeLineWidth = f3;
        this.strokeLineCap = i2;
        this.strokeLineJoin = i3;
        this.strokeLineMiter = f4;
        this.trimPathStart = f5;
        this.trimPathEnd = f6;
        this.trimPathOffset = f7;
    }
}
