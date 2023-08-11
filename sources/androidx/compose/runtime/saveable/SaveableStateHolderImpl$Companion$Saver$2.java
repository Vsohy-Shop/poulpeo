package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl$Companion$Saver$2 extends C12777p implements Function1<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl> {
    public static final SaveableStateHolderImpl$Companion$Saver$2 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$2();

    SaveableStateHolderImpl$Companion$Saver$2() {
        super(1);
    }

    public final SaveableStateHolderImpl invoke(Map<Object, Map<String, List<Object>>> map) {
        C12775o.m28639i(map, "it");
        return new SaveableStateHolderImpl(map);
    }
}
