package androidx.compose.p002ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.TreeSet */
/* compiled from: JvmTreeSet.jvm.kt */
public final class TreeSet<E> extends java.util.TreeSet<E> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TreeSet(Comparator<? super E> comparator) {
        super(comparator);
        C12775o.m28639i(comparator, "comparator");
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
