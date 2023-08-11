package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.se */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5135se extends C5217xb implements RandomAccess {

    /* renamed from: e */
    private static final C5135se f5524e;

    /* renamed from: c */
    private Object[] f5525c;

    /* renamed from: d */
    private int f5526d;

    static {
        C5135se seVar = new C5135se(new Object[0], 0);
        f5524e = seVar;
        seVar.zzb();
    }

    private C5135se(Object[] objArr, int i) {
        this.f5525c = objArr;
        this.f5526d = i;
    }

    /* renamed from: d */
    public static C5135se m7487d() {
        return f5524e;
    }

    /* renamed from: j */
    private final String m7488j(int i) {
        int i2 = this.f5526d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: k */
    private final void m7489k(int i) {
        if (i < 0 || i >= this.f5526d) {
            throw new IndexOutOfBoundsException(m7488j(i));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5015ld mo32765a(int i) {
        if (i >= this.f5526d) {
            return new C5135se(Arrays.copyOf(this.f5525c, i), this.f5526d);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, Object obj) {
        int i2;
        mo33047b();
        if (i < 0 || i > (i2 = this.f5526d)) {
            throw new IndexOutOfBoundsException(m7488j(i));
        }
        Object[] objArr = this.f5525c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f5525c, i, objArr2, i + 1, this.f5526d - i);
            this.f5525c = objArr2;
        }
        this.f5525c[i] = obj;
        this.f5526d++;
        this.modCount++;
    }

    public final Object get(int i) {
        m7489k(i);
        return this.f5525c[i];
    }

    public final Object remove(int i) {
        mo33047b();
        m7489k(i);
        Object[] objArr = this.f5525c;
        Object obj = objArr[i];
        int i2 = this.f5526d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f5526d--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo33047b();
        m7489k(i);
        Object[] objArr = this.f5525c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f5526d;
    }

    public final boolean add(Object obj) {
        mo33047b();
        int i = this.f5526d;
        Object[] objArr = this.f5525c;
        if (i == objArr.length) {
            this.f5525c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5525c;
        int i2 = this.f5526d;
        this.f5526d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
