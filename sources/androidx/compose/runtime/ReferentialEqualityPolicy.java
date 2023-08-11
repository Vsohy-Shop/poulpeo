package androidx.compose.runtime;

/* compiled from: SnapshotMutationPolicy.kt */
final class ReferentialEqualityPolicy implements SnapshotMutationPolicy<Object> {
    public static final ReferentialEqualityPolicy INSTANCE = new ReferentialEqualityPolicy();

    private ReferentialEqualityPolicy() {
    }

    public boolean equivalent(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
