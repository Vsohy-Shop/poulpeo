package p421rc;

import p415qc.C13239d;

/* renamed from: rc.e */
/* compiled from: CTParamTypeInteger */
public class C13282e implements C13239d {
    /* renamed from: a */
    public boolean mo52886a(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (!cls.equals(Integer.TYPE) && !cls.equals(Integer.class)) {
            return false;
        } else {
            return true;
        }
    }
}
