package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import kotlin.jvm.internal.C12775o;

@Stable
/* compiled from: CompositionLocal.kt */
public final class CompositionLocalContext {
    public static final int $stable = 0;
    private final PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocals;

    public CompositionLocalContext(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
        C12775o.m28639i(persistentMap, "compositionLocals");
        this.compositionLocals = persistentMap;
    }

    public final PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocals$runtime_release() {
        return this.compositionLocals;
    }
}
