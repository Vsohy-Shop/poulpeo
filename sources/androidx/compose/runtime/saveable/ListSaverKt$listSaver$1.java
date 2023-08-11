package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: ListSaver.kt */
final class ListSaverKt$listSaver$1 extends C12777p implements C13088o<SaverScope, Original, Object> {
    final /* synthetic */ C13088o<SaverScope, Original, List<Saveable>> $save;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListSaverKt$listSaver$1(C13088o<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> oVar) {
        super(2);
        this.$save = oVar;
    }

    public final Object invoke(SaverScope saverScope, Original original) {
        C12775o.m28639i(saverScope, "$this$Saver");
        List invoke = this.$save.invoke(saverScope, original);
        int size = invoke.size();
        int i = 0;
        while (i < size) {
            Object obj = invoke.get(i);
            if (obj == null || saverScope.canBeSaved(obj)) {
                i++;
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        Collection collection = invoke;
        if (!collection.isEmpty()) {
            return new ArrayList(collection);
        }
        return null;
    }
}
