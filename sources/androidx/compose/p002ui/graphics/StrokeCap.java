package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.StrokeCap */
/* compiled from: StrokeCap.kt */
public final class StrokeCap {
    /* access modifiers changed from: private */
    public static final int Butt = m36048constructorimpl(0);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Round = m36048constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Square = m36048constructorimpl(2);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.StrokeCap$Companion */
    /* compiled from: StrokeCap.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getButt-KaPHkGw  reason: not valid java name */
        public final int m36054getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* renamed from: getRound-KaPHkGw  reason: not valid java name */
        public final int m36055getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* renamed from: getSquare-KaPHkGw  reason: not valid java name */
        public final int m36056getSquareKaPHkGw() {
            return StrokeCap.Square;
        }
    }

    private /* synthetic */ StrokeCap(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StrokeCap m36047boximpl(int i) {
        return new StrokeCap(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36049equalsimpl(int i, Object obj) {
        if ((obj instanceof StrokeCap) && i == ((StrokeCap) obj).m36053unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36050equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36051hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36052toStringimpl(int i) {
        if (m36050equalsimpl0(i, Butt)) {
            return "Butt";
        }
        if (m36050equalsimpl0(i, Round)) {
            return "Round";
        }
        if (m36050equalsimpl0(i, Square)) {
            return "Square";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m36049equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m36051hashCodeimpl(this.value);
    }

    public String toString() {
        return m36052toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m36053unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m36048constructorimpl(int i) {
        return i;
    }
}
