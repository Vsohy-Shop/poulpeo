package com.google.android.gms.internal.cast;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.ff */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4915ff extends AbstractSet {

    /* renamed from: b */
    final /* synthetic */ C4949hf f5223b;

    /* synthetic */ C4915ff(C4949hf hfVar, C4898ef efVar) {
        this.f5223b = hfVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f5223b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f5223b.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f5223b.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(value)) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C4880df(this.f5223b, (C4862cf) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f5223b.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f5223b.size();
    }
}
