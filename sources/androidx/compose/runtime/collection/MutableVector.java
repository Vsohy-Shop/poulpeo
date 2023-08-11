package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p412pf.C13212a;
import p412pf.C13215d;
import p436tf.C13528f;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1194:1\n48#1:1198\n48#1:1199\n523#1:1200\n53#1:1203\n523#1:1204\n48#1:1205\n523#1:1206\n523#1:1207\n523#1:1208\n48#1:1209\n523#1:1210\n48#1:1211\n523#1:1212\n523#1:1213\n523#1:1214\n48#1:1215\n523#1:1216\n48#1:1219\n48#1:1220\n48#1:1221\n523#1:1222\n1864#2,3:1195\n1855#2,2:1201\n1855#2,2:1217\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1198\n259#1:1199\n260#1:1200\n292#1:1203\n293#1:1204\n307#1:1205\n308#1:1206\n334#1:1207\n359#1:1208\n595#1:1209\n595#1:1210\n637#1:1211\n637#1:1212\n665#1:1213\n675#1:1214\n768#1:1215\n769#1:1216\n794#1:1219\n821#1:1220\n833#1:1221\n834#1:1222\n185#1:1195,3\n281#1:1201,2\n782#1:1217,2\n*E\n"})
/* compiled from: MutableVector.kt */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;
    private T[] content;
    private List<T> list;
    private int size;

    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1194:1\n523#2:1195\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n941#1:1195\n*E\n"})
    /* compiled from: MutableVector.kt */
    private static final class MutableVectorList<T> implements List<T>, C13215d {
        private final MutableVector<T> vector;

        public MutableVectorList(MutableVector<T> mutableVector) {
            C12775o.m28639i(mutableVector, "vector");
            this.vector = mutableVector;
        }

        public boolean add(T t) {
            return this.vector.add(t);
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            C12775o.m28639i(collection, "elements");
            return this.vector.addAll(i, collection);
        }

        public void clear() {
            this.vector.clear();
        }

        public boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            C12775o.m28639i(collection, "elements");
            return this.vector.containsAll(collection);
        }

        public T get(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.getContent()[i];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        public int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        public boolean isEmpty() {
            return this.vector.isEmpty();
        }

        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        public int lastIndexOf(Object obj) {
            return this.vector.lastIndexOf(obj);
        }

        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            C12775o.m28639i(collection, "elements");
            return this.vector.removeAll(collection);
        }

        public T removeAt(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.removeAt(i);
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            C12775o.m28639i(collection, "elements");
            return this.vector.retainAll(collection);
        }

        public T set(int i, T t) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.set(i, t);
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public List<T> subList(int i, int i2) {
            MutableVectorKt.checkSubIndex(this, i, i2);
            return new SubList(this, i, i2);
        }

        public Object[] toArray() {
            return C12761g.m28583a(this);
        }

        public void add(int i, T t) {
            this.vector.add(i, t);
        }

        public boolean addAll(Collection<? extends T> collection) {
            C12775o.m28639i(collection, "elements");
            return this.vector.addAll(collection);
        }

        public ListIterator<T> listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        public boolean remove(Object obj) {
            return this.vector.remove(obj);
        }

        public <T> T[] toArray(T[] tArr) {
            C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
            return C12761g.m28584b(this, tArr);
        }
    }

    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1194:1\n1855#2,2:1195\n1855#2,2:1197\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n1013#1:1195,2\n1095#1:1197,2\n*E\n"})
    /* compiled from: MutableVector.kt */
    private static final class SubList<T> implements List<T>, C13215d {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list2, int i, int i2) {
            C12775o.m28639i(list2, "list");
            this.list = list2;
            this.start = i;
            this.end = i2;
        }

        public boolean add(T t) {
            List<T> list2 = this.list;
            int i = this.end;
            this.end = i + 1;
            list2.add(i, t);
            return true;
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            C12775o.m28639i(collection, "elements");
            this.list.addAll(i + this.start, collection);
            this.end += collection.size();
            return collection.size() > 0;
        }

        public void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.end = this.start;
        }

        public boolean contains(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (C12775o.m28634d(this.list.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            C12775o.m28639i(collection, "elements");
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public T get(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.list.get(i + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        public int indexOf(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (C12775o.m28634d(this.list.get(i2), obj)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            if (this.end == this.start) {
                return true;
            }
            return false;
        }

        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        public int lastIndexOf(Object obj) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 > i) {
                return -1;
            }
            while (!C12775o.m28634d(this.list.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            C12775o.m28639i(collection, "elements");
            int i = this.end;
            for (Object remove : collection) {
                remove(remove);
            }
            if (i != this.end) {
                return true;
            }
            return false;
        }

        public T removeAt(int i) {
            MutableVectorKt.checkIndex(this, i);
            this.end--;
            return this.list.remove(i + this.start);
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            C12775o.m28639i(collection, "elements");
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.end) {
                return true;
            }
            return false;
        }

        public T set(int i, T t) {
            MutableVectorKt.checkIndex(this, i);
            return this.list.set(i + this.start, t);
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public List<T> subList(int i, int i2) {
            MutableVectorKt.checkSubIndex(this, i, i2);
            return new SubList(this, i, i2);
        }

        public Object[] toArray() {
            return C12761g.m28583a(this);
        }

        public void add(int i, T t) {
            this.list.add(i + this.start, t);
            this.end++;
        }

        public ListIterator<T> listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        public boolean remove(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (C12775o.m28634d(this.list.get(i2), obj)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        public <T> T[] toArray(T[] tArr) {
            C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
            return C12761g.m28584b(this, tArr);
        }

        public boolean addAll(Collection<? extends T> collection) {
            C12775o.m28639i(collection, "elements");
            this.list.addAll(this.end, collection);
            this.end += collection.size();
            return collection.size() > 0;
        }
    }

    /* compiled from: MutableVector.kt */
    private static final class VectorListIterator<T> implements ListIterator<T>, C13212a {
        private int index;
        private final List<T> list;

        public VectorListIterator(List<T> list2, int i) {
            C12775o.m28639i(list2, "list");
            this.list = list2;
            this.index = i;
        }

        public void add(T t) {
            this.list.add(this.index, t);
            this.index++;
        }

        public boolean hasNext() {
            if (this.index < this.list.size()) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.index > 0) {
                return true;
            }
            return false;
        }

        public T next() {
            List<T> list2 = this.list;
            int i = this.index;
            this.index = i + 1;
            return list2.get(i);
        }

        public int nextIndex() {
            return this.index;
        }

        public T previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        public int previousIndex() {
            return this.index - 1;
        }

        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        public void set(T t) {
            this.list.set(this.index, t);
        }
    }

    public MutableVector(T[] tArr, int i) {
        C12775o.m28639i(tArr, "content");
        this.content = tArr;
        this.size = i;
    }

    public final boolean add(T t) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i = this.size;
        tArr[i] = t;
        this.size = i + 1;
        return true;
    }

    public final boolean addAll(int i, List<? extends T> list2) {
        C12775o.m28639i(list2, "elements");
        if (list2.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + list2.size());
        T[] tArr = this.content;
        if (i != this.size) {
            Object[] unused = C12708o.m28342i(tArr, tArr, list2.size() + i, i, this.size);
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            tArr[i + i2] = list2.get(i2);
        }
        this.size += list2.size();
        return true;
    }

    public final boolean any(Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        int size2 = getSize();
        if (size2 > 0) {
            Object[] content2 = getContent();
            int i = 0;
            while (!function1.invoke(content2[i]).booleanValue()) {
                i++;
                if (i >= size2) {
                }
            }
            return true;
        }
        return false;
    }

    public final List<T> asMutableList() {
        List<T> list2 = this.list;
        if (list2 != null) {
            return list2;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int size2 = getSize();
        while (true) {
            size2--;
            if (-1 < size2) {
                tArr[size2] = null;
            } else {
                this.size = 0;
                return;
            }
        }
    }

    public final boolean contains(T t) {
        int size2 = getSize() - 1;
        if (size2 >= 0) {
            int i = 0;
            while (!C12775o.m28634d(getContent()[i], t)) {
                if (i != size2) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(List<? extends T> list2) {
        C12775o.m28639i(list2, "elements");
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            if (!contains(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(MutableVector<T> mutableVector) {
        C12775o.m28639i(mutableVector, "other");
        if (mutableVector.size != this.size) {
            return false;
        }
        int size2 = getSize() - 1;
        if (size2 >= 0) {
            int i = 0;
            while (C12775o.m28634d(mutableVector.getContent()[i], getContent()[i])) {
                if (i != size2) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i) {
        T[] tArr = this.content;
        if (tArr.length < i) {
            T[] copyOf = Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final T first() {
        if (!isEmpty()) {
            return getContent()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[0];
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [of.o<? super R, ? super T, ? extends R>, java.lang.Object, of.o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R fold(R r5, p404of.C13088o<? super R, ? super T, ? extends R> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            int r0 = r4.getSize()
            if (r0 <= 0) goto L_0x001a
            java.lang.Object[] r1 = r4.getContent()
            r2 = 0
        L_0x0010:
            r3 = r1[r2]
            java.lang.Object r5 = r6.invoke(r5, r3)
            int r2 = r2 + 1
            if (r2 < r0) goto L_0x0010
        L_0x001a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.MutableVector.fold(java.lang.Object, of.o):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, of.p, of.p<? super java.lang.Integer, ? super R, ? super T, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R foldIndexed(R r6, p404of.C13089p<? super java.lang.Integer, ? super R, ? super T, ? extends R> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            int r0 = r5.getSize()
            if (r0 <= 0) goto L_0x001e
            java.lang.Object[] r1 = r5.getContent()
            r2 = 0
        L_0x0010:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = r1[r2]
            java.lang.Object r6 = r7.invoke(r3, r6, r4)
            int r2 = r2 + 1
            if (r2 < r0) goto L_0x0010
        L_0x001e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.MutableVector.foldIndexed(java.lang.Object, of.p):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [of.o<? super T, ? super R, ? extends R>, java.lang.Object, of.o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R foldRight(R r4, p404of.C13088o<? super T, ? super R, ? extends R> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            int r0 = r3.getSize()
            if (r0 <= 0) goto L_0x001b
            int r0 = r0 + -1
            java.lang.Object[] r1 = r3.getContent()
        L_0x0011:
            r2 = r1[r0]
            java.lang.Object r4 = r5.invoke(r2, r4)
            int r0 = r0 + -1
            if (r0 >= 0) goto L_0x0011
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.MutableVector.foldRight(java.lang.Object, of.o):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, of.p, of.p<? super java.lang.Integer, ? super T, ? super R, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R foldRightIndexed(R r5, p404of.C13089p<? super java.lang.Integer, ? super T, ? super R, ? extends R> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            int r0 = r4.getSize()
            if (r0 <= 0) goto L_0x001f
            int r0 = r0 + -1
            java.lang.Object[] r1 = r4.getContent()
        L_0x0011:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = r1[r0]
            java.lang.Object r5 = r6.invoke(r2, r3, r5)
            int r0 = r0 + -1
            if (r0 >= 0) goto L_0x0011
        L_0x001f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.MutableVector.foldRightIndexed(java.lang.Object, of.p):java.lang.Object");
    }

    public final void forEach(Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        int size2 = getSize();
        if (size2 > 0) {
            Object[] content2 = getContent();
            int i = 0;
            do {
                function1.invoke(content2[i]);
                i++;
            } while (i < size2);
        }
    }

    public final void forEachIndexed(C13088o<? super Integer, ? super T, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        int size2 = getSize();
        if (size2 > 0) {
            Object[] content2 = getContent();
            int i = 0;
            do {
                oVar.invoke(Integer.valueOf(i), content2[i]);
                i++;
            } while (i < size2);
        }
    }

    public final void forEachReversed(Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        int size2 = getSize();
        if (size2 > 0) {
            int i = size2 - 1;
            Object[] content2 = getContent();
            do {
                function1.invoke(content2[i]);
                i--;
            } while (i >= 0);
        }
    }

    public final void forEachReversedIndexed(C13088o<? super Integer, ? super T, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        if (getSize() > 0) {
            int size2 = getSize() - 1;
            Object[] content2 = getContent();
            do {
                oVar.invoke(Integer.valueOf(size2), content2[size2]);
                size2--;
            } while (size2 >= 0);
        }
    }

    public final T get(int i) {
        return getContent()[i];
    }

    public final T[] getContent() {
        return this.content;
    }

    public final C13528f getIndices() {
        return new C13528f(0, getSize() - 1);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T t) {
        int i = this.size;
        if (i <= 0) {
            return -1;
        }
        T[] tArr = this.content;
        int i2 = 0;
        while (!C12775o.m28634d(t, tArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    public final int indexOfFirst(Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        int size2 = getSize();
        if (size2 <= 0) {
            return -1;
        }
        Object[] content2 = getContent();
        int i = 0;
        while (!function1.invoke(content2[i]).booleanValue()) {
            i++;
            if (i >= size2) {
                return -1;
            }
        }
        return i;
    }

    public final int indexOfLast(Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        int size2 = getSize();
        if (size2 <= 0) {
            return -1;
        }
        int i = size2 - 1;
        Object[] content2 = getContent();
        while (!function1.invoke(content2[i]).booleanValue()) {
            i--;
            if (i < 0) {
                return -1;
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.size != 0) {
            return true;
        }
        return false;
    }

    public final T last() {
        if (!isEmpty()) {
            return getContent()[getSize() - 1];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int lastIndexOf(T t) {
        int i = this.size;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        T[] tArr = this.content;
        while (!C12775o.m28634d(t, tArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    public final T lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[getSize() - 1];
    }

    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(function1, "transform");
        int size2 = getSize();
        C12775o.m28644n(0, "R");
        R[] rArr = new Object[size2];
        for (int i = 0; i < size2; i++) {
            rArr[i] = function1.invoke(getContent()[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> R[] mapIndexed(C13088o<? super Integer, ? super T, ? extends R> oVar) {
        C12775o.m28639i(oVar, "transform");
        int size2 = getSize();
        C12775o.m28644n(0, "R");
        R[] rArr = new Object[size2];
        for (int i = 0; i < size2; i++) {
            rArr[i] = oVar.invoke(Integer.valueOf(i), getContent()[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(C13088o<? super Integer, ? super T, ? extends R> oVar) {
        C12775o.m28639i(oVar, "transform");
        int size2 = getSize();
        int i = 0;
        C12775o.m28644n(0, "R?");
        Object[] objArr = new Object[size2];
        if (size2 > 0) {
            Object[] content2 = getContent();
            int i2 = 0;
            do {
                Object invoke = oVar.invoke(Integer.valueOf(i), content2[i]);
                if (invoke != null) {
                    objArr[i2] = invoke;
                    i2++;
                }
                i++;
            } while (i < size2);
            i = i2;
        }
        return new MutableVector<>(objArr, i);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(function1, "transform");
        int size2 = getSize();
        int i = 0;
        C12775o.m28644n(0, "R?");
        Object[] objArr = new Object[size2];
        if (size2 > 0) {
            Object[] content2 = getContent();
            int i2 = 0;
            do {
                Object invoke = function1.invoke(content2[i]);
                if (invoke != null) {
                    objArr[i2] = invoke;
                    i2++;
                }
                i++;
            } while (i < size2);
            i = i2;
        }
        return new MutableVector<>(objArr, i);
    }

    public final void minusAssign(T t) {
        remove(t);
    }

    public final void plusAssign(T t) {
        add(t);
    }

    public final boolean remove(T t) {
        int indexOf = indexOf(t);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(List<? extends T> list2) {
        C12775o.m28639i(list2, "elements");
        int i = this.size;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            remove(list2.get(i2));
        }
        if (i != this.size) {
            return true;
        }
        return false;
    }

    public final T removeAt(int i) {
        T[] tArr = this.content;
        T t = tArr[i];
        if (i != getSize() - 1) {
            Object[] unused = C12708o.m28342i(tArr, tArr, i, i + 1, this.size);
        }
        int i2 = this.size - 1;
        this.size = i2;
        tArr[i2] = null;
        return t;
    }

    public final void removeRange(int i, int i2) {
        if (i2 > i) {
            int i3 = this.size;
            if (i2 < i3) {
                T[] tArr = this.content;
                Object[] unused = C12708o.m28342i(tArr, tArr, i, i2, i3);
            }
            int i4 = this.size - (i2 - i);
            int size2 = getSize() - 1;
            if (i4 <= size2) {
                int i5 = i4;
                while (true) {
                    this.content[i5] = null;
                    if (i5 == size2) {
                        break;
                    }
                    i5++;
                }
            }
            this.size = i4;
        }
    }

    public final boolean retainAll(Collection<? extends T> collection) {
        C12775o.m28639i(collection, "elements");
        int i = this.size;
        for (int size2 = getSize() - 1; -1 < size2; size2--) {
            if (!collection.contains(getContent()[size2])) {
                removeAt(size2);
            }
        }
        if (i != this.size) {
            return true;
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        int size2 = getSize();
        if (size2 <= 0) {
            return false;
        }
        int i = size2 - 1;
        Object[] content2 = getContent();
        while (!function1.invoke(content2[i]).booleanValue()) {
            i--;
            if (i < 0) {
                return false;
            }
        }
        return true;
    }

    public final T set(int i, T t) {
        T[] tArr = this.content;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    public final void setContent(T[] tArr) {
        C12775o.m28639i(tArr, "<set-?>");
        this.content = tArr;
    }

    public final void sortWith(Comparator<T> comparator) {
        C12775o.m28639i(comparator, "comparator");
        C12708o.m28335B(this.content, comparator, 0, this.size);
    }

    public final int sumBy(Function1<? super T, Integer> function1) {
        C12775o.m28639i(function1, "selector");
        int size2 = getSize();
        int i = 0;
        if (size2 > 0) {
            Object[] content2 = getContent();
            int i2 = 0;
            do {
                i += function1.invoke(content2[i2]).intValue();
                i2++;
            } while (i2 < size2);
        }
        return i;
    }

    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean containsAll(Collection<? extends T> collection) {
        C12775o.m28639i(collection, "elements");
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final T firstOrNull(Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        int size2 = getSize();
        if (size2 <= 0) {
            return null;
        }
        T[] content2 = getContent();
        int i = 0;
        do {
            T t = content2[i];
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
            i++;
        } while (i < size2);
        return null;
    }

    public final void add(int i, T t) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i2 = this.size;
        if (i != i2) {
            Object[] unused = C12708o.m28342i(tArr, tArr, i + 1, i, i2);
        }
        tArr[i] = t;
        this.size++;
    }

    public final T first(Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        int size2 = getSize();
        if (size2 > 0) {
            T[] content2 = getContent();
            int i = 0;
            do {
                T t = content2[i];
                if (function1.invoke(t).booleanValue()) {
                    return t;
                }
                i++;
            } while (i < size2);
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final T lastOrNull(Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        int size2 = getSize();
        if (size2 <= 0) {
            return null;
        }
        int i = size2 - 1;
        T[] content2 = getContent();
        do {
            T t = content2[i];
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
            i--;
        } while (i >= 0);
        return null;
    }

    public final T last(Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        int size2 = getSize();
        if (size2 > 0) {
            int i = size2 - 1;
            T[] content2 = getContent();
            do {
                T t = content2[i];
                if (function1.invoke(t).booleanValue()) {
                    return t;
                }
                i--;
            } while (i >= 0);
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final boolean removeAll(MutableVector<T> mutableVector) {
        C12775o.m28639i(mutableVector, "elements");
        int i = this.size;
        int size2 = mutableVector.getSize() - 1;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                remove(mutableVector.getContent()[i2]);
                if (i2 == size2) {
                    break;
                }
                i2++;
            }
        }
        if (i != this.size) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(MutableVector<T> mutableVector) {
        C12775o.m28639i(mutableVector, "elements");
        C13528f fVar = new C13528f(0, mutableVector.getSize() - 1);
        int j = fVar.mo53147j();
        int k = fVar.mo53148k();
        if (j <= k) {
            while (contains(mutableVector.getContent()[j])) {
                if (j != k) {
                    j++;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean removeAll(Collection<? extends T> collection) {
        C12775o.m28639i(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.size;
        for (Object remove : collection) {
            remove(remove);
        }
        if (i != this.size) {
            return true;
        }
        return false;
    }

    public final boolean addAll(int i, MutableVector<T> mutableVector) {
        C12775o.m28639i(mutableVector, "elements");
        if (mutableVector.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + mutableVector.size);
        T[] tArr = this.content;
        int i2 = this.size;
        if (i != i2) {
            Object[] unused = C12708o.m28342i(tArr, tArr, mutableVector.size + i, i, i2);
        }
        Object[] unused2 = C12708o.m28342i(mutableVector.content, tArr, i, 0, mutableVector.size);
        this.size += mutableVector.size;
        return true;
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean addAll(List<? extends T> list2) {
        C12775o.m28639i(list2, "elements");
        return addAll(getSize(), list2);
    }

    public final boolean addAll(MutableVector<T> mutableVector) {
        C12775o.m28639i(mutableVector, "elements");
        return addAll(getSize(), mutableVector);
    }

    public final boolean addAll(T[] tArr) {
        C12775o.m28639i(tArr, "elements");
        if (tArr.length == 0) {
            return false;
        }
        ensureCapacity(this.size + tArr.length);
        Object[] unused = C12708o.m28346m(tArr, this.content, this.size, 0, 0, 12, (Object) null);
        this.size += tArr.length;
        return true;
    }

    public final boolean addAll(int i, Collection<? extends T> collection) {
        C12775o.m28639i(collection, "elements");
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + collection.size());
        T[] tArr = this.content;
        if (i != this.size) {
            Object[] unused = C12708o.m28342i(tArr, tArr, collection.size() + i, i, this.size);
        }
        for (T next : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C12726w.m28534u();
            }
            tArr[i2 + i] = next;
            i2 = i3;
        }
        this.size += collection.size();
        return true;
    }

    public final boolean addAll(Collection<? extends T> collection) {
        C12775o.m28639i(collection, "elements");
        return addAll(this.size, collection);
    }
}
