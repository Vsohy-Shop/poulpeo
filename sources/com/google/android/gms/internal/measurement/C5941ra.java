package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ra */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5941ra implements Iterator<Map.Entry> {

    /* renamed from: b */
    private int f7325b = -1;

    /* renamed from: c */
    private boolean f7326c;

    /* renamed from: d */
    private Iterator<Map.Entry> f7327d;

    /* renamed from: e */
    final /* synthetic */ C5973ta f7328e;

    /* synthetic */ C5941ra(C5973ta taVar, C5861ma maVar) {
        this.f7328e = taVar;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m9838a() {
        if (this.f7327d == null) {
            this.f7327d = this.f7328e.f7397d.entrySet().iterator();
        }
        return this.f7327d;
    }

    public final boolean hasNext() {
        if (this.f7325b + 1 < this.f7328e.f7396c.size()) {
            return true;
        }
        if (this.f7328e.f7397d.isEmpty()) {
            return false;
        }
        if (m9838a().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f7326c = true;
        int i = this.f7325b + 1;
        this.f7325b = i;
        if (i < this.f7328e.f7396c.size()) {
            return (Map.Entry) this.f7328e.f7396c.get(this.f7325b);
        }
        return m9838a().next();
    }

    public final void remove() {
        if (this.f7326c) {
            this.f7326c = false;
            this.f7328e.m9978o();
            if (this.f7325b < this.f7328e.f7396c.size()) {
                C5973ta taVar = this.f7328e;
                int i = this.f7325b;
                this.f7325b = i - 1;
                Object unused = taVar.m9976m(i);
                return;
            }
            m9838a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
