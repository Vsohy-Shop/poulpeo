package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* compiled from: ActualJvm.jvm.kt */
public class ThreadLocal<T> extends ThreadLocal<T> {
    private final C13074a<T> initialValue;

    public ThreadLocal(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "initialValue");
        this.initialValue = aVar;
    }

    public T get() {
        return super.get();
    }

    /* access modifiers changed from: protected */
    public T initialValue() {
        return this.initialValue.invoke();
    }

    public void remove() {
        super.remove();
    }

    public void set(T t) {
        super.set(t);
    }
}
