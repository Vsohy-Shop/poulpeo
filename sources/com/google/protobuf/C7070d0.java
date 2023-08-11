package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.d0 */
/* compiled from: LazyStringArrayList */
public class C7070d0 extends C7066c<String> implements C7075e0, RandomAccess {

    /* renamed from: d */
    private static final C7070d0 f9541d;

    /* renamed from: e */
    public static final C7075e0 f9542e;

    /* renamed from: c */
    private final List<Object> f9543c;

    static {
        C7070d0 d0Var = new C7070d0();
        f9541d = d0Var;
        d0Var.mo40200l();
        f9542e = d0Var;
    }

    public C7070d0() {
        this(10);
    }

    /* renamed from: j */
    private static String m12823j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C7086h) {
            return ((C7086h) obj).mo40326M();
        }
        return C7196z.m13953j((byte[]) obj);
    }

    /* renamed from: C */
    public Object mo40214C(int i) {
        return this.f9543c.get(i);
    }

    /* renamed from: D */
    public /* bridge */ /* synthetic */ boolean mo40193D() {
        return super.mo40193D();
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        mo40196b();
        this.f9543c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public void add(int i, String str) {
        mo40196b();
        this.f9543c.add(i, str);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: k */
    public String get(int i) {
        Object obj = this.f9543c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C7086h) {
            C7086h hVar = (C7086h) obj;
            String M = hVar.mo40326M();
            if (hVar.mo40336v()) {
                this.f9543c.set(i, M);
            }
            return M;
        }
        byte[] bArr = (byte[]) obj;
        String j = C7196z.m13953j(bArr);
        if (C7196z.m13950g(bArr)) {
            this.f9543c.set(i, j);
        }
        return j;
    }

    /* renamed from: o */
    public void mo40219o(C7086h hVar) {
        mo40196b();
        this.f9543c.add(hVar);
        this.modCount++;
    }

    /* renamed from: p */
    public List<?> mo40220p() {
        return Collections.unmodifiableList(this.f9543c);
    }

    /* renamed from: q */
    public C7070d0 mo40188n(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f9543c);
            return new C7070d0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public String remove(int i) {
        mo40196b();
        Object remove = this.f9543c.remove(i);
        this.modCount++;
        return m12823j(remove);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* renamed from: s */
    public String set(int i, String str) {
        mo40196b();
        return m12823j(this.f9543c.set(i, str));
    }

    public int size() {
        return this.f9543c.size();
    }

    /* renamed from: w */
    public C7075e0 mo40226w() {
        if (mo40193D()) {
            return new C7136n1(this);
        }
        return this;
    }

    public C7070d0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo40196b();
        if (collection instanceof C7075e0) {
            collection = ((C7075e0) collection).mo40220p();
        }
        boolean addAll = this.f9543c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C7070d0(ArrayList<Object> arrayList) {
        this.f9543c = arrayList;
    }
}
