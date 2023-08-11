package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: BasicText.kt */
final class BasicTextKt$selectionIdSaver$1 extends C12777p implements C13088o<SaverScope, Long, Long> {
    final /* synthetic */ SelectionRegistrar $selectionRegistrar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicTextKt$selectionIdSaver$1(SelectionRegistrar selectionRegistrar) {
        super(2);
        this.$selectionRegistrar = selectionRegistrar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((SaverScope) obj, ((Number) obj2).longValue());
    }

    public final Long invoke(SaverScope saverScope, long j) {
        C12775o.m28639i(saverScope, "$this$Saver");
        if (SelectionRegistrarKt.hasSelection(this.$selectionRegistrar, j)) {
            return Long.valueOf(j);
        }
        return null;
    }
}
