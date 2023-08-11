package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.text.input.TransformedText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: TextFieldScroll.kt */
final class VerticalScrollLayoutModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ VerticalScrollLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VerticalScrollLayoutModifier$measure$1(MeasureScope measureScope, VerticalScrollLayoutModifier verticalScrollLayoutModifier, Placeable placeable, int i) {
        super(1);
        this.$this_measure = measureScope;
        this.this$0 = verticalScrollLayoutModifier;
        this.$placeable = placeable;
        this.$height = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        MeasureScope measureScope = this.$this_measure;
        int cursorOffset = this.this$0.getCursorOffset();
        TransformedText transformedText = this.this$0.getTransformedText();
        TextLayoutResultProxy invoke = this.this$0.getTextLayoutResultProvider().invoke();
        this.this$0.getScrollerPosition().update(Orientation.Vertical, TextFieldScrollKt.getCursorRectInScroller(measureScope, cursorOffset, transformedText, invoke != null ? invoke.getValue() : null, false, this.$placeable.getWidth()), this.$height, this.$placeable.getHeight());
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeable, 0, C13265c.m30134c(-this.this$0.getScrollerPosition().getOffset()), 0.0f, 4, (Object) null);
    }
}
