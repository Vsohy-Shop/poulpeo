package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;

/* compiled from: SnapshotMutationPolicy.kt */
final /* synthetic */ class SnapshotStateKt__SnapshotMutationPolicyKt {
    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.INSTANCE;
        C12775o.m28637g(neverEqualPolicy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return neverEqualPolicy;
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        ReferentialEqualityPolicy referentialEqualityPolicy = ReferentialEqualityPolicy.INSTANCE;
        C12775o.m28637g(referentialEqualityPolicy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return referentialEqualityPolicy;
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        StructuralEqualityPolicy structuralEqualityPolicy = StructuralEqualityPolicy.INSTANCE;
        C12775o.m28637g(structuralEqualityPolicy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return structuralEqualityPolicy;
    }
}
