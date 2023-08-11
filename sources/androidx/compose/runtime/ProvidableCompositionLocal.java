package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

@Stable
/* compiled from: CompositionLocal.kt */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProvidableCompositionLocal(C13074a<? extends T> aVar) {
        super(aVar, (DefaultConstructorMarker) null);
        C12775o.m28639i(aVar, "defaultFactory");
    }

    public final ProvidedValue<T> provides(T t) {
        return new ProvidedValue<>(this, t, true);
    }

    public final ProvidedValue<T> providesDefault(T t) {
        return new ProvidedValue<>(this, t, false);
    }
}
