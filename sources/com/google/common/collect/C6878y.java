package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import p111h6.C8012n;

/* renamed from: com.google.common.collect.y */
/* compiled from: RegularImmutableMap */
final class C6878y<K, V> extends C6823m<K, V> {

    /* renamed from: i */
    static final C6823m<Object, Object> f9018i = new C6878y((Object) null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: f */
    private final transient Object f9019f;

    /* renamed from: g */
    final transient Object[] f9020g;

    /* renamed from: h */
    private final transient int f9021h;

    /* renamed from: com.google.common.collect.y$a */
    /* compiled from: RegularImmutableMap */
    static class C6879a<K, V> extends C6826n<Map.Entry<K, V>> {

        /* renamed from: d */
        private final transient C6823m<K, V> f9022d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final transient Object[] f9023e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final transient int f9024f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final transient int f9025g;

        /* renamed from: com.google.common.collect.y$a$a */
        /* compiled from: RegularImmutableMap */
        class C6880a extends C6819l<Map.Entry<K, V>> {
            C6880a() {
            }

            /* renamed from: I */
            public Map.Entry<K, V> get(int i) {
                C8012n.m15753l(i, C6879a.this.f9025g);
                int i2 = i * 2;
                return new AbstractMap.SimpleImmutableEntry(C6879a.this.f9023e[C6879a.this.f9024f + i2], C6879a.this.f9023e[i2 + (C6879a.this.f9024f ^ 1)]);
            }

            public int size() {
                return C6879a.this.f9025g;
            }
        }

        C6879a(C6823m<K, V> mVar, Object[] objArr, int i, int i2) {
            this.f9022d = mVar;
            this.f9023e = objArr;
            this.f9024f = i;
            this.f9025g = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public C6819l<Map.Entry<K, V>> mo39419A() {
            return new C6880a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo39421b(Object[] objArr, int i) {
            return mo39523s().mo39421b(objArr, i);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f9022d.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo39425q() {
            return true;
        }

        /* renamed from: r */
        public C6809d0<Map.Entry<K, V>> iterator() {
            return mo39523s().iterator();
        }

        public int size() {
            return this.f9025g;
        }
    }

    /* renamed from: com.google.common.collect.y$b */
    /* compiled from: RegularImmutableMap */
    static final class C6881b<K> extends C6826n<K> {

        /* renamed from: d */
        private final transient C6823m<K, ?> f9027d;

        /* renamed from: e */
        private final transient C6819l<K> f9028e;

        C6881b(C6823m<K, ?> mVar, C6819l<K> lVar) {
            this.f9027d = mVar;
            this.f9028e = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo39421b(Object[] objArr, int i) {
            return mo39523s().mo39421b(objArr, i);
        }

        public boolean contains(Object obj) {
            if (this.f9027d.get(obj) != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo39425q() {
            return true;
        }

        /* renamed from: r */
        public C6809d0<K> iterator() {
            return mo39523s().iterator();
        }

        /* renamed from: s */
        public C6819l<K> mo39523s() {
            return this.f9028e;
        }

        public int size() {
            return this.f9027d.size();
        }
    }

    /* renamed from: com.google.common.collect.y$c */
    /* compiled from: RegularImmutableMap */
    static final class C6882c extends C6819l<Object> {

        /* renamed from: d */
        private final transient Object[] f9029d;

        /* renamed from: e */
        private final transient int f9030e;

        /* renamed from: f */
        private final transient int f9031f;

        C6882c(Object[] objArr, int i, int i2) {
            this.f9029d = objArr;
            this.f9030e = i;
            this.f9031f = i2;
        }

        public Object get(int i) {
            C8012n.m15753l(i, this.f9031f);
            return this.f9029d[(i * 2) + this.f9030e];
        }

        public int size() {
            return this.f9031f;
        }
    }

    private C6878y(Object obj, Object[] objArr, int i) {
        this.f9019f = obj;
        this.f9020g = objArr;
        this.f9021h = i;
    }

    /* renamed from: l */
    static <K, V> C6878y<K, V> m11871l(int i, Object[] objArr) {
        if (i == 0) {
            return (C6878y) f9018i;
        }
        if (i == 1) {
            C6808d.m11616a(objArr[0], objArr[1]);
            return new C6878y<>((Object) null, objArr, 1);
        }
        C8012n.m15758q(i, objArr.length >> 1);
        return new C6878y<>(m11872m(objArr, i, C6826n.m11671t(i), 0), objArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object m11872m(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 != r0) goto L_0x000e
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            com.google.common.collect.C6808d.m11616a(r10, r9)
            r9 = 0
            return r9
        L_0x000e:
            int r0 = r11 + -1
            r1 = 128(0x80, float:1.794E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L_0x0050
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x001b:
            if (r2 >= r10) goto L_0x004f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            com.google.common.collect.C6808d.m11616a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.C6816j.m11623a(r5)
        L_0x0031:
            r5 = r5 & r0
            byte r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x003f
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x001b
        L_0x003f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x004a
            int r5 = r5 + 1
            goto L_0x0031
        L_0x004a:
            java.lang.IllegalArgumentException r9 = m11873n(r3, r4, r9, r6)
            throw r9
        L_0x004f:
            return r11
        L_0x0050:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L_0x0090
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x005a:
            if (r2 >= r10) goto L_0x008f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            com.google.common.collect.C6808d.m11616a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.C6816j.m11623a(r5)
        L_0x0070:
            r5 = r5 & r0
            short r6 = r11[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x007f
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x005a
        L_0x007f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x008a
            int r5 = r5 + 1
            goto L_0x0070
        L_0x008a:
            java.lang.IllegalArgumentException r9 = m11873n(r3, r4, r9, r6)
            throw r9
        L_0x008f:
            return r11
        L_0x0090:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x0095:
            if (r2 >= r10) goto L_0x00c5
            int r1 = r2 * 2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            com.google.common.collect.C6808d.m11616a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.common.collect.C6816j.m11623a(r6)
        L_0x00ab:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto L_0x00b5
            r11[r6] = r1
            int r2 = r2 + 1
            goto L_0x0095
        L_0x00b5:
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x00c0
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x00c0:
            java.lang.IllegalArgumentException r9 = m11873n(r4, r5, r9, r7)
            throw r9
        L_0x00c5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C6878y.m11872m(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: n */
    private static IllegalArgumentException m11873n(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* renamed from: o */
    static Object m11874o(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj2)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a = C6816j.m11623a(obj2.hashCode());
                while (true) {
                    int i3 = a & length;
                    byte b = bArr[i3] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (objArr[b].equals(obj2)) {
                        return objArr[b ^ 1];
                    }
                    a = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a2 = C6816j.m11623a(obj2.hashCode());
                while (true) {
                    int i4 = a2 & length2;
                    short s = sArr[i4] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (objArr[s].equals(obj2)) {
                        return objArr[s ^ 1];
                    }
                    a2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a3 = C6816j.m11623a(obj2.hashCode());
                while (true) {
                    int i5 = a3 & length3;
                    int i6 = iArr[i5];
                    if (i6 == -1) {
                        return null;
                    }
                    if (objArr[i6].equals(obj2)) {
                        return objArr[i6 ^ 1];
                    }
                    a3 = i5 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6826n<Map.Entry<K, V>> mo39491c() {
        return new C6879a(this, this.f9020g, 0, this.f9021h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6826n<K> mo39495e() {
        return new C6881b(this, new C6882c(this.f9020g, 0, this.f9021h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6817k<V> mo39498f() {
        return new C6882c(this.f9020g, 1, this.f9021h);
    }

    public V get(Object obj) {
        return m11874o(this.f9019f, this.f9020g, this.f9021h, 0, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo39502h() {
        return false;
    }

    public int size() {
        return this.f9021h;
    }
}
