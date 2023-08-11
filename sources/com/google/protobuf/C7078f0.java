package com.google.protobuf;

import com.google.protobuf.C7196z;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.f0 */
/* compiled from: ListFieldSchema */
abstract class C7078f0 {

    /* renamed from: a */
    private static final C7078f0 f9555a = new C7080b();

    /* renamed from: b */
    private static final C7078f0 f9556b = new C7081c();

    /* renamed from: com.google.protobuf.f0$b */
    /* compiled from: ListFieldSchema */
    private static final class C7080b extends C7078f0 {

        /* renamed from: c */
        private static final Class<?> f9557c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private C7080b() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m12972f(Object obj, long j) {
            return (List) C7142o1.m13508C(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.d0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.d0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.d0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> m12973g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m12972f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.protobuf.C7075e0
                if (r1 == 0) goto L_0x0014
                com.google.protobuf.d0 r0 = new com.google.protobuf.d0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.protobuf.C7195y0
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.protobuf.C7196z.C7205i
                if (r1 == 0) goto L_0x0024
                com.google.protobuf.z$i r0 = (com.google.protobuf.C7196z.C7205i) r0
                com.google.protobuf.z$i r6 = r0.mo40188n(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.protobuf.C7142o1.m13523R(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f9557c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.protobuf.C7142o1.m13523R(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof com.google.protobuf.C7136n1
                if (r1 == 0) goto L_0x0062
                com.google.protobuf.d0 r1 = new com.google.protobuf.d0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.protobuf.n1 r0 = (com.google.protobuf.C7136n1) r0
                r1.addAll(r0)
                com.google.protobuf.C7142o1.m13523R(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof com.google.protobuf.C7195y0
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.protobuf.C7196z.C7205i
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.protobuf.z$i r1 = (com.google.protobuf.C7196z.C7205i) r1
                boolean r2 = r1.mo40193D()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.z$i r0 = r1.mo40188n(r0)
                com.google.protobuf.C7142o1.m13523R(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7078f0.C7080b.m12973g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo40299c(Object obj, long j) {
            Object obj2;
            List list = (List) C7142o1.m13508C(obj, j);
            if (list instanceof C7075e0) {
                obj2 = ((C7075e0) list).mo40226w();
            } else if (!f9557c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C7195y0) || !(list instanceof C7196z.C7205i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C7196z.C7205i iVar = (C7196z.C7205i) list;
                    if (iVar.mo40193D()) {
                        iVar.mo40200l();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C7142o1.m13523R(obj, j, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <E> void mo40300d(Object obj, Object obj2, long j) {
            List f = m12972f(obj2, j);
            List g = m12973g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            C7142o1.m13523R(obj, j, f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <L> List<L> mo40301e(Object obj, long j) {
            return m12973g(obj, j, 10);
        }
    }

    /* renamed from: com.google.protobuf.f0$c */
    /* compiled from: ListFieldSchema */
    private static final class C7081c extends C7078f0 {
        private C7081c() {
            super();
        }

        /* renamed from: f */
        static <E> C7196z.C7205i<E> m12977f(Object obj, long j) {
            return (C7196z.C7205i) C7142o1.m13508C(obj, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo40299c(Object obj, long j) {
            m12977f(obj, j).mo40200l();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <E> void mo40300d(Object obj, Object obj2, long j) {
            C7196z.C7205i f = m12977f(obj, j);
            C7196z.C7205i f2 = m12977f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo40193D()) {
                    f = f.mo40188n(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            C7142o1.m13523R(obj, j, f2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <L> List<L> mo40301e(Object obj, long j) {
            int i;
            C7196z.C7205i f = m12977f(obj, j);
            if (f.mo40193D()) {
                return f;
            }
            int size = f.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            C7196z.C7205i n = f.mo40188n(i);
            C7142o1.m13523R(obj, j, n);
            return n;
        }
    }

    private C7078f0() {
    }

    /* renamed from: a */
    static C7078f0 m12967a() {
        return f9555a;
    }

    /* renamed from: b */
    static C7078f0 m12968b() {
        return f9556b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo40299c(Object obj, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract <L> void mo40300d(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract <L> List<L> mo40301e(Object obj, long j);
}
