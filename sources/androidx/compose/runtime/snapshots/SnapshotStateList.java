package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p412pf.C13215d;

@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n153#1:458\n189#1,6:460\n195#1:467\n153#1:468\n196#1,9:470\n149#1:479\n205#1,6:485\n214#1,6:494\n185#1,10:500\n195#1:511\n153#1:512\n196#1,9:514\n149#1:523\n205#1,6:529\n214#1,6:538\n186#1:544\n189#1,6:545\n195#1:552\n153#1:553\n196#1,9:555\n149#1:564\n205#1,6:570\n214#1,6:579\n149#1:585\n189#1,6:596\n195#1:603\n153#1:604\n196#1,9:606\n149#1:615\n205#1,6:621\n214#1,6:630\n189#1,6:636\n195#1:643\n153#1:644\n196#1,9:646\n149#1:655\n205#1,6:661\n214#1,6:670\n185#1,10:677\n195#1:688\n153#1:689\n196#1,9:691\n149#1:700\n205#1,6:706\n214#1,6:715\n186#1:721\n185#1,10:722\n195#1:733\n153#1:734\n196#1,9:736\n149#1:745\n205#1,6:751\n214#1,6:760\n186#1:766\n159#1,4:767\n163#1:772\n153#1:773\n164#1,7:775\n149#1:782\n171#1,6:788\n179#1,3:797\n159#1,4:800\n163#1:805\n153#1:806\n164#1,7:808\n149#1:815\n171#1,6:821\n179#1,3:830\n153#1:833\n159#1,4:845\n163#1:850\n153#1:851\n164#1,7:853\n149#1:860\n171#1,6:866\n179#1,3:875\n153#1:879\n149#1:881\n189#1,6:892\n195#1:899\n153#1:900\n196#1,9:902\n149#1:911\n205#1,6:917\n214#1,6:926\n153#1:933\n149#1:935\n2180#2:459\n2180#2:469\n2073#2,2:480\n1686#2:482\n2075#2,2:483\n2077#2,3:491\n2180#2:513\n2073#2,2:524\n1686#2:526\n2075#2,2:527\n2077#2,3:535\n2180#2:554\n2073#2,2:565\n1686#2:567\n2075#2,2:568\n2077#2,3:576\n2073#2,2:586\n1686#2:588\n2075#2,2:590\n2077#2,3:593\n2180#2:605\n2073#2,2:616\n1686#2:618\n2075#2,2:619\n2077#2,3:627\n2180#2:645\n2073#2,2:656\n1686#2:658\n2075#2,2:659\n2077#2,3:667\n2180#2:690\n2073#2,2:701\n1686#2:703\n2075#2,2:704\n2077#2,3:712\n2180#2:735\n2073#2,2:746\n1686#2:748\n2075#2,2:749\n2077#2,3:757\n2180#2:774\n2073#2,2:783\n1686#2:785\n2075#2,2:786\n2077#2,3:794\n2180#2:807\n2073#2,2:816\n1686#2:818\n2075#2,2:819\n2077#2,3:827\n2180#2:834\n2073#2,2:835\n1686#2:837\n2075#2,5:839\n2180#2:844\n2180#2:852\n2073#2,2:861\n1686#2:863\n2075#2,2:864\n2077#2,3:872\n2180#2:880\n2073#2,2:882\n1686#2:884\n2075#2,2:886\n2077#2,3:889\n2180#2:901\n2073#2,2:912\n1686#2:914\n2075#2,2:915\n2077#2,3:923\n2180#2:934\n2073#2,2:936\n1686#2:938\n2075#2,2:940\n2077#2,3:943\n70#3:466\n70#3:510\n70#3:551\n70#3:589\n70#3:592\n70#3:602\n70#3:642\n70#3:687\n70#3:732\n70#3:771\n70#3:804\n70#3:838\n70#3:849\n70#3:878\n70#3:885\n70#3:888\n70#3:898\n70#3:932\n70#3:939\n70#3:942\n1#4:676\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n62#1:458\n101#1:460,6\n101#1:467\n101#1:468\n101#1:470,9\n101#1:479\n101#1:485,6\n101#1:494,6\n102#1:500,10\n102#1:511\n102#1:512\n102#1:514,9\n102#1:523\n102#1:529,6\n102#1:538,6\n102#1:544\n107#1:545,6\n107#1:552\n107#1:553\n107#1:555,9\n107#1:564\n107#1:570,6\n107#1:579,6\n109#1:585\n116#1:596,6\n116#1:603\n116#1:604\n116#1:606,9\n116#1:615\n116#1:621,6\n116#1:630,6\n117#1:636,6\n117#1:643\n117#1:644\n117#1:646,9\n117#1:655\n117#1:661,6\n117#1:670,6\n118#1:677,10\n118#1:688\n118#1:689\n118#1:691,9\n118#1:700\n118#1:706,6\n118#1:715,6\n118#1:721\n121#1:722,10\n121#1:733\n121#1:734\n121#1:736,9\n121#1:745\n121#1:751,6\n121#1:760,6\n121#1:766\n125#1:767,4\n125#1:772\n125#1:773\n125#1:775,7\n125#1:782\n125#1:788,6\n125#1:797,3\n132#1:800,4\n132#1:805\n132#1:806\n132#1:808,7\n132#1:815\n132#1:821,6\n132#1:830,3\n145#1:833\n155#1:845,4\n155#1:850\n155#1:851\n155#1:853,7\n155#1:860\n155#1:866,6\n155#1:875,3\n163#1:879\n170#1:881\n185#1:892,6\n185#1:899\n185#1:900\n185#1:902,9\n185#1:911\n185#1:917,6\n185#1:926,6\n195#1:933\n204#1:935\n62#1:459\n101#1:469\n101#1:480,2\n101#1:482\n101#1:483,2\n101#1:491,3\n102#1:513\n102#1:524,2\n102#1:526\n102#1:527,2\n102#1:535,3\n107#1:554\n107#1:565,2\n107#1:567\n107#1:568,2\n107#1:576,3\n109#1:586,2\n109#1:588\n109#1:590,2\n109#1:593,3\n116#1:605\n116#1:616,2\n116#1:618\n116#1:619,2\n116#1:627,3\n117#1:645\n117#1:656,2\n117#1:658\n117#1:659,2\n117#1:667,3\n118#1:690\n118#1:701,2\n118#1:703\n118#1:704,2\n118#1:712,3\n121#1:735\n121#1:746,2\n121#1:748\n121#1:749,2\n121#1:757,3\n125#1:774\n125#1:783,2\n125#1:785\n125#1:786,2\n125#1:794,3\n132#1:807\n132#1:816,2\n132#1:818\n132#1:819,2\n132#1:827,3\n145#1:834\n149#1:835,2\n149#1:837\n149#1:839,5\n153#1:844\n155#1:852\n155#1:861,2\n155#1:863\n155#1:864,2\n155#1:872,3\n163#1:880\n170#1:882,2\n170#1:884\n170#1:886,2\n170#1:889,3\n185#1:901\n185#1:912,2\n185#1:914\n185#1:915,2\n185#1:923,3\n195#1:934\n204#1:936,2\n204#1:938\n204#1:940,2\n204#1:943,3\n101#1:466\n102#1:510\n107#1:551\n109#1:589\n110#1:592\n116#1:602\n117#1:642\n118#1:687\n121#1:732\n125#1:771\n132#1:804\n149#1:838\n155#1:849\n162#1:878\n170#1:885\n171#1:888\n185#1:898\n194#1:932\n204#1:939\n205#1:942\n*E\n"})
@Stable
/* compiled from: SnapshotStateList.kt */
public final class SnapshotStateList<T> implements List<T>, StateObject, C13215d {
    public static final int $stable = 0;
    private StateRecord firstStateRecord = new StateListStateRecord(ExtensionsKt.persistentListOf());

    @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,457:1\n70#2:458\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n76#1:458\n*E\n"})
    /* compiled from: SnapshotStateList.kt */
    public static final class StateListStateRecord<T> extends StateRecord {
        private PersistentList<? extends T> list;
        private int modification;

        public StateListStateRecord(PersistentList<? extends T> persistentList) {
            C12775o.m28639i(persistentList, "list");
            this.list = persistentList;
        }

        public void assign(StateRecord stateRecord) {
            C12775o.m28639i(stateRecord, "value");
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                this.list = ((StateListStateRecord) stateRecord).list;
                this.modification = ((StateListStateRecord) stateRecord).modification;
                C11921v vVar = C11921v.f18618a;
            }
        }

        public StateRecord create() {
            return new StateListStateRecord(this.list);
        }

        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setList$runtime_release(PersistentList<? extends T> persistentList) {
            C12775o.m28639i(persistentList, "<set-?>");
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }
    }

    private final boolean conditionalUpdate(Function1<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> function1) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        boolean z;
        Snapshot current;
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                try {
                    StateRecord firstStateRecord2 = getFirstStateRecord();
                    C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    C11921v vVar = C11921v.f18618a;
                    C12773m.m28629b(1);
                } finally {
                    C12773m.m28629b(1);
                    C12773m.m28628a(1);
                }
            }
            C12773m.m28628a(1);
            C12775o.m28636f(list$runtime_release);
            PersistentList persistentList = (PersistentList) function1.invoke(list$runtime_release);
            z = false;
            if (C12775o.m28634d(persistentList, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    synchronized (SnapshotStateListKt.access$getSync$p()) {
                        if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateListStateRecord3.setList$runtime_release(persistentList);
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                            z = true;
                        }
                        C12773m.m28629b(1);
                    }
                    C12773m.m28628a(1);
                    C12773m.m28629b(1);
                } catch (Throwable th) {
                    throw th;
                }
            }
            C12773m.m28628a(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    private final <R> R mutate(Function1<? super List<T>, ? extends R> function1) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        R invoke;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                try {
                    StateRecord firstStateRecord2 = getFirstStateRecord();
                    C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    C11921v vVar = C11921v.f18618a;
                    C12773m.m28629b(1);
                } finally {
                    C12773m.m28629b(1);
                    C12773m.m28628a(1);
                }
            }
            C12773m.m28628a(1);
            C12775o.m28636f(list$runtime_release);
            PersistentList.Builder builder = list$runtime_release.builder();
            invoke = function1.invoke(builder);
            PersistentList build = builder.build();
            if (C12775o.m28634d(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    synchronized (SnapshotStateListKt.access$getSync$p()) {
                        if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateListStateRecord3.setList$runtime_release(build);
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                            z = true;
                        } else {
                            z = false;
                        }
                        C12773m.m28629b(1);
                    }
                    C12773m.m28628a(1);
                    C12773m.m28629b(1);
                } catch (Throwable th) {
                    throw th;
                }
            }
            C12773m.m28628a(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return invoke;
    }

    private final boolean mutateBoolean(Function1<? super List<T>, Boolean> function1) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        Boolean invoke;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(list$runtime_release);
            PersistentList.Builder builder = list$runtime_release.builder();
            invoke = function1.invoke(builder);
            PersistentList build = builder.build();
            if (C12775o.m28634d(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.access$getSync$p()) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return invoke.booleanValue();
    }

    private final void update(Function1<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> function1) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                try {
                    StateRecord firstStateRecord2 = getFirstStateRecord();
                    C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    C11921v vVar = C11921v.f18618a;
                    C12773m.m28629b(1);
                } finally {
                    C12773m.m28629b(1);
                    C12773m.m28628a(1);
                }
            }
            C12773m.m28628a(1);
            C12775o.m28636f(list$runtime_release);
            PersistentList persistentList = (PersistentList) function1.invoke(list$runtime_release);
            if (!C12775o.m28634d(persistentList, list$runtime_release)) {
                StateRecord firstStateRecord3 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.Companion.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        synchronized (SnapshotStateListKt.access$getSync$p()) {
                            if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateListStateRecord3.setList$runtime_release(persistentList);
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            C12773m.m28629b(1);
                        }
                        C12773m.m28628a(1);
                        C12773m.m28629b(1);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C12773m.m28628a(1);
                SnapshotKt.notifyWrite(current, this);
            } else {
                return;
            }
        } while (!z);
    }

    private final <R> R withCurrent(Function1<? super StateListStateRecord<T>, ? extends R> function1) {
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return function1.invoke(SnapshotKt.current((StateListStateRecord) firstStateRecord2));
    }

    private final <R> R writable(Function1<? super StateListStateRecord<T>, ? extends R> function1) {
        Snapshot current;
        R invoke;
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord2;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = function1.invoke(SnapshotKt.writableRecord(stateListStateRecord, this, current));
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
        SnapshotKt.notifyWrite(current, this);
        return invoke;
    }

    public boolean add(T t) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        boolean z;
        Snapshot current;
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(list$runtime_release);
            PersistentList add = list$runtime_release.add(t);
            z = false;
            if (C12775o.m28634d(add, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.access$getSync$p()) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(add);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        C12775o.m28639i(collection, "elements");
        return mutateBoolean(new SnapshotStateList$addAll$1(i, collection));
    }

    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord2;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                stateListStateRecord2.setList$runtime_release(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification$runtime_release() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    public boolean contains(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().contains(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        return getReadable$runtime_release().getList$runtime_release().containsAll(collection);
    }

    public T get(int i) {
        return getReadable$runtime_release().getList$runtime_release().get(i);
    }

    public final List<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2)).getList$runtime_release();
    }

    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final int getModification$runtime_release() {
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2)).getModification$runtime_release();
    }

    public final StateListStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord2, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    public int indexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(obj);
    }

    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    public Iterator<T> iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    public void prependStateRecord(StateRecord stateRecord) {
        C12775o.m28639i(stateRecord, "value");
        stateRecord.setNext$runtime_release(getFirstStateRecord());
        this.firstStateRecord = (StateListStateRecord) stateRecord;
    }

    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        boolean z;
        Snapshot current;
        C12775o.m28639i(collection, "elements");
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(list$runtime_release);
            PersistentList<? extends Object> removeAll = list$runtime_release.removeAll(collection);
            z = false;
            if (C12775o.m28634d(removeAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.access$getSync$p()) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(removeAll);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    public T removeAt(int i) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        Snapshot current;
        boolean z;
        T t = get(i);
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(list$runtime_release);
            PersistentList removeAt = list$runtime_release.removeAt(i);
            if (C12775o.m28634d(removeAt, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.access$getSync$p()) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(removeAt);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return t;
    }

    public final void removeRange(int i, int i2) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(list$runtime_release);
            PersistentList.Builder builder = list$runtime_release.builder();
            builder.subList(i, i2).clear();
            PersistentList build = builder.build();
            if (!C12775o.m28634d(build, list$runtime_release)) {
                StateRecord firstStateRecord3 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    synchronized (SnapshotStateListKt.access$getSync$p()) {
                        if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateListStateRecord3.setList$runtime_release(build);
                            z = true;
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        } else {
                            z = false;
                        }
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            } else {
                return;
            }
        } while (!z);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        return mutateBoolean(new SnapshotStateList$retainAll$1(collection));
    }

    public final int retainAllInRange$runtime_release(Collection<? extends T> collection, int i, int i2) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        Snapshot current;
        boolean z;
        C12775o.m28639i(collection, "elements");
        int size = size();
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(list$runtime_release);
            PersistentList.Builder builder = list$runtime_release.builder();
            builder.subList(i, i2).retainAll(collection);
            PersistentList build = builder.build();
            if (C12775o.m28634d(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.access$getSync$p()) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return size - size();
    }

    public T set(int i, T t) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        Snapshot current;
        boolean z;
        T t2 = get(i);
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(list$runtime_release);
            PersistentList persistentList = list$runtime_release.set(i, t);
            if (C12775o.m28634d(persistentList, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.access$getSync$p()) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(persistentList);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return t2;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public List<T> subList(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < 0 || i > i2) {
            z = false;
        } else {
            z = true;
        }
        if (!z || i2 > size()) {
            z2 = false;
        }
        if (z2) {
            return new SubList(this, i, i2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public final List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    public boolean addAll(Collection<? extends T> collection) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        boolean z;
        Snapshot current;
        C12775o.m28639i(collection, "elements");
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(list$runtime_release);
            PersistentList<? extends T> addAll = list$runtime_release.addAll(collection);
            z = false;
            if (C12775o.m28634d(addAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.access$getSync$p()) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(addAll);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    public ListIterator<T> listIterator(int i) {
        return new StateListIterator(this, i);
    }

    public boolean remove(Object obj) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        boolean z;
        Snapshot current;
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(list$runtime_release);
            PersistentList remove = list$runtime_release.remove(obj);
            z = false;
            if (C12775o.m28634d(remove, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.access$getSync$p()) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(remove);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    public void add(int i, T t) {
        int modification$runtime_release;
        PersistentList list$runtime_release;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateListKt.access$getSync$p()) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord2);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(list$runtime_release);
            PersistentList add = list$runtime_release.add(i, t);
            if (!C12775o.m28634d(add, list$runtime_release)) {
                StateRecord firstStateRecord3 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord3;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    synchronized (SnapshotStateListKt.sync) {
                        if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateListStateRecord3.setList$runtime_release(add);
                            z = true;
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        } else {
                            z = false;
                        }
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            } else {
                return;
            }
        } while (!z);
    }
}
