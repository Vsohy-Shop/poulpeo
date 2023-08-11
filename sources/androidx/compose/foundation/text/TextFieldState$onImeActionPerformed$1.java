package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.input.ImeAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: CoreTextField.kt */
final class TextFieldState$onImeActionPerformed$1 extends C12777p implements Function1<ImeAction, C11921v> {
    final /* synthetic */ TextFieldState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldState$onImeActionPerformed$1(TextFieldState textFieldState) {
        super(1);
        this.this$0 = textFieldState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m33735invokeKlQnJC8(((ImeAction) obj).m38125unboximpl());
        return C11921v.f18618a;
    }

    /* renamed from: invoke-KlQnJC8  reason: not valid java name */
    public final void m33735invokeKlQnJC8(int i) {
        this.this$0.keyboardActionRunner.m33661runActionKlQnJC8(i);
    }
}
