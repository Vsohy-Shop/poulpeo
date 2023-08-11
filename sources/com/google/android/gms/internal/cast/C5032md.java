package com.google.android.gms.internal.cast;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.cast.md */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5032md {

    /* renamed from: a */
    static final Charset f5363a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f5364b = Charset.forName(Constants.ENCODING);

    /* renamed from: c */
    static final Charset f5365c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f5366d;

    /* renamed from: e */
    public static final ByteBuffer f5367e;

    /* renamed from: f */
    public static final C5048nc f5368f;

    static {
        byte[] bArr = new byte[0];
        f5366d = bArr;
        f5367e = ByteBuffer.wrap(bArr);
        int i = C5048nc.f5407a;
        C5014lc lcVar = new C5014lc(bArr, 0, 0, false, (C4997kc) null);
        try {
            lcVar.mo32879a(0);
            f5368f = lcVar;
        } catch (zzqx e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m7194a(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    /* renamed from: b */
    public static int m7195b(byte[] bArr) {
        int length = bArr.length;
        int d = m7197d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m7196c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m7197d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m7198e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: f */
    static Object m7199f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static String m7200g(byte[] bArr) {
        return new String(bArr, f5364b);
    }

    /* renamed from: h */
    public static boolean m7201h(byte[] bArr) {
        return C5255zf.m7731d(bArr);
    }
}
