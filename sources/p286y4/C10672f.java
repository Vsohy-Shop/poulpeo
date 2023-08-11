package p286y4;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: y4.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C10672f {
    @NonNull
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m22672a() {
        return Collections.emptyList();
    }

    @NonNull
    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m22673b(@NonNull T t) {
        return Collections.singletonList(t);
    }

    @NonNull
    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m22674c(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m22672a();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return m22673b(tArr[0]);
    }

    @NonNull
    /* renamed from: d */
    public static <K, V> Map<K, V> m22675d(@NonNull K k, @NonNull V v, @NonNull K k2, @NonNull V v2, @NonNull K k3, @NonNull V v3, @NonNull K k4, @NonNull V v4, @NonNull K k5, @NonNull V v5, @NonNull K k6, @NonNull V v6) {
        Map f = m22677f(6, false);
        f.put(k, v);
        f.put(k2, v2);
        f.put(k3, v3);
        f.put(k4, v4);
        f.put(k5, v5);
        f.put(k6, v6);
        return Collections.unmodifiableMap(f);
    }

    @NonNull
    @Deprecated
    /* renamed from: e */
    public static <T> Set<T> m22676e(@NonNull T t, @NonNull T t2, @NonNull T t3) {
        Set g = m22678g(3, false);
        g.add(t);
        g.add(t2);
        g.add(t3);
        return Collections.unmodifiableSet(g);
    }

    /* renamed from: f */
    private static <K, V> Map<K, V> m22677f(int i, boolean z) {
        if (i <= 256) {
            return new ArrayMap(i);
        }
        return new HashMap(i, 1.0f);
    }

    /* renamed from: g */
    private static <T> Set<T> m22678g(int i, boolean z) {
        float f;
        int i2;
        if (true != z) {
            f = 1.0f;
        } else {
            f = 0.75f;
        }
        if (true != z) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        if (i <= i2) {
            return new ArraySet(i);
        }
        return new HashSet(i, f);
    }
}
