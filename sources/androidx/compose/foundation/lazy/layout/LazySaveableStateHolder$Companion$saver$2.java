package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazySaveableStateHolder.kt */
final class LazySaveableStateHolder$Companion$saver$2 extends C12777p implements Function1<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder> {
    final /* synthetic */ SaveableStateRegistry $parentRegistry;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazySaveableStateHolder$Companion$saver$2(SaveableStateRegistry saveableStateRegistry) {
        super(1);
        this.$parentRegistry = saveableStateRegistry;
    }

    public final LazySaveableStateHolder invoke(Map<String, ? extends List<? extends Object>> map) {
        C12775o.m28639i(map, "restored");
        return new LazySaveableStateHolder(this.$parentRegistry, map);
    }
}
