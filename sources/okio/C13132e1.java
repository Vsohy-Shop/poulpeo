package okio;

import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13121c;
import p371jg.C12637g;

@SourceDebugExtension({"SMAP\n-Util.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Util.kt\nokio/_UtilKt\n*L\n1#1,185:1\n66#1:186\n72#1:187\n*S KotlinDebug\n*F\n+ 1 -Util.kt\nokio/_UtilKt\n*L\n104#1:186\n105#1:187\n*E\n"})
/* renamed from: okio.e1 */
/* compiled from: -Util.kt */
public final class C13132e1 {

    /* renamed from: a */
    private static final C13121c.C13122a f20901a = new C13121c.C13122a();

    /* renamed from: b */
    private static final int f20902b = -1234567890;

    /* renamed from: a */
    public static final boolean m29638a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C12775o.m28639i(bArr, Constants.APPBOY_PUSH_CONTENT_KEY);
        C12775o.m28639i(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m29639b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: c */
    public static final int m29640c() {
        return f20902b;
    }

    /* renamed from: d */
    public static final C13121c.C13122a m29641d() {
        return f20901a;
    }

    /* renamed from: e */
    public static final int m29642e(C13133f fVar, int i) {
        C12775o.m28639i(fVar, "<this>");
        if (i == f20902b) {
            return fVar.mo52590H();
        }
        return i;
    }

    /* renamed from: f */
    public static final int m29643f(byte[] bArr, int i) {
        C12775o.m28639i(bArr, "<this>");
        if (i == f20902b) {
            return bArr.length;
        }
        return i;
    }

    /* renamed from: g */
    public static final C13121c.C13122a m29644g(C13121c.C13122a aVar) {
        C12775o.m28639i(aVar, "unsafeCursor");
        if (aVar == f20901a) {
            return new C13121c.C13122a();
        }
        return aVar;
    }

    /* renamed from: h */
    public static final int m29645h(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: i */
    public static final long m29646i(long j) {
        return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    /* renamed from: j */
    public static final short m29647j(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: k */
    public static final String m29648k(byte b) {
        return C13754v.m31526n(new char[]{C12637g.m28075f()[(b >> 4) & 15], C12637g.m28075f()[b & 15]});
    }

    /* renamed from: l */
    public static final String m29649l(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {C12637g.m28075f()[(i >> 28) & 15], C12637g.m28075f()[(i >> 24) & 15], C12637g.m28075f()[(i >> 20) & 15], C12637g.m28075f()[(i >> 16) & 15], C12637g.m28075f()[(i >> 12) & 15], C12637g.m28075f()[(i >> 8) & 15], C12637g.m28075f()[(i >> 4) & 15], C12637g.m28075f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return C13754v.m31527o(cArr, i2, 8);
    }
}
