package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.g1 */
public final class C3159g1 extends C3591r {

    /* renamed from: s */
    public static final C3160a f1719s = new C3160a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private final boolean f1720r;

    /* renamed from: bo.app.g1$a */
    public static final class C3160a {
        public /* synthetic */ C3160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3160a() {
        }
    }

    /* renamed from: bo.app.g1$b */
    static final class C3161b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3161b f1721b = new C3161b();

        C3161b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "FeatureFlagsSyncRequest executed successfully.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3159g1(String str) {
        super(new C3753v4(C12775o.m28647q(str, "feature_flags/sync")));
        C12775o.m28639i(str, "urlBase");
    }

    /* renamed from: a */
    public void mo28604a(C3285j2 j2Var, C3285j2 j2Var2, C3084d dVar) {
        C12775o.m28639i(j2Var, "internalPublisher");
        C12775o.m28639i(j2Var2, "externalPublisher");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3161b.f1721b, 7, (Object) null);
    }

    /* renamed from: b */
    public boolean mo28606b() {
        return this.f1720r;
    }
}
