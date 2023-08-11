package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8300j;
import p404of.C13074a;

/* renamed from: bo.app.x0 */
public final class C3781x0 {

    /* renamed from: b */
    public static final C3782a f2757b = new C3782a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final long f2758c = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    private final SharedPreferences f2759a;

    /* renamed from: bo.app.x0$a */
    public static final class C3782a {
        public /* synthetic */ C3782a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo29788a(C3785x1 x1Var) {
            C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
            String a = C3317k4.f1982j.mo29200a(x1Var);
            return x1Var.mo29052j() + a;
        }

        private C3782a() {
        }
    }

    /* renamed from: bo.app.x0$b */
    static final class C3783b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Map.Entry<String, ? extends Object> f2760b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3783b(Map.Entry<String, ? extends Object> entry) {
            super(0);
            this.f2760b = entry;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to get expiration time. Deleting entry: ", this.f2760b);
        }
    }

    /* renamed from: bo.app.x0$c */
    static final class C3784c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f2761b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3784c(C3785x1 x1Var) {
            super(0);
            this.f2761b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Event already seen in cache. Ignoring duplicate: ", this.f2761b);
        }
    }

    public C3781x0(Context context, String str, String str2) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str2, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.appboy.storage.event_data_validator", C8300j.m16489c(context, str, str2)), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f2759a = sharedPreferences;
        mo29785a();
    }

    /* renamed from: b */
    private final boolean m4076b(String str) {
        return this.f2759a.contains(str);
    }

    /* renamed from: a */
    public boolean mo29787a(C3785x1 x1Var) {
        C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
        if (x1Var.mo29052j() != C3040c1.PUSH_CLICKED) {
            return true;
        }
        mo29785a();
        String a = f2757b.mo29788a(x1Var);
        if (m4076b(a)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3784c(x1Var), 7, (Object) null);
            return false;
        }
        mo29786a(C8273e.m16435h() + f2758c, a);
        return true;
    }

    /* renamed from: a */
    private final void m4075a(String str) {
        this.f2759a.edit().remove(str).apply();
    }

    /* renamed from: a */
    public final void mo29786a(long j, String str) {
        C12775o.m28639i(str, "eventKey");
        this.f2759a.edit().putLong(str, j).apply();
    }

    /* renamed from: a */
    public final void mo29785a() {
        long h = C8273e.m16435h();
        for (Map.Entry next : this.f2759a.getAll().entrySet()) {
            try {
                Object value = next.getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                } else if (h >= ((Long) value).longValue()) {
                    Object key = next.getKey();
                    C12775o.m28638h(key, "entry.key");
                    m4075a((String) key);
                }
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C3783b(next), 4, (Object) null);
                Object key2 = next.getKey();
                C12775o.m28638h(key2, "entry.key");
                m4075a((String) key2);
            }
        }
    }
}
