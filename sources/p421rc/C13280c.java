package p421rc;

import java.util.HashSet;
import java.util.Set;

/* renamed from: rc.c */
/* compiled from: CTParamTypeEnum */
public class C13280c extends C13284g {

    /* renamed from: a */
    private Set<String> f21171a = new HashSet();

    public C13280c(String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                if (str == null) {
                    throw new IllegalArgumentException();
                } else if (!this.f21171a.contains(str)) {
                    this.f21171a.add(str);
                    i++;
                } else {
                    throw new IllegalArgumentException("Duplication of possible value");
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public String mo52887b(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (this.f21171a.contains(obj)) {
            return super.mo52887b(obj);
        } else {
            throw new IllegalArgumentException("The parameter doesn't exist in enum : " + obj);
        }
    }
}
