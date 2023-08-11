package androidx.compose.runtime.collection;

import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: IdentityArraySet.kt */
public final class IdentityArraySet$iterator$1 implements Iterator<T>, C13212a {
    private int index;
    final /* synthetic */ IdentityArraySet<T> this$0;

    IdentityArraySet$iterator$1(IdentityArraySet<T> identityArraySet) {
        this.this$0 = identityArraySet;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        if (this.index < this.this$0.size()) {
            return true;
        }
        return false;
    }

    public T next() {
        T[] values = this.this$0.getValues();
        int i = this.index;
        this.index = i + 1;
        T t = values[i];
        C12775o.m28637g(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
