package com.google.android.gms.internal.cast;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.cast.o1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5054o1 {
    /* renamed from: a */
    static int m7298a(Set set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
