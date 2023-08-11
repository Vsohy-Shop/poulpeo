package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: x6.b0 */
/* compiled from: ImmutableList */
public final class C10494b0<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    private final List<E> f15873b;

    private C10494b0(List<E> list) {
        this.f15873b = Collections.unmodifiableList(list);
    }

    @NonNull
    /* renamed from: b */
    public static <E> C10494b0<E> m22173b(@NonNull List<E> list) {
        return new C10494b0<>(list);
    }

    @NonNull
    /* renamed from: d */
    public static <E> C10494b0<E> m22174d(E... eArr) {
        return new C10494b0<>(Arrays.asList(eArr));
    }

    public boolean add(@NonNull E e) {
        return this.f15873b.add(e);
    }

    public boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.f15873b.addAll(collection);
    }

    public void clear() {
        this.f15873b.clear();
    }

    public boolean contains(@Nullable Object obj) {
        return this.f15873b.contains(obj);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f15873b.containsAll(collection);
    }

    public boolean equals(@Nullable Object obj) {
        return this.f15873b.equals(obj);
    }

    @NonNull
    public E get(int i) {
        return this.f15873b.get(i);
    }

    public int hashCode() {
        return this.f15873b.hashCode();
    }

    public int indexOf(@Nullable Object obj) {
        return this.f15873b.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f15873b.isEmpty();
    }

    @NonNull
    public Iterator<E> iterator() {
        return this.f15873b.iterator();
    }

    public int lastIndexOf(@Nullable Object obj) {
        return this.f15873b.lastIndexOf(obj);
    }

    @NonNull
    public ListIterator<E> listIterator() {
        return this.f15873b.listIterator();
    }

    public boolean remove(@Nullable Object obj) {
        return this.f15873b.remove(obj);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.f15873b.removeAll(collection);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        return this.f15873b.retainAll(collection);
    }

    @NonNull
    public E set(int i, @NonNull E e) {
        return this.f15873b.set(i, e);
    }

    public int size() {
        return this.f15873b.size();
    }

    @NonNull
    public List<E> subList(int i, int i2) {
        return this.f15873b.subList(i, i2);
    }

    @Nullable
    public Object[] toArray() {
        return this.f15873b.toArray();
    }

    public void add(int i, @NonNull E e) {
        this.f15873b.add(i, e);
    }

    public boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        return this.f15873b.addAll(i, collection);
    }

    @NonNull
    public ListIterator<E> listIterator(int i) {
        return this.f15873b.listIterator(i);
    }

    public E remove(int i) {
        return this.f15873b.remove(i);
    }

    public <T> T[] toArray(@Nullable T[] tArr) {
        return this.f15873b.toArray(tArr);
    }
}
