package androidx.compose.p002ui.unit;

import androidx.compose.p002ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.unit.TextUnit */
/* compiled from: TextUnit.kt */
public final class TextUnit {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final TextUnitType[] TextUnitTypes;
    /* access modifiers changed from: private */
    public static final long Unspecified = TextUnitKt.pack(0, Float.NaN);
    private final long packedValue;

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m38674boximpl(companion.m38683getUnspecifiedUIouoOA()), TextUnitType.m38674boximpl(companion.m38682getSpUIouoOA()), TextUnitType.m38674boximpl(companion.m38681getEmUIouoOA())};
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextUnit m38639boximpl(long j) {
        return new TextUnit(j);
    }

    /* renamed from: compareTo--R2X_6o  reason: not valid java name */
    public static final int m38640compareToR2X_6o(long j, long j2) {
        TextUnitKt.m38663checkArithmeticNB67dxo(j, j2);
        return Float.compare(m38649getValueimpl(j), m38649getValueimpl(j2));
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m38643divkPz2Gy4(long j, float f) {
        TextUnitKt.m38662checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m38647getRawTypeimpl(j), m38649getValueimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38645equalsimpl(long j, Object obj) {
        if ((obj instanceof TextUnit) && j == ((TextUnit) obj).m38658unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38646equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getRawType-impl  reason: not valid java name */
    public static final long m38647getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA  reason: not valid java name */
    public static final long m38648getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m38647getRawTypeimpl(j) >>> 32)].m38680unboximpl();
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    public static final float m38649getValueimpl(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38650hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isEm-impl  reason: not valid java name */
    public static final boolean m38651isEmimpl(long j) {
        if (m38647getRawTypeimpl(j) == 8589934592L) {
            return true;
        }
        return false;
    }

    /* renamed from: isSp-impl  reason: not valid java name */
    public static final boolean m38652isSpimpl(long j) {
        if (m38647getRawTypeimpl(j) == 4294967296L) {
            return true;
        }
        return false;
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m38654timeskPz2Gy4(long j, float f) {
        TextUnitKt.m38662checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m38647getRawTypeimpl(j), m38649getValueimpl(j) * f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38656toStringimpl(long j) {
        long r0 = m38648getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m38677equalsimpl0(r0, companion.m38683getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m38677equalsimpl0(r0, companion.m38682getSpUIouoOA())) {
            return m38649getValueimpl(j) + ".sp";
        } else if (!TextUnitType.m38677equalsimpl0(r0, companion.m38681getEmUIouoOA())) {
            return "Invalid";
        } else {
            return m38649getValueimpl(j) + ".em";
        }
    }

    /* renamed from: unaryMinus-XSAIIZE  reason: not valid java name */
    public static final long m38657unaryMinusXSAIIZE(long j) {
        TextUnitKt.m38662checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m38647getRawTypeimpl(j), -m38649getValueimpl(j));
    }

    public boolean equals(Object obj) {
        return m38645equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m38650hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m38656toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m38658unboximpl() {
        return this.packedValue;
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m38642divkPz2Gy4(long j, double d) {
        TextUnitKt.m38662checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m38647getRawTypeimpl(j), (float) (((double) m38649getValueimpl(j)) / d));
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m38653timeskPz2Gy4(long j, double d) {
        TextUnitKt.m38662checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m38647getRawTypeimpl(j), (float) (((double) m38649getValueimpl(j)) * d));
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m38644divkPz2Gy4(long j, int i) {
        TextUnitKt.m38662checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m38647getRawTypeimpl(j), m38649getValueimpl(j) / ((float) i));
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m38655timeskPz2Gy4(long j, int i) {
        TextUnitKt.m38662checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m38647getRawTypeimpl(j), m38649getValueimpl(j) * ((float) i));
    }

    /* renamed from: androidx.compose.ui.unit.TextUnit$Companion */
    /* compiled from: TextUnit.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE  reason: not valid java name */
        public final long m38660getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations  reason: not valid java name */
        public static /* synthetic */ void m38659getUnspecifiedXSAIIZE$annotations() {
        }
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m38641constructorimpl(long j) {
        return j;
    }
}
