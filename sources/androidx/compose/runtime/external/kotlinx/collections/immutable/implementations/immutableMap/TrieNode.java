package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13091r;
import p436tf.C13525d;

@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,887:1\n10#2,9:888\n10#2,9:897\n10#2,9:906\n83#3:915\n1#4:916\n26#5:917\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n619#1:888,9\n636#1:897,9\n640#1:906,9\n688#1:915\n688#1:916\n885#1:917\n*E\n"})
/* compiled from: TrieNode.kt */
public final class TrieNode<K, V> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;

    /* compiled from: TrieNode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }
    }

    @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,887:1\n1#2:888\n*E\n"})
    /* compiled from: TrieNode.kt */
    public static final class ModificationResult<K, V> {
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(TrieNode<K, V> trieNode, int i) {
            C12775o.m28639i(trieNode, "node");
            this.node = trieNode;
            this.sizeDelta = i;
        }

        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final ModificationResult<K, V> replaceNode(Function1<? super TrieNode<K, V>, TrieNode<K, V>> function1) {
            C12775o.m28639i(function1, "operation");
            setNode(function1.invoke(getNode()));
            return this;
        }

        public final void setNode(TrieNode<K, V> trieNode) {
            C12775o.m28639i(trieNode, "<set-?>");
            this.node = trieNode;
        }
    }

    public TrieNode(int i, int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        C12775o.m28639i(objArr, "buffer");
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    private final void accept(C13091r<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, C11921v> rVar, int i, int i2) {
        rVar.invoke(this, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i3 = this.nodeMap;
        while (i3 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i3);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(lowestOneBit)).accept(rVar, (Integer.numberOfTrailingZeros(lowestOneBit) << i2) + i, i2 + 5);
            i3 -= lowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, MutabilityOwnership mutabilityOwnership) {
        int i5;
        Object keyAtIndex = keyAtIndex(i);
        if (keyAtIndex != null) {
            i5 = keyAtIndex.hashCode();
        } else {
            i5 = 0;
        }
        TrieNode makeNode = makeNode(i5, keyAtIndex, valueAtKeyIndex(i), i3, k, v, i4 + 5, mutabilityOwnership);
        int i6 = i2;
        int i7 = i;
        return TrieNodeKt.replaceEntryWithNode(this.buffer, i, nodeIndex$runtime_release(i2) + 1, makeNode);
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$runtime_release(i).calculateSize();
        }
        return bitCount;
    }

    private final boolean collisionContainsKey(K k) {
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, this.buffer.length), 2);
        int j = s.mo53147j();
        int k2 = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k2) || (q < 0 && k2 <= j)) {
            while (!C12775o.m28634d(k, this.buffer[j])) {
                if (j != k2) {
                    j += q;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k) {
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, this.buffer.length), 2);
        int j = s.mo53147j();
        int k2 = s.mo53148k();
        int q = s.mo53149q();
        if ((q <= 0 || j > k2) && (q >= 0 || k2 > j)) {
            return null;
        }
        while (!C12775o.m28634d(k, keyAtIndex(j))) {
            if (j == k2) {
                return null;
            }
            j += q;
        }
        return valueAtKeyIndex(j);
    }

    private final ModificationResult<K, V> collisionPut(K k, V v) {
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, this.buffer.length), 2);
        int j = s.mo53147j();
        int k2 = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k2) || (q < 0 && k2 <= j)) {
            while (!C12775o.m28634d(k, keyAtIndex(j))) {
                if (j != k2) {
                    j += q;
                }
            }
            if (v == valueAtKeyIndex(j)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C12775o.m28638h(copyOf, "copyOf(this, size)");
            copyOf[j + 1] = v;
            return new TrieNode(0, 0, copyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k, v)).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K k) {
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, this.buffer.length), 2);
        int j = s.mo53147j();
        int k2 = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k2) || (q < 0 && k2 <= j)) {
            while (!C12775o.m28634d(k, keyAtIndex(j))) {
                if (j != k2) {
                    j += q;
                }
            }
            return collisionRemoveEntryAtIndex(j);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(objArr, i));
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap != trieNode.nodeMap || this.dataMap != trieNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != trieNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNodeAt(int i) {
        if ((i & this.nodeMap) != 0) {
            return true;
        }
        return false;
    }

    private final TrieNode<K, V> insertEntryAt(int i, K k, V v) {
        return new TrieNode<>(i | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(i), k, v));
    }

    private final K keyAtIndex(int i) {
        return this.buffer[i];
    }

    private final TrieNode<K, V> makeNode(int i, K k, V v, int i2, K k2, V v2, int i3, MutabilityOwnership mutabilityOwnership) {
        int i4 = i3;
        MutabilityOwnership mutabilityOwnership2 = mutabilityOwnership;
        if (i4 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k, v, k2, v2}, mutabilityOwnership2);
        }
        int i5 = i;
        int indexSegment = TrieNodeKt.indexSegment(i, i4);
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i4);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, indexSegment < indexSegment2 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, mutabilityOwnership2);
        }
        return new TrieNode<>(0, 1 << indexSegment, new Object[]{makeNode(i, k, v, i2, k2, v2, i4 + 5, mutabilityOwnership)}, mutabilityOwnership2);
    }

    private final TrieNode<K, V> moveEntryToNode(int i, int i2, int i3, K k, V v, int i4) {
        return new TrieNode<>(this.dataMap ^ i2, i2 | this.nodeMap, bufferMoveEntryToNode(i, i2, i3, k, v, i4, (MutabilityOwnership) null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K k, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, this.buffer.length), 2);
        int j = s.mo53147j();
        int k2 = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k2) || (q < 0 && k2 <= j)) {
            while (!C12775o.m28634d(k, keyAtIndex(j))) {
                if (j != k2) {
                    j += q;
                }
            }
            persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(j));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership$runtime_release()) {
                this.buffer[j + 1] = v;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C12775o.m28638h(copyOf, "copyOf(this, size)");
            copyOf[j + 1] = v;
            return new TrieNode<>(0, 0, copyOf, persistentHashMapBuilder.getOwnership$runtime_release());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k, v), persistentHashMapBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.nodeMap == 0) {
            z = true;
        } else {
            z = false;
        }
        CommonFunctionsKt.m35307assert(z);
        if (this.dataMap == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        CommonFunctionsKt.m35307assert(z2);
        if (trieNode.nodeMap == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        CommonFunctionsKt.m35307assert(z3);
        if (trieNode.dataMap == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        CommonFunctionsKt.m35307assert(z4);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        int length = this.buffer.length;
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, trieNode.buffer.length), 2);
        int j = s.mo53147j();
        int k = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
            while (true) {
                if (!collisionContainsKey(trieNode.buffer[j])) {
                    Object[] objArr2 = trieNode.buffer;
                    copyOf[length] = objArr2[j];
                    copyOf[length + 1] = objArr2[j + 1];
                    length += 2;
                } else {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
                if (j == k) {
                    break;
                }
                j += q;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == trieNode.buffer.length) {
            return trieNode;
        }
        if (length == copyOf.length) {
            return new TrieNode<>(0, 0, copyOf, mutabilityOwnership);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        C12775o.m28638h(copyOf2, "copyOf(this, newSize)");
        return new TrieNode<>(0, 0, copyOf2, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, this.buffer.length), 2);
        int j = s.mo53147j();
        int k2 = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k2) || (q < 0 && k2 <= j)) {
            while (!C12775o.m28634d(k, keyAtIndex(j))) {
                if (j != k2) {
                    j += q;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(j, persistentHashMapBuilder);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != persistentHashMapBuilder.getOwnership$runtime_release()) {
            return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(this.buffer, i), persistentHashMapBuilder.getOwnership$runtime_release());
        }
        this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, i);
        return this;
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i, K k, V v, MutabilityOwnership mutabilityOwnership) {
        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k, v);
            this.dataMap = i | this.dataMap;
            return this;
        }
        return new TrieNode<>(i | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k, v), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = bufferMoveEntryToNode(i, i2, i3, k, v, i4, mutabilityOwnership);
            this.dataMap ^= i2;
            this.nodeMap |= i2;
            return this;
        }
        return new TrieNode<>(this.dataMap ^ i2, i2 | this.nodeMap, bufferMoveEntryToNode(i, i2, i3, k, v, i4, mutabilityOwnership), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i, int i2, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int i3;
        int i4;
        TrieNode<K, V> trieNode2 = trieNode;
        int i5 = i;
        DeltaCounter deltaCounter2 = deltaCounter;
        int i6 = 0;
        if (hasNodeAt(i5)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i5));
            if (trieNode.hasNodeAt(i)) {
                return nodeAtIndex$runtime_release.mutablePutAll(trieNode2.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i)), i2 + 5, deltaCounter2, persistentHashMapBuilder);
            }
            PersistentHashMapBuilder<K, V> persistentHashMapBuilder2 = persistentHashMapBuilder;
            if (!trieNode.hasEntryAt$runtime_release(i)) {
                return nodeAtIndex$runtime_release;
            }
            int entryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(i);
            K keyAtIndex = trieNode2.keyAtIndex(entryKeyIndex$runtime_release);
            V valueAtKeyIndex = trieNode2.valueAtKeyIndex(entryKeyIndex$runtime_release);
            int size = persistentHashMapBuilder.size();
            if (keyAtIndex != null) {
                i6 = keyAtIndex.hashCode();
            }
            TrieNode<K, V> mutablePut = nodeAtIndex$runtime_release.mutablePut(i6, keyAtIndex, valueAtKeyIndex, i2 + 5, persistentHashMapBuilder);
            if (persistentHashMapBuilder.size() != size) {
                return mutablePut;
            }
            deltaCounter2.setCount(deltaCounter.getCount() + 1);
            return mutablePut;
        }
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder3 = persistentHashMapBuilder;
        if (trieNode.hasNodeAt(i)) {
            TrieNode<K, V> nodeAtIndex$runtime_release2 = trieNode2.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i));
            if (hasEntryAt$runtime_release(i5)) {
                int entryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i5);
                Object keyAtIndex2 = keyAtIndex(entryKeyIndex$runtime_release2);
                if (keyAtIndex2 != null) {
                    i4 = keyAtIndex2.hashCode();
                } else {
                    i4 = 0;
                }
                int i7 = i2 + 5;
                if (nodeAtIndex$runtime_release2.containsKey(i4, keyAtIndex2, i7)) {
                    deltaCounter2.setCount(deltaCounter.getCount() + 1);
                } else {
                    Object valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime_release2);
                    if (keyAtIndex2 != null) {
                        i6 = keyAtIndex2.hashCode();
                    }
                    return nodeAtIndex$runtime_release2.mutablePut(i6, keyAtIndex2, valueAtKeyIndex2, i7, persistentHashMapBuilder);
                }
            }
            return nodeAtIndex$runtime_release2;
        }
        int entryKeyIndex$runtime_release3 = entryKeyIndex$runtime_release(i5);
        Object keyAtIndex3 = keyAtIndex(entryKeyIndex$runtime_release3);
        Object valueAtKeyIndex3 = valueAtKeyIndex(entryKeyIndex$runtime_release3);
        int entryKeyIndex$runtime_release4 = trieNode.entryKeyIndex$runtime_release(i);
        K keyAtIndex4 = trieNode2.keyAtIndex(entryKeyIndex$runtime_release4);
        V valueAtKeyIndex4 = trieNode2.valueAtKeyIndex(entryKeyIndex$runtime_release4);
        if (keyAtIndex3 != null) {
            i3 = keyAtIndex3.hashCode();
        } else {
            i3 = 0;
        }
        if (keyAtIndex4 != null) {
            i6 = keyAtIndex4.hashCode();
        }
        return makeNode(i3, keyAtIndex3, valueAtKeyIndex3, i6, keyAtIndex4, valueAtKeyIndex4, i2 + 5, persistentHashMapBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership$runtime_release()) {
            this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, i);
            this.dataMap ^= i2;
            return this;
        }
        return new TrieNode<>(i2 ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(this.buffer, i), persistentHashMapBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.removeNodeAtIndex(objArr, i);
            this.nodeMap ^= i2;
            return this;
        }
        return new TrieNode<>(this.dataMap, i2 ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, i), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i, int i2, MutabilityOwnership mutabilityOwnership) {
        if (trieNode2 == null) {
            return mutableRemoveNodeAtIndex(i, i2, mutabilityOwnership);
        }
        if (this.ownedBy == mutabilityOwnership || trieNode != trieNode2) {
            return mutableUpdateNodeAtIndex(i, trieNode2, mutabilityOwnership);
        }
        return this;
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        } else if (this.ownedBy == mutabilityOwnership) {
            objArr[i] = trieNode;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C12775o.m28638h(copyOf, "copyOf(this, size)");
            copyOf[i] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, mutabilityOwnership);
        }
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership$runtime_release()) {
            this.buffer[i + 1] = v;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i, int i2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(i2 ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(objArr, i));
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i, int i2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, i2 ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, i));
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i, int i2) {
        if (trieNode2 == null) {
            return removeNodeAtIndex(i, i2);
        }
        if (trieNode != trieNode2) {
            return updateNodeAtIndex(i, i2, trieNode2);
        }
        return this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i, int i2, TrieNode<K, V> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length != 2 || trieNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            copyOf[i] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
        } else if (this.buffer.length == 1) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        } else {
            return new TrieNode<>(this.dataMap ^ i2, i2 ^ this.nodeMap, TrieNodeKt.replaceNodeWithEntry(this.buffer, i, entryKeyIndex$runtime_release(i2), objArr[0], objArr[1]));
        }
    }

    private final TrieNode<K, V> updateValueAtIndex(int i, V v) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final V valueAtKeyIndex(int i) {
        return this.buffer[i + 1];
    }

    public final void accept$runtime_release(C13091r<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, C11921v> rVar) {
        C12775o.m28639i(rVar, "visitor");
        accept(rVar, 0, 0);
    }

    public final boolean containsKey(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            return C12775o.m28634d(k, keyAtIndex(entryKeyIndex$runtime_release(indexSegment)));
        }
        if (!hasNodeAt(indexSegment)) {
            return false;
        }
        TrieNode nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
        if (i2 == 30) {
            return nodeAtIndex$runtime_release.collisionContainsKey(k);
        }
        return nodeAtIndex$runtime_release.containsKey(i, k, i2 + 5);
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int i) {
        return Integer.bitCount((i - 1) & this.dataMap) * 2;
    }

    public final V get(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (C12775o.m28634d(k, keyAtIndex(entryKeyIndex$runtime_release))) {
                return valueAtKeyIndex(entryKeyIndex$runtime_release);
            }
            return null;
        } else if (!hasNodeAt(indexSegment)) {
            return null;
        } else {
            TrieNode nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            if (i2 == 30) {
                return nodeAtIndex$runtime_release.collisionGet(k);
            }
            return nodeAtIndex$runtime_release.get(i, k, i2 + 5);
        }
    }

    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int i) {
        if ((i & this.dataMap) != 0) {
            return true;
        }
        return false;
    }

    public final TrieNode<K, V> mutablePut(int i, K k, V v, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> trieNode;
        C12775o.m28639i(persistentHashMapBuilder, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (C12775o.m28634d(k, keyAtIndex(entryKeyIndex$runtime_release))) {
                persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(entryKeyIndex$runtime_release));
                if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v) {
                    return this;
                }
                return mutableUpdateValueAtIndex(entryKeyIndex$runtime_release, v, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i, k, v, i2, persistentHashMapBuilder.getOwnership$runtime_release());
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                trieNode = nodeAtIndex$runtime_release.mutableCollisionPut(k, v, persistentHashMapBuilder);
            } else {
                trieNode = nodeAtIndex$runtime_release.mutablePut(i, k, v, i2 + 5, persistentHashMapBuilder);
            }
            if (nodeAtIndex$runtime_release == trieNode) {
                return this;
            }
            return mutableUpdateNodeAtIndex(nodeIndex$runtime_release, trieNode, persistentHashMapBuilder.getOwnership$runtime_release());
        } else {
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableInsertEntryAt(indexSegment, k, v, persistentHashMapBuilder.getOwnership$runtime_release());
        }
    }

    public final TrieNode<K, V> mutablePutAll(TrieNode<K, V> trieNode, int i, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        boolean z;
        TrieNode trieNode2;
        TrieNode<K, V> trieNode3 = trieNode;
        DeltaCounter deltaCounter2 = deltaCounter;
        C12775o.m28639i(trieNode3, "otherNode");
        C12775o.m28639i(deltaCounter2, "intersectionCounter");
        C12775o.m28639i(persistentHashMapBuilder, "mutator");
        if (this == trieNode3) {
            deltaCounter2.plusAssign(calculateSize());
            return this;
        } else if (i > 30) {
            return mutableCollisionPutAll(trieNode3, deltaCounter2, persistentHashMapBuilder.getOwnership$runtime_release());
        } else {
            int i2 = this.nodeMap | trieNode3.nodeMap;
            int i3 = this.dataMap;
            int i4 = trieNode3.dataMap;
            int i5 = i3 & i4;
            int i6 = (i3 ^ i4) & (~i2);
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                if (C12775o.m28634d(keyAtIndex(entryKeyIndex$runtime_release(lowestOneBit)), trieNode3.keyAtIndex(trieNode3.entryKeyIndex$runtime_release(lowestOneBit)))) {
                    i6 |= lowestOneBit;
                } else {
                    i2 |= lowestOneBit;
                }
                i5 ^= lowestOneBit;
            }
            int i7 = 0;
            if ((i2 & i6) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (C12775o.m28634d(this.ownedBy, persistentHashMapBuilder.getOwnership$runtime_release()) && this.dataMap == i6 && this.nodeMap == i2) {
                    trieNode2 = this;
                } else {
                    trieNode2 = new TrieNode(i6, i2, new Object[((Integer.bitCount(i6) * 2) + Integer.bitCount(i2))]);
                }
                int i8 = i2;
                int i9 = 0;
                while (i8 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i8);
                    Object[] objArr = trieNode2.buffer;
                    objArr[(objArr.length - 1) - i9] = mutablePutAllFromOtherNodeCell(trieNode, lowestOneBit2, i, deltaCounter, persistentHashMapBuilder);
                    i9++;
                    i8 ^= lowestOneBit2;
                }
                while (i6 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i6);
                    int i10 = i7 * 2;
                    if (!trieNode3.hasEntryAt$runtime_release(lowestOneBit3)) {
                        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(lowestOneBit3);
                        trieNode2.buffer[i10] = keyAtIndex(entryKeyIndex$runtime_release);
                        trieNode2.buffer[i10 + 1] = valueAtKeyIndex(entryKeyIndex$runtime_release);
                    } else {
                        int entryKeyIndex$runtime_release2 = trieNode3.entryKeyIndex$runtime_release(lowestOneBit3);
                        trieNode2.buffer[i10] = trieNode3.keyAtIndex(entryKeyIndex$runtime_release2);
                        trieNode2.buffer[i10 + 1] = trieNode3.valueAtKeyIndex(entryKeyIndex$runtime_release2);
                        if (hasEntryAt$runtime_release(lowestOneBit3)) {
                            deltaCounter2.setCount(deltaCounter.getCount() + 1);
                        }
                    }
                    i7++;
                    i6 ^= lowestOneBit3;
                }
                if (elementsIdentityEquals(trieNode2)) {
                    return this;
                }
                if (trieNode3.elementsIdentityEquals(trieNode2)) {
                    return trieNode3;
                }
                return trieNode2;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final TrieNode<K, V> mutableRemove(int i, K k, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> trieNode;
        C12775o.m28639i(persistentHashMapBuilder, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return C12775o.m28634d(k, keyAtIndex(entryKeyIndex$runtime_release)) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, persistentHashMapBuilder) : this;
        } else if (!hasNodeAt(indexSegment)) {
            return this;
        } else {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                trieNode = nodeAtIndex$runtime_release.mutableCollisionRemove(k, persistentHashMapBuilder);
            } else {
                trieNode = nodeAtIndex$runtime_release.mutableRemove(i, k, i2 + 5, persistentHashMapBuilder);
            }
            return mutableReplaceNode(nodeAtIndex$runtime_release, trieNode, nodeIndex$runtime_release, indexSegment, persistentHashMapBuilder.getOwnership$runtime_release());
        }
    }

    public final TrieNode<K, V> nodeAtIndex$runtime_release(int i) {
        Object obj = this.buffer[i];
        C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime_release(int i) {
        return (this.buffer.length - 1) - Integer.bitCount((i - 1) & this.nodeMap);
    }

    public final ModificationResult<K, V> put(int i, K k, V v, int i2) {
        ModificationResult<K, V> modificationResult;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (!C12775o.m28634d(k, keyAtIndex(entryKeyIndex$runtime_release))) {
                return moveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i, k, v, i2).asInsertResult();
            }
            if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v) {
                return null;
            }
            return updateValueAtIndex(entryKeyIndex$runtime_release, v).asUpdateResult();
        } else if (!hasNodeAt(indexSegment)) {
            return insertEntryAt(indexSegment, k, v).asInsertResult();
        } else {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                modificationResult = nodeAtIndex$runtime_release.collisionPut(k, v);
                if (modificationResult == null) {
                    return null;
                }
            } else {
                modificationResult = nodeAtIndex$runtime_release.put(i, k, v, i2 + 5);
                if (modificationResult == null) {
                    return null;
                }
            }
            modificationResult.setNode(updateNodeAtIndex(nodeIndex$runtime_release, indexSegment, modificationResult.getNode()));
            return modificationResult;
        }
    }

    public final TrieNode<K, V> remove(int i, K k, int i2) {
        TrieNode trieNode;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return C12775o.m28634d(k, keyAtIndex(entryKeyIndex$runtime_release)) ? removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment) : this;
        } else if (!hasNodeAt(indexSegment)) {
            return this;
        } else {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                trieNode = nodeAtIndex$runtime_release.collisionRemove(k);
            } else {
                trieNode = nodeAtIndex$runtime_release.remove(i, k, i2 + 5);
            }
            return replaceNode(nodeAtIndex$runtime_release, trieNode, nodeIndex$runtime_release, indexSegment);
        }
    }

    private final TrieNode<K, V> collisionRemove(K k, V v) {
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, this.buffer.length), 2);
        int j = s.mo53147j();
        int k2 = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k2) || (q < 0 && k2 <= j)) {
            while (true) {
                if (!C12775o.m28634d(k, keyAtIndex(j)) || !C12775o.m28634d(v, valueAtKeyIndex(j))) {
                    if (j == k2) {
                        break;
                    }
                    j += q;
                } else {
                    return collisionRemoveEntryAtIndex(j);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, this.buffer.length), 2);
        int j = s.mo53147j();
        int k2 = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k2) || (q < 0 && k2 <= j)) {
            while (true) {
                if (!C12775o.m28634d(k, keyAtIndex(j)) || !C12775o.m28634d(v, valueAtKeyIndex(j))) {
                    if (j == k2) {
                        break;
                    }
                    j += q;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(j, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrieNode(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, (MutabilityOwnership) null);
        C12775o.m28639i(objArr, "buffer");
    }

    public final TrieNode<K, V> mutableRemove(int i, K k, V v, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> trieNode;
        K k2 = k;
        V v2 = v;
        int i3 = i2;
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder2 = persistentHashMapBuilder;
        C12775o.m28639i(persistentHashMapBuilder2, "mutator");
        int i4 = i;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (!C12775o.m28634d(k, keyAtIndex(entryKeyIndex$runtime_release)) || !C12775o.m28634d(v, valueAtKeyIndex(entryKeyIndex$runtime_release))) ? this : mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, persistentHashMapBuilder2);
        } else if (!hasNodeAt(indexSegment)) {
            return this;
        } else {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i3 == 30) {
                trieNode = nodeAtIndex$runtime_release.mutableCollisionRemove(k, v, persistentHashMapBuilder2);
            } else {
                trieNode = nodeAtIndex$runtime_release.mutableRemove(i, k, v, i3 + 5, persistentHashMapBuilder);
            }
            return mutableReplaceNode(nodeAtIndex$runtime_release, trieNode, nodeIndex$runtime_release, indexSegment, persistentHashMapBuilder.getOwnership$runtime_release());
        }
    }

    public final TrieNode<K, V> remove(int i, K k, V v, int i2) {
        TrieNode trieNode;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (!C12775o.m28634d(k, keyAtIndex(entryKeyIndex$runtime_release)) || !C12775o.m28634d(v, valueAtKeyIndex(entryKeyIndex$runtime_release))) ? this : removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment);
        } else if (!hasNodeAt(indexSegment)) {
            return this;
        } else {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                trieNode = nodeAtIndex$runtime_release.collisionRemove(k, v);
            } else {
                trieNode = nodeAtIndex$runtime_release.remove(i, k, v, i2 + 5);
            }
            return replaceNode(nodeAtIndex$runtime_release, trieNode, nodeIndex$runtime_release, indexSegment);
        }
    }
}
