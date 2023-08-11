package p179o3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p139k3.C8544l;
import p183o7.C9004d;

/* renamed from: o3.a */
/* compiled from: ClientMetrics */
public final class C8957a {

    /* renamed from: e */
    private static final C8957a f13008e = new C8958a().mo43110b();

    /* renamed from: a */
    private final C8968f f13009a;

    /* renamed from: b */
    private final List<C8964d> f13010b;

    /* renamed from: c */
    private final C8959b f13011c;

    /* renamed from: d */
    private final String f13012d;

    /* renamed from: o3.a$a */
    /* compiled from: ClientMetrics */
    public static final class C8958a {

        /* renamed from: a */
        private C8968f f13013a = null;

        /* renamed from: b */
        private List<C8964d> f13014b = new ArrayList();

        /* renamed from: c */
        private C8959b f13015c = null;

        /* renamed from: d */
        private String f13016d = "";

        C8958a() {
        }

        /* renamed from: a */
        public C8958a mo43109a(C8964d dVar) {
            this.f13014b.add(dVar);
            return this;
        }

        /* renamed from: b */
        public C8957a mo43110b() {
            return new C8957a(this.f13013a, Collections.unmodifiableList(this.f13014b), this.f13015c, this.f13016d);
        }

        /* renamed from: c */
        public C8958a mo43111c(String str) {
            this.f13016d = str;
            return this;
        }

        /* renamed from: d */
        public C8958a mo43112d(C8959b bVar) {
            this.f13015c = bVar;
            return this;
        }

        /* renamed from: e */
        public C8958a mo43113e(C8968f fVar) {
            this.f13013a = fVar;
            return this;
        }
    }

    C8957a(C8968f fVar, List<C8964d> list, C8959b bVar, String str) {
        this.f13009a = fVar;
        this.f13010b = list;
        this.f13011c = bVar;
        this.f13012d = str;
    }

    /* renamed from: e */
    public static C8958a m18169e() {
        return new C8958a();
    }

    @C9004d(tag = 4)
    /* renamed from: a */
    public String mo43104a() {
        return this.f13012d;
    }

    @C9004d(tag = 3)
    /* renamed from: b */
    public C8959b mo43105b() {
        return this.f13011c;
    }

    @C9004d(tag = 2)
    /* renamed from: c */
    public List<C8964d> mo43106c() {
        return this.f13010b;
    }

    @C9004d(tag = 1)
    /* renamed from: d */
    public C8968f mo43107d() {
        return this.f13009a;
    }

    /* renamed from: f */
    public byte[] mo43108f() {
        return C8544l.m17150a(this);
    }
}
