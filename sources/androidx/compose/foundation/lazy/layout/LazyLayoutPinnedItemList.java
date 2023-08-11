package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* compiled from: LazyLayoutPinnableItem.kt */
public final class LazyLayoutPinnedItemList implements List<PinnedItem>, C13212a {
    public static final int $stable = 8;
    private final List<PinnedItem> items;

    @ExperimentalFoundationApi
    /* compiled from: LazyLayoutPinnableItem.kt */
    public interface PinnedItem {
        int getIndex();

        Object getKey();
    }

    private LazyLayoutPinnedItemList(List<PinnedItem> list) {
        this.items = list;
    }

    public void add(int i, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends PinnedItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(PinnedItem pinnedItem) {
        C12775o.m28639i(pinnedItem, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.items.contains(pinnedItem);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        return this.items.containsAll(collection);
    }

    public PinnedItem get(int i) {
        return this.items.get(i);
    }

    public int getSize() {
        return this.items.size();
    }

    public int indexOf(PinnedItem pinnedItem) {
        C12775o.m28639i(pinnedItem, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.items.indexOf(pinnedItem);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public Iterator<PinnedItem> iterator() {
        return this.items.iterator();
    }

    public int lastIndexOf(PinnedItem pinnedItem) {
        C12775o.m28639i(pinnedItem, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.items.lastIndexOf(pinnedItem);
    }

    public ListIterator<PinnedItem> listIterator() {
        return this.items.listIterator();
    }

    public final void pin$foundation_release(PinnedItem pinnedItem) {
        C12775o.m28639i(pinnedItem, "item");
        this.items.add(pinnedItem);
    }

    public final void release$foundation_release(PinnedItem pinnedItem) {
        C12775o.m28639i(pinnedItem, "item");
        this.items.remove(pinnedItem);
    }

    public PinnedItem remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<PinnedItem> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PinnedItem set(int i, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public void sort(Comparator<? super PinnedItem> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<PinnedItem> subList(int i, int i2) {
        return this.items.subList(i, i2);
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends PinnedItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof PinnedItem)) {
            return false;
        }
        return contains((PinnedItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof PinnedItem)) {
            return -1;
        }
        return indexOf((PinnedItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof PinnedItem)) {
            return -1;
        }
        return lastIndexOf((PinnedItem) obj);
    }

    public ListIterator<PinnedItem> listIterator(int i) {
        return this.items.listIterator(i);
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }

    public LazyLayoutPinnedItemList() {
        this(new SnapshotStateList());
    }

    public boolean add(PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
