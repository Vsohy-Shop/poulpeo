package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: BasicText.kt */
final class BasicTextKt$BasicText$selectableId$2 extends C12777p implements C13074a<Long> {
    final /* synthetic */ SelectionRegistrar $selectionRegistrar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicTextKt$BasicText$selectableId$2(SelectionRegistrar selectionRegistrar) {
        super(0);
        this.$selectionRegistrar = selectionRegistrar;
    }

    public final Long invoke() {
        return Long.valueOf(this.$selectionRegistrar.nextSelectableId());
    }
}
