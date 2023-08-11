package androidx.compose.p002ui.node;

/* renamed from: androidx.compose.ui.node.NodeKind */
/* compiled from: NodeKind.kt */
public final class NodeKind<T> {
    private final int mask;

    private /* synthetic */ NodeKind(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ NodeKind m37624boximpl(int i) {
        return new NodeKind(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37626equalsimpl(int i, Object obj) {
        if ((obj instanceof NodeKind) && i == ((NodeKind) obj).m37632unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37627equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37628hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: or-H91voCI  reason: not valid java name */
    public static final int m37629orH91voCI(int i, int i2) {
        return i | i2;
    }

    /* renamed from: or-impl  reason: not valid java name */
    public static final int m37630orimpl(int i, int i2) {
        return i | i2;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37631toStringimpl(int i) {
        return "NodeKind(mask=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m37626equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m37628hashCodeimpl(this.mask);
    }

    public String toString() {
        return m37631toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37632unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> int m37625constructorimpl(int i) {
        return i;
    }
}
