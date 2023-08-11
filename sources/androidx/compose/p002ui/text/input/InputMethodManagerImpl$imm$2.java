package androidx.compose.p002ui.text.input;

import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2 */
/* compiled from: InputMethodManager.kt */
final class InputMethodManagerImpl$imm$2 extends C12777p implements C13074a<InputMethodManager> {
    final /* synthetic */ InputMethodManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InputMethodManagerImpl$imm$2(InputMethodManagerImpl inputMethodManagerImpl) {
        super(0);
        this.this$0 = inputMethodManagerImpl;
    }

    public final InputMethodManager invoke() {
        Object systemService = this.this$0.view.getContext().getSystemService("input_method");
        C12775o.m28637g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
