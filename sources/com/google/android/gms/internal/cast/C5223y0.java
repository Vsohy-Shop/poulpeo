package com.google.android.gms.internal.cast;

import java.util.List;

/* renamed from: com.google.android.gms.internal.cast.y0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5223y0 extends C5240z0 {

    /* renamed from: d */
    final transient int f5597d;

    /* renamed from: e */
    final transient int f5598e;

    /* renamed from: f */
    final /* synthetic */ C5240z0 f5599f;

    C5223y0(C5240z0 z0Var, int i, int i2) {
        this.f5599f = z0Var;
        this.f5597d = i;
        this.f5598e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo32794d() {
        return this.f5599f.mo32796j() + this.f5597d + this.f5598e;
    }

    public final Object get(int i) {
        C5053o0.m7294a(i, this.f5598e, "index");
        return this.f5599f.get(i + this.f5597d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo32796j() {
        return this.f5599f.mo32796j() + this.f5597d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Object[] mo32797q() {
        return this.f5599f.mo32797q();
    }

    /* renamed from: r */
    public final C5240z0 mo33056r(int i, int i2) {
        C5053o0.m7296c(i, i2, this.f5598e);
        C5240z0 z0Var = this.f5599f;
        int i3 = this.f5597d;
        return z0Var.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f5598e;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
