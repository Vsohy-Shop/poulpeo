package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.z4 */
public final class C3834z4 {

    /* renamed from: b */
    public static final C3835a f2849b = new C3835a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f2850a;

    /* renamed from: bo.app.z4$a */
    public static final class C3835a {
        public /* synthetic */ C3835a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3835a() {
        }
    }

    /* renamed from: bo.app.z4$b */
    static final class C3836b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ boolean f2851b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3836b(boolean z) {
            super(0);
            this.f2851b = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Setting Braze SDK disabled to: ", Boolean.valueOf(this.f2851b));
        }
    }

    public C3834z4(Context context) {
        C12775o.m28639i(context, "context");
        this.f2850a = new C3103e(context, "persistent.com.appboy.storage.sdk_enabled_cache");
    }

    /* renamed from: a */
    public final boolean mo29850a() {
        return this.f2850a.getBoolean("appboy_sdk_disabled", false);
    }

    /* renamed from: a */
    public final void mo29849a(boolean z) {
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3836b(z), 6, (Object) null);
        this.f2850a.edit().putBoolean("appboy_sdk_disabled", z).apply();
    }
}
