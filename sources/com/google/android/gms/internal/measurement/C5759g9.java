package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.g9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5759g9 extends C5774h7<String> implements RandomAccess, C5776h9 {

    /* renamed from: d */
    private static final C5759g9 f6956d;

    /* renamed from: e */
    public static final C5776h9 f6957e;

    /* renamed from: c */
    private final List<Object> f6958c;

    static {
        C5759g9 g9Var = new C5759g9(10);
        f6956d = g9Var;
        g9Var.zzb();
        f6957e = g9Var;
    }

    public C5759g9() {
        this(10);
    }

    /* renamed from: j */
    private static String m9288j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C6018w7) {
            return ((C6018w7) obj).mo34581B(C5708d9.f6852b);
        }
        return C5708d9.m9021h((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo34072b();
        this.f6958c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo34072b();
        if (collection instanceof C5776h9) {
            collection = ((C5776h9) collection).mo33783y();
        }
        boolean addAll = this.f6958c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo34072b();
        this.f6958c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final String get(int i) {
        Object obj = this.f6958c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C6018w7) {
            C6018w7 w7Var = (C6018w7) obj;
            String B = w7Var.mo34581B(C5708d9.f6852b);
            if (w7Var.mo34539t()) {
                this.f6958c.set(i, B);
            }
            return B;
        }
        byte[] bArr = (byte[]) obj;
        String h = C5708d9.m9021h(bArr);
        if (C5708d9.m9022i(bArr)) {
            this.f6958c.set(i, h);
        }
        return h;
    }

    /* renamed from: e */
    public final C5776h9 mo33776e() {
        if (mo33774x()) {
            return new C5693cb(this);
        }
        return this;
    }

    /* renamed from: f */
    public final Object mo33777f(int i) {
        return this.f6958c.get(i);
    }

    /* renamed from: h */
    public final void mo33779h(C6018w7 w7Var) {
        mo34072b();
        this.f6958c.add(w7Var);
        this.modCount++;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5691c9 mo33773m(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f6958c);
            return new C5759g9((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo34072b();
        Object remove = this.f6958c.remove(i);
        this.modCount++;
        return m9288j(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo34072b();
        return m9288j(this.f6958c.set(i, (String) obj));
    }

    public final int size() {
        return this.f6958c.size();
    }

    /* renamed from: y */
    public final List<?> mo33783y() {
        return Collections.unmodifiableList(this.f6958c);
    }

    public C5759g9(int i) {
        this.f6958c = new ArrayList(i);
    }

    private C5759g9(ArrayList<Object> arrayList) {
        this.f6958c = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
