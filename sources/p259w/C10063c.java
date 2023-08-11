package p259w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\ncoil/util/-Collections\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* renamed from: w.c */
/* compiled from: Collections.kt */
public final class C10063c {
    /* renamed from: a */
    public static final <T> List<T> m21126a(List<? extends T> list) {
        int size = list.size();
        if (size == 0) {
            return C12726w.m28524k();
        }
        if (size != 1) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        return Collections.singletonList(C12686e0.m28221Z(list));
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m21127b(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return C12716r0.m28416g();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) C12686e0.m28220Y(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
