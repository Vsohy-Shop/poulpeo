package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.d9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5708d9 {

    /* renamed from: a */
    static final Charset f6851a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f6852b = Charset.forName(Constants.ENCODING);

    /* renamed from: c */
    static final Charset f6853c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f6854d;

    /* renamed from: e */
    public static final ByteBuffer f6855e;

    /* renamed from: f */
    public static final C5656a8 f6856f;

    static {
        byte[] bArr = new byte[0];
        f6854d = bArr;
        f6855e = ByteBuffer.wrap(bArr);
        int i = C5656a8.f6767a;
        C6050y7 y7Var = new C6050y7(bArr, 0, 0, false, (C6034x7) null);
        try {
            y7Var.mo34639c(0);
            f6856f = y7Var;
        } catch (zzkh e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m9014a(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    /* renamed from: b */
    public static int m9015b(byte[] bArr) {
        int length = bArr.length;
        int d = m9017d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m9016c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m9017d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static <T> T m9018e(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: f */
    static <T> T m9019f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    static Object m9020g(Object obj, Object obj2) {
        return ((C6052y9) obj).mo34552c().mo33995G((C6052y9) obj2).mo34351A();
    }

    /* renamed from: h */
    public static String m9021h(byte[] bArr) {
        return new String(bArr, f6852b);
    }

    /* renamed from: i */
    public static boolean m9022i(byte[] bArr) {
        return C5862mb.m9644e(bArr);
    }
}
