package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import p274x3.C10389a;

class InstallReferrerClientImpl extends InstallReferrerClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f3271a = 0;

    /* renamed from: b */
    private final Context f3272b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10389a f3273c;

    /* renamed from: d */
    private ServiceConnection f3274d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* renamed from: com.android.installreferrer.api.InstallReferrerClientImpl$b */
    private final class C4148b implements ServiceConnection {

        /* renamed from: b */
        private final InstallReferrerStateListener f3275b;

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            C10389a unused = InstallReferrerClientImpl.this.f3273c = C10389a.C10390a.m21772E(iBinder);
            int unused2 = InstallReferrerClientImpl.this.f3271a = 2;
            this.f3275b.onInstallReferrerSetupFinished(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            C10389a unused = InstallReferrerClientImpl.this.f3273c = null;
            int unused2 = InstallReferrerClientImpl.this.f3271a = 0;
            this.f3275b.onInstallReferrerServiceDisconnected();
        }

        private C4148b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f3275b = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f3272b = context.getApplicationContext();
    }

    /* renamed from: c */
    private boolean m4804c() {
        try {
            if (this.f3272b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public void endConnection() {
        this.f3271a = 3;
        if (this.f3274d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f3272b.unbindService(this.f3274d);
            this.f3274d = null;
        }
        this.f3273c = null;
    }

    public ReferrerDetails getInstallReferrer() {
        if (isReady()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f3272b.getPackageName());
            try {
                return new ReferrerDetails(this.f3273c.mo45086o(bundle));
            } catch (RemoteException e) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f3271a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public boolean isReady() {
        if (this.f3271a != 2 || this.f3273c == null || this.f3274d == null) {
            return false;
        }
        return true;
    }

    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.f3271a;
        if (i == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else if (i == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f3272b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.f3271a = 0;
                InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
                installReferrerStateListener.onInstallReferrerSetupFinished(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !m4804c()) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f3271a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(2);
                return;
            }
            Intent intent2 = new Intent(intent);
            C4148b bVar = new C4148b(installReferrerStateListener);
            this.f3274d = bVar;
            try {
                if (this.f3272b.bindService(intent2, bVar, 1)) {
                    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                this.f3271a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(1);
            } catch (SecurityException unused) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "No permission to connect to service.");
                this.f3271a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(4);
            }
        }
    }
}
