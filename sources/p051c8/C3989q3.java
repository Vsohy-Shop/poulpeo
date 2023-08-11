package p051c8;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.C6922c;

/* renamed from: c8.q3 */
/* compiled from: SharedPreferencesUtils */
public class C3989q3 {

    /* renamed from: a */
    private final C6922c f3158a;

    public C3989q3(C6922c cVar) {
        this.f3158a = cVar;
    }

    /* renamed from: a */
    public boolean mo30009a(String str, boolean z) {
        SharedPreferences sharedPreferences = ((Application) this.f3158a.mo39766h()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, z);
        }
        mo30014f(str, z);
        return z;
    }

    /* renamed from: b */
    public boolean mo30010b(String str, boolean z) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Application application = (Application) this.f3158a.mo39766h();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(str))) {
                return applicationInfo.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo30011c(String str, boolean z) {
        SharedPreferences sharedPreferences = ((Application) this.f3158a.mo39766h()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, z);
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo30012d(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Application application = (Application) this.f3158a.mo39766h();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(str)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo30013e(String str) {
        return ((Application) this.f3158a.mo39766h()).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains(str);
    }

    /* renamed from: f */
    public void mo30014f(String str, boolean z) {
        SharedPreferences.Editor edit = ((Application) this.f3158a.mo39766h()).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}
