package p255v6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.C6922c;
import java.util.concurrent.Executor;
import p222s6.C9511f;
import p276x5.C10406g;

/* renamed from: v6.s */
/* compiled from: DataCollectionArbiter */
public class C10019s {

    /* renamed from: a */
    private final SharedPreferences f15070a;

    /* renamed from: b */
    private final C6922c f15071b;

    /* renamed from: c */
    private final Object f15072c;

    /* renamed from: d */
    C10406g<Void> f15073d = new C10406g<>();

    /* renamed from: e */
    boolean f15074e = false;

    /* renamed from: f */
    private boolean f15075f = false;
    @Nullable

    /* renamed from: g */
    private Boolean f15076g;

    /* renamed from: h */
    private final C10406g<Void> f15077h = new C10406g<>();

    public C10019s(C6922c cVar) {
        Object obj = new Object();
        this.f15072c = obj;
        Context h = cVar.mo39766h();
        this.f15071b = cVar;
        this.f15070a = C9972g.m20828r(h);
        Boolean b = m21009b();
        this.f15076g = b == null ? m21008a(h) : b;
        synchronized (obj) {
            if (mo44598d()) {
                this.f15073d.mo45100e(null);
                this.f15074e = true;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    private Boolean m21008a(Context context) {
        Boolean f = m21011f(context);
        if (f == null) {
            this.f15075f = false;
            return null;
        }
        this.f15075f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    @Nullable
    /* renamed from: b */
    private Boolean m21009b() {
        if (!this.f15070a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f15075f = false;
        return Boolean.valueOf(this.f15070a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* renamed from: e */
    private void m21010e(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f15076g == null) {
            str2 = "global Firebase setting";
        } else if (this.f15075f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        C9511f.m19696f().mo43965b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str, str2}));
    }

    @Nullable
    /* renamed from: f */
    private static Boolean m21011f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            C9511f.m19696f().mo43968e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    /* renamed from: c */
    public void mo44597c(boolean z) {
        if (z) {
            this.f15077h.mo45100e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean mo44598d() {
        boolean z;
        Boolean bool = this.f15076g;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.f15071b.mo39771q();
        }
        m21010e(z);
        return z;
    }

    /* renamed from: g */
    public Task<Void> mo44599g() {
        Task<Void> a;
        synchronized (this.f15072c) {
            a = this.f15073d.mo45096a();
        }
        return a;
    }

    /* renamed from: h */
    public Task<Void> mo44600h(Executor executor) {
        return C10016r0.m21005j(executor, this.f15077h.mo45096a(), mo44599g());
    }
}
