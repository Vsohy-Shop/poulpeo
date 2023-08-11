package androidx.compose.p002ui.unit;

import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,388:1\n250#1:389\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n264#1:389\n*E\n"})
/* renamed from: androidx.compose.ui.unit.TextUnitKt */
/* compiled from: TextUnit.kt */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY  reason: not valid java name */
    public static final long m38661TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    /* renamed from: checkArithmetic--R2X_6o  reason: not valid java name */
    public static final void m38662checkArithmeticR2X_6o(long j) {
        if (!(!m38667isUnspecifiedR2X_6o(j))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    /* renamed from: checkArithmetic-NB67dxo  reason: not valid java name */
    public static final void m38663checkArithmeticNB67dxo(long j, long j2) {
        boolean z;
        if (m38667isUnspecifiedR2X_6o(j) || m38667isUnspecifiedR2X_6o(j2)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        } else if (!TextUnitType.m38677equalsimpl0(TextUnit.m38648getTypeUIouoOA(j), TextUnit.m38648getTypeUIouoOA(j2))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + TextUnitType.m38679toStringimpl(TextUnit.m38648getTypeUIouoOA(j)) + " and " + TextUnitType.m38679toStringimpl(TextUnit.m38648getTypeUIouoOA(j2))).toString());
        }
    }

    /* renamed from: checkArithmetic-vU-0ePk  reason: not valid java name */
    public static final void m38664checkArithmeticvU0ePk(long j, long j2, long j3) {
        boolean z;
        boolean z2 = true;
        if (m38667isUnspecifiedR2X_6o(j) || m38667isUnspecifiedR2X_6o(j2) || m38667isUnspecifiedR2X_6o(j3)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (!TextUnitType.m38677equalsimpl0(TextUnit.m38648getTypeUIouoOA(j), TextUnit.m38648getTypeUIouoOA(j2)) || !TextUnitType.m38677equalsimpl0(TextUnit.m38648getTypeUIouoOA(j2), TextUnit.m38648getTypeUIouoOA(j3))) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("Cannot perform operation for " + TextUnitType.m38679toStringimpl(TextUnit.m38648getTypeUIouoOA(j)) + " and " + TextUnitType.m38679toStringimpl(TextUnit.m38648getTypeUIouoOA(j2))).toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    public static final long getEm(float f) {
        return pack(UNIT_TYPE_EM, f);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d) {
    }

    public static final long getSp(float f) {
        return pack(UNIT_TYPE_SP, f);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d) {
    }

    /* renamed from: isSpecified--R2X_6o  reason: not valid java name */
    public static final boolean m38665isSpecifiedR2X_6o(long j) {
        return !m38667isUnspecifiedR2X_6o(j);
    }

    /* renamed from: isUnspecified--R2X_6o  reason: not valid java name */
    public static final boolean m38667isUnspecifiedR2X_6o(long j) {
        if (TextUnit.m38647getRawTypeimpl(j) == 0) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp-C3pnCVY  reason: not valid java name */
    public static final long m38669lerpC3pnCVY(long j, long j2, float f) {
        m38663checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m38647getRawTypeimpl(j), MathHelpersKt.lerp(TextUnit.m38649getValueimpl(j), TextUnit.m38649getValueimpl(j2), f));
    }

    public static final long pack(long j, float f) {
        return TextUnit.m38641constructorimpl(j | (((long) Float.floatToIntBits(f)) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ  reason: not valid java name */
    public static final long m38670takeOrElseeAf_CNQ(long j, C13074a<TextUnit> aVar) {
        C12775o.m28639i(aVar, "block");
        if (!m38667isUnspecifiedR2X_6o(j)) {
            return j;
        }
        return aVar.invoke().m38658unboximpl();
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m38672timesmpE4wyQ(float f, long j) {
        m38662checkArithmeticR2X_6o(j);
        return pack(TextUnit.m38647getRawTypeimpl(j), f * TextUnit.m38649getValueimpl(j));
    }

    public static final long getEm(double d) {
        return pack(UNIT_TYPE_EM, (float) d);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static final long getSp(double d) {
        return pack(UNIT_TYPE_SP, (float) d);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static final long getEm(int i) {
        return pack(UNIT_TYPE_EM, (float) i);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i) {
    }

    public static final long getSp(int i) {
        return pack(UNIT_TYPE_SP, (float) i);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i) {
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m38671timesmpE4wyQ(double d, long j) {
        m38662checkArithmeticR2X_6o(j);
        return pack(TextUnit.m38647getRawTypeimpl(j), ((float) d) * TextUnit.m38649getValueimpl(j));
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m38673timesmpE4wyQ(int i, long j) {
        m38662checkArithmeticR2X_6o(j);
        return pack(TextUnit.m38647getRawTypeimpl(j), ((float) i) * TextUnit.m38649getValueimpl(j));
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations  reason: not valid java name */
    public static /* synthetic */ void m38666isSpecifiedR2X_6o$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations  reason: not valid java name */
    public static /* synthetic */ void m38668isUnspecifiedR2X_6o$annotations(long j) {
    }
}
