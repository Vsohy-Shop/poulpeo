package p144k8;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.google.firebase.C6922c;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: k8.b */
/* compiled from: IidStore */
public class C8588b {

    /* renamed from: c */
    private static final String[] f12269c = {ProxyConfig.MATCH_ALL_SCHEMES, FirebaseMessaging.INSTANCE_ID_SCOPE, "GCM", ""};
    @GuardedBy("iidPrefs")

    /* renamed from: a */
    private final SharedPreferences f12270a;

    /* renamed from: b */
    private final String f12271b;

    public C8588b(@NonNull C6922c cVar) {
        this.f12270a = cVar.mo39766h().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f12271b = m17246b(cVar);
    }

    /* renamed from: a */
    private String m17245a(@NonNull String str, @NonNull String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m17246b(C6922c cVar) {
        String d = cVar.mo39769k().mo39786d();
        if (d != null) {
            return d;
        }
        String c = cVar.mo39769k().mo39785c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @Nullable
    /* renamed from: c */
    private static String m17247c(@NonNull PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m17248d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    private PublicKey m17249e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    @Nullable
    /* renamed from: g */
    private String m17250g() {
        String string;
        synchronized (this.f12270a) {
            string = this.f12270a.getString("|S|id", (String) null);
        }
        return string;
    }

    @Nullable
    /* renamed from: h */
    private String m17251h() {
        synchronized (this.f12270a) {
            String string = this.f12270a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = m17249e(string);
            if (e == null) {
                return null;
            }
            String c = m17247c(e);
            return c;
        }
    }

    @Nullable
    /* renamed from: f */
    public String mo42665f() {
        synchronized (this.f12270a) {
            String g = m17250g();
            if (g != null) {
                return g;
            }
            String h = m17251h();
            return h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    @androidx.annotation.Nullable
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo42666i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f12270a
            monitor-enter(r0)
            java.lang.String[] r1 = f12269c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f12271b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.m17245a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f12270a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.m17248d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p144k8.C8588b.mo42666i():java.lang.String");
    }
}
