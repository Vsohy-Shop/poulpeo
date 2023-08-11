package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.cb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5693cb extends AbstractList<String> implements RandomAccess, C5776h9 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5776h9 f6833b;

    public C5693cb(C5776h9 h9Var) {
        this.f6833b = h9Var;
    }

    /* renamed from: f */
    public final Object mo33777f(int i) {
        return this.f6833b.mo33777f(i);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C5759g9) this.f6833b).get(i);
    }

    /* renamed from: h */
    public final void mo33779h(C6018w7 w7Var) {
        throw new UnsupportedOperationException();
    }

    public final Iterator<String> iterator() {
        return new C5676bb(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C5659ab(this, i);
    }

    public final int size() {
        return this.f6833b.size();
    }

    /* renamed from: y */
    public final List<?> mo33783y() {
        return this.f6833b.mo33783y();
    }

    /* renamed from: e */
    public final C5776h9 mo33776e() {
        return this;
    }
}
