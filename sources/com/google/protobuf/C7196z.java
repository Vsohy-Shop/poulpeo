package com.google.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.z */
/* compiled from: Internal */
public final class C7196z {

    /* renamed from: a */
    static final Charset f9860a = Charset.forName(Constants.ENCODING);

    /* renamed from: b */
    static final Charset f9861b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f9862c;

    /* renamed from: d */
    public static final ByteBuffer f9863d;

    /* renamed from: e */
    public static final C7111i f9864e;

    /* renamed from: com.google.protobuf.z$a */
    /* compiled from: Internal */
    public interface C7197a extends C7205i<Boolean> {
    }

    /* renamed from: com.google.protobuf.z$b */
    /* compiled from: Internal */
    public interface C7198b extends C7205i<Double> {
    }

    /* renamed from: com.google.protobuf.z$c */
    /* compiled from: Internal */
    public interface C7199c {
        /* renamed from: y */
        int mo40727y();
    }

    /* renamed from: com.google.protobuf.z$d */
    /* compiled from: Internal */
    public interface C7200d<T extends C7199c> {
        /* renamed from: a */
        T mo40728a(int i);
    }

    /* renamed from: com.google.protobuf.z$e */
    /* compiled from: Internal */
    public interface C7201e {
        /* renamed from: a */
        boolean mo40729a(int i);
    }

    /* renamed from: com.google.protobuf.z$f */
    /* compiled from: Internal */
    public interface C7202f extends C7205i<Float> {
    }

    /* renamed from: com.google.protobuf.z$g */
    /* compiled from: Internal */
    public interface C7203g extends C7205i<Integer> {
    }

    /* renamed from: com.google.protobuf.z$h */
    /* compiled from: Internal */
    public interface C7204h extends C7205i<Long> {
    }

    /* renamed from: com.google.protobuf.z$i */
    /* compiled from: Internal */
    public interface C7205i<E> extends List<E>, RandomAccess {
        /* renamed from: D */
        boolean mo40193D();

        /* renamed from: l */
        void mo40200l();

        /* renamed from: n */
        C7205i<E> mo40188n(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f9862c = bArr;
        f9863d = ByteBuffer.wrap(bArr);
        f9864e = C7111i.m13145h(bArr);
    }

    /* renamed from: a */
    static <T> T m13944a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    static <T> T m13945b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m13946c(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    /* renamed from: d */
    public static int m13947d(byte[] bArr) {
        return m13948e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m13948e(byte[] bArr, int i, int i2) {
        int i3 = m13952i(i2, bArr, i, i2);
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: f */
    public static int m13949f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m13950g(byte[] bArr) {
        return C7151p1.m13632m(bArr);
    }

    /* renamed from: h */
    static Object m13951h(Object obj, Object obj2) {
        return ((C7149p0) obj).mo40625b().mo40156O((C7149p0) obj2).mo40630Q();
    }

    /* renamed from: i */
    static int m13952i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m13953j(byte[] bArr) {
        return new String(bArr, f9860a);
    }
}
