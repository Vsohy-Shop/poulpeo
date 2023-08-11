package p198q2;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.C12775o;
import p251v2.C9925a;

/* renamed from: q2.s */
/* compiled from: InstallReferrerUtil.kt */
public final class C9188s {

    /* renamed from: a */
    public static final C9188s f13494a = new C9188s();

    /* renamed from: q2.s$a */
    /* compiled from: InstallReferrerUtil.kt */
    public interface C9189a {
        /* renamed from: a */
        void mo28376a(String str);
    }

    private C9188s() {
    }

    /* renamed from: b */
    private final boolean m18816b() {
        return FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getBoolean("is_referrer_updated", false);
    }

    /* renamed from: c */
    private final void m18817c(C9189a aVar) {
        InstallReferrerClient build = InstallReferrerClient.newBuilder(FacebookSdk.getApplicationContext()).build();
        try {
            build.startConnection(new C9190b(build, aVar));
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m18818d(C9189a aVar) {
        C12775o.m28639i(aVar, "callback");
        C9188s sVar = f13494a;
        if (!sVar.m18816b()) {
            sVar.m18817c(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m18819e() {
        FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    /* renamed from: q2.s$b */
    /* compiled from: InstallReferrerUtil.kt */
    public static final class C9190b implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ InstallReferrerClient f13495a;

        /* renamed from: b */
        final /* synthetic */ C9189a f13496b;

        C9190b(InstallReferrerClient installReferrerClient, C9189a aVar) {
            this.f13495a = installReferrerClient;
            this.f13496b = aVar;
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (!C9925a.m20734d(this)) {
                if (i == 0) {
                    try {
                        InstallReferrerClient installReferrerClient = this.f13495a;
                        C12775o.m28638h(installReferrerClient, "referrerClient");
                        ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                        C12775o.m28638h(installReferrer, "referrerClient.installReferrer");
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null && (C13755w.m31552J(installReferrer2, "fb", false, 2, (Object) null) || C13755w.m31552J(installReferrer2, "facebook", false, 2, (Object) null))) {
                            this.f13496b.mo28376a(installReferrer2);
                        }
                        C9188s.f13494a.m18819e();
                    } catch (RemoteException unused) {
                    }
                } else if (i == 2) {
                    try {
                        C9188s.f13494a.m18819e();
                    } catch (Throwable th) {
                        C9925a.m20732b(th, this);
                    }
                }
            }
        }

        public void onInstallReferrerServiceDisconnected() {
        }
    }
}
