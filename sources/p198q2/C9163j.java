package p198q2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import kotlin.jvm.internal.C12775o;

/* renamed from: q2.j */
/* compiled from: FacebookSignatureValidator.kt */
public final class C9163j {

    /* renamed from: a */
    private static final HashSet<String> f13397a = C12731y0.m28552f("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    /* renamed from: b */
    public static final C9163j f13398b = new C9163j();

    private C9163j() {
    }

    /* renamed from: a */
    public static final boolean m18750a(Context context, String str) {
        boolean z;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "packageName");
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        C12775o.m28638h(str2, "brand");
        if (C13754v.m31525E(str2, "generic", false, 2, (Object) null) && (i & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            C12775o.m28638h(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            C12775o.m28638h(signatureArr2, "packageInfo.signatures");
            for (Signature byteArray : signatureArr2) {
                HashSet<String> hashSet = f13397a;
                byte[] byteArray2 = byteArray.toByteArray();
                C12775o.m28638h(byteArray2, "it.toByteArray()");
                if (!C12686e0.m28214S(hashSet, C9138d0.m18666u0(byteArray2))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
