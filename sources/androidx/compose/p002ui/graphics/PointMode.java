package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.PointMode */
/* compiled from: PointMode.kt */
public final class PointMode {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Lines = m35982constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Points = m35982constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Polygon = m35982constructorimpl(2);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.PointMode$Companion */
    /* compiled from: PointMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getLines-r_lszbg  reason: not valid java name */
        public final int m35988getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPoints-r_lszbg  reason: not valid java name */
        public final int m35989getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getPolygon-r_lszbg  reason: not valid java name */
        public final int m35990getPolygonr_lszbg() {
            return PointMode.Polygon;
        }
    }

    private /* synthetic */ PointMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointMode m35981boximpl(int i) {
        return new PointMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35983equalsimpl(int i, Object obj) {
        if ((obj instanceof PointMode) && i == ((PointMode) obj).m35987unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35984equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35985hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35986toStringimpl(int i) {
        if (m35984equalsimpl0(i, Points)) {
            return "Points";
        }
        if (m35984equalsimpl0(i, Lines)) {
            return "Lines";
        }
        if (m35984equalsimpl0(i, Polygon)) {
            return "Polygon";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m35983equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m35985hashCodeimpl(this.value);
    }

    public String toString() {
        return m35986toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35987unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m35982constructorimpl(int i) {
        return i;
    }
}
