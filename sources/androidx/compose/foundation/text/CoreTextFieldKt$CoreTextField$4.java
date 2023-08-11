package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.input.ImeOptions;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.TextInputService;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1087:1\n62#2,5:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n*L\n528#1:1088,5\n*E\n"})
/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$4 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$4(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions) {
        super(1);
        this.$textInputService = textInputService;
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$imeOptions = imeOptions;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        if (this.$textInputService != null && this.$state.getHasFocus()) {
            TextFieldState textFieldState = this.$state;
            textFieldState.setInputSession(TextFieldDelegate.Companion.restartInput$foundation_release(this.$textInputService, this.$value, textFieldState.getProcessor(), this.$imeOptions, this.$state.getOnValueChange(), this.$state.getOnImeActionPerformed()));
        }
        return new CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1();
    }
}
