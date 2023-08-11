package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5766h implements C5914q {

    /* renamed from: b */
    private final C5914q f6969b;

    /* renamed from: c */
    private final String f6970c;

    public C5766h(String str) {
        this.f6969b = C5914q.f7289O;
        this.f6970c = str;
    }

    /* renamed from: a */
    public final C5914q mo34064a() {
        return this.f6969b;
    }

    /* renamed from: b */
    public final String mo33956b() {
        throw new IllegalStateException("Control is not a String");
    }

    /* renamed from: c */
    public final C5914q mo33957c() {
        return new C5766h(this.f6970c, this.f6969b.mo33957c());
    }

    /* renamed from: d */
    public final Boolean mo33958d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    /* renamed from: e */
    public final String mo34065e() {
        return this.f6970c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5766h)) {
            return false;
        }
        C5766h hVar = (C5766h) obj;
        if (!this.f6970c.equals(hVar.f6970c) || !this.f6969b.equals(hVar.f6969b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f6970c.hashCode() * 31) + this.f6969b.hashCode();
    }

    /* renamed from: r */
    public final C5914q mo33965r(String str, C6015w4 w4Var, List<C5914q> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    /* renamed from: y */
    public final Double mo33971y() {
        throw new IllegalStateException("Control is not a double");
    }

    /* renamed from: z */
    public final Iterator<C5914q> mo33972z() {
        return null;
    }

    public C5766h(String str, C5914q qVar) {
        this.f6969b = qVar;
        this.f6970c = str;
    }

    public C5766h() {
        throw null;
    }
}
