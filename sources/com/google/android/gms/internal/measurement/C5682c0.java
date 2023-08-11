package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.c0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C5682c0 implements Comparator<C5914q> {

    /* renamed from: b */
    final /* synthetic */ C5800j f6814b;

    /* renamed from: c */
    final /* synthetic */ C6015w4 f6815c;

    C5682c0(C5800j jVar, C6015w4 w4Var) {
        this.f6814b = jVar;
        this.f6815c = w4Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C5914q qVar = (C5914q) obj;
        C5914q qVar2 = (C5914q) obj2;
        C5800j jVar = this.f6814b;
        C6015w4 w4Var = this.f6815c;
        if (qVar instanceof C5994v) {
            if (!(qVar2 instanceof C5994v)) {
                return 1;
            }
            return 0;
        } else if (qVar2 instanceof C5994v) {
            return -1;
        } else {
            if (jVar == null) {
                return qVar.mo33956b().compareTo(qVar2.mo33956b());
            }
            return (int) C6032x5.m10240a(jVar.mo33875a(w4Var, Arrays.asList(new C5914q[]{qVar, qVar2})).mo33971y().doubleValue());
        }
    }
}
