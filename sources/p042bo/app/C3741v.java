package p042bo.app;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.v */
public final class C3741v {

    /* renamed from: a */
    public static final C3741v f2698a = new C3741v();

    /* renamed from: bo.app.v$a */
    static final class C3742a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2699b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3742a(String str) {
            super(0);
            this.f2699b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unexpected system broadcast received [" + this.f2699b + ']';
        }
    }

    /* renamed from: bo.app.v$b */
    static final class C3743b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3743b f2700b = new C3743b();

        C3743b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
        }
    }

    private C3741v() {
    }

    /* renamed from: a */
    public static final C3700t3 m4007a(Intent intent, ConnectivityManager connectivityManager) {
        C12775o.m28639i(intent, "intent");
        C12775o.m28639i(connectivityManager, "connectivityManager");
        String action = intent.getAction();
        if (C12775o.m28634d("android.net.conn.CONNECTIVITY_CHANGE", action)) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (activeNetworkInfo == null || booleanExtra) {
                    return C3700t3.NONE;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    int subtype = activeNetworkInfo.getSubtype();
                    if (subtype == 3) {
                        return C3700t3.GOOD;
                    }
                    if (subtype == 13 || subtype == 20) {
                        return C3700t3.GREAT;
                    }
                    return C3700t3.BAD;
                } else if (type == 1 || type == 6) {
                    return C3700t3.GREAT;
                } else {
                    if (type != 9) {
                        return C3700t3.NONE;
                    }
                    return C3700t3.GOOD;
                }
            } catch (SecurityException e) {
                C8266c.m16396e(C8266c.f11641a, f2698a, C8266c.C8267a.f11649e, e, false, C3743b.f2700b, 4, (Object) null);
                return C3700t3.NONE;
            }
        } else {
            C8266c.m16396e(C8266c.f11641a, f2698a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3742a(action), 6, (Object) null);
            return C3700t3.NONE;
        }
    }

    /* renamed from: a */
    public static final C3700t3 m4008a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return C3700t3.NONE;
        }
        int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (min > 14000) {
            return C3700t3.GREAT;
        }
        if (min > 4000) {
            return C3700t3.GOOD;
        }
        return C3700t3.BAD;
    }
}
