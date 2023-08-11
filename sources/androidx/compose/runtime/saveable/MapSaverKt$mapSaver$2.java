package androidx.compose.runtime.saveable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: MapSaver.kt */
final class MapSaverKt$mapSaver$2 extends C12777p implements Function1<List<? extends Object>, T> {
    final /* synthetic */ Function1<Map<String, ? extends Object>, T> $restore;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MapSaverKt$mapSaver$2(Function1<? super Map<String, ? extends Object>, ? extends T> function1) {
        super(1);
        this.$restore = function1;
    }

    public final T invoke(List<? extends Object> list) {
        C12775o.m28639i(list, "list");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size(); i += 2) {
                Object obj = list.get(i);
                C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, list.get(i + 1));
            }
            return this.$restore.invoke(linkedHashMap);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
