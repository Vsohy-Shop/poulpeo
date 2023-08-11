package p421rc;

import p415qc.C13239d;

/* renamed from: rc.g */
/* compiled from: CTParamTypeString */
public class C13284g implements C13239d {
    /* renamed from: a */
    public boolean mo52886a(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (cls.equals(String.class)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public String mo52887b(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (mo52886a(obj.getClass())) {
            return (String) obj;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
