package p077e8;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import com.google.common.p056io.BaseEncoding;
import com.google.firebase.C6922c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p268w8.C10150g;
import p318ce.C11054d;
import p364io.grpc.C12564o;
import p458xd.C13777b;
import p458xd.C13795h;

/* renamed from: e8.v */
/* compiled from: GrpcClientModule */
public class C7522v {

    /* renamed from: a */
    private final C6922c f10416a;

    public C7522v(C6922c cVar) {
        this.f10416a = cVar;
    }

    /* renamed from: a */
    public static String m14775a(@NonNull PackageManager packageManager, @NonNull String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (!(packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0)) {
                Signature signature = signatureArr[0];
                if (signature != null) {
                    return m14776d(signature);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: d */
    private static String m14776d(Signature signature) {
        try {
            return BaseEncoding.m11899a().mo39706n().mo39699f(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public C12564o mo41242b() {
        C12564o.C12568d<String> dVar = C12564o.f20135d;
        C12564o.C12571g<String> e = C12564o.C12571g.m27836e("X-Goog-Api-Key", dVar);
        C12564o.C12571g<String> e2 = C12564o.C12571g.m27836e("X-Android-Package", dVar);
        C12564o.C12571g<String> e3 = C12564o.C12571g.m27836e("X-Android-Cert", dVar);
        C12564o oVar = new C12564o();
        String packageName = this.f10416a.mo39766h().getPackageName();
        oVar.mo50244n(e, this.f10416a.mo39769k().mo39784b());
        oVar.mo50244n(e2, packageName);
        String a = m14775a(this.f10416a.mo39766h().getPackageManager(), packageName);
        if (a != null) {
            oVar.mo50244n(e3, a);
        }
        return oVar;
    }

    /* renamed from: c */
    public C10150g.C10152b mo41243c(C13777b bVar, C12564o oVar) {
        return C10150g.m21388b(C13795h.m31683b(bVar, C11054d.m23846a(oVar)));
    }
}
