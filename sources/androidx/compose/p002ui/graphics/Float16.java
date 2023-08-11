package androidx.compose.p002ui.graphics;

import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p454wf.C13735j;

/* renamed from: androidx.compose.ui.graphics.Float16 */
/* compiled from: Float16.kt */
public final class Float16 implements Comparable<Float16> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final short Epsilon = m35775constructorimpl(5120);
    private static final int FP16_COMBINED = 32767;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;
    /* access modifiers changed from: private */
    public static final short LowestValue = m35775constructorimpl(-1025);
    public static final int MaxExponent = 15;
    /* access modifiers changed from: private */
    public static final short MaxValue = m35775constructorimpl(31743);
    public static final int MinExponent = -14;
    /* access modifiers changed from: private */
    public static final short MinNormal = m35775constructorimpl(1024);
    /* access modifiers changed from: private */
    public static final short MinValue = m35775constructorimpl(1);
    /* access modifiers changed from: private */
    public static final short NaN = m35775constructorimpl(32256);
    /* access modifiers changed from: private */
    public static final short NegativeInfinity = m35775constructorimpl(-1024);
    private static final short NegativeOne = m35774constructorimpl(-1.0f);
    /* access modifiers changed from: private */
    public static final short NegativeZero = m35775constructorimpl(Short.MIN_VALUE);
    private static final short One = m35774constructorimpl(1.0f);
    /* access modifiers changed from: private */
    public static final short PositiveInfinity = m35775constructorimpl(31744);
    /* access modifiers changed from: private */
    public static final short PositiveZero = m35775constructorimpl(0);
    public static final int Size = 16;
    private final short halfValue;

    /* renamed from: androidx.compose.ui.graphics.Float16$Companion */
    /* compiled from: Float16.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final short floatToHalf(float f) {
            int i;
            int i2;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i3 = floatToRawIntBits >>> 31;
            int i4 = (floatToRawIntBits >>> 23) & 255;
            int i5 = floatToRawIntBits & Float16.FP32_SIGNIFICAND_MASK;
            int i6 = 31;
            int i7 = 0;
            if (i4 == 255) {
                if (i5 != 0) {
                    i2 = 512;
                }
                i = (i3 << 15) | (i6 << 10) | i7;
                return (short) i;
            }
            int i8 = (i4 - 127) + 15;
            if (i8 >= 31) {
                i6 = 49;
            } else if (i8 > 0) {
                i7 = i5 >> 13;
                if ((i5 & 4096) != 0) {
                    i = (((i8 << 10) | i7) + 1) | (i3 << 15);
                    return (short) i;
                }
                i6 = i8;
            } else if (i8 >= -10) {
                int i9 = (i5 | 8388608) >> (1 - i8);
                if ((i9 & 4096) != 0) {
                    i9 += 8192;
                }
                i2 = i9 >> 13;
                i6 = 0;
            } else {
                i6 = 0;
            }
            i = (i3 << 15) | (i6 << 10) | i7;
            return (short) i;
            i7 = i2;
            i = (i3 << 15) | (i6 << 10) | i7;
            return (short) i;
        }

        /* access modifiers changed from: private */
        public final int toCompareValue(short s) {
            if ((s & 32768) != 0) {
                return 32768 - (s & 65535);
            }
            return s & 65535;
        }

        /* renamed from: getEpsilon-slo4al4  reason: not valid java name */
        public final short m35802getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4  reason: not valid java name */
        public final short m35803getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4  reason: not valid java name */
        public final short m35804getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4  reason: not valid java name */
        public final short m35805getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4  reason: not valid java name */
        public final short m35806getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4  reason: not valid java name */
        public final short m35807getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4  reason: not valid java name */
        public final short m35808getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4  reason: not valid java name */
        public final short m35809getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4  reason: not valid java name */
        public final short m35810getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4  reason: not valid java name */
        public final short m35811getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }
    }

    static {
        C12763h hVar = C12763h.f20419a;
    }

    private /* synthetic */ Float16(short s) {
        this.halfValue = s;
    }

    /* renamed from: absoluteValue-slo4al4  reason: not valid java name */
    public static final short m35769absoluteValueslo4al4(short s) {
        return m35775constructorimpl((short) (s & Short.MAX_VALUE));
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Float16 m35770boximpl(short s) {
        return new Float16(s);
    }

    /* renamed from: ceil-slo4al4  reason: not valid java name */
    public static final short m35771ceilslo4al4(short s) {
        short s2 = s & 65535;
        short s3 = s2 & Short.MAX_VALUE;
        int i = 1;
        if (s3 < 15360) {
            short s4 = 32768 & s2;
            int i2 = ~(s2 >> 15);
            if (s3 == 0) {
                i = 0;
            }
            s2 = ((-(i2 & i)) & 15360) | s4;
        } else if (s3 < 25600) {
            int i3 = (1 << (25 - (s3 >> 10))) - 1;
            s2 = (s2 + (i3 & ((s2 >> 15) - 1))) & (~i3);
        }
        return m35775constructorimpl((short) s2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m35775constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35776equalsimpl(short s, Object obj) {
        if ((obj instanceof Float16) && s == ((Float16) obj).m35801unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35777equalsimpl0(short s, short s2) {
        if (s == s2) {
            return true;
        }
        return false;
    }

    /* renamed from: floor-slo4al4  reason: not valid java name */
    public static final short m35778floorslo4al4(short s) {
        short s2 = 65535;
        short s3 = s & 65535;
        short s4 = s3 & Short.MAX_VALUE;
        if (s4 < 15360) {
            short s5 = s3 & 32768;
            if (s3 <= 32768) {
                s2 = 0;
            }
            s3 = (s2 & 15360) | s5;
        } else if (s4 < 25600) {
            int i = (1 << (25 - (s4 >> 10))) - 1;
            s3 = (s3 + ((-(s3 >> 15)) & i)) & (~i);
        }
        return m35775constructorimpl((short) s3);
    }

    /* renamed from: getExponent-impl  reason: not valid java name */
    public static final int m35779getExponentimpl(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4  reason: not valid java name */
    public static final short m35780getSignslo4al4(short s) {
        if (m35785isNaNimpl(s)) {
            return NaN;
        }
        if (m35772compareTo41bOqos(s, NegativeZero) < 0) {
            return NegativeOne;
        }
        if (m35772compareTo41bOqos(s, PositiveZero) > 0) {
            return One;
        }
        return s;
    }

    /* renamed from: getSignificand-impl  reason: not valid java name */
    public static final int m35781getSignificandimpl(short s) {
        return s & 1023;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35782hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m35783isFiniteimpl(short s) {
        if ((s & Short.MAX_VALUE) != FP16_EXPONENT_MAX) {
            return true;
        }
        return false;
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m35784isInfiniteimpl(short s) {
        if ((s & Short.MAX_VALUE) == FP16_EXPONENT_MAX) {
            return true;
        }
        return false;
    }

    /* renamed from: isNaN-impl  reason: not valid java name */
    public static final boolean m35785isNaNimpl(short s) {
        if ((s & Short.MAX_VALUE) > FP16_EXPONENT_MAX) {
            return true;
        }
        return false;
    }

    /* renamed from: isNormalized-impl  reason: not valid java name */
    public static final boolean m35786isNormalizedimpl(short s) {
        short s2 = s & FP16_EXPONENT_MAX;
        if (s2 == 0 || s2 == FP16_EXPONENT_MAX) {
            return false;
        }
        return true;
    }

    /* renamed from: round-slo4al4  reason: not valid java name */
    public static final short m35787roundslo4al4(short s) {
        short s2 = 65535;
        short s3 = s & 65535;
        short s4 = s3 & Short.MAX_VALUE;
        if (s4 < 15360) {
            short s5 = s3 & 32768;
            if (s4 < 14336) {
                s2 = 0;
            }
            s3 = s5 | (s2 & 15360);
        } else if (s4 < 25600) {
            int i = 25 - (s4 >> 10);
            s3 = (s3 + (1 << (i - 1))) & (~((1 << i) - 1));
        }
        return m35775constructorimpl((short) s3);
    }

    /* renamed from: toBits-impl  reason: not valid java name */
    public static final int m35788toBitsimpl(short s) {
        if (m35785isNaNimpl(s)) {
            return NaN;
        }
        return s & 65535;
    }

    /* renamed from: toByte-impl  reason: not valid java name */
    public static final byte m35789toByteimpl(short s) {
        return (byte) ((int) m35791toFloatimpl(s));
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m35790toDoubleimpl(short s) {
        return (double) m35791toFloatimpl(s);
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    public static final float m35791toFloatimpl(short s) {
        int i;
        int i2;
        int i3;
        short s2 = s & 65535;
        short s3 = 32768 & s2;
        int i4 = (s2 >>> 10) & 31;
        short s4 = s2 & 1023;
        if (i4 != 0) {
            int i5 = s4 << 13;
            if (i4 == 31) {
                i3 = 255;
                if (i5 != 0) {
                    i5 |= 4194304;
                }
            } else {
                i3 = (i4 - 15) + 127;
            }
            int i6 = i3;
            i2 = i5;
            i = i6;
        } else if (s4 != 0) {
            C12763h hVar = C12763h.f20419a;
            float intBitsToFloat = Float.intBitsToFloat(s4 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
            if (s3 == 0) {
                return intBitsToFloat;
            }
            return -intBitsToFloat;
        } else {
            i = 0;
            i2 = 0;
        }
        int i7 = i << 23;
        C12763h hVar2 = C12763h.f20419a;
        return Float.intBitsToFloat(i7 | (s3 << 16) | i2);
    }

    /* renamed from: toHexString-impl  reason: not valid java name */
    public static final String m35792toHexStringimpl(short s) {
        StringBuilder sb = new StringBuilder();
        short s2 = s & 65535;
        int i = s2 >>> 15;
        int i2 = (s2 >>> 10) & 31;
        short s3 = s2 & 1023;
        if (i2 != 31) {
            if (i == 1) {
                sb.append('-');
            }
            if (i2 != 0) {
                sb.append("0x1.");
                String num = Integer.toString(s3, C13724b.m31415a(16));
                C12775o.m28638h(num, "toString(this, checkRadix(radix))");
                sb.append(new C13735j("0{2,}$").mo53414g(num, ""));
                sb.append('p');
                sb.append(String.valueOf(i2 - 15));
            } else if (s3 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String num2 = Integer.toString(s3, C13724b.m31415a(16));
                C12775o.m28638h(num2, "toString(this, checkRadix(radix))");
                sb.append(new C13735j("0{2,}$").mo53414g(num2, ""));
                sb.append("p-14");
            }
        } else if (s3 == 0) {
            if (i != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "o.toString()");
        return sb2;
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m35793toIntimpl(short s) {
        return (int) m35791toFloatimpl(s);
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m35794toLongimpl(short s) {
        return (long) m35791toFloatimpl(s);
    }

    /* renamed from: toRawBits-impl  reason: not valid java name */
    public static final int m35795toRawBitsimpl(short s) {
        return s & 65535;
    }

    /* renamed from: toShort-impl  reason: not valid java name */
    public static final short m35796toShortimpl(short s) {
        return (short) ((int) m35791toFloatimpl(s));
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35797toStringimpl(short s) {
        return String.valueOf(m35791toFloatimpl(s));
    }

    /* renamed from: trunc-slo4al4  reason: not valid java name */
    public static final short m35798truncslo4al4(short s) {
        int i;
        short s2 = s & 65535;
        short s3 = s2 & Short.MAX_VALUE;
        if (s3 < 15360) {
            i = 32768;
        } else {
            if (s3 < 25600) {
                i = ~((1 << (25 - (s3 >> 10))) - 1);
            }
            return m35775constructorimpl((short) s2);
        }
        s2 &= i;
        return m35775constructorimpl((short) s2);
    }

    /* renamed from: withSign-qCeQghg  reason: not valid java name */
    public static final short m35799withSignqCeQghg(short s, short s2) {
        return m35775constructorimpl((short) ((s & Short.MAX_VALUE) | (s2 & 32768)));
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m35800compareTo41bOqos(((Float16) obj).m35801unboximpl());
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public int m35800compareTo41bOqos(short s) {
        return m35772compareTo41bOqos(this.halfValue, s);
    }

    public boolean equals(Object obj) {
        return m35776equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m35782hashCodeimpl(this.halfValue);
    }

    public String toString() {
        return m35797toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m35801unboximpl() {
        return this.halfValue;
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public static int m35772compareTo41bOqos(short s, short s2) {
        if (m35785isNaNimpl(s)) {
            return m35785isNaNimpl(s2) ^ true ? 1 : 0;
        }
        if (m35785isNaNimpl(s2)) {
            return -1;
        }
        Companion companion = Companion;
        return C12775o.m28641k(companion.toCompareValue(s), companion.toCompareValue(s2));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m35774constructorimpl(float f) {
        return m35775constructorimpl(Companion.floatToHalf(f));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m35773constructorimpl(double d) {
        return m35774constructorimpl((float) d);
    }
}
