package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: CoreText.kt */
final class TextController$coreModifiers$1 extends C12777p implements Function1<LayoutCoordinates, C11921v> {
    final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$coreModifiers$1(TextController textController) {
        super(1);
        this.this$0 = textController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        SelectionRegistrar access$getSelectionRegistrar$p;
        C12775o.m28639i(layoutCoordinates, "it");
        this.this$0.getState().setLayoutCoordinates(layoutCoordinates);
        if (SelectionRegistrarKt.hasSelection(this.this$0.selectionRegistrar, this.this$0.getState().getSelectableId())) {
            long positionInWindow = LayoutCoordinatesKt.positionInWindow(layoutCoordinates);
            if (!Offset.m35419equalsimpl0(positionInWindow, this.this$0.getState().m33744getPreviousGlobalPositionF1C5BW0()) && (access$getSelectionRegistrar$p = this.this$0.selectionRegistrar) != null) {
                access$getSelectionRegistrar$p.notifyPositionChange(this.this$0.getState().getSelectableId());
            }
            this.this$0.getState().m33746setPreviousGlobalPositionk4lQ0M(positionInWindow);
        }
    }
}
