package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.firebase.C6922c;
import com.google.firebase.installations.C6949f;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p113h8.C8030b;
import p124i8.C8213d;
import p170n4.C8906c;
import p203q7.C9322f;
import p214r8.C9403i;
import p276x5.C10410i;

/* renamed from: com.google.firebase.messaging.f0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C6973f0 {

    /* renamed from: a */
    private final C6922c f9281a;

    /* renamed from: b */
    private final C6991k0 f9282b;

    /* renamed from: c */
    private final C8906c f9283c;

    /* renamed from: d */
    private final C8030b<C9403i> f9284d;

    /* renamed from: e */
    private final C8030b<C9322f> f9285e;

    /* renamed from: f */
    private final C8213d f9286f;

    @VisibleForTesting
    C6973f0(C6922c cVar, C6991k0 k0Var, C8906c cVar2, C8030b<C9403i> bVar, C8030b<C9322f> bVar2, C8213d dVar) {
        this.f9281a = cVar;
        this.f9282b = k0Var;
        this.f9283c = cVar2;
        this.f9284d = bVar;
        this.f9285e = bVar2;
        this.f9286f = dVar;
    }

    /* renamed from: a */
    private static String m12265a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: c */
    private Task<String> m12266c(Task<Bundle> task) {
        return task.mo35457h(C6970e0.f9270b, new C6967d0(this));
    }

    /* renamed from: d */
    private String m12267d() {
        try {
            return m12265a(MessageDigest.getInstance(Constants.SHA1).digest(this.f9281a.mo39768j().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    @AnyThread
    /* renamed from: f */
    private String m12268f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String obj = bundle.toString();
                Log.w("FirebaseMessaging", "Unexpected response: ".concat(obj), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: g */
    static boolean m12269g(String str) {
        if ("SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m12270i(String str, String str2, Bundle bundle) {
        C9322f.C9323a a;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f9281a.mo39769k().mo39785c());
        bundle.putString("gmsv", Integer.toString(this.f9282b.mo39939d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f9282b.mo39937a());
        bundle.putString("app_ver_name", this.f9282b.mo39938b());
        bundle.putString("firebase-app-name-hash", m12267d());
        try {
            String b = ((C6949f) C10410i.m21827a(this.f9286f.mo39832a(false))).mo39821b();
            if (!TextUtils.isEmpty(b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) C10410i.m21827a(this.f9286f.getId()));
        bundle.putString("cliv", "fcm-23.0.0");
        C9322f fVar = this.f9285e.get();
        C9403i iVar = this.f9284d.get();
        if (fVar != null && iVar != null && (a = fVar.mo43611a("fire-iid")) != C9322f.C9323a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a.mo43612a()));
            bundle.putString("Firebase-Client", iVar.mo43820a());
        }
    }

    /* renamed from: j */
    private Task<Bundle> m12271j(String str, String str2, Bundle bundle) {
        try {
            m12270i(str, str2, bundle);
            return this.f9283c.mo43045a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return C10410i.m21830d(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Task<?> mo39913b() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m12266c(m12271j(C6991k0.m12344c(this.f9281a), ProxyConfig.MATCH_ALL_SCHEMES, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Task<String> mo39914e() {
        return m12266c(m12271j(C6991k0.m12344c(this.f9281a), ProxyConfig.MATCH_ALL_SCHEMES, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public /* synthetic */ String mo39915h(Task task) {
        return m12268f((Bundle) task.mo35462m(IOException.class));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Task<?> mo39916k(String str, String str2) {
        String str3;
        String str4;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str3 = "/topics/".concat(valueOf);
        } else {
            str3 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str3);
        String valueOf2 = String.valueOf(str2);
        if (valueOf2.length() != 0) {
            str4 = "/topics/".concat(valueOf2);
        } else {
            str4 = new String("/topics/");
        }
        return m12266c(m12271j(str, str4, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Task<?> mo39917l(String str, String str2) {
        String str3;
        String str4;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str3 = "/topics/".concat(valueOf);
        } else {
            str3 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str3);
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str2);
        if (valueOf2.length() != 0) {
            str4 = "/topics/".concat(valueOf2);
        } else {
            str4 = new String("/topics/");
        }
        return m12266c(m12271j(str, str4, bundle));
    }

    C6973f0(C6922c cVar, C6991k0 k0Var, C8030b<C9403i> bVar, C8030b<C9322f> bVar2, C8213d dVar) {
        this(cVar, k0Var, new C8906c(cVar.mo39766h()), bVar, bVar2, dVar);
    }
}
