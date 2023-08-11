package p442uf;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* renamed from: uf.j */
/* compiled from: KProperty.kt */
public interface C13599j<T, V> extends KProperty<V>, Function1<T, V> {

    /* renamed from: uf.j$a */
    /* compiled from: KProperty.kt */
    public interface C13600a<T, V> extends KProperty.C12788a<V>, Function1<T, V> {
    }

    V get(T t);

    Object getDelegate(T t);

    C13600a<T, V> getGetter();
}
