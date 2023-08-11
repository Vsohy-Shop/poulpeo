package p110h5;

import android.util.Base64;
import java.util.Random;

/* renamed from: h5.b */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C7979b {

    /* renamed from: a */
    private static final Random f11217a = new Random();

    /* renamed from: a */
    public static String m15681a() {
        byte[] bArr = new byte[16];
        f11217a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
