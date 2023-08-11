package androidx.compose.runtime.snapshots;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p412pf.C13215d;

@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,457:1\n1726#2,3:458\n1855#2,2:461\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n311#1:458,3\n320#1:461,2\n*E\n"})
/* compiled from: SnapshotStateList.kt */
final class SubList<T> implements List<T>, C13215d {
    private int modification;
    private final int offset;
    private final SnapshotStateList<T> parentList;
    private int size;

    public SubList(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        C12775o.m28639i(snapshotStateList, "parentList");
        this.parentList = snapshotStateList;
        this.offset = i;
        this.modification = snapshotStateList.getModification$runtime_release();
        this.size = i2 - i;
    }

    private final void validateModification() {
        if (this.parentList.getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean add(T t) {
        validateModification();
        this.parentList.add(this.offset + size(), t);
        this.size = size() + 1;
        this.modification = this.parentList.getModification$runtime_release();
        return true;
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        C12775o.m28639i(collection, "elements");
        validateModification();
        boolean addAll = this.parentList.addAll(i + this.offset, collection);
        if (addAll) {
            this.size = size() + collection.size();
            this.modification = this.parentList.getModification$runtime_release();
        }
        return addAll;
    }

    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i = this.offset;
            snapshotStateList.removeRange(i, size() + i);
            this.size = 0;
            this.modification = this.parentList.getModification$runtime_release();
        }
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public T get(int i) {
        validateModification();
        SnapshotStateListKt.validateRange(i, size());
        return this.parentList.get(this.offset + i);
    }

    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    public int indexOf(Object obj) {
        validateModification();
        int i = this.offset;
        Iterator it = C13537l.m30893t(i, size() + i).iterator();
        while (it.hasNext()) {
            int nextInt = ((C12703l0) it).nextInt();
            if (C12775o.m28634d(obj, this.parentList.get(nextInt))) {
                return nextInt - this.offset;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Iterator<T> iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        validateModification();
        int size2 = this.offset + size();
        while (true) {
            size2--;
            if (size2 < this.offset) {
                return -1;
            }
            if (C12775o.m28634d(obj, this.parentList.get(size2))) {
                return size2 - this.offset;
            }
        }
    }

    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (remove((Object) it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    public T removeAt(int i) {
        validateModification();
        T remove = this.parentList.remove(this.offset + i);
        this.size = size() - 1;
        this.modification = this.parentList.getModification$runtime_release();
        return remove;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i = this.offset;
        int retainAllInRange$runtime_release = snapshotStateList.retainAllInRange$runtime_release(collection, i, size() + i);
        if (retainAllInRange$runtime_release > 0) {
            this.modification = this.parentList.getModification$runtime_release();
            this.size = size() - retainAllInRange$runtime_release;
        }
        if (retainAllInRange$runtime_release > 0) {
            return true;
        }
        return false;
    }

    public T set(int i, T t) {
        SnapshotStateListKt.validateRange(i, size());
        validateModification();
        T t2 = this.parentList.set(i + this.offset, t);
        this.modification = this.parentList.getModification$runtime_release();
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
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i3 = this.offset;
            return new SubList(snapshotStateList, i + i3, i2 + i3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public ListIterator<T> listIterator(int i) {
        validateModification();
        C12760f0 f0Var = new C12760f0();
        f0Var.f20416b = i - 1;
        return new SubList$listIterator$1(f0Var, this);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }

    public void add(int i, T t) {
        validateModification();
        this.parentList.add(this.offset + i, t);
        this.size = size() + 1;
        this.modification = this.parentList.getModification$runtime_release();
    }

    public boolean addAll(Collection<? extends T> collection) {
        C12775o.m28639i(collection, "elements");
        return addAll(size(), collection);
    }
}
