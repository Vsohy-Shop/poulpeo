package com.google.android.gms.internal.cast;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.cast.t0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
class C5138t0 extends C5155u0 {

    /* renamed from: a */
    Object[] f5533a = new Object[4];

    /* renamed from: b */
    int f5534b = 0;

    /* renamed from: c */
    boolean f5535c;

    C5138t0(int i) {
    }

    /* renamed from: c */
    private final void m7504c(int i) {
        Object[] objArr = this.f5533a;
        int length = objArr.length;
        if (length < i) {
            this.f5533a = Arrays.copyOf(objArr, C5155u0.m7520a(length, i));
            this.f5535c = false;
        } else if (this.f5535c) {
            this.f5533a = (Object[]) objArr.clone();
            this.f5535c = false;
        }
    }

    /* renamed from: b */
    public final C5138t0 mo33013b(Object obj) {
        obj.getClass();
        m7504c(this.f5534b + 1);
        Object[] objArr = this.f5533a;
        int i = this.f5534b;
        this.f5534b = i + 1;
        objArr[i] = obj;
        return this;
    }
}
