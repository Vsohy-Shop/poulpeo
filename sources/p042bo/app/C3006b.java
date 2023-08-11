package p042bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.b */
public final class C3006b {

    /* renamed from: c */
    public static final C3007a f1452c = new C3007a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f1453a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3429m2 f1454b;

    /* renamed from: bo.app.b$a */
    public static final class C3007a {

        /* renamed from: bo.app.b$a$a */
        static final class C3008a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3008a f1455b = new C3008a();

            C3008a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "com.amazon.device.messaging.ADM not found";
            }
        }

        /* renamed from: bo.app.b$a$b */
        static final class C3009b extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ Exception f1456b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3009b(Exception exc) {
                super(0);
                this.f1456b = exc;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Manifest not authored properly to support ADM. ADM manifest exception: ", this.f1456b);
            }
        }

        public /* synthetic */ C3007a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final boolean m2572b(Context context) {
            try {
                ADMManifest.checkManifestAuthoredProperly(context);
                return true;
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3009b(e), 6, (Object) null);
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo28612a(Context context) {
            C12775o.m28639i(context, "context");
            return m2571a() && m2572b(context);
        }

        private C3007a() {
        }

        /* renamed from: a */
        private final boolean m2571a() {
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                return true;
            } catch (Exception unused) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3008a.f1455b, 6, (Object) null);
                return false;
            }
        }
    }

    /* renamed from: bo.app.b$b */
    static final class C3010b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3006b f1457b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3010b(C3006b bVar) {
            super(0);
            this.f1457b = bVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: ", this.f1457b.f1454b.mo29312a());
        }
    }

    /* renamed from: bo.app.b$c */
    static final class C3011c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3011c f1458b = new C3011c();

        C3011c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Registering with ADM server...";
        }
    }

    public C3006b(Context context, C3429m2 m2Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(m2Var, "admRegistrationDataProvider");
        this.f1453a = context;
        this.f1454b = m2Var;
    }

    /* renamed from: a */
    public final void mo28611a() {
        if (this.f1454b.mo29312a() != null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3010b(this), 6, (Object) null);
            C3429m2 m2Var = this.f1454b;
            m2Var.mo29313a(m2Var.mo29312a());
            return;
        }
        ADM adm = new ADM(this.f1453a);
        if (adm.isSupported()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3011c.f1458b, 6, (Object) null);
            adm.startRegister();
        }
    }
}
