package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5898p extends C5800j {

    /* renamed from: d */
    protected final List<String> f7261d;

    /* renamed from: e */
    protected final List<C5914q> f7262e;

    /* renamed from: f */
    protected C6015w4 f7263f;

    private C5898p(C5898p pVar) {
        super(pVar.f7017b);
        ArrayList arrayList = new ArrayList(pVar.f7261d.size());
        this.f7261d = arrayList;
        arrayList.addAll(pVar.f7261d);
        ArrayList arrayList2 = new ArrayList(pVar.f7262e.size());
        this.f7262e = arrayList2;
        arrayList2.addAll(pVar.f7262e);
        this.f7263f = pVar.f7263f;
    }

    /* renamed from: a */
    public final C5914q mo33875a(C6015w4 w4Var, List<C5914q> list) {
        C6015w4 a = this.f7263f.mo34572a();
        for (int i = 0; i < this.f7261d.size(); i++) {
            if (i < list.size()) {
                a.mo34576e(this.f7261d.get(i), w4Var.mo34573b(list.get(i)));
            } else {
                a.mo34576e(this.f7261d.get(i), C5914q.f7289O);
            }
        }
        for (C5914q next : this.f7262e) {
            C5914q b = a.mo34573b(next);
            if (b instanceof C5930r) {
                b = a.mo34573b(next);
            }
            if (b instanceof C5766h) {
                return ((C5766h) b).mo34064a();
            }
        }
        return C5914q.f7289O;
    }

    /* renamed from: c */
    public final C5914q mo33957c() {
        return new C5898p(this);
    }

    public C5898p(String str, List<C5914q> list, List<C5914q> list2, C6015w4 w4Var) {
        super(str);
        this.f7261d = new ArrayList();
        this.f7263f = w4Var;
        if (!list.isEmpty()) {
            for (C5914q b : list) {
                this.f7261d.add(b.mo33956b());
            }
        }
        this.f7262e = new ArrayList(list2);
    }
}
