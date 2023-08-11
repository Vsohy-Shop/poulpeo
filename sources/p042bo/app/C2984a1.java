package p042bo.app;

import androidx.core.app.NotificationCompat;
import java.util.Collection;
import java.util.Set;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p281y.C10606a;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: bo.app.a1 */
public final class C2984a1 implements C3811y1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3811y1 f1415a;

    /* renamed from: b */
    private final C3285j2 f1416b;

    /* renamed from: c */
    private boolean f1417c;

    /* renamed from: bo.app.a1$a */
    static final class C2985a extends C12777p implements C13074a<C11921v> {

        /* renamed from: b */
        final /* synthetic */ C2984a1 f1418b;

        /* renamed from: c */
        final /* synthetic */ C3785x1 f1419c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2985a(C2984a1 a1Var, C3785x1 x1Var) {
            super(0);
            this.f1418b = a1Var;
            this.f1419c = x1Var;
        }

        /* renamed from: a */
        public final void mo28574a() {
            this.f1418b.f1415a.mo28571a(this.f1419c);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo28574a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.a1$b */
    static final class C2986b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C2986b f1420b = new C2986b();

        C2986b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Storage provider is closed. Not getting all events.";
        }
    }

    /* renamed from: bo.app.a1$c */
    static final class C2987c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C2987c f1421b = new C2987c();

        C2987c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get all events from storage.";
        }
    }

    /* renamed from: bo.app.a1$d */
    static final class C2988d extends C12777p implements C13074a<C11921v> {

        /* renamed from: b */
        final /* synthetic */ C2984a1 f1422b;

        /* renamed from: c */
        final /* synthetic */ Set<C3785x1> f1423c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2988d(C2984a1 a1Var, Set<? extends C3785x1> set) {
            super(0);
            this.f1422b = a1Var;
            this.f1423c = set;
        }

        /* renamed from: a */
        public final void mo28577a() {
            this.f1422b.f1415a.mo28572a((Set<? extends C3785x1>) this.f1423c);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo28577a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.a1$e */
    static final class C2989e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1424b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2989e(String str) {
            super(0);
            this.f1424b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Storage provider is closed. Failed to ", this.f1424b);
        }
    }

    @C12739f(mo50609c = "com.braze.storage.EventStorageDecorator$doCall$2", mo50610f = "EventStorageDecorator.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.a1$f */
    static final class C2990f extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f1425b;

        /* renamed from: c */
        private /* synthetic */ Object f1426c;

        /* renamed from: d */
        final /* synthetic */ C13074a<C11921v> f1427d;

        /* renamed from: e */
        final /* synthetic */ C2984a1 f1428e;

        /* renamed from: f */
        final /* synthetic */ String f1429f;

        /* renamed from: bo.app.a1$f$a */
        static final class C2991a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f1430b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2991a(String str) {
                super(0);
                this.f1430b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Failed to ", this.f1430b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2990f(C13074a<C11921v> aVar, C2984a1 a1Var, String str, C12074d<? super C2990f> dVar) {
            super(2, dVar);
            this.f1427d = aVar;
            this.f1428e = a1Var;
            this.f1429f = str;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C2990f) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C2990f fVar = new C2990f(this.f1427d, this.f1428e, this.f1429f, dVar);
            fVar.f1426c = obj;
            return fVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f1425b == 0) {
                C11910n.m25701b(obj);
                C13995l0 l0Var = (C13995l0) this.f1426c;
                try {
                    this.f1427d.invoke();
                } catch (Exception e) {
                    C8266c.m16396e(C8266c.f11641a, l0Var, C8266c.C8267a.f11649e, e, false, new C2991a(this.f1429f), 4, (Object) null);
                    this.f1428e.m2528a((Throwable) e);
                }
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.a1$g */
    static final class C2992g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C2992g f1431b = new C2992g();

        C2992g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log storage exception";
        }
    }

    public C2984a1(C3811y1 y1Var, C3285j2 j2Var) {
        C12775o.m28639i(y1Var, "storage");
        C12775o.m28639i(j2Var, "eventPublisher");
        this.f1415a = y1Var;
        this.f1416b = j2Var;
    }

    public void close() {
        this.f1417c = true;
    }

    /* renamed from: a */
    public Collection<C3785x1> mo28570a() {
        if (this.f1417c) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C2986b.f1420b, 6, (Object) null);
            return C12731y0.m28551e();
        }
        try {
            return this.f1415a.mo28570a();
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C2987c.f1421b, 4, (Object) null);
            m2528a((Throwable) e);
            return C12731y0.m28551e();
        }
    }

    /* renamed from: a */
    public void mo28571a(C3785x1 x1Var) {
        C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
        m2527a(C12775o.m28647q("add event ", x1Var), (C13074a<C11921v>) new C2985a(this, x1Var));
    }

    /* renamed from: a */
    public void mo28572a(Set<? extends C3785x1> set) {
        C12775o.m28639i(set, "events");
        m2527a(C12775o.m28647q("delete events ", set), (C13074a<C11921v>) new C2988d(this, set));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2528a(Throwable th) {
        try {
            this.f1416b.mo29152a(new C3638r5("A storage exception has occurred!", th), C3638r5.class);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C2992g.f1431b, 4, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m2527a(String str, C13074a<C11921v> aVar) {
        String str2 = str;
        if (this.f1417c) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C2989e(str2), 6, (Object) null);
            return;
        }
        C14054y1 unused = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C2990f(aVar, this, str2, (C12074d<? super C2990f>) null), 3, (Object) null);
    }
}
