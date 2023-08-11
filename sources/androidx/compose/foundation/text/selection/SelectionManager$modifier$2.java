package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SelectionManager.kt */
final class SelectionManager$modifier$2 extends C12777p implements Function1<LayoutCoordinates, C11921v> {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionManager$modifier$2(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "it");
        this.this$0.setContainerLayoutCoordinates(layoutCoordinates);
    }
}
