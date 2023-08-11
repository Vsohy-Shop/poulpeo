package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.C12775o;

/* compiled from: ReadOnlyCollectionAdapters.kt */
public final class ImmutableSetAdapter<E> extends ImmutableCollectionAdapter<E> implements ImmutableSet<E> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImmutableSetAdapter(Set<? extends E> set) {
        super(set);
        C12775o.m28639i(set, "impl");
    }
}
