package p295z2;

import android.util.Base64;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.C12775o;
import org.json.JSONObject;
import p392mf.C12957k;
import p454wf.C13726d;

/* renamed from: z2.b */
/* compiled from: OidcSecurityUtil.kt */
public final class C10795b {

    /* renamed from: a */
    private static final String f16514a = "https://www.facebook.com/.well-known/oauth/openid/keys/";

    /* renamed from: b */
    public static final C10795b f16515b = new C10795b();

    private C10795b() {
    }

    /* renamed from: a */
    public static final PublicKey m22970a(String str) {
        C12775o.m28639i(str, "key");
        byte[] decode = Base64.decode(C13754v.m31521A(C13754v.m31521A(C13754v.m31521A(str, "\n", "", false, 4, (Object) null), "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null), "-----END PUBLIC KEY-----", "", false, 4, (Object) null), 0);
        C12775o.m28638h(decode, "Base64.decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        C12775o.m28638h(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static final String m22971b(String str) {
        BufferedReader bufferedReader;
        C12775o.m28639i(str, "kid");
        URLConnection openConnection = new URL(f16514a).openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                C12775o.m28638h(inputStream, "connection.inputStream");
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C13726d.f22152b);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                }
                String optString = new JSONObject(C12957k.m29276c(bufferedReader)).optString(str);
                httpURLConnection.disconnect();
                return optString;
            } catch (Exception unused) {
                httpURLConnection.disconnect();
                return null;
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
    }

    /* renamed from: c */
    public static final boolean m22972c(PublicKey publicKey, String str, String str2) {
        C12775o.m28639i(publicKey, "publicKey");
        C12775o.m28639i(str, "data");
        C12775o.m28639i(str2, "signature");
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(publicKey);
            byte[] bytes = str.getBytes(C13726d.f22152b);
            C12775o.m28638h(bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            C12775o.m28638h(decode, "Base64.decode(signature, Base64.URL_SAFE)");
            return instance.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
