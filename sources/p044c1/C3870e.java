package p044c1;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p044c1.C3865a;

/* renamed from: c1.e */
/* compiled from: StandardGifDecoder */
public class C3870e implements C3865a {

    /* renamed from: u */
    private static final String f2923u = "e";
    @ColorInt

    /* renamed from: a */
    private int[] f2924a;
    @ColorInt

    /* renamed from: b */
    private final int[] f2925b;

    /* renamed from: c */
    private final C3865a.C3866a f2926c;

    /* renamed from: d */
    private ByteBuffer f2927d;

    /* renamed from: e */
    private byte[] f2928e;

    /* renamed from: f */
    private short[] f2929f;

    /* renamed from: g */
    private byte[] f2930g;

    /* renamed from: h */
    private byte[] f2931h;

    /* renamed from: i */
    private byte[] f2932i;
    @ColorInt

    /* renamed from: j */
    private int[] f2933j;

    /* renamed from: k */
    private int f2934k;

    /* renamed from: l */
    private C3868c f2935l;

    /* renamed from: m */
    private Bitmap f2936m;

    /* renamed from: n */
    private boolean f2937n;

    /* renamed from: o */
    private int f2938o;

    /* renamed from: p */
    private int f2939p;

    /* renamed from: q */
    private int f2940q;

    /* renamed from: r */
    private int f2941r;
    @Nullable

    /* renamed from: s */
    private Boolean f2942s;
    @NonNull

    /* renamed from: t */
    private Bitmap.Config f2943t;

    public C3870e(@NonNull C3865a.C3866a aVar, C3868c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo29913q(cVar, byteBuffer, i);
    }

    @ColorInt
    /* renamed from: i */
    private int m4312i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f2939p + i; i9++) {
            byte[] bArr = this.f2932i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f2924a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f2939p + i11; i12++) {
            byte[] bArr2 = this.f2932i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f2924a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: j */
    private void m4313j(C3867b bVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        C3867b bVar2 = bVar;
        int[] iArr = this.f2933j;
        int i6 = bVar2.f2898d;
        int i7 = this.f2939p;
        int i8 = i6 / i7;
        int i9 = bVar2.f2896b / i7;
        int i10 = bVar2.f2897c / i7;
        int i11 = bVar2.f2895a / i7;
        if (this.f2934k == 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = this.f2941r;
        int i13 = this.f2940q;
        byte[] bArr = this.f2932i;
        int[] iArr2 = this.f2924a;
        Boolean bool = this.f2942s;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (bVar2.f2899e) {
                if (i15 >= i8) {
                    int i18 = i17 + 1;
                    i = i8;
                    if (i18 == 2) {
                        i15 = 4;
                    } else if (i18 == 3) {
                        i14 = 4;
                        i17 = i18;
                        i15 = 2;
                    } else if (i18 == 4) {
                        i17 = i18;
                        i15 = 1;
                        i14 = 2;
                    }
                    i17 = i18;
                } else {
                    i = i8;
                }
                i2 = i15 + i14;
            } else {
                i = i8;
                i2 = i15;
                i15 = i16;
            }
            int i19 = i15 + i9;
            if (i7 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i16 * i7 * bVar2.f2897c;
                if (z3) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i22) {
                            break;
                        }
                        int i30 = m4312i(i24, i28, bVar2.f2897c);
                        if (i30 != 0) {
                            iArr[i29] = i30;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i29++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i16++;
                    i9 = i5;
                    i8 = i;
                    i10 = i4;
                    i15 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i8 = i;
            i10 = i4;
            i15 = i3;
        }
        Boolean bool3 = bool;
        if (this.f2942s == null) {
            if (bool3 == null) {
                z2 = false;
            } else {
                z2 = bool3.booleanValue();
            }
            this.f2942s = Boolean.valueOf(z2);
        }
    }

    /* renamed from: k */
    private void m4314k(C3867b bVar) {
        boolean z;
        boolean z2;
        C3867b bVar2 = bVar;
        int[] iArr = this.f2933j;
        int i = bVar2.f2898d;
        int i2 = bVar2.f2896b;
        int i3 = bVar2.f2897c;
        int i4 = bVar2.f2895a;
        if (this.f2934k == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = this.f2941r;
        byte[] bArr = this.f2932i;
        int[] iArr2 = this.f2924a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f2897c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C3867b bVar3 = bVar;
                i = i13;
            }
            int i15 = i;
            i6++;
            bVar2 = bVar;
        }
        Boolean bool = this.f2942s;
        if ((bool == null || !bool.booleanValue()) && (this.f2942s != null || !z || b == -1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f2942s = Boolean.valueOf(z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4315l(p044c1.C3867b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f2927d
            int r3 = r1.f2904j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            c1.c r1 = r0.f2935l
            int r2 = r1.f2911f
            int r1 = r1.f2912g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f2897c
            int r1 = r1.f2898d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f2932i
            if (r1 == 0) goto L_0x0022
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002a
        L_0x0022:
            c1.a$a r1 = r0.f2926c
            byte[] r1 = r1.mo29903e(r2)
            r0.f2932i = r1
        L_0x002a:
            byte[] r1 = r0.f2932i
            short[] r3 = r0.f2929f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0036
            short[] r3 = new short[r4]
            r0.f2929f = r3
        L_0x0036:
            short[] r3 = r0.f2929f
            byte[] r5 = r0.f2930g
            if (r5 != 0) goto L_0x0040
            byte[] r5 = new byte[r4]
            r0.f2930g = r5
        L_0x0040:
            byte[] r5 = r0.f2930g
            byte[] r6 = r0.f2931h
            if (r6 != 0) goto L_0x004c
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f2931h = r6
        L_0x004c:
            byte[] r6 = r0.f2931h
            int r7 = r28.m4318p()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = r13
        L_0x005f:
            if (r14 >= r9) goto L_0x0069
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x005f
        L_0x0069:
            byte[] r14 = r0.f2928e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r25 = r20
            r26 = r25
            r24 = r15
        L_0x0082:
            if (r13 >= r2) goto L_0x014b
            if (r16 != 0) goto L_0x0093
            int r16 = r28.m4317o()
            if (r16 > 0) goto L_0x0091
            r3 = 3
            r0.f2938o = r3
            goto L_0x014b
        L_0x0091:
            r17 = 0
        L_0x0093:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ad:
            if (r4 < r15) goto L_0x0135
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c1
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ad
        L_0x00c1:
            if (r11 != r10) goto L_0x00d8
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0082
        L_0x00d8:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ec
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ad
        L_0x00ec:
            if (r11 < r8) goto L_0x00f5
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f6
        L_0x00f5:
            r7 = r11
        L_0x00f6:
            if (r7 < r9) goto L_0x0101
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f6
        L_0x0101:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0108:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0115
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0108
        L_0x0115:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012c
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012c
            if (r8 >= r6) goto L_0x012c
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012c:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ad
        L_0x0135:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0082
        L_0x014b:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p044c1.C3870e.m4315l(c1.b):void");
    }

    /* renamed from: n */
    private Bitmap m4316n() {
        Bitmap.Config config;
        Boolean bool = this.f2942s;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f2943t;
        }
        Bitmap a = this.f2926c.mo29899a(this.f2941r, this.f2940q, config);
        a.setHasAlpha(true);
        return a;
    }

    /* renamed from: o */
    private int m4317o() {
        int p = m4318p();
        if (p <= 0) {
            return p;
        }
        ByteBuffer byteBuffer = this.f2927d;
        byteBuffer.get(this.f2928e, 0, Math.min(p, byteBuffer.remaining()));
        return p;
    }

    /* renamed from: p */
    private int m4318p() {
        return this.f2927d.get() & 255;
    }

    /* renamed from: r */
    private Bitmap m4319r(C3867b bVar, C3867b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f2933j;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f2936m;
            if (bitmap2 != null) {
                this.f2926c.mo29901c(bitmap2);
            }
            this.f2936m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f2901g == 3 && this.f2936m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.f2901g) > 0) {
            if (i2 == 2) {
                if (!bVar.f2900f) {
                    C3868c cVar = this.f2935l;
                    int i4 = cVar.f2917l;
                    if (bVar.f2905k == null || cVar.f2915j != bVar.f2902h) {
                        i3 = i4;
                    }
                }
                int i5 = bVar2.f2898d;
                int i6 = this.f2939p;
                int i7 = i5 / i6;
                int i8 = bVar2.f2896b / i6;
                int i9 = bVar2.f2897c / i6;
                int i10 = bVar2.f2895a / i6;
                int i11 = this.f2941r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f2941r;
                }
            } else if (i2 == 3 && (bitmap = this.f2936m) != null) {
                int i16 = this.f2941r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f2940q);
            }
        }
        m4315l(bVar);
        if (bVar.f2899e || this.f2939p != 1) {
            m4313j(bVar);
        } else {
            m4314k(bVar);
        }
        if (this.f2937n && ((i = bVar.f2901g) == 0 || i == 1)) {
            if (this.f2936m == null) {
                this.f2936m = m4316n();
            }
            Bitmap bitmap3 = this.f2936m;
            int i17 = this.f2941r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f2940q);
        }
        Bitmap n = m4316n();
        int i18 = this.f2941r;
        n.setPixels(iArr, 0, i18, 0, 0, i18, this.f2940q);
        return n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo29889a() {
        /*
            r8 = this;
            monitor-enter(r8)
            c1.c r0 = r8.f2935l     // Catch:{ all -> 0x00e4 }
            int r0 = r0.f2908c     // Catch:{ all -> 0x00e4 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f2934k     // Catch:{ all -> 0x00e4 }
            if (r0 >= 0) goto L_0x0039
        L_0x000d:
            java.lang.String r0 = f2923u     // Catch:{ all -> 0x00e4 }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x0037
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r3.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            c1.c r4 = r8.f2935l     // Catch:{ all -> 0x00e4 }
            int r4 = r4.f2908c     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f2934k     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00e4 }
        L_0x0037:
            r8.f2938o = r2     // Catch:{ all -> 0x00e4 }
        L_0x0039:
            int r0 = r8.f2938o     // Catch:{ all -> 0x00e4 }
            r3 = 0
            if (r0 == r2) goto L_0x00c4
            r4 = 2
            if (r0 != r4) goto L_0x0043
            goto L_0x00c4
        L_0x0043:
            r0 = 0
            r8.f2938o = r0     // Catch:{ all -> 0x00e4 }
            byte[] r5 = r8.f2928e     // Catch:{ all -> 0x00e4 }
            if (r5 != 0) goto L_0x0054
            c1.a$a r5 = r8.f2926c     // Catch:{ all -> 0x00e4 }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.mo29903e(r6)     // Catch:{ all -> 0x00e4 }
            r8.f2928e = r5     // Catch:{ all -> 0x00e4 }
        L_0x0054:
            c1.c r5 = r8.f2935l     // Catch:{ all -> 0x00e4 }
            java.util.List<c1.b> r5 = r5.f2910e     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f2934k     // Catch:{ all -> 0x00e4 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00e4 }
            c1.b r5 = (p044c1.C3867b) r5     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f2934k     // Catch:{ all -> 0x00e4 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0070
            c1.c r7 = r8.f2935l     // Catch:{ all -> 0x00e4 }
            java.util.List<c1.b> r7 = r7.f2910e     // Catch:{ all -> 0x00e4 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00e4 }
            c1.b r6 = (p044c1.C3867b) r6     // Catch:{ all -> 0x00e4 }
            goto L_0x0071
        L_0x0070:
            r6 = r3
        L_0x0071:
            int[] r7 = r5.f2905k     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            c1.c r7 = r8.f2935l     // Catch:{ all -> 0x00e4 }
            int[] r7 = r7.f2906a     // Catch:{ all -> 0x00e4 }
        L_0x007a:
            r8.f2924a = r7     // Catch:{ all -> 0x00e4 }
            if (r7 != 0) goto L_0x00a0
            java.lang.String r0 = f2923u     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f2934k     // Catch:{ all -> 0x00e4 }
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x009c:
            r8.f2938o = r2     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r3
        L_0x00a0:
            boolean r1 = r5.f2900f     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00be
            int[] r1 = r8.f2925b     // Catch:{ all -> 0x00e4 }
            int r2 = r7.length     // Catch:{ all -> 0x00e4 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00e4 }
            int[] r1 = r8.f2925b     // Catch:{ all -> 0x00e4 }
            r8.f2924a = r1     // Catch:{ all -> 0x00e4 }
            int r2 = r5.f2902h     // Catch:{ all -> 0x00e4 }
            r1[r2] = r0     // Catch:{ all -> 0x00e4 }
            int r0 = r5.f2901g     // Catch:{ all -> 0x00e4 }
            if (r0 != r4) goto L_0x00be
            int r0 = r8.f2934k     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00be
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00e4 }
            r8.f2942s = r0     // Catch:{ all -> 0x00e4 }
        L_0x00be:
            android.graphics.Bitmap r0 = r8.m4319r(r5, r6)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r0
        L_0x00c4:
            java.lang.String r0 = f2923u     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            int r2 = r8.f2938o     // Catch:{ all -> 0x00e4 }
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x00e2:
            monitor-exit(r8)
            return r3
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p044c1.C3870e.mo29889a():android.graphics.Bitmap");
    }

    /* renamed from: b */
    public void mo29890b() {
        this.f2934k = (this.f2934k + 1) % this.f2935l.f2908c;
    }

    /* renamed from: c */
    public int mo29891c() {
        return this.f2935l.f2908c;
    }

    public void clear() {
        this.f2935l = null;
        byte[] bArr = this.f2932i;
        if (bArr != null) {
            this.f2926c.mo29902d(bArr);
        }
        int[] iArr = this.f2933j;
        if (iArr != null) {
            this.f2926c.mo29904f(iArr);
        }
        Bitmap bitmap = this.f2936m;
        if (bitmap != null) {
            this.f2926c.mo29901c(bitmap);
        }
        this.f2936m = null;
        this.f2927d = null;
        this.f2942s = null;
        byte[] bArr2 = this.f2928e;
        if (bArr2 != null) {
            this.f2926c.mo29902d(bArr2);
        }
    }

    /* renamed from: d */
    public int mo29893d() {
        int i;
        if (this.f2935l.f2908c <= 0 || (i = this.f2934k) < 0) {
            return 0;
        }
        return mo29912m(i);
    }

    /* renamed from: e */
    public void mo29894e(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f2943t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: f */
    public void mo29895f() {
        this.f2934k = -1;
    }

    /* renamed from: g */
    public int mo29896g() {
        return this.f2934k;
    }

    @NonNull
    public ByteBuffer getData() {
        return this.f2927d;
    }

    /* renamed from: h */
    public int mo29898h() {
        return this.f2927d.limit() + this.f2932i.length + (this.f2933j.length * 4);
    }

    /* renamed from: m */
    public int mo29912m(int i) {
        if (i >= 0) {
            C3868c cVar = this.f2935l;
            if (i < cVar.f2908c) {
                return cVar.f2910e.get(i).f2903i;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public synchronized void mo29913q(@NonNull C3868c cVar, @NonNull ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f2938o = 0;
            this.f2935l = cVar;
            this.f2934k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f2927d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f2927d.order(ByteOrder.LITTLE_ENDIAN);
            this.f2937n = false;
            Iterator<C3867b> it = cVar.f2910e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f2901g == 3) {
                        this.f2937n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f2939p = highestOneBit;
            int i2 = cVar.f2911f;
            this.f2941r = i2 / highestOneBit;
            int i3 = cVar.f2912g;
            this.f2940q = i3 / highestOneBit;
            this.f2932i = this.f2926c.mo29903e(i2 * i3);
            this.f2933j = this.f2926c.mo29900b(this.f2941r * this.f2940q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public C3870e(@NonNull C3865a.C3866a aVar) {
        this.f2925b = new int[256];
        this.f2943t = Bitmap.Config.ARGB_8888;
        this.f2926c = aVar;
        this.f2935l = new C3868c();
    }
}
