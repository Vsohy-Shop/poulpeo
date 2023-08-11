package androidx.compose.runtime.snapshots;

import androidx.compose.animation.core.C0344a;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n1#1,549:1\n181#1,2:554\n183#1,2:567\n181#1,2:598\n183#1,2:611\n181#1,2:613\n183#1,2:626\n181#1,2:628\n183#1,2:641\n1182#2:550\n1161#2,2:551\n1#3:553\n460#4,11:556\n460#4,11:569\n460#4,11:600\n460#4,11:615\n460#4,11:630\n366#4,12:643\n728#4,2:655\n436#5,18:580\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n65#1:554,2\n65#1:567,2\n269#1:598,2\n269#1:611,2\n279#1:613,2\n279#1:626,2\n311#1:628,2\n311#1:641,2\n173#1:550\n173#1:551,2\n65#1:556,11\n182#1:569,11\n269#1:600,11\n279#1:615,11\n311#1:630,11\n324#1:643,12\n327#1:655,2\n229#1:580,18\n*E\n"})
/* compiled from: SnapshotStateObserver.kt */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private final C13088o<Set<? extends Object>, Snapshot, C11921v> applyObserver = new SnapshotStateObserver$applyObserver$1(this);
    private ObserverHandle applyUnsubscribe;
    /* access modifiers changed from: private */
    public ObservedScopeMap currentMap;
    /* access modifiers changed from: private */
    public boolean isPaused;
    /* access modifiers changed from: private */
    public final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private final Function1<C13074a<C11921v>, C11921v> onChangedExecutor;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */
    public final Function1<Object, C11921v> readObserver = new SnapshotStateObserver$readObserver$1(this);
    /* access modifiers changed from: private */
    public boolean sendingNotifications;

    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n+ 3 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 4 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 5 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,549:1\n132#2,18:550\n159#2,4:568\n159#2,4:579\n118#3,7:572\n125#3,15:583\n89#4,3:598\n89#4,3:604\n93#4:612\n93#4:614\n89#4,3:615\n93#4:623\n105#5,3:601\n105#5,5:607\n109#5:613\n105#5,5:618\n105#5,5:624\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n456#1:550,18\n470#1:568,4\n482#1:579,4\n479#1:572,7\n479#1:583,15\n517#1:598,3\n524#1:604,3\n524#1:612\n517#1:614\n532#1:615,3\n532#1:623\n517#1:601,3\n524#1:607,5\n517#1:613\n532#1:618,5\n544#1:624,5\n*E\n"})
    /* compiled from: SnapshotStateObserver.kt */
    private static final class ObservedScopeMap {
        /* access modifiers changed from: private */
        public Object currentScope;
        /* access modifiers changed from: private */
        public IdentityArrayIntMap currentScopeReads;
        /* access modifiers changed from: private */
        public int currentToken = -1;
        private final IdentityScopeMap<DerivedState<?>> dependencyToDerivedStates = new IdentityScopeMap<>();
        /* access modifiers changed from: private */
        public int deriveStateScopeCount;
        private final Function1<State<?>, C11921v> derivedStateEnterObserver = new C0952x6befda94(this);
        private final Function1<State<?>, C11921v> derivedStateExitObserver = new C0953xa5f2bac8(this);
        private final IdentityArraySet<Object> invalidated = new IdentityArraySet<>();
        private final Function1<Object, C11921v> onChanged;
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();
        /* access modifiers changed from: private */
        public final IdentityArrayMap<Object, IdentityArrayIntMap> scopeToValues = new IdentityArrayMap<>(0, 1, (DefaultConstructorMarker) null);
        private final IdentityScopeMap<Object> valueToScopes = new IdentityScopeMap<>();

        public ObservedScopeMap(Function1<Object, C11921v> function1) {
            C12775o.m28639i(function1, "onChanged");
            this.onChanged = function1;
        }

        /* access modifiers changed from: private */
        public final void clearObsoleteStateReads(Object obj) {
            boolean z;
            IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
            if (identityArrayIntMap != null) {
                int size = identityArrayIntMap.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj2 = identityArrayIntMap.getKeys()[i2];
                    C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i3 = identityArrayIntMap.getValues()[i2];
                    if (i3 != this.currentToken) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        removeObservation(obj, obj2);
                    }
                    if (!z) {
                        if (i != i2) {
                            identityArrayIntMap.getKeys()[i] = obj2;
                            identityArrayIntMap.getValues()[i] = i3;
                        }
                        i++;
                    }
                }
                int size2 = identityArrayIntMap.getSize();
                for (int i4 = i; i4 < size2; i4++) {
                    identityArrayIntMap.getKeys()[i4] = null;
                }
                identityArrayIntMap.setSize(i);
            }
        }

        private final void removeObservation(Object obj, Object obj2) {
            this.valueToScopes.remove(obj2, obj);
            if ((obj2 instanceof DerivedState) && !this.valueToScopes.contains(obj2)) {
                this.dependencyToDerivedStates.removeScope(obj2);
                this.recordedDerivedStateValues.remove(obj2);
            }
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(Object obj) {
            C12775o.m28639i(obj, "scope");
            IdentityArrayIntMap remove = this.scopeToValues.remove(obj);
            if (remove != null) {
                int size = remove.getSize();
                for (int i = 0; i < size; i++) {
                    Object obj2 = remove.getKeys()[i];
                    C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i2 = remove.getValues()[i];
                    removeObservation(obj, obj2);
                }
            }
        }

        public final Function1<State<?>, C11921v> getDerivedStateEnterObserver() {
            return this.derivedStateEnterObserver;
        }

        public final Function1<State<?>, C11921v> getDerivedStateExitObserver() {
            return this.derivedStateExitObserver;
        }

        public final Function1<Object, C11921v> getOnChanged() {
            return this.onChanged;
        }

        public final void notifyInvalidatedScopes() {
            IdentityArraySet<Object> identityArraySet = this.invalidated;
            Function1<Object, C11921v> function1 = this.onChanged;
            int size = identityArraySet.size();
            for (int i = 0; i < size; i++) {
                function1.invoke(identityArraySet.get(i));
            }
            this.invalidated.clear();
        }

        public final void observe(Object obj, C13074a<C11921v> aVar) {
            C12775o.m28639i(obj, "scope");
            C12775o.m28639i(aVar, "block");
            Object access$getCurrentScope$p = this.currentScope;
            IdentityArrayIntMap access$getCurrentScopeReads$p = this.currentScopeReads;
            int access$getCurrentToken$p = this.currentToken;
            this.currentScope = obj;
            this.currentScopeReads = (IdentityArrayIntMap) this.scopeToValues.get(obj);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            aVar.invoke();
            Object access$getCurrentScope$p2 = this.currentScope;
            C12775o.m28636f(access$getCurrentScope$p2);
            clearObsoleteStateReads(access$getCurrentScope$p2);
            this.currentScope = access$getCurrentScope$p;
            this.currentScopeReads = access$getCurrentScopeReads$p;
            this.currentToken = access$getCurrentToken$p;
        }

        public final boolean recordInvalidation(Set<? extends Object> set) {
            IdentityScopeMap<DerivedState<?>> identityScopeMap;
            int access$find;
            IdentityScopeMap<Object> identityScopeMap2;
            int access$find2;
            C12775o.m28639i(set, "changes");
            boolean z = false;
            for (Object next : set) {
                if (this.dependencyToDerivedStates.contains(next) && (access$find = identityScopeMap.find(next)) >= 0) {
                    IdentityArraySet access$scopeSetAt = (identityScopeMap = this.dependencyToDerivedStates).scopeSetAt(access$find);
                    int size = access$scopeSetAt.size();
                    for (int i = 0; i < size; i++) {
                        DerivedState derivedState = (DerivedState) access$scopeSetAt.get(i);
                        C12775o.m28637g(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                        Object obj = this.recordedDerivedStateValues.get(derivedState);
                        SnapshotMutationPolicy policy = derivedState.getPolicy();
                        if (policy == null) {
                            policy = SnapshotStateKt.structuralEqualityPolicy();
                        }
                        if (!policy.equivalent(derivedState.getCurrentValue(), obj) && (access$find2 = identityScopeMap2.find(derivedState)) >= 0) {
                            IdentityArraySet access$scopeSetAt2 = (identityScopeMap2 = this.valueToScopes).scopeSetAt(access$find2);
                            int size2 = access$scopeSetAt2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                this.invalidated.add(access$scopeSetAt2.get(i2));
                                i2++;
                                z = true;
                            }
                        }
                    }
                }
                IdentityScopeMap<Object> identityScopeMap3 = this.valueToScopes;
                int access$find3 = identityScopeMap3.find(next);
                if (access$find3 >= 0) {
                    IdentityArraySet access$scopeSetAt3 = identityScopeMap3.scopeSetAt(access$find3);
                    int size3 = access$scopeSetAt3.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        this.invalidated.add(access$scopeSetAt3.get(i3));
                        i3++;
                        z = true;
                    }
                }
            }
            return z;
        }

        public final void recordRead(Object obj) {
            C12775o.m28639i(obj, "value");
            if (this.deriveStateScopeCount <= 0) {
                Object obj2 = this.currentScope;
                C12775o.m28636f(obj2);
                IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
                if (identityArrayIntMap == null) {
                    identityArrayIntMap = new IdentityArrayIntMap();
                    this.currentScopeReads = identityArrayIntMap;
                    this.scopeToValues.set(obj2, identityArrayIntMap);
                }
                int add = identityArrayIntMap.add(obj, this.currentToken);
                if ((obj instanceof DerivedState) && add != this.currentToken) {
                    DerivedState derivedState = (DerivedState) obj;
                    for (Object obj3 : derivedState.getDependencies()) {
                        if (obj3 == null) {
                            break;
                        }
                        this.dependencyToDerivedStates.add(obj3, obj);
                    }
                    this.recordedDerivedStateValues.put(obj, derivedState.getCurrentValue());
                }
                if (add == -1) {
                    this.valueToScopes.add(obj, obj2);
                }
            }
        }

        public final void removeScopeIf(Function1<Object, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            IdentityArrayMap<Object, IdentityArrayIntMap> identityArrayMap = this.scopeToValues;
            int size$runtime_release = identityArrayMap.getSize$runtime_release();
            int i = 0;
            for (int i2 = 0; i2 < size$runtime_release; i2++) {
                Object obj = identityArrayMap.getKeys$runtime_release()[i2];
                C12775o.m28637g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                IdentityArrayIntMap identityArrayIntMap = (IdentityArrayIntMap) identityArrayMap.getValues$runtime_release()[i2];
                Boolean invoke = function1.invoke(obj);
                if (invoke.booleanValue()) {
                    int size = identityArrayIntMap.getSize();
                    for (int i3 = 0; i3 < size; i3++) {
                        Object obj2 = identityArrayIntMap.getKeys()[i3];
                        C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i4 = identityArrayIntMap.getValues()[i3];
                        removeObservation(obj, obj2);
                    }
                }
                if (!invoke.booleanValue()) {
                    if (i != i2) {
                        identityArrayMap.getKeys$runtime_release()[i] = obj;
                        identityArrayMap.getValues$runtime_release()[i] = identityArrayMap.getValues$runtime_release()[i2];
                    }
                    i++;
                }
            }
            if (identityArrayMap.getSize$runtime_release() > i) {
                int size$runtime_release2 = identityArrayMap.getSize$runtime_release();
                for (int i5 = i; i5 < size$runtime_release2; i5++) {
                    identityArrayMap.getKeys$runtime_release()[i5] = null;
                    identityArrayMap.getValues$runtime_release()[i5] = null;
                }
                identityArrayMap.setSize$runtime_release(i);
            }
        }
    }

    public SnapshotStateObserver(Function1<? super C13074a<C11921v>, C11921v> function1) {
        C12775o.m28639i(function1, "onChangedExecutor");
        this.onChangedExecutor = function1;
    }

    /* access modifiers changed from: private */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        Collection collection;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                collection = set;
            } else if (obj instanceof Set) {
                collection = C12726w.m28527n((Set) obj, set);
            } else if (obj instanceof List) {
                collection = C12686e0.m28236o0((Collection) obj, C12723v.m28509d(set));
            } else {
                report();
                throw new KotlinNothingValueException();
            }
        } while (!C0344a.m496a(this.pendingChanges, obj, collection));
    }

    /* access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMaps) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<Object> removeChanges = removeChanges();
            if (removeChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMaps) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        if (!((ObservedScopeMap) content[i]).recordInvalidation(removeChanges)) {
                            if (!z2) {
                                z2 = false;
                                i++;
                            }
                        }
                        z2 = true;
                        i++;
                    } while (i < size);
                }
                C11921v vVar = C11921v.f18618a;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap ensureMap(kotlin.jvm.functions.Function1<? super T, p336ef.C11921v> r8) {
        /*
            r7 = this;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap> r0 = r7.observedScopeMaps
            int r1 = r0.getSize()
            r2 = 1
            if (r1 <= 0) goto L_0x0024
            java.lang.Object[] r0 = r0.getContent()
            r3 = 0
            r4 = r3
        L_0x000f:
            r5 = r0[r4]
            r6 = r5
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r6 = (androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap) r6
            kotlin.jvm.functions.Function1 r6 = r6.getOnChanged()
            if (r6 != r8) goto L_0x001c
            r6 = r2
            goto L_0x001d
        L_0x001c:
            r6 = r3
        L_0x001d:
            if (r6 == 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            int r4 = r4 + 1
            if (r4 < r1) goto L_0x000f
        L_0x0024:
            r5 = 0
        L_0x0025:
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r5 = (androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap) r5
            if (r5 != 0) goto L_0x003f
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r0 = new androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"
            kotlin.jvm.internal.C12775o.m28637g(r8, r1)
            java.lang.Object r8 = kotlin.jvm.internal.C12772l0.m28614f(r8, r2)
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0.<init>(r8)
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap> r8 = r7.observedScopeMaps
            r8.add(r0)
            return r0
        L_0x003f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ensureMap(kotlin.jvm.functions.Function1):androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap");
    }

    private final void forEachScopeMap(Function1<? super ObservedScopeMap, C11921v> function1) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        function1.invoke(content[i]);
                        i++;
                    } while (i < size);
                }
                C11921v vVar = C11921v.f18618a;
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                report();
                throw new KotlinNothingValueException();
            }
        } while (!C0344a.m496a(this.pendingChanges, obj, obj2));
        return set;
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new SnapshotStateObserver$sendNotifications$1(this));
    }

    public final void clear(Object obj) {
        C12775o.m28639i(obj, "scope");
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    ((ObservedScopeMap) content[i]).clearScopeObservations(obj);
                    i++;
                } while (i < size);
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final void clearIf(Function1<Object, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    ((ObservedScopeMap) content[i]).removeScopeIf(function1);
                    i++;
                } while (i < size);
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final void notifyChanges(Set<? extends Object> set, Snapshot snapshot) {
        C12775o.m28639i(set, "changes");
        C12775o.m28639i(snapshot, "snapshot");
        this.applyObserver.invoke(set, snapshot);
    }

    public final <T> void observeReads(T t, Function1<? super T, C11921v> function1, C13074a<C11921v> aVar) {
        ObservedScopeMap ensureMap;
        C12775o.m28639i(t, "scope");
        C12775o.m28639i(function1, "onValueChangedForScope");
        C12775o.m28639i(aVar, "block");
        synchronized (this.observedScopeMaps) {
            ensureMap = ensureMap(function1);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        try {
            this.isPaused = false;
            this.currentMap = ensureMap;
            Object access$getCurrentScope$p = ensureMap.currentScope;
            IdentityArrayIntMap access$getCurrentScopeReads$p = ensureMap.currentScopeReads;
            int access$getCurrentToken$p = ensureMap.currentToken;
            ensureMap.currentScope = t;
            ensureMap.currentScopeReads = (IdentityArrayIntMap) ensureMap.scopeToValues.get(t);
            if (ensureMap.currentToken == -1) {
                ensureMap.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            SnapshotStateKt.observeDerivedStateRecalculations(ensureMap.getDerivedStateEnterObserver(), ensureMap.getDerivedStateExitObserver(), new SnapshotStateObserver$observeReads$1$1(this, aVar));
            Object access$getCurrentScope$p2 = ensureMap.currentScope;
            C12775o.m28636f(access$getCurrentScope$p2);
            ensureMap.clearObsoleteStateReads(access$getCurrentScope$p2);
            ensureMap.currentScope = access$getCurrentScope$p;
            ensureMap.currentScopeReads = access$getCurrentScopeReads$p;
            ensureMap.currentToken = access$getCurrentToken$p;
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    public final void withNoObservations(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "block");
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            aVar.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    ((ObservedScopeMap) content[i]).clear();
                    i++;
                } while (i < size);
            }
            C11921v vVar = C11921v.f18618a;
        }
    }
}
