package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,298:1\n2180#2:299\n2101#2,2:300\n1686#2:302\n2103#2,5:304\n2180#2:309\n2180#2:310\n70#3:303\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n131#1:299\n133#1:300,2\n133#1:302\n133#1:304,5\n174#1:309\n210#1:310\n133#1:303\n*E\n"})
/* compiled from: SnapshotState.kt */
public class SnapshotMutableStateImpl<T> implements StateObject, SnapshotMutableState<T> {
    private StateStateRecord<T> next;
    private final SnapshotMutationPolicy<T> policy;

    /* compiled from: SnapshotState.kt */
    private static final class StateStateRecord<T> extends StateRecord {
        private T value;

        public StateStateRecord(T t) {
            this.value = t;
        }

        public void assign(StateRecord stateRecord) {
            C12775o.m28639i(stateRecord, "value");
            this.value = ((StateStateRecord) stateRecord).value;
        }

        public StateRecord create() {
            return new StateStateRecord(this.value);
        }

        public final T getValue() {
            return this.value;
        }

        public final void setValue(T t) {
            this.value = t;
        }
    }

    public SnapshotMutableStateImpl(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        C12775o.m28639i(snapshotMutationPolicy, "policy");
        this.policy = snapshotMutationPolicy;
        this.next = new StateStateRecord<>(t);
    }

    public T component1() {
        return getValue();
    }

    public Function1<T, C11921v> component2() {
        return new SnapshotMutableStateImpl$component2$1(this);
    }

    public final T getDebuggerDisplayValue() {
        return ((StateStateRecord) SnapshotKt.current(this.next)).getValue();
    }

    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    public T getValue() {
        return ((StateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        C12775o.m28639i(stateRecord, "previous");
        C12775o.m28639i(stateRecord2, "current");
        C12775o.m28639i(stateRecord3, "applied");
        StateStateRecord stateStateRecord = (StateStateRecord) stateRecord;
        StateStateRecord stateStateRecord2 = (StateStateRecord) stateRecord2;
        StateStateRecord stateStateRecord3 = (StateStateRecord) stateRecord3;
        if (getPolicy().equivalent(stateStateRecord2.getValue(), stateStateRecord3.getValue())) {
            return stateRecord2;
        }
        Object merge = getPolicy().merge(stateStateRecord.getValue(), stateStateRecord2.getValue(), stateStateRecord3.getValue());
        if (merge == null) {
            return null;
        }
        StateRecord create = stateStateRecord3.create();
        C12775o.m28637g(create, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
        ((StateStateRecord) create).setValue(merge);
        return create;
    }

    public void prependStateRecord(StateRecord stateRecord) {
        C12775o.m28639i(stateRecord, "value");
        this.next = (StateStateRecord) stateRecord;
    }

    public void setValue(T t) {
        Snapshot current;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.current(this.next);
        if (!getPolicy().equivalent(stateStateRecord.getValue(), t)) {
            StateStateRecord<T> stateStateRecord2 = this.next;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((StateStateRecord) SnapshotKt.overwritableRecord(stateStateRecord2, this, current, stateStateRecord)).setValue(t);
                C11921v vVar = C11921v.f18618a;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    public String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
