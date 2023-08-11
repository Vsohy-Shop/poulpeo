package p336ef;

import java.io.Serializable;
import kotlin.Lazy;

/* renamed from: ef.d */
/* compiled from: Lazy.kt */
public final class C11896d<T> implements Lazy<T>, Serializable {

    /* renamed from: b */
    private final T f18585b;

    public C11896d(T t) {
        this.f18585b = t;
    }

    public T getValue() {
        return this.f18585b;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
