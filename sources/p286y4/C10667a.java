package p286y4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p023a5.C2207e;

/* renamed from: y4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10667a {
    @Deprecated
    @Nullable
    /* renamed from: a */
    public static byte[] m22664a(@NonNull Context context, @NonNull String str) {
        MessageDigest b;
        PackageInfo e = C2207e.m1805a(context).mo23530e(str, 64);
        Signature[] signatureArr = e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m22665b("SHA1")) == null) {
            return null;
        }
        return b.digest(e.signatures[0].toByteArray());
    }

    @Nullable
    /* renamed from: b */
    public static MessageDigest m22665b(@NonNull String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
