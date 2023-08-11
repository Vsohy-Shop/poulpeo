package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.w0 */
public final class C3760w0 implements C3699t2 {

    /* renamed from: a */
    private final C3699t2 f2719a;

    /* renamed from: b */
    private final C3285j2 f2720b;

    /* renamed from: bo.app.w0$a */
    static final class C3761a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3761a f2721b = new C3761a();

        C3761a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to delete the sealed session from the storage.";
        }
    }

    /* renamed from: bo.app.w0$b */
    static final class C3762b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3762b f2722b = new C3762b();

        C3762b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error occured while publishing exception.";
        }
    }

    /* renamed from: bo.app.w0$c */
    static final class C3763c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3763c f2723b = new C3763c();

        C3763c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get the active session from the storage.";
        }
    }

    /* renamed from: bo.app.w0$d */
    static final class C3764d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3764d f2724b = new C3764d();

        C3764d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to upsert active session in the storage.";
        }
    }

    public C3760w0(C3699t2 t2Var, C3285j2 j2Var) {
        C12775o.m28639i(t2Var, "sessionStorageManager");
        C12775o.m28639i(j2Var, "eventPublisher");
        this.f2719a = t2Var;
        this.f2720b = j2Var;
    }

    /* renamed from: a */
    public C3208h5 mo29501a() {
        try {
            return this.f2719a.mo29501a();
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3763c.f2723b, 4, (Object) null);
            mo29762a(this.f2720b, e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo29502a(C3208h5 h5Var) {
        C12775o.m28639i(h5Var, "session");
        try {
            this.f2719a.mo29502a(h5Var);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3764d.f2724b, 4, (Object) null);
            mo29762a(this.f2720b, e);
        }
    }

    /* renamed from: a */
    public void mo29503a(String str) {
        C12775o.m28639i(str, "sessionId");
        try {
            this.f2719a.mo29503a(str);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3761a.f2721b, 4, (Object) null);
            mo29762a(this.f2720b, e);
        }
    }

    /* renamed from: a */
    public final void mo29762a(C3285j2 j2Var, Throwable th) {
        C12775o.m28639i(j2Var, "eventPublisher");
        C12775o.m28639i(th, "throwable");
        try {
            j2Var.mo29152a(new C3638r5("A storage exception has occurred. Please view the stack trace for more details.", th), C3638r5.class);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3762b.f2722b, 4, (Object) null);
        }
    }
}
