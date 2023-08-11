package p024a6;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p037b6.C2900e;

/* renamed from: a6.a */
public class C2208a {

    /* renamed from: a */
    private static final Set<String> f987a = new HashSet(Arrays.asList(new String[]{"review"}));

    /* renamed from: b */
    private static final Set<String> f988b = new HashSet(Arrays.asList(new String[]{"native", "unity"}));

    /* renamed from: c */
    private static final Map<String, Map<String, Integer>> f989c = new HashMap();

    /* renamed from: d */
    private static final C2900e f990d = new C2900e("PlayCoreVersion");

    /* renamed from: a */
    public static Bundle m1807a() {
        Bundle bundle = new Bundle();
        Map<String, Integer> b = m1808b("review");
        bundle.putInt("playcore_version_code", b.get("java").intValue());
        if (b.containsKey("native")) {
            bundle.putInt("playcore_native_version", b.get("native").intValue());
        }
        if (b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", b.get("unity").intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static synchronized Map<String, Integer> m1808b(String str) {
        Map<String, Integer> map;
        synchronized (C2208a.class) {
            Map<String, Map<String, Integer>> map2 = f989c;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 10800);
                map2.put(str, hashMap);
            }
            map = map2.get(str);
        }
        return map;
    }
}
