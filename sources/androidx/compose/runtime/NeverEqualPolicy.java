package androidx.compose.runtime;

/* compiled from: SnapshotMutationPolicy.kt */
final class NeverEqualPolicy implements SnapshotMutationPolicy<Object> {
    public static final NeverEqualPolicy INSTANCE = new NeverEqualPolicy();

    private NeverEqualPolicy() {
    }

    public boolean equivalent(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        return "NeverEqualPolicy";
    }
}
