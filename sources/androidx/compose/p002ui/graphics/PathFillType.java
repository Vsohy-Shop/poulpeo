package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.PathFillType */
/* compiled from: PathFillType.kt */
public final class PathFillType {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int EvenOdd = m35958constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int NonZero = m35958constructorimpl(0);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.PathFillType$Companion */
    /* compiled from: PathFillType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEvenOdd-Rg-k1Os  reason: not valid java name */
        public final int m35964getEvenOddRgk1Os() {
            return PathFillType.EvenOdd;
        }

        /* renamed from: getNonZero-Rg-k1Os  reason: not valid java name */
        public final int m35965getNonZeroRgk1Os() {
            return PathFillType.NonZero;
        }
    }

    private /* synthetic */ PathFillType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PathFillType m35957boximpl(int i) {
        return new PathFillType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35959equalsimpl(int i, Object obj) {
        if ((obj instanceof PathFillType) && i == ((PathFillType) obj).m35963unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35960equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35961hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35962toStringimpl(int i) {
        if (m35960equalsimpl0(i, NonZero)) {
            return "NonZero";
        }
        if (m35960equalsimpl0(i, EvenOdd)) {
            return "EvenOdd";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m35959equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m35961hashCodeimpl(this.value);
    }

    public String toString() {
        return m35962toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35963unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m35958constructorimpl(int i) {
        return i;
    }
}
