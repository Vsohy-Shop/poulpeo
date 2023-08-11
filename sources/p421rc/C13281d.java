package p421rc;

/* renamed from: rc.d */
/* compiled from: CTParamTypeID */
public class C13281d extends C13282e {
    /* renamed from: b */
    public String mo52887b(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (mo52886a(obj.getClass())) {
            Integer num = (Integer) obj;
            if (num.intValue() > 0) {
                return num.toString();
            }
            throw new IllegalArgumentException("An id can't have a negative value or a 0 value : " + num);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
