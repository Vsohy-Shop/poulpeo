package p421rc;

import p415qc.C13239d;

/* renamed from: rc.a */
/* compiled from: CTParamTypeBoolean */
public class C13278a implements C13239d {
    /* renamed from: a */
    public boolean mo52886a(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (!cls.equals(Boolean.TYPE) && !cls.equals(Boolean.class)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public String mo52887b(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (!mo52886a(obj.getClass())) {
            throw new IllegalArgumentException();
        } else if (((Boolean) obj).booleanValue()) {
            return "1";
        } else {
            return "0";
        }
    }
}
