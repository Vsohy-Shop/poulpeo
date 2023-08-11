package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5697cf;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6163h4 implements C5697cf {

    /* renamed from: a */
    final /* synthetic */ C6185j4 f7839a;

    C6163h4(C6185j4 j4Var) {
        this.f7839a = j4Var;
    }

    /* renamed from: a */
    public final void mo33787a(int i, String str, List<String> list, boolean z, boolean z2) {
        C6184j3 j3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            j3Var = this.f7839a.f7899a.mo34920b().mo35074q();
        } else if (i2 != 1) {
            if (i2 == 3) {
                j3Var = this.f7839a.f7899a.mo34920b().mo35079v();
            } else if (i2 != 4) {
                j3Var = this.f7839a.f7899a.mo34920b().mo35078u();
            } else if (z) {
                j3Var = this.f7839a.f7899a.mo34920b().mo35082y();
            } else if (!z2) {
                j3Var = this.f7839a.f7899a.mo34920b().mo35081x();
            } else {
                j3Var = this.f7839a.f7899a.mo34920b().mo35080w();
            }
        } else if (z) {
            j3Var = this.f7839a.f7899a.mo34920b().mo35077t();
        } else if (!z2) {
            j3Var = this.f7839a.f7899a.mo34920b().mo35076s();
        } else {
            j3Var = this.f7839a.f7899a.mo34920b().mo35075r();
        }
        int size = list.size();
        if (size == 1) {
            j3Var.mo35038b(str, list.get(0));
        } else if (size == 2) {
            j3Var.mo35039c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            j3Var.mo35037a(str);
        } else {
            j3Var.mo35040d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
