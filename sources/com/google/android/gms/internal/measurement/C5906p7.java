package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.p7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5906p7 implements Comparator<C6018w7> {
    C5906p7() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C6018w7 w7Var = (C6018w7) obj;
        C6018w7 w7Var2 = (C6018w7) obj2;
        C5874n7 n7Var = new C5874n7(w7Var);
        C5874n7 n7Var2 = new C5874n7(w7Var2);
        while (n7Var.hasNext() && n7Var2.hasNext()) {
            int a = C5890o7.m9736a(n7Var.zza() & 255, n7Var2.zza() & 255);
            if (a != 0) {
                return a;
            }
        }
        return C5890o7.m9736a(w7Var.mo34319j(), w7Var2.mo34319j());
    }
}
