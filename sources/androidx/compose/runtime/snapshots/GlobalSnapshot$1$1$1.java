package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,2191:1\n33#2,6:2192\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n*L\n1303#1:2192,6\n*E\n"})
/* compiled from: Snapshot.kt */
final class GlobalSnapshot$1$1$1 extends C12777p implements Function1<Object, C11921v> {
    final /* synthetic */ List<Function1<Object, C11921v>> $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GlobalSnapshot$1$1$1(List<Function1<Object, C11921v>> list) {
        super(1);
        this.$it = list;
    }

    public final void invoke(Object obj) {
        C12775o.m28639i(obj, "state");
        List<Function1<Object, C11921v>> list = this.$it;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).invoke(obj);
        }
    }
}
