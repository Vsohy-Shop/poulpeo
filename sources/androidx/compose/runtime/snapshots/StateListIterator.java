package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p412pf.C13212a;

@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1#2:458\n*E\n"})
/* compiled from: SnapshotStateList.kt */
final class StateListIterator<T> implements ListIterator<T>, C13212a {
    private int index;
    private final SnapshotStateList<T> list;
    private int modification;

    public StateListIterator(SnapshotStateList<T> snapshotStateList, int i) {
        C12775o.m28639i(snapshotStateList, "list");
        this.list = snapshotStateList;
        this.index = i - 1;
        this.modification = snapshotStateList.getModification$runtime_release();
    }

    private final void validateModification() {
        if (this.list.getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    public void add(T t) {
        validateModification();
        this.list.add(this.index + 1, t);
        this.index++;
        this.modification = this.list.getModification$runtime_release();
    }

    public final SnapshotStateList<T> getList() {
        return this.list;
    }

    public boolean hasNext() {
        if (this.index < this.list.size() - 1) {
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        if (this.index >= 0) {
            return true;
        }
        return false;
    }

    public T next() {
        validateModification();
        int i = this.index + 1;
        SnapshotStateListKt.validateRange(i, this.list.size());
        T t = this.list.get(i);
        this.index = i;
        return t;
    }

    public int nextIndex() {
        return this.index + 1;
    }

    public T previous() {
        validateModification();
        SnapshotStateListKt.validateRange(this.index, this.list.size());
        this.index--;
        return this.list.get(this.index);
    }

    public int previousIndex() {
        return this.index;
    }

    public void remove() {
        validateModification();
        this.list.remove(this.index);
        this.index--;
        this.modification = this.list.getModification$runtime_release();
    }

    public void set(T t) {
        validateModification();
        this.list.set(this.index, t);
        this.modification = this.list.getModification$runtime_release();
    }
}
