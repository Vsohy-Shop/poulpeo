package p290y8;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import p336ef.C11919u;

/* renamed from: y8.d */
/* compiled from: LookupTranslator.kt */
public final class C10715d extends C10716e {

    /* renamed from: a */
    private final Map<String, String> f16341a = new LinkedHashMap();

    /* renamed from: b */
    private final Set<C11919u> f16342b = new LinkedHashSet();

    /* renamed from: c */
    private final int f16343c;

    /* renamed from: d */
    private final int f16344d;

    public C10715d(Map<String, String> map) {
        C12775o.m28639i(map, "lookupMap");
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            this.f16341a.put(str, (String) next.getValue());
            this.f16342b.add(C11919u.m25714a(C11919u.m25715b((short) str.charAt(0))));
            int length = str.length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f16343c = i;
        this.f16344d = i2;
    }

    /* renamed from: a */
    public int mo45638a(String str, int i, StringBuilder sb) {
        C12775o.m28639i(str, "input");
        C12775o.m28639i(sb, "stringBuilder");
        if (!this.f16342b.contains(C11919u.m25714a(C11919u.m25715b((short) str.charAt(i))))) {
            return 0;
        }
        int i2 = this.f16344d;
        if (i + i2 > str.length()) {
            i2 = str.length() - i;
        }
        int i3 = this.f16343c;
        if (i3 > i2) {
            return 0;
        }
        while (true) {
            CharSequence subSequence = str.subSequence(i, i + i2);
            String str2 = this.f16341a.get(subSequence.toString());
            if (str2 != null) {
                sb.append(str2);
                return subSequence.length();
            } else if (i2 == i3) {
                return 0;
            } else {
                i2--;
            }
        }
    }
}
