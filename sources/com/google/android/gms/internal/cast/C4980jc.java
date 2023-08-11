package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.cast.jc */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public abstract class C4980jc implements Iterable, Serializable {

    /* renamed from: c */
    public static final C4980jc f5269c = new C4929gc(C5032md.f5366d);

    /* renamed from: d */
    private static final Comparator f5270d = new C4841bc();

    /* renamed from: e */
    private static final C4963ic f5271e = new C4963ic((C4946hc) null);

    /* renamed from: b */
    private int f5272b = 0;

    static {
        int i = C5234yb.f5604a;
    }

    C4980jc() {
    }

    /* renamed from: u */
    static int m7090u(int i, int i2, int i3) {
        if (((i3 - i2) | i2) >= 0) {
            return i2;
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    /* renamed from: z */
    public static C4980jc m7091z(String str) {
        return new C4929gc(str.getBytes(C5032md.f5364b));
    }

    /* renamed from: A */
    public final String mo32845A(Charset charset) {
        if (mo32730j() == 0) {
            return "";
        }
        return mo32811r(charset);
    }

    /* renamed from: b */
    public abstract byte mo32728b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract byte mo32729d(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f5272b;
        if (i == 0) {
            int j = mo32730j();
            i = mo32809k(j, 0, j);
            if (i == 0) {
                i = 1;
            }
            this.f5272b = i;
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return new C4823ac(this);
    }

    /* renamed from: j */
    public abstract int mo32730j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo32809k(int i, int i2, int i3);

    /* renamed from: q */
    public abstract C4980jc mo32810q(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract String mo32811r(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo32812s(C5251zb zbVar);

    /* renamed from: t */
    public abstract boolean mo32813t();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo32730j());
        if (mo32730j() <= 50) {
            str = C4983jf.m7106a(this);
        } else {
            str = C4983jf.m7106a(mo32810q(0, 47)).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo32849v() {
        return this.f5272b;
    }
}
