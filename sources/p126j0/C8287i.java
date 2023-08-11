package p126j0;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: j0.i */
public final class C8287i {

    /* renamed from: a */
    private static final String f11674a = C8266c.f11641a.mo42215o("PermissionUtils");

    /* renamed from: j0.i$a */
    static final class C8288a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11675g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8288a(String str) {
            super(0);
            this.f11675g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failure checking permission ", this.f11675g);
        }
    }

    /* renamed from: j0.i$b */
    static final class C8289b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11676g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8289b(int i) {
            super(0);
            this.f11676g = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Incrementing permission request counter to " + this.f11676g + '.';
        }
    }

    /* renamed from: j0.i$c */
    static final class C8290c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8290c f11677g = new C8290c();

        C8290c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Attempting to execute requestPushPermissionPrompt()";
        }
    }

    /* renamed from: j0.i$d */
    static final class C8291d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8291d f11678g = new C8291d();

        C8291d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot request push permission with null Activity.";
        }
    }

    /* renamed from: j0.i$e */
    static final class C8292e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8292e f11679g = new C8292e();

        C8292e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Permission prompt would not display, not attempting to request push permission prompt.";
        }
    }

    /* renamed from: j0.i$f */
    static final class C8293f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8293f f11680g = new C8293f();

        C8293f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Requesting push permission from system.";
        }
    }

    /* renamed from: j0.i$g */
    static final class C8294g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8294g f11681g = new C8294g();

        C8294g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot request push permission with null Activity.";
        }
    }

    /* renamed from: j0.i$h */
    static final class C8295h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8295h f11682g = new C8295h();

        C8295h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Device API version of " + Build.VERSION.SDK_INT + " is too low to display push permission prompt.";
        }
    }

    /* renamed from: j0.i$i */
    static final class C8296i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11683g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8296i(int i) {
            super(0);
            this.f11683g = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "App Target API version of " + this.f11683g + " is too low to display push permission prompt.";
        }
    }

    /* renamed from: j0.i$j */
    static final class C8297j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8297j f11684g = new C8297j();

        C8297j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Notification permission already granted, doing nothing.";
        }
    }

    /* renamed from: j0.i$k */
    static final class C8298k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11685g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8298k(int i) {
            super(0);
            this.f11685g = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Notification permission request count is " + this.f11685g + ". Returning value of 'shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION)'";
        }
    }

    /* renamed from: j0.i$l */
    static final class C8299l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8299l f11686g = new C8299l();

        C8299l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Push Prompt can be shown on this device, within a reasonable confidence.";
        }
    }

    /* renamed from: a */
    public static final int m16470a(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "permission");
        return context.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0).getInt(str, 0);
    }

    /* renamed from: b */
    public static final boolean m16471b(Context context, String str) {
        C12775o.m28639i(str, "permission");
        if (context == null) {
            return false;
        }
        try {
            if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C8266c.m16397f(C8266c.f11641a, f11674a, C8266c.C8267a.f11649e, th, false, new C8288a(str), 8, (Object) null);
            return false;
        }
    }

    /* renamed from: c */
    public static final void m16472c(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "permission");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0);
        int i = sharedPreferences.getInt(str, 0) + 1;
        C8266c.m16397f(C8266c.f11641a, f11674a, (C8266c.C8267a) null, (Throwable) null, false, new C8289b(i), 14, (Object) null);
        sharedPreferences.edit().putInt(str, i).apply();
    }

    /* renamed from: d */
    public static final void m16473d(Activity activity) {
        C8266c cVar = C8266c.f11641a;
        String str = f11674a;
        C8266c.C8267a aVar = C8266c.C8267a.f11650f;
        C8266c.m16397f(cVar, str, aVar, (Throwable) null, false, C8290c.f11677g, 12, (Object) null);
        if (activity == null) {
            C8266c.m16397f(cVar, str, (C8266c.C8267a) null, (Throwable) null, false, C8291d.f11678g, 14, (Object) null);
        } else if (!m16474e(activity) || Build.VERSION.SDK_INT < 33) {
            C8266c.m16397f(cVar, str, (C8266c.C8267a) null, (Throwable) null, false, C8292e.f11679g, 14, (Object) null);
        } else {
            m16472c(activity, "android.permission.POST_NOTIFICATIONS");
            C8266c.m16397f(cVar, str, aVar, (Throwable) null, false, C8293f.f11680g, 12, (Object) null);
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, C8275f.m16444e());
        }
    }

    /* renamed from: e */
    public static final boolean m16474e(Activity activity) {
        if (activity == null) {
            C8266c.m16397f(C8266c.f11641a, f11674a, (C8266c.C8267a) null, (Throwable) null, false, C8294g.f11681g, 14, (Object) null);
            return false;
        } else if (Build.VERSION.SDK_INT < 33) {
            C8266c.m16397f(C8266c.f11641a, f11674a, C8266c.C8267a.I, (Throwable) null, false, C8295h.f11682g, 12, (Object) null);
            return false;
        } else {
            int i = activity.getApplicationInfo().targetSdkVersion;
            if (i < 33) {
                C8266c.m16397f(C8266c.f11641a, f11674a, C8266c.C8267a.I, (Throwable) null, false, new C8296i(i), 12, (Object) null);
                return false;
            } else if (m16471b(activity, "android.permission.POST_NOTIFICATIONS")) {
                C8266c.m16397f(C8266c.f11641a, f11674a, C8266c.C8267a.I, (Throwable) null, false, C8297j.f11684g, 12, (Object) null);
                return false;
            } else {
                int a = m16470a(activity, "android.permission.POST_NOTIFICATIONS");
                if (a >= 2) {
                    C8266c.m16397f(C8266c.f11641a, f11674a, C8266c.C8267a.I, (Throwable) null, false, new C8298k(a), 12, (Object) null);
                    return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
                }
                C8266c.m16397f(C8266c.f11641a, f11674a, C8266c.C8267a.f11650f, (Throwable) null, false, C8299l.f11686g, 12, (Object) null);
                return true;
            }
        }
    }
}
