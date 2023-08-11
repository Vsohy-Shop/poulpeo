package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: RememberSaveable.kt */
final class RememberSaveableKt$mutableStateSaver$1$2 extends C12777p implements Function1<MutableState<Object>, MutableState<T>> {
    final /* synthetic */ Saver<T, Object> $this_with;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RememberSaveableKt$mutableStateSaver$1$2(Saver<T, Object> saver) {
        super(1);
        this.$this_with = saver;
    }

    public final MutableState<T> invoke(MutableState<Object> mutableState) {
        T t;
        C12775o.m28639i(mutableState, "it");
        if (mutableState instanceof SnapshotMutableState) {
            if (mutableState.getValue() != null) {
                Saver<T, Object> saver = this.$this_with;
                Object value = mutableState.getValue();
                C12775o.m28636f(value);
                t = saver.restore(value);
            } else {
                t = null;
            }
            SnapshotMutationPolicy policy = ((SnapshotMutableState) mutableState).getPolicy();
            C12775o.m28637g(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$2?>");
            MutableState<T> mutableStateOf = SnapshotStateKt.mutableStateOf(t, policy);
            C12775o.m28637g(mutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$2>");
            return mutableStateOf;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
