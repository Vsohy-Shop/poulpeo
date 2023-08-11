package androidx.compose.runtime;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

@Stable
/* compiled from: CompositionLocal.kt */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;
    private final LazyValueHolder<T> defaultValueHolder;

    public /* synthetic */ CompositionLocal(C13074a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @ReadOnlyComposable
    @Composable
    public final T getCurrent(Composer composer, int i) {
        return composer.consume(this);
    }

    public final LazyValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    @Composable
    public abstract State<T> provided$runtime_release(T t, Composer composer, int i);

    private CompositionLocal(C13074a<? extends T> aVar) {
        this.defaultValueHolder = new LazyValueHolder<>(aVar);
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    public static /* synthetic */ void getDefaultValueHolder$runtime_release$annotations() {
    }
}
