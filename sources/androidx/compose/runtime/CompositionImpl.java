package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11921v;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 7 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 8 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 9 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1257:1\n884#1,2:1271\n1025#1,3:1273\n874#1,6:1277\n1028#1,7:1283\n886#1,4:1290\n884#1,2:1467\n1025#1,3:1469\n874#1,6:1472\n1028#1,7:1478\n886#1,4:1485\n884#1,2:1498\n1025#1,10:1500\n886#1,4:1510\n884#1,2:1586\n1025#1,10:1588\n886#1,4:1598\n884#1,2:1603\n1025#1,10:1605\n886#1,4:1615\n884#1,2:1620\n1025#1,10:1622\n886#1,4:1632\n1025#1,10:1636\n70#2:1258\n70#2:1260\n70#2:1276\n70#2:1294\n70#2:1303\n70#2:1304\n70#2:1456\n70#2:1466\n70#2:1585\n70#2:1602\n70#2:1619\n70#2:1646\n70#2:1649\n70#2:1650\n1#3:1259\n1#3:1661\n93#4,2:1261\n33#4,4:1263\n95#4,2:1267\n38#4:1269\n97#4:1270\n110#4,2:1489\n33#4,6:1491\n112#4:1497\n33#4,6:1529\n33#4,6:1664\n162#5,8:1295\n162#5,8:1514\n162#5,4:1525\n167#5,3:1535\n89#6,3:1305\n93#6:1313\n220#6:1314\n236#6,5:1315\n221#6:1320\n222#6:1337\n241#6,17:1338\n223#6:1355\n220#6:1356\n236#6,5:1357\n221#6:1362\n222#6:1379\n241#6,17:1380\n223#6:1397\n220#6:1398\n236#6,5:1399\n221#6:1404\n222#6:1421\n241#6,17:1422\n223#6:1439\n89#6,3:1447\n93#6:1455\n89#6,3:1457\n93#6:1465\n220#6:1542\n236#6,5:1543\n221#6:1548\n222#6:1565\n241#6,17:1566\n223#6:1583\n89#6,3:1670\n93#6:1678\n105#7,5:1308\n146#7,16:1321\n146#7,16:1363\n146#7,16:1405\n105#7,5:1450\n105#7,5:1460\n146#7,16:1549\n105#7,5:1673\n1251#8,7:1440\n46#9,3:1522\n50#9:1538\n46#9,3:1539\n50#9:1584\n13579#10,2:1647\n11653#10,9:1651\n13579#10:1660\n13580#10:1662\n11662#10:1663\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n583#1:1271,2\n583#1:1273,3\n586#1:1277,6\n583#1:1283,7\n583#1:1290,4\n770#1:1467,2\n770#1:1469,3\n771#1:1472,6\n770#1:1478,7\n770#1:1485,4\n784#1:1498,2\n784#1:1500,10\n784#1:1510,4\n841#1:1586,2\n841#1:1588,10\n841#1:1598,4\n850#1:1603,2\n850#1:1605,10\n850#1:1615,4\n860#1:1620,2\n860#1:1622,10\n860#1:1632,4\n885#1:1636,10\n514#1:1258\n523#1:1260\n584#1:1276\n594#1:1294\n635#1:1303\n656#1:1304\n758#1:1456\n768#1:1466\n840#1:1585\n849#1:1602\n859#1:1619\n899#1:1646\n905#1:1649\n950#1:1650\n1012#1:1661\n530#1:1261,2\n530#1:1263,4\n530#1:1267,2\n530#1:1269\n530#1:1270\n783#1:1489,2\n783#1:1491,6\n783#1:1497\n809#1:1529,6\n1013#1:1664,6\n620#1:1295,8\n792#1:1514,8\n807#1:1525,4\n807#1:1535,3\n701#1:1305,3\n701#1:1313\n708#1:1314\n708#1:1315,5\n708#1:1320\n708#1:1337\n708#1:1338,17\n708#1:1355\n715#1:1356\n715#1:1357,5\n715#1:1362\n715#1:1379\n715#1:1380,17\n715#1:1397\n722#1:1398\n722#1:1399,5\n722#1:1404\n722#1:1421\n722#1:1422,17\n722#1:1439\n750#1:1447,3\n750#1:1455\n763#1:1457,3\n763#1:1465\n827#1:1542\n827#1:1543,5\n827#1:1548\n827#1:1565\n827#1:1566,17\n827#1:1583\n678#1:1670,3\n678#1:1678\n701#1:1308,5\n708#1:1321,16\n715#1:1363,16\n722#1:1405,16\n750#1:1450,5\n763#1:1460,5\n827#1:1549,16\n678#1:1673,5\n723#1:1440,7\n803#1:1522,3\n803#1:1538\n825#1:1539,3\n825#1:1584\n900#1:1647,2\n1012#1:1651,9\n1012#1:1660\n1012#1:1662\n1012#1:1663\n*E\n"})
/* compiled from: Composition.kt */
public final class CompositionImpl implements ControlledComposition {
    private final C12079g _recomposeContext;
    private final HashSet<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> changes;
    private C13088o<? super Composer, ? super Integer, C11921v> composable;
    private final ComposerImpl composer;
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final IdentityScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;
    private final List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> lateChanges;
    private final Object lock;
    private final IdentityScopeMap<RecomposeScopeImpl> observations;
    private final IdentityScopeMap<RecomposeScopeImpl> observationsProcessed;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private final SlotTable slotTable;

    @SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1257:1\n46#2,5:1258\n46#2,3:1263\n50#2:1272\n46#2,3:1273\n50#2:1282\n46#2,5:1283\n46#2,5:1288\n46#2,5:1293\n33#3,6:1266\n33#3,6:1276\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1090#1:1258,5\n1102#1:1263,3\n1102#1:1272\n1113#1:1273,3\n1113#1:1282\n1124#1:1283,5\n1138#1:1288,5\n1151#1:1293,5\n1103#1:1266,6\n1114#1:1276,6\n*E\n"})
    /* compiled from: Composition.kt */
    private static final class RememberEventDispatcher implements RememberManager {
        private final Set<RememberObserver> abandoning;
        private List<ComposeNodeLifecycleCallback> deactivating;
        private final List<RememberObserver> forgetting = new ArrayList();
        private List<ComposeNodeLifecycleCallback> releasing;
        private final List<RememberObserver> remembering = new ArrayList();
        private final List<C13074a<C11921v>> sideEffects = new ArrayList();

        public RememberEventDispatcher(Set<RememberObserver> set) {
            C12775o.m28639i(set, "abandoning");
            this.abandoning = set;
        }

        public void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            C12775o.m28639i(composeNodeLifecycleCallback, "instance");
            List list = this.deactivating;
            if (list == null) {
                list = new ArrayList();
                this.deactivating = list;
            }
            list.add(composeNodeLifecycleCallback);
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().onAbandoned();
                    }
                    C11921v vVar = C11921v.f18618a;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
        }

        /* JADX INFO: finally extract failed */
        public final void dispatchNodeCallbacks() {
            boolean z;
            List<ComposeNodeLifecycleCallback> list = this.deactivating;
            Collection collection = list;
            boolean z2 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        list.get(size).onDeactivate();
                    }
                    C11921v vVar = C11921v.f18618a;
                    Trace.INSTANCE.endSection(beginSection);
                    list.clear();
                } catch (Throwable th) {
                    Trace.INSTANCE.endSection(beginSection);
                    throw th;
                }
            }
            List<ComposeNodeLifecycleCallback> list2 = this.releasing;
            Collection collection2 = list2;
            if (collection2 == null || collection2.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                Object beginSection2 = Trace.INSTANCE.beginSection("Compose:releases");
                try {
                    for (int size2 = list2.size() - 1; -1 < size2; size2--) {
                        list2.get(size2).onRelease();
                    }
                    C11921v vVar2 = C11921v.f18618a;
                    Trace.INSTANCE.endSection(beginSection2);
                    list2.clear();
                } catch (Throwable th2) {
                    Trace.INSTANCE.endSection(beginSection2);
                    throw th2;
                }
            }
        }

        public final void dispatchRememberObservers() {
            if (!this.forgetting.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        RememberObserver rememberObserver = this.forgetting.get(size);
                        if (!this.abandoning.contains(rememberObserver)) {
                            rememberObserver.onForgotten();
                        }
                    }
                    C11921v vVar = C11921v.f18618a;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
            if (!this.remembering.isEmpty()) {
                Object beginSection2 = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List<RememberObserver> list = this.remembering;
                    int size2 = list.size();
                    for (int i = 0; i < size2; i++) {
                        RememberObserver rememberObserver2 = list.get(i);
                        this.abandoning.remove(rememberObserver2);
                        rememberObserver2.onRemembered();
                    }
                    C11921v vVar2 = C11921v.f18618a;
                } finally {
                    Trace.INSTANCE.endSection(beginSection2);
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List<C13074a<C11921v>> list = this.sideEffects;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke();
                    }
                    this.sideEffects.clear();
                    C11921v vVar = C11921v.f18618a;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
        }

        public void forgetting(RememberObserver rememberObserver) {
            C12775o.m28639i(rememberObserver, "instance");
            int lastIndexOf = this.remembering.lastIndexOf(rememberObserver);
            if (lastIndexOf >= 0) {
                this.remembering.remove(lastIndexOf);
                this.abandoning.remove(rememberObserver);
                return;
            }
            this.forgetting.add(rememberObserver);
        }

        public void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            C12775o.m28639i(composeNodeLifecycleCallback, "instance");
            List list = this.releasing;
            if (list == null) {
                list = new ArrayList();
                this.releasing = list;
            }
            list.add(composeNodeLifecycleCallback);
        }

        public void remembering(RememberObserver rememberObserver) {
            C12775o.m28639i(rememberObserver, "instance");
            int lastIndexOf = this.forgetting.lastIndexOf(rememberObserver);
            if (lastIndexOf >= 0) {
                this.forgetting.remove(lastIndexOf);
                this.abandoning.remove(rememberObserver);
                return;
            }
            this.remembering.add(rememberObserver);
        }

        public void sideEffect(C13074a<C11921v> aVar) {
            C12775o.m28639i(aVar, "effect");
            this.sideEffects.add(aVar);
        }
    }

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier2, C12079g gVar) {
        C12775o.m28639i(compositionContext, "parent");
        C12775o.m28639i(applier2, "applier");
        this.parent = compositionContext;
        this.applier = applier2;
        this.pendingModifications = new AtomicReference<>((Object) null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable2 = new SlotTable();
        this.slotTable = slotTable2;
        this.observations = new IdentityScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new IdentityScopeMap<>();
        ArrayList arrayList = new ArrayList();
        this.changes = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.lateChanges = arrayList2;
        this.observationsProcessed = new IdentityScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, (DefaultConstructorMarker) null);
        ComposerImpl composerImpl = new ComposerImpl(applier2, compositionContext, slotTable2, hashSet, arrayList, arrayList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = gVar;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m35267getLambda1$runtime_release();
    }

    private final void abandonChanges() {
        this.pendingModifications.set((Object) null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00a8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            java.util.Iterator r3 = r17.iterator()
        L_0x000d:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r3.next()
            boolean r7 = r4 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r7 == 0) goto L_0x0022
            androidx.compose.runtime.RecomposeScopeImpl r4 = (androidx.compose.runtime.RecomposeScopeImpl) r4
            r4.invalidateForResult(r5)
            goto L_0x000d
        L_0x0022:
            addPendingInvalidationsLocked$invalidate(r0, r1, r2, r4)
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.DerivedState<?>> r5 = r0.derivedStates
            int r4 = r5.find(r4)
            if (r4 < 0) goto L_0x000d
            androidx.compose.runtime.collection.IdentityArraySet r4 = r5.scopeSetAt(r4)
            int r5 = r4.size()
            r6 = 0
        L_0x0036:
            if (r6 >= r5) goto L_0x000d
            java.lang.Object r7 = r4.get(r6)
            androidx.compose.runtime.DerivedState r7 = (androidx.compose.runtime.DerivedState) r7
            addPendingInvalidationsLocked$invalidate(r0, r1, r2, r7)
            int r6 = r6 + 1
            goto L_0x0036
        L_0x0044:
            java.lang.String r3 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            if (r1 == 0) goto L_0x0105
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.conditionallyInvalidatedScopes
            boolean r1 = r1.isEmpty()
            r4 = 1
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0105
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.observations
            int r7 = r1.getSize()
            r8 = 0
            r9 = 0
        L_0x005a:
            if (r8 >= r7) goto L_0x00e1
            int[] r10 = r1.getValueOrder()
            r10 = r10[r8]
            androidx.compose.runtime.collection.IdentityArraySet[] r11 = r1.getScopeSets()
            r11 = r11[r10]
            kotlin.jvm.internal.C12775o.m28636f(r11)
            int r12 = r11.size()
            r13 = 0
            r14 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x00ac
            java.lang.Object[] r15 = r11.getValues()
            r15 = r15[r13]
            kotlin.jvm.internal.C12775o.m28637g(r15, r3)
            r6 = r15
            androidx.compose.runtime.RecomposeScopeImpl r6 = (androidx.compose.runtime.RecomposeScopeImpl) r6
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r5 = r0.conditionallyInvalidatedScopes
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x009b
            T r5 = r2.f20403b
            java.util.HashSet r5 = (java.util.HashSet) r5
            if (r5 == 0) goto L_0x0095
            boolean r5 = r5.contains(r6)
            if (r5 != r4) goto L_0x0095
            r5 = r4
            goto L_0x0096
        L_0x0095:
            r5 = 0
        L_0x0096:
            if (r5 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r5 = 0
            goto L_0x009c
        L_0x009b:
            r5 = r4
        L_0x009c:
            if (r5 != 0) goto L_0x00a8
            if (r14 == r13) goto L_0x00a6
            java.lang.Object[] r5 = r11.getValues()
            r5[r14] = r15
        L_0x00a6:
            int r14 = r14 + 1
        L_0x00a8:
            int r13 = r13 + 1
            r5 = 0
            goto L_0x0071
        L_0x00ac:
            int r5 = r11.size()
            r6 = r14
        L_0x00b1:
            if (r6 >= r5) goto L_0x00bd
            java.lang.Object[] r12 = r11.getValues()
            r13 = 0
            r12[r6] = r13
            int r6 = r6 + 1
            goto L_0x00b1
        L_0x00bd:
            r11.setSize(r14)
            int r5 = r11.size()
            if (r5 <= 0) goto L_0x00dc
            if (r9 == r8) goto L_0x00da
            int[] r5 = r1.getValueOrder()
            r5 = r5[r9]
            int[] r6 = r1.getValueOrder()
            r6[r9] = r10
            int[] r6 = r1.getValueOrder()
            r6[r8] = r5
        L_0x00da:
            int r9 = r9 + 1
        L_0x00dc:
            int r8 = r8 + 1
            r5 = 0
            goto L_0x005a
        L_0x00e1:
            int r2 = r1.getSize()
            r3 = r9
        L_0x00e6:
            if (r3 >= r2) goto L_0x00f8
            java.lang.Object[] r4 = r1.getValues()
            int[] r5 = r1.getValueOrder()
            r5 = r5[r3]
            r6 = 0
            r4[r5] = r6
            int r3 = r3 + 1
            goto L_0x00e6
        L_0x00f8:
            r1.setSize(r9)
            r16.cleanUpDerivedStateObservations()
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.conditionallyInvalidatedScopes
            r1.clear()
            goto L_0x019b
        L_0x0105:
            T r1 = r2.f20403b
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 == 0) goto L_0x019b
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.RecomposeScopeImpl> r2 = r0.observations
            int r4 = r2.getSize()
            r5 = 0
            r6 = 0
        L_0x0113:
            if (r5 >= r4) goto L_0x017e
            int[] r7 = r2.getValueOrder()
            r7 = r7[r5]
            androidx.compose.runtime.collection.IdentityArraySet[] r8 = r2.getScopeSets()
            r8 = r8[r7]
            kotlin.jvm.internal.C12775o.m28636f(r8)
            int r9 = r8.size()
            r10 = 0
            r11 = 0
        L_0x012a:
            if (r10 >= r9) goto L_0x014b
            java.lang.Object[] r12 = r8.getValues()
            r12 = r12[r10]
            kotlin.jvm.internal.C12775o.m28637g(r12, r3)
            r13 = r12
            androidx.compose.runtime.RecomposeScopeImpl r13 = (androidx.compose.runtime.RecomposeScopeImpl) r13
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L_0x0148
            if (r11 == r10) goto L_0x0146
            java.lang.Object[] r13 = r8.getValues()
            r13[r11] = r12
        L_0x0146:
            int r11 = r11 + 1
        L_0x0148:
            int r10 = r10 + 1
            goto L_0x012a
        L_0x014b:
            int r9 = r8.size()
            r10 = r11
        L_0x0150:
            if (r10 >= r9) goto L_0x015c
            java.lang.Object[] r12 = r8.getValues()
            r13 = 0
            r12[r10] = r13
            int r10 = r10 + 1
            goto L_0x0150
        L_0x015c:
            r8.setSize(r11)
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x017b
            if (r6 == r5) goto L_0x0179
            int[] r8 = r2.getValueOrder()
            r8 = r8[r6]
            int[] r9 = r2.getValueOrder()
            r9[r6] = r7
            int[] r7 = r2.getValueOrder()
            r7[r5] = r8
        L_0x0179:
            int r6 = r6 + 1
        L_0x017b:
            int r5 = r5 + 1
            goto L_0x0113
        L_0x017e:
            int r1 = r2.getSize()
            r3 = r6
        L_0x0183:
            if (r3 >= r1) goto L_0x0195
            java.lang.Object[] r4 = r2.getValues()
            int[] r5 = r2.getValueOrder()
            r5 = r5[r3]
            r7 = 0
            r4[r5] = r7
            int r3 = r3 + 1
            goto L_0x0183
        L_0x0195:
            r2.setSize(r6)
            r16.cleanUpDerivedStateObservations()
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    private static final void addPendingInvalidationsLocked$invalidate(CompositionImpl compositionImpl, boolean z, Ref$ObjectRef<HashSet<RecomposeScopeImpl>> ref$ObjectRef, Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = compositionImpl.observations;
        int access$find = identityScopeMap.find(obj);
        if (access$find >= 0) {
            IdentityArraySet access$scopeSetAt = identityScopeMap.scopeSetAt(access$find);
            int size = access$scopeSetAt.size();
            for (int i = 0; i < size; i++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) access$scopeSetAt.get(i);
                if (!compositionImpl.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.isConditional() || z) {
                        T t = (HashSet) ref$ObjectRef.f20403b;
                        if (t == null) {
                            t = new HashSet();
                            ref$ObjectRef.f20403b = t;
                        }
                        t.add(recomposeScopeImpl);
                    } else {
                        compositionImpl.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                    }
                }
            }
        }
    }

    private final void applyChangesInLocked(List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list) {
        SlotWriter openWriter;
        Object beginSection;
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        try {
            if (!list.isEmpty()) {
                Object beginSection2 = Trace.INSTANCE.beginSection("Compose:applyChanges");
                try {
                    this.applier.onBeginChanges();
                    openWriter = this.slotTable.openWriter();
                    Applier<?> applier2 = this.applier;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke(applier2, openWriter, rememberEventDispatcher);
                    }
                    list.clear();
                    C11921v vVar = C11921v.f18618a;
                    openWriter.close();
                    this.applier.onEndChanges();
                    Trace trace = Trace.INSTANCE;
                    trace.endSection(beginSection2);
                    rememberEventDispatcher.dispatchRememberObservers();
                    rememberEventDispatcher.dispatchNodeCallbacks();
                    rememberEventDispatcher.dispatchSideEffects();
                    if (this.pendingInvalidScopes) {
                        beginSection = trace.beginSection("Compose:unobserve");
                        this.pendingInvalidScopes = false;
                        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
                        int size2 = identityScopeMap.getSize();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size2; i3++) {
                            int i4 = identityScopeMap.getValueOrder()[i3];
                            IdentityArraySet identityArraySet = identityScopeMap.getScopeSets()[i4];
                            C12775o.m28636f(identityArraySet);
                            int size3 = identityArraySet.size();
                            int i5 = 0;
                            for (int i6 = 0; i6 < size3; i6++) {
                                Object obj = identityArraySet.getValues()[i6];
                                C12775o.m28637g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                if (!(!((RecomposeScopeImpl) obj).getValid())) {
                                    if (i5 != i6) {
                                        identityArraySet.getValues()[i5] = obj;
                                    }
                                    i5++;
                                }
                            }
                            int size4 = identityArraySet.size();
                            for (int i7 = i5; i7 < size4; i7++) {
                                identityArraySet.getValues()[i7] = null;
                            }
                            identityArraySet.setSize(i5);
                            if (identityArraySet.size() > 0) {
                                if (i2 != i3) {
                                    int i8 = identityScopeMap.getValueOrder()[i2];
                                    identityScopeMap.getValueOrder()[i2] = i4;
                                    identityScopeMap.getValueOrder()[i3] = i8;
                                }
                                i2++;
                            }
                        }
                        int size5 = identityScopeMap.getSize();
                        for (int i9 = i2; i9 < size5; i9++) {
                            identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i9]] = null;
                        }
                        identityScopeMap.setSize(i2);
                        cleanUpDerivedStateObservations();
                        C11921v vVar2 = C11921v.f18618a;
                        Trace.INSTANCE.endSection(beginSection);
                    }
                    if (this.lateChanges.isEmpty()) {
                        rememberEventDispatcher.dispatchAbandons();
                    }
                } catch (Throwable th) {
                    Trace.INSTANCE.endSection(beginSection2);
                    throw th;
                }
            } else if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher.dispatchAbandons();
            }
        } catch (Throwable th2) {
            if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher.dispatchAbandons();
            }
            throw th2;
        }
    }

    private final void cleanUpDerivedStateObservations() {
        IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
        int size = identityScopeMap.getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = identityScopeMap.getValueOrder()[i2];
            IdentityArraySet identityArraySet = identityScopeMap.getScopeSets()[i3];
            C12775o.m28636f(identityArraySet);
            int size2 = identityArraySet.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size2; i5++) {
                Object obj = identityArraySet.getValues()[i5];
                C12775o.m28637g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.observations.contains((DerivedState) obj))) {
                    if (i4 != i5) {
                        identityArraySet.getValues()[i4] = obj;
                    }
                    i4++;
                }
            }
            int size3 = identityArraySet.size();
            for (int i6 = i4; i6 < size3; i6++) {
                identityArraySet.getValues()[i6] = null;
            }
            identityArraySet.setSize(i4);
            if (identityArraySet.size() > 0) {
                if (i != i2) {
                    int i7 = identityScopeMap.getValueOrder()[i];
                    identityScopeMap.getValueOrder()[i] = i3;
                    identityScopeMap.getValueOrder()[i2] = i7;
                }
                i++;
            }
        }
        int size4 = identityScopeMap.getSize();
        for (int i8 = i; i8 < size4; i8++) {
            identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i8]] = null;
        }
        identityScopeMap.setSize(i);
        Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
        C12775o.m28638h(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().isConditional()) {
                it.remove();
            }
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet == null) {
            return;
        }
        if (C12775o.m28634d(andSet, CompositionKt.PendingApplyNoModifications)) {
            ComposerKt.composeRuntimeError("pending composition has not been applied");
            throw new KotlinNothingValueException();
        } else if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set addPendingInvalidationsLocked : (Set[]) andSet) {
                addPendingInvalidationsLocked(addPendingInvalidationsLocked, true);
            }
        } else {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet((Object) null);
        if (C12775o.m28634d(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set addPendingInvalidationsLocked : (Set[]) andSet) {
                addPendingInvalidationsLocked(addPendingInvalidationsLocked, false);
            }
        } else if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        } else {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    private final <T> T guardChanges(C13074a<? extends T> aVar) {
        try {
            T invoke = aVar.invoke();
            C12773m.m28629b(1);
            C12773m.m28628a(1);
            return invoke;
        } catch (Exception e) {
            abandonChanges();
            throw e;
        } catch (Throwable th) {
            C12773m.m28629b(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            C12773m.m28628a(1);
            throw th;
        }
    }

    private final <T> T guardInvalidationsLocked(Function1<? super IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>>, ? extends T> function1) {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
        try {
            return function1.invoke(takeInvalidations);
        } catch (Exception e) {
            this.invalidations = takeInvalidations;
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        return r1.invalidateChecked(r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r5.parent.invalidate$runtime_release(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (isComposing() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return androidx.compose.runtime.InvalidationResult.SCHEDULED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return androidx.compose.runtime.InvalidationResult.DEFERRED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.InvalidationResult invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl r6, androidx.compose.runtime.Anchor r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            androidx.compose.runtime.CompositionImpl r1 = r5.invalidationDelegate     // Catch:{ all -> 0x004e }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            androidx.compose.runtime.SlotTable r3 = r5.slotTable     // Catch:{ all -> 0x004e }
            int r4 = r5.invalidationDelegateGroup     // Catch:{ all -> 0x004e }
            boolean r3 = r3.groupContainsAnchor(r4, r7)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 != 0) goto L_0x0035
            boolean r3 = r5.isComposing()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0028
            androidx.compose.runtime.ComposerImpl r3 = r5.composer     // Catch:{ all -> 0x004e }
            boolean r3 = r3.tryImminentInvalidation$runtime_release(r6, r8)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0028
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.IMMINENT     // Catch:{ all -> 0x004e }
            monitor-exit(r0)
            return r6
        L_0x0028:
            if (r8 != 0) goto L_0x0030
            androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> r3 = r5.invalidations     // Catch:{ all -> 0x004e }
            r3.set(r6, r2)     // Catch:{ all -> 0x004e }
            goto L_0x0035
        L_0x0030:
            androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> r2 = r5.invalidations     // Catch:{ all -> 0x004e }
            androidx.compose.runtime.CompositionKt.addValue(r2, r6, r8)     // Catch:{ all -> 0x004e }
        L_0x0035:
            monitor-exit(r0)
            if (r1 == 0) goto L_0x003d
            androidx.compose.runtime.InvalidationResult r6 = r1.invalidateChecked(r6, r7, r8)
            return r6
        L_0x003d:
            androidx.compose.runtime.CompositionContext r6 = r5.parent
            r6.invalidate$runtime_release(r5)
            boolean r6 = r5.isComposing()
            if (r6 == 0) goto L_0x004b
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.DEFERRED
            goto L_0x004d
        L_0x004b:
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.SCHEDULED
        L_0x004d:
            return r6
        L_0x004e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.Anchor, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    private final void invalidateScopeOfLocked(Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int access$find = identityScopeMap.find(obj);
        if (access$find >= 0) {
            IdentityArraySet access$scopeSetAt = identityScopeMap.scopeSetAt(access$find);
            int size = access$scopeSetAt.size();
            for (int i = 0; i < size; i++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) access$scopeSetAt.get(i);
                if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(obj, recomposeScopeImpl);
                }
            }
        }
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, (DefaultConstructorMarker) null);
        return identityArrayMap;
    }

    private final <T> T trackAbandonedValues(C13074a<? extends T> aVar) {
        try {
            T invoke = aVar.invoke();
            C12773m.m28629b(1);
            C12773m.m28628a(1);
            return invoke;
        } catch (Throwable th) {
            C12773m.m28629b(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            C12773m.m28628a(1);
            throw th;
        }
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable2) {
        RecomposeScopeImpl recomposeScopeImpl;
        Object[] slots = slotTable2.getSlots();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : slots) {
            if (obj instanceof RecomposeScopeImpl) {
                recomposeScopeImpl = (RecomposeScopeImpl) obj;
            } else {
                recomposeScopeImpl = null;
            }
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor == null || slotTable2.slotsOf$runtime_release(anchor.toIndexFor(slotTable2)).contains(recomposeScopeImpl2)) {
                i++;
            } else {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + C12710p.m28389Q(slotTable2.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                C11921v vVar = C11921v.f18618a;
            } catch (Exception e) {
                abandonChanges();
                throw e;
            } catch (Throwable th) {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            }
        }
    }

    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (!this.lateChanges.isEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                C11921v vVar = C11921v.f18618a;
            } catch (Exception e) {
                abandonChanges();
                throw e;
            } catch (Throwable th) {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            }
        }
    }

    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                C11921v vVar = C11921v.f18618a;
            } catch (Exception e) {
                abandonChanges();
                throw e;
            } catch (Throwable th) {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            }
        }
    }

    public void composeContent(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "content");
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
                try {
                    this.composer.composeContent$runtime_release(takeInvalidations, oVar);
                    C11921v vVar = C11921v.f18618a;
                } catch (Exception e) {
                    this.invalidations = takeInvalidations;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            } catch (Exception e2) {
                abandonChanges();
                throw e2;
            }
        }
    }

    public <R> R delegateInvalidations(ControlledComposition controlledComposition, int i, C13074a<? extends R> aVar) {
        C12775o.m28639i(aVar, "block");
        if (controlledComposition == null || C12775o.m28634d(controlledComposition, this) || i < 0) {
            return aVar.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) controlledComposition;
        this.invalidationDelegateGroup = i;
        try {
            return aVar.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    /* JADX INFO: finally extract failed */
    public void dispose() {
        boolean z;
        synchronized (this.lock) {
            if (!this.disposed) {
                this.disposed = true;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.m35268getLambda2$runtime_release();
                List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                if (deferredChanges$runtime_release != null) {
                    applyChangesInLocked(deferredChanges$runtime_release);
                }
                if (this.slotTable.getGroupsSize() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || (true ^ this.abandonSet.isEmpty())) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z) {
                        SlotWriter openWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
                            C11921v vVar = C11921v.f18618a;
                            openWriter.close();
                            this.applier.clear();
                            rememberEventDispatcher.dispatchRememberObservers();
                            rememberEventDispatcher.dispatchNodeCallbacks();
                        } catch (Throwable th) {
                            openWriter.close();
                            throw th;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            C11921v vVar2 = C11921v.f18618a;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    /* JADX INFO: finally extract failed */
    public void disposeUnusedMovableContent(MovableContentState movableContentState) {
        C12775o.m28639i(movableContentState, "state");
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter openWriter = movableContentState.getSlotTable$runtime_release().openWriter();
        try {
            ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
            C11921v vVar = C11921v.f18618a;
            openWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
            rememberEventDispatcher.dispatchNodeCallbacks();
        } catch (Throwable th) {
            openWriter.close();
            throw th;
        }
    }

    public final C13088o<Composer, Integer, C11921v> getComposable() {
        return this.composable;
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return C12686e0.m28205B0(this.conditionallyInvalidatedScopes);
    }

    public final List<Object> getDerivedStateDependencies$runtime_release() {
        return C12710p.m28378F(this.derivedStates.getValues());
    }

    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            if (this.invalidations.getSize$runtime_release() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    public final List<Object> getObservedObjects$runtime_release() {
        return C12710p.m28378F(this.observations.getValues());
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    public final C12079g getRecomposeContext() {
        C12079g gVar = this._recomposeContext;
        if (gVar == null) {
            return this.parent.getRecomposeCoroutineContext$runtime_release();
        }
        return gVar;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    public void insertMovableContent(List<C11906l<MovableContentStateReference, MovableContentStateReference>> list) {
        C12775o.m28639i(list, "references");
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!C12775o.m28634d(((MovableContentStateReference) list.get(i).mo49111c()).getComposition$runtime_release(), this)) {
                break;
            } else {
                i++;
            }
        }
        ComposerKt.runtimeCheck(z);
        try {
            this.composer.insertMovableContentReferences(list);
            C11921v vVar = C11921v.f18618a;
        } catch (Exception e) {
            abandonChanges();
            throw e;
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            throw th;
        }
    }

    public final InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        C12775o.m28639i(recomposeScopeImpl, "scope");
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null || !this.slotTable.ownsAnchor(anchor) || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!recomposeScopeImpl.getCanRecompose()) {
            return InvalidationResult.IGNORED;
        }
        return invalidateChecked(recomposeScopeImpl, anchor, obj);
    }

    public void invalidateAll() {
        RecomposeScopeImpl recomposeScopeImpl;
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                if (obj instanceof RecomposeScopeImpl) {
                    recomposeScopeImpl = (RecomposeScopeImpl) obj;
                } else {
                    recomposeScopeImpl = null;
                }
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final void invalidateGroupsWithKey(int i) {
        List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release;
        boolean z;
        boolean z2;
        synchronized (this.lock) {
            invalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(i);
        }
        boolean z3 = true;
        if (invalidateGroupsWithKey$runtime_release != null) {
            int size = invalidateGroupsWithKey$runtime_release.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                if (invalidateGroupsWithKey$runtime_release.get(i2).invalidateForResult((Object) null) == InvalidationResult.IGNORED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                z3 = false;
            }
        }
        if (z3 && this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    public boolean isDisposed() {
        return this.disposed;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean observesAnyOf(java.util.Set<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r3.next()
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.RecomposeScopeImpl> r1 = r2.observations
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x0023
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.DerivedState<?>> r1 = r2.derivedStates
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0009
        L_0x0023:
            r3 = 1
            return r3
        L_0x0025:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    public void prepareCompose(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "block");
        this.composer.prepareCompose$runtime_release(aVar);
    }

    public boolean recompose() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations;
        boolean recompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            try {
                takeInvalidations = takeInvalidations();
                recompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations);
                if (!recompose$runtime_release) {
                    drainPendingModificationsLocked();
                }
            } catch (Exception e) {
                this.invalidations = takeInvalidations;
                throw e;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e2) {
                    abandonChanges();
                    throw e2;
                }
            }
        }
        return recompose$runtime_release;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void recordModificationsOf(java.util.Set<? extends java.lang.Object> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
        L_0x0005:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r5.pendingModifications
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L_0x0010
            r2 = r1
            goto L_0x0018
        L_0x0010:
            java.lang.Object r2 = androidx.compose.runtime.CompositionKt.PendingApplyNoModifications
            boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r0, r2)
        L_0x0018:
            if (r2 == 0) goto L_0x001c
            r2 = r6
            goto L_0x003c
        L_0x001c:
            boolean r2 = r0 instanceof java.util.Set
            if (r2 == 0) goto L_0x002c
            r2 = 2
            java.util.Set[] r2 = new java.util.Set[r2]
            r3 = 0
            r4 = r0
            java.util.Set r4 = (java.util.Set) r4
            r2[r3] = r4
            r2[r1] = r6
            goto L_0x003c
        L_0x002c:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            kotlin.jvm.internal.C12775o.m28637g(r0, r1)
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            java.lang.Object[] r2 = kotlin.collections.C12708o.m28358y(r1, r6)
        L_0x003c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r5.pendingModifications
            boolean r1 = androidx.compose.animation.core.C0344a.m496a(r1, r0, r2)
            if (r1 == 0) goto L_0x0005
            if (r0 != 0) goto L_0x0053
            java.lang.Object r6 = r5.lock
            monitor-enter(r6)
            r5.drainPendingModificationsLocked()     // Catch:{ all -> 0x0050 }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0050 }
            monitor-exit(r6)
            goto L_0x0053
        L_0x0050:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0053:
            return
        L_0x0054:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "corrupt pendingModifications: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r5.pendingModifications
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.recordModificationsOf(java.util.Set):void");
    }

    public void recordReadOf(Object obj) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        C12775o.m28639i(obj, "value");
        if (!getAreChildrenComposing() && (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) != null) {
            currentRecomposeScope$runtime_release.setUsed(true);
            this.observations.add(obj, currentRecomposeScope$runtime_release);
            if (obj instanceof DerivedState) {
                this.derivedStates.removeScope(obj);
                for (Object obj2 : ((DerivedState) obj).getDependencies()) {
                    if (obj2 == null) {
                        break;
                    }
                    this.derivedStates.add(obj2, obj);
                }
            }
            currentRecomposeScope$runtime_release.recordRead(obj);
        }
    }

    public void recordWriteOf(Object obj) {
        C12775o.m28639i(obj, "value");
        synchronized (this.lock) {
            invalidateScopeOfLocked(obj);
            IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
            int access$find = identityScopeMap.find(obj);
            if (access$find >= 0) {
                IdentityArraySet access$scopeSetAt = identityScopeMap.scopeSetAt(access$find);
                int size = access$scopeSetAt.size();
                for (int i = 0; i < size; i++) {
                    invalidateScopeOfLocked((DerivedState) access$scopeSetAt.get(i));
                }
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> derivedState) {
        C12775o.m28639i(derivedState, "state");
        if (!this.observations.contains(derivedState)) {
            this.derivedStates.removeScope(derivedState);
        }
    }

    public final void removeObservation$runtime_release(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        C12775o.m28639i(obj, "instance");
        C12775o.m28639i(recomposeScopeImpl, "scope");
        this.observations.remove(obj, recomposeScopeImpl);
    }

    public final void setComposable(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "<set-?>");
        this.composable = oVar;
    }

    public void setContent(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "content");
        if (!this.disposed) {
            this.composable = oVar;
            this.parent.composeInitial$runtime_release(this, oVar);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime_release();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier2, C12079g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier2, (i & 4) != 0 ? null : gVar);
    }
}
