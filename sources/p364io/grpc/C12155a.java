package p364io.grpc;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import p111h6.C8007k;

/* renamed from: io.grpc.a */
/* compiled from: Attributes */
public final class C12155a {

    /* renamed from: b */
    public static final C12155a f19047b = new C12155a(Collections.emptyMap());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C12158c<?>, Object> f19048a;

    /* renamed from: io.grpc.a$b */
    /* compiled from: Attributes */
    public static final class C12157b {

        /* renamed from: a */
        private C12155a f19049a;

        /* renamed from: b */
        private Map<C12158c<?>, Object> f19050b;

        /* renamed from: b */
        private Map<C12158c<?>, Object> m26516b(int i) {
            if (this.f19050b == null) {
                this.f19050b = new IdentityHashMap(i);
            }
            return this.f19050b;
        }

        /* renamed from: a */
        public C12155a mo49612a() {
            if (this.f19050b != null) {
                for (Map.Entry entry : this.f19049a.f19048a.entrySet()) {
                    if (!this.f19050b.containsKey(entry.getKey())) {
                        this.f19050b.put(entry.getKey(), entry.getValue());
                    }
                }
                this.f19049a = new C12155a(this.f19050b);
                this.f19050b = null;
            }
            return this.f19049a;
        }

        /* renamed from: c */
        public <T> C12157b mo49613c(C12158c<T> cVar) {
            if (this.f19049a.f19048a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f19049a.f19048a);
                identityHashMap.remove(cVar);
                this.f19049a = new C12155a(identityHashMap);
            }
            Map<C12158c<?>, Object> map = this.f19050b;
            if (map != null) {
                map.remove(cVar);
            }
            return this;
        }

        /* renamed from: d */
        public <T> C12157b mo49614d(C12158c<T> cVar, T t) {
            m26516b(1).put(cVar, t);
            return this;
        }

        private C12157b(C12155a aVar) {
            this.f19049a = aVar;
        }
    }

    /* renamed from: io.grpc.a$c */
    /* compiled from: Attributes */
    public static final class C12158c<T> {

        /* renamed from: a */
        private final String f19051a;

        private C12158c(String str) {
            this.f19051a = str;
        }

        /* renamed from: a */
        public static <T> C12158c<T> m26520a(String str) {
            return new C12158c<>(str);
        }

        public String toString() {
            return this.f19051a;
        }
    }

    /* renamed from: c */
    public static C12157b m26513c() {
        return new C12157b();
    }

    /* renamed from: b */
    public <T> T mo49607b(C12158c<T> cVar) {
        return this.f19048a.get(cVar);
    }

    /* renamed from: d */
    public C12157b mo49608d() {
        return new C12157b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r7 == 0) goto L_0x005a
            java.lang.Class<io.grpc.a> r2 = p364io.grpc.C12155a.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L_0x0010
            goto L_0x005a
        L_0x0010:
            io.grpc.a r7 = (p364io.grpc.C12155a) r7
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r2 = r6.f19048a
            int r2 = r2.size()
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r3 = r7.f19048a
            int r3 = r3.size()
            if (r2 == r3) goto L_0x0021
            return r1
        L_0x0021:
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r2 = r6.f19048a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x002b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r4 = r7.f19048a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Object r4 = r3.getValue()
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r5 = r7.f19048a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = p111h6.C8007k.m15735a(r4, r3)
            if (r3 != 0) goto L_0x002b
            return r1
        L_0x0059:
            return r0
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.C12155a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        for (Map.Entry next : this.f19048a.entrySet()) {
            i += C8007k.m15736b(next.getKey(), next.getValue());
        }
        return i;
    }

    public String toString() {
        return this.f19048a.toString();
    }

    private C12155a(Map<C12158c<?>, Object> map) {
        this.f19048a = map;
    }
}
