package p267w7;

import java.util.LinkedHashMap;

/* renamed from: w7.a */
/* compiled from: DaggerCollections */
public final class C10130a {
    /* renamed from: a */
    private static int m21317a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static <K, V> LinkedHashMap<K, V> m21318b(int i) {
        return new LinkedHashMap<>(m21317a(i));
    }
}
