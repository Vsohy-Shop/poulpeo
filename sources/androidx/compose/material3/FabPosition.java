package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;

@ExperimentalMaterial3Api
/* compiled from: Scaffold.kt */
public final class FabPosition {
    /* access modifiers changed from: private */
    public static final int Center = m34428constructorimpl(0);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int End = m34428constructorimpl(1);
    private final int value;

    /* compiled from: Scaffold.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-ERTFSPs  reason: not valid java name */
        public final int m34434getCenterERTFSPs() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-ERTFSPs  reason: not valid java name */
        public final int m34435getEndERTFSPs() {
            return FabPosition.End;
        }
    }

    private /* synthetic */ FabPosition(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FabPosition m34427boximpl(int i) {
        return new FabPosition(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m34429equalsimpl(int i, Object obj) {
        if ((obj instanceof FabPosition) && i == ((FabPosition) obj).m34433unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m34430equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m34431hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m34432toStringimpl(int i) {
        if (m34430equalsimpl0(i, Center)) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m34429equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m34431hashCodeimpl(this.value);
    }

    public String toString() {
        return m34432toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m34433unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m34428constructorimpl(int i) {
        return i;
    }
}
