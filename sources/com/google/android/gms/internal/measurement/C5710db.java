package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.db */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5710db implements PrivilegedExceptionAction<Unsafe> {
    C5710db() {
    }

    /* renamed from: a */
    public static final Unsafe m9023a() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        return m9023a();
    }
}
