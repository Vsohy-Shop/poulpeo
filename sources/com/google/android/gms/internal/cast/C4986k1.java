package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.k1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4986k1 extends C4866d1 {

    /* renamed from: d */
    private final transient C4848c1 f5274d;

    /* renamed from: e */
    private final transient C5240z0 f5275e;

    C4986k1(C4848c1 c1Var, C5240z0 z0Var) {
        this.f5274d = c1Var;
        this.f5275e = z0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo32793b(Object[] objArr, int i) {
        return this.f5275e.mo32793b(objArr, 0);
    }

    public final boolean contains(Object obj) {
        if (this.f5274d.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f5275e.listIterator(0);
    }

    /* renamed from: k */
    public final C5240z0 mo32723k() {
        return this.f5275e;
    }

    /* renamed from: r */
    public final C5088q1 mo32724r() {
        return this.f5275e.listIterator(0);
    }

    public final int size() {
        return this.f5274d.size();
    }
}
