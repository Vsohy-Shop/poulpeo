package p111h6;

import java.util.Arrays;

/* renamed from: h6.k */
/* compiled from: Objects */
public final class C8007k extends C7998e {
    /* renamed from: a */
    public static boolean m15735a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m15736b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
