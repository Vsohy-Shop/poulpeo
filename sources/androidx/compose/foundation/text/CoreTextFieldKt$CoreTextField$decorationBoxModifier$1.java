package androidx.compose.foundation.text;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 extends C12777p implements Function1<LayoutCoordinates, C11921v> {
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(TextFieldState textFieldState) {
        super(1);
        this.$state = textFieldState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "it");
        TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
        if (layoutResult != null) {
            layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
        }
    }
}
