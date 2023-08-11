package p042bo.app;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.k1 */
public final class C3303k1 {

    /* renamed from: e */
    public static final C3304a f1965e = new C3304a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f1966a;

    /* renamed from: b */
    private final C3429m2 f1967b;

    /* renamed from: c */
    private final boolean f1968c;

    /* renamed from: d */
    private final boolean f1969d = C3465n4.m3487a("com.google.firebase.messaging.FirebaseMessaging", "getToken", (Class<?>[]) new Class[0]);

    /* renamed from: bo.app.k1$a */
    public static final class C3304a {
        public /* synthetic */ C3304a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3304a() {
        }
    }

    /* renamed from: bo.app.k1$b */
    static final class C3305b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3305b f1970b = new C3305b();

        C3305b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
        }
    }

    /* renamed from: bo.app.k1$c */
    static final class C3306c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Task<String> f1971b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3306c(Task<String> task) {
            super(0);
            this.f1971b = task;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception ", this.f1971b.mo35460k());
        }
    }

    /* renamed from: bo.app.k1$d */
    static final class C3307d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1972b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3307d(String str) {
            super(0);
            this.f1972b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Automatically obtained Firebase Cloud Messaging token: ", this.f1972b);
        }
    }

    /* renamed from: bo.app.k1$e */
    static final class C3308e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3308e f1973b = new C3308e();

        C3308e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to register for Firebase Cloud Messaging";
        }
    }

    /* renamed from: bo.app.k1$f */
    static final class C3309f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1974b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3309f(String str) {
            super(0);
            this.f1974b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Registering for Firebase Cloud Messaging token using sender id: ", this.f1974b);
        }
    }

    /* renamed from: bo.app.k1$g */
    static final class C3310g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3310g f1975b = new C3310g();

        C3310g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
        }
    }

    /* renamed from: bo.app.k1$h */
    static final class C3311h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3311h f1976b = new C3311h();

        C3311h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
        }
    }

    /* renamed from: bo.app.k1$i */
    static final class C3312i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3312i f1977b = new C3312i();

        C3312i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
        }
    }

    /* renamed from: bo.app.k1$j */
    static final class C3313j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Object f1978b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3313j(Object obj) {
            super(0);
            this.f1978b = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Automatically obtained Firebase Cloud Messaging token: ", this.f1978b);
        }
    }

    /* renamed from: bo.app.k1$k */
    static final class C3314k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3314k f1979b = new C3314k();

        C3314k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get push token via instance id";
        }
    }

    public C3303k1(Context context, C3429m2 m2Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(m2Var, "registrationDataProvider");
        this.f1966a = context;
        this.f1967b = m2Var;
        Class<String> cls = String.class;
        this.f1968c = C3465n4.m3487a("com.google.firebase.iid.FirebaseInstanceId", "getToken", (Class<?>[]) new Class[]{cls, cls});
    }

    /* renamed from: a */
    public final void mo29182a(String str) {
        C12775o.m28639i(str, "firebaseSenderId");
        try {
            if (this.f1969d) {
                FirebaseMessaging.getInstance().getToken().mo35452c(new C3082c7(this));
            } else if (this.f1968c) {
                m3213b(str);
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3308e.f1973b, 4, (Object) null);
        }
    }

    /* renamed from: b */
    private final void m3213b(String str) {
        Class<String> cls = String.class;
        C8266c cVar = C8266c.f11641a;
        C8266c.C8267a aVar = C8266c.C8267a.f11650f;
        C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, new C3309f(str), 6, (Object) null);
        try {
            Method b = C3465n4.m3488b("com.google.firebase.iid.FirebaseInstanceId", "getInstance", new Class[0]);
            if (b == null) {
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C3310g.f1975b, 7, (Object) null);
                return;
            }
            Object a = C3465n4.m3485a((Object) null, b, new Object[0]);
            if (a == null) {
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C3311h.f1976b, 7, (Object) null);
                return;
            }
            Method a2 = C3465n4.m3486a(a.getClass(), "getToken", (Class<?>[]) new Class[]{cls, cls});
            if (a2 == null) {
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C3312i.f1977b, 7, (Object) null);
                return;
            }
            Object a3 = C3465n4.m3485a(a, a2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (a3 instanceof String) {
                C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, new C3313j(a3), 6, (Object) null);
                this.f1967b.mo29313a((String) a3);
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3314k.f1979b, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m3211a(C3303k1 k1Var, Task task) {
        C12775o.m28639i(k1Var, "this$0");
        C12775o.m28639i(task, "task");
        if (!task.mo35465p()) {
            C8266c.m16396e(C8266c.f11641a, k1Var, C8266c.C8267a.f11651g, (Throwable) null, false, new C3306c(task), 6, (Object) null);
            return;
        }
        String str = (String) task.mo35461l();
        C8266c.m16396e(C8266c.f11641a, k1Var, C8266c.C8267a.f11650f, (Throwable) null, false, new C3307d(str), 6, (Object) null);
        k1Var.f1967b.mo29313a(str);
    }

    /* renamed from: a */
    public final boolean mo29183a() {
        if (!C3662s1.m3845b(this.f1966a)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3305b.f1970b, 6, (Object) null);
            return false;
        } else if (this.f1968c || this.f1969d) {
            return true;
        } else {
            return false;
        }
    }
}
