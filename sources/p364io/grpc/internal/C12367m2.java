package p364io.grpc.internal;

import com.google.common.p056io.BaseEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import p111h6.C7994c;
import p364io.grpc.C12173h;
import p364io.grpc.C12564o;

/* renamed from: io.grpc.internal.m2 */
/* compiled from: TransportFrameUtil */
public final class C12367m2 {

    /* renamed from: a */
    private static final Logger f19643a = Logger.getLogger(C12367m2.class.getName());

    /* renamed from: b */
    private static final byte[] f19644b = "-bin".getBytes(C7994c.f11227a);

    private C12367m2() {
    }

    /* renamed from: a */
    private static boolean m27190a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m27191b(byte[] bArr) {
        for (byte b : bArr) {
            if (b < 32 || b > 126) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static byte[][] m27192c(byte[][] bArr, int i) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(bArr[i2]);
        }
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            if (!m27190a(bArr2, f19644b)) {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 <= bArr3.length; i4++) {
                    if (i4 == bArr3.length || bArr3[i4] == 44) {
                        byte[] c = BaseEncoding.m11900b().mo39696c(new String(bArr3, i3, i4 - i3, C7994c.f11227a));
                        arrayList.add(bArr2);
                        arrayList.add(c);
                        i3 = i4 + 1;
                    }
                }
            }
            i += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    /* renamed from: d */
    public static byte[][] m27193d(C12564o oVar) {
        byte[][] d = C12173h.m26567d(oVar);
        if (d == null) {
            return new byte[0][];
        }
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2 += 2) {
            byte[] bArr = d[i2];
            byte[] bArr2 = d[i2 + 1];
            if (m27190a(bArr, f19644b)) {
                d[i] = bArr;
                d[i + 1] = C12173h.f19087b.mo39699f(bArr2).getBytes(C7994c.f11227a);
            } else if (m27191b(bArr2)) {
                d[i] = bArr;
                d[i + 1] = bArr2;
            } else {
                String str = new String(bArr, C7994c.f11227a);
                f19643a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i += 2;
        }
        if (i == d.length) {
            return d;
        }
        return (byte[][]) Arrays.copyOfRange(d, 0, i);
    }

    /* renamed from: e */
    public static byte[][] m27194e(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (m27190a(bArr2, f19644b)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        return m27192c(bArr, i);
                    }
                }
                bArr[i2] = BaseEncoding.m11900b().mo39696c(new String(bArr3, C7994c.f11227a));
            }
        }
        return bArr;
    }
}
