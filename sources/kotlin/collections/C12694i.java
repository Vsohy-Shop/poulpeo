package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlin.collections.i */
/* compiled from: AbstractSet.kt */
public abstract class C12694i<E> extends C12662a<E> implements Set<E> {
    public static final C12695a Companion = new C12695a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.collections.i$a */
    /* compiled from: AbstractSet.kt */
    public static final class C12695a {
        private C12695a() {
        }

        public /* synthetic */ C12695a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo50527a(Set<?> set, Set<?> set2) {
            C12775o.m28639i(set, "c");
            C12775o.m28639i(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        /* renamed from: b */
        public final int mo50528b(Collection<?> collection) {
            int i;
            C12775o.m28639i(collection, "c");
            int i2 = 0;
            for (Object next : collection) {
                if (next != null) {
                    i = next.hashCode();
                } else {
                    i = 0;
                }
                i2 += i;
            }
            return i2;
        }
    }

    protected C12694i() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return Companion.mo50527a(this, (Set) obj);
    }

    public int hashCode() {
        return Companion.mo50528b(this);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
