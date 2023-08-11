package p428sd;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sd.d */
/* compiled from: BaseApiMessageBundle */
public class C13399d {

    /* renamed from: a */
    private Map<C13397b, String> f21467a = new HashMap();

    /* renamed from: a */
    public final String mo53009a(C13397b bVar, String str) {
        if (bVar == null) {
            throw new IllegalArgumentException();
        } else if (!this.f21467a.containsKey(bVar)) {
            return str;
        } else {
            return this.f21467a.get(bVar);
        }
    }

    /* renamed from: b */
    public final void mo53010b(C13397b bVar, String str) {
        if (bVar == null) {
            throw new IllegalArgumentException();
        } else if (!TextUtils.isEmpty(str)) {
            this.f21467a.put(bVar, str);
        } else {
            this.f21467a.remove(bVar);
        }
    }
}
