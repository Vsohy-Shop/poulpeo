package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 7 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 8 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,346:1\n311#2:347\n312#2:349\n313#2,2:361\n316#2,2:368\n311#2:370\n312#2:372\n313#2,5:384\n1162#3:348\n1162#3:371\n460#4,11:350\n460#4,11:373\n146#5,5:363\n1686#6:389\n2180#6:391\n2180#6:392\n2180#6:393\n2180#6:395\n2180#6:396\n2180#6:397\n70#7:390\n26#8:394\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n143#1:347\n143#1:349\n143#1:361,2\n143#1:368,2\n158#1:370\n158#1:372\n158#1:384,5\n143#1:348\n158#1:371\n143#1:350,11\n158#1:373,11\n146#1:363,5\n180#1:389\n222#1:391\n229#1:392\n235#1:393\n241#1:395\n252#1:396\n260#1:397\n180#1:390\n238#1:394\n*E\n"})
/* compiled from: DerivedState.kt */
final class DerivedSnapshotState<T> implements StateObject, DerivedState<T> {
    private final C13074a<T> calculation;
    private ResultRecord<T> first = new ResultRecord<>();
    private final SnapshotMutationPolicy<T> policy;

    @StabilityInferred(parameters = 0)
    @SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,346:1\n1686#2:347\n70#3:348\n311#4:349\n312#4:351\n313#4,2:363\n316#4,2:370\n1162#5:350\n460#6,11:352\n146#7,5:365\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n95#1:347\n95#1:348\n97#1:349\n97#1:351\n97#1:363,2\n97#1:370,2\n97#1:350\n97#1:352,11\n98#1:365,5\n*E\n"})
    /* compiled from: DerivedState.kt */
    public static final class ResultRecord<T> extends StateRecord {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final Object Unset = new Object();
        private IdentityArrayMap<StateObject, Integer> dependencies;
        private Object result = Unset;
        private int resultHash;

        /* compiled from: DerivedState.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object getUnset() {
                return ResultRecord.Unset;
            }
        }

        public void assign(StateRecord stateRecord) {
            C12775o.m28639i(stateRecord, "value");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            this.dependencies = resultRecord.dependencies;
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        public StateRecord create() {
            return new ResultRecord();
        }

        public final IdentityArrayMap<StateObject, Integer> getDependencies() {
            return this.dependencies;
        }

        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final boolean isValid(DerivedState<?> derivedState, Snapshot snapshot) {
            C12775o.m28639i(derivedState, "derivedState");
            C12775o.m28639i(snapshot, "snapshot");
            if (this.result == Unset || this.resultHash != readableHash(derivedState, snapshot)) {
                return false;
            }
            return true;
        }

        public final int readableHash(DerivedState<?> derivedState, Snapshot snapshot) {
            IdentityArrayMap<StateObject, Integer> identityArrayMap;
            StateRecord stateRecord;
            C12775o.m28639i(derivedState, "derivedState");
            C12775o.m28639i(snapshot, "snapshot");
            synchronized (SnapshotKt.getLock()) {
                identityArrayMap = this.dependencies;
            }
            int i = 7;
            if (identityArrayMap != null) {
                MutableVector mutableVector = (MutableVector) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
                int i2 = 0;
                if (mutableVector == null) {
                    mutableVector = new MutableVector(new C11906l[0], 0);
                }
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i3 = 0;
                    do {
                        ((Function1) ((C11906l) content[i3]).mo49109a()).invoke(derivedState);
                        i3++;
                    } while (i3 < size);
                }
                try {
                    int size$runtime_release = identityArrayMap.getSize$runtime_release();
                    for (int i4 = 0; i4 < size$runtime_release; i4++) {
                        Object obj = identityArrayMap.getKeys$runtime_release()[i4];
                        C12775o.m28637g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        StateObject stateObject = (StateObject) obj;
                        if (((Number) identityArrayMap.getValues$runtime_release()[i4]).intValue() == 1) {
                            if (stateObject instanceof DerivedSnapshotState) {
                                stateRecord = ((DerivedSnapshotState) stateObject).current(snapshot);
                            } else {
                                stateRecord = SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                            }
                            i = (((i * 31) + ActualJvm_jvmKt.identityHashCode(stateRecord)) * 31) + stateRecord.getSnapshotId$runtime_release();
                        }
                    }
                    C11921v vVar = C11921v.f18618a;
                    int size2 = mutableVector.getSize();
                    if (size2 > 0) {
                        Object[] content2 = mutableVector.getContent();
                        do {
                            ((Function1) ((C11906l) content2[i2]).mo49110b()).invoke(derivedState);
                            i2++;
                        } while (i2 < size2);
                    }
                } catch (Throwable th) {
                    int size3 = mutableVector.getSize();
                    if (size3 > 0) {
                        Object[] content3 = mutableVector.getContent();
                        do {
                            ((Function1) ((C11906l) content3[i2]).mo49110b()).invoke(derivedState);
                            i2++;
                        } while (i2 < size3);
                    }
                    throw th;
                }
            }
            return i;
        }

        public final void setDependencies(IdentityArrayMap<StateObject, Integer> identityArrayMap) {
            this.dependencies = identityArrayMap;
        }

        public final void setResult(Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i) {
            this.resultHash = i;
        }
    }

    public DerivedSnapshotState(C13074a<? extends T> aVar, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        C12775o.m28639i(aVar, "calculation");
        this.calculation = aVar;
        this.policy = snapshotMutationPolicy;
    }

    private final ResultRecord<T> currentRecord(ResultRecord<T> resultRecord, Snapshot snapshot, boolean z, C13074a<? extends T> aVar) {
        int i;
        Snapshot.Companion companion;
        int i2;
        boolean z2 = true;
        int i3 = 0;
        if (resultRecord.isValid(this, snapshot)) {
            if (z) {
                MutableVector mutableVector = (MutableVector) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
                if (mutableVector == null) {
                    mutableVector = new MutableVector(new C11906l[0], 0);
                }
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i4 = 0;
                    do {
                        ((Function1) ((C11906l) content[i4]).mo49109a()).invoke(this);
                        i4++;
                    } while (i4 < size);
                }
                try {
                    IdentityArrayMap<StateObject, Integer> dependencies = resultRecord.getDependencies();
                    Integer num = (Integer) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    if (dependencies != null) {
                        int size$runtime_release = dependencies.getSize$runtime_release();
                        for (int i5 = 0; i5 < size$runtime_release; i5++) {
                            Object obj = dependencies.getKeys$runtime_release()[i5];
                            C12775o.m28637g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            StateObject stateObject = (StateObject) obj;
                            SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(Integer.valueOf(((Number) dependencies.getValues$runtime_release()[i5]).intValue() + i2));
                            Function1<Object, C11921v> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
                            if (readObserver$runtime_release != null) {
                                readObserver$runtime_release.invoke(stateObject);
                            }
                        }
                    }
                    SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(Integer.valueOf(i2));
                    C11921v vVar = C11921v.f18618a;
                    int size2 = mutableVector.getSize();
                    if (size2 > 0) {
                        Object[] content2 = mutableVector.getContent();
                        do {
                            ((Function1) ((C11906l) content2[i3]).mo49110b()).invoke(this);
                            i3++;
                        } while (i3 < size2);
                    }
                } catch (Throwable th) {
                    int size3 = mutableVector.getSize();
                    if (size3 > 0) {
                        Object[] content3 = mutableVector.getContent();
                        do {
                            ((Function1) ((C11906l) content3[i3]).mo49110b()).invoke(this);
                            i3++;
                        } while (i3 < size3);
                    }
                    throw th;
                }
            }
            return resultRecord;
        }
        Integer num2 = (Integer) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        IdentityArrayMap identityArrayMap = new IdentityArrayMap(0, 1, (DefaultConstructorMarker) null);
        MutableVector mutableVector2 = (MutableVector) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
        if (mutableVector2 == null) {
            mutableVector2 = new MutableVector(new C11906l[0], 0);
        }
        int size4 = mutableVector2.getSize();
        if (size4 > 0) {
            Object[] content4 = mutableVector2.getContent();
            int i6 = 0;
            do {
                ((Function1) ((C11906l) content4[i6]).mo49109a()).invoke(this);
                i6++;
            } while (i6 < size4);
        }
        try {
            SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(Integer.valueOf(i + 1));
            Object observe = Snapshot.Companion.observe(new DerivedSnapshotState$currentRecord$result$1$result$1(this, identityArrayMap, i), (Function1<Object, C11921v>) null, aVar);
            SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(Integer.valueOf(i));
            int size5 = mutableVector2.getSize();
            if (size5 > 0) {
                Object[] content5 = mutableVector2.getContent();
                int i7 = 0;
                do {
                    ((Function1) ((C11906l) content5[i7]).mo49110b()).invoke(this);
                    i7++;
                } while (i7 < size5);
            }
            synchronized (SnapshotKt.getLock()) {
                companion = Snapshot.Companion;
                Snapshot current = companion.getCurrent();
                if (resultRecord.getResult() != ResultRecord.Companion.getUnset()) {
                    SnapshotMutationPolicy policy2 = getPolicy();
                    if (policy2 == null || !policy2.equivalent(observe, resultRecord.getResult())) {
                        z2 = false;
                    }
                    if (z2) {
                        resultRecord.setDependencies(identityArrayMap);
                        resultRecord.setResultHash(resultRecord.readableHash(this, current));
                    }
                }
                resultRecord = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                resultRecord.setDependencies(identityArrayMap);
                resultRecord.setResultHash(resultRecord.readableHash(this, current));
                resultRecord.setResult(observe);
            }
            if (i == 0) {
                companion.notifyObjectsInitialized();
            }
            return resultRecord;
        } catch (Throwable th2) {
            int size6 = mutableVector2.getSize();
            if (size6 > 0) {
                Object[] content6 = mutableVector2.getContent();
                do {
                    ((Function1) ((C11906l) content6[i3]).mo49110b()).invoke(this);
                    i3++;
                } while (i3 < size6);
            }
            throw th2;
        }
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return String.valueOf(resultRecord.getResult());
        }
        return "<Not calculated>";
    }

    public final StateRecord current(Snapshot snapshot) {
        C12775o.m28639i(snapshot, "snapshot");
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    public T getCurrentValue() {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first), Snapshot.Companion.getCurrent(), false, this.calculation).getResult();
    }

    public final T getDebuggerDisplayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return resultRecord.getResult();
        }
        return null;
    }

    public Object[] getDependencies() {
        Object[] keys$runtime_release;
        IdentityArrayMap<StateObject, Integer> dependencies = currentRecord((ResultRecord) SnapshotKt.current(this.first), Snapshot.Companion.getCurrent(), false, this.calculation).getDependencies();
        if (dependencies == null || (keys$runtime_release = dependencies.getKeys$runtime_release()) == null) {
            return new Object[0];
        }
        return keys$runtime_release;
    }

    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    public T getValue() {
        Snapshot.Companion companion = Snapshot.Companion;
        Function1<Object, C11921v> readObserver$runtime_release = companion.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return currentRecord((ResultRecord) SnapshotKt.current(this.first), companion.getCurrent(), true, this.calculation).getResult();
    }

    public void prependStateRecord(StateRecord stateRecord) {
        C12775o.m28639i(stateRecord, "value");
        this.first = (ResultRecord) stateRecord;
    }

    public String toString() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }
}
