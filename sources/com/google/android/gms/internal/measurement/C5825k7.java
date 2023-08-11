package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5825k7 {
    /* renamed from: a */
    static int m9502a(byte[] bArr, int i, C5808j7 j7Var) {
        int j = m9511j(bArr, i, j7Var);
        int i2 = j7Var.f7023a;
        if (i2 < 0) {
            throw zzkh.m10403d();
        } else if (i2 > bArr.length - j) {
            throw zzkh.m10405f();
        } else if (i2 == 0) {
            j7Var.f7025c = C6018w7.f7451c;
            return j;
        } else {
            j7Var.f7025c = C6018w7.m10204z(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m9503b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m9504c(C5811ja jaVar, byte[] bArr, int i, int i2, int i3, C5808j7 j7Var) {
        C5675ba baVar = (C5675ba) jaVar;
        Object e = baVar.mo33709e();
        int D = baVar.mo33704D(e, bArr, i, i2, i3, j7Var);
        baVar.mo33708d(e);
        j7Var.f7025c = e;
        return D;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m9505d(com.google.android.gms.internal.measurement.C5811ja r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.C5808j7 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m9512k(r8, r7, r0, r10)
            int r8 = r10.f7023a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo33709e()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo33711g(r1, r2, r3, r4, r5)
            r6.mo33708d(r9)
            r10.f7025c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzkh r6 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5825k7.m9505d(com.google.android.gms.internal.measurement.ja, byte[], int, int, com.google.android.gms.internal.measurement.j7):int");
    }

    /* renamed from: e */
    static int m9506e(C5811ja<?> jaVar, int i, byte[] bArr, int i2, int i3, C5691c9<?> c9Var, C5808j7 j7Var) {
        int d = m9505d(jaVar, bArr, i2, i3, j7Var);
        c9Var.add(j7Var.f7025c);
        while (d < i3) {
            int j = m9511j(bArr, d, j7Var);
            if (i != j7Var.f7023a) {
                break;
            }
            d = m9505d(jaVar, bArr, j, i3, j7Var);
            c9Var.add(j7Var.f7025c);
        }
        return d;
    }

    /* renamed from: f */
    static int m9507f(byte[] bArr, int i, C5691c9<?> c9Var, C5808j7 j7Var) {
        C6019w8 w8Var = (C6019w8) c9Var;
        int j = m9511j(bArr, i, j7Var);
        int i2 = j7Var.f7023a + j;
        while (j < i2) {
            j = m9511j(bArr, j, j7Var);
            w8Var.mo34586E(j7Var.f7023a);
        }
        if (j == i2) {
            return j;
        }
        throw zzkh.m10405f();
    }

    /* renamed from: g */
    static int m9508g(byte[] bArr, int i, C5808j7 j7Var) {
        int j = m9511j(bArr, i, j7Var);
        int i2 = j7Var.f7023a;
        if (i2 < 0) {
            throw zzkh.m10403d();
        } else if (i2 == 0) {
            j7Var.f7025c = "";
            return j;
        } else {
            j7Var.f7025c = new String(bArr, j, i2, C5708d9.f6852b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m9509h(byte[] bArr, int i, C5808j7 j7Var) {
        int j = m9511j(bArr, i, j7Var);
        int i2 = j7Var.f7023a;
        if (i2 < 0) {
            throw zzkh.m10403d();
        } else if (i2 == 0) {
            j7Var.f7025c = "";
            return j;
        } else {
            j7Var.f7025c = C5862mb.m9643d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m9510i(int i, byte[] bArr, int i2, int i3, C6053ya yaVar, C5808j7 j7Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m9514m(bArr, i2, j7Var);
                yaVar.mo34645h(i, Long.valueOf(j7Var.f7024b));
                return m;
            } else if (i4 == 1) {
                yaVar.mo34645h(i, Long.valueOf(m9515n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m9511j(bArr, i2, j7Var);
                int i5 = j7Var.f7023a;
                if (i5 < 0) {
                    throw zzkh.m10403d();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        yaVar.mo34645h(i, C6018w7.f7451c);
                    } else {
                        yaVar.mo34645h(i, C6018w7.m10204z(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzkh.m10405f();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C6053ya e = C6053ya.m10313e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m9511j(bArr, i2, j7Var);
                    int i8 = j7Var.f7023a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m9510i(i8, bArr, j2, i3, e, j7Var);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzkh.m10404e();
                }
                yaVar.mo34645h(i, e);
                return i2;
            } else if (i4 == 5) {
                yaVar.mo34645h(i, Integer.valueOf(m9503b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzkh.m10401b();
            }
        } else {
            throw zzkh.m10401b();
        }
    }

    /* renamed from: j */
    static int m9511j(byte[] bArr, int i, C5808j7 j7Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m9512k(b, bArr, i2, j7Var);
        }
        j7Var.f7023a = b;
        return i2;
    }

    /* renamed from: k */
    static int m9512k(int i, byte[] bArr, int i2, C5808j7 j7Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            j7Var.f7023a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            j7Var.f7023a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            j7Var.f7023a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            j7Var.f7023a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                j7Var.f7023a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    static int m9513l(int i, byte[] bArr, int i2, int i3, C5691c9<?> c9Var, C5808j7 j7Var) {
        C6019w8 w8Var = (C6019w8) c9Var;
        int j = m9511j(bArr, i2, j7Var);
        w8Var.mo34586E(j7Var.f7023a);
        while (j < i3) {
            int j2 = m9511j(bArr, j, j7Var);
            if (i != j7Var.f7023a) {
                break;
            }
            j = m9511j(bArr, j2, j7Var);
            w8Var.mo34586E(j7Var.f7023a);
        }
        return j;
    }

    /* renamed from: m */
    static int m9514m(byte[] bArr, int i, C5808j7 j7Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            j7Var.f7024b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        j7Var.f7024b = j2;
        return i3;
    }

    /* renamed from: n */
    static long m9515n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
