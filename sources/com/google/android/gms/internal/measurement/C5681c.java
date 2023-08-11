package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5681c {

    /* renamed from: a */
    private C5664b f6811a;

    /* renamed from: b */
    private C5664b f6812b;

    /* renamed from: c */
    private final List<C5664b> f6813c;

    public C5681c() {
        this.f6811a = new C5664b("", 0, (Map<String, Object>) null);
        this.f6812b = new C5664b("", 0, (Map<String, Object>) null);
        this.f6813c = new ArrayList();
    }

    /* renamed from: a */
    public final C5664b mo33723a() {
        return this.f6811a;
    }

    /* renamed from: b */
    public final C5664b mo33724b() {
        return this.f6812b;
    }

    /* renamed from: c */
    public final List<C5664b> mo33725c() {
        return this.f6813c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C5681c cVar = new C5681c(this.f6811a.clone());
        for (C5664b b : this.f6813c) {
            cVar.f6813c.add(b.clone());
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo33727d(C5664b bVar) {
        this.f6811a = bVar;
        this.f6812b = bVar.clone();
        this.f6813c.clear();
    }

    /* renamed from: e */
    public final void mo33728e(String str, long j, Map<String, Object> map) {
        this.f6813c.add(new C5664b(str, j, map));
    }

    /* renamed from: f */
    public final void mo33729f(C5664b bVar) {
        this.f6812b = bVar;
    }

    public C5681c(C5664b bVar) {
        this.f6811a = bVar;
        this.f6812b = bVar.clone();
        this.f6813c = new ArrayList();
    }
}
