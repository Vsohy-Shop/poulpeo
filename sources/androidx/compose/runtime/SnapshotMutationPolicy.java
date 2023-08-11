package androidx.compose.runtime;

/* compiled from: SnapshotMutationPolicy.kt */
public interface SnapshotMutationPolicy<T> {

    /* compiled from: SnapshotMutationPolicy.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T merge(SnapshotMutationPolicy<T> snapshotMutationPolicy, T t, T t2, T t3) {
            return SnapshotMutationPolicy.super.merge(t, t2, t3);
        }
    }

    boolean equivalent(T t, T t2);

    T merge(T t, T t2, T t3) {
        return null;
    }
}
