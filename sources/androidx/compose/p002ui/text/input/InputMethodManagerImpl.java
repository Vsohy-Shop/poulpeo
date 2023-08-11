package androidx.compose.p002ui.text.input;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import p336ef.C11904j;

/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl */
/* compiled from: InputMethodManager.kt */
public final class InputMethodManagerImpl implements InputMethodManager {
    private final ImmHelper helper;
    private final Lazy imm$delegate = C11901h.m25689a(C11904j.NONE, new InputMethodManagerImpl$imm$2(this));
    /* access modifiers changed from: private */
    public final View view;

    public InputMethodManagerImpl(View view2) {
        ImmHelper immHelper;
        C12775o.m28639i(view2, "view");
        this.view = view2;
        if (Build.VERSION.SDK_INT < 30) {
            immHelper = new ImmHelper21(view2);
        } else {
            immHelper = new ImmHelper30(view2);
        }
        this.helper = immHelper;
    }

    private final InputMethodManager getImm() {
        return (InputMethodManager) this.imm$delegate.getValue();
    }

    public void hideSoftInput() {
        this.helper.hideSoftInput(getImm());
    }

    public void restartInput() {
        getImm().restartInput(this.view);
    }

    public void showSoftInput() {
        this.helper.showSoftInput(getImm());
    }

    public void updateExtractedText(int i, ExtractedText extractedText) {
        C12775o.m28639i(extractedText, "extractedText");
        getImm().updateExtractedText(this.view, i, extractedText);
    }

    public void updateSelection(int i, int i2, int i3, int i4) {
        getImm().updateSelection(this.view, i, i2, i3, i4);
    }
}
