package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.graphics.colorspace.ColorModel;
import androidx.compose.p002ui.graphics.colorspace.ColorSpace;
import androidx.compose.p002ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p002ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p002ui.graphics.colorspace.Rgb;
import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11916s;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,659:1\n587#1:660\n587#1:661\n587#1:662\n646#1:663\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:660\n568#1:661\n569#1:662\n658#1:663\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.ColorKt */
/* compiled from: Color.kt */
public final class ColorKt {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0148  */
    @androidx.compose.runtime.Stable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long Color(float r9, float r10, float r11, float r12, androidx.compose.p002ui.graphics.colorspace.ColorSpace r13) {
        /*
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r0 = 0
            float r1 = r13.getMinValue(r0)
            float r2 = r13.getMaxValue(r0)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L_0x0019
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0019
            r1 = r3
            goto L_0x001a
        L_0x0019:
            r1 = r0
        L_0x001a:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r1 == 0) goto L_0x0059
            float r1 = r13.getMinValue(r3)
            float r5 = r13.getMaxValue(r3)
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0031
            r1 = r3
            goto L_0x0032
        L_0x0031:
            r1 = r0
        L_0x0032:
            if (r1 == 0) goto L_0x0059
            r1 = 2
            float r5 = r13.getMinValue(r1)
            float r1 = r13.getMaxValue(r1)
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            r1 = r3
            goto L_0x0048
        L_0x0047:
            r1 = r0
        L_0x0048:
            if (r1 == 0) goto L_0x0059
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            r1 = r3
            goto L_0x0055
        L_0x0054:
            r1 = r0
        L_0x0055:
            if (r1 == 0) goto L_0x0059
            r1 = r3
            goto L_0x005a
        L_0x0059:
            r1 = r0
        L_0x005a:
            if (r1 == 0) goto L_0x0148
            boolean r1 = r13.isSrgb()
            r5 = 32
            r6 = 16
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x0097
            r13 = 1132396544(0x437f0000, float:255.0)
            float r12 = r12 * r13
            float r12 = r12 + r7
            int r12 = (int) r12
            int r12 = r12 << 24
            float r9 = r9 * r13
            float r9 = r9 + r7
            int r9 = (int) r9
            int r9 = r9 << r6
            r9 = r9 | r12
            float r10 = r10 * r13
            float r10 = r10 + r7
            int r10 = (int) r10
            int r10 = r10 << 8
            r9 = r9 | r10
            float r11 = r11 * r13
            float r11 = r11 + r7
            int r10 = (int) r11
            r9 = r9 | r10
            long r9 = (long) r9
            long r9 = p336ef.C11916s.m25709b(r9)
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r9 = p336ef.C11916s.m25709b(r9)
            long r9 = r9 << r5
            long r9 = p336ef.C11916s.m25709b(r9)
            long r9 = androidx.compose.p002ui.graphics.Color.m35667constructorimpl(r9)
            return r9
        L_0x0097:
            int r1 = r13.getComponentCount()
            r8 = 3
            if (r1 != r8) goto L_0x00a0
            r1 = r3
            goto L_0x00a1
        L_0x00a0:
            r1 = r0
        L_0x00a1:
            if (r1 == 0) goto L_0x013c
            int r13 = r13.getId$ui_graphics_release()
            r1 = -1
            if (r13 == r1) goto L_0x00ab
            r0 = r3
        L_0x00ab:
            if (r0 == 0) goto L_0x0130
            short r9 = androidx.compose.p002ui.graphics.Float16.m35774constructorimpl((float) r9)
            short r10 = androidx.compose.p002ui.graphics.Float16.m35774constructorimpl((float) r10)
            short r11 = androidx.compose.p002ui.graphics.Float16.m35774constructorimpl((float) r11)
            float r12 = java.lang.Math.min(r12, r2)
            float r12 = java.lang.Math.max(r4, r12)
            r0 = 1149222912(0x447fc000, float:1023.0)
            float r12 = r12 * r0
            float r12 = r12 + r7
            int r12 = (int) r12
            long r0 = (long) r9
            long r0 = p336ef.C11916s.m25709b(r0)
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = p336ef.C11916s.m25709b(r0)
            r9 = 48
            long r0 = r0 << r9
            long r0 = p336ef.C11916s.m25709b(r0)
            long r9 = (long) r10
            long r9 = p336ef.C11916s.m25709b(r9)
            long r9 = r9 & r2
            long r9 = p336ef.C11916s.m25709b(r9)
            long r9 = r9 << r5
            long r9 = p336ef.C11916s.m25709b(r9)
            long r9 = r9 | r0
            long r9 = p336ef.C11916s.m25709b(r9)
            long r0 = (long) r11
            long r0 = p336ef.C11916s.m25709b(r0)
            long r0 = r0 & r2
            long r0 = p336ef.C11916s.m25709b(r0)
            long r0 = r0 << r6
            long r0 = p336ef.C11916s.m25709b(r0)
            long r9 = r9 | r0
            long r9 = p336ef.C11916s.m25709b(r9)
            long r11 = (long) r12
            long r11 = p336ef.C11916s.m25709b(r11)
            r0 = 1023(0x3ff, double:5.054E-321)
            long r11 = r11 & r0
            long r11 = p336ef.C11916s.m25709b(r11)
            r0 = 6
            long r11 = r11 << r0
            long r11 = p336ef.C11916s.m25709b(r11)
            long r9 = r9 | r11
            long r9 = p336ef.C11916s.m25709b(r9)
            long r11 = (long) r13
            long r11 = p336ef.C11916s.m25709b(r11)
            r0 = 63
            long r11 = r11 & r0
            long r11 = p336ef.C11916s.m25709b(r11)
            long r9 = r9 | r11
            long r9 = p336ef.C11916s.m25709b(r9)
            long r9 = androidx.compose.p002ui.graphics.Color.m35667constructorimpl(r9)
            return r9
        L_0x0130:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unknown color space, please use a color space in ColorSpaces"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x013c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Color only works with ColorSpaces with 3 components"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0148:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "red = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = ", green = "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = ", blue = "
            r0.append(r9)
            r0.append(r11)
            java.lang.String r9 = ", alpha = "
            r0.append(r9)
            r0.append(r12)
            java.lang.String r9 = " outside the range for "
            r0.append(r9)
            r0.append(r13)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        boolean z;
        if (f5 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI  reason: not valid java name */
    public static final long m35716compositeOverOWjLjI(long j, long j2) {
        boolean z;
        float f;
        boolean z2;
        float f2;
        long r12 = Color.m35668convertvNxB06k(j, Color.m35675getColorSpaceimpl(j2));
        float r0 = Color.m35673getAlphaimpl(j2);
        float r1 = Color.m35673getAlphaimpl(r12);
        float f3 = 1.0f - r1;
        float f4 = (r0 * f3) + r1;
        float r4 = Color.m35677getRedimpl(r12);
        float r5 = Color.m35677getRedimpl(j2);
        float f5 = 0.0f;
        int i = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        boolean z3 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = ((r4 * r1) + ((r5 * r0) * f3)) / f4;
        }
        float r52 = Color.m35676getGreenimpl(r12);
        float r10 = Color.m35676getGreenimpl(j2);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = ((r52 * r1) + ((r10 * r0) * f3)) / f4;
        }
        float r122 = Color.m35674getBlueimpl(r12);
        float r13 = Color.m35674getBlueimpl(j2);
        if (i != 0) {
            z3 = false;
        }
        if (!z3) {
            f5 = ((r122 * r1) + ((r13 * r0) * f3)) / f4;
        }
        return Color(f, f2, f5, f4, Color.m35675getColorSpaceimpl(j2));
    }

    /* renamed from: getComponents-8_81llA  reason: not valid java name */
    private static final float[] m35717getComponents8_81llA(long j) {
        return new float[]{Color.m35677getRedimpl(j), Color.m35676getGreenimpl(j), Color.m35674getBlueimpl(j), Color.m35673getAlphaimpl(j)};
    }

    /* renamed from: isSpecified-8_81llA  reason: not valid java name */
    public static final boolean m35718isSpecified8_81llA(long j) {
        if (j != Color.Companion.m35707getUnspecified0d7_KjU()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-8_81llA  reason: not valid java name */
    public static final boolean m35720isUnspecified8_81llA(long j) {
        if (j == Color.Companion.m35707getUnspecified0d7_KjU()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp-jxsXWHM  reason: not valid java name */
    public static final long m35722lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long r8 = Color.m35668convertvNxB06k(j, oklab);
        long r1 = Color.m35668convertvNxB06k(j2, oklab);
        float r3 = Color.m35673getAlphaimpl(r8);
        float r4 = Color.m35677getRedimpl(r8);
        float r5 = Color.m35676getGreenimpl(r8);
        float r82 = Color.m35674getBlueimpl(r8);
        float r9 = Color.m35673getAlphaimpl(r1);
        float r6 = Color.m35677getRedimpl(r1);
        float r7 = Color.m35676getGreenimpl(r1);
        float r12 = Color.m35674getBlueimpl(r1);
        return Color.m35668convertvNxB06k(Color(MathHelpersKt.lerp(r4, r6, f), MathHelpersKt.lerp(r5, r7, f), MathHelpersKt.lerp(r82, r12, f), MathHelpersKt.lerp(r3, r9, f), oklab), Color.m35675getColorSpaceimpl(j2));
    }

    @Stable
    /* renamed from: luminance-8_81llA  reason: not valid java name */
    public static final float m35723luminance8_81llA(long j) {
        ColorSpace r0 = Color.m35675getColorSpaceimpl(j);
        if (ColorModel.m36109equalsimpl0(r0.m36118getModelxdoWZVw(), ColorModel.Companion.m36116getRgbxdoWZVw())) {
            C12775o.m28637g(r0, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) r0).getEotfFunc$ui_graphics_release();
            return saturate((float) ((eotfFunc$ui_graphics_release.invoke((double) Color.m35677getRedimpl(j)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke((double) Color.m35676getGreenimpl(j)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke((double) Color.m35674getBlueimpl(j)) * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ColorModel.m36112toStringimpl(r0.m36118getModelxdoWZVw())).toString());
    }

    private static final float saturate(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    /* renamed from: takeOrElse-DxMtmZc  reason: not valid java name */
    public static final long m35724takeOrElseDxMtmZc(long j, C13074a<Color> aVar) {
        boolean z;
        C12775o.m28639i(aVar, "block");
        if (j != Color.Companion.m35707getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return aVar.invoke().m35681unboximpl();
    }

    @Stable
    /* renamed from: toArgb-8_81llA  reason: not valid java name */
    public static final int m35725toArgb8_81llA(long j) {
        return (int) C11916s.m25709b(Color.m35668convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    @Stable
    public static final long Color(int i) {
        return Color.m35667constructorimpl(C11916s.m25709b(C11916s.m25709b((long) i) << 32));
    }

    @Stable
    public static final long Color(long j) {
        return Color.m35667constructorimpl(C11916s.m25709b(C11916s.m25709b(C11916s.m25709b(j) & 4294967295L) << 32));
    }

    @Stable
    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations  reason: not valid java name */
    public static /* synthetic */ void m35719isSpecified8_81llA$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations  reason: not valid java name */
    public static /* synthetic */ void m35721isUnspecified8_81llA$annotations(long j) {
    }
}
