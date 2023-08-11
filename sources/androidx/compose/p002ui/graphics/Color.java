package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.graphics.colorspace.ColorSpace;
import androidx.compose.p002ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.p002ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p002ui.graphics.colorspace.Rgb;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p406ws.WebSocketProtocol;
import p336ef.C11916s;
import p336ef.C11923x;

@Immutable
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n*L\n1#1,659:1\n320#2:660\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n123#1:660\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.Color */
/* compiled from: Color.kt */
public final class Color {
    /* access modifiers changed from: private */
    public static final long Black = ColorKt.Color(4278190080L);
    /* access modifiers changed from: private */
    public static final long Blue = ColorKt.Color(4278190335L);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Cyan = ColorKt.Color(4278255615L);
    /* access modifiers changed from: private */
    public static final long DarkGray = ColorKt.Color(4282664004L);
    /* access modifiers changed from: private */
    public static final long Gray = ColorKt.Color(4287137928L);
    /* access modifiers changed from: private */
    public static final long Green = ColorKt.Color(4278255360L);
    /* access modifiers changed from: private */
    public static final long LightGray = ColorKt.Color(4291611852L);
    /* access modifiers changed from: private */
    public static final long Magenta = ColorKt.Color(4294902015L);
    /* access modifiers changed from: private */
    public static final long Red = ColorKt.Color(4294901760L);
    /* access modifiers changed from: private */
    public static final long Transparent = ColorKt.Color(0);
    /* access modifiers changed from: private */
    public static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());
    /* access modifiers changed from: private */
    public static final long White = ColorKt.Color(4294967295L);
    /* access modifiers changed from: private */
    public static final long Yellow = ColorKt.Color(4294967040L);
    private final long value;

    private /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Color m35661boximpl(long j) {
        return new Color(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m35662component1impl(long j) {
        return m35677getRedimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m35663component2impl(long j) {
        return m35676getGreenimpl(j);
    }

    @Stable
    /* renamed from: component3-impl  reason: not valid java name */
    public static final float m35664component3impl(long j) {
        return m35674getBlueimpl(j);
    }

    @Stable
    /* renamed from: component4-impl  reason: not valid java name */
    public static final float m35665component4impl(long j) {
        return m35673getAlphaimpl(j);
    }

    @Stable
    /* renamed from: component5-impl  reason: not valid java name */
    public static final ColorSpace m35666component5impl(long j) {
        return m35675getColorSpaceimpl(j);
    }

    /* renamed from: convert-vNxB06k  reason: not valid java name */
    public static final long m35668convertvNxB06k(long j, ColorSpace colorSpace) {
        C12775o.m28639i(colorSpace, "colorSpace");
        ColorSpace r0 = m35675getColorSpaceimpl(j);
        if (C12775o.m28634d(colorSpace, r0)) {
            return j;
        }
        return ColorSpaceKt.m36121connectYBCOT_4$default(r0, colorSpace, 0, 2, (Object) null).m36123transformToColorwmQWz5c$ui_graphics_release(m35677getRedimpl(j), m35676getGreenimpl(j), m35674getBlueimpl(j), m35673getAlphaimpl(j));
    }

    @Stable
    /* renamed from: copy-wmQWz5c  reason: not valid java name */
    public static final long m35669copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return ColorKt.Color(f2, f3, f4, f, m35675getColorSpaceimpl(j));
    }

    /* renamed from: copy-wmQWz5c$default  reason: not valid java name */
    public static /* synthetic */ long m35670copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m35673getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m35677getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m35676getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m35674getBlueimpl(j);
        }
        return m35669copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35671equalsimpl(long j, Object obj) {
        if ((obj instanceof Color) && j == ((Color) obj).m35681unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35672equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getAlpha-impl  reason: not valid java name */
    public static final float m35673getAlphaimpl(long j) {
        float f;
        float f2;
        if (C11916s.m25709b(63 & j) == 0) {
            f2 = (float) C11923x.m25722b(C11916s.m25709b(C11916s.m25709b(j >>> 56) & 255));
            f = 255.0f;
        } else {
            f2 = (float) C11923x.m25722b(C11916s.m25709b(C11916s.m25709b(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return f2 / f;
    }

    /* renamed from: getBlue-impl  reason: not valid java name */
    public static final float m35674getBlueimpl(long j) {
        if (C11916s.m25709b(63 & j) == 0) {
            return ((float) C11923x.m25722b(C11916s.m25709b(C11916s.m25709b(j >>> 32) & 255))) / 255.0f;
        }
        return Float16.m35791toFloatimpl(Float16.m35775constructorimpl((short) ((int) C11916s.m25709b(C11916s.m25709b(j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX))));
    }

    /* renamed from: getColorSpace-impl  reason: not valid java name */
    public static final ColorSpace m35675getColorSpaceimpl(long j) {
        return ColorSpaces.INSTANCE.getColorSpacesArray$ui_graphics_release()[(int) C11916s.m25709b(j & 63)];
    }

    /* renamed from: getGreen-impl  reason: not valid java name */
    public static final float m35676getGreenimpl(long j) {
        if (C11916s.m25709b(63 & j) == 0) {
            return ((float) C11923x.m25722b(C11916s.m25709b(C11916s.m25709b(j >>> 40) & 255))) / 255.0f;
        }
        return Float16.m35791toFloatimpl(Float16.m35775constructorimpl((short) ((int) C11916s.m25709b(C11916s.m25709b(j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX))));
    }

    /* renamed from: getRed-impl  reason: not valid java name */
    public static final float m35677getRedimpl(long j) {
        if (C11916s.m25709b(63 & j) == 0) {
            return ((float) C11923x.m25722b(C11916s.m25709b(C11916s.m25709b(j >>> 48) & 255))) / 255.0f;
        }
        return Float16.m35791toFloatimpl(Float16.m35775constructorimpl((short) ((int) C11916s.m25709b(C11916s.m25709b(j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX))));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35678hashCodeimpl(long j) {
        return C11916s.m25711d(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35679toStringimpl(long j) {
        return "Color(" + m35677getRedimpl(j) + ", " + m35676getGreenimpl(j) + ", " + m35674getBlueimpl(j) + ", " + m35673getAlphaimpl(j) + ", " + m35675getColorSpaceimpl(j).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m35671equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU  reason: not valid java name */
    public final long m35680getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m35678hashCodeimpl(this.value);
    }

    public String toString() {
        return m35679toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m35681unboximpl() {
        return this.value;
    }

    /* renamed from: androidx.compose.ui.graphics.Color$Companion */
    /* compiled from: Color.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: hsl-JlNiLsg$default  reason: not valid java name */
        public static /* synthetic */ long m35695hslJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m35710hslJlNiLsg(f, f2, f3, f5, rgb);
        }

        private final float hslToRgbComponent(int i, float f, float f2, float f3) {
            float f4 = (((float) i) + (f / 30.0f)) % 12.0f;
            return f3 - ((f2 * Math.min(f3, 1.0f - f3)) * Math.max(-1.0f, Math.min(f4 - ((float) 3), Math.min(((float) 9) - f4, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default  reason: not valid java name */
        public static /* synthetic */ long m35696hsvJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m35711hsvJlNiLsg(f, f2, f3, f5, rgb);
        }

        private final float hsvToRgbComponent(int i, float f, float f2, float f3) {
            float f4 = (((float) i) + (f / 60.0f)) % 6.0f;
            return f3 - ((f2 * f3) * Math.max(0.0f, Math.min(f4, Math.min(((float) 4) - f4, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU  reason: not valid java name */
        public final long m35697getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU  reason: not valid java name */
        public final long m35698getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU  reason: not valid java name */
        public final long m35699getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU  reason: not valid java name */
        public final long m35700getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU  reason: not valid java name */
        public final long m35701getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU  reason: not valid java name */
        public final long m35702getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU  reason: not valid java name */
        public final long m35703getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU  reason: not valid java name */
        public final long m35704getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU  reason: not valid java name */
        public final long m35705getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU  reason: not valid java name */
        public final long m35706getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU  reason: not valid java name */
        public final long m35707getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU  reason: not valid java name */
        public final long m35708getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU  reason: not valid java name */
        public final long m35709getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
            if (r0 != false) goto L_0x0035;
         */
        /* renamed from: hsl-JlNiLsg  reason: not valid java name */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long m35710hslJlNiLsg(float r6, float r7, float r8, float r9, androidx.compose.p002ui.graphics.colorspace.Rgb r10) {
            /*
                r5 = this;
                java.lang.String r0 = "colorSpace"
                kotlin.jvm.internal.C12775o.m28639i(r10, r0)
                r0 = 0
                int r1 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 > 0) goto L_0x0014
                r1 = 1135869952(0x43b40000, float:360.0)
                int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x0014
                r1 = r2
                goto L_0x0015
            L_0x0014:
                r1 = r3
            L_0x0015:
                if (r1 == 0) goto L_0x0034
                int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                r4 = 1065353216(0x3f800000, float:1.0)
                if (r1 > 0) goto L_0x0023
                int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r1 > 0) goto L_0x0023
                r1 = r2
                goto L_0x0024
            L_0x0023:
                r1 = r3
            L_0x0024:
                if (r1 == 0) goto L_0x0034
                int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r0 > 0) goto L_0x0030
                int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r0 > 0) goto L_0x0030
                r0 = r2
                goto L_0x0031
            L_0x0030:
                r0 = r3
            L_0x0031:
                if (r0 == 0) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r2 = r3
            L_0x0035:
                if (r2 == 0) goto L_0x004b
                float r0 = r5.hslToRgbComponent(r3, r6, r7, r8)
                r1 = 8
                float r1 = r5.hslToRgbComponent(r1, r6, r7, r8)
                r2 = 4
                float r6 = r5.hslToRgbComponent(r2, r6, r7, r8)
                long r6 = androidx.compose.p002ui.graphics.ColorKt.Color(r0, r1, r6, r9, r10)
                return r6
            L_0x004b:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "HSL ("
                r9.append(r10)
                r9.append(r6)
                java.lang.String r6 = ", "
                r9.append(r6)
                r9.append(r7)
                r9.append(r6)
                r9.append(r8)
                java.lang.String r6 = ") must be in range (0..360, 0..1, 0..1)"
                r9.append(r6)
                java.lang.String r6 = r9.toString()
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r6 = r6.toString()
                r7.<init>(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.Color.Companion.m35710hslJlNiLsg(float, float, float, float, androidx.compose.ui.graphics.colorspace.Rgb):long");
        }

        /* renamed from: hsv-JlNiLsg  reason: not valid java name */
        public final long m35711hsvJlNiLsg(float f, float f2, float f3, float f4, Rgb rgb) {
            boolean z;
            boolean z2;
            boolean z3;
            C12775o.m28639i(rgb, "colorSpace");
            boolean z4 = false;
            if (0.0f > f || f > 360.0f) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (0.0f > f2 || f2 > 1.0f) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (0.0f > f3 || f3 > 1.0f) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        z4 = true;
                    }
                }
            }
            if (z4) {
                return ColorKt.Color(hsvToRgbComponent(5, f, f2, f3), hsvToRgbComponent(3, f, f2, f3), hsvToRgbComponent(1, f, f2, f3), f4, rgb);
            }
            throw new IllegalArgumentException(("HSV (" + f + ", " + f2 + ", " + f3 + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35682getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35683getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35684getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35685getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35686getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35687getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35688getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35689getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35690getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35691getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35692getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35693getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m35694getYellow0d7_KjU$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m35667constructorimpl(long j) {
        return j;
    }
}
