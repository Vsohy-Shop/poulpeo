package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: Applier.kt */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    private final List<T> stack = new ArrayList();

    public AbstractApplier(T t) {
        this.root = t;
        this.current = t;
    }

    public final void clear() {
        this.stack.clear();
        setCurrent(this.root);
        onClear();
    }

    public void down(T t) {
        this.stack.add(getCurrent());
        setCurrent(t);
    }

    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    /* access modifiers changed from: protected */
    public final void move(List<T> list, int i, int i2, int i3) {
        int i4;
        C12775o.m28639i(list, "<this>");
        if (i > i2) {
            i4 = i2;
        } else {
            i4 = i2 - i3;
        }
        if (i3 != 1) {
            List<T> subList = list.subList(i, i3 + i);
            List D0 = C12686e0.m28207D0(subList);
            subList.clear();
            list.addAll(i4, D0);
        } else if (i == i2 + 1 || i == i2 - 1) {
            list.set(i, list.set(i2, list.get(i)));
        } else {
            list.add(i4, list.remove(i));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onClear();

    /* access modifiers changed from: protected */
    public final void remove(List<T> list, int i, int i2) {
        C12775o.m28639i(list, "<this>");
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }

    /* access modifiers changed from: protected */
    public void setCurrent(T t) {
        this.current = t;
    }

    /* renamed from: up */
    public void mo10550up() {
        if (!this.stack.isEmpty()) {
            List<T> list = this.stack;
            setCurrent(list.remove(list.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
