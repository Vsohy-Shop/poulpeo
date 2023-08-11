package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5827k9 extends C5844l9 {
    /* synthetic */ C5827k9(C5793i9 i9Var) {
        super((C5793i9) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34126a(Object obj, long j) {
        ((C5691c9) C5778hb.m9361k(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo34127b(Object obj, Object obj2, long j) {
        C5691c9 c9Var = (C5691c9) C5778hb.m9361k(obj, j);
        C5691c9 c9Var2 = (C5691c9) C5778hb.m9361k(obj2, j);
        int size = c9Var.size();
        int size2 = c9Var2.size();
        if (size > 0 && size2 > 0) {
            if (!c9Var.mo33774x()) {
                c9Var = c9Var.mo33773m(size2 + size);
            }
            c9Var.addAll(c9Var2);
        }
        if (size > 0) {
            c9Var2 = c9Var;
        }
        C5778hb.m9374x(obj, j, c9Var2);
    }
}
