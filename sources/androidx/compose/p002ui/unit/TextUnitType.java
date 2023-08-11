package androidx.compose.p002ui.unit;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.unit.TextUnitType */
/* compiled from: TextUnit.kt */
public final class TextUnitType {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: Em */
    public static final long f386Em = m38675constructorimpl(8589934592L);
    /* access modifiers changed from: private */

    /* renamed from: Sp */
    public static final long f387Sp = m38675constructorimpl(4294967296L);
    /* access modifiers changed from: private */
    public static final long Unspecified = m38675constructorimpl(0);
    private final long type;

    /* renamed from: androidx.compose.ui.unit.TextUnitType$Companion */
    /* compiled from: TextUnit.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEm-UIouoOA  reason: not valid java name */
        public final long m38681getEmUIouoOA() {
            return TextUnitType.f386Em;
        }

        /* renamed from: getSp-UIouoOA  reason: not valid java name */
        public final long m38682getSpUIouoOA() {
            return TextUnitType.f387Sp;
        }

        /* renamed from: getUnspecified-UIouoOA  reason: not valid java name */
        public final long m38683getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }
    }

    private /* synthetic */ TextUnitType(long j) {
        this.type = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextUnitType m38674boximpl(long j) {
        return new TextUnitType(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38676equalsimpl(long j, Object obj) {
        if ((obj instanceof TextUnitType) && j == ((TextUnitType) obj).m38680unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38677equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38678hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38679toStringimpl(long j) {
        if (m38677equalsimpl0(j, Unspecified)) {
            return "Unspecified";
        }
        if (m38677equalsimpl0(j, f387Sp)) {
            return "Sp";
        }
        if (m38677equalsimpl0(j, f386Em)) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m38676equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m38678hashCodeimpl(this.type);
    }

    public String toString() {
        return m38679toStringimpl(this.type);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m38680unboximpl() {
        return this.type;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m38675constructorimpl(long j) {
        return j;
    }
}
