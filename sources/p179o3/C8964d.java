package p179o3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p183o7.C9004d;

/* renamed from: o3.d */
/* compiled from: LogSourceMetrics */
public final class C8964d {

    /* renamed from: c */
    private static final C8964d f13034c = new C8965a().mo43125a();

    /* renamed from: a */
    private final String f13035a;

    /* renamed from: b */
    private final List<C8961c> f13036b;

    /* renamed from: o3.d$a */
    /* compiled from: LogSourceMetrics */
    public static final class C8965a {

        /* renamed from: a */
        private String f13037a = "";

        /* renamed from: b */
        private List<C8961c> f13038b = new ArrayList();

        C8965a() {
        }

        /* renamed from: a */
        public C8964d mo43125a() {
            return new C8964d(this.f13037a, Collections.unmodifiableList(this.f13038b));
        }

        /* renamed from: b */
        public C8965a mo43126b(List<C8961c> list) {
            this.f13038b = list;
            return this;
        }

        /* renamed from: c */
        public C8965a mo43127c(String str) {
            this.f13037a = str;
            return this;
        }
    }

    C8964d(String str, List<C8961c> list) {
        this.f13035a = str;
        this.f13036b = list;
    }

    /* renamed from: c */
    public static C8965a m18191c() {
        return new C8965a();
    }

    @C9004d(tag = 2)
    /* renamed from: a */
    public List<C8961c> mo43123a() {
        return this.f13036b;
    }

    @C9004d(tag = 1)
    /* renamed from: b */
    public String mo43124b() {
        return this.f13035a;
    }
}
