package kotlin.collections;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.collections.v0 */
/* compiled from: SlidingWindow.kt */
final class C12724v0<T> extends C12671c<T> implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object[] f20386b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f20387c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f20388d;

    /* renamed from: e */
    private int f20389e;

    /* renamed from: kotlin.collections.v0$a */
    /* compiled from: SlidingWindow.kt */
    public static final class C12725a extends C12667b<T> {

        /* renamed from: d */
        private int f20390d;

        /* renamed from: e */
        private int f20391e;

        /* renamed from: f */
        final /* synthetic */ C12724v0<T> f20392f;

        C12725a(C12724v0<T> v0Var) {
            this.f20392f = v0Var;
            this.f20390d = v0Var.size();
            this.f20391e = v0Var.f20388d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo50413a() {
            if (this.f20390d == 0) {
                mo50414c();
                return;
            }
            mo50415e(this.f20392f.f20386b[this.f20391e]);
            this.f20391e = (this.f20391e + 1) % this.f20392f.f20387c;
            this.f20390d--;
        }
    }

    public C12724v0(Object[] objArr, int i) {
        C12775o.m28639i(objArr, "buffer");
        this.f20386b = objArr;
        boolean z = true;
        if (i >= 0) {
            if (i > objArr.length ? false : z) {
                this.f20387c = objArr.length;
                this.f20389e = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    public T get(int i) {
        C12671c.Companion.mo50423b(i, size());
        return this.f20386b[(this.f20388d + i) % this.f20387c];
    }

    public int getSize() {
        return this.f20389e;
    }

    public Iterator<T> iterator() {
        return new C12725a(this);
    }

    /* renamed from: q */
    public final void mo50601q(T t) {
        if (!mo50603s()) {
            this.f20386b[(this.f20388d + size()) % this.f20387c] = t;
            this.f20389e = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* renamed from: r */
    public final C12724v0<T> mo50602r(int i) {
        Object[] objArr;
        int i2 = this.f20387c;
        int i3 = C13537l.m30882i(i2 + (i2 >> 1) + 1, i);
        if (this.f20388d == 0) {
            objArr = Arrays.copyOf(this.f20386b, i3);
            C12775o.m28638h(objArr, "copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[i3]);
        }
        return new C12724v0<>(objArr, size());
    }

    /* renamed from: s */
    public final boolean mo50603s() {
        if (size() == this.f20387c) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final void mo50604t(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > size()) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
            } else if (i > 0) {
                int i2 = this.f20388d;
                int j = (i2 + i) % this.f20387c;
                if (i2 > j) {
                    C12708o.m28352s(this.f20386b, null, i2, this.f20387c);
                    C12708o.m28352s(this.f20386b, null, 0, j);
                } else {
                    C12708o.m28352s(this.f20386b, null, i2, j);
                }
                this.f20388d = j;
                this.f20389e = size() - i;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            C12775o.m28638h(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i = this.f20388d;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.f20387c) {
            tArr[i3] = this.f20386b[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            tArr[i3] = this.f20386b[i2];
            i3++;
            i2++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        C12775o.m28637g(tArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.RingBuffer.toArray>");
        return tArr;
    }

    public C12724v0(int i) {
        this(new Object[i], 0);
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
