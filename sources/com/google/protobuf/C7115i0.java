package com.google.protobuf;

import com.google.protobuf.C7160q1;

/* renamed from: com.google.protobuf.i0 */
/* compiled from: MapEntryLite */
public class C7115i0<K, V> {

    /* renamed from: a */
    private final C7116a<K, V> f9623a;

    /* renamed from: b */
    private final K f9624b;

    /* renamed from: c */
    private final V f9625c;

    /* renamed from: com.google.protobuf.i0$a */
    /* compiled from: MapEntryLite */
    static class C7116a<K, V> {

        /* renamed from: a */
        public final C7160q1.C7162b f9626a;

        /* renamed from: b */
        public final K f9627b;

        /* renamed from: c */
        public final C7160q1.C7162b f9628c;

        /* renamed from: d */
        public final V f9629d;

        public C7116a(C7160q1.C7162b bVar, K k, C7160q1.C7162b bVar2, V v) {
            this.f9626a = bVar;
            this.f9627b = k;
            this.f9628c = bVar2;
            this.f9629d = v;
        }
    }

    private C7115i0(C7160q1.C7162b bVar, K k, C7160q1.C7162b bVar2, V v) {
        this.f9623a = new C7116a<>(bVar, k, bVar2, v);
        this.f9624b = k;
        this.f9625c = v;
    }

    /* renamed from: b */
    static <K, V> int m13256b(C7116a<K, V> aVar, K k, V v) {
        return C7174t.m13803d(aVar.f9626a, 1, k) + C7174t.m13803d(aVar.f9628c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> C7115i0<K, V> m13257d(C7160q1.C7162b bVar, K k, C7160q1.C7162b bVar2, V v) {
        return new C7115i0<>(bVar, k, bVar2, v);
    }

    /* renamed from: e */
    static <K, V> void m13258e(CodedOutputStream codedOutputStream, C7116a<K, V> aVar, K k, V v) {
        C7174t.m13814z(codedOutputStream, aVar.f9626a, 1, k);
        C7174t.m13814z(codedOutputStream, aVar.f9628c, 2, v);
    }

    /* renamed from: a */
    public int mo40440a(int i, K k, V v) {
        return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(m13256b(this.f9623a, k, v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C7116a<K, V> mo40441c() {
        return this.f9623a;
    }
}
