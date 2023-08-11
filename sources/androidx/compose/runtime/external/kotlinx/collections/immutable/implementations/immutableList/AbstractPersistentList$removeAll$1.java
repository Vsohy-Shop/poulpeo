package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: AbstractPersistentList.kt */
final class AbstractPersistentList$removeAll$1 extends C12777p implements Function1<E, Boolean> {
    final /* synthetic */ Collection<E> $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AbstractPersistentList$removeAll$1(Collection<? extends E> collection) {
        super(1);
        this.$elements = collection;
    }

    public final Boolean invoke(E e) {
        return Boolean.valueOf(this.$elements.contains(e));
    }
}
