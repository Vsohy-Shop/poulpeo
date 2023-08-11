package p042bo.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p126j0.C8273e;
import p404of.C13074a;

/* renamed from: bo.app.v1 */
public final class C3745v1 {

    /* renamed from: a */
    private static final String f2702a = C8266c.f11641a.mo42215o("HttpUtils");

    /* renamed from: b */
    private static final SimpleDateFormat f2703b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    /* renamed from: bo.app.v1$a */
    static final class C3746a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2704b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3746a(String str) {
            super(0);
            this.f2704b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Could not parse http-date value: ", this.f2704b);
        }
    }

    /* renamed from: a */
    public static final Long m4012a(String str) {
        Long valueOf;
        if (str == null) {
            return null;
        }
        try {
            Double i = C13752t.m31516i(str);
            if (i != null) {
                valueOf = Long.valueOf((long) (i.doubleValue() * ((double) 1000)));
            } else {
                Date parse = f2703b.parse(str);
                if (parse == null) {
                    return null;
                }
                valueOf = Long.valueOf(parse.getTime() - C8273e.m16435h());
            }
            return valueOf;
        } catch (Exception e) {
            C8266c.m16397f(C8266c.f11641a, f2702a, C8266c.C8267a.f11649e, e, false, new C3746a(str), 8, (Object) null);
            return null;
        }
    }

    /* renamed from: a */
    public static final String m4013a(Object... objArr) {
        C12775o.m28639i(objArr, "requestArgs");
        int length = objArr.length;
        long j = 1;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            j *= (long) obj.hashCode();
        }
        String hexString = Long.toHexString(j);
        C12775o.m28638h(hexString, "toHexString(\n    request…lement.hashCode()\n    }\n)");
        return hexString;
    }

    /* renamed from: a */
    public static final Map<String, String> m4014a(Map<String, ? extends List<String>> map) {
        C12775o.m28639i(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (((String) next.getKey()) != null) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C12714q0.m28413d(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C12775o.m28636f(key);
            Locale locale = Locale.US;
            C12775o.m28638h(locale, "US");
            String lowerCase = ((String) key).toLowerCase(locale);
            C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap2.put(lowerCase, entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C12714q0.m28413d(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), C12686e0.m28229h0((Iterable) entry2.getValue(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
        return linkedHashMap3;
    }
}
