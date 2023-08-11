package com.google.common.collect;

import java.util.Map;
import p111h6.C7999f;

/* renamed from: com.google.common.collect.t */
/* compiled from: Maps */
public final class C6870t {

    /* renamed from: com.google.common.collect.t$a */
    /* compiled from: Maps */
    private enum C6871a implements C7999f<Map.Entry<?, ?>, Object> {
        KEY {
            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: a */
    static boolean m11853a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: b */
    static String m11854b(Map<?, ?> map) {
        StringBuilder a = C6810e.m11619a(map.size());
        a.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z) {
                a.append(", ");
            }
            a.append(next.getKey());
            a.append('=');
            a.append(next.getValue());
            z = false;
        }
        a.append('}');
        return a.toString();
    }

    /* renamed from: c */
    static <V> C7999f<Map.Entry<?, V>, V> m11855c() {
        return C6871a.VALUE;
    }
}
