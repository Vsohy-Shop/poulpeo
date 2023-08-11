package p295z2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.C12775o;

/* renamed from: z2.a */
/* compiled from: CertificateUtil.kt */
public final class C10794a {

    /* renamed from: a */
    public static final C10794a f16513a = new C10794a();

    private C10794a() {
    }

    /* renamed from: a */
    public static final String m22969a(Context context) {
        C12775o.m28639i(context, "ctx");
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            boolean z = false;
            for (Signature byteArray : signatureArr) {
                instance.update(byteArray.toByteArray());
                sb.append(Base64.encodeToString(instance.digest(), 0));
                sb.append(":");
            }
            if (sb.length() > 0) {
                z = true;
            }
            if (z) {
                sb.setLength(sb.length() - 1);
            }
            String sb2 = sb.toString();
            C12775o.m28638h(sb2, "sb.toString()");
            return sb2;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
