package p042bo.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.s1 */
public final class C3662s1 {

    /* renamed from: a */
    public static final C3662s1 f2543a = new C3662s1();

    /* renamed from: bo.app.s1$a */
    static final class C3663a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3663a f2544b = new C3663a();

        C3663a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services Availability API not found. Google Play Services not enabled.";
        }
    }

    /* renamed from: bo.app.s1$b */
    static final class C3664b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3664b f2545b = new C3664b();

        C3664b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services is available.";
        }
    }

    /* renamed from: bo.app.s1$c */
    static final class C3665c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2546b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3665c(int i) {
            super(0);
            this.f2546b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Google Play Services is unavailable. Connection result: ", Integer.valueOf(this.f2546b));
        }
    }

    /* renamed from: bo.app.s1$d */
    static final class C3666d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3666d f2547b = new C3666d();

        C3666d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unexpected exception while checking for com.google.android.gsf";
        }
    }

    private C3662s1() {
    }

    /* renamed from: a */
    public static final boolean m3844a(Context context) {
        C12775o.m28639i(context, "context");
        int g = GoogleApiAvailability.m6375n().mo32346g(context);
        if (g == 0) {
            C8266c.m16396e(C8266c.f11641a, f2543a, (C8266c.C8267a) null, (Throwable) null, false, C3664b.f2545b, 7, (Object) null);
            return true;
        }
        C8266c.m16396e(C8266c.f11641a, f2543a, (C8266c.C8267a) null, (Throwable) null, false, new C3665c(g), 7, (Object) null);
        return false;
    }

    /* renamed from: b */
    public static final boolean m3845b(Context context) {
        C12775o.m28639i(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", PackageManager.PackageInfoFlags.of(0));
            } else {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f2543a, C8266c.C8267a.f11651g, e, false, C3666d.f2547b, 4, (Object) null);
            return false;
        }
    }
}
