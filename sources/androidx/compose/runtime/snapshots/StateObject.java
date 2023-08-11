package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.C12775o;

/* compiled from: Snapshot.kt */
public interface StateObject {

    /* compiled from: Snapshot.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static StateRecord mergeRecords(StateObject stateObject, StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
            C12775o.m28639i(stateRecord, "previous");
            C12775o.m28639i(stateRecord2, "current");
            C12775o.m28639i(stateRecord3, "applied");
            return StateObject.super.mergeRecords(stateRecord, stateRecord2, stateRecord3);
        }
    }

    StateRecord getFirstStateRecord();

    StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        C12775o.m28639i(stateRecord, "previous");
        C12775o.m28639i(stateRecord2, "current");
        C12775o.m28639i(stateRecord3, "applied");
        return null;
    }

    void prependStateRecord(StateRecord stateRecord);
}
