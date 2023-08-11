package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.coroutines.jvm.internal.g */
/* compiled from: DebugMetadata.kt */
public final class C12740g {
    /* renamed from: a */
    private static final void m28567a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final C12739f m28568b(C12734a aVar) {
        return (C12739f) aVar.getClass().getAnnotation(C12739f.class);
    }

    /* renamed from: c */
    private static final int m28569c(C12734a aVar) {
        Integer num;
        int i;
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m28570d(C12734a aVar) {
        int i;
        String str;
        C12775o.m28639i(aVar, "<this>");
        C12739f b = m28568b(aVar);
        if (b == null) {
            return null;
        }
        m28567a(1, b.mo50613v());
        int c = m28569c(aVar);
        if (c < 0) {
            i = -1;
        } else {
            i = b.mo50611l()[c];
        }
        String b2 = C12742i.f20394a.mo50614b(aVar);
        if (b2 == null) {
            str = b.mo50609c();
        } else {
            str = b2 + '/' + b.mo50609c();
        }
        return new StackTraceElement(str, b.mo50612m(), b.mo50610f(), i);
    }
}
