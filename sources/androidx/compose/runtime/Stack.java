package androidx.compose.runtime;

import java.util.ArrayList;

/* compiled from: Stack.kt */
public final class Stack<T> {
    private final ArrayList<T> backing = new ArrayList<>();

    public final void clear() {
        this.backing.clear();
    }

    public final int getSize() {
        return this.backing.size();
    }

    public final boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final T peek() {
        return this.backing.get(getSize() - 1);
    }

    public final T pop() {
        return this.backing.remove(getSize() - 1);
    }

    public final boolean push(T t) {
        return this.backing.add(t);
    }

    public final T[] toArray() {
        int size = this.backing.size();
        T[] tArr = new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = this.backing.get(i);
        }
        return tArr;
    }

    public final T peek(int i) {
        return this.backing.get(i);
    }
}
