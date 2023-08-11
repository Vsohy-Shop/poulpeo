package p042bo.app;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p355hf.C12067a;
import p355hf.C12079g;
import p404of.C13074a;
import p466yf.C13977i0;
import p466yf.C13995l0;
import p466yf.C14006n1;
import p466yf.C14016p1;
import p466yf.C14039u2;
import p466yf.C14054y1;

/* renamed from: bo.app.b5 */
public final class C3026b5 implements C13995l0 {

    /* renamed from: a */
    public static final C3026b5 f1477a = new C3026b5();

    /* renamed from: b */
    private static C3822z0 f1478b;

    /* renamed from: c */
    private static final C13977i0 f1479c;

    /* renamed from: d */
    private static final C14006n1 f1480d;

    /* renamed from: e */
    private static final C12079g f1481e;

    /* renamed from: bo.app.b5$a */
    static final class C3027a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3027a f1482b = new C3027a();

        C3027a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cancelling children of SerialCoroutineScope";
        }
    }

    /* renamed from: bo.app.b5$b */
    static final class C3028b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Throwable f1483b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3028b(Throwable th) {
            super(0);
            this.f1483b = th;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Child job of SerialCoroutineScope got exception: ", this.f1483b);
        }
    }

    /* renamed from: bo.app.b5$c */
    public static final class C3029c extends C12067a implements C13977i0 {
        public C3029c(C13977i0.C13978a aVar) {
            super(aVar);
        }

        public void handleException(C12079g gVar, Throwable th) {
            try {
                C8266c cVar = C8266c.f11641a;
                C3026b5 b5Var = C3026b5.f1477a;
                C8266c.m16396e(cVar, b5Var, C8266c.C8267a.f11649e, th, false, new C3028b(th), 4, (Object) null);
                C3822z0 b = b5Var.mo28665b();
                if (b != null) {
                    b.mo29152a(th, Throwable.class);
                }
            } catch (Exception unused) {
            }
        }
    }

    static {
        C3029c cVar = new C3029c(C13977i0.f22907a0);
        f1479c = cVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C12775o.m28638h(newSingleThreadExecutor, "newSingleThreadExecutor()");
        C14006n1 b = C14016p1.m32522b(newSingleThreadExecutor);
        f1480d = b;
        f1481e = b.plus(cVar).plus(C14039u2.m32561b((C14054y1) null, 1, (Object) null));
    }

    private C3026b5() {
    }

    /* renamed from: a */
    public final void mo28664a(C3822z0 z0Var) {
        f1478b = z0Var;
    }

    /* renamed from: b */
    public final C3822z0 mo28665b() {
        return f1478b;
    }

    public C12079g getCoroutineContext() {
        return f1481e;
    }

    /* renamed from: a */
    public final void mo28663a() {
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3027a.f1482b, 6, (Object) null);
        C13944d2.m32242i(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }
}
