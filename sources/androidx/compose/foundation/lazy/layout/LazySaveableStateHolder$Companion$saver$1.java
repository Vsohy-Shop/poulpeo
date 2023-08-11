package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion$saver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
/* compiled from: LazySaveableStateHolder.kt */
final class LazySaveableStateHolder$Companion$saver$1 extends C12777p implements C13088o<SaverScope, LazySaveableStateHolder, Map<String, ? extends List<? extends Object>>> {
    public static final LazySaveableStateHolder$Companion$saver$1 INSTANCE = new LazySaveableStateHolder$Companion$saver$1();

    LazySaveableStateHolder$Companion$saver$1() {
        super(2);
    }

    public final Map<String, List<Object>> invoke(SaverScope saverScope, LazySaveableStateHolder lazySaveableStateHolder) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(lazySaveableStateHolder, "it");
        Map<String, List<Object>> performSave = lazySaveableStateHolder.performSave();
        if (performSave.isEmpty()) {
            return null;
        }
        return performSave;
    }
}
