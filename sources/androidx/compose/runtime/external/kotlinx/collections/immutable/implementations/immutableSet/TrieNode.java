package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12541#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
/* compiled from: TrieNode.kt */
public final class TrieNode<E> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final TrieNode EMPTY = new TrieNode(0, new Object[0]);
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;

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

    public TrieNode(int i, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        C12775o.m28639i(objArr, "buffer");
        this.bitmap = i;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    private final TrieNode<E> addElementAt(int i, E e) {
        return new TrieNode<>(i | this.bitmap, TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(i), e));
    }

    private final int calculateSize() {
        int i;
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int i2 = 0;
        for (Object obj : this.buffer) {
            if (obj instanceof TrieNode) {
                i = ((TrieNode) obj).calculateSize();
            } else {
                i = 1;
            }
            i2 += i;
        }
        return i2;
    }

    private final TrieNode<E> collisionAdd(E e) {
        if (collisionContainsElement(e)) {
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, e));
    }

    private final boolean collisionContainsElement(E e) {
        return C12710p.m28377E(this.buffer, e);
    }

    private final TrieNode<E> collisionRemove(E e) {
        int Q = C12710p.m28389Q(this.buffer, e);
        if (Q != -1) {
            return collisionRemoveElementAtIndex(Q);
        }
        return this;
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i) {
        return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, i));
    }

    private final E elementAtIndex(int i) {
        return this.buffer[i];
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
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

    private final boolean hasNoCellAt(int i) {
        if ((i & this.bitmap) == 0) {
            return true;
        }
        return false;
    }

    private final TrieNode<E> makeNode(int i, E e, int i2, E e2, int i3, MutabilityOwnership mutabilityOwnership) {
        int i4 = i3;
        MutabilityOwnership mutabilityOwnership2 = mutabilityOwnership;
        if (i4 > 30) {
            return new TrieNode<>(0, new Object[]{e, e2}, mutabilityOwnership2);
        }
        int i5 = i;
        int indexSegment = TrieNodeKt.indexSegment(i, i4);
        int i6 = i2;
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i4);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), indexSegment < indexSegment2 ? new Object[]{e, e2} : new Object[]{e2, e}, mutabilityOwnership2);
        }
        return new TrieNode<>(1 << indexSegment, new Object[]{makeNode(i, e, i2, e2, i4 + 5, mutabilityOwnership)}, mutabilityOwnership2);
    }

    private final TrieNode<E> makeNodeAtIndex(int i, int i2, E e, int i3, MutabilityOwnership mutabilityOwnership) {
        int i4;
        Object elementAtIndex = elementAtIndex(i);
        if (elementAtIndex != null) {
            i4 = elementAtIndex.hashCode();
        } else {
            i4 = 0;
        }
        return makeNode(i4, elementAtIndex, i2, e, i3 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i, int i2, E e, int i3) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        copyOf[i] = makeNodeAtIndex(i, i2, e, i3, (MutabilityOwnership) null);
        return new TrieNode<>(this.bitmap, copyOf);
    }

    private final TrieNode<E> mutableAddElementAt(int i, E e, MutabilityOwnership mutabilityOwnership) {
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e);
            this.bitmap = i | this.bitmap;
            return this;
        }
        return new TrieNode<>(i | this.bitmap, TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e), mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionAdd(E e, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        if (collisionContainsElement(e)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        if (this.ownedBy != persistentHashSetBuilder.getOwnership$runtime_release()) {
            return new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, e), persistentHashSetBuilder.getOwnership$runtime_release());
        }
        this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, 0, e);
        return this;
    }

    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        boolean z;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i = 0;
        for (int i2 = 0; i2 < objArr2.length; i2++) {
            boolean z2 = true;
            if (i <= i2) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m35307assert(z);
            if (!collisionContainsElement(objArr2[i2])) {
                copyOf[length + i] = objArr2[i2];
                i++;
                if (length + i > copyOf.length) {
                    z2 = false;
                }
                CommonFunctionsKt.m35307assert(z2);
            }
        }
        int length2 = i + this.buffer.length;
        deltaCounter.plusAssign(copyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        }
        if (!C12775o.m28634d(this.ownedBy, mutabilityOwnership)) {
            return new TrieNode<>(0, copyOf, mutabilityOwnership);
        }
        this.buffer = copyOf;
        return this;
    }

    private final TrieNode<E> mutableCollisionRemove(E e, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int Q = C12710p.m28389Q(this.buffer, e);
        if (Q == -1) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
        return mutableCollisionRemoveElementAtIndex(Q, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        boolean z;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        if (C12775o.m28634d(mutabilityOwnership, this.ownedBy)) {
            objArr = this.buffer;
        } else {
            objArr = new Object[this.buffer.length];
        }
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= objArr2.length) {
                break;
            }
            if (i2 <= i) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m35307assert(z);
            if (!trieNode.collisionContainsElement(objArr2[i])) {
                objArr[0 + i2] = objArr2[i];
                i2++;
                if (0 + i2 > objArr.length) {
                    z2 = false;
                }
                CommonFunctionsKt.m35307assert(z2);
            }
            i++;
        }
        deltaCounter.plusAssign(this.buffer.length - i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, i), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return this;
    }

    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        boolean z;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        if (C12775o.m28634d(mutabilityOwnership, this.ownedBy)) {
            objArr = this.buffer;
        } else {
            objArr = new Object[Math.min(this.buffer.length, trieNode.buffer.length)];
        }
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= objArr2.length) {
                break;
            }
            if (i2 <= i) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m35307assert(z);
            if (trieNode.collisionContainsElement(objArr2[i])) {
                objArr[0 + i2] = objArr2[i];
                i2++;
                if (0 + i2 > objArr.length) {
                    z2 = false;
                }
                CommonFunctionsKt.m35307assert(z2);
            }
            i++;
        }
        deltaCounter.plusAssign(i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (i2 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableMoveElementToNode(int i, int i2, E e, int i3, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i] = makeNodeAtIndex(i, i2, e, i3, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        copyOf[i] = makeNodeAtIndex(i, i2, e, i3, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, i);
            this.bitmap ^= i2;
            return this;
        }
        return new TrieNode<>(i2 ^ this.bitmap, TrieNodeKt.removeCellAtIndex(this.buffer, i), mutabilityOwnership);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableUpdateNodeAtIndex(int r4, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r5, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r6) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r5.buffer
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x0018
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r1 != 0) goto L_0x0018
            java.lang.Object[] r1 = r3.buffer
            int r1 = r1.length
            if (r1 != r2) goto L_0x0017
            int r4 = r3.bitmap
            r5.bitmap = r4
            return r5
        L_0x0017:
            r5 = r0
        L_0x0018:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r0 = r3.ownedBy
            if (r0 != r6) goto L_0x0021
            java.lang.Object[] r6 = r3.buffer
            r6[r4] = r5
            return r3
        L_0x0021:
            java.lang.Object[] r0 = r3.buffer
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(this, size)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            r0[r4] = r5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r4 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            int r5 = r3.bitmap
            r4.<init>(r5, r0, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableUpdateNodeAtIndex(int, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode");
    }

    private final TrieNode<E> nodeAtIndex(int i) {
        Object obj = this.buffer[i];
        C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode<E> removeCellAtIndex(int i, int i2) {
        return new TrieNode<>(i2 ^ this.bitmap, TrieNodeKt.removeCellAtIndex(this.buffer, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> updateNodeAtIndex(int r4, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r5) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r5.buffer
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x0018
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r1 != 0) goto L_0x0018
            java.lang.Object[] r1 = r3.buffer
            int r1 = r1.length
            if (r1 != r2) goto L_0x0017
            int r4 = r3.bitmap
            r5.bitmap = r4
            return r5
        L_0x0017:
            r5 = r0
        L_0x0018:
            java.lang.Object[] r0 = r3.buffer
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(this, size)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            r0[r4] = r5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r4 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            int r5 = r3.bitmap
            r4.<init>(r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.updateNodeAtIndex(int, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode");
    }

    public final TrieNode<E> add(int i, E e, int i2) {
        TrieNode trieNode;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, e);
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                trieNode = nodeAtIndex.collisionAdd(e);
            } else {
                trieNode = nodeAtIndex.add(i, e, i2 + 5);
            }
            if (nodeAtIndex == trieNode) {
                return this;
            }
            return updateNodeAtIndex(indexOfCellAt$runtime_release, trieNode);
        } else if (C12775o.m28634d(e, obj)) {
            return this;
        } else {
            return moveElementToNode(indexOfCellAt$runtime_release, i, e, i2);
        }
    }

    public final boolean contains(int i, E e, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            return C12775o.m28634d(e, obj);
        }
        TrieNode nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
        if (i2 == 30) {
            return nodeAtIndex.collisionContainsElement(e);
        }
        return nodeAtIndex.contains(i, e, i2 + 5);
    }

    public final boolean containsAll(TrieNode<E> trieNode, int i) {
        int i2;
        C12775o.m28639i(trieNode, "otherNode");
        if (this == trieNode) {
            return true;
        }
        if (i > 30) {
            for (Object E : trieNode.buffer) {
                if (!C12710p.m28377E(this.buffer, E)) {
                    return false;
                }
            }
            return true;
        }
        int i3 = this.bitmap;
        int i4 = trieNode.bitmap;
        int i5 = i3 & i4;
        if (i5 != i4) {
            return false;
        }
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj = this.buffer[indexOfCellAt$runtime_release];
            Object obj2 = trieNode.buffer[indexOfCellAt$runtime_release2];
            boolean z = obj instanceof TrieNode;
            boolean z2 = obj2 instanceof TrieNode;
            if (z && z2) {
                C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                C12775o.m28637g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj).containsAll((TrieNode) obj2, i + 5)) {
                    return false;
                }
            } else if (z) {
                C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                TrieNode trieNode2 = (TrieNode) obj;
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                if (!trieNode2.contains(i2, obj2, i + 5)) {
                    return false;
                }
            } else if (z2 || !C12775o.m28634d(obj, obj2)) {
                return false;
            }
            i5 ^= lowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final int indexOfCellAt$runtime_release(int i) {
        return Integer.bitCount((i - 1) & this.bitmap);
    }

    public final TrieNode<E> mutableAdd(int i, E e, int i2, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<?> trieNode;
        C12775o.m28639i(persistentHashSetBuilder, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableAddElementAt(indexSegment, e, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<?> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                trieNode = nodeAtIndex.mutableCollisionAdd(e, persistentHashSetBuilder);
            } else {
                trieNode = nodeAtIndex.mutableAdd(i, e, i2 + 5, persistentHashSetBuilder);
            }
            if (nodeAtIndex == trieNode) {
                return this;
            }
            return mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, trieNode, persistentHashSetBuilder.getOwnership$runtime_release());
        } else if (C12775o.m28634d(e, obj)) {
            return this;
        } else {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableMoveElementToNode(indexOfCellAt$runtime_release, i, e, i2, persistentHashSetBuilder.getOwnership$runtime_release());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableAddAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r20, int r21, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r22, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r23) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            java.lang.String r0 = "otherNode"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "intersectionSizeRef"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "mutator"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            if (r7 != r8) goto L_0x0028
            int r0 = r22.getCount()
            int r1 = r19.calculateSize()
            int r0 = r0 + r1
            r10.setCount(r0)
            return r7
        L_0x0028:
            r0 = 30
            if (r9 <= r0) goto L_0x0035
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r0 = r23.getOwnership$runtime_release()
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r0 = r7.mutableCollisionAddAll(r8, r10, r0)
            return r0
        L_0x0035:
            int r0 = r7.bitmap
            int r1 = r8.bitmap
            r1 = r1 | r0
            if (r1 != r0) goto L_0x004a
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r0 = r7.ownedBy
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r2 = r23.getOwnership$runtime_release()
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r2)
            if (r0 == 0) goto L_0x004a
            r12 = r7
            goto L_0x005a
        L_0x004a:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r0 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            int r2 = java.lang.Integer.bitCount(r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r3 = r23.getOwnership$runtime_release()
            r0.<init>(r1, r2, r3)
            r12 = r0
        L_0x005a:
            r13 = 0
            r14 = r1
            r15 = r13
        L_0x005d:
            if (r14 == 0) goto L_0x0144
            int r6 = java.lang.Integer.lowestOneBit(r14)
            int r0 = r7.indexOfCellAt$runtime_release(r6)
            int r1 = r8.indexOfCellAt$runtime_release(r6)
            java.lang.Object[] r5 = r12.buffer
            boolean r2 = r7.hasNoCellAt(r6)
            if (r2 == 0) goto L_0x007d
            java.lang.Object[] r0 = r8.buffer
            r0 = r0[r1]
        L_0x0077:
            r18 = r5
            r16 = r6
            goto L_0x013c
        L_0x007d:
            boolean r2 = r8.hasNoCellAt(r6)
            if (r2 == 0) goto L_0x0088
            java.lang.Object[] r1 = r7.buffer
            r0 = r1[r0]
            goto L_0x0077
        L_0x0088:
            java.lang.Object[] r2 = r7.buffer
            r2 = r2[r0]
            java.lang.Object[] r0 = r8.buffer
            r4 = r0[r1]
            boolean r0 = r2 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            boolean r1 = r4 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>"
            if (r0 == 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00ab
            kotlin.jvm.internal.C12775o.m28637g(r2, r3)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r2 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r2
            kotlin.jvm.internal.C12775o.m28637g(r4, r3)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r4 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r4
            int r0 = r9 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r0 = r2.mutableAddAll(r4, r0, r10, r11)
            goto L_0x0077
        L_0x00ab:
            if (r0 == 0) goto L_0x00d7
            kotlin.jvm.internal.C12775o.m28637g(r2, r3)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r2 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r2
            int r0 = r23.size()
            if (r4 == 0) goto L_0x00bd
            int r1 = r4.hashCode()
            goto L_0x00be
        L_0x00bd:
            r1 = r13
        L_0x00be:
            int r3 = r9 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r1 = r2.mutableAdd(r1, r4, r3, r11)
            int r2 = r23.size()
            if (r2 != r0) goto L_0x00d3
            int r0 = r22.getCount()
            int r0 = r0 + 1
            r10.setCount(r0)
        L_0x00d3:
            ef.v r0 = p336ef.C11921v.f18618a
        L_0x00d5:
            r0 = r1
            goto L_0x0077
        L_0x00d7:
            if (r1 == 0) goto L_0x0102
            kotlin.jvm.internal.C12775o.m28637g(r4, r3)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r4 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r4
            int r0 = r23.size()
            if (r2 == 0) goto L_0x00e9
            int r1 = r2.hashCode()
            goto L_0x00ea
        L_0x00e9:
            r1 = r13
        L_0x00ea:
            int r3 = r9 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r1 = r4.mutableAdd(r1, r2, r3, r11)
            int r2 = r23.size()
            if (r2 != r0) goto L_0x00ff
            int r0 = r22.getCount()
            int r0 = r0 + 1
            r10.setCount(r0)
        L_0x00ff:
            ef.v r0 = p336ef.C11921v.f18618a
            goto L_0x00d5
        L_0x0102:
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r2, r4)
            if (r0 == 0) goto L_0x0116
            int r0 = r22.getCount()
            int r0 = r0 + 1
            r10.setCount(r0)
            ef.v r0 = p336ef.C11921v.f18618a
            r0 = r2
            goto L_0x0077
        L_0x0116:
            if (r2 == 0) goto L_0x011e
            int r0 = r2.hashCode()
            r1 = r0
            goto L_0x011f
        L_0x011e:
            r1 = r13
        L_0x011f:
            if (r4 == 0) goto L_0x0127
            int r0 = r4.hashCode()
            r3 = r0
            goto L_0x0128
        L_0x0127:
            r3 = r13
        L_0x0128:
            int r16 = r9 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r17 = r23.getOwnership$runtime_release()
            r0 = r19
            r18 = r5
            r5 = r16
            r16 = r6
            r6 = r17
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r0 = r0.makeNode(r1, r2, r3, r4, r5, r6)
        L_0x013c:
            r18[r15] = r0
            int r15 = r15 + 1
            r14 = r14 ^ r16
            goto L_0x005d
        L_0x0144:
            boolean r0 = r7.elementsIdentityEquals(r12)
            if (r0 == 0) goto L_0x014c
            r12 = r7
            goto L_0x0153
        L_0x014c:
            boolean r0 = r8.elementsIdentityEquals(r12)
            if (r0 == 0) goto L_0x0153
            r12 = r8
        L_0x0153:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode");
    }

    public final TrieNode<E> mutableRemove(int i, E e, int i2, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<?> trieNode;
        C12775o.m28639i(persistentHashSetBuilder, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<?> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                trieNode = nodeAtIndex.mutableCollisionRemove(e, persistentHashSetBuilder);
            } else {
                trieNode = nodeAtIndex.mutableRemove(i, e, i2 + 5, persistentHashSetBuilder);
            }
            if (this.ownedBy == persistentHashSetBuilder.getOwnership$runtime_release() || nodeAtIndex != trieNode) {
                return mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, trieNode, persistentHashSetBuilder.getOwnership$runtime_release());
            }
            return this;
        } else if (!C12775o.m28634d(e, obj)) {
            return this;
        } else {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
            return mutableRemoveCellAtIndex(indexOfCellAt$runtime_release, indexSegment, persistentHashSetBuilder.getOwnership$runtime_release());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L_0x00ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r17, int r18, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r19, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.String r5 = "otherNode"
            kotlin.jvm.internal.C12775o.m28639i(r1, r5)
            java.lang.String r5 = "intersectionSizeRef"
            kotlin.jvm.internal.C12775o.m28639i(r3, r5)
            java.lang.String r5 = "mutator"
            kotlin.jvm.internal.C12775o.m28639i(r4, r5)
            if (r0 != r1) goto L_0x0025
            int r1 = r16.calculateSize()
            r3.plusAssign(r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r1 = EMPTY
            return r1
        L_0x0025:
            r5 = 30
            if (r2 <= r5) goto L_0x0032
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r2 = r20.getOwnership$runtime_release()
            java.lang.Object r1 = r0.mutableCollisionRemoveAll(r1, r3, r2)
            return r1
        L_0x0032:
            int r5 = r0.bitmap
            int r6 = r1.bitmap
            r5 = r5 & r6
            if (r5 != 0) goto L_0x003a
            return r0
        L_0x003a:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r6 = r0.ownedBy
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r7 = r20.getOwnership$runtime_release()
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r6, r7)
            if (r6 == 0) goto L_0x0048
            r6 = r0
            goto L_0x005f
        L_0x0048:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r6 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            int r7 = r0.bitmap
            java.lang.Object[] r8 = r0.buffer
            int r9 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            java.lang.String r9 = "copyOf(this, size)"
            kotlin.jvm.internal.C12775o.m28638h(r8, r9)
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r9 = r20.getOwnership$runtime_release()
            r6.<init>(r7, r8, r9)
        L_0x005f:
            int r7 = r0.bitmap
        L_0x0061:
            if (r5 == 0) goto L_0x00fb
            int r10 = java.lang.Integer.lowestOneBit(r5)
            int r11 = r0.indexOfCellAt$runtime_release(r10)
            int r12 = r1.indexOfCellAt$runtime_release(r10)
            java.lang.Object[] r13 = r0.buffer
            r13 = r13[r11]
            java.lang.Object[] r14 = r1.buffer
            r12 = r14[r12]
            boolean r14 = r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            boolean r15 = r12 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            java.lang.String r8 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>"
            if (r14 == 0) goto L_0x0092
            if (r15 == 0) goto L_0x0092
            kotlin.jvm.internal.C12775o.m28637g(r13, r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r13 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r13
            kotlin.jvm.internal.C12775o.m28637g(r12, r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r12 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r12
            int r8 = r2 + 5
            java.lang.Object r13 = r13.mutableRemoveAll(r12, r8, r3, r4)
            goto L_0x00ef
        L_0x0092:
            if (r14 == 0) goto L_0x00c5
            kotlin.jvm.internal.C12775o.m28637g(r13, r8)
            r8 = r13
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r8 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r8
            int r14 = r20.size()
            if (r12 == 0) goto L_0x00a5
            int r15 = r12.hashCode()
            goto L_0x00a6
        L_0x00a5:
            r15 = 0
        L_0x00a6:
            int r9 = r2 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r8 = r8.mutableRemove(r15, r12, r9, r4)
            int r9 = r20.size()
            if (r14 == r9) goto L_0x00ef
            r9 = 1
            r3.plusAssign(r9)
            java.lang.Object[] r12 = r8.buffer
            int r13 = r12.length
            if (r13 != r9) goto L_0x00c3
            r9 = 0
            r13 = r12[r9]
            boolean r9 = r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r9 != 0) goto L_0x00c3
            goto L_0x00ef
        L_0x00c3:
            r13 = r8
            goto L_0x00ef
        L_0x00c5:
            if (r15 == 0) goto L_0x00e3
            kotlin.jvm.internal.C12775o.m28637g(r12, r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r12 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r12
            if (r13 == 0) goto L_0x00d3
            int r8 = r13.hashCode()
            goto L_0x00d4
        L_0x00d3:
            r8 = 0
        L_0x00d4:
            int r9 = r2 + 5
            boolean r8 = r12.contains(r8, r13, r9)
            if (r8 == 0) goto L_0x00ef
            r8 = 1
            r3.plusAssign(r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r13 = EMPTY
            goto L_0x00ef
        L_0x00e3:
            r8 = 1
            boolean r9 = kotlin.jvm.internal.C12775o.m28634d(r13, r12)
            if (r9 == 0) goto L_0x00ef
            r3.plusAssign(r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r13 = EMPTY
        L_0x00ef:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r8 = EMPTY
            if (r13 != r8) goto L_0x00f4
            r7 = r7 ^ r10
        L_0x00f4:
            java.lang.Object[] r8 = r6.buffer
            r8[r11] = r13
            r5 = r5 ^ r10
            goto L_0x0061
        L_0x00fb:
            int r1 = java.lang.Integer.bitCount(r7)
            if (r7 != 0) goto L_0x0105
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r6 = EMPTY
            goto L_0x0174
        L_0x0105:
            int r3 = r0.bitmap
            if (r7 != r3) goto L_0x0112
            boolean r1 = r6.elementsIdentityEquals(r0)
            if (r1 == 0) goto L_0x0174
            r6 = r0
            goto L_0x0174
        L_0x0112:
            r9 = 1
            if (r1 != r9) goto L_0x0133
            if (r2 == 0) goto L_0x0133
            java.lang.Object[] r1 = r6.buffer
            int r2 = r6.indexOfCellAt$runtime_release(r7)
            r6 = r1[r2]
            boolean r1 = r6 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r1 == 0) goto L_0x0174
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r1 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r3 = 0
            r2[r3] = r6
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r3 = r20.getOwnership$runtime_release()
            r1.<init>(r7, r2, r3)
            r6 = r1
            goto L_0x0174
        L_0x0133:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object[] r3 = r6.buffer
            r5 = 0
            r6 = 0
        L_0x0139:
            int r8 = r3.length
            if (r5 >= r8) goto L_0x016b
            if (r6 > r5) goto L_0x0140
            r8 = r9
            goto L_0x0141
        L_0x0140:
            r8 = 0
        L_0x0141:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m35307assert(r8)
            r8 = r3[r5]
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode$Companion r10 = Companion
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r10 = r10.getEMPTY$runtime_release()
            if (r8 == r10) goto L_0x0150
            r8 = r9
            goto L_0x0151
        L_0x0150:
            r8 = 0
        L_0x0151:
            if (r8 == 0) goto L_0x0167
            r8 = 0
            int r10 = r8 + r6
            r11 = r3[r5]
            r2[r10] = r11
            int r6 = r6 + 1
            int r10 = r8 + r6
            if (r10 > r1) goto L_0x0162
            r10 = r9
            goto L_0x0163
        L_0x0162:
            r10 = r8
        L_0x0163:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m35307assert(r10)
            goto L_0x0168
        L_0x0167:
            r8 = 0
        L_0x0168:
            int r5 = r5 + 1
            goto L_0x0139
        L_0x016b:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r6 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r1 = r20.getOwnership$runtime_release()
            r6.<init>(r7, r2, r1)
        L_0x0174:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    public final Object mutableRetainAll(TrieNode<E> trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode trieNode2;
        TrieNode trieNode3;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        TrieNode<E> trieNode4 = trieNode;
        int i4 = i;
        DeltaCounter deltaCounter2 = deltaCounter;
        PersistentHashSetBuilder<?> persistentHashSetBuilder2 = persistentHashSetBuilder;
        C12775o.m28639i(trieNode4, "otherNode");
        C12775o.m28639i(deltaCounter2, "intersectionSizeRef");
        C12775o.m28639i(persistentHashSetBuilder2, "mutator");
        if (this == trieNode4) {
            deltaCounter2.plusAssign(calculateSize());
            return this;
        } else if (i4 > 30) {
            return mutableCollisionRetainAll(trieNode4, deltaCounter2, persistentHashSetBuilder.getOwnership$runtime_release());
        } else {
            int i5 = this.bitmap & trieNode4.bitmap;
            if (i5 == 0) {
                return EMPTY;
            }
            if (!C12775o.m28634d(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release()) || i5 != this.bitmap) {
                trieNode2 = new TrieNode(i5, new Object[Integer.bitCount(i5)], persistentHashSetBuilder.getOwnership$runtime_release());
            } else {
                trieNode2 = this;
            }
            int i6 = i5;
            int i7 = 0;
            int i8 = 0;
            while (i6 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i6);
                int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
                int indexOfCellAt$runtime_release2 = trieNode4.indexOfCellAt$runtime_release(lowestOneBit);
                Object obj = this.buffer[indexOfCellAt$runtime_release];
                Object obj2 = trieNode4.buffer[indexOfCellAt$runtime_release2];
                boolean z4 = obj instanceof TrieNode;
                boolean z5 = obj2 instanceof TrieNode;
                if (z4 && z5) {
                    C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    C12775o.m28637g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    obj = ((TrieNode) obj).mutableRetainAll((TrieNode) obj2, i4 + 5, deltaCounter2, persistentHashSetBuilder2);
                } else if (z4) {
                    C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    TrieNode trieNode5 = (TrieNode) obj;
                    if (obj2 != null) {
                        i3 = obj2.hashCode();
                    } else {
                        i3 = 0;
                    }
                    if (trieNode5.contains(i3, obj2, i4 + 5)) {
                        deltaCounter2.plusAssign(1);
                        obj = obj2;
                    } else {
                        obj = EMPTY;
                    }
                } else if (z5) {
                    C12775o.m28637g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    TrieNode trieNode6 = (TrieNode) obj2;
                    if (obj != null) {
                        i2 = obj.hashCode();
                    } else {
                        i2 = 0;
                    }
                    if (trieNode6.contains(i2, obj, i4 + 5)) {
                        deltaCounter2.plusAssign(1);
                    } else {
                        obj = EMPTY;
                    }
                } else if (C12775o.m28634d(obj, obj2)) {
                    deltaCounter2.plusAssign(1);
                } else {
                    obj = EMPTY;
                }
                if (obj != EMPTY) {
                    i7 |= lowestOneBit;
                }
                trieNode2.buffer[i8] = obj;
                i8++;
                i6 ^= lowestOneBit;
            }
            int bitCount = Integer.bitCount(i7);
            if (i7 == 0) {
                return EMPTY;
            }
            if (i7 != i5) {
                if (bitCount != 1 || i4 == 0) {
                    Object[] objArr = new Object[bitCount];
                    Object[] objArr2 = trieNode2.buffer;
                    int i9 = 0;
                    for (int i10 = 0; i10 < objArr2.length; i10++) {
                        if (i9 <= i10) {
                            z = true;
                        } else {
                            z = false;
                        }
                        CommonFunctionsKt.m35307assert(z);
                        if (objArr2[i10] != Companion.getEMPTY$runtime_release()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            objArr[0 + i9] = objArr2[i10];
                            i9++;
                            if (0 + i9 <= bitCount) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            CommonFunctionsKt.m35307assert(z3);
                        }
                    }
                    trieNode3 = new TrieNode(i7, objArr, persistentHashSetBuilder.getOwnership$runtime_release());
                } else {
                    Object obj3 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime_release(i7)];
                    if (!(obj3 instanceof TrieNode)) {
                        return obj3;
                    }
                    trieNode3 = new TrieNode(i7, new Object[]{obj3}, persistentHashSetBuilder.getOwnership$runtime_release());
                }
                return trieNode3;
            } else if (trieNode2.elementsIdentityEquals(this)) {
                return this;
            } else {
                if (trieNode2.elementsIdentityEquals(trieNode4)) {
                    return trieNode4;
                }
                return trieNode2;
            }
        }
    }

    public final TrieNode<E> remove(int i, E e, int i2) {
        TrieNode trieNode;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                trieNode = nodeAtIndex.collisionRemove(e);
            } else {
                trieNode = nodeAtIndex.remove(i, e, i2 + 5);
            }
            if (nodeAtIndex == trieNode) {
                return this;
            }
            return updateNodeAtIndex(indexOfCellAt$runtime_release, trieNode);
        } else if (C12775o.m28634d(e, obj)) {
            return removeCellAtIndex(indexOfCellAt$runtime_release, indexSegment);
        } else {
            return this;
        }
    }

    public final void setBitmap(int i) {
        this.bitmap = i;
    }

    public final void setBuffer(Object[] objArr) {
        C12775o.m28639i(objArr, "<set-?>");
        this.buffer = objArr;
    }

    public final void setOwnedBy(MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrieNode(int i, Object[] objArr) {
        this(i, objArr, (MutabilityOwnership) null);
        C12775o.m28639i(objArr, "buffer");
    }
}
