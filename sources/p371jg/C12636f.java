package p371jg;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13121c;
import okio.C13129d1;
import okio.C13132e1;
import okio.C13151m0;
import okio.C13168t0;

@SourceDebugExtension({"SMAP\n-Buffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Buffer.kt\nokio/internal/_BufferKt\n+ 2 -Util.kt\nokio/_UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1697:1\n110#1,20:1720\n110#1,20:1753\n110#1:1773\n112#1,18:1775\n110#1,20:1793\n72#2:1698\n72#2:1699\n72#2:1700\n72#2:1701\n72#2:1702\n72#2:1703\n72#2:1704\n72#2:1705\n72#2:1706\n72#2:1707\n72#2:1708\n72#2:1709\n81#2:1710\n81#2:1711\n75#2:1712\n75#2:1713\n75#2:1714\n75#2:1715\n75#2:1716\n75#2:1717\n75#2:1718\n75#2:1719\n84#2:1740\n87#2:1742\n72#2:1743\n72#2:1744\n72#2:1745\n72#2:1746\n72#2:1747\n72#2:1748\n72#2:1749\n72#2:1750\n72#2:1751\n72#2:1752\n87#2:1774\n84#2:1813\n1#3:1741\n*S KotlinDebug\n*F\n+ 1 -Buffer.kt\nokio/internal/_BufferKt\n*L\n413#1:1720,20\n1259#1:1753,20\n1290#1:1773\n1290#1:1775,18\n1324#1:1793,20\n176#1:1698\n200#1:1699\n319#1:1700\n324#1:1701\n347#1:1702\n348#1:1703\n349#1:1704\n350#1:1705\n356#1:1706\n357#1:1707\n358#1:1708\n359#1:1709\n383#1:1710\n384#1:1711\n390#1:1712\n391#1:1713\n392#1:1714\n393#1:1715\n394#1:1716\n395#1:1717\n396#1:1718\n397#1:1719\n425#1:1740\n855#1:1742\n873#1:1743\n875#1:1744\n879#1:1745\n881#1:1746\n885#1:1747\n887#1:1748\n891#1:1749\n893#1:1750\n913#1:1751\n916#1:1752\n1303#1:1774\n1643#1:1813\n*E\n"})
/* renamed from: jg.f */
/* compiled from: -Buffer.kt */
public final class C12636f {

    /* renamed from: a */
    private static final byte[] f20304a = C13129d1.m29611a("0123456789abcdef");

    /* renamed from: a */
    public static final C13121c.C13122a m28064a(C13121c cVar, C13121c.C13122a aVar) {
        boolean z;
        C12775o.m28639i(cVar, "<this>");
        C12775o.m28639i(aVar, "unsafeCursor");
        C13121c.C13122a g = C13132e1.m29644g(aVar);
        if (g.f20890b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g.f20890b = cVar;
            g.f20891c = true;
            return g;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    /* renamed from: b */
    public static final byte[] m28065b() {
        return f20304a;
    }

    /* renamed from: c */
    public static final boolean m28066c(C13168t0 t0Var, int i, byte[] bArr, int i2, int i3) {
        C12775o.m28639i(t0Var, "segment");
        C12775o.m28639i(bArr, "bytes");
        int i4 = t0Var.f20969c;
        byte[] bArr2 = t0Var.f20967a;
        while (i2 < i3) {
            if (i == i4) {
                t0Var = t0Var.f20972f;
                C12775o.m28636f(t0Var);
                byte[] bArr3 = t0Var.f20967a;
                int i5 = t0Var.f20968b;
                bArr2 = bArr3;
                i = i5;
                i4 = t0Var.f20969c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: d */
    public static final String m28067d(C13121c cVar, long j) {
        C12775o.m28639i(cVar, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (cVar.mo52530j0(j2) == 13) {
                String l = cVar.mo52532l(j2);
                cVar.skip(2);
                return l;
            }
        }
        String l2 = cVar.mo52532l(j);
        cVar.skip(1);
        return l2;
    }

    /* renamed from: e */
    public static final int m28068e(C13121c cVar, C13151m0 m0Var, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        C13168t0 t0Var;
        int i4;
        C13121c cVar2 = cVar;
        C12775o.m28639i(cVar2, "<this>");
        C12775o.m28639i(m0Var, "options");
        C13168t0 t0Var2 = cVar2.f20888b;
        if (t0Var2 != null) {
            byte[] bArr = t0Var2.f20967a;
            int i5 = t0Var2.f20968b;
            int i6 = t0Var2.f20969c;
            int[] q = m0Var.mo52663q();
            C13168t0 t0Var3 = t0Var2;
            int i7 = -1;
            int i8 = 0;
            loop0:
            while (true) {
                int i9 = i8 + 1;
                int i10 = q[i8];
                int i11 = i9 + 1;
                int i12 = q[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (t0Var3 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = i11 + (i10 * -1);
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr[i5] & 255) != q[i11]) {
                            return i7;
                        }
                        if (i15 == i13) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i14 == i6) {
                            C12775o.m28636f(t0Var3);
                            C13168t0 t0Var4 = t0Var3.f20972f;
                            C12775o.m28636f(t0Var4);
                            i4 = t0Var4.f20968b;
                            byte[] bArr2 = t0Var4.f20967a;
                            i3 = t0Var4.f20969c;
                            if (t0Var4 == t0Var2) {
                                if (!z2) {
                                    break loop0;
                                }
                                bArr = bArr2;
                                t0Var = null;
                            } else {
                                byte[] bArr3 = bArr2;
                                t0Var = t0Var4;
                                bArr = bArr3;
                            }
                        } else {
                            C13168t0 t0Var5 = t0Var3;
                            i3 = i6;
                            i4 = i14;
                            t0Var = t0Var5;
                        }
                        if (z2) {
                            i2 = q[i15];
                            i = i4;
                            i6 = i3;
                            t0Var3 = t0Var;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i11 = i15;
                        t0Var3 = t0Var;
                    }
                } else {
                    i = i5 + 1;
                    byte b = bArr[i5] & 255;
                    int i16 = i11 + i10;
                    while (i11 != i16) {
                        if (b == q[i11]) {
                            i2 = q[i11 + i10];
                            if (i == i6) {
                                t0Var3 = t0Var3.f20972f;
                                C12775o.m28636f(t0Var3);
                                i = t0Var3.f20968b;
                                bArr = t0Var3.f20967a;
                                i6 = t0Var3.f20969c;
                                if (t0Var3 == t0Var2) {
                                    t0Var3 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ int m28069f(C13121c cVar, C13151m0 m0Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m28068e(cVar, m0Var, z);
    }
}
