package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.FilterQuality */
/* compiled from: FilterQuality.kt */
public final class FilterQuality {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int High = m35759constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Low = m35759constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Medium = m35759constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int None = m35759constructorimpl(0);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.FilterQuality$Companion */
    /* compiled from: FilterQuality.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHigh-f-v9h1I  reason: not valid java name */
        public final int m35765getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* renamed from: getLow-f-v9h1I  reason: not valid java name */
        public final int m35766getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I  reason: not valid java name */
        public final int m35767getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* renamed from: getNone-f-v9h1I  reason: not valid java name */
        public final int m35768getNonefv9h1I() {
            return FilterQuality.None;
        }
    }

    private /* synthetic */ FilterQuality(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FilterQuality m35758boximpl(int i) {
        return new FilterQuality(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35760equalsimpl(int i, Object obj) {
        if ((obj instanceof FilterQuality) && i == ((FilterQuality) obj).m35764unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35761equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35762hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35763toStringimpl(int i) {
        if (m35761equalsimpl0(i, None)) {
            return "None";
        }
        if (m35761equalsimpl0(i, Low)) {
            return "Low";
        }
        if (m35761equalsimpl0(i, Medium)) {
            return "Medium";
        }
        if (m35761equalsimpl0(i, High)) {
            return "High";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m35760equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m35762hashCodeimpl(this.value);
    }

    public String toString() {
        return m35763toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35764unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m35759constructorimpl(int i) {
        return i;
    }
}
