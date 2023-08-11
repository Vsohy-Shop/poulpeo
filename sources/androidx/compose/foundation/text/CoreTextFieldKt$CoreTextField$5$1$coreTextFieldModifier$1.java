package androidx.compose.foundation.text;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1 extends C12777p implements C13074a<TextLayoutResultProxy> {
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1(TextFieldState textFieldState) {
        super(0);
        this.$state = textFieldState;
    }

    public final TextLayoutResultProxy invoke() {
        return this.$state.getLayoutResult();
    }
}
