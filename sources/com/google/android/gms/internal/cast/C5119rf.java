package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.rf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5119rf implements PrivilegedExceptionAction {
    C5119rf() {
    }

    /* renamed from: a */
    public static final Unsafe m7438a() {
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
        return m7438a();
    }
}
