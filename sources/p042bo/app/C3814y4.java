package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p126j0.C8300j;
import p404of.C13074a;

/* renamed from: bo.app.y4 */
public final class C3814y4 {

    /* renamed from: e */
    public static final C3815a f2814e = new C3815a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f2815a;

    /* renamed from: b */
    private final String f2816b;

    /* renamed from: c */
    private final String f2817c;

    /* renamed from: d */
    private final SharedPreferences f2818d;

    /* renamed from: bo.app.y4$a */
    public static final class C3815a {
        public /* synthetic */ C3815a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3815a() {
        }
    }

    /* renamed from: bo.app.y4$b */
    static final class C3816b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2819b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3816b(String str) {
            super(0);
            this.f2819b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Setting signature to: ", this.f2819b);
        }
    }

    public C3814y4(Context context, String str, String str2) {
        C12775o.m28639i(context, "context");
        this.f2815a = context;
        this.f2816b = str;
        this.f2817c = str2;
        this.f2818d = context.getSharedPreferences(C12775o.m28647q("com.braze.storage.sdk_auth_cache", C8300j.m16489c(context, str, str2)), 0);
    }

    /* renamed from: a */
    public final String mo29828a() {
        return this.f2818d.getString("auth_signature", (String) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3814y4)) {
            return false;
        }
        C3814y4 y4Var = (C3814y4) obj;
        if (C12775o.m28634d(this.f2815a, y4Var.f2815a) && C12775o.m28634d(this.f2816b, y4Var.f2816b) && C12775o.m28634d(this.f2817c, y4Var.f2817c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f2815a.hashCode() * 31;
        String str = this.f2816b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f2817c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "SdkAuthenticationCache(context=" + this.f2815a + ", userId=" + this.f2816b + ", apiKey=" + this.f2817c + ')';
    }

    /* renamed from: a */
    public final void mo29829a(String str) {
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3816b(str), 6, (Object) null);
        this.f2818d.edit().putString("auth_signature", str).apply();
    }
}
