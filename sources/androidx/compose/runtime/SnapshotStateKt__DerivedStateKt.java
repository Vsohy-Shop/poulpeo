package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,346:1\n1162#2:347\n1182#2:370\n1161#2,2:371\n460#3,11:348\n460#3,11:359\n48#3:373\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n311#1:347\n334#1:370\n334#1:371,2\n312#1:348,11\n316#1:359,11\n343#1:373\n*E\n"})
/* compiled from: DerivedState.kt */
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    /* access modifiers changed from: private */
    public static final SnapshotThreadLocal<Integer> calculationBlockNestedLevel = new SnapshotThreadLocal<>();
    /* access modifiers changed from: private */
    public static final SnapshotThreadLocal<MutableVector<C11906l<Function1<DerivedState<?>, C11921v>, Function1<DerivedState<?>, C11921v>>>> derivedStateObservers = new SnapshotThreadLocal<>();

    public static final <T> State<T> derivedStateOf(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "calculation");
        return new DerivedSnapshotState(aVar, (SnapshotMutationPolicy) null);
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, C13074a<? extends R> aVar) {
        MutableVector mutableVector = (MutableVector) derivedStateObservers.get();
        int i = 0;
        if (mutableVector == null) {
            mutableVector = new MutableVector(new C11906l[0], 0);
        }
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                ((Function1) ((C11906l) content[i2]).mo49109a()).invoke(derivedState);
                i2++;
            } while (i2 < size);
        }
        try {
            R invoke = aVar.invoke();
            C12773m.m28629b(1);
            int size2 = mutableVector.getSize();
            if (size2 > 0) {
                Object[] content2 = mutableVector.getContent();
                do {
                    ((Function1) ((C11906l) content2[i]).mo49110b()).invoke(derivedState);
                    i++;
                } while (i < size2);
            }
            C12773m.m28628a(1);
            return invoke;
        } catch (Throwable th) {
            C12773m.m28629b(1);
            int size3 = mutableVector.getSize();
            if (size3 > 0) {
                Object[] content3 = mutableVector.getContent();
                do {
                    ((Function1) ((C11906l) content3[i]).mo49110b()).invoke(derivedState);
                    i++;
                } while (i < size3);
            }
            C12773m.m28628a(1);
            throw th;
        }
    }

    public static final <R> void observeDerivedStateRecalculations(Function1<? super State<?>, C11921v> function1, Function1<? super State<?>, C11921v> function12, C13074a<? extends R> aVar) {
        C12775o.m28639i(function1, "start");
        C12775o.m28639i(function12, "done");
        C12775o.m28639i(aVar, "block");
        SnapshotThreadLocal<MutableVector<C11906l<Function1<DerivedState<?>, C11921v>, Function1<DerivedState<?>, C11921v>>>> snapshotThreadLocal = derivedStateObservers;
        MutableVector mutableVector = snapshotThreadLocal.get();
        if (mutableVector == null) {
            mutableVector = new MutableVector(new C11906l[16], 0);
            snapshotThreadLocal.set(mutableVector);
        }
        try {
            mutableVector.add(C11915r.m25707a(function1, function12));
            aVar.invoke();
        } finally {
            mutableVector.removeAt(mutableVector.getSize() - 1);
        }
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, C13074a<? extends T> aVar) {
        C12775o.m28639i(snapshotMutationPolicy, "policy");
        C12775o.m28639i(aVar, "calculation");
        return new DerivedSnapshotState(aVar, snapshotMutationPolicy);
    }
}
