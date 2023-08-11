package p126j0;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p292z.C10730a;
import p404of.C13074a;

/* renamed from: j0.h */
public final class C8285h {

    /* renamed from: j0.h$a */
    static final class C8286a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8286a f11673g = new C8286a();

        C8286a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Removing non-string keys from map";
        }
    }

    /* renamed from: a */
    public static final Map<?, ?> m16468a(Map<?, ?> map) {
        C12775o.m28639i(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (!(next.getKey() instanceof String)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            C8266c.m16396e(C8266c.f11641a, map, C8266c.C8267a.f11651g, (Throwable) null, false, C8286a.f11673g, 6, (Object) null);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next2 : map.entrySet()) {
            if (next2.getKey() instanceof String) {
                linkedHashMap2.put(next2.getKey(), next2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C12714q0.m28413d(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Date) {
                value = C8273e.m16432e((Date) value, C10730a.LONG, (TimeZone) null, 2, (Object) null);
            } else if (value instanceof Map) {
                value = m16468a((Map) value);
            }
            linkedHashMap3.put(key, value);
        }
        return linkedHashMap3;
    }
}
