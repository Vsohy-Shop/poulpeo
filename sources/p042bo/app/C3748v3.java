package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p126j0.C8300j;
import p404of.C13074a;

/* renamed from: bo.app.v3 */
public final class C3748v3 {

    /* renamed from: b */
    public static final C3749a f2705b = new C3749a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f2706a;

    /* renamed from: bo.app.v3$a */
    public static final class C3749a {
        public /* synthetic */ C3749a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3749a() {
        }
    }

    /* renamed from: bo.app.v3$b */
    static final class C3750b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2707b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3750b(String str) {
            super(0);
            this.f2707b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Stored user ID is longer than 997 bytes. Truncating. Original user ID: ", this.f2707b);
        }
    }

    /* renamed from: bo.app.v3$c */
    static final class C3751c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3751c f2708b = new C3751c();

        C3751c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "userId is empty in updateLastUserId. Rejecting.";
        }
    }

    /* renamed from: bo.app.v3$d */
    static final class C3752d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2709b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3752d(String str) {
            super(0);
            this.f2709b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Offline user storage provider was given user ID longer than 997. Rejecting. User ID: ", this.f2709b);
        }
    }

    public C3748v3(Context context) {
        C12775o.m28639i(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f2706a = sharedPreferences;
    }

    /* renamed from: a */
    public final String mo29745a() {
        String str = "";
        String string = this.f2706a.getString("last_user", str);
        if (string != null) {
            str = string;
        }
        if (C8300j.m16487a(str) <= 997) {
            return str;
        }
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3750b(str), 6, (Object) null);
        String h = C8300j.m16494h(str, 997);
        mo29746a(h);
        return h;
    }

    /* renamed from: a */
    public final void mo29746a(String str) {
        C12775o.m28639i(str, "userId");
        if (str.length() == 0) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3751c.f2708b, 6, (Object) null);
        } else if (C8300j.m16487a(str) > 997) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3752d(str), 6, (Object) null);
        } else {
            SharedPreferences.Editor edit = this.f2706a.edit();
            edit.putString("last_user", str);
            edit.apply();
        }
    }
}
