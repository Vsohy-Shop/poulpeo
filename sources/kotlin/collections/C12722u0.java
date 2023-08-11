package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.collections.u0 */
/* compiled from: SlidingWindow.kt */
public final class C12722u0<E> extends C12671c<E> implements RandomAccess {

    /* renamed from: b */
    private final List<E> f20383b;

    /* renamed from: c */
    private int f20384c;

    /* renamed from: d */
    private int f20385d;

    public C12722u0(List<? extends E> list) {
        C12775o.m28639i(list, "list");
        this.f20383b = list;
    }

    /* renamed from: b */
    public final void mo50600b(int i, int i2) {
        C12671c.Companion.mo50425d(i, i2, this.f20383b.size());
        this.f20384c = i;
        this.f20385d = i2 - i;
    }

    public E get(int i) {
        C12671c.Companion.mo50423b(i, this.f20385d);
        return this.f20383b.get(this.f20384c + i);
    }

    public int getSize() {
        return this.f20385d;
    }
}
