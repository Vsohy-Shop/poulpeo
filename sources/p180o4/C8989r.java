package p180o4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import p036b5.C2890b;
import p231t4.C9713p;
import p231t4.C9732v0;
import p231t4.C9736w0;
import p286y4.C10667a;
import p286y4.C10676j;

/* renamed from: o4.r */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C8989r {

    /* renamed from: a */
    static final C8987p f13077a = new C8981j(C8985n.m18231J("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b */
    static final C8987p f13078b = new C8982k(C8985n.m18231J("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c */
    static final C8987p f13079c = new C8983l(C8985n.m18231J("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d */
    static final C8987p f13080d = new C8984m(C8985n.m18231J("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e */
    private static volatile C9736w0 f13081e;

    /* renamed from: f */
    private static final Object f13082f = new Object();

    /* renamed from: g */
    private static Context f13083g;

    /* renamed from: a */
    static C8973b0 m18238a(String str, C8985n nVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m18243f(str, nVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [b5.a, android.os.IBinder] */
    /* renamed from: b */
    static C8973b0 m18239b(String str, boolean z, boolean z2, boolean z3) {
        C8973b0 b0Var;
        String str2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C9713p.m20275j(f13083g);
            try {
                m18244g();
                C8993v d2 = f13081e.mo44260d2(new C8990s(str, z, false, C2890b.m2297b3(f13083g), false));
                if (d2.mo43167F()) {
                    b0Var = C8973b0.m18212b();
                } else {
                    String A = d2.mo43166A();
                    if (A == null) {
                        A = "error checking package certificate";
                    }
                    if (d2.mo43168G() == 4) {
                        b0Var = C8973b0.m18214d(A, new PackageManager.NameNotFoundException());
                    } else {
                        b0Var = C8973b0.m18213c(A);
                    }
                }
            } catch (DynamiteModule.LoadingException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "module init: ".concat(valueOf);
                } else {
                    str2 = new String("module init: ");
                }
                b0Var = C8973b0.m18214d(str2, e);
            }
        } catch (RemoteException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            b0Var = C8973b0.m18214d("module call", e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return b0Var;
    }

    /* renamed from: c */
    static /* synthetic */ String m18240c(boolean z, String str, C8985n nVar) {
        boolean z2;
        String str2;
        if (z || !m18243f(str, nVar, true, false).f13056a) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (true != z2) {
            str2 = "not allowed";
        } else {
            str2 = "debug cert rejected";
        }
        MessageDigest b = C10667a.m22665b(Constants.SHA1);
        C9713p.m20275j(b);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{str2, str, C10676j.m22689a(b.digest(nVar.mo43158b3())), Boolean.valueOf(z), "12451000.false"});
    }

    /* renamed from: d */
    static synchronized void m18241d(Context context) {
        synchronized (C8989r.class) {
            if (f13083g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f13083g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    static boolean m18242e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m18244g();
            boolean d = f13081e.mo44259d();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d;
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: f */
    private static C8973b0 m18243f(String str, C8985n nVar, boolean z, boolean z2) {
        String str2;
        try {
            m18244g();
            C9713p.m20275j(f13083g);
            try {
                if (f13081e.mo44258N0(new C8995x(str, nVar, z, z2), C2890b.m2297b3(f13083g.getPackageManager()))) {
                    return C8973b0.m18212b();
                }
                return new C8971a0(new C8980i(z, str, nVar), (C8997z) null);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C8973b0.m18214d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                str2 = "module init: ".concat(valueOf);
            } else {
                str2 = new String("module init: ");
            }
            return C8973b0.m18214d(str2, e2);
        }
    }

    /* renamed from: g */
    private static void m18244g() {
        if (f13081e == null) {
            C9713p.m20275j(f13083g);
            synchronized (f13082f) {
                if (f13081e == null) {
                    f13081e = C9732v0.m20322G(DynamiteModule.m6738e(f13083g, DynamiteModule.f5075f, "com.google.android.gms.googlecertificates").mo32582d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
