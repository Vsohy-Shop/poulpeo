package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.vd */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5185vd extends C5219xd {
    /* synthetic */ C5185vd(C5168ud udVar) {
        super((C5202wd) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33014a(Object obj, long j) {
        ((C5015ld) C5187vf.m7585k(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33015b(Object obj, Object obj2, long j) {
        C5015ld ldVar = (C5015ld) C5187vf.m7585k(obj, j);
        C5015ld ldVar2 = (C5015ld) C5187vf.m7585k(obj2, j);
        int size = ldVar.size();
        int size2 = ldVar2.size();
        if (size > 0 && size2 > 0) {
            if (!ldVar.mo32880x()) {
                ldVar = ldVar.mo32765a(size2 + size);
            }
            ldVar.addAll(ldVar2);
        }
        if (size > 0) {
            ldVar2 = ldVar;
        }
        C5187vf.m7598x(obj, j, ldVar2);
    }
}
