package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.qd */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5100qd extends C5217xb implements RandomAccess, C5117rd {

    /* renamed from: d */
    private static final C5100qd f5489d;

    /* renamed from: e */
    public static final C5117rd f5490e;

    /* renamed from: c */
    private final List f5491c;

    static {
        C5100qd qdVar = new C5100qd(10);
        f5489d = qdVar;
        qdVar.zzb();
        f5490e = qdVar;
    }

    public C5100qd() {
        this(10);
    }

    /* renamed from: j */
    private static String m7419j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4980jc) {
            return ((C4980jc) obj).mo32845A(C5032md.f5364b);
        }
        return C5032md.m7200g((byte[]) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5015ld mo32765a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f5491c);
            return new C5100qd(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo33047b();
        this.f5491c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo33047b();
        if (collection instanceof C5117rd) {
            collection = ((C5117rd) collection).mo32984y();
        }
        boolean addAll = this.f5491c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: c */
    public final C5117rd mo32977c() {
        if (mo32880x()) {
            return new C5102qf(this);
        }
        return this;
    }

    public final void clear() {
        mo33047b();
        this.f5491c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final String get(int i) {
        Object obj = this.f5491c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4980jc) {
            C4980jc jcVar = (C4980jc) obj;
            String A = jcVar.mo32845A(C5032md.f5364b);
            if (jcVar.mo32813t()) {
                this.f5491c.set(i, A);
            }
            return A;
        }
        byte[] bArr = (byte[]) obj;
        String g = C5032md.m7200g(bArr);
        if (C5032md.m7201h(bArr)) {
            this.f5491c.set(i, g);
        }
        return g;
    }

    /* renamed from: i */
    public final Object mo32981i(int i) {
        return this.f5491c.get(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo33047b();
        Object remove = this.f5491c.remove(i);
        this.modCount++;
        return m7419j(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo33047b();
        return m7419j(this.f5491c.set(i, (String) obj));
    }

    public final int size() {
        return this.f5491c.size();
    }

    /* renamed from: y */
    public final List mo32984y() {
        return Collections.unmodifiableList(this.f5491c);
    }

    public C5100qd(int i) {
        this.f5491c = new ArrayList(i);
    }

    private C5100qd(ArrayList arrayList) {
        this.f5491c = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
