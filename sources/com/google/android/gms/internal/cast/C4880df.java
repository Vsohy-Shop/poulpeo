package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.df */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4880df implements Iterator {

    /* renamed from: b */
    private int f5194b = -1;

    /* renamed from: c */
    private boolean f5195c;

    /* renamed from: d */
    private Iterator f5196d;

    /* renamed from: e */
    final /* synthetic */ C4949hf f5197e;

    /* synthetic */ C4880df(C4949hf hfVar, C4862cf cfVar) {
        this.f5197e = hfVar;
    }

    /* renamed from: a */
    private final Iterator m6931a() {
        if (this.f5196d == null) {
            this.f5196d = this.f5197e.f5245d.entrySet().iterator();
        }
        return this.f5196d;
    }

    public final boolean hasNext() {
        if (this.f5194b + 1 < this.f5197e.f5244c.size()) {
            return true;
        }
        if (this.f5197e.f5245d.isEmpty()) {
            return false;
        }
        if (m6931a().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f5195c = true;
        int i = this.f5194b + 1;
        this.f5194b = i;
        if (i < this.f5197e.f5244c.size()) {
            return (Map.Entry) this.f5197e.f5244c.get(this.f5194b);
        }
        return (Map.Entry) m6931a().next();
    }

    public final void remove() {
        if (this.f5195c) {
            this.f5195c = false;
            this.f5197e.m7052o();
            if (this.f5194b < this.f5197e.f5244c.size()) {
                C4949hf hfVar = this.f5197e;
                int i = this.f5194b;
                this.f5194b = i - 1;
                Object unused = hfVar.m7050m(i);
                return;
            }
            m6931a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
