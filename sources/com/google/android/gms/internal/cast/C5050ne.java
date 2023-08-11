package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ne */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5050ne implements C5169ue {

    /* renamed from: a */
    private final C4982je f5422a;

    /* renamed from: b */
    private final C5000kf f5423b;

    /* renamed from: c */
    private final boolean f5424c;

    /* renamed from: d */
    private final C5167uc f5425d;

    private C5050ne(C5000kf kfVar, C5167uc ucVar, C4982je jeVar) {
        this.f5423b = kfVar;
        this.f5424c = ucVar.mo33021c(jeVar);
        this.f5425d = ucVar;
        this.f5422a = jeVar;
    }

    /* renamed from: h */
    static C5050ne m7285h(C5000kf kfVar, C5167uc ucVar, C4982je jeVar) {
        return new C5050ne(kfVar, ucVar, jeVar);
    }

    /* renamed from: a */
    public final int mo32893a(Object obj) {
        int hashCode = this.f5423b.mo32854c(obj).hashCode();
        if (!this.f5424c) {
            return hashCode;
        }
        this.f5425d.mo33019a(obj);
        throw null;
    }

    /* renamed from: b */
    public final int mo32894b(Object obj) {
        C5000kf kfVar = this.f5423b;
        int b = kfVar.mo32853b(kfVar.mo32854c(obj));
        if (!this.f5424c) {
            return b;
        }
        this.f5425d.mo33019a(obj);
        throw null;
    }

    /* renamed from: c */
    public final boolean mo32895c(Object obj, Object obj2) {
        if (!this.f5423b.mo32854c(obj).equals(this.f5423b.mo32854c(obj2))) {
            return false;
        }
        if (!this.f5424c) {
            return true;
        }
        this.f5425d.mo33019a(obj);
        this.f5425d.mo33019a(obj2);
        throw null;
    }

    /* renamed from: d */
    public final void mo32896d(Object obj) {
        this.f5423b.mo32856e(obj);
        this.f5425d.mo33020b(obj);
    }

    /* renamed from: e */
    public final void mo32897e(Object obj, Object obj2) {
        C5203we.m7648d(this.f5423b, obj, obj2);
        if (this.f5424c) {
            C5203we.m7647c(this.f5425d, obj, obj2);
        }
    }

    /* renamed from: f */
    public final void mo32898f(Object obj, C4863cg cgVar) {
        this.f5425d.mo33019a(obj);
        throw null;
    }

    /* renamed from: g */
    public final boolean mo32899g(Object obj) {
        this.f5425d.mo33019a(obj);
        throw null;
    }

    /* renamed from: x */
    public final Object mo32900x() {
        C4982je jeVar = this.f5422a;
        if (jeVar instanceof C4878dd) {
            return ((C4878dd) jeVar).mo32745v();
        }
        return jeVar.mo32738m().mo32647k();
    }
}
