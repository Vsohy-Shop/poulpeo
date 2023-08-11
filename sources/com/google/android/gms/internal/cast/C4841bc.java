package com.google.android.gms.internal.cast;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.cast.bc */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4841bc implements Comparator {
    C4841bc() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C4980jc jcVar = (C4980jc) obj;
        C4980jc jcVar2 = (C4980jc) obj2;
        C4823ac acVar = new C4823ac(jcVar);
        C4823ac acVar2 = new C4823ac(jcVar2);
        while (acVar.hasNext() && acVar2.hasNext()) {
            int compareTo = Integer.valueOf(acVar.zza() & 255).compareTo(Integer.valueOf(acVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(jcVar.mo32730j()).compareTo(Integer.valueOf(jcVar2.mo32730j()));
    }
}
