package p180o4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C4785c;
import p231t4.C9713p;

/* renamed from: o4.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C8976e {

    /* renamed from: c */
    private static C8976e f13062c;

    /* renamed from: a */
    private final Context f13063a;

    /* renamed from: b */
    private volatile String f13064b;

    public C8976e(@NonNull Context context) {
        this.f13063a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: a */
    public static C8976e m18220a(@NonNull Context context) {
        C9713p.m20275j(context);
        synchronized (C8976e.class) {
            if (f13062c == null) {
                C8989r.m18241d(context);
                f13062c = new C8976e(context);
            }
        }
        return f13062c;
    }

    /* renamed from: d */
    static final C8985n m18221d(PackageInfo packageInfo, C8985n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C8986o oVar = new C8986o(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].equals(oVar)) {
                return nVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m18222e(@NonNull PackageInfo packageInfo, boolean z) {
        C8985n nVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                nVar = m18221d(packageInfo, C8988q.f13076a);
            } else {
                nVar = m18221d(packageInfo, C8988q.f13076a[0]);
            }
            if (nVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final C8973b0 m18223f(String str, boolean z, boolean z2) {
        C8973b0 b0Var;
        String str2;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C8973b0.m18213c("null pkg");
        }
        if (str.equals(this.f13064b)) {
            return C8973b0.m18212b();
        }
        if (C8989r.m18242e()) {
            b0Var = C8989r.m18239b(str, C4785c.m6699f(this.f13063a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f13063a.getPackageManager().getPackageInfo(str, 64);
                boolean f = C4785c.m6699f(this.f13063a);
                if (packageInfo == null) {
                    b0Var = C8973b0.m18213c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        b0Var = C8973b0.m18213c("single cert required");
                    } else {
                        C8986o oVar = new C8986o(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        C8973b0 a = C8989r.m18238a(str3, oVar, f, false);
                        if (!a.f13056a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C8989r.m18238a(str3, oVar, false, true).f13056a) {
                            b0Var = a;
                        } else {
                            b0Var = C8973b0.m18213c("debuggable release cert app rejected");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                if (str.length() != 0) {
                    str2 = "no pkg ".concat(str);
                } else {
                    str2 = new String("no pkg ");
                }
                return C8973b0.m18214d(str2, e);
            }
        }
        if (b0Var.f13056a) {
            this.f13064b = str;
        }
        return b0Var;
    }

    /* renamed from: b */
    public boolean mo43152b(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m18222e(packageInfo, false)) {
            return true;
        }
        if (m18222e(packageInfo, true)) {
            if (C4785c.m6699f(this.f13063a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo43153c(int i) {
        C8973b0 b0Var;
        int length;
        String[] packagesForUid = this.f13063a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            b0Var = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C9713p.m20275j(b0Var);
                    break;
                }
                b0Var = m18223f(packagesForUid[i2], false, false);
                if (b0Var.f13056a) {
                    break;
                }
                i2++;
            }
        } else {
            b0Var = C8973b0.m18213c("no pkgs");
        }
        b0Var.mo43145e();
        return b0Var.f13056a;
    }
}
