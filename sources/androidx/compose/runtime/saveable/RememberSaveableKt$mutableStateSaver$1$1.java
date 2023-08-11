package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: RememberSaveable.kt */
final class RememberSaveableKt$mutableStateSaver$1$1 extends C12777p implements C13088o<SaverScope, MutableState<T>, MutableState<Object>> {
    final /* synthetic */ Saver<T, Object> $this_with;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RememberSaveableKt$mutableStateSaver$1$1(Saver<T, Object> saver) {
        super(2);
        this.$this_with = saver;
    }

    public final MutableState<Object> invoke(SaverScope saverScope, MutableState<T> mutableState) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(mutableState, "state");
        if (mutableState instanceof SnapshotMutableState) {
            Object save = this.$this_with.save(saverScope, mutableState.getValue());
            SnapshotMutationPolicy policy = ((SnapshotMutableState) mutableState).getPolicy();
            C12775o.m28637g(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return SnapshotStateKt.mutableStateOf(save, policy);
        }
        throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
    }
}
