package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;

/* compiled from: SnapshotMutationPolicy.kt */
final class StructuralEqualityPolicy implements SnapshotMutationPolicy<Object> {
    public static final StructuralEqualityPolicy INSTANCE = new StructuralEqualityPolicy();

    private StructuralEqualityPolicy() {
    }

    public boolean equivalent(Object obj, Object obj2) {
        return C12775o.m28634d(obj, obj2);
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
