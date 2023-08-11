package androidx.compose.p002ui.text.style;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.style.Hyphens */
/* compiled from: Hyphens.kt */
public final class Hyphens {
    /* access modifiers changed from: private */
    public static final int Auto = m38257constructorimpl(2);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int None = m38257constructorimpl(1);
    private final int value;

    /* renamed from: androidx.compose.ui.text.style.Hyphens$Companion */
    /* compiled from: Hyphens.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAuto-vmbZdU8  reason: not valid java name */
        public final int m38263getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getNone-vmbZdU8  reason: not valid java name */
        public final int m38264getNonevmbZdU8() {
            return Hyphens.None;
        }
    }

    private /* synthetic */ Hyphens(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Hyphens m38256boximpl(int i) {
        return new Hyphens(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38258equalsimpl(int i, Object obj) {
        if ((obj instanceof Hyphens) && i == ((Hyphens) obj).m38262unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38259equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38260hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38261toStringimpl(int i) {
        if (m38259equalsimpl0(i, None)) {
            return "Hyphens.None";
        }
        if (m38259equalsimpl0(i, Auto)) {
            return "Hyphens.Auto";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m38258equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m38260hashCodeimpl(this.value);
    }

    public String toString() {
        return m38261toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38262unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m38257constructorimpl(int i) {
        return i;
    }
}
