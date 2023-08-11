package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.p1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5071p1 extends C4866d1 {

    /* renamed from: d */
    final transient Object f5460d;

    C5071p1(Object obj) {
        obj.getClass();
        this.f5460d = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo32793b(Object[] objArr, int i) {
        objArr[0] = this.f5460d;
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.f5460d.equals(obj);
    }

    public final int hashCode() {
        return this.f5460d.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new C4884e1(this.f5460d);
    }

    /* renamed from: k */
    public final C5240z0 mo32723k() {
        return C5240z0.m7713v(this.f5460d);
    }

    /* renamed from: r */
    public final C5088q1 mo32724r() {
        return new C4884e1(this.f5460d);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return '[' + this.f5460d.toString() + ']';
    }
}
