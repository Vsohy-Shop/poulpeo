package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;

/* compiled from: ValueHolders.kt */
public final class StaticValueHolder<T> implements State<T> {
    private final T value;

    public StaticValueHolder(T t) {
        this.value = t;
    }

    public static /* synthetic */ StaticValueHolder copy$default(StaticValueHolder staticValueHolder, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = staticValueHolder.getValue();
        }
        return staticValueHolder.copy(obj);
    }

    public final T component1() {
        return getValue();
    }

    public final StaticValueHolder<T> copy(T t) {
        return new StaticValueHolder<>(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StaticValueHolder) && C12775o.m28634d(getValue(), ((StaticValueHolder) obj).getValue())) {
            return true;
        }
        return false;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        if (getValue() == null) {
            return 0;
        }
        return getValue().hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + getValue() + ')';
    }
}
