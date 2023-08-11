package com.google.android.gms.internal.cast;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.cast.lf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5017lf {

    /* renamed from: f */
    private static final C5017lf f5349f = new C5017lf(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f5350a;

    /* renamed from: b */
    private int[] f5351b;

    /* renamed from: c */
    private Object[] f5352c;

    /* renamed from: d */
    private int f5353d;

    /* renamed from: e */
    private boolean f5354e;

    private C5017lf(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f5353d = -1;
        this.f5350a = 0;
        this.f5351b = iArr;
        this.f5352c = objArr;
        this.f5354e = z;
    }

    /* renamed from: c */
    public static C5017lf m7167c() {
        return f5349f;
    }

    /* renamed from: e */
    static C5017lf m7168e(C5017lf lfVar, C5017lf lfVar2) {
        int i = lfVar.f5350a;
        int i2 = lfVar2.f5350a;
        int[] copyOf = Arrays.copyOf(lfVar.f5351b, 0);
        System.arraycopy(lfVar2.f5351b, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(lfVar.f5352c, 0);
        System.arraycopy(lfVar2.f5352c, 0, copyOf2, 0, 0);
        return new C5017lf(0, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    public final int mo32882a() {
        int i = this.f5353d;
        if (i != -1) {
            return i;
        }
        this.f5353d = 0;
        return 0;
    }

    /* renamed from: b */
    public final int mo32883b() {
        int i = this.f5353d;
        if (i != -1) {
            return i;
        }
        this.f5353d = 0;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C5017lf mo32884d(C5017lf lfVar) {
        if (lfVar.equals(f5349f)) {
            return this;
        }
        if (this.f5354e) {
            int[] iArr = this.f5351b;
            int length = iArr.length;
            System.arraycopy(lfVar.f5351b, 0, iArr, 0, 0);
            System.arraycopy(lfVar.f5352c, 0, this.f5352c, 0, 0);
            this.f5350a = 0;
            return this;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5017lf)) {
            return false;
        }
        C5017lf lfVar = (C5017lf) obj;
        return true;
    }

    /* renamed from: f */
    public final void mo32886f() {
        this.f5354e = false;
    }

    public final int hashCode() {
        return 506991;
    }

    private C5017lf() {
        this(0, new int[8], new Object[8], true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo32887g(StringBuilder sb, int i) {
    }
}
