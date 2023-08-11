package p126j0;

import android.os.Bundle;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;

/* renamed from: j0.d */
public final class C8272d {
    /* renamed from: a */
    public static final Bundle m16426a(Map<String, String> map) {
        C12775o.m28639i(map, "<this>");
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            bundle.putString((String) next.getKey(), (String) next.getValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static final Map<String, String> m16427b(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bundle == null) {
            return linkedHashMap;
        }
        Set<String> keySet = bundle.keySet();
        C12775o.m28638h(keySet, "this.keySet()");
        for (String next : keySet) {
            try {
                Object obj = bundle.get(next);
                if (obj != null && (obj instanceof String)) {
                    linkedHashMap.put(next, obj);
                }
            } catch (Exception unused) {
            }
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C12775o.m28638h(unmodifiableMap, "unmodifiableMap(mapForm)");
        return unmodifiableMap;
    }
}
