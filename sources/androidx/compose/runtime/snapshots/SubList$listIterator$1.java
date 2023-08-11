package androidx.compose.runtime.snapshots;

import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12760f0;
import p412pf.C13212a;

/* compiled from: SnapshotStateList.kt */
public final class SubList$listIterator$1 implements ListIterator<T>, C13212a {
    final /* synthetic */ C12760f0 $current;
    final /* synthetic */ SubList<T> this$0;

    SubList$listIterator$1(C12760f0 f0Var, SubList<T> subList) {
        this.$current = f0Var;
        this.this$0 = subList;
    }

    public boolean hasNext() {
        if (this.$current.f20416b < this.this$0.size() - 1) {
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        if (this.$current.f20416b >= 0) {
            return true;
        }
        return false;
    }

    public T next() {
        int i = this.$current.f20416b + 1;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.f20416b = i;
        return this.this$0.get(i);
    }

    public int nextIndex() {
        return this.$current.f20416b + 1;
    }

    public T previous() {
        int i = this.$current.f20416b;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.f20416b = i - 1;
        return this.this$0.get(i);
    }

    public int previousIndex() {
        return this.$current.f20416b;
    }

    public Void add(T t) {
        Void unused = SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }

    public Void remove() {
        Void unused = SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }

    public Void set(T t) {
        Void unused = SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }
}
