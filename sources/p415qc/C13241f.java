package p415qc;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p446vd.C13633n;

/* renamed from: qc.f */
/* compiled from: CTTrackingCommand */
public abstract class C13241f {

    /* renamed from: a */
    private Set<C13238c> f21069a = new HashSet();

    /* renamed from: a */
    public abstract C13241f mo52890a(C13238c cVar, Object obj);

    /* renamed from: b */
    public abstract C13241f mo52891b(Map<C13238c, Object> map);

    /* renamed from: c */
    public abstract String mo52892c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo52893d(Set<C13238c> set) {
        if (set == null) {
            return this.f21069a.isEmpty();
        }
        for (C13238c next : this.f21069a) {
            if (!set.contains(next)) {
                C13633n.m31163s(this, "The param " + next.mo52882b() + " is missing");
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo52894e(C13238c cVar) {
        if (cVar != null) {
            HashSet hashSet = new HashSet();
            hashSet.add(cVar);
            mo52895f(hashSet);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo52895f(Set<C13238c> set) {
        if (set != null) {
            this.f21069a.addAll(set);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public abstract void mo52896g(String str, boolean z);
}
