package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10962f;
import p314bg.C10971h;
import p314bg.C10972h0;
import p314bg.C10979j0;
import p314bg.C11025u;
import p336ef.C11906l;
import p336ef.C11907m;
import p336ef.C11915r;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13934b2;
import p466yf.C13970h;
import p466yf.C13995l0;
import p466yf.C14002n;
import p466yf.C14010o;
import p466yf.C14054y1;
import p466yf.C14058z;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1408:1\n1112#1,5:1450\n1118#1:1460\n1112#1,5:1473\n1118#1:1483\n1112#1,5:1504\n1118#1:1525\n70#2:1409\n70#2:1430\n70#2:1432\n70#2:1433\n70#2:1434\n70#2:1435\n70#2:1445\n70#2:1448\n70#2:1449\n70#2:1461\n70#2:1462\n70#2:1512\n70#2:1526\n70#2:1549\n70#2:1550\n70#2:1551\n70#2:1552\n70#2:1553\n70#2:1554\n70#2:1555\n70#2:1556\n70#2:1557\n1229#3,2:1410\n33#4,6:1412\n33#4,6:1418\n33#4,6:1424\n93#4,2:1463\n33#4,4:1465\n95#4,2:1469\n38#4:1471\n97#4:1472\n120#4,3:1484\n33#4,4:1487\n123#4,2:1491\n125#4,2:1500\n38#4:1502\n127#4:1503\n82#4,3:1513\n33#4,4:1516\n85#4,2:1520\n38#4:1522\n87#4:1523\n82#4,3:1527\n33#4,4:1530\n85#4,2:1534\n38#4:1536\n87#4:1537\n33#4,6:1538\n1#5:1431\n314#6,9:1436\n323#6,2:1446\n122#7,5:1455\n122#7,5:1478\n122#7,3:1509\n126#7:1524\n122#7,5:1544\n361#8,7:1493\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n965#1:1450,5\n965#1:1460\n1039#1:1473,5\n1039#1:1483\n1059#1:1504,5\n1059#1:1525\n324#1:1409\n448#1:1430\n655#1:1432\n691#1:1433\n703#1:1434\n846#1:1435\n855#1:1445\n930#1:1448\n946#1:1449\n978#1:1461\n1009#1:1462\n1062#1:1512\n1075#1:1526\n1142#1:1549\n1186#1:1550\n1194#1:1551\n1203#1:1552\n1210#1:1553\n1217#1:1554\n1226#1:1555\n1234#1:1556\n1015#1:1557\n325#1:1410,2\n415#1:1412,6\n435#1:1418,6\n440#1:1424,6\n1010#1:1463,2\n1010#1:1465,4\n1010#1:1469,2\n1010#1:1471\n1010#1:1472\n1056#1:1484,3\n1056#1:1487,4\n1056#1:1491,2\n1056#1:1500,2\n1056#1:1502\n1056#1:1503\n1063#1:1513,3\n1063#1:1516,4\n1063#1:1520,2\n1063#1:1522\n1063#1:1523\n1079#1:1527,3\n1079#1:1530,4\n1079#1:1534,2\n1079#1:1536\n1079#1:1537\n1086#1:1538,6\n854#1:1436,9\n854#1:1446,2\n965#1:1455,5\n1039#1:1478,5\n1059#1:1509,3\n1059#1:1524\n1116#1:1544,5\n1056#1:1493,7\n*E\n"})
/* compiled from: Recomposer.kt */
public final class Recomposer extends CompositionContext {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);
    /* access modifiers changed from: private */
    public static final C11025u<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = C10979j0.m23633a(ExtensionsKt.persistentSetOf());
    /* access modifiers changed from: private */
    public final C11025u<State> _state = C10979j0.m23633a(State.Inactive);
    /* access modifiers changed from: private */
    public final BroadcastFrameClock broadcastFrameClock;
    /* access modifiers changed from: private */
    public long changeCount;
    /* access modifiers changed from: private */
    public Throwable closeCause;
    /* access modifiers changed from: private */
    public final List<ControlledComposition> compositionInvalidations = new ArrayList();
    private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final List<MovableContentStateReference> compositionValuesAwaitingInsert = new ArrayList();
    private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final List<ControlledComposition> compositionsAwaitingApply = new ArrayList();
    /* access modifiers changed from: private */
    public int concurrentCompositionsOutstanding;
    private final C12079g effectCoroutineContext;
    private final C14058z effectJob;
    /* access modifiers changed from: private */
    public RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    /* access modifiers changed from: private */
    public boolean isClosed;
    /* access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositions = new ArrayList();
    /* access modifiers changed from: private */
    public final RecomposerInfoImpl recomposerInfo;
    /* access modifiers changed from: private */
    public C14054y1 runnerJob;
    /* access modifiers changed from: private */
    public Set<Object> snapshotInvalidations = new LinkedHashSet();
    /* access modifiers changed from: private */
    public final Object stateLock = new Object();
    /* access modifiers changed from: private */
    public C14002n<? super C11921v> workContinuation;

    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n1360#2:1409\n1446#2,5:1410\n1855#2,2:1415\n1855#2,2:1429\n1855#2,2:1431\n1603#2,9:1433\n1855#2:1442\n1856#2:1444\n1612#2:1445\n1603#2,9:1446\n1855#2:1455\n1856#2:1457\n1612#2:1458\n33#3,6:1417\n33#3,6:1423\n1#4:1443\n1#4:1456\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1285#1:1409\n1285#1:1410,5\n1293#1:1415,2\n1302#1:1429,2\n1309#1:1431,2\n1323#1:1433,9\n1323#1:1442\n1323#1:1444\n1323#1:1445\n1328#1:1446,9\n1328#1:1455\n1328#1:1457\n1328#1:1458\n1299#1:1417,6\n1300#1:1423,6\n1323#1:1443\n1328#1:1456\n*E\n"})
    /* compiled from: Recomposer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final void addRunning(androidx.compose.runtime.Recomposer.RecomposerInfoImpl r4) {
            /*
                r3 = this;
            L_0x0000:
                bg.u r0 = androidx.compose.runtime.Recomposer._runningRecomposers
                java.lang.Object r0 = r0.getValue()
                androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet r0 = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet) r0
                androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet r1 = r0.add(r4)
                if (r0 == r1) goto L_0x001a
                bg.u r2 = androidx.compose.runtime.Recomposer._runningRecomposers
                boolean r0 = r2.mo46039b(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.Companion.addRunning(androidx.compose.runtime.Recomposer$RecomposerInfoImpl):void");
        }

        /* access modifiers changed from: private */
        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final void removeRunning(androidx.compose.runtime.Recomposer.RecomposerInfoImpl r4) {
            /*
                r3 = this;
            L_0x0000:
                bg.u r0 = androidx.compose.runtime.Recomposer._runningRecomposers
                java.lang.Object r0 = r0.getValue()
                androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet r0 = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet) r0
                androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet r1 = r0.remove(r4)
                if (r0 == r1) goto L_0x001a
                bg.u r2 = androidx.compose.runtime.Recomposer._runningRecomposers
                boolean r0 = r2.mo46039b(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.Companion.removeRunning(androidx.compose.runtime.Recomposer$RecomposerInfoImpl):void");
        }

        public final void clearErrors$runtime_release() {
            ArrayList arrayList = new ArrayList();
            for (RecomposerInfoImpl resetErrorState : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorState resetErrorState2 = resetErrorState.resetErrorState();
                if (resetErrorState2 != null) {
                    arrayList.add(resetErrorState2);
                }
            }
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            ArrayList arrayList = new ArrayList();
            for (RecomposerInfoImpl currentError : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError2 = currentError.getCurrentError();
                if (currentError2 != null) {
                    arrayList.add(currentError2);
                }
            }
            return arrayList;
        }

        public final C10972h0<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime_release(int i) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                boolean z = false;
                if (currentError != null && !currentError.getRecoverable()) {
                    z = true;
                }
                if (!z) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(i);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(Object obj) {
            C12775o.m28639i(obj, "token");
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl resetErrorState : (Iterable) Recomposer._runningRecomposers.getValue()) {
                resetErrorState.resetErrorState();
            }
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((HotReloadable) list.get(i)).resetContent();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((HotReloadable) list.get(i2)).recompose();
            }
            for (RecomposerInfoImpl retryFailedCompositions : (Iterable) Recomposer._runningRecomposers.getValue()) {
                retryFailedCompositions.retryFailedCompositions();
            }
        }

        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            for (RecomposerInfoImpl saveStateAndDisposeForHotReload : (Iterable) Recomposer._runningRecomposers.getValue()) {
                boolean unused = C12669b0.m28178B(arrayList, saveStateAndDisposeForHotReload.saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean z) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(z));
        }
    }

    /* compiled from: Recomposer.kt */
    private static final class HotReloadable {
        private C13088o<? super Composer, ? super Integer, C11921v> composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl compositionImpl) {
            C12775o.m28639i(compositionImpl, "composition");
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m35269getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    /* compiled from: Recomposer.kt */
    private static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final Exception cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z, Exception exc) {
            C12775o.m28639i(exc, "cause");
            this.recoverable = z;
            this.cause = exc;
        }

        public Exception getCause() {
            return this.cause;
        }

        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1410\n70#2:1429\n211#3,3:1411\n33#3,4:1414\n214#3:1418\n215#3:1420\n38#3:1421\n216#3:1422\n33#3,6:1423\n211#3,3:1430\n33#3,4:1433\n214#3:1437\n215#3:1439\n38#3:1440\n216#3:1441\n82#3,3:1442\n33#3,4:1445\n85#3:1449\n86#3:1451\n38#3:1452\n87#3:1453\n1#4:1419\n1#4:1438\n1#4:1450\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n350#1:1409\n355#1:1410\n363#1:1429\n359#1:1411,3\n359#1:1414,4\n359#1:1418\n359#1:1420\n359#1:1421\n359#1:1422\n360#1:1423,6\n367#1:1430,3\n367#1:1433,4\n367#1:1437\n367#1:1439\n367#1:1440\n367#1:1441\n368#1:1442,3\n368#1:1445,4\n368#1:1449\n368#1:1451\n368#1:1452\n368#1:1453\n359#1:1419\n367#1:1438\n*E\n"})
    /* compiled from: Recomposer.kt */
    private final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState access$getErrorState$p;
            Object access$getStateLock$p = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (access$getStateLock$p) {
                access$getErrorState$p = recomposer.errorState;
            }
            return access$getErrorState$p;
        }

        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        public C10962f<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int i) {
            List D0;
            CompositionImpl compositionImpl;
            Object access$getStateLock$p = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (access$getStateLock$p) {
                D0 = C12686e0.m28207D0(recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(D0.size());
            int size = D0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ControlledComposition controlledComposition = (ControlledComposition) D0.get(i2);
                if (controlledComposition instanceof CompositionImpl) {
                    compositionImpl = (CompositionImpl) controlledComposition;
                } else {
                    compositionImpl = null;
                }
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((CompositionImpl) arrayList.get(i3)).invalidateGroupsWithKey(i);
            }
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List D0;
            CompositionImpl compositionImpl;
            Object access$getStateLock$p = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (access$getStateLock$p) {
                D0 = C12686e0.m28207D0(recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(D0.size());
            int size = D0.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) D0.get(i);
                if (controlledComposition instanceof CompositionImpl) {
                    compositionImpl = (CompositionImpl) controlledComposition;
                } else {
                    compositionImpl = null;
                }
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i2));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    /* compiled from: Recomposer.kt */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    public Recomposer(C12079g gVar) {
        C12775o.m28639i(gVar, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock2 = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.broadcastFrameClock = broadcastFrameClock2;
        C14058z a = C13934b2.m32213a((C14054y1) gVar.get(C14054y1.f22970b0));
        a.mo53704O(new Recomposer$effectJob$1$1(this));
        this.effectJob = a;
        this.effectCoroutineContext = gVar.plus(broadcastFrameClock2).plus(a);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    /* access modifiers changed from: private */
    public final Object awaitWorkAvailable(C12074d<? super C11921v> dVar) {
        if (getHasSchedulingWork()) {
            return C11921v.f18618a;
        }
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                C11907m.C11908a aVar = C11907m.f18600b;
                oVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
            } else {
                this.workContinuation = oVar;
            }
            C11921v vVar = C11921v.f18618a;
        }
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (y == C12150d.m26492c()) {
            return y;
        }
        return C11921v.f18618a;
    }

    private final <T> T composing(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet, C13074a<? extends T> aVar) {
        Snapshot makeCurrent;
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
        try {
            makeCurrent = takeMutableSnapshot.makeCurrent();
            T invoke = aVar.invoke();
            C12773m.m28629b(1);
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            C12773m.m28628a(1);
            C12773m.m28629b(1);
            applyAndCheck(takeMutableSnapshot);
            C12773m.m28628a(1);
            return invoke;
        } catch (Throwable th) {
            C12773m.m28629b(1);
            applyAndCheck(takeMutableSnapshot);
            C12773m.m28628a(1);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public final C14002n<C11921v> deriveStateLocked() {
        State state;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            this.knownCompositions.clear();
            this.snapshotInvalidations = new LinkedHashSet();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            C14002n<? super C11921v> nVar = this.workContinuation;
            if (nVar != null) {
                C14002n.C14003a.m32463a(nVar, (Throwable) null, 1, (Object) null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new LinkedHashSet();
            this.compositionInvalidations.clear();
            if (this.broadcastFrameClock.getHasAwaiters()) {
                state = State.InactivePendingWork;
            } else {
                state = State.Inactive;
            }
        } else if ((!this.compositionInvalidations.isEmpty()) || (!this.snapshotInvalidations.isEmpty()) || (!this.compositionsAwaitingApply.isEmpty()) || (!this.compositionValuesAwaitingInsert.isEmpty()) || this.concurrentCompositionsOutstanding > 0 || this.broadcastFrameClock.getHasAwaiters()) {
            state = State.PendingWork;
        } else {
            state = State.Idle;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        C14002n<? super C11921v> nVar2 = this.workContinuation;
        this.workContinuation = null;
        return nVar2;
    }

    /* access modifiers changed from: private */
    public final void discardUnusedValues() {
        int i;
        List list;
        synchronized (this.stateLock) {
            if (!this.compositionValuesRemoved.isEmpty()) {
                List x = C12728x.m28546x(this.compositionValuesRemoved.values());
                this.compositionValuesRemoved.clear();
                list = new ArrayList(x.size());
                int size = x.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) x.get(i2);
                    list.add(C11915r.m25707a(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                }
                this.compositionValueStatesAvailable.clear();
            } else {
                list = C12726w.m28524k();
            }
        }
        int size2 = list.size();
        for (i = 0; i < size2; i++) {
            C11906l lVar = (C11906l) list.get(i);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) lVar.mo49109a();
            MovableContentState movableContentState = (MovableContentState) lVar.mo49110b();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime_release().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        if ((!this.compositionsAwaitingApply.isEmpty()) || this.broadcastFrameClock.getHasAwaiters()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean getHasFrameWorkLocked() {
        if ((!this.compositionInvalidations.isEmpty()) || this.broadcastFrameClock.getHasAwaiters()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!(!this.snapshotInvalidations.isEmpty()) && !(!this.compositionInvalidations.isEmpty()) && !this.broadcastFrameClock.getHasAwaiters()) {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        boolean z2;
        synchronized (this.stateLock) {
            z = !this.isClosed;
        }
        if (z) {
            return true;
        }
        Iterator<C14054y1> it = this.effectJob.getChildren().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo45937a()) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = new java.util.ArrayList();
        performInitialMovableContentInserts$fillToInsert(r0, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        performInsertValues(r0, (androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>) null);
        performInitialMovableContentInserts$fillToInsert(r0, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void performInitialMovableContentInserts(androidx.compose.runtime.ControlledComposition r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.stateLock
            monitor-enter(r0)
            java.util.List<androidx.compose.runtime.MovableContentStateReference> r1 = r7.compositionValuesAwaitingInsert     // Catch:{ all -> 0x0042 }
            int r2 = r1.size()     // Catch:{ all -> 0x0042 }
            r3 = 0
            r4 = r3
        L_0x000b:
            r5 = 1
            if (r4 >= r2) goto L_0x0023
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x0042 }
            androidx.compose.runtime.MovableContentStateReference r6 = (androidx.compose.runtime.MovableContentStateReference) r6     // Catch:{ all -> 0x0042 }
            androidx.compose.runtime.ControlledComposition r6 = r6.getComposition$runtime_release()     // Catch:{ all -> 0x0042 }
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r6, r8)     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0020
            r3 = r5
            goto L_0x0023
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0023:
            if (r3 != 0) goto L_0x0027
            monitor-exit(r0)
            return
        L_0x0027:
            ef.v r1 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            performInitialMovableContentInserts$fillToInsert(r0, r7, r8)
        L_0x0032:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0041
            r1 = 0
            r7.performInsertValues(r0, r1)
            performInitialMovableContentInserts$fillToInsert(r0, r7, r8)
            goto L_0x0032
        L_0x0041:
            return
        L_0x0042:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performInitialMovableContentInserts(androidx.compose.runtime.ControlledComposition):void");
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference next = it.next();
                if (C12775o.m28634d(next.getComposition$runtime_release(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    /* access modifiers changed from: private */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> list, IdentityArraySet<Object> identityArraySet) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MovableContentStateReference movableContentStateReference = list.get(i);
            ControlledComposition composition$runtime_release = movableContentStateReference.getComposition$runtime_release();
            Object obj = hashMap.get(composition$runtime_release);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(composition$runtime_release, obj);
            }
            ((ArrayList) obj).add(movableContentStateReference);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list2.get(i2);
                            arrayList.add(C11915r.m25707a(movableContentStateReference2, RecomposerKt.removeLastMultiValue(this.compositionValuesRemoved, movableContentStateReference2.getContent$runtime_release())));
                        }
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    C11921v vVar = C11921v.f18618a;
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                } catch (Throwable th) {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        }
        return C12686e0.m28205B0(hashMap.keySet());
    }

    /* access modifiers changed from: private */
    public final ControlledComposition performRecompose(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet) {
        Snapshot makeCurrent;
        if (controlledComposition.isComposing() || controlledComposition.isDisposed()) {
            return null;
        }
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
        try {
            makeCurrent = takeMutableSnapshot.makeCurrent();
            boolean z = false;
            if (identityArraySet != null) {
                if (identityArraySet.isNotEmpty()) {
                    z = true;
                }
            }
            if (z) {
                controlledComposition.prepareCompose(new Recomposer$performRecompose$1$1(identityArraySet, controlledComposition));
            }
            boolean recompose = controlledComposition.recompose();
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            applyAndCheck(takeMutableSnapshot);
            if (recompose) {
                return controlledComposition;
            }
            return null;
        } catch (Throwable th) {
            applyAndCheck(takeMutableSnapshot);
            throw th;
        }
    }

    private final void processCompositionError(Exception exc, ControlledComposition controlledComposition, boolean z) {
        Boolean bool = _hotReloadEnabled.get();
        C12775o.m28638h(bool, "_hotReloadEnabled.get()");
        if (!bool.booleanValue() || (exc instanceof ComposeRuntimeError)) {
            throw exc;
        }
        synchronized (this.stateLock) {
            ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", exc);
            this.compositionsAwaitingApply.clear();
            this.compositionInvalidations.clear();
            this.snapshotInvalidations = new LinkedHashSet();
            this.compositionValuesAwaitingInsert.clear();
            this.compositionValuesRemoved.clear();
            this.compositionValueStatesAvailable.clear();
            this.errorState = new RecomposerErrorState(z, exc);
            if (controlledComposition != null) {
                List list = this.failedCompositions;
                if (list == null) {
                    list = new ArrayList();
                    this.failedCompositions = list;
                }
                if (!list.contains(controlledComposition)) {
                    list.add(controlledComposition);
                }
                this.knownCompositions.remove(controlledComposition);
            }
            deriveStateLocked();
        }
    }

    static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Exception exc, ControlledComposition controlledComposition, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(exc, controlledComposition, z);
    }

    private final Function1<Object, C11921v> readObserverOf(ControlledComposition controlledComposition) {
        return new Recomposer$readObserverOf$1(controlledComposition);
    }

    /* access modifiers changed from: private */
    public final Object recompositionRunner(C13089p<? super C13995l0, ? super MonotonicFrameClock, ? super C12074d<? super C11921v>, ? extends Object> pVar, C12074d<? super C11921v> dVar) {
        Object g = C13970h.m32378g(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, pVar, MonotonicFrameClockKt.getMonotonicFrameClock(dVar.getContext()), (C12074d<? super Recomposer$recompositionRunner$2>) null), dVar);
        if (g == C12150d.m26492c()) {
            return g;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: private */
    public final void recordComposerModificationsLocked() {
        Set<Object> set = this.snapshotInvalidations;
        if (!set.isEmpty()) {
            List<ControlledComposition> list = this.knownCompositions;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).recordModificationsOf(set);
                if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                    break;
                }
            }
            this.snapshotInvalidations = new LinkedHashSet();
            if (deriveStateLocked() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void registerRunnerJob(C14054y1 y1Var) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            } else if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            } else if (this.runnerJob == null) {
                this.runnerJob = y1Var;
                deriveStateLocked();
            } else {
                throw new IllegalStateException("Recomposer already running".toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* access modifiers changed from: private */
    public final void retryFailedCompositions() {
        synchronized (this.stateLock) {
            List<ControlledComposition> list = this.failedCompositions;
            if (list != null) {
                while (!list.isEmpty()) {
                    ControlledComposition controlledComposition = (ControlledComposition) C12669b0.m28190N(list);
                    if (controlledComposition instanceof CompositionImpl) {
                        controlledComposition.invalidateAll();
                        controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                        if (this.errorState != null) {
                            break;
                        }
                    }
                }
                C11921v vVar = C11921v.f18618a;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r8, androidx.compose.runtime.ProduceFrameSignal r9, p355hf.C12074d<? super p336ef.C11921v> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer$runFrameLoop$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer$runFrameLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            p336ef.C11910n.m25701b(r10)
        L_0x003f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L_0x0073
        L_0x0045:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004d:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            p336ef.C11910n.m25701b(r10)
            goto L_0x008d
        L_0x0065:
            p336ef.C11910n.m25701b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L_0x0073:
            java.lang.Object r6 = r5.stateLock
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.awaitFrameRequest(r6, r0)
            if (r6 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L_0x008d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>(r6, r9, r8, r2)
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L_0x003f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, hf.d):java.lang.Object");
    }

    private final Function1<Object, C11921v> writeObserverOf(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet) {
        return new Recomposer$writeObserverOf$1(controlledComposition, identityArraySet);
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final Object awaitIdle(C12074d<? super C11921v> dVar) {
        Object e = C10971h.m23598e(C10971h.m23615v(getCurrentState(), new Recomposer$awaitIdle$2((C12074d<? super Recomposer$awaitIdle$2>) null)), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (this._state.getValue().compareTo(State.Idle) >= 0) {
                this._state.setValue(State.ShuttingDown);
            }
            C11921v vVar = C11921v.f18618a;
        }
        C14054y1.C14055a.m32600a(this.effectJob, (CancellationException) null, 1, (Object) null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                C11921v vVar = C11921v.f18618a;
            }
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(ControlledComposition controlledComposition, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        Snapshot makeCurrent;
        C12775o.m28639i(controlledComposition, "composition");
        C12775o.m28639i(oVar, "content");
        boolean isComposing = controlledComposition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.Companion;
            MutableSnapshot takeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, (IdentityArraySet<Object>) null));
            try {
                makeCurrent = takeMutableSnapshot.makeCurrent();
                controlledComposition.composeContent(oVar);
                C11921v vVar = C11921v.f18618a;
                takeMutableSnapshot.restoreCurrent(makeCurrent);
                applyAndCheck(takeMutableSnapshot);
                if (!isComposing) {
                    companion.notifyObjectsInitialized();
                }
                synchronized (this.stateLock) {
                    if (this._state.getValue().compareTo(State.ShuttingDown) > 0 && !this.knownCompositions.contains(controlledComposition)) {
                        this.knownCompositions.add(controlledComposition);
                    }
                }
                try {
                    performInitialMovableContentInserts(controlledComposition);
                    try {
                        controlledComposition.applyChanges();
                        controlledComposition.applyLateChanges();
                        if (!isComposing) {
                            companion.notifyObjectsInitialized();
                        }
                    } catch (Exception e) {
                        processCompositionError$default(this, e, (ControlledComposition) null, false, 6, (Object) null);
                    }
                } catch (Exception e2) {
                    processCompositionError(e2, controlledComposition, true);
                }
            } catch (Throwable th) {
                applyAndCheck(takeMutableSnapshot);
                throw th;
            }
        } catch (Exception e3) {
            processCompositionError(e3, controlledComposition, true);
        }
    }

    public void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
        C12775o.m28639i(movableContentStateReference, "reference");
        synchronized (this.stateLock) {
            RecomposerKt.addMultiValue(this.compositionValuesRemoved, movableContentStateReference.getContent$runtime_release(), movableContentStateReference);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    public final C10972h0<State> getCurrentState() {
        return this._state;
    }

    public C12079g getEffectCoroutineContext$runtime_release() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!(!this.snapshotInvalidations.isEmpty()) && !(!this.compositionInvalidations.isEmpty()) && this.concurrentCompositionsOutstanding <= 0 && !(!this.compositionsAwaitingApply.isEmpty()) && !this.broadcastFrameClock.getHasAwaiters()) {
                z = false;
            }
        }
        return z;
    }

    public C12079g getRecomposeCoroutineContext$runtime_release() {
        return C12085h.f18916b;
    }

    public final C10962f<State> getState() {
        return getCurrentState();
    }

    public void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
        C14002n<C11921v> deriveStateLocked;
        C12775o.m28639i(movableContentStateReference, "reference");
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(movableContentStateReference);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            C11907m.C11908a aVar = C11907m.f18600b;
            deriveStateLocked.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }

    public void invalidate$runtime_release(ControlledComposition controlledComposition) {
        C14002n<C11921v> nVar;
        C12775o.m28639i(controlledComposition, "composition");
        synchronized (this.stateLock) {
            if (!this.compositionInvalidations.contains(controlledComposition)) {
                this.compositionInvalidations.add(controlledComposition);
                nVar = deriveStateLocked();
            } else {
                nVar = null;
            }
        }
        if (nVar != null) {
            C11907m.C11908a aVar = C11907m.f18600b;
            nVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }

    public void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl) {
        C14002n<C11921v> deriveStateLocked;
        C12775o.m28639i(recomposeScopeImpl, "scope");
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(recomposeScopeImpl);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            C11907m.C11908a aVar = C11907m.f18600b;
            deriveStateLocked.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }

    public final Object join(C12074d<? super C11921v> dVar) {
        Object n = C10971h.m23607n(getCurrentState(), new Recomposer$join$2((C12074d<? super Recomposer$join$2>) null), dVar);
        if (n == C12150d.m26492c()) {
            return n;
        }
        return C11921v.f18618a;
    }

    public void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState) {
        C12775o.m28639i(movableContentStateReference, "reference");
        C12775o.m28639i(movableContentState, "data");
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(movableContentStateReference, movableContentState);
            C11921v vVar = C11921v.f18618a;
        }
    }

    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
        MovableContentState remove;
        C12775o.m28639i(movableContentStateReference, "reference");
        synchronized (this.stateLock) {
            remove = this.compositionValueStatesAvailable.remove(movableContentStateReference);
        }
        return remove;
    }

    public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
        C12775o.m28639i(set, "table");
    }

    public void registerComposition$runtime_release(ControlledComposition controlledComposition) {
        C12775o.m28639i(controlledComposition, "composition");
    }

    public final Object runRecomposeAndApplyChanges(C12074d<? super C11921v> dVar) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(this, (C12074d<? super Recomposer$runRecomposeAndApplyChanges$2>) null), dVar);
        if (recompositionRunner == C12150d.m26492c()) {
            return recompositionRunner;
        }
        return C11921v.f18618a;
    }

    @ExperimentalComposeApi
    public final Object runRecomposeConcurrentlyAndApplyChanges(C12079g gVar, C12074d<? super C11921v> dVar) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(gVar, this, (C12074d<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2>) null), dVar);
        if (recompositionRunner == C12150d.m26492c()) {
            return recompositionRunner;
        }
        return C11921v.f18618a;
    }

    public void unregisterComposition$runtime_release(ControlledComposition controlledComposition) {
        C12775o.m28639i(controlledComposition, "composition");
        synchronized (this.stateLock) {
            this.knownCompositions.remove(controlledComposition);
            this.compositionInvalidations.remove(controlledComposition);
            this.compositionsAwaitingApply.remove(controlledComposition);
            C11921v vVar = C11921v.f18618a;
        }
    }

    private final void recordComposerModificationsLocked(Function1<? super ControlledComposition, C11921v> function1) {
        Set access$getSnapshotInvalidations$p = this.snapshotInvalidations;
        if (!access$getSnapshotInvalidations$p.isEmpty()) {
            List access$getKnownCompositions$p = this.knownCompositions;
            int size = access$getKnownCompositions$p.size();
            for (int i = 0; i < size; i++) {
                ((ControlledComposition) access$getKnownCompositions$p.get(i)).recordModificationsOf(access$getSnapshotInvalidations$p);
            }
            this.snapshotInvalidations = new LinkedHashSet();
        }
        List access$getCompositionInvalidations$p = this.compositionInvalidations;
        int size2 = access$getCompositionInvalidations$p.size();
        for (int i2 = 0; i2 < size2; i2++) {
            function1.invoke(access$getCompositionInvalidations$p.get(i2));
        }
        this.compositionInvalidations.clear();
        if (deriveStateLocked() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
        }
    }

    public static /* synthetic */ void getState$annotations() {
    }
}
