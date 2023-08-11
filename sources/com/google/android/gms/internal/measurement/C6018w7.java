package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.w7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public abstract class C6018w7 implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final C6018w7 f7451c = new C5986u7(C5708d9.f6854d);

    /* renamed from: d */
    private static final Comparator<C6018w7> f7452d = new C5906p7();

    /* renamed from: e */
    private static final C6002v7 f7453e = new C6002v7((C5874n7) null);

    /* renamed from: b */
    private int f7454b = 0;

    static {
        int i = C5791i7.f7005a;
    }

    C6018w7() {
    }

    /* renamed from: A */
    public static C6018w7 m10202A(String str) {
        return new C5986u7(str.getBytes(C5708d9.f6852b));
    }

    /* renamed from: u */
    static int m10203u(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: z */
    public static C6018w7 m10204z(byte[] bArr, int i, int i2) {
        m10203u(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C5986u7(bArr2);
    }

    /* renamed from: B */
    public final String mo34581B(Charset charset) {
        if (mo34319j() == 0) {
            return "";
        }
        return mo34537r(charset);
    }

    /* renamed from: b */
    public abstract byte mo34317b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract byte mo34318d(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f7454b;
        if (i == 0) {
            int j = mo34319j();
            i = mo34535k(j, 0, j);
            if (i == 0) {
                i = 1;
            }
            this.f7454b = i;
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return new C5874n7(this);
    }

    /* renamed from: j */
    public abstract int mo34319j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo34535k(int i, int i2, int i3);

    /* renamed from: q */
    public abstract C6018w7 mo34536q(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract String mo34537r(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo34538s(C5858m7 m7Var);

    /* renamed from: t */
    public abstract boolean mo34539t();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo34319j());
        if (mo34319j() <= 50) {
            str = C6005va.m10174a(this);
        } else {
            str = C6005va.m10174a(mo34536q(0, 47)).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo34585v() {
        return this.f7454b;
    }
}
