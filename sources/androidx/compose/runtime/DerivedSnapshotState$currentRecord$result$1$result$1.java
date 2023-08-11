package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.snapshots.StateObject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: DerivedState.kt */
final class DerivedSnapshotState$currentRecord$result$1$result$1 extends C12777p implements Function1<Object, C11921v> {
    final /* synthetic */ int $nestedCalculationLevel;
    final /* synthetic */ IdentityArrayMap<StateObject, Integer> $newDependencies;
    final /* synthetic */ DerivedSnapshotState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DerivedSnapshotState$currentRecord$result$1$result$1(DerivedSnapshotState<T> derivedSnapshotState, IdentityArrayMap<StateObject, Integer> identityArrayMap, int i) {
        super(1);
        this.this$0 = derivedSnapshotState;
        this.$newDependencies = identityArrayMap;
        this.$nestedCalculationLevel = i;
    }

    public final void invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        if (obj == this.this$0) {
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        } else if (obj instanceof StateObject) {
            Object obj2 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
            C12775o.m28636f(obj2);
            int intValue = ((Number) obj2).intValue();
            IdentityArrayMap<StateObject, Integer> identityArrayMap = this.$newDependencies;
            int i = intValue - this.$nestedCalculationLevel;
            Integer num = identityArrayMap.get(obj);
            identityArrayMap.set(obj, Integer.valueOf(Math.min(i, num != null ? num.intValue() : Integer.MAX_VALUE)));
        }
    }
}
