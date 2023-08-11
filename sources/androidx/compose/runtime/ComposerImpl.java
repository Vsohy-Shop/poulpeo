package androidx.compose.runtime;

import androidx.compose.runtime.GroupKind;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 7 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 8 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 9 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 10 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4528:1\n3212#1,4:4567\n3222#1,6:4587\n3212#1,6:4593\n3229#1,2:4599\n3217#1:4605\n3212#1,6:4673\n1#2:4529\n146#3,8:4530\n146#3,8:4575\n146#3,4:4583\n151#3,3:4601\n162#3,8:4661\n146#3,4:4669\n151#3,3:4679\n46#4,5:4538\n46#4,3:4636\n50#4:4642\n4513#5,5:4543\n4513#5,5:4548\n309#5:4553\n4513#5,5:4557\n4513#5,5:4562\n4513#5,5:4616\n4513#5,5:4621\n4513#5,5:4626\n4513#5,5:4631\n4513#5,5:4646\n4513#5,5:4651\n4513#5,5:4656\n4513#5,5:4682\n4513#5,5:4687\n4513#5,5:4692\n4513#5,5:4697\n4443#6:4554\n4444#6:4555\n26#7:4556\n26#7:4702\n22#7:4703\n33#8,4:4571\n38#8:4604\n33#8,4:4606\n38#8:4615\n82#8,3:4704\n33#8,4:4707\n85#8,2:4711\n38#8:4713\n87#8:4714\n105#9,5:4610\n146#10,3:4639\n150#10:4643\n1002#11,2:4644\n1855#11,2:4715\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n3053#1:4567,4\n3166#1:4587,6\n3172#1:4593,6\n3166#1:4599,2\n3053#1:4605\n3770#1:4673,6\n1300#1:4530,8\n3081#1:4575,8\n3165#1:4583,4\n3165#1:4601,3\n3737#1:4661,8\n3768#1:4669,4\n3768#1:4679,3\n1540#1:4538,5\n3339#1:4636,3\n3339#1:4642\n1609#1:4543,5\n1636#1:4548,5\n1987#1:4553\n2770#1:4557,5\n2783#1:4562,5\n3297#1:4616,5\n3302#1:4621,5\n3318#1:4626,5\n3338#1:4631,5\n3405#1:4646,5\n3412#1:4651,5\n3549#1:4656,5\n3817#1:4682,5\n3833#1:4687,5\n3834#1:4692,5\n3862#1:4697,5\n2146#1:4554\n2170#1:4555\n2694#1:4556\n4057#1:4702\n4073#1:4703\n3055#1:4571,4\n3055#1:4604\n3248#1:4606,4\n3248#1:4615\n3641#1:4704,3\n3641#1:4707,4\n3641#1:4711,2\n3641#1:4713\n3641#1:4714\n3250#1:4610,5\n3343#1:4639,3\n3343#1:4643\n3347#1:4644,2\n3677#1:4715,2\n*E\n"})
/* compiled from: Composer.kt */
public final class ComposerImpl implements Composer {
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    /* access modifiers changed from: private */
    public List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> changes;
    /* access modifiers changed from: private */
    public int childrenComposing;
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;
    private List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> deferredChanges;
    private Stack<Object> downNodes;
    private final IntStack entersStack = new IntStack();
    private boolean forceRecomposeScopes;
    /* access modifiers changed from: private */
    public boolean forciblyRecompose;
    private int groupNodeCount;
    private IntStack groupNodeCountStack = new IntStack();
    private boolean implicitRootStart;
    private Anchor insertAnchor;
    private final List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> insertFixups;
    private SlotTable insertTable;
    private final Stack<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> insertUpFixups;
    private boolean inserting;
    private final Stack<RecomposeScopeImpl> invalidateStack = new Stack<>();
    private final List<Invalidation> invalidations = new ArrayList();
    private boolean isComposing;
    private boolean isDisposed;
    private List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> lateChanges;
    /* access modifiers changed from: private */
    public int[] nodeCountOverrides;
    private HashMap<Integer, Integer> nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private IntStack nodeIndexStack = new IntStack();
    /* access modifiers changed from: private */
    public final CompositionContext parentContext;
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentProvider = ExtensionsKt.persistentHashMapOf();
    private Pending pending;
    private final Stack<Pending> pendingStack = new Stack<>();
    private int pendingUps;
    private int previousCount;
    private int previousMoveFrom;
    private int previousMoveTo;
    private int previousRemove;
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> providerCache;
    private final IntMap<PersistentMap<CompositionLocal<Object>, State<Object>>> providerUpdates = new IntMap<>(0, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public boolean providersInvalid;
    private final IntStack providersInvalidStack = new IntStack();
    /* access modifiers changed from: private */
    public SlotReader reader;
    private boolean reusing;
    private int reusingGroup = -1;
    /* access modifiers changed from: private */
    public final SlotTable slotTable;
    private Snapshot snapshot = SnapshotKt.currentSnapshot();
    private boolean sourceInformationEnabled = true;
    private boolean startedGroup;
    private final IntStack startedGroups;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private int writersReaderDelta;

    /* JADX INFO: finally extract failed */
    public ComposerImpl(Applier<?> applier2, CompositionContext compositionContext, SlotTable slotTable2, Set<RememberObserver> set, List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list, List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list2, ControlledComposition controlledComposition) {
        C12775o.m28639i(applier2, "applier");
        C12775o.m28639i(compositionContext, "parentContext");
        C12775o.m28639i(slotTable2, "slotTable");
        C12775o.m28639i(set, "abandonSet");
        C12775o.m28639i(list, "changes");
        C12775o.m28639i(list2, "lateChanges");
        C12775o.m28639i(controlledComposition, "composition");
        this.applier = applier2;
        this.parentContext = compositionContext;
        this.slotTable = slotTable2;
        this.abandonSet = set;
        this.changes = list;
        this.lateChanges = list2;
        this.composition = controlledComposition;
        SlotReader openReader = slotTable2.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable3 = new SlotTable();
        this.insertTable = slotTable3;
        SlotWriter openWriter = slotTable3.openWriter();
        openWriter.close();
        this.writer = openWriter;
        SlotReader openReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new ArrayList();
            this.downNodes = new Stack<>();
            this.implicitRootStart = true;
            this.startedGroups = new IntStack();
            this.insertUpFixups = new Stack<>();
            this.previousRemove = -1;
            this.previousMoveFrom = -1;
            this.previousMoveTo = -1;
        } catch (Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates.clear();
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (!this.writer.getClosed()) {
            this.writer.close();
        }
        createFreshInsertTable();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
    }

    private final void addRecomposeScope() {
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (getInserting()) {
            ControlledComposition composition2 = getComposition();
            C12775o.m28637g(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) composition2);
            this.invalidateStack.push(recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            recomposeScopeImpl2.start(this.compositionToken);
            return;
        }
        Invalidation access$removeLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
        Object next = this.reader.next();
        if (C12775o.m28634d(next, Composer.Companion.getEmpty())) {
            ControlledComposition composition3 = getComposition();
            C12775o.m28637g(composition3, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) composition3);
            updateValue(recomposeScopeImpl);
        } else {
            C12775o.m28637g(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl = (RecomposeScopeImpl) next;
        }
        if (access$removeLocation != null) {
            z = true;
        } else {
            z = false;
        }
        recomposeScopeImpl.setRequiresRecompose(z);
        this.invalidateStack.push(recomposeScopeImpl);
        recomposeScopeImpl.start(this.compositionToken);
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.clear();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int i, int i2, int i3) {
        if (i == i2) {
            return i3;
        }
        int groupCompoundKeyPart = groupCompoundKeyPart(this.reader, i);
        if (groupCompoundKeyPart == 126665345) {
            return groupCompoundKeyPart;
        }
        return Integer.rotateLeft(compoundKeyOf(this.reader.parent(i), i2, i3), 3) ^ groupCompoundKeyPart;
    }

    private final void createFreshInsertTable() {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close();
        this.writer = openWriter;
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope() {
        PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap = this.providerCache;
        if (persistentMap != null) {
            return persistentMap;
        }
        return currentCompositionLocalScope(this.reader.getParent());
    }

    private final void doCompose(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        if (!this.isComposing) {
            Object beginSection = Trace.INSTANCE.beginSection("Compose:recompose");
            try {
                Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
                this.snapshot = currentSnapshot;
                this.compositionToken = currentSnapshot.getId();
                this.providerUpdates.clear();
                int size$runtime_release = identityArrayMap.getSize$runtime_release();
                int i = 0;
                while (i < size$runtime_release) {
                    Object obj = identityArrayMap.getKeys$runtime_release()[i];
                    C12775o.m28637g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    IdentityArraySet identityArraySet = (IdentityArraySet) identityArrayMap.getValues$runtime_release()[i];
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    Anchor anchor = recomposeScopeImpl.getAnchor();
                    if (anchor != null) {
                        this.invalidations.add(new Invalidation(recomposeScopeImpl, anchor.getLocation$runtime_release(), identityArraySet));
                        i++;
                    } else {
                        Trace.INSTANCE.endSection(beginSection);
                        return;
                    }
                }
                List<Invalidation> list = this.invalidations;
                if (list.size() > 1) {
                    C12664a0.m28170A(list, new ComposerImpl$doCompose$lambda$37$$inlined$sortBy$1());
                }
                this.nodeIndex = 0;
                this.isComposing = true;
                startRoot();
                Object nextSlot = nextSlot();
                if (!(nextSlot == oVar || oVar == null)) {
                    updateValue(oVar);
                }
                SnapshotStateKt.observeDerivedStateRecalculations(new ComposerImpl$doCompose$2$3(this), new ComposerImpl$doCompose$2$4(this), new ComposerImpl$doCompose$2$5(oVar, this, nextSlot));
                endRoot();
                this.isComposing = false;
                this.invalidations.clear();
                C11921v vVar = C11921v.f18618a;
                Trace.INSTANCE.endSection(beginSection);
            } catch (Throwable th) {
                Trace.INSTANCE.endSection(beginSection);
                throw th;
            }
        } else {
            ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void doRecordDownsFor(int i, int i2) {
        if (i > 0 && i != i2) {
            doRecordDownsFor(this.reader.parent(i), i2);
            if (this.reader.isNode(i)) {
                recordDown(nodeAt(this.reader, i));
            }
        }
    }

    private final void end(boolean z) {
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i = this.groupNodeCount;
        Pending pending2 = this.pending;
        int i2 = 0;
        if (pending2 != null && pending2.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending2.getKeyInfos();
            List<KeyInfo> used = pending2.getUsed();
            Set<T> fastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size2) {
                KeyInfo keyInfo = keyInfos.get(i3);
                if (!fastToSet.contains(keyInfo)) {
                    recordRemoveNode(pending2.nodePositionOf(keyInfo) + pending2.getStartIndex(), keyInfo.getNodes());
                    pending2.updateNodeCount(keyInfo.getLocation(), i2);
                    recordReaderMoving(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else if (!linkedHashSet.contains(keyInfo)) {
                    if (i4 < size) {
                        KeyInfo keyInfo2 = used.get(i4);
                        if (keyInfo2 != keyInfo) {
                            int nodePositionOf = pending2.nodePositionOf(keyInfo2);
                            linkedHashSet.add(keyInfo2);
                            if (nodePositionOf != i5) {
                                int updatedNodeCountOf = pending2.updatedNodeCountOf(keyInfo2);
                                list = used;
                                recordMoveNode(pending2.getStartIndex() + nodePositionOf, i5 + pending2.getStartIndex(), updatedNodeCountOf);
                                pending2.registerMoveNode(nodePositionOf, i5, updatedNodeCountOf);
                            } else {
                                list = used;
                            }
                        } else {
                            list = used;
                            i3++;
                        }
                        i4++;
                        i5 += pending2.updatedNodeCountOf(keyInfo2);
                        used = list;
                    }
                    i2 = 0;
                }
                i3++;
                i2 = 0;
            }
            realizeMovement();
            if (keyInfos.size() > 0) {
                recordReaderMoving(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i6 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            recordRemoveNode(i6, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting2 = getInserting();
        if (inserting2) {
            if (z) {
                registerInsertUpFixup();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (z) {
                recordUp();
            }
            recordEndGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (z) {
                i = 1;
            }
            this.reader.endGroup();
            realizeMovement();
        }
        exitGroup(i, inserting2);
    }

    /* access modifiers changed from: private */
    public final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        recordEndRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean z, Pending pending2) {
        this.pendingStack.push(this.pending);
        this.pending = pending2;
        this.nodeIndexStack.push(this.nodeIndex);
        if (z) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int i, boolean z) {
        Pending pop = this.pendingStack.pop();
        if (pop != null && !z) {
            pop.setGroupIndex(pop.getGroupIndex() + 1);
        }
        this.pending = pop;
        this.nodeIndex = this.nodeIndexStack.pop() + i;
        this.groupNodeCount = this.groupNodeCountStack.pop() + i;
    }

    private final void finalizeCompose() {
        realizeUps();
        if (!this.pendingStack.isEmpty()) {
            ComposerKt.composeRuntimeError("Start/end imbalance".toString());
            throw new KotlinNothingValueException();
        } else if (this.startedGroups.isEmpty()) {
            cleanUpCompose();
        } else {
            ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i) {
        Object groupAux;
        if (slotReader.hasObjectKey(i)) {
            Object groupObjectKey = slotReader.groupObjectKey(i);
            if (groupObjectKey == null) {
                return 0;
            }
            if (groupObjectKey instanceof Enum) {
                return ((Enum) groupObjectKey).ordinal();
            }
            if (groupObjectKey instanceof MovableContent) {
                return MovableContentKt.movableContentKey;
            }
            return groupObjectKey.hashCode();
        }
        int groupKey = slotReader.groupKey(i);
        if (groupKey == 207 && (groupAux = slotReader.groupAux(i)) != null && !C12775o.m28634d(groupAux, Composer.Companion.getEmpty())) {
            groupKey = groupAux.hashCode();
        }
        return groupKey;
    }

    private final void insertMovableContentGuarded(List<C11906l<MovableContentStateReference, MovableContentStateReference>> list) {
        SlotTable slotTable2;
        Anchor anchor;
        SlotReader access$getReader$p;
        int[] access$getNodeCountOverrides$p;
        List list2;
        SlotTable slotTable$runtime_release;
        SlotReader openReader;
        List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list3 = this.lateChanges;
        List access$getChanges$p = this.changes;
        try {
            this.changes = list3;
            record(ComposerKt.resetSlotsInstance);
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                C11906l lVar = list.get(i2);
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) lVar.mo49109a();
                MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) lVar.mo49110b();
                Anchor anchor$runtime_release = movableContentStateReference.getAnchor$runtime_release();
                int anchorIndex = movableContentStateReference.getSlotTable$runtime_release().anchorIndex(anchor$runtime_release);
                C12760f0 f0Var = new C12760f0();
                realizeUps();
                record(new ComposerImpl$insertMovableContentGuarded$1$1$1(f0Var, anchor$runtime_release));
                if (movableContentStateReference2 == null) {
                    if (C12775o.m28634d(movableContentStateReference.getSlotTable$runtime_release(), this.insertTable)) {
                        createFreshInsertTable();
                    }
                    openReader = movableContentStateReference.getSlotTable$runtime_release().openReader();
                    openReader.reposition(anchorIndex);
                    this.writersReaderDelta = anchorIndex;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = arrayList;
                    recomposeMovableContent$default(this, (ControlledComposition) null, (ControlledComposition) null, (Integer) null, (List) null, new ComposerImpl$insertMovableContentGuarded$1$1$2$1(this, arrayList, openReader, movableContentStateReference), 15, (Object) null);
                    if (!arrayList2.isEmpty()) {
                        record(new ComposerImpl$insertMovableContentGuarded$1$1$2$2(f0Var, arrayList2));
                    }
                    C11921v vVar = C11921v.f18618a;
                    openReader.close();
                } else {
                    MovableContentState movableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReference2);
                    if (movableContentStateResolve$runtime_release == null || (slotTable2 = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null) {
                        slotTable2 = movableContentStateReference2.getSlotTable$runtime_release();
                    }
                    if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null || (anchor = slotTable$runtime_release.anchor(i)) == null) {
                        anchor = movableContentStateReference2.getAnchor$runtime_release();
                    }
                    List access$collectNodesFrom = ComposerKt.collectNodesFrom(slotTable2, anchor);
                    if (!access$collectNodesFrom.isEmpty()) {
                        record(new ComposerImpl$insertMovableContentGuarded$1$1$3(f0Var, access$collectNodesFrom));
                        if (C12775o.m28634d(movableContentStateReference.getSlotTable$runtime_release(), this.slotTable)) {
                            int anchorIndex2 = this.slotTable.anchorIndex(anchor$runtime_release);
                            updateNodeCount(anchorIndex2, updatedNodeCount(anchorIndex2) + access$collectNodesFrom.size());
                        }
                    }
                    record(new ComposerImpl$insertMovableContentGuarded$1$1$4(movableContentStateResolve$runtime_release, this, movableContentStateReference2, movableContentStateReference));
                    SlotReader openReader2 = slotTable2.openReader();
                    try {
                        access$getReader$p = this.reader;
                        access$getNodeCountOverrides$p = this.nodeCountOverrides;
                        this.nodeCountOverrides = null;
                        this.reader = openReader2;
                        int anchorIndex3 = slotTable2.anchorIndex(anchor);
                        openReader2.reposition(anchorIndex3);
                        this.writersReaderDelta = anchorIndex3;
                        ArrayList arrayList3 = new ArrayList();
                        List access$getChanges$p2 = this.changes;
                        try {
                            this.changes = arrayList3;
                            list2 = access$getChanges$p2;
                            ArrayList arrayList4 = arrayList3;
                            try {
                                recomposeMovableContent(movableContentStateReference2.getComposition$runtime_release(), movableContentStateReference.getComposition$runtime_release(), Integer.valueOf(openReader2.getCurrentGroup()), movableContentStateReference2.getInvalidations$runtime_release(), new ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1(this, movableContentStateReference));
                                C11921v vVar2 = C11921v.f18618a;
                                this.changes = list2;
                                if (!arrayList4.isEmpty()) {
                                    record(new ComposerImpl$insertMovableContentGuarded$1$1$5$1$2(f0Var, arrayList4));
                                }
                                this.reader = access$getReader$p;
                                this.nodeCountOverrides = access$getNodeCountOverrides$p;
                                openReader2.close();
                            } catch (Throwable th) {
                                th = th;
                                this.changes = list2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            list2 = access$getChanges$p2;
                            this.changes = list2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        openReader2.close();
                        throw th3;
                    }
                }
                record(ComposerKt.skipToGroupEndInstance);
                i2++;
                i = 0;
            }
            record(ComposerImpl$insertMovableContentGuarded$1$2.INSTANCE);
            this.writersReaderDelta = 0;
            C11921v vVar3 = C11921v.f18618a;
            this.changes = access$getChanges$p;
        } catch (Throwable th4) {
            this.changes = access$getChanges$p;
            throw th4;
        }
    }

    private static final int insertMovableContentGuarded$currentNodeIndex(SlotWriter slotWriter) {
        int i;
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i2 = parent + 1;
        int i3 = 0;
        while (i2 < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i2)) {
                if (slotWriter.isNode(i2)) {
                    i3 = 0;
                }
                i2++;
            } else {
                if (slotWriter.isNode(i2)) {
                    i = 1;
                } else {
                    i = slotWriter.nodeCount(i2);
                }
                i3 += i;
                i2 += slotWriter.groupSize(i2);
            }
        }
        return i3;
    }

    /* access modifiers changed from: private */
    public static final int insertMovableContentGuarded$positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier2) {
        boolean z;
        int anchorIndex = slotWriter.anchorIndex(anchor);
        boolean z2 = true;
        if (slotWriter.getCurrentGroup() < anchorIndex) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.runtimeCheck(z);
        insertMovableContentGuarded$positionToParentOf(slotWriter, applier2, anchorIndex);
        int insertMovableContentGuarded$currentNodeIndex = insertMovableContentGuarded$currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier2.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    insertMovableContentGuarded$currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                insertMovableContentGuarded$currentNodeIndex += slotWriter.skipGroup();
            }
        }
        if (slotWriter.getCurrentGroup() != anchorIndex) {
            z2 = false;
        }
        ComposerKt.runtimeCheck(z2);
        return insertMovableContentGuarded$currentNodeIndex;
    }

    /* access modifiers changed from: private */
    public static final void insertMovableContentGuarded$positionToParentOf(SlotWriter slotWriter, Applier<Object> applier2, int i) {
        while (!slotWriter.indexInParent(i)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier2.mo10550up();
            }
            slotWriter.endGroup();
        }
    }

    private final int insertedGroupVirtualIndex(int i) {
        return -2 - i;
    }

    /* access modifiers changed from: private */
    public final void invokeMovableContentLambda(MovableContent<Object> movableContent, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, Object obj, boolean z) {
        startMovableGroup(MovableContentKt.movableContentKey, movableContent);
        changed(obj);
        int compoundKeyHash2 = getCompoundKeyHash();
        try {
            this.compoundKeyHash = MovableContentKt.movableContentKey;
            boolean z2 = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, (Object) null);
            }
            if (!getInserting()) {
                if (!C12775o.m28634d(this.reader.getGroupAux(), persistentMap)) {
                    z2 = true;
                }
            }
            if (z2) {
                this.providerUpdates.set(this.reader.getCurrentGroup(), persistentMap);
            }
            m35270startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m35280getGroupULZAiWs(), persistentMap);
            if (!getInserting() || z) {
                boolean z3 = this.providersInvalid;
                this.providersInvalid = z2;
                ActualJvm_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(694380496, true, new ComposerImpl$invokeMovableContentLambda$1(movableContent, obj)));
                this.providersInvalid = z3;
            } else {
                this.writerHasAProvider = true;
                this.providerCache = null;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime_release(new MovableContentStateReference(movableContent, obj, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), C12726w.m28524k(), currentCompositionLocalScope()));
            }
        } finally {
            endGroup();
            this.compoundKeyHash = compoundKeyHash2;
            endMovableGroup();
        }
    }

    private final Object nodeAt(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final int nodeIndexOf(int i, int i2, int i3, int i4) {
        int i5;
        int parent = this.reader.parent(i2);
        while (i5 != i3 && !this.reader.isNode(i5)) {
            parent = this.reader.parent(i5);
        }
        if (this.reader.isNode(i5)) {
            i4 = 0;
        }
        if (i5 == i2) {
            return i4;
        }
        int updatedNodeCount = (updatedNodeCount(i5) - this.reader.nodeCount(i2)) + i4;
        loop1:
        while (i4 < updatedNodeCount && i5 != i) {
            i5++;
            while (true) {
                if (i5 >= i) {
                    break loop1;
                }
                int groupSize = this.reader.groupSize(i5) + i5;
                if (i >= groupSize) {
                    i4 += updatedNodeCount(i5);
                    i5 = groupSize;
                }
            }
        }
        return i4;
    }

    private final void realizeDowns(Object[] objArr) {
        record(new ComposerImpl$realizeDowns$1(objArr));
    }

    private final void realizeMovement() {
        int i = this.previousCount;
        this.previousCount = 0;
        if (i > 0) {
            int i2 = this.previousRemove;
            if (i2 >= 0) {
                this.previousRemove = -1;
                recordApplierOperation(new ComposerImpl$realizeMovement$1(i2, i));
                return;
            }
            int i3 = this.previousMoveFrom;
            this.previousMoveFrom = -1;
            int i4 = this.previousMoveTo;
            this.previousMoveTo = -1;
            recordApplierOperation(new ComposerImpl$realizeMovement$2(i3, i4, i));
        }
    }

    private final void realizeOperationLocation(boolean z) {
        int i;
        boolean z2;
        if (z) {
            i = this.reader.getParent();
        } else {
            i = this.reader.getCurrentGroup();
        }
        int i2 = i - this.writersReaderDelta;
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.composeRuntimeError("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        } else if (i2 > 0) {
            record(new ComposerImpl$realizeOperationLocation$2(i2));
            this.writersReaderDelta = i;
        }
    }

    static /* synthetic */ void realizeOperationLocation$default(ComposerImpl composerImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.realizeOperationLocation(z);
    }

    private final void realizeUps() {
        int i = this.pendingUps;
        if (i > 0) {
            this.pendingUps = 0;
            record(new ComposerImpl$realizeUps$1(i));
        }
    }

    private final <R> R recomposeMovableContent(ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List<C11906l<RecomposeScopeImpl, IdentityArraySet<Object>>> list, C13074a<? extends R> aVar) {
        R r;
        int i;
        ControlledComposition controlledComposition3 = controlledComposition;
        boolean z = this.implicitRootStart;
        boolean z2 = this.isComposing;
        int i2 = this.nodeIndex;
        try {
            this.implicitRootStart = false;
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C11906l lVar = list.get(i3);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) lVar.mo49109a();
                IdentityArraySet identityArraySet = (IdentityArraySet) lVar.mo49110b();
                if (identityArraySet != null) {
                    int size2 = identityArraySet.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        tryImminentInvalidation$runtime_release(recomposeScopeImpl, identityArraySet.get(i4));
                    }
                } else {
                    tryImminentInvalidation$runtime_release(recomposeScopeImpl, (Object) null);
                }
            }
            if (controlledComposition3 != null) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                r = controlledComposition.delegateInvalidations(controlledComposition2, i, aVar);
                if (r == null) {
                }
                return r;
            }
            C13074a<? extends R> aVar2 = aVar;
            r = aVar.invoke();
            return r;
        } finally {
            this.implicitRootStart = z;
            this.isComposing = z2;
            this.nodeIndex = i2;
        }
    }

    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, C13074a aVar, int i, Object obj) {
        ControlledComposition controlledComposition3;
        ControlledComposition controlledComposition4;
        Integer num2;
        if ((i & 1) != 0) {
            controlledComposition3 = null;
        } else {
            controlledComposition3 = controlledComposition;
        }
        if ((i & 2) != 0) {
            controlledComposition4 = null;
        } else {
            controlledComposition4 = controlledComposition2;
        }
        if ((i & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 8) != 0) {
            list = C12726w.m28524k();
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list, aVar);
    }

    private final void recomposeToGroupEnd() {
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        int compoundKeyHash2 = getCompoundKeyHash();
        int i2 = this.groupNodeCount;
        Invalidation access$firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        boolean z2 = false;
        int i3 = parent;
        while (access$firstInRange != null) {
            int location = access$firstInRange.getLocation();
            Invalidation unused = ComposerKt.removeLocation(this.invalidations, location);
            if (access$firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i3, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash2);
                this.providerCache = null;
                access$firstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i3 = currentGroup;
                z2 = true;
            } else {
                this.invalidateStack.push(access$firstInRange.getScope());
                access$firstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            access$firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        }
        if (z2) {
            recordUpsAndDowns(i3, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + updatedNodeCount;
            this.groupNodeCount = i2 + updatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash2;
        this.isComposing = z;
    }

    private final void record(C13089p<? super Applier<?>, ? super SlotWriter, ? super RememberManager, C11921v> pVar) {
        this.changes.add(pVar);
    }

    private final void recordApplierOperation(C13089p<? super Applier<?>, ? super SlotWriter, ? super RememberManager, C11921v> pVar) {
        realizeUps();
        realizeDowns();
        record(pVar);
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        recordSlotEditingOperation(ComposerKt.removeCurrentGroupInstance);
        this.writersReaderDelta += this.reader.getGroupSize();
    }

    private final void recordDown(Object obj) {
        this.downNodes.push(obj);
    }

    private final void recordEndGroup() {
        boolean z;
        int parent = this.reader.getParent();
        if (this.startedGroups.peekOr(-1) <= parent) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
            throw new KotlinNothingValueException();
        } else if (this.startedGroups.peekOr(-1) == parent) {
            this.startedGroups.pop();
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, (Object) null);
        }
    }

    private final void recordEndRoot() {
        if (this.startedGroup) {
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, (Object) null);
            this.startedGroup = false;
        }
    }

    private final void recordFixup(C13089p<? super Applier<?>, ? super SlotWriter, ? super RememberManager, C11921v> pVar) {
        this.insertFixups.add(pVar);
    }

    private final void recordInsert(Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            recordSlotEditingOperation(new ComposerImpl$recordInsert$1(this.insertTable, anchor));
            return;
        }
        List D0 = C12686e0.m28207D0(this.insertFixups);
        this.insertFixups.clear();
        realizeUps();
        realizeDowns();
        recordSlotEditingOperation(new ComposerImpl$recordInsert$2(this.insertTable, anchor, D0));
    }

    private final void recordInsertUpFixup(C13089p<? super Applier<?>, ? super SlotWriter, ? super RememberManager, C11921v> pVar) {
        this.insertUpFixups.push(pVar);
    }

    private final void recordMoveNode(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.previousCount;
            if (i4 > 0 && this.previousMoveFrom == i - i4 && this.previousMoveTo == i2 - i4) {
                this.previousCount = i4 + i3;
                return;
            }
            realizeMovement();
            this.previousMoveFrom = i;
            this.previousMoveTo = i2;
            this.previousCount = i3;
        }
    }

    private final void recordReaderMoving(int i) {
        this.writersReaderDelta = i - (this.reader.getCurrentGroup() - this.writersReaderDelta);
    }

    private final void recordRemoveNode(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ComposerKt.composeRuntimeError(("Invalid remove index " + i).toString());
                throw new KotlinNothingValueException();
            } else if (this.previousRemove == i) {
                this.previousCount += i2;
            } else {
                realizeMovement();
                this.previousRemove = i;
                this.previousCount = i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r6.reader;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void recordSlotEditing() {
        /*
            r6 = this;
            androidx.compose.runtime.SlotReader r0 = r6.reader
            int r0 = r0.getSize()
            if (r0 <= 0) goto L_0x003e
            androidx.compose.runtime.SlotReader r0 = r6.reader
            int r1 = r0.getParent()
            androidx.compose.runtime.IntStack r2 = r6.startedGroups
            r3 = -2
            int r2 = r2.peekOr(r3)
            if (r2 == r1) goto L_0x003e
            boolean r2 = r6.startedGroup
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x002b
            boolean r2 = r6.implicitRootStart
            if (r2 == 0) goto L_0x002b
            of.p r2 = androidx.compose.runtime.ComposerKt.startRootGroup
            recordSlotTableOperation$default(r6, r4, r2, r5, r3)
            r6.startedGroup = r5
        L_0x002b:
            if (r1 <= 0) goto L_0x003e
            androidx.compose.runtime.Anchor r0 = r0.anchor(r1)
            androidx.compose.runtime.IntStack r2 = r6.startedGroups
            r2.push(r1)
            androidx.compose.runtime.ComposerImpl$recordSlotEditing$1 r1 = new androidx.compose.runtime.ComposerImpl$recordSlotEditing$1
            r1.<init>(r0)
            recordSlotTableOperation$default(r6, r4, r1, r5, r3)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.recordSlotEditing():void");
    }

    private final void recordSlotEditingOperation(C13089p<? super Applier<?>, ? super SlotWriter, ? super RememberManager, C11921v> pVar) {
        realizeOperationLocation$default(this, false, 1, (Object) null);
        recordSlotEditing();
        record(pVar);
    }

    private final void recordSlotTableOperation(boolean z, C13089p<? super Applier<?>, ? super SlotWriter, ? super RememberManager, C11921v> pVar) {
        realizeOperationLocation(z);
        record(pVar);
    }

    static /* synthetic */ void recordSlotTableOperation$default(ComposerImpl composerImpl, boolean z, C13089p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.recordSlotTableOperation(z, pVar);
    }

    private final void recordUp() {
        if (this.downNodes.isNotEmpty()) {
            this.downNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    private final void recordUpsAndDowns(int i, int i2, int i3) {
        SlotReader slotReader = this.reader;
        int access$nearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, i, i2, i3);
        while (i > 0 && i != access$nearestCommonRootOf) {
            if (slotReader.isNode(i)) {
                recordUp();
            }
            i = slotReader.parent(i);
        }
        doRecordDownsFor(i2, access$nearestCommonRootOf);
    }

    private final void registerInsertUpFixup() {
        this.insertFixups.add(this.insertUpFixups.pop());
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public final void releaseMovableGroupAtCurrent(MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) {
        SlotTable slotTable2 = new SlotTable();
        SlotWriter openWriter = slotTable2.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(openWriter, 0, 1, (Object) null);
            openWriter.update(movableContentStateReference.getParameter$runtime_release());
            slotWriter.moveTo(movableContentStateReference.getAnchor$runtime_release(), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            C11921v vVar = C11921v.f18618a;
            openWriter.close();
            this.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, new MovableContentState(slotTable2));
        } catch (Throwable th) {
            openWriter.close();
            throw th;
        }
    }

    private final void reportAllMovableContent() {
        List access$getChanges$p;
        if (this.slotTable.containsMark()) {
            ArrayList arrayList = new ArrayList();
            this.deferredChanges = arrayList;
            SlotReader openReader = this.slotTable.openReader();
            try {
                this.reader = openReader;
                access$getChanges$p = this.changes;
                this.changes = arrayList;
                reportFreeMovableContent(0);
                realizeUps();
                if (this.startedGroup) {
                    record(ComposerKt.skipToGroupEndInstance);
                    recordEndRoot();
                }
                C11921v vVar = C11921v.f18618a;
                this.changes = access$getChanges$p;
                openReader.close();
            } catch (Throwable th) {
                openReader.close();
                throw th;
            }
        }
    }

    private final void reportFreeMovableContent(int i) {
        reportFreeMovableContent$reportGroup(this, i, false, 0);
        realizeMovement();
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i, boolean z, int i2) {
        boolean z2;
        int i3;
        CompositionContextHolder compositionContextHolder;
        ComposerImpl composerImpl2 = composerImpl;
        int i4 = i;
        int i5 = i2;
        int i6 = 1;
        if (composerImpl2.reader.hasMark(i4)) {
            int groupKey = composerImpl2.reader.groupKey(i4);
            Object groupObjectKey = composerImpl2.reader.groupObjectKey(i4);
            if (groupKey == 126665345 && (groupObjectKey instanceof MovableContent)) {
                MovableContent movableContent = (MovableContent) groupObjectKey;
                Object groupGet = composerImpl2.reader.groupGet(i4, 0);
                Anchor anchor = composerImpl2.reader.anchor(i4);
                List access$filterToRange = ComposerKt.filterToRange(composerImpl2.invalidations, i4, composerImpl2.reader.groupSize(i4) + i4);
                ArrayList arrayList = new ArrayList(access$filterToRange.size());
                int size = access$filterToRange.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Invalidation invalidation = (Invalidation) access$filterToRange.get(i7);
                    arrayList.add(C11915r.m25707a(invalidation.getScope(), invalidation.getInstances()));
                }
                MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl2.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i));
                composerImpl2.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
                composerImpl.recordSlotEditing();
                composerImpl2.record(new ComposerImpl$reportFreeMovableContent$reportGroup$1(composerImpl2, movableContentStateReference));
                if (!z) {
                    return composerImpl2.reader.nodeCount(i4);
                }
                composerImpl.realizeMovement();
                composerImpl.realizeUps();
                composerImpl.realizeDowns();
                if (!composerImpl2.reader.isNode(i4)) {
                    i6 = composerImpl2.reader.nodeCount(i4);
                }
                if (i6 <= 0) {
                    return 0;
                }
                composerImpl2.recordRemoveNode(i5, i6);
                return 0;
            } else if (groupKey != 206 || !C12775o.m28634d(groupObjectKey, ComposerKt.getReference())) {
                return composerImpl2.reader.nodeCount(i4);
            } else {
                Object groupGet2 = composerImpl2.reader.groupGet(i4, 0);
                if (groupGet2 instanceof CompositionContextHolder) {
                    compositionContextHolder = (CompositionContextHolder) groupGet2;
                } else {
                    compositionContextHolder = null;
                }
                if (compositionContextHolder != null) {
                    for (ComposerImpl reportAllMovableContent : compositionContextHolder.getRef().getComposers()) {
                        reportAllMovableContent.reportAllMovableContent();
                    }
                }
                return composerImpl2.reader.nodeCount(i4);
            }
        } else if (!composerImpl2.reader.containsMark(i4)) {
            return composerImpl2.reader.nodeCount(i4);
        } else {
            int groupSize = composerImpl2.reader.groupSize(i4) + i4;
            int i8 = 0;
            for (int i9 = i4 + 1; i9 < groupSize; i9 += composerImpl2.reader.groupSize(i9)) {
                boolean isNode = composerImpl2.reader.isNode(i9);
                if (isNode) {
                    composerImpl.realizeMovement();
                    composerImpl2.recordDown(composerImpl2.reader.node(i9));
                }
                if (isNode || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (isNode) {
                    i3 = 0;
                } else {
                    i3 = i5 + i8;
                }
                i8 += reportFreeMovableContent$reportGroup(composerImpl2, i9, z2, i3);
                if (isNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordUp();
                }
            }
            return i8;
        }
    }

    private final <T> T resolveCompositionLocal(CompositionLocal<T> compositionLocal, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
        if (ComposerKt.contains(persistentMap, compositionLocal)) {
            return ComposerKt.getValueOf(persistentMap, compositionLocal);
        }
        return compositionLocal.getDefaultValueHolder$runtime_release().getValue();
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    /* renamed from: start-BaiHCIY  reason: not valid java name */
    private final void m35270startBaiHCIY(int i, Object obj, int i2, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i;
        Object obj3 = obj;
        int i4 = i2;
        Object obj4 = obj2;
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(i, obj, obj4);
        GroupKind.Companion companion = GroupKind.Companion;
        int i5 = 0;
        if (i4 != companion.m35280getGroupULZAiWs()) {
            z = true;
        } else {
            z = false;
        }
        Pending pending2 = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z) {
                this.writer.startNode(i, Composer.Companion.getEmpty());
            } else if (obj4 != null) {
                SlotWriter slotWriter = this.writer;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter.startData(i, obj3, obj4);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter2.startGroup(i, obj3);
            }
            Pending pending3 = this.pending;
            if (pending3 != null) {
                KeyInfo keyInfo = new KeyInfo(i, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending3.registerInsert(keyInfo, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo);
            }
            enterGroup(z, (Pending) null);
            return;
        }
        if (i4 != companion.m35281getNodeULZAiWs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !this.reusing) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.pending == null) {
            int groupKey = this.reader.getGroupKey();
            if (z3 || groupKey != i3 || !C12775o.m28634d(obj, this.reader.getGroupObjectKey())) {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            } else {
                startReaderGroup(z, obj4);
            }
        }
        Pending pending4 = this.pending;
        if (pending4 != null) {
            KeyInfo next = pending4.getNext(i, obj);
            if (z3 || next == null) {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.startNode(i, Composer.Companion.getEmpty());
                } else if (obj4 != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter3.startData(i, obj3, obj4);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter4.startGroup(i, obj3);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(i, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending4.registerInsert(keyInfo2, this.nodeIndex - pending4.getStartIndex());
                pending4.recordUsed(keyInfo2);
                ArrayList arrayList = new ArrayList();
                if (!z) {
                    i5 = this.nodeIndex;
                }
                pending2 = new Pending(arrayList, i5);
            } else {
                pending4.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending4.nodePositionOf(next) + pending4.getStartIndex();
                int slotPositionOf = pending4.slotPositionOf(next);
                int groupIndex = slotPositionOf - pending4.getGroupIndex();
                pending4.registerMoveSlot(slotPositionOf, pending4.getGroupIndex());
                recordReaderMoving(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    recordSlotEditingOperation(new ComposerImpl$start$2(groupIndex));
                }
                startReaderGroup(z, obj4);
            }
        }
        enterGroup(z, pending2);
    }

    private final void startGroup(int i) {
        m35270startBaiHCIY(i, (Object) null, GroupKind.Companion.m35280getGroupULZAiWs(), (Object) null);
    }

    private final void startReaderGroup(boolean z, Object obj) {
        if (z) {
            this.reader.startNode();
            return;
        }
        if (!(obj == null || this.reader.getGroupAux() == obj)) {
            recordSlotTableOperation$default(this, false, new ComposerImpl$startReaderGroup$1(obj), 1, (Object) null);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = changed((Object) this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime_release();
        }
        Set set = (Set) resolveCompositionLocal(InspectionTablesKt.getLocalInspectionTables(), this.parentProvider);
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey$runtime_release());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i != 207 || C12775o.m28634d(obj2, Composer.Companion.getEmpty())) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(i);
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) obj).ordinal());
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(obj.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i) {
        this.compoundKeyHash = i ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i != 207 || C12775o.m28634d(obj2, Composer.Companion.getEmpty())) {
                updateCompoundKeyWhenWeExitGroupKeyHash(i);
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) obj).ordinal());
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(obj.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i) {
        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(i) ^ getCompoundKeyHash(), 3);
    }

    private final void updateNodeCount(int i, int i2) {
        if (updatedNodeCount(i) == i2) {
            return;
        }
        if (i < 0) {
            HashMap<Integer, Integer> hashMap = this.nodeCountVirtualOverrides;
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.nodeCountVirtualOverrides = hashMap;
            }
            hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        int[] iArr = this.nodeCountOverrides;
        if (iArr == null) {
            iArr = new int[this.reader.getSize()];
            C12708o.m28354u(iArr, -1, 0, 0, 6, (Object) null);
            this.nodeCountOverrides = iArr;
        }
        iArr[i] = i2;
    }

    private final void updateNodeCountOverrides(int i, int i2) {
        int updatedNodeCount = updatedNodeCount(i);
        if (updatedNodeCount != i2) {
            int i3 = i2 - updatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (i != -1) {
                int updatedNodeCount2 = updatedNodeCount(i) + i3;
                updateNodeCount(i, updatedNodeCount2);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        Pending peek = this.pendingStack.peek(i4);
                        if (peek != null && peek.updateNodeCount(i, updatedNodeCount2)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.reader.getParent();
                } else if (!this.reader.isNode(i)) {
                    i = this.reader.parent(i);
                } else {
                    return;
                }
            }
        }
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> updateProviderMapGroup(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = persistentMap.builder();
        builder.putAll(persistentMap2);
        PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> build = builder.build();
        startGroup(ComposerKt.providerMapsKey, ComposerKt.getProviderMaps());
        changed((Object) build);
        changed((Object) persistentMap2);
        endGroup();
        return build;
    }

    private final int updatedNodeCount(int i) {
        int i2;
        Integer num;
        if (i < 0) {
            HashMap<Integer, Integer> hashMap = this.nodeCountVirtualOverrides;
            if (hashMap == null || (num = hashMap.get(Integer.valueOf(i))) == null) {
                return 0;
            }
            return num.intValue();
        }
        int[] iArr = this.nodeCountOverrides;
        if (iArr == null || (i2 = iArr[i]) < 0) {
            return this.reader.nodeCount(i);
        }
        return i2;
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void validateNodeNotExpected() {
        if (!(!this.nodeExpected)) {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final <R> R withChanges(List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list, C13074a<? extends R> aVar) {
        List access$getChanges$p = this.changes;
        try {
            this.changes = list;
            return aVar.invoke();
        } finally {
            C12773m.m28629b(1);
            this.changes = access$getChanges$p;
            C12773m.m28628a(1);
        }
    }

    private final <R> R withReader(SlotReader slotReader, C13074a<? extends R> aVar) {
        SlotReader access$getReader$p = this.reader;
        int[] access$getNodeCountOverrides$p = this.nodeCountOverrides;
        this.nodeCountOverrides = null;
        try {
            this.reader = slotReader;
            return aVar.invoke();
        } finally {
            C12773m.m28629b(1);
            this.reader = access$getReader$p;
            this.nodeCountOverrides = access$getNodeCountOverrides$p;
            C12773m.m28628a(1);
        }
    }

    public <V, T> void apply(V v, C13088o<? super T, ? super V, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        ComposerImpl$apply$operation$1 composerImpl$apply$operation$1 = new ComposerImpl$apply$operation$1(oVar, v);
        if (getInserting()) {
            recordFixup(composerImpl$apply$operation$1);
        } else {
            recordApplierOperation(composerImpl$apply$operation$1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.runtime.ComposerImpl$CompositionContextHolder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.CompositionContext buildContext() {
        /*
            r4 = this;
            r0 = 206(0xce, float:2.89E-43)
            java.lang.Object r1 = androidx.compose.runtime.ComposerKt.getReference()
            r4.startGroup(r0, r1)
            boolean r0 = r4.getInserting()
            r1 = 0
            if (r0 == 0) goto L_0x0017
            androidx.compose.runtime.SlotWriter r0 = r4.writer
            r2 = 0
            r3 = 1
            androidx.compose.runtime.SlotWriter.markGroup$default(r0, r2, r3, r1)
        L_0x0017:
            java.lang.Object r0 = r4.nextSlot()
            boolean r2 = r0 instanceof androidx.compose.runtime.ComposerImpl.CompositionContextHolder
            if (r2 == 0) goto L_0x0022
            r1 = r0
            androidx.compose.runtime.ComposerImpl$CompositionContextHolder r1 = (androidx.compose.runtime.ComposerImpl.CompositionContextHolder) r1
        L_0x0022:
            if (r1 != 0) goto L_0x0037
            androidx.compose.runtime.ComposerImpl$CompositionContextHolder r1 = new androidx.compose.runtime.ComposerImpl$CompositionContextHolder
            androidx.compose.runtime.ComposerImpl$CompositionContextImpl r0 = new androidx.compose.runtime.ComposerImpl$CompositionContextImpl
            int r2 = r4.getCompoundKeyHash()
            boolean r3 = r4.forceRecomposeScopes
            r0.<init>(r2, r3)
            r1.<init>(r0)
            r4.updateValue(r1)
        L_0x0037:
            androidx.compose.runtime.ComposerImpl$CompositionContextImpl r0 = r1.getRef()
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap r2 = r4.currentCompositionLocalScope()
            r0.updateCompositionLocalScope(r2)
            r4.endGroup()
            androidx.compose.runtime.ComposerImpl$CompositionContextImpl r0 = r1.getRef()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.buildContext():androidx.compose.runtime.CompositionContext");
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean z, C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "block");
        T nextSlot = nextSlot();
        if (nextSlot != Composer.Companion.getEmpty() && !z) {
            return nextSlot;
        }
        T invoke = aVar.invoke();
        updateValue(invoke);
        return invoke;
    }

    @ComposeCompilerApi
    public boolean changed(Object obj) {
        if (C12775o.m28634d(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @ComposeCompilerApi
    public boolean changedInstance(Object obj) {
        if (nextSlot() == obj) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates.clear();
    }

    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
    }

    public final void composeContent$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(identityArrayMap, "invalidationsRequested");
        C12775o.m28639i(oVar, "content");
        if (this.changes.isEmpty()) {
            doCompose(identityArrayMap, oVar);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    @InternalComposeApi
    public <T> T consume(CompositionLocal<T> compositionLocal) {
        C12775o.m28639i(compositionLocal, "key");
        return resolveCompositionLocal(compositionLocal, currentCompositionLocalScope());
    }

    public <T> void createNode(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "factory");
        validateNodeExpected();
        if (getInserting()) {
            int peek = this.nodeIndexStack.peek();
            SlotWriter slotWriter = this.writer;
            Anchor anchor = slotWriter.anchor(slotWriter.getParent());
            this.groupNodeCount++;
            recordFixup(new ComposerImpl$createNode$2(aVar, anchor, peek));
            recordInsertUpFixup(new ComposerImpl$createNode$3(anchor, peek));
            return;
        }
        ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z) {
        boolean z2;
        if (this.groupNodeCount == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup".toString());
            throw new KotlinNothingValueException();
        } else if (getInserting()) {
        } else {
            if (!z) {
                skipReaderToGroupEnd();
                return;
            }
            int currentGroup = this.reader.getCurrentGroup();
            int currentEnd = this.reader.getCurrentEnd();
            for (int i = currentGroup; i < currentEnd; i++) {
                if (this.reader.isNode(i)) {
                    Object node = this.reader.node(i);
                    if (node instanceof ComposeNodeLifecycleCallback) {
                        record(new ComposerImpl$deactivateToEndGroup$2(node));
                    }
                }
                this.reader.forEachData$runtime_release(i, new ComposerImpl$deactivateToEndGroup$3(this, i));
            }
            ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
            this.reader.reposition(currentGroup);
            this.reader.skipToGroupEnd();
        }
    }

    public void disableReusing() {
        this.reusing = false;
    }

    public void disableSourceInformation() {
        this.sourceInformationEnabled = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            this.invalidateStack.clear();
            this.invalidations.clear();
            this.changes.clear();
            this.providerUpdates.clear();
            getApplier().clear();
            this.isDisposed = true;
            C11921v vVar = C11921v.f18618a;
            trace.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    public void enableReusing() {
        boolean z;
        if (this.reusingGroup >= 0) {
            z = true;
        } else {
            z = false;
        }
        this.reusing = z;
    }

    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getUsed()) {
            currentRecomposeScope$runtime_release.setDefaultsInScope(true);
        }
    }

    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    public void endNode() {
        end(true);
    }

    @InternalComposeApi
    public void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        RecomposeScopeImpl recomposeScopeImpl;
        Anchor anchor;
        Function1<Composition, C11921v> end;
        RecomposeScopeImpl recomposeScopeImpl2 = null;
        if (this.invalidateStack.isNotEmpty()) {
            recomposeScopeImpl = this.invalidateStack.pop();
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setRequiresRecompose(false);
        }
        if (!(recomposeScopeImpl == null || (end = recomposeScopeImpl.end(this.compositionToken)) == null)) {
            record(new ComposerImpl$endRestartGroup$1$1(end, this));
        }
        if (recomposeScopeImpl != null && !recomposeScopeImpl.getSkipped$runtime_release() && (recomposeScopeImpl.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl.setAnchor(anchor);
            }
            recomposeScopeImpl.setDefaultsInvalid(false);
            recomposeScopeImpl2 = recomposeScopeImpl;
        }
        end(false);
        return recomposeScopeImpl2;
    }

    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    public void endToMarker(int i) {
        if (i < 0) {
            int i2 = -i;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent > i2) {
                    end(slotWriter.isNode(parent));
                } else {
                    return;
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 > i) {
                    end(slotReader.isNode(parent2));
                } else {
                    return;
                }
            }
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    public Applier<?> getApplier() {
        return this.applier;
    }

    public C12079g getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext$runtime_release();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        if (this.childrenComposing > 0) {
            return true;
        }
        return false;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.size();
    }

    public ControlledComposition getComposition() {
        return this.composition;
    }

    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    public int getCurrentMarker() {
        if (getInserting()) {
            return -this.writer.getParent();
        }
        return this.reader.getParent();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing != 0 || !stack.isNotEmpty()) {
            return null;
        }
        return stack.peek();
    }

    public boolean getDefaultsInvalid() {
        boolean z;
        if (this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getDefaultsInvalid()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.changes.isEmpty();
    }

    public final SlotTable getInsertTable$runtime_release() {
        return this.insertTable;
    }

    public boolean getInserting() {
        return this.inserting;
    }

    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    public boolean getSkipping() {
        boolean z;
        if (getInserting() || this.reusing || this.providersInvalid) {
            return false;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || currentRecomposeScope$runtime_release.getRequiresRecompose()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || this.forciblyRecompose) {
            return false;
        }
        return true;
    }

    @InternalComposeApi
    public void insertMovableContent(MovableContent<?> movableContent, Object obj) {
        C12775o.m28639i(movableContent, "value");
        invokeMovableContentLambda(movableContent, currentCompositionLocalScope(), obj, false);
    }

    @InternalComposeApi
    public void insertMovableContentReferences(List<C11906l<MovableContentStateReference, MovableContentStateReference>> list) {
        C12775o.m28639i(list, "references");
        try {
            insertMovableContentGuarded(list);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    public final boolean isComposing$runtime_release() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime_release() {
        return this.isDisposed;
    }

    @ComposeCompilerApi
    public Object joinKey(Object obj, Object obj2) {
        Object access$getKey = ComposerKt.getKey(this.reader.getGroupObjectKey(), obj, obj2);
        if (access$getKey == null) {
            return new JoinedKey(obj, obj2);
        }
        return access$getKey;
    }

    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        if (this.reusing) {
            return Composer.Companion.getEmpty();
        }
        return next;
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "block");
        if (!this.isComposing) {
            this.isComposing = true;
            try {
                aVar.invoke();
            } finally {
                this.isComposing = false;
            }
        } else {
            ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final boolean recompose$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap) {
        C12775o.m28639i(identityArrayMap, "invalidationsRequested");
        if (!this.changes.isEmpty()) {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        } else if (!identityArrayMap.isNotEmpty() && !(!this.invalidations.isEmpty()) && !this.forciblyRecompose) {
            return false;
        } else {
            doCompose(identityArrayMap, (C13088o<? super Composer, ? super Integer, C11921v>) null);
            return !this.changes.isEmpty();
        }
    }

    public void recordSideEffect(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "effect");
        record(new ComposerImpl$recordSideEffect$1(aVar));
    }

    public void recordUsed(RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl;
        C12775o.m28639i(recomposeScope, "scope");
        if (recomposeScope instanceof RecomposeScopeImpl) {
            recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setUsed(true);
        }
    }

    public Object rememberedValue() {
        return nextSlot();
    }

    public final void setDeferredChanges$runtime_release(List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list) {
        this.deferredChanges = list;
    }

    public final void setInsertTable$runtime_release(SlotTable slotTable2) {
        C12775o.m28639i(slotTable2, "<set-?>");
        this.insertTable = slotTable2;
    }

    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), (Object) null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    @ComposeCompilerApi
    public void skipToGroupEnd() {
        boolean z;
        if (this.groupNodeCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (currentRecomposeScope$runtime_release != null) {
                currentRecomposeScope$runtime_release.scopeSkipped();
            }
            if (this.invalidations.isEmpty()) {
                skipReaderToGroupEnd();
            } else {
                recomposeToGroupEnd();
            }
        } else {
            ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new KotlinNothingValueException();
        }
    }

    @ComposeCompilerApi
    public void sourceInformation(String str) {
        C12775o.m28639i(str, "sourceInformation");
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.insertAux(str);
        }
    }

    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (this.sourceInformationEnabled) {
            end(false);
        }
    }

    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i, String str) {
        C12775o.m28639i(str, "sourceInformation");
        if (this.sourceInformationEnabled) {
            m35270startBaiHCIY(i, (Object) null, GroupKind.Companion.m35280getGroupULZAiWs(), str);
        }
    }

    @ComposeCompilerApi
    public void startDefaults() {
        m35270startBaiHCIY(-127, (Object) null, GroupKind.Companion.m35280getGroupULZAiWs(), (Object) null);
    }

    @ComposeCompilerApi
    public void startMovableGroup(int i, Object obj) {
        m35270startBaiHCIY(i, obj, GroupKind.Companion.m35280getGroupULZAiWs(), (Object) null);
    }

    public void startNode() {
        m35270startBaiHCIY(125, (Object) null, GroupKind.Companion.m35281getNodeULZAiWs(), (Object) null);
        this.nodeExpected = true;
    }

    @InternalComposeApi
    public void startProviders(ProvidedValue<?>[] providedValueArr) {
        PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap;
        C12775o.m28639i(providedValueArr, "values");
        PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        startGroup(ComposerKt.providerValuesKey, ComposerKt.getProviderValues());
        PersistentMap persistentMap2 = (PersistentMap) ActualJvm_jvmKt.invokeComposableForResult(this, new ComposerImpl$startProviders$currentProviders$1(providedValueArr, currentCompositionLocalScope));
        endGroup();
        boolean z = false;
        if (getInserting()) {
            persistentMap = updateProviderMapGroup(currentCompositionLocalScope, persistentMap2);
            this.writerHasAProvider = true;
        } else {
            Object groupGet = this.reader.groupGet(0);
            C12775o.m28637g(groupGet, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap3 = (PersistentMap) groupGet;
            Object groupGet2 = this.reader.groupGet(1);
            C12775o.m28637g(groupGet2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            PersistentMap persistentMap4 = (PersistentMap) groupGet2;
            if (!getSkipping() || !C12775o.m28634d(persistentMap4, persistentMap2)) {
                persistentMap = updateProviderMapGroup(currentCompositionLocalScope, persistentMap2);
                z = !C12775o.m28634d(persistentMap, persistentMap3);
            } else {
                skipGroup();
                persistentMap = persistentMap3;
            }
        }
        if (z && !getInserting()) {
            this.providerUpdates.set(this.reader.getCurrentGroup(), persistentMap);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z;
        this.providerCache = persistentMap;
        m35270startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m35280getGroupULZAiWs(), persistentMap);
    }

    @ComposeCompilerApi
    public void startReplaceableGroup(int i) {
        m35270startBaiHCIY(i, (Object) null, GroupKind.Companion.m35280getGroupULZAiWs(), (Object) null);
    }

    @ComposeCompilerApi
    public Composer startRestartGroup(int i) {
        m35270startBaiHCIY(i, (Object) null, GroupKind.Companion.m35280getGroupULZAiWs(), (Object) null);
        addRecomposeScope();
        return this;
    }

    public void startReusableGroup(int i, Object obj) {
        if (this.reader.getGroupKey() == i && !C12775o.m28634d(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m35270startBaiHCIY(i, (Object) null, GroupKind.Companion.m35280getGroupULZAiWs(), obj);
    }

    public void startReusableNode() {
        m35270startBaiHCIY(125, (Object) null, GroupKind.Companion.m35282getReusableNodeULZAiWs(), (Object) null);
        this.nodeExpected = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        C12775o.m28639i(recomposeScopeImpl, "scope");
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.slotTable);
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, recomposeScopeImpl, obj);
        return true;
    }

    public final void updateCachedValue(Object obj) {
        updateValue(obj);
    }

    public void updateRememberedValue(Object obj) {
        updateValue(obj);
    }

    public final void updateValue(Object obj) {
        if (getInserting()) {
            this.writer.update(obj);
            if (obj instanceof RememberObserver) {
                record(new ComposerImpl$updateValue$1(obj));
                this.abandonSet.add(obj);
                return;
            }
            return;
        }
        int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
        if (obj instanceof RememberObserver) {
            this.abandonSet.add(obj);
        }
        recordSlotTableOperation(true, new ComposerImpl$updateValue$2(obj, groupSlotIndex));
    }

    public void useNode() {
        validateNodeExpected();
        if (!getInserting()) {
            Object node = getNode(this.reader);
            recordDown(node);
            if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
                recordApplierOperation(ComposerImpl$useNode$2.INSTANCE);
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    private final void realizeDowns() {
        if (this.downNodes.isNotEmpty()) {
            realizeDowns(this.downNodes.toArray());
            this.downNodes.clear();
        }
    }

    /* access modifiers changed from: private */
    public final void startGroup(int i, Object obj) {
        m35270startBaiHCIY(i, obj, GroupKind.Companion.m35280getGroupULZAiWs(), (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<java.lang.Object>, ? extends androidx.compose.runtime.State<? extends java.lang.Object>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<java.lang.Object>> currentCompositionLocalScope(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.getInserting()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }"
            r2 = 202(0xca, float:2.83E-43)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r5.writerHasAProvider
            if (r0 == 0) goto L_0x0043
            androidx.compose.runtime.SlotWriter r0 = r5.writer
            int r0 = r0.getParent()
        L_0x0014:
            if (r0 <= 0) goto L_0x0043
            androidx.compose.runtime.SlotWriter r3 = r5.writer
            int r3 = r3.groupKey(r0)
            if (r3 != r2) goto L_0x003c
            androidx.compose.runtime.SlotWriter r3 = r5.writer
            java.lang.Object r3 = r3.groupObjectKey(r0)
            java.lang.Object r4 = androidx.compose.runtime.ComposerKt.getCompositionLocalMap()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r3, r4)
            if (r3 == 0) goto L_0x003c
            androidx.compose.runtime.SlotWriter r6 = r5.writer
            java.lang.Object r6 = r6.groupAux(r0)
            kotlin.jvm.internal.C12775o.m28637g(r6, r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap r6 = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap) r6
            r5.providerCache = r6
            return r6
        L_0x003c:
            androidx.compose.runtime.SlotWriter r3 = r5.writer
            int r0 = r3.parent((int) r0)
            goto L_0x0014
        L_0x0043:
            androidx.compose.runtime.SlotReader r0 = r5.reader
            int r0 = r0.getSize()
            if (r0 <= 0) goto L_0x0085
        L_0x004b:
            if (r6 <= 0) goto L_0x0085
            androidx.compose.runtime.SlotReader r0 = r5.reader
            int r0 = r0.groupKey((int) r6)
            if (r0 != r2) goto L_0x007e
            androidx.compose.runtime.SlotReader r0 = r5.reader
            java.lang.Object r0 = r0.groupObjectKey(r6)
            java.lang.Object r3 = androidx.compose.runtime.ComposerKt.getCompositionLocalMap()
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r3)
            if (r0 == 0) goto L_0x007e
            androidx.compose.runtime.collection.IntMap<androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<java.lang.Object>>> r0 = r5.providerUpdates
            java.lang.Object r0 = r0.get(r6)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap r0 = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap) r0
            if (r0 != 0) goto L_0x007b
            androidx.compose.runtime.SlotReader r0 = r5.reader
            java.lang.Object r6 = r0.groupAux(r6)
            kotlin.jvm.internal.C12775o.m28637g(r6, r1)
            r0 = r6
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap r0 = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap) r0
        L_0x007b:
            r5.providerCache = r0
            return r0
        L_0x007e:
            androidx.compose.runtime.SlotReader r0 = r5.reader
            int r6 = r0.parent(r6)
            goto L_0x004b
        L_0x0085:
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<java.lang.Object>, ? extends androidx.compose.runtime.State<? extends java.lang.Object>> r6 = r5.parentProvider
            r5.providerCache = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.currentCompositionLocalScope(int):androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap");
    }

    @ComposeCompilerApi
    public boolean changed(char c) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Character) && c == ((Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c));
        return true;
    }

    @ComposeCompilerApi
    public boolean changed(byte b) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Byte) && b == ((Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b));
        return true;
    }

    @ComposeCompilerApi
    public boolean changed(short s) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Short) && s == ((Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s));
        return true;
    }

    /* compiled from: Composer.kt */
    private static final class CompositionContextHolder implements RememberObserver {
        private final CompositionContextImpl ref;

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            C12775o.m28639i(compositionContextImpl, "ref");
            this.ref = compositionContextImpl;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        public void onAbandoned() {
            this.ref.dispose();
        }

        public void onForgotten() {
            this.ref.dispose();
        }

        public void onRemembered() {
        }
    }

    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4528:1\n1855#2,2:4529\n76#3:4531\n102#3,2:4532\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n3948#1:4529,2\n3998#1:4531\n3998#1:4532,2\n*E\n"})
    /* compiled from: Composer.kt */
    private final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final Set<ComposerImpl> composers = new LinkedHashSet();
        private final MutableState compositionLocalScope$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentHashMapOf(), (SnapshotMutationPolicy) null, 2, (Object) null);
        private final int compoundHashKey;
        private Set<Set<CompositionData>> inspectionTables;

        public CompositionContextImpl(int i, boolean z) {
            this.compoundHashKey = i;
            this.collectingParameterInformation = z;
        }

        private final PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope() {
            return (PersistentMap) this.compositionLocalScope$delegate.getValue();
        }

        private final void setCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            this.compositionLocalScope$delegate.setValue(persistentMap);
        }

        @ComposableInferredTarget(scheme = "[0[0]]")
        public void composeInitial$runtime_release(ControlledComposition controlledComposition, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
            C12775o.m28639i(controlledComposition, "composition");
            C12775o.m28639i(oVar, "content");
            ComposerImpl.this.parentContext.composeInitial$runtime_release(controlledComposition, oVar);
        }

        public void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
            C12775o.m28639i(movableContentStateReference, "reference");
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl next : this.composers) {
                        for (Set<CompositionData> remove : set) {
                            remove.remove(next.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing = composerImpl.childrenComposing - 1;
        }

        public boolean getCollectingParameterInformation$runtime_release() {
            return this.collectingParameterInformation;
        }

        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        public PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        public int getCompoundHashKey$runtime_release() {
            return this.compoundHashKey;
        }

        public C12079g getEffectCoroutineContext$runtime_release() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext$runtime_release();
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        public C12079g getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        public void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
            C12775o.m28639i(movableContentStateReference, "reference");
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(movableContentStateReference);
        }

        public void invalidate$runtime_release(ControlledComposition controlledComposition) {
            C12775o.m28639i(controlledComposition, "composition");
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(controlledComposition);
        }

        public void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl) {
            C12775o.m28639i(recomposeScopeImpl, "scope");
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(recomposeScopeImpl);
        }

        public void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState) {
            C12775o.m28639i(movableContentStateReference, "reference");
            C12775o.m28639i(movableContentState, "data");
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        }

        public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
            C12775o.m28639i(movableContentStateReference, "reference");
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReference);
        }

        public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
            C12775o.m28639i(set, "table");
            Set set2 = this.inspectionTables;
            if (set2 == null) {
                set2 = new HashSet();
                this.inspectionTables = set2;
            }
            set2.add(set);
        }

        public void registerComposer$runtime_release(Composer composer) {
            C12775o.m28639i(composer, "composer");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        public void registerComposition$runtime_release(ControlledComposition controlledComposition) {
            C12775o.m28639i(controlledComposition, "composition");
            ComposerImpl.this.parentContext.registerComposition$runtime_release(controlledComposition);
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        public void startComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing = composerImpl.childrenComposing + 1;
        }

        public void unregisterComposer$runtime_release(Composer composer) {
            C12775o.m28639i(composer, "composer");
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                for (Set remove : set) {
                    remove.remove(((ComposerImpl) composer).slotTable);
                }
            }
            C12772l0.m28609a(this.composers).remove(composer);
        }

        public void unregisterComposition$runtime_release(ControlledComposition controlledComposition) {
            C12775o.m28639i(controlledComposition, "composition");
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(controlledComposition);
        }

        public final void updateCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            C12775o.m28639i(persistentMap, "scope");
            setCompositionLocalScope(persistentMap);
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }
    }

    @ComposeCompilerApi
    public boolean changed(boolean z) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && z == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z));
        return true;
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    @ComposeCompilerApi
    public boolean changed(float f) {
        Object nextSlot = nextSlot();
        if (nextSlot instanceof Float) {
            if (f == ((Number) nextSlot).floatValue()) {
                return false;
            }
        }
        updateValue(Float.valueOf(f));
        return true;
    }

    @ComposeCompilerApi
    public boolean changed(long j) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && j == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j));
        return true;
    }

    @ComposeCompilerApi
    public boolean changed(double d) {
        Object nextSlot = nextSlot();
        if (nextSlot instanceof Double) {
            if (d == ((Number) nextSlot).doubleValue()) {
                return false;
            }
        }
        updateValue(Double.valueOf(d));
        return true;
    }

    @ComposeCompilerApi
    public boolean changed(int i) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && i == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i));
        return true;
    }
}
