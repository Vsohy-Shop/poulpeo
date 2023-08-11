package p109h4;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h4.q0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C7959q0 {

    /* renamed from: a */
    private final Map f11197a = new HashMap();

    /* renamed from: b */
    private final Map f11198b = new HashMap();

    /* renamed from: c */
    private final Map f11199c = new HashMap();

    /* renamed from: a */
    public final int mo41803a(String str) {
        Integer num = (Integer) this.f11199c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public final C7959q0 mo41804b(String str, String str2, int i) {
        this.f11197a.put(str, str2);
        this.f11198b.put(str2, str);
        this.f11199c.put(str, Integer.valueOf(i));
        return this;
    }

    @Nullable
    /* renamed from: c */
    public final String mo41805c(String str) {
        return (String) this.f11197a.get(str);
    }

    @Nullable
    /* renamed from: d */
    public final String mo41806d(String str) {
        return (String) this.f11198b.get(str);
    }
}
