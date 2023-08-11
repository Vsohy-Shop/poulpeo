package p138k2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookSdk;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import p033b2.C2834c;
import p198q2.C9138d0;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: k2.a */
/* compiled from: OnDeviceProcessingManager.kt */
public final class C8508a {

    /* renamed from: a */
    private static final Set<String> f12114a = C12731y0.m28555i("fb_mobile_purchase", "StartTrial", "Subscribe");

    /* renamed from: b */
    public static final C8508a f12115b = new C8508a();

    /* renamed from: k2.a$a */
    /* compiled from: OnDeviceProcessingManager.kt */
    static final class C8509a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f12116b;

        /* renamed from: c */
        final /* synthetic */ C2834c f12117c;

        C8509a(String str, C2834c cVar) {
            this.f12116b = str;
            this.f12117c = cVar;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C8512c.m17062c(this.f12116b, C12723v.m28509d(this.f12117c));
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: k2.a$b */
    /* compiled from: OnDeviceProcessingManager.kt */
    static final class C8510b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f12118b;

        /* renamed from: c */
        final /* synthetic */ String f12119c;

        /* renamed from: d */
        final /* synthetic */ String f12120d;

        C8510b(Context context, String str, String str2) {
            this.f12118b = context;
            this.f12119c = str;
            this.f12120d = str2;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        SharedPreferences sharedPreferences = this.f12118b.getSharedPreferences(this.f12119c, 0);
                        String str = this.f12120d + "pingForOnDevice";
                        if (sharedPreferences.getLong(str, 0) == 0) {
                            C8512c.m17064e(this.f12120d);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(str, System.currentTimeMillis());
                            edit.apply();
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C8508a() {
    }

    /* renamed from: a */
    private final boolean m17053a(C2834c cVar) {
        boolean z;
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            if (!cVar.mo28335h() || !f12114a.contains(cVar.mo28333f())) {
                z = false;
            } else {
                z = true;
            }
            if ((!cVar.mo28335h()) || z) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m17054b() {
        boolean z;
        Class<C8508a> cls = C8508a.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            if (FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext()) || C9138d0.m18616R()) {
                z = false;
            } else {
                z = true;
            }
            if (!z || !C8512c.m17061b()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: c */
    public static final void m17055c(String str, C2834c cVar) {
        Class<C8508a> cls = C8508a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(str, "applicationId");
                C12775o.m28639i(cVar, NotificationCompat.CATEGORY_EVENT);
                if (f12115b.m17053a(cVar)) {
                    FacebookSdk.getExecutor().execute(new C8509a(str, cVar));
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static final void m17056d(String str, String str2) {
        Class<C8508a> cls = C8508a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                if (applicationContext != null && str != null && str2 != null) {
                    FacebookSdk.getExecutor().execute(new C8510b(applicationContext, str2, str));
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }
}
