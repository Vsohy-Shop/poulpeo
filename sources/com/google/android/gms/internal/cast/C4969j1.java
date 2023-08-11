package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.j1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4969j1 extends C4866d1 {

    /* renamed from: d */
    private final transient C4848c1 f5262d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final transient Object[] f5263e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient int f5264f;

    C4969j1(C4848c1 c1Var, Object[] objArr, int i, int i2) {
        this.f5262d = c1Var;
        this.f5263e = objArr;
        this.f5264f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo32793b(Object[] objArr, int i) {
        return mo32723k().mo32793b(objArr, 0);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f5262d.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo32723k().listIterator(0);
    }

    /* renamed from: r */
    public final C5088q1 mo32724r() {
        return mo32723k().listIterator(0);
    }

    public final int size() {
        return this.f5264f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C5240z0 mo32725t() {
        return new C4935h1(this);
    }
}
