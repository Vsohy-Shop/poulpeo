package p180o4;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p036b5.C2888a;
import p036b5.C2890b;
import p231t4.C9713p;
import p231t4.C9733v1;
import p231t4.C9737w1;

/* renamed from: o4.n */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
abstract class C8985n extends C9733v1 {

    /* renamed from: a */
    private final int f13072a;

    protected C8985n(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        this.f13072a = Arrays.hashCode(bArr);
    }

    /* renamed from: J */
    protected static byte[] m18231J(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b3 */
    public abstract byte[] mo43158b3();

    /* renamed from: c */
    public final C2888a mo43159c() {
        return C2890b.m2297b3(mo43158b3());
    }

    public final boolean equals(@Nullable Object obj) {
        C2888a c;
        if (obj != null && (obj instanceof C9737w1)) {
            try {
                C9737w1 w1Var = (C9737w1) obj;
                if (w1Var.mo43162x() != this.f13072a || (c = w1Var.mo43159c()) == null) {
                    return false;
                }
                return Arrays.equals(mo43158b3(), (byte[]) C2890b.m2296J(c));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13072a;
    }

    /* renamed from: x */
    public final int mo43162x() {
        return this.f13072a;
    }
}
