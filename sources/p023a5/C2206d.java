package p023a5;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import p286y4.C10680n;

/* renamed from: a5.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C2206d {
    @NonNull

    /* renamed from: a */
    protected final Context f984a;

    public C2206d(@NonNull Context context) {
        this.f984a = context;
    }

    /* renamed from: a */
    public int mo23526a(@NonNull String str) {
        return this.f984a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int mo23527b(@NonNull String str, @NonNull String str2) {
        return this.f984a.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    /* renamed from: c */
    public ApplicationInfo mo23528c(@NonNull String str, int i) {
        return this.f984a.getPackageManager().getApplicationInfo(str, i);
    }

    @NonNull
    /* renamed from: d */
    public CharSequence mo23529d(@NonNull String str) {
        return this.f984a.getPackageManager().getApplicationLabel(this.f984a.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    /* renamed from: e */
    public PackageInfo mo23530e(@NonNull String str, int i) {
        return this.f984a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: f */
    public boolean mo23531f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C2204b.m1796a(this.f984a);
        }
        if (!C10680n.m22704h() || (nameForUid = this.f984a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f984a.getPackageManager().isInstantApp(nameForUid);
    }

    /* renamed from: g */
    public final boolean mo23532g(int i, @NonNull String str) {
        if (C10680n.m22700d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f984a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f984a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
