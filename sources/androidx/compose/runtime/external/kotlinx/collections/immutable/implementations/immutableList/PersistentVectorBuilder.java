package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.C12688f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12751c;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,992:1\n26#2:993\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n623#1:993\n*E\n"})
/* compiled from: PersistentVectorBuilder.kt */
public final class PersistentVectorBuilder<E> extends C12688f<E> implements PersistentList.Builder<E> {
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private Object[] root = this.vectorRoot;
    private int rootShift;
    private int size = this.vector.size();
    private Object[] tail = this.vectorTail;
    private PersistentList<? extends E> vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    public PersistentVectorBuilder(PersistentList<? extends E> persistentList, Object[] objArr, Object[] objArr2, int i) {
        C12775o.m28639i(persistentList, "vector");
        C12775o.m28639i(objArr2, "vectorTail");
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i;
    }

    private final Object[] bufferFor(int i) {
        if (rootSize() <= i) {
            return this.tail;
        }
        Object[] objArr = this.root;
        C12775o.m28636f(objArr);
        for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i, i2)];
            C12775o.m28637g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object obj2;
        int indexSegment = UtilsKt.indexSegment(i2, i);
        if (i == 0) {
            objectRef.setValue(objArr[31]);
            Object[] i3 = C12708o.m28342i(objArr, makeMutable(objArr), indexSegment + 1, indexSegment, 31);
            i3[indexSegment] = obj;
            return i3;
        }
        Object[] makeMutable = makeMutable(objArr);
        int i4 = i - 5;
        Object obj3 = makeMutable[indexSegment];
        C12775o.m28637g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = insertIntoRoot((Object[]) obj3, i4, i2, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj2 = makeMutable[indexSegment]) == null) {
                return makeMutable;
            }
            C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            makeMutable[indexSegment] = insertIntoRoot((Object[]) obj2, i4, 0, objectRef.getValue(), objectRef);
        }
        return makeMutable;
    }

    private final void insertIntoTail(Object[] objArr, int i, E e) {
        int tailSize = tailSize();
        Object[] makeMutable = makeMutable(this.tail);
        if (tailSize < 32) {
            Object[] unused = C12708o.m28342i(this.tail, makeMutable, i + 1, i, tailSize);
            makeMutable[i] = e;
            this.root = objArr;
            this.tail = makeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr2 = this.tail;
        Object obj = objArr2[31];
        Object[] unused2 = C12708o.m28342i(objArr2, makeMutable, i + 1, i, 31);
        makeMutable[i] = e;
        pushFilledTail(objArr, makeMutable, mutableBufferWith(obj));
    }

    private final boolean isMutable(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.ownership) {
            return true;
        }
        return false;
    }

    private final ListIterator<Object[]> leafBufferIterator(int i) {
        if (this.root != null) {
            int rootSize = rootSize() >> 5;
            ListImplementation.checkPositionIndex$runtime_release(i, rootSize);
            int i2 = this.rootShift;
            if (i2 == 0) {
                Object[] objArr = this.root;
                C12775o.m28636f(objArr);
                return new SingleElementListIterator(objArr, i);
            }
            Object[] objArr2 = this.root;
            C12775o.m28636f(objArr2);
            return new TrieIterator(objArr2, i, rootSize, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final Object[] makeMutable(Object[] objArr) {
        if (objArr == null) {
            return mutableBuffer();
        }
        if (isMutable(objArr)) {
            return objArr;
        }
        return C12708o.m28346m(objArr, mutableBuffer(), 0, 0, C13537l.m30882i(objArr.length, 32), 6, (Object) null);
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i) {
        if (isMutable(objArr)) {
            return C12708o.m28342i(objArr, objArr, i, 0, 32 - i);
        }
        return C12708o.m28342i(objArr, mutableBuffer(), i, 0, 32 - i);
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] objArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i2 == 0) {
            return objArr;
        } else {
            int indexSegment = UtilsKt.indexSegment(i, i2);
            Object[] objArr2 = objArr[indexSegment];
            C12775o.m28637g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object nullifyAfter = nullifyAfter(objArr2, i, i2 - 5);
            if (indexSegment < 31) {
                int i3 = indexSegment + 1;
                if (objArr[i3] != null) {
                    if (isMutable(objArr)) {
                        C12708o.m28352s(objArr, null, i3, 32);
                    }
                    objArr = C12708o.m28342i(objArr, mutableBuffer(), 0, 0, i3);
                }
            }
            if (nullifyAfter == objArr[indexSegment]) {
                return objArr;
            }
            Object[] makeMutable = makeMutable(objArr);
            makeMutable[indexSegment] = nullifyAfter;
            return makeMutable;
        }
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] objArr2;
        int indexSegment = UtilsKt.indexSegment(i2 - 1, i);
        if (i == 5) {
            objectRef.setValue(objArr[indexSegment]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[indexSegment];
            C12775o.m28637g(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = pullLastBuffer(objArr3, i - 5, i2, objectRef);
        }
        if (objArr2 == null && indexSegment == 0) {
            return null;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = objArr2;
        return makeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i;
            this.rootShift = i2;
            return;
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        C12775o.m28636f(objArr);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i2, i, objectRef);
        C12775o.m28636f(pullLastBuffer);
        Object value = objectRef.getValue();
        C12775o.m28637g(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = i;
        if (pullLastBuffer[1] == null) {
            this.root = (Object[]) pullLastBuffer[0];
            this.rootShift = i2 - 5;
            return;
        }
        this.root = pullLastBuffer;
        this.rootShift = i2;
    }

    private final Object[] pushBuffers(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        boolean z;
        if (it.hasNext()) {
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (i2 == 0) {
                return it.next();
            } else {
                Object[] makeMutable = makeMutable(objArr);
                int indexSegment = UtilsKt.indexSegment(i, i2);
                int i3 = i2 - 5;
                makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], i, i3, it);
                while (true) {
                    indexSegment++;
                    if (indexSegment >= 32 || !it.hasNext()) {
                        return makeMutable;
                    }
                    makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], 0, i3, it);
                }
                return makeMutable;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i, Object[][] objArr2) {
        Object[] objArr3;
        Iterator a = C12751c.m28576a(objArr2);
        int i2 = i >> 5;
        int i3 = this.rootShift;
        if (i2 < (1 << i3)) {
            objArr3 = pushBuffers(objArr, i, i3, a);
        } else {
            objArr3 = makeMutable(objArr);
        }
        while (a.hasNext()) {
            this.rootShift += 5;
            objArr3 = mutableBufferWith(objArr3);
            int i4 = this.rootShift;
            pushBuffers(objArr3, 1 << i4, i4, a);
        }
        return objArr3;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size2 = size() >> 5;
        int i = this.rootShift;
        if (size2 > (1 << i)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
        } else if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, i);
        Object[] makeMutable = makeMutable(objArr);
        if (i == 5) {
            makeMutable[indexSegment] = objArr2;
        } else {
            makeMutable[indexSegment] = pushTail((Object[]) makeMutable[indexSegment], objArr2, i - 5);
        }
        return makeMutable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int recyclableRemoveAll(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r7, java.lang.Object[] r8, int r9, int r10, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef r11, java.util.List<java.lang.Object[]> r12, java.util.List<java.lang.Object[]> r13) {
        /*
            r6 = this;
            boolean r0 = r6.isMutable(r8)
            if (r0 == 0) goto L_0x0009
            r12.add(r8)
        L_0x0009:
            java.lang.Object r0 = r11.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.C12775o.m28637g(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0017:
            if (r2 >= r9) goto L_0x0051
            r4 = r8[r2]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x004e
            r5 = 32
            if (r10 != r5) goto L_0x0049
            r10 = r12
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x0043
            int r10 = r12.size()
            int r10 = r10 + -1
            java.lang.Object r10 = r12.remove(r10)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            goto L_0x0047
        L_0x0043:
            java.lang.Object[] r10 = r6.mutableBuffer()
        L_0x0047:
            r3 = r10
            r10 = r1
        L_0x0049:
            int r5 = r10 + 1
            r3[r10] = r4
            r10 = r5
        L_0x004e:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0051:
            r11.setValue(r3)
            java.lang.Object r7 = r11.getValue()
            if (r0 == r7) goto L_0x005d
            r13.add(r0)
        L_0x005d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.recyclableRemoveAll(kotlin.jvm.functions.Function1, java.lang.Object[], int, int, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef, java.util.List, java.util.List):int");
    }

    private final int removeAllFromTail(Function1<? super E, Boolean> function1, int i, ObjectRef objectRef) {
        boolean z;
        int removeAll = removeAll(function1, this.tail, i, objectRef);
        if (removeAll == i) {
            if (objectRef.getValue() == this.tail) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m35307assert(z);
            return i;
        }
        Object value = objectRef.getValue();
        C12775o.m28637g(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        C12708o.m28352s(objArr, null, removeAll, i);
        this.tail = objArr;
        this.size = size() - (i - removeAll);
        return removeAll;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[indexSegment];
            Object[] i4 = C12708o.m28342i(objArr, makeMutable(objArr), indexSegment, indexSegment + 1, 32);
            i4[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return i4;
        }
        if (objArr[31] == null) {
            i3 = UtilsKt.indexSegment(rootSize() - 1, i);
        }
        Object[] makeMutable = makeMutable(objArr);
        int i5 = i - 5;
        int i6 = indexSegment + 1;
        if (i6 <= i3) {
            while (true) {
                Object obj2 = makeMutable[i3];
                C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                makeMutable[i3] = removeFromRootAt((Object[]) obj2, i5, 0, objectRef);
                if (i3 == i6) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = makeMutable[indexSegment];
        C12775o.m28637g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = removeFromRootAt((Object[]) obj3, i5, i2, objectRef);
        return makeMutable;
    }

    private final Object removeFromTailAt(Object[] objArr, int i, int i2, int i3) {
        boolean z;
        int size2 = size() - i;
        if (i3 < size2) {
            z = true;
        } else {
            z = false;
        }
        CommonFunctionsKt.m35307assert(z);
        if (size2 == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[i3];
        Object[] i4 = C12708o.m28342i(objArr2, makeMutable(objArr2), i3, i3 + 1, size2);
        i4[size2 - 1] = null;
        this.root = objArr;
        this.tail = i4;
        this.size = (i + size2) - 1;
        this.rootShift = i2;
        return obj2;
    }

    private final Object[] retainFirst(Object[] objArr, int i) {
        boolean z;
        if ((i & 31) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i == 0) {
            this.rootShift = 0;
            return null;
        } else {
            int i2 = i - 1;
            while (true) {
                int i3 = this.rootShift;
                if ((i2 >> i3) != 0) {
                    return nullifyAfter(objArr, i2, i3);
                }
                this.rootShift = i3 - 5;
                Object[] objArr2 = objArr[0];
                C12775o.m28637g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = objArr2;
            }
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i, int i2, E e, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        Object[] makeMutable = makeMutable(objArr);
        if (i == 0) {
            if (makeMutable != objArr) {
                this.modCount++;
            }
            objectRef.setValue(makeMutable[indexSegment]);
            makeMutable[indexSegment] = e;
            return makeMutable;
        }
        Object obj = makeMutable[indexSegment];
        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = setInRoot((Object[]) obj, i - 5, i2, e, objectRef);
        return makeMutable;
    }

    private final Object[] shiftLeafBuffers(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.root != null) {
            ListIterator<Object[]> leafBufferIterator = leafBufferIterator(rootSize() >> 5);
            while (leafBufferIterator.previousIndex() != i) {
                Object[] previous = leafBufferIterator.previous();
                Object[] unused = C12708o.m28342i(previous, objArr2, 0, 32 - i2, 32);
                objArr2 = makeMutableShiftingRight(previous, i2);
                i3--;
                objArr[i3] = objArr2;
            }
            return leafBufferIterator.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        boolean z;
        Object[] objArr4;
        if (i3 >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] makeMutable = makeMutable(objArr);
            objArr2[0] = makeMutable;
            int i4 = i & 31;
            int size2 = ((i + collection.size()) - 1) & 31;
            int i5 = (i2 - i4) + size2;
            if (i5 < 32) {
                Object[] unused = C12708o.m28342i(makeMutable, objArr3, size2 + 1, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    objArr4 = makeMutable;
                } else {
                    objArr4 = mutableBuffer();
                    i3--;
                    objArr2[i3] = objArr4;
                }
                int i7 = i2 - i6;
                Object[] unused2 = C12708o.m28342i(makeMutable, objArr3, 0, i7, i2);
                Object[] unused3 = C12708o.m28342i(makeMutable, objArr4, size2 + 1, i4, i7);
                objArr3 = objArr4;
            }
            Iterator<? extends E> it = collection.iterator();
            copyToBuffer(makeMutable, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                objArr2[i8] = copyToBuffer(mutableBuffer(), 0, it);
            }
            copyToBuffer(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final int tailSize(int i) {
        return i <= 32 ? i : i - UtilsKt.rootSize(i);
    }

    public boolean add(E e) {
        this.modCount++;
        int tailSize = tailSize();
        if (tailSize < 32) {
            Object[] makeMutable = makeMutable(this.tail);
            makeMutable[tailSize] = e;
            this.tail = makeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e));
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int tailSize = tailSize();
        Iterator<? extends E> it = collection.iterator();
        if (32 - tailSize >= collection.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), tailSize, it);
            this.size = size() + collection.size();
        } else {
            int size2 = ((collection.size() + tailSize) - 1) / 32;
            Object[][] objArr = new Object[size2][];
            objArr[0] = copyToBuffer(makeMutable(this.tail), tailSize, it);
            for (int i = 1; i < size2; i++) {
                objArr[i] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + collection.size();
        }
        return true;
    }

    public E get(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        return bufferFor(i)[i & 31];
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    public int getSize() {
        return this.size;
    }

    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    public Iterator<E> iterator() {
        return listIterator();
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        return removeAllWithPredicate(new PersistentVectorBuilder$removeAll$1(collection));
    }

    public final boolean removeAllWithPredicate(Function1<? super E, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        boolean removeAll = removeAll(function1);
        if (removeAll) {
            this.modCount++;
        }
        return removeAll;
    }

    public E removeAt(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        this.modCount++;
        int rootSize = rootSize();
        if (i >= rootSize) {
            return removeFromTailAt(this.root, rootSize, this.rootShift, i - rootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        C12775o.m28636f(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i, objectRef), rootSize, this.rootShift, 0);
        return objectRef.getValue();
    }

    public E set(int i, E e) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        if (rootSize() <= i) {
            E[] makeMutable = makeMutable(this.tail);
            if (makeMutable != this.tail) {
                this.modCount++;
            }
            int i2 = i & 31;
            E e2 = makeMutable[i2];
            makeMutable[i2] = e;
            this.tail = makeMutable;
            return e2;
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        Object[] objArr = this.root;
        C12775o.m28636f(objArr);
        this.root = setInRoot(objArr, this.rootShift, i, e, objectRef);
        return objectRef.getValue();
    }

    public final void setRootShift$runtime_release(int i) {
        this.rootShift = i;
    }

    private final boolean removeAll(Function1<? super E, Boolean> function1) {
        Object[] objArr;
        Function1<? super E, Boolean> function12 = function1;
        int tailSize = tailSize();
        ObjectRef objectRef = new ObjectRef((Object) null);
        if (this.root != null) {
            ListIterator<Object[]> leafBufferIterator = leafBufferIterator(0);
            int i = 32;
            while (i == 32 && leafBufferIterator.hasNext()) {
                i = removeAll(function12, leafBufferIterator.next(), 32, objectRef);
            }
            if (i == 32) {
                CommonFunctionsKt.m35307assert(!leafBufferIterator.hasNext());
                int removeAllFromTail = removeAllFromTail(function12, tailSize, objectRef);
                if (removeAllFromTail == 0) {
                    pullLastBufferFromRoot(this.root, size(), this.rootShift);
                }
                if (removeAllFromTail != tailSize) {
                    return true;
                }
                return false;
            }
            int previousIndex = leafBufferIterator.previousIndex() << 5;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = i;
            while (leafBufferIterator.hasNext()) {
                i2 = recyclableRemoveAll(function1, leafBufferIterator.next(), 32, i2, objectRef, arrayList2, arrayList);
                previousIndex = previousIndex;
            }
            int i3 = previousIndex;
            int recyclableRemoveAll = recyclableRemoveAll(function1, this.tail, tailSize, i2, objectRef, arrayList2, arrayList);
            Object value = objectRef.getValue();
            C12775o.m28637g(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) value;
            C12708o.m28352s(objArr2, null, recyclableRemoveAll, 32);
            if (arrayList.isEmpty()) {
                objArr = this.root;
                C12775o.m28636f(objArr);
            } else {
                objArr = pushBuffers(this.root, i3, this.rootShift, arrayList.iterator());
            }
            int size2 = i3 + (arrayList.size() << 5);
            this.root = retainFirst(objArr, size2);
            this.tail = objArr2;
            this.size = size2 + recyclableRemoveAll;
            return true;
        } else if (removeAllFromTail(function12, tailSize, objectRef) != tailSize) {
            return true;
        } else {
            return false;
        }
    }

    private final int tailSize() {
        return tailSize(size());
    }

    public PersistentList<E> build() {
        PersistentList<? extends E> persistentList;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentList = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentList = UtilsKt.persistentVectorOf();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.tail, size());
                    C12775o.m28638h(copyOf, "copyOf(this, newSize)");
                    persistentList = new SmallPersistentVector<>(copyOf);
                }
            } else {
                Object[] objArr3 = this.root;
                C12775o.m28636f(objArr3);
                persistentList = new PersistentVector<>(objArr3, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentList;
        return persistentList;
    }

    public ListIterator<E> listIterator(int i) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        return new PersistentVectorMutableIterator(this, i);
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.root != null) {
            int i4 = i >> 5;
            Object[] shiftLeafBuffers = shiftLeafBuffers(i4, i2, objArr, i3, objArr2);
            int rootSize = i3 - (((rootSize() >> 5) - 1) - i4);
            if (rootSize < i3) {
                objArr2 = objArr[rootSize];
                C12775o.m28636f(objArr2);
            }
            splitToBuffers(collection, i, shiftLeafBuffers, 32, objArr, rootSize, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public void add(int i, E e) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        this.modCount++;
        int rootSize = rootSize();
        if (i >= rootSize) {
            insertIntoTail(this.root, i - rootSize, e);
            return;
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        Object[] objArr = this.root;
        C12775o.m28636f(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i, e, objectRef), 0, objectRef.getValue());
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        Object[] objArr;
        C12775o.m28639i(collection, "elements");
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i2 = (i >> 5) << 5;
        int size2 = (((size() - i2) + collection.size()) - 1) / 32;
        if (size2 == 0) {
            if (i >= rootSize()) {
                z = true;
            }
            CommonFunctionsKt.m35307assert(z);
            int i3 = i & 31;
            Object[] objArr2 = this.tail;
            Object[] i4 = C12708o.m28342i(objArr2, makeMutable(objArr2), (((i + collection.size()) - 1) & 31) + 1, i3, tailSize());
            copyToBuffer(i4, i3, collection.iterator());
            this.tail = i4;
            this.size = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size2][];
        int tailSize = tailSize();
        int tailSize2 = tailSize(size() + collection.size());
        if (i >= rootSize()) {
            objArr = mutableBuffer();
            splitToBuffers(collection, i, this.tail, tailSize, objArr3, size2, objArr);
        } else if (tailSize2 > tailSize) {
            int i5 = tailSize2 - tailSize;
            objArr = makeMutableShiftingRight(this.tail, i5);
            insertIntoRoot(collection, i, i5, objArr3, size2, objArr);
        } else {
            int i6 = tailSize - tailSize2;
            objArr = C12708o.m28342i(this.tail, mutableBuffer(), 0, i6, tailSize);
            int i7 = 32 - i6;
            Object[] makeMutableShiftingRight = makeMutableShiftingRight(this.tail, i7);
            int i8 = size2 - 1;
            objArr3[i8] = makeMutableShiftingRight;
            insertIntoRoot(collection, i, i7, objArr3, i8, makeMutableShiftingRight);
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i2, objArr3);
        this.tail = objArr;
        this.size = size() + collection.size();
        return true;
    }

    private final int removeAll(Function1<? super E, Boolean> function1, Object[] objArr, int i, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (function1.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = makeMutable(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        objectRef.setValue(objArr2);
        return i2;
    }
}
