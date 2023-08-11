package p174n8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import p193p7.C9073c;

/* renamed from: n8.a */
/* compiled from: DataCollectionConfigStorage */
public class C8938a {

    /* renamed from: a */
    private final Context f12981a;

    /* renamed from: b */
    private final SharedPreferences f12982b;

    /* renamed from: c */
    private final C9073c f12983c;

    /* renamed from: d */
    private boolean f12984d = m18130c();

    public C8938a(Context context, String str, C9073c cVar) {
        Context a = m18129a(context);
        this.f12981a = a;
        this.f12982b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f12983c = cVar;
    }

    /* renamed from: a */
    private static Context m18129a(Context context) {
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: c */
    private boolean m18130c() {
        if (this.f12982b.contains("firebase_data_collection_default_enabled")) {
            return this.f12982b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m18131d();
    }

    /* renamed from: d */
    private boolean m18131d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f12981a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f12981a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean mo43091b() {
        return this.f12984d;
    }
}
