package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p002ui.focus.FocusState;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.text.input.ImeOptions;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.TextInputService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$focusModifier$1 extends C12777p implements Function1<FocusState, C11921v> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ C13995l0 $coroutineScope;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$focusModifier$1(TextFieldState textFieldState, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, C13995l0 l0Var, BringIntoViewRequester bringIntoViewRequester) {
        super(1);
        this.$state = textFieldState;
        this.$textInputService = textInputService;
        this.$value = textFieldValue;
        this.$imeOptions = imeOptions;
        this.$offsetMapping = offsetMapping;
        this.$manager = textFieldSelectionManager;
        this.$coroutineScope = l0Var;
        this.$bringIntoViewRequester = bringIntoViewRequester;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusState) obj);
        return C11921v.f18618a;
    }

    public final void invoke(FocusState focusState) {
        TextLayoutResultProxy layoutResult;
        C12775o.m28639i(focusState, "it");
        if (this.$state.getHasFocus() != focusState.isFocused()) {
            this.$state.setHasFocus(focusState.isFocused());
            TextInputService textInputService = this.$textInputService;
            if (textInputService != null) {
                CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService, this.$state, this.$value, this.$imeOptions, this.$offsetMapping);
                if (focusState.isFocused() && (layoutResult = this.$state.getLayoutResult()) != null) {
                    C14054y1 unused = C13985j.m32422d(this.$coroutineScope, (C12079g) null, (C14004n0) null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, layoutResult, this.$offsetMapping, (C12074d<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1>) null), 3, (Object) null);
                }
            }
            if (!focusState.isFocused()) {
                TextFieldSelectionManager.m33840deselect_kEHs6E$foundation_release$default(this.$manager, (Offset) null, 1, (Object) null);
            }
        }
    }
}
