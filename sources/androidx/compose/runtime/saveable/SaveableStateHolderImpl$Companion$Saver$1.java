package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>> {
    public static final SaveableStateHolderImpl$Companion$Saver$1 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$1();

    SaveableStateHolderImpl$Companion$Saver$1() {
        super(2);
    }

    public final Map<Object, Map<String, List<Object>>> invoke(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(saveableStateHolderImpl, "it");
        return saveableStateHolderImpl.saveAll();
    }
}
