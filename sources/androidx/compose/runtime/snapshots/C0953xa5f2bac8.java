package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateExitObserver$1 */
/* compiled from: SnapshotStateObserver.kt */
final class C0953xa5f2bac8 extends C12777p implements Function1<State<?>, C11921v> {
    final /* synthetic */ SnapshotStateObserver.ObservedScopeMap this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0953xa5f2bac8(SnapshotStateObserver.ObservedScopeMap observedScopeMap) {
        super(1);
        this.this$0 = observedScopeMap;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((State<?>) (State) obj);
        return C11921v.f18618a;
    }

    public final void invoke(State<?> state) {
        C12775o.m28639i(state, "it");
        SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.this$0;
        observedScopeMap.deriveStateScopeCount = observedScopeMap.deriveStateScopeCount - 1;
    }
}
