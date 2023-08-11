package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.ClipOp */
/* compiled from: ClipOp.kt */
public final class ClipOp {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Difference = m35653constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Intersect = m35653constructorimpl(1);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.ClipOp$Companion */
    /* compiled from: ClipOp.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDifference-rtfAjoo  reason: not valid java name */
        public final int m35659getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo  reason: not valid java name */
        public final int m35660getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }
    }

    private /* synthetic */ ClipOp(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ClipOp m35652boximpl(int i) {
        return new ClipOp(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35654equalsimpl(int i, Object obj) {
        if ((obj instanceof ClipOp) && i == ((ClipOp) obj).m35658unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35655equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35656hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35657toStringimpl(int i) {
        if (m35655equalsimpl0(i, Difference)) {
            return "Difference";
        }
        if (m35655equalsimpl0(i, Intersect)) {
            return "Intersect";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m35654equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m35656hashCodeimpl(this.value);
    }

    public String toString() {
        return m35657toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35658unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m35653constructorimpl(int i) {
        return i;
    }
}
