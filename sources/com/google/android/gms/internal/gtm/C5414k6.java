package com.google.android.gms.internal.gtm;

import java.util.Comparator;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.k6 */
final class C5414k6 implements Comparator<C5528rc<?>> {

    /* renamed from: b */
    private final /* synthetic */ C5604wc f6092b;

    /* renamed from: c */
    private final /* synthetic */ C5276b4 f6093c;

    C5414k6(C5384i6 i6Var, C5604wc wcVar, C5276b4 b4Var) {
        this.f6092b = wcVar;
        this.f6093c = b4Var;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C5528rc rcVar = (C5528rc) obj;
        C5528rc rcVar2 = (C5528rc) obj2;
        if (rcVar == null) {
            if (rcVar2 != null) {
                return 1;
            }
            return 0;
        } else if (rcVar2 == null) {
            return -1;
        } else {
            C5528rc<?> a = ((C5491p5) this.f6092b.mo33142a()).mo33133a(this.f6093c, rcVar, rcVar2);
            C9713p.m20278m(a instanceof C5589vc);
            return (int) ((Double) ((C5589vc) a).mo33142a()).doubleValue();
        }
    }
}
