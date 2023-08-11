package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Scaffold.kt */
public final class FabPosition {
    /* access modifiers changed from: private */
    public static final int Center = m34018constructorimpl(0);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int End = m34018constructorimpl(1);
    private final int value;

    /* compiled from: Scaffold.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-5ygKITE  reason: not valid java name */
        public final int m34024getCenter5ygKITE() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-5ygKITE  reason: not valid java name */
        public final int m34025getEnd5ygKITE() {
            return FabPosition.End;
        }
    }

    private /* synthetic */ FabPosition(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FabPosition m34017boximpl(int i) {
        return new FabPosition(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m34019equalsimpl(int i, Object obj) {
        if ((obj instanceof FabPosition) && i == ((FabPosition) obj).m34023unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m34020equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m34021hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m34022toStringimpl(int i) {
        if (m34020equalsimpl0(i, Center)) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m34019equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m34021hashCodeimpl(this.value);
    }

    public String toString() {
        return m34022toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m34023unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m34018constructorimpl(int i) {
        return i;
    }
}
