package com.google.android.gms.internal.cast;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.cast.r0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5104r0 {
    /* renamed from: a */
    static void m7429a(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}
