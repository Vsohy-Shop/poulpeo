package androidx.compose.p002ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.input.ImmHelper21 */
/* compiled from: InputMethodManager.kt */
final class ImmHelper21 implements ImmHelper {
    private final View view;

    public ImmHelper21(View view2) {
        C12775o.m28639i(view2, "view");
        this.view = view2;
    }

    /* access modifiers changed from: private */
    public static final void showSoftInput$lambda$0(InputMethodManager inputMethodManager, ImmHelper21 immHelper21) {
        C12775o.m28639i(inputMethodManager, "$imm");
        C12775o.m28639i(immHelper21, "this$0");
        inputMethodManager.showSoftInput(immHelper21.view, 0);
    }

    @DoNotInline
    public void hideSoftInput(InputMethodManager inputMethodManager) {
        C12775o.m28639i(inputMethodManager, "imm");
        inputMethodManager.hideSoftInputFromWindow(this.view.getWindowToken(), 0);
    }

    @DoNotInline
    public void showSoftInput(InputMethodManager inputMethodManager) {
        C12775o.m28639i(inputMethodManager, "imm");
        this.view.post(new C1227a(inputMethodManager, this));
    }
}
