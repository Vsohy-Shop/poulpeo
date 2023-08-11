package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,55:1\n215#2,2:56\n*S KotlinDebug\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n*L\n36#1:56,2\n*E\n"})
/* compiled from: MapSaver.kt */
final class MapSaverKt$mapSaver$1 extends C12777p implements C13088o<SaverScope, T, List<? extends Object>> {
    final /* synthetic */ C13088o<SaverScope, T, Map<String, Object>> $save;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MapSaverKt$mapSaver$1(C13088o<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> oVar) {
        super(2);
        this.$save = oVar;
    }

    public final List<Object> invoke(SaverScope saverScope, T t) {
        C12775o.m28639i(saverScope, "$this$listSaver");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.$save.invoke(saverScope, t).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
