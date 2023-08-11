package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.sa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5957sa extends AbstractSet<Map.Entry> {

    /* renamed from: b */
    final /* synthetic */ C5973ta f7374b;

    /* synthetic */ C5957sa(C5973ta taVar, C5861ma maVar) {
        this.f7374b = taVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f7374b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f7374b.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f7374b.get(entry.getKey());
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

    public final Iterator<Map.Entry> iterator() {
        return new C5941ra(this.f7374b, (C5861ma) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f7374b.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f7374b.size();
    }
}
