package p211r5;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C4718a;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import p231t4.C9713p;

/* renamed from: r5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C9385a {

    /* renamed from: a */
    private static final C4718a f13959a = C4718a.m6394f();

    /* renamed from: b */
    private static final Object f13960b = new Object();
    @GuardedBy("ProviderInstaller.lock")

    /* renamed from: c */
    private static Method f13961c = null;
    @GuardedBy("ProviderInstaller.lock")

    /* renamed from: d */
    private static Method f13962d = null;

    /* renamed from: a */
    public static void m19410a(@NonNull Context context) {
        Context context2;
        String str;
        String str2;
        C9713p.m20276k(context, "Context must not be null");
        f13959a.mo32364k(context, 11925000);
        synchronized (f13960b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m6738e(context, DynamiteModule.f5075f, "com.google.android.gms.providerinstaller.dynamite").mo32581b();
            } catch (DynamiteModule.LoadingException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "Failed to load providerinstaller module: ".concat(valueOf);
                } else {
                    str2 = new String("Failed to load providerinstaller module: ");
                }
                Log.w("ProviderInstaller", str2);
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context d = C4785c.m6697d(context);
                if (d != null) {
                    try {
                        if (f13962d == null) {
                            Class cls = Long.TYPE;
                            f13962d = m19411b(d, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f13962d.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e2) {
                        String valueOf2 = String.valueOf(e2.getMessage());
                        if (valueOf2.length() != 0) {
                            str = "Failed to report request stats: ".concat(valueOf2);
                        } else {
                            str = new String("Failed to report request stats: ");
                        }
                        Log.w("ProviderInstaller", str);
                    }
                }
                if (d != null) {
                    m19412c(d, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            } else {
                m19412c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            }
        }
    }

    /* renamed from: b */
    private static Method m19411b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    @GuardedBy("ProviderInstaller.lock")
    /* renamed from: c */
    private static void m19412c(Context context, Context context2, String str) {
        String str2;
        String str3;
        try {
            if (f13961c == null) {
                f13961c = m19411b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f13961c.invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    str2 = e.getMessage();
                } else {
                    str2 = cause.getMessage();
                }
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str3 = "Failed to install provider: ".concat(valueOf);
                } else {
                    str3 = new String("Failed to install provider: ");
                }
                Log.e("ProviderInstaller", str3);
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
