package com.google.android.gms.internal.cast;

import java.util.AbstractMap;

/* renamed from: com.google.android.gms.internal.cast.h1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4935h1 extends C5240z0 {

    /* renamed from: d */
    final /* synthetic */ C4969j1 f5238d;

    C4935h1(C4969j1 j1Var) {
        this.f5238d = j1Var;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C5053o0.m7294a(i, this.f5238d.f5264f, "index");
        C4969j1 j1Var = this.f5238d;
        int i2 = i + i;
        Object obj = j1Var.f5263e[i2];
        obj.getClass();
        Object obj2 = j1Var.f5263e[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.f5238d.f5264f;
    }
}
