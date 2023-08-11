package p421rc;

import p415qc.C13239d;

/* renamed from: rc.b */
/* compiled from: CTParamTypeDouble */
public class C13279b implements C13239d {
    /* renamed from: a */
    public boolean mo52886a(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (!cls.equals(Integer.TYPE) && !cls.equals(Integer.class) && !cls.equals(Float.TYPE) && !cls.equals(Float.class) && !cls.equals(Double.TYPE) && !cls.equals(Double.class)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public String mo52887b(Object obj) {
        Double d;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (mo52886a(cls)) {
                if (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) {
                    d = Double.valueOf((double) ((Integer) obj).intValue());
                } else if (cls.equals(Float.TYPE) || cls.equals(Float.class)) {
                    d = Double.valueOf((double) ((Float) obj).floatValue());
                } else {
                    d = (Double) obj;
                }
                return d.toString();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
