package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* compiled from: MapSaver.kt */
public final class MapSaverKt {
    public static final <T> Saver<T, Object> mapSaver(C13088o<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> oVar, Function1<? super Map<String, ? extends Object>, ? extends T> function1) {
        C12775o.m28639i(oVar, "save");
        C12775o.m28639i(function1, "restore");
        return ListSaverKt.listSaver(new MapSaverKt$mapSaver$1(oVar), new MapSaverKt$mapSaver$2(function1));
    }
}
