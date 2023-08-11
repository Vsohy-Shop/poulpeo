package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
/* compiled from: PersistentVector.kt */
public final class PersistentVector<E> extends AbstractPersistentList<E> {
    private final Object[] root;
    private final int rootShift;
    private final int size;
    private final Object[] tail;

    public PersistentVector(Object[] objArr, Object[] objArr2, int i, int i2) {
        boolean z;
        C12775o.m28639i(objArr, "root");
        C12775o.m28639i(objArr2, "tail");
        this.root = objArr;
        this.tail = objArr2;
        this.size = i;
        this.rootShift = i2;
        boolean z2 = true;
        if (size() > 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            CommonFunctionsKt.m35307assert(size() - UtilsKt.rootSize(size()) > C13537l.m30882i(objArr2.length, 32) ? false : z2);
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    private final Object[] bufferFor(int i) {
        if (rootSize() <= i) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i, i2)];
            C12775o.m28637g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object[] objArr2;
        Object[] objArr3 = objArr;
        int i3 = i;
        int indexSegment = UtilsKt.indexSegment(i2, i3);
        if (i3 == 0) {
            if (indexSegment == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr3, 32);
                C12775o.m28638h(objArr2, "copyOf(this, newSize)");
            }
            Object[] unused = C12708o.m28342i(objArr3, objArr2, indexSegment + 1, indexSegment, 31);
            objectRef.setValue(objArr3[31]);
            objArr2[indexSegment] = obj;
            return objArr2;
        }
        ObjectRef objectRef2 = objectRef;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        int i4 = i3 - 5;
        Object obj2 = objArr3[indexSegment];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        C12775o.m28637g(obj2, str);
        copyOf[indexSegment] = insertIntoRoot((Object[]) obj2, i4, i2, obj, objectRef);
        int i5 = indexSegment + 1;
        while (i5 < 32 && copyOf[i5] != null) {
            Object obj3 = objArr3[i5];
            C12775o.m28637g(obj3, str);
            Object[] objArr4 = copyOf;
            objArr4[i5] = insertIntoRoot((Object[]) obj3, i4, 0, objectRef.getValue(), objectRef);
            i5++;
            copyOf = objArr4;
            str = str;
        }
        return copyOf;
    }

    private final PersistentVector<E> insertIntoTail(Object[] objArr, int i, Object obj) {
        int size2 = size() - rootSize();
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        if (size2 < 32) {
            Object[] unused = C12708o.m28342i(this.tail, copyOf, i + 1, i, size2);
            copyOf[i] = obj;
            return new PersistentVector<>(objArr, copyOf, size() + 1, this.rootShift);
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[31];
        Object[] unused2 = C12708o.m28342i(objArr2, copyOf, i + 1, i, size2 - 1);
        copyOf[i] = obj;
        return pushFilledTail(objArr, copyOf, UtilsKt.presizedBufferWith(obj2));
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] objArr2;
        int indexSegment = UtilsKt.indexSegment(i2, i);
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
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        copyOf[indexSegment] = objArr2;
        return copyOf;
    }

    private final PersistentList<E> pullLastBufferFromRoot(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                C12775o.m28638h(objArr, "copyOf(this, newSize)");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i2, i - 1, objectRef);
        C12775o.m28636f(pullLastBuffer);
        Object value = objectRef.getValue();
        C12775o.m28637g(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        if (pullLastBuffer[1] != null) {
            return new PersistentVector(pullLastBuffer, objArr2, i, i2);
        }
        Object obj = pullLastBuffer[0];
        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new PersistentVector((Object[]) obj, objArr2, i, i2 - 5);
    }

    private final PersistentVector<E> pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size2 = size() >> 5;
        int i = this.rootShift;
        if (size2 <= (1 << i)) {
            return new PersistentVector<>(pushTail(objArr, i, objArr2), objArr3, size() + 1, this.rootShift);
        }
        Object[] presizedBufferWith = UtilsKt.presizedBufferWith(objArr);
        int i2 = this.rootShift + 5;
        return new PersistentVector<>(pushTail(presizedBufferWith, i2, objArr2), objArr3, size() + 1, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r4 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] pushTail(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + -1
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(r0, r5)
            r1 = 32
            if (r4 == 0) goto L_0x0019
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C12775o.m28638h(r4, r2)
            if (r4 != 0) goto L_0x001b
        L_0x0019:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L_0x001b:
            r1 = 5
            if (r5 != r1) goto L_0x0021
            r4[r0] = r6
            goto L_0x002c
        L_0x0021:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.pushTail(r2, r5, r6)
            r4[r0] = r5
        L_0x002c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector.pushTail(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] objArr2;
        int indexSegment = UtilsKt.indexSegment(i2, i);
        int i3 = 31;
        if (i == 0) {
            if (indexSegment == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
                C12775o.m28638h(objArr2, "copyOf(this, newSize)");
            }
            Object[] unused = C12708o.m28342i(objArr, objArr2, indexSegment, indexSegment + 1, 32);
            objArr2[31] = objectRef.getValue();
            objectRef.setValue(objArr[indexSegment]);
            return objArr2;
        }
        if (objArr[31] == null) {
            i3 = UtilsKt.indexSegment(rootSize() - 1, i);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        int i4 = i - 5;
        int i5 = indexSegment + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj = copyOf[i3];
                C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf[i3] = removeFromRootAt((Object[]) obj, i4, 0, objectRef);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf[indexSegment];
        C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[indexSegment] = removeFromRootAt((Object[]) obj2, i4, i2, objectRef);
        return copyOf;
    }

    private final PersistentList<E> removeFromTailAt(Object[] objArr, int i, int i2, int i3) {
        boolean z;
        int size2 = size() - i;
        if (i3 < size2) {
            z = true;
        } else {
            z = false;
        }
        CommonFunctionsKt.m35307assert(z);
        if (size2 == 1) {
            return pullLastBufferFromRoot(objArr, i, i2);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        int i4 = size2 - 1;
        if (i3 < i4) {
            Object[] unused = C12708o.m28342i(this.tail, copyOf, i3, i3 + 1, size2);
        }
        copyOf[i4] = null;
        return new PersistentVector(objArr, copyOf, (i + size2) - 1, i2);
    }

    private final int rootSize() {
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i, int i2, Object obj) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        if (i == 0) {
            copyOf[indexSegment] = obj;
        } else {
            Object obj2 = copyOf[indexSegment];
            C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[indexSegment] = setInRoot((Object[]) obj2, i - 5, i2, obj);
        }
        return copyOf;
    }

    public E get(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        return bufferFor(i)[i & 31];
    }

    public int getSize() {
        return this.size;
    }

    public ListIterator<E> listIterator(int i) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        return new PersistentVectorIterator(this.root, this.tail, i, size(), (this.rootShift / 5) + 1);
    }

    public PersistentList<E> removeAt(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        int rootSize = rootSize();
        if (i >= rootSize) {
            return removeFromTailAt(this.root, rootSize, this.rootShift, i - rootSize);
        }
        return removeFromTailAt(removeFromRootAt(this.root, this.rootShift, i, new ObjectRef(this.tail[0])), rootSize, this.rootShift, 0);
    }

    public PersistentList<E> set(int i, E e) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        if (rootSize() > i) {
            return new PersistentVector(setInRoot(this.root, this.rootShift, i, e), this.tail, size(), this.rootShift);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        copyOf[i & 31] = e;
        return new PersistentVector(this.root, copyOf, size(), this.rootShift);
    }

    public PersistentList<E> add(E e) {
        int size2 = size() - rootSize();
        if (size2 < 32) {
            Object[] copyOf = Arrays.copyOf(this.tail, 32);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            copyOf[size2] = e;
            return new PersistentVector(this.root, copyOf, size() + 1, this.rootShift);
        }
        return pushFilledTail(this.root, this.tail, UtilsKt.presizedBufferWith(e));
    }

    public PersistentList<E> removeAll(Function1<? super E, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        PersistentVectorBuilder builder = builder();
        builder.removeAllWithPredicate(function1);
        return builder.build();
    }

    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    public PersistentList<E> add(int i, E e) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return add((Object) e);
        }
        int rootSize = rootSize();
        if (i >= rootSize) {
            return insertIntoTail(this.root, i - rootSize, e);
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        return insertIntoTail(insertIntoRoot(this.root, this.rootShift, i, e, objectRef), 0, objectRef.getValue());
    }
}
