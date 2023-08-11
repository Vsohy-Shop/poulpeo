package kotlin.collections;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlin.collections.k */
/* compiled from: ArrayDeque.kt */
public final class C12699k<E> extends C12688f<E> {

    /* renamed from: e */
    public static final C12700a f20373e = new C12700a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private static final Object[] f20374f = new Object[0];

    /* renamed from: b */
    private int f20375b;

    /* renamed from: c */
    private Object[] f20376c;

    /* renamed from: d */
    private int f20377d;

    /* renamed from: kotlin.collections.k$a */
    /* compiled from: ArrayDeque.kt */
    public static final class C12700a {
        private C12700a() {
        }

        public /* synthetic */ C12700a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo50588a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 <= 0) {
                return i3;
            }
            if (i2 > 2147483639) {
                return Integer.MAX_VALUE;
            }
            return 2147483639;
        }
    }

    public C12699k(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f20374f;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.f20376c = objArr;
    }

    /* renamed from: b */
    private final void m28269b(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f20376c.length;
        while (i < length && it.hasNext()) {
            this.f20376c[i] = it.next();
            i++;
        }
        int i2 = this.f20375b;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f20376c[i3] = it.next();
        }
        this.f20377d = size() + collection.size();
    }

    /* renamed from: j */
    private final void m28270j(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f20376c;
        Object[] unused = C12708o.m28342i(objArr2, objArr, 0, this.f20375b, objArr2.length);
        Object[] objArr3 = this.f20376c;
        int length = objArr3.length;
        int i2 = this.f20375b;
        Object[] unused2 = C12708o.m28342i(objArr3, objArr, length - i2, 0, i2);
        this.f20375b = 0;
        this.f20376c = objArr;
    }

    /* renamed from: k */
    private final int m28271k(int i) {
        if (i == 0) {
            return C12710p.m28385M(this.f20376c);
        }
        return i - 1;
    }

    /* renamed from: q */
    private final void m28272q(int i) {
        if (i >= 0) {
            Object[] objArr = this.f20376c;
            if (i > objArr.length) {
                if (objArr == f20374f) {
                    this.f20376c = new Object[C13537l.m30877d(i, 10)];
                } else {
                    m28270j(f20373e.mo50588a(objArr.length, i));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    /* renamed from: s */
    private final int m28273s(int i) {
        if (i == C12710p.m28385M(this.f20376c)) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: t */
    private final int m28274t(int i) {
        if (i < 0) {
            return i + this.f20376c.length;
        }
        return i;
    }

    /* renamed from: u */
    private final int m28275u(int i) {
        Object[] objArr = this.f20376c;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m28272q(size() + collection.size());
        m28269b(m28275u(this.f20375b + size()), collection);
        return true;
    }

    public final void addFirst(E e) {
        m28272q(size() + 1);
        int k = m28271k(this.f20375b);
        this.f20375b = k;
        this.f20376c[k] = e;
        this.f20377d = size() + 1;
    }

    public final void addLast(E e) {
        m28272q(size() + 1);
        this.f20376c[m28275u(this.f20375b + size())] = e;
        this.f20377d = size() + 1;
    }

    public void clear() {
        int u = m28275u(this.f20375b + size());
        int i = this.f20375b;
        if (i < u) {
            C12708o.m28352s(this.f20376c, null, i, u);
        } else if (!isEmpty()) {
            Object[] objArr = this.f20376c;
            C12708o.m28352s(objArr, null, this.f20375b, objArr.length);
            C12708o.m28352s(this.f20376c, null, 0, u);
        }
        this.f20375b = 0;
        this.f20377d = 0;
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final E first() {
        if (!isEmpty()) {
            return this.f20376c[this.f20375b];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public E get(int i) {
        C12671c.Companion.mo50423b(i, size());
        return this.f20376c[m28275u(this.f20375b + i)];
    }

    public int getSize() {
        return this.f20377d;
    }

    public int indexOf(Object obj) {
        int i;
        int u = m28275u(this.f20375b + size());
        int i2 = this.f20375b;
        if (i2 < u) {
            while (i2 < u) {
                if (C12775o.m28634d(obj, this.f20376c[i2])) {
                    i = this.f20375b;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < u) {
            return -1;
        } else {
            int length = this.f20376c.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < u) {
                        if (C12775o.m28634d(obj, this.f20376c[i3])) {
                            i2 = i3 + this.f20376c.length;
                            i = this.f20375b;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (C12775o.m28634d(obj, this.f20376c[i2])) {
                    i = this.f20375b;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final E last() {
        if (!isEmpty()) {
            return this.f20376c[m28275u(this.f20375b + C12726w.m28526m(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public int lastIndexOf(Object obj) {
        int i;
        int i2;
        int u = m28275u(this.f20375b + size());
        int i3 = this.f20375b;
        if (i3 < u) {
            i = u - 1;
            if (i3 <= i) {
                while (!C12775o.m28634d(obj, this.f20376c[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.f20375b;
            }
            return -1;
        }
        if (i3 > u) {
            int i4 = u - 1;
            while (true) {
                if (-1 >= i4) {
                    int M = C12710p.m28385M(this.f20376c);
                    int i5 = this.f20375b;
                    if (i5 <= M) {
                        while (!C12775o.m28634d(obj, this.f20376c[i])) {
                            if (i != i5) {
                                M = i - 1;
                            }
                        }
                        i2 = this.f20375b;
                    }
                } else if (C12775o.m28634d(obj, this.f20376c[i4])) {
                    i = i4 + this.f20376c.length;
                    i2 = this.f20375b;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    /* renamed from: r */
    public final E mo50579r() {
        if (isEmpty()) {
            return null;
        }
        return this.f20376c[this.f20375b];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f20376c
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f20375b
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.m28275u(r0)
            int r3 = r11.f20375b
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f20376c
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f20376c
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f20376c
            kotlin.collections.C12708o.m28352s(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f20376c
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f20376c
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f20376c
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = r2
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.m28275u(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f20376c
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f20376c
            r3[r5] = r6
            int r5 = r11.m28273s(r5)
            goto L_0x0087
        L_0x0086:
            r7 = r2
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f20375b
            int r5 = r5 - r12
            int r12 = r11.m28274t(r5)
            r11.f20377d = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C12699k.removeAll(java.util.Collection):boolean");
    }

    public E removeAt(int i) {
        C12671c.Companion.mo50423b(i, size());
        if (i == C12726w.m28526m(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int u = m28275u(this.f20375b + i);
        E e = this.f20376c[u];
        if (i < (size() >> 1)) {
            int i2 = this.f20375b;
            if (u >= i2) {
                Object[] objArr = this.f20376c;
                Object[] unused = C12708o.m28342i(objArr, objArr, i2 + 1, i2, u);
            } else {
                Object[] objArr2 = this.f20376c;
                Object[] unused2 = C12708o.m28342i(objArr2, objArr2, 1, 0, u);
                Object[] objArr3 = this.f20376c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f20375b;
                Object[] unused3 = C12708o.m28342i(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f20376c;
            int i4 = this.f20375b;
            objArr4[i4] = null;
            this.f20375b = m28273s(i4);
        } else {
            int u2 = m28275u(this.f20375b + C12726w.m28526m(this));
            if (u <= u2) {
                Object[] objArr5 = this.f20376c;
                Object[] unused4 = C12708o.m28342i(objArr5, objArr5, u, u + 1, u2 + 1);
            } else {
                Object[] objArr6 = this.f20376c;
                Object[] unused5 = C12708o.m28342i(objArr6, objArr6, u, u + 1, objArr6.length);
                Object[] objArr7 = this.f20376c;
                objArr7[objArr7.length - 1] = objArr7[0];
                Object[] unused6 = C12708o.m28342i(objArr7, objArr7, 0, 1, u2 + 1);
            }
            this.f20376c[u2] = null;
        }
        this.f20377d = size() - 1;
        return e;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E[] eArr = this.f20376c;
            int i = this.f20375b;
            E e = eArr[i];
            eArr[i] = null;
            this.f20375b = m28273s(i);
            this.f20377d = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int u = m28275u(this.f20375b + C12726w.m28526m(this));
            E[] eArr = this.f20376c;
            E e = eArr[u];
            eArr[u] = null;
            this.f20377d = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f20376c
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f20375b
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.m28275u(r0)
            int r3 = r11.f20375b
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.f20376c
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.f20376c
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f20376c
            kotlin.collections.C12708o.m28352s(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f20376c
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f20376c
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f20376c
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = r2
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.m28275u(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.f20376c
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.f20376c
            r3[r5] = r6
            int r5 = r11.m28273s(r5)
            goto L_0x0084
        L_0x0083:
            r7 = r2
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f20375b
            int r5 = r5 - r12
            int r12 = r11.m28274t(r5)
            r11.f20377d = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C12699k.retainAll(java.util.Collection):boolean");
    }

    public E set(int i, E e) {
        C12671c.Companion.mo50423b(i, size());
        int u = m28275u(this.f20375b + i);
        E[] eArr = this.f20376c;
        E e2 = eArr[u];
        eArr[u] = e;
        return e2;
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        if (tArr.length < size()) {
            tArr = C12704m.m28331a(tArr, size());
        }
        C12775o.m28637g(tArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int u = m28275u(this.f20375b + size());
        int i = this.f20375b;
        if (i < u) {
            Object[] unused = C12708o.m28346m(this.f20376c, tArr, 0, i, u, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f20376c;
            Object[] unused2 = C12708o.m28342i(objArr, tArr, 0, this.f20375b, objArr.length);
            Object[] objArr2 = this.f20376c;
            Object[] unused3 = C12708o.m28342i(objArr2, tArr, objArr2.length - this.f20375b, 0, u);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    /* renamed from: v */
    public final E mo50587v() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public void add(int i, E e) {
        C12671c.Companion.mo50424c(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            m28272q(size() + 1);
            int u = m28275u(this.f20375b + i);
            if (i < ((size() + 1) >> 1)) {
                int k = m28271k(u);
                int k2 = m28271k(this.f20375b);
                int i2 = this.f20375b;
                if (k >= i2) {
                    Object[] objArr = this.f20376c;
                    objArr[k2] = objArr[i2];
                    Object[] unused = C12708o.m28342i(objArr, objArr, i2, i2 + 1, k + 1);
                } else {
                    Object[] objArr2 = this.f20376c;
                    Object[] unused2 = C12708o.m28342i(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f20376c;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    Object[] unused3 = C12708o.m28342i(objArr3, objArr3, 0, 1, k + 1);
                }
                this.f20376c[k] = e;
                this.f20375b = k2;
            } else {
                int u2 = m28275u(this.f20375b + size());
                if (u < u2) {
                    Object[] objArr4 = this.f20376c;
                    Object[] unused4 = C12708o.m28342i(objArr4, objArr4, u + 1, u, u2);
                } else {
                    Object[] objArr5 = this.f20376c;
                    Object[] unused5 = C12708o.m28342i(objArr5, objArr5, 1, 0, u2);
                    Object[] objArr6 = this.f20376c;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    Object[] unused6 = C12708o.m28342i(objArr6, objArr6, u + 1, u, objArr6.length - 1);
                }
                this.f20376c[u] = e;
            }
            this.f20377d = size() + 1;
        }
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        C12671c.Companion.mo50424c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        m28272q(size() + collection.size());
        int u = m28275u(this.f20375b + size());
        int u2 = m28275u(this.f20375b + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f20375b;
            int i3 = i2 - size;
            if (u2 < i2) {
                Object[] objArr = this.f20376c;
                Object[] unused = C12708o.m28342i(objArr, objArr, i3, i2, objArr.length);
                if (size >= u2) {
                    Object[] objArr2 = this.f20376c;
                    Object[] unused2 = C12708o.m28342i(objArr2, objArr2, objArr2.length - size, 0, u2);
                } else {
                    Object[] objArr3 = this.f20376c;
                    Object[] unused3 = C12708o.m28342i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f20376c;
                    Object[] unused4 = C12708o.m28342i(objArr4, objArr4, 0, size, u2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f20376c;
                Object[] unused5 = C12708o.m28342i(objArr5, objArr5, i3, i2, u2);
            } else {
                Object[] objArr6 = this.f20376c;
                i3 += objArr6.length;
                int i4 = u2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    Object[] unused6 = C12708o.m28342i(objArr6, objArr6, i3, i2, u2);
                } else {
                    Object[] unused7 = C12708o.m28342i(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f20376c;
                    Object[] unused8 = C12708o.m28342i(objArr7, objArr7, 0, this.f20375b + length, u2);
                }
            }
            this.f20375b = i3;
            m28269b(m28274t(u2 - size), collection);
        } else {
            int i5 = u2 + size;
            if (u2 < u) {
                int i6 = size + u;
                Object[] objArr8 = this.f20376c;
                if (i6 <= objArr8.length) {
                    Object[] unused9 = C12708o.m28342i(objArr8, objArr8, i5, u2, u);
                } else if (i5 >= objArr8.length) {
                    Object[] unused10 = C12708o.m28342i(objArr8, objArr8, i5 - objArr8.length, u2, u);
                } else {
                    int length2 = u - (i6 - objArr8.length);
                    Object[] unused11 = C12708o.m28342i(objArr8, objArr8, 0, length2, u);
                    Object[] objArr9 = this.f20376c;
                    Object[] unused12 = C12708o.m28342i(objArr9, objArr9, i5, u2, length2);
                }
            } else {
                Object[] objArr10 = this.f20376c;
                Object[] unused13 = C12708o.m28342i(objArr10, objArr10, size, 0, u);
                Object[] objArr11 = this.f20376c;
                if (i5 >= objArr11.length) {
                    Object[] unused14 = C12708o.m28342i(objArr11, objArr11, i5 - objArr11.length, u2, objArr11.length);
                } else {
                    Object[] unused15 = C12708o.m28342i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f20376c;
                    Object[] unused16 = C12708o.m28342i(objArr12, objArr12, i5, u2, objArr12.length - size);
                }
            }
            m28269b(u2, collection);
        }
        return true;
    }

    public C12699k() {
        this.f20376c = f20374f;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
