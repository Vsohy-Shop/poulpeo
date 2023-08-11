package p421rc;

import java.util.List;
import p415qc.C13239d;

/* renamed from: rc.f */
/* compiled from: CTParamTypeList */
public class C13283f implements C13239d {
    /* renamed from: a */
    public boolean mo52886a(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (List.class.isAssignableFrom(cls)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public String mo52887b(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (mo52916c(obj.getClass())) {
            return (String) obj;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public boolean mo52916c(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (cls.equals(String.class)) {
            return true;
        } else {
            return false;
        }
    }
}
