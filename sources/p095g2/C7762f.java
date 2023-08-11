package p095g2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import java.util.concurrent.atomic.AtomicBoolean;
import p198q2.C9166l;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: g2.f */
/* compiled from: InAppPurchaseManager.kt */
public final class C7762f {

    /* renamed from: a */
    private static final AtomicBoolean f10774a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final C7762f f10775b = new C7762f();

    private C7762f() {
    }

    /* renamed from: a */
    public static final void m15130a() {
        Class<C7762f> cls = C7762f.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f10774a.set(true);
                m15131b();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static final void m15131b() {
        Class<C7762f> cls = C7762f.class;
        if (!C9925a.m20734d(cls)) {
            try {
                if (!f10774a.get()) {
                    return;
                }
                if (!f10775b.m15132c() || !C9166l.m18760g(C9166l.C9168b.IapLoggingLib2)) {
                    C7745a.m15074g();
                } else {
                    C7750b.m15078c(FacebookSdk.getApplicationContext());
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: c */
    private final boolean m15132c() {
        String string;
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo == null || (string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version")) == null || Integer.parseInt((String) C13755w.m31594t0(string, new String[]{"."}, false, 3, 2, (Object) null).get(0)) < 2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
        }
        return false;
    }
}
